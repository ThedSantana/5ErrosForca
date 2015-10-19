package controller;

import java.util.Date;
import model.Palavra;
import db.SqliteHelper;
import palavras.palavrasprot1.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Hellen
 *
 */
public class Forca extends Activity {
	EditText edit_letra, edit_letra_um, edit_letra_dois, edit_letra_tres,
			edit_letra_quatro, edit_letra_cinco;
	TextView tv_letras, tv_erros;
	Chronometer crmt;
	private boolean[] letras_bol = new boolean[] { false, false, false, false,
			false };
	private String letras_digitadas = "";
	private char letra_atual = ' ';
	private int erros = 0;
	private SqliteHelper db;
	private Palavra p;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forca);
		db = new SqliteHelper(this);

		crmt = (Chronometer) findViewById(R.id.crmt);
		edit_letra = (EditText) findViewById(R.id.txt_letra_entra);
		tv_letras = (TextView) findViewById(R.id.tv_letras_digitadas);
		edit_letra_um = (EditText) findViewById(R.id.txt_letra_um);
		edit_letra_dois = (EditText) findViewById(R.id.txt_letra_dois);
		edit_letra_tres = (EditText) findViewById(R.id.txt_letra_tres);
		edit_letra_quatro = (EditText) findViewById(R.id.txt_letra_quatro);
		edit_letra_cinco = (EditText) findViewById(R.id.txt_letra_cinco);
		tv_erros = (TextView) findViewById(R.id.tv_erros);
		p = db.pegarPalavra();
		edit_letra.setFilters(new InputFilter[] { new InputFilter.AllCaps(),
				new InputFilter.LengthFilter(1) });
		crmt.start();
	}

	@SuppressLint("NewApi")
	public void fnTentar(View v) {
		if (edit_letra.getText().toString().trim().equals("")
				|| edit_letra.getText().toString().isEmpty()) {
			new AlertDialog.Builder(Forca.this)
					.setIcon(android.R.drawable.ic_dialog_alert)
					.setTitle("Erro")
					.setMessage("Campo não pode ser vazio!")
					.setPositiveButton("Ok, entendi",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {
								}
							}).show();
		} else {
			letra_atual = edit_letra.getText().toString().charAt(0);
			if (letras_digitadas.contains(String.valueOf(letra_atual))) {
				Toast.makeText(getApplicationContext(),
						"Você já tentou " + String.valueOf(letra_atual),
						Toast.LENGTH_SHORT).show();
			} else {
				letras_digitadas += String.valueOf(letra_atual) + " ";
				tv_letras.setText(letras_digitadas);
				if (p.getPalavra().contains(String.valueOf(letra_atual))) {
					Toast.makeText(getApplicationContext(),
							"Tem " + String.valueOf(letra_atual),
							Toast.LENGTH_SHORT).show();
					tem();
				} else {
					Toast.makeText(getApplicationContext(),
							"Não tem " + String.valueOf(letra_atual),
							Toast.LENGTH_SHORT).show();
					naoTem();
				}
			}
			edit_letra.setText("");
			edit_letra.requestFocus();
			verifica();
			setMensagemErros();
		}
	}

	private void tem() {
		char[] letras = p.getPalavra().toCharArray();
		for (int i = 0; i < 5; i++) {
			if (letras[i] == letra_atual) {
				letras_bol[i] = true;
				switch (i) {
				case 0:
					edit_letra_um.setText(String.valueOf(letra_atual));
					break;
				case 1:
					edit_letra_dois.setText(String.valueOf(letra_atual));
					break;
				case 2:
					edit_letra_tres.setText(String.valueOf(letra_atual));
					break;
				case 3:
					edit_letra_quatro.setText(String.valueOf(letra_atual));
					break;
				case 4:
					edit_letra_cinco.setText(String.valueOf(letra_atual));
					break;
				}
			}
		}
		if (erros > 0) {
			erros--;
		}
	}

	private void naoTem() {
		erros++;
	}

	private void verifica() {
		if (erros > 5) {
			crmt.stop();
			db.atualizaContagem(false);
			Intent intent = new Intent(Forca.this, Perdeu.class);
			Bundle b = new Bundle();
			intent.putExtras(b);
			startActivity(intent);
			finish();
		} else {
			if (verificaPalavra()) {
				crmt.stop();
				String tempo = crmt.getText().toString();
				db.concluida(p.getId(), (new Date()).toString(), tempo, erros);
				db.atualizaContagem(true);
				Intent intent;
				if (isUltima()) {
					intent = new Intent(Forca.this, Vencedor.class);
				} else {
					intent = new Intent(Forca.this, Ganhou.class);
				}
				Bundle b = new Bundle();
				b.putString("tempo", tempo);
				intent.putExtras(b);
				startActivity(intent);
				finish();
			}
		}

	}

	private boolean verificaPalavra() {
		for (int i = 0; i < letras_bol.length; i++) {
			if (letras_bol[i] == false) {
				return false;
			}
		}
		return true;
	}

	private boolean isUltima() {
		if (p.getId() == 500) {
			return true;
		}
		return false;
	}

	private void setMensagemErros() {
		tv_erros.setText("Erros: " + erros);
	}

}
