package com.neelu.fadeinanim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AndroidAnimTranslateActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button buttonFadeIn = (Button)findViewById(R.id.fadein);
        Button buttonFadeOut = (Button)findViewById(R.id.fadeout);
        Button withoutXml 	= (Button) findViewById(R.id.withoutxml);
        final ImageView image = (ImageView)findViewById(R.id.image);
        
        final Animation animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);
        image.startAnimation(animationFadeIn);
        buttonFadeIn.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				image.startAnimation(animationFadeIn);
			}});
        
        final Animation animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        buttonFadeOut.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				image.startAnimation(animationFadeOut);
			}});
        
        withoutXml.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				android.content.Intent in = new android.content.Intent(AndroidAnimTranslateActivity.this, AnotherFadeInAnimationActivity.class);
				startActivity(in);
				
				
			}
		});
    }
}