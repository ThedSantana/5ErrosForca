package controller;

import db.SqliteHelper;
import palavras.palavrasprot1.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Hellen
 *
 */
public class MainActivity extends Activity {
	private SqliteHelper db;
	Button btn_Jogar;
	private boolean temPalavras;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		db = new SqliteHelper(this);
		btn_Jogar = (Button) findViewById(R.id.btn_jogar);
		temPalavras = db.temPalavras();
	}

	public void fnForca(View v) {
		Intent intent;
		if (temPalavras) {
			intent = new Intent(MainActivity.this, Forca.class);
		} else {
			intent = new Intent(MainActivity.this, Vencedor.class);
		}
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
		finish();
	}

	public void fnPontuacao(View v) {
		Intent intent = new Intent(MainActivity.this, Pontuacao.class);
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
	}

	public void fnAjuda(View v) {
		Intent intent = new Intent(MainActivity.this, Ajuda.class);
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
	}
}
