package net.shiftstudios.mediascan;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
	
	public Button scan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

				sendBroadcast(
		        	    new Intent(Intent.ACTION_MEDIA_MOUNTED, 
		        	        Uri.parse("file://" + Environment.getExternalStorageDirectory()))
		        );
				
				Toast.makeText(getBaseContext(), "Sent scan request!", Toast.LENGTH_SHORT).show();
				
				
		finish();
	}

}
