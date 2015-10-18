package com.virajkulkarni.cmpe277.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

	public static final String TAG = FunFactsActivity.class.getSimpleName();

	private FactBook mFactBook = new FactBook(); // m = Member var
	private ColorWheel mColorWheel = new ColorWheel();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fun_facts);

		// declare our view variables and assign the Views from the layout file
		final TextView factLabel = (TextView) findViewById(R.id.factTextView);

		final Button showFactButton = (Button) findViewById(R.id.showFactButton);

		final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

		View.OnClickListener listener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String fact = mFactBook.getFact();
				// Instead of hard-coding, update the label with dynamic fact

				factLabel.setText(fact);

				int color = mColorWheel.getColor();
				relativeLayout.setBackgroundColor(color);
				showFactButton.setTextColor(color);
			}
		};
		showFactButton.setOnClickListener(listener);

		Toast.makeText(this, "Welcome to Fun Facts!", Toast.LENGTH_LONG).show();

		Log.d(TAG, "======== in onCreate() method! ========");
	}
}
