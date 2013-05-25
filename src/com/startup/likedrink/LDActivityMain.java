package com.startup.likedrink;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LDActivityMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ldactivity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ldactivity_main, menu);
		return true;
	}

}
