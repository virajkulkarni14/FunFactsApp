package com.virajkulkarni.cmpe277.funfacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fun_facts);

		// declare our view variables and assign the Views from the layout file
		final TextView factLabel = (TextView) findViewById(R.id.factTextView);
		Button showFactButton = (Button) findViewById(R.id.showFactButton);
		View.OnClickListener listener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// When button is clicked, update fact label with a new fact!
				String fact = "";

				Random randomGenerator = new Random();
				int randomNumber = randomGenerator.nextInt(3);

				//convert randomNumber to text fact
				if (randomNumber == 0) {
					fact = "Ants stretch when they wake up in the morning.";
				} else if (randomNumber == 1) {
					fact = "Ostriches can run faster than horses.";
				} else if (randomNumber == 2) {
					fact  = "Olympic gold medals are actually made mostly out of silver.";
				} else {
					fact = "Looks like there was an error!";
				}

				// Instead of hard-coding, update the label with dynamic fact

				factLabel.setText(fact);
			}
		};
		showFactButton.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
