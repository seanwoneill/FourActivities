package aa101.x501.fouractivities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class WaroftheWorldsActivity extends Activity {

	WebView warPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("War of the Worlds", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_war_of_the_worlds);
		WebView warPoint = (WebView) findViewById(R.id.warWebView1);
		warPoint.getSettings().setBuiltInZoomControls(true);
		warPoint.loadUrl("file:///android_asset/waroftheworlds.html");
	}

	@Override
	protected void onResume() {
		Log.e("War of the Worlds", "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("War of the Worlds", "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.e("War of the Worlds", "onStop");
		super.onStop();
		finish();
	}
}
