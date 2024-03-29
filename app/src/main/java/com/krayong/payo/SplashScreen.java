package com.krayong.payo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		overridePendingTransition(0, R.anim.slide_out_left);
		
		Animation mAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		ImageView splashScreenAppLogo = findViewById(R.id.appLogo);
		splashScreenAppLogo.setAnimation(mAnimation);
		
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				startActivity(new Intent(SplashScreen.this, LoginActivity.class));
				overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
				finishAffinity();
			}
		}, 1500);
	}
}