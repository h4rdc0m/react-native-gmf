package com.trace.react;

import android.app.Activity;
import android.widget.FrameLayout;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.BaseViewPropertyApplicator;
import com.facebook.react.uimanager.CatalystStylesDiffMap;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIProp;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.text.ReactTextShadowNode;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.android.libraries.mediaframework.exoplayerextensions.Video;
import com.google.android.libraries.mediaframework.layeredvideo.SimpleVideoPlayer;

import javax.annotation.Nullable;
import java.util.Map;


public class ReactGmfViewManager extends SimpleViewManager<FrameLayout> {
    public static final String REACT_CLASS = "RCTGmf";

    // Props
    public static final String PROP_SOURCE = "source";
    public static final String PROP_AUTOPLAY = "autoplay";

    private Activity mActivity = null;

    private ThemedReactContext mContext = null;
    private SimpleVideoPlayer mVideoPlayer = null;

    public ReactGmfViewManager(Activity activity) {
        mActivity = activity;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public FrameLayout createViewInstance(ThemedReactContext themedReactContext) {
        mContext = themedReactContext;

        WritableMap defaults = new WritableNativeMap();
        ReactGmfView view = new ReactGmfView(mContext, mActivity, new CatalystStylesDiffMap(defaults));
        view.showPlayer();
        return view;
    }

    @ReactProp(name=PROP_SOURCE)
    public void updateSource(ReactGmfView frame, String source) {
        frame.setSource(source);
    }

    @ReactProp(name=PROP_AUTOPLAY)
    public void updateAutoplay(ReactGmfView frame, Boolean autoplay) {
        frame.setAutoplay(autoplay);
    }

}
