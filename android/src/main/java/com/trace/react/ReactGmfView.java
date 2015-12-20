package com.trace.react;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.app.Activity;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.CatalystStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.libraries.mediaframework.exoplayerextensions.Video;
import com.google.android.libraries.mediaframework.layeredvideo.SimpleVideoPlayer;

public class ReactGmfView extends FrameLayout {
  private Activity mActivity;
  private String mSource;
  private Boolean mAutoplay = false;
  private SimpleVideoPlayer mPlayer;
  private Video mVideo;
  public ReactGmfView(Context ctx, Activity activity, CatalystStylesDiffMap props) {
    super(ctx, null);
    mActivity = activity;
  }

  public void setSource(String url) {
    mSource = url;
    mVideo = new Video(url, Video.VideoType.MP4);
  }

  public String getSource() {
    return mSource;
  }

  public void setAutoplay(Boolean autoplay) {
    mAutoplay = autoplay;
  }

  public void showPlayer() {

    mPlayer = new SimpleVideoPlayer(mActivity, this, mVideo, "Player", mAutoplay);
    mPlayer.hideTopChrome();
    mPlayer.show();
  }
}
