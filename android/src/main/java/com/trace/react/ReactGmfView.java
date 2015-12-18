package com.trace.react;

import android.media.MediaPlayer;
import android.os.Handler;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class ReactGmfView extends MediaPlayer {
  private ThemedReactContext mThemedReactContext;
  private RCTEventEmitter mEventEmitter;

  public ReactGmfView(ThemedReactContext themedReactContext) {
    super(themedReactContext);

    mThemedReactContext = themedReactContext;
    mEventEmitter = themedReactContext.getJSModule(RCTEventEmitter.class);
  }
}
