package aa101.x501.fouractivities;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

public class JabberwockyActivity extends Activity {

	WebView jabPoint;
	MediaPlayer jabPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Jabberwocky", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jabberwocky);
		jabPoint = (WebView) findViewById(R.id.jabWebView1);
		jabPoint.getSettings().setBuiltInZoomControls(true);
		jabPoint.loadUrl("file:///android_asset/jabberwocky.html");
	}

//	public void click2Beast(View v) {
//		/*
//		 * While this works by loading a new activity containing only a picture,
//		 * the instructions state to open a picture within the existing webview.
//		 */
//		Log.e("Jabberwocky", "clickWafflingBeast");
//		Intent grumpyIntent = new Intent(JabberwockyActivity.this, Grumpy.class);
//		JabberwockyActivity.this.startActivity(grumpyIntent);
//	}

	public void click2Beast(View v) {
		Log.e("Jabberwocky", "clickWafflingBeast");
		jabPoint = (WebView) findViewById(R.id.jabWebView1);
		jabPoint.getSettings().setAllowFileAccess(true);
		jabPoint.loadUrl("file:///android_asset/grumpycat_hdpi.jpg");
	}

	public void clickToWiki(View v) {
		Log.e("Jabberwocky", "clickWiki");
		Uri jabURL = Uri.parse("http://en.wikipedia.org/wiki/Jabberwocky");
		Intent jabWiki = new Intent(Intent.ACTION_VIEW, jabURL);
		startActivity(jabWiki);
	}

	@Override
	protected void onResume() {
		Log.e("Jabberwocky", "onResume");
		jabPlayer = MediaPlayer.create(this, R.raw.jm2halloween);
		// jabPlayer = MediaPlayer.create(this, R.assets.jm2halloween);
		jabPlayer.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("Jabberwocky", "onPause");
		jabPlayer.pause();
		super.onPause();
	}

	protected void onStop() {
		Log.e("Jabberwocky", "onStop");
		jabPlayer.stop();
		jabPlayer.release();
		super.onStop();
		finish();
	}
}
