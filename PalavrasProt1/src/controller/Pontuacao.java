package controller;

import java.util.List;

import db.SqliteHelper;
import palavras.palavrasprot1.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Hellen
 *
 */
public class Pontuacao extends Activity {
	private SqliteHelper db;
	TextView tv_vitorias, tv_derrotas, tv_melhor_um, tv_melhor_dois,
			tv_melhor_tres, tv_melhor_quatro;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pontuacao);
		db = new SqliteHelper(this);
		tv_vitorias = (TextView) findViewById(R.id.tv_nvitorias);
		tv_derrotas = (TextView) findViewById(R.id.tv_nderrotas);
		tv_melhor_um = (TextView) findViewById(R.id.tv_melhor_um);
		tv_melhor_dois = (TextView) findViewById(R.id.tv_melhor_dois);
		tv_melhor_tres = (TextView) findViewById(R.id.tv_melhor_tres);
		tv_melhor_quatro = (TextView) findViewById(R.id.tv_melhor_quatro);
		int[] contagem = db.getContagem();
		tv_vitorias.setText(String.valueOf(contagem[0]));
		tv_derrotas.setText(String.valueOf(contagem[1]));
		List<String> tempos = db.pegarTempos();
		if (tempos.size() == 4) {
			tv_melhor_um.setText(tempos.get(0));
			tv_melhor_dois.setText(tempos.get(1));
			tv_melhor_tres.setText(tempos.get(2));
			tv_melhor_quatro.setText(tempos.get(3));
		} else if (tempos.size() == 3) {
			tv_melhor_um.setText(tempos.get(0));
			tv_melhor_dois.setText(tempos.get(1));
			tv_melhor_tres.setText(tempos.get(2));
			tv_melhor_quatro.setText("");
		} else if (tempos.size() == 2) {
			tv_melhor_um.setText(tempos.get(0));
			tv_melhor_dois.setText(tempos.get(1));
			tv_melhor_tres.setText("");
			tv_melhor_quatro.setText("");
		} else if (tempos.size() == 1) {
			tv_melhor_um.setText(tempos.get(0));
			tv_melhor_dois.setText("");
			tv_melhor_tres.setText("");
			tv_melhor_quatro.setText("");
		} else {
			tv_melhor_um.setText("Não há tempos registrados!");
			tv_melhor_dois.setText("");
			tv_melhor_tres.setText("");
			tv_melhor_quatro.setText("");
		}
	}
}
