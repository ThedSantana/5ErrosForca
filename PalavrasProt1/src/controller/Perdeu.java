package controller;

import palavras.palavrasprot1.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author Hellen
 *
 */
public class Perdeu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perdeu);
	}

	public void fnTentarNovamente(View v) {
		Intent intent = new Intent(Perdeu.this, Forca.class);
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
		finish();
	}

	public void fnMenuPrincipal(View v) {
		Intent intent = new Intent(Perdeu.this, MainActivity.class);
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
		finish();
	}
}
