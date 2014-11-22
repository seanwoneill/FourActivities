package aa101.x501.fouractivities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class NasaActivity extends Activity {

	WebView nasaPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("NASA", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nasa);
		WebView nasaPoint = (WebView) findViewById(R.id.nasaWebView1);
		nasaPoint.getSettings().setBuiltInZoomControls(true);
		nasaPoint.loadUrl("file:///android_asset/uofi-at-nasa.html");
	}

	@Override
	protected void onResume() {
		Log.e("NASA", "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.e("NASA", "onPause");
		super.onPause();
	}
}
