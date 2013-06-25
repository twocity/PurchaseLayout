package com.twocity.purchaselayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class PurchaseActivity extends Activity implements
		NotifyingScrollView.OnScrollChangedListener {

	private TextView mContent;
	private View mBuyView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_purchase);
		mContent = (TextView) findViewById(R.id.text_content);

		mContent.setText(createContent());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.purchase, menu);
		return true;
	}

	@Override
	public void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt) {

	}

	private String createContent() {
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < 10; ++i) {
			sb.append(content);
			sb.append("\n");
		}
		sb.append(content);
		return sb.toString();
	}

	private final String content = "As ScrollView can have only one child, "
			+ "the two child views highlighted above are placed within one more container. "
			+ "Let’s call it PurchaseLayout.";
}
