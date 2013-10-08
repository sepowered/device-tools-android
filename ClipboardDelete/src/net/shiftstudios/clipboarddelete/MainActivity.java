package net.shiftstudios.clipboarddelete;

import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.text.ClipboardManager;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ClipboardManager cm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
		cm.setText(null);
		Toast.makeText(this, "Clipboard cleaned.", Toast.LENGTH_SHORT).show();
		finish();
	}
}
