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
public class Vencedor extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vencedor);
	}

	public void fnMenu(View v) {
		Intent intent = new Intent(Vencedor.this, MainActivity.class);
		Bundle b = new Bundle();
		intent.putExtras(b);
		startActivity(intent);
		finish();
	}
}
