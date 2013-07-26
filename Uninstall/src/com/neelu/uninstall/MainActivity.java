package com.neelu.uninstall;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

//		for your reference
//		http://stackoverflow.com/questions/11229219/android-get-application-name-not-package-name
//		http://android.amberfog.com/?p=98
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		PackageManager lPackageManager = getApplicationContext().getPackageManager();
	    ApplicationInfo lApplicationInfo = null;
	    try {
	        lApplicationInfo = lPackageManager.getApplicationInfo("com.htc.videohub.ui",0);//context.getApplicationInfo().packageName, 0);
	    } catch (final NameNotFoundException e) {
	    }
	    final String title = (String) (lApplicationInfo != null ? lPackageManager.getApplicationLabel(lApplicationInfo) : "Unknown");

		Toast.makeText(getApplicationContext(), "your appname is: "
		+title, Toast.LENGTH_LONG).show();
		//+getApplicationName(getApplicationContext()), Toast.LENGTH_LONG).show();
		
		//To uninstall you can use this.
//		Uri packageURI = Uri.parse("package:com.htc.videohub.ui");
//		Intent uninstallIntent = new Intent(Intent.ACTION_DELETE, packageURI);
//		startActivity(uninstallIntent);
		
	}
	
	public static String getApplicationName(Context context) {
	    return (String) context.getApplicationInfo().loadLabel(context.getPackageManager());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
