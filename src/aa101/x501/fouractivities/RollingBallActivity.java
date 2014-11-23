package aa101.x501.fouractivities;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RollingBallActivity extends Activity {

	WebView ballPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("Roundball", "onPause");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rolling_ball);
		WebView ballPoint = (WebView) findViewById(R.id.ballWebView1);
		ballPoint.setWebViewClient(new WebViewClient());
		ballPoint.getSettings().setJavaScriptEnabled(true);
		ballPoint.getSettings().setDomStorageEnabled(true);
		ballPoint.getSettings().setAllowFileAccess(true);
		ballPoint.loadUrl("file:///android_asset/roundball/roundball.html");
	}
	
	@Override
	protected void onResume() {
		Log.e("Roundball", "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("Roundball", "onPause");
		super.onPause();
	}

	protected void onStop() {
		Log.e("Roundball", "onStop");
		super.onStop();
		finish();
	}
}
