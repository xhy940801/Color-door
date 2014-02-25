package com.tinystudio.colordoor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener
{

	private Button buttonPlay;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonPlay = (Button) findViewById(R.id.button1);
		buttonPlay.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v)
	{
		switch(v.getId())
		{
		case R.id.button1:
			Intent intent = new Intent(this, GameActivity.class);
			startActivity(intent);
			finish();
		}
	}

}
