package controller;

import palavras.palavrasprot1.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @author Hellen
 *
 */
public class Ganhou extends Activity {

	TextView tv_ganhou;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ganhou);
		tv_ganhou = (TextView) findViewById(R.id.tv_ganhou);
		Intent intent = getIntent();
		Bundle b = intent.getExtras();
		tv_ganhou.setText("Ganhou! " + b.getString("tempo"));
	}

	public void fnJogarNovamente(View v) {
		Intent intent = new Intent(Ganhou.this, Forca.class);
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
		finish();
	}

	public void fnMenuPrincipal(View v) {
		Intent intent = new Intent(Ganhou.this, MainActivity.class);
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
		finish();
	}
}
