package com.neelu.fadeinanim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class AnotherFadeInAnimationActivity extends Activity {
    /** Called when the withouxml button is clicked. */
	
	private int durationInMillis = 1000;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anotherfadein);
        
//        android.widget.TextView refreshText = (android.widget.TextView) findViewById(R.id.refresh_text);
        Button buttonFadeIn = (Button)findViewById(R.id.refresh);
        final ImageView image = (ImageView)findViewById(R.id.image);
        
        fadeInAnimate(image, durationInMillis);
        
        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 fadeInAnimate(image, durationInMillis);
				 Toast.makeText(getApplicationContext(), "We are not using any anim xml for this", Toast.LENGTH_LONG).show();
			}
		});
    }
    
	private void fadeInAnimate(android.widget.ImageView imgView, int durationInMillis){
    	AlphaAnimation anim = new AlphaAnimation(0,1);
    	anim.setDuration(durationInMillis);
    	anim.setInterpolator(new DecelerateInterpolator());
    	imgView.startAnimation(anim);
    }
}