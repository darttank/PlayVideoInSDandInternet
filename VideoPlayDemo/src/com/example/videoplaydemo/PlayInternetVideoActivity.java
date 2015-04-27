package com.example.videoplaydemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

import java.io.File;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.MediaController;

import android.widget.Toast;

import android.widget.VideoView;

import java.io.File;

import android.app.Activity;

import android.media.MediaPlayer;

import android.media.MediaPlayer.OnCompletionListener;

import android.media.MediaPlayer.OnErrorListener;

import android.os.Bundle;

import android.util.Log;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.SeekBar;

import android.widget.Toast;

import android.widget.VideoView;

import android.widget.SeekBar.OnSeekBarChangeListener;

public class PlayInternetVideoActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);

		setContentView(R.layout.acticity_play_internet_video);

		   Uri uri = Uri.parse("http://120.24.84.74:8086/data/image/gold/video/yaoqianshu.mp4");  
 	       VideoView videoView = (VideoView)this.findViewById(R.id.vv_videoview);  
 	       videoView.setMediaController(new MediaController(this));  
 	       videoView.setVideoURI(uri);  
 	       videoView.start();  
           videoView.requestFocus();  

	}

	
}