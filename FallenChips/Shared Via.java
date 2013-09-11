//add this to your activity in your manifest

		    <action android:name="android.intent.action.SEND" />
			    <category android:name="android.intent.category.DEFAULT" />
			    <data android:mimeType="image/*" />
			<!--	for multiple data mime types -->
			<!--   <data android:mimeType="*/*" />  -->
			</intent-filter>

//use this in which activity you want to respond to "shared via"

   	Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String action = intent.getAction();

        // if this is from the share menu
        if (Intent.ACTION_SEND.equals(action)) {   
            if (extras.containsKey(Intent.EXTRA_STREAM)) {
            }
        }