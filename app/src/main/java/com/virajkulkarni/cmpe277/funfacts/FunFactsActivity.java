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

	private FactBook mFactBook = new FactBook(); // m = Member var

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
				String fact = mFactBook.getFact();
				// Instead of hard-coding, update the label with dynamic fact

				factLabel.setText(fact);
			}
		};
		showFactButton.setOnClickListener(listener);
	}
}
