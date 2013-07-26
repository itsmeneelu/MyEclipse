package com.example.sampletrailer;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.MediaController;
import android.widget.VideoView;

public class MyVideoView extends Activity
{
  VideoView videoView;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.videoview);
    this.videoView = ((VideoView)findViewById(R.id.myvideoview));
    MediaController localMediaController = new MediaController(this);
    localMediaController.setAnchorView(this.videoView);
    this.videoView.setMediaController(localMediaController);
   
    // this videoview plays the content that streams from the given url
    //this.videoView.setVideoURI(Uri.parse("http://wpc.39B1.edgecastcdn.net/8039B1/15.sdnstor/28/42/590A-06AC-11E2-B469-C2BCAB1800E2/LG_THEEXPENDABLES2_TRAILER_HD_2CH_EN_L9550581_16X9_240_2398_FINAL.mp4?sdsdece_outlet=5.sdsdece.sdgtl.net%7Chtvidstus"));
    this.videoView.setVideoURI(Uri.parse("http://www.videodetective.net/video.mp4?cmd=6&fmt=4&customerid=211367&videokbrate=212&publishedid=621970&e=1367361314&h=ddf27dd2dc85d0e97de934570aff638c"));
    this.videoView.start();
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(R.menu.activity_main, paramMenu);
    return true;
  }
}