package aa101.x501.fouractivities;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RollingBallActivity extends Activity {

	WebView ballPoint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rolling_ball);
		WebView ballPoint = (WebView) findViewById(R.id.ballWebView1);
		ballPoint.setWebViewClient(new WebViewClient());
		ballPoint.getSettings().setBuiltInZoomControls(true);
		ballPoint.getSettings().setJavaScriptEnabled(true);
		ballPoint.getSettings().setDomStorageEnabled(true);
		ballPoint.loadUrl("javascript:///android_asset/roundball.html");
		// ballPoint.loadUrl("javascript:///android_asset/roundball");
	}
}
