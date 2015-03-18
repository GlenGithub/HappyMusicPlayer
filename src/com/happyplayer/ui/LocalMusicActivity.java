package com.happyplayer.ui;

import com.happyplayer.util.ActivityManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class LocalMusicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_localmusic);
		ActivityManager.getInstance().addActivity(this);
	}

	public void back(View v) {
		finish();
	}
}
