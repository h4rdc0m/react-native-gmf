package com.trace.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;


import javax.annotation.Nullable;
import java.util.Map;

public class ReactGmfViewManager extends SimpleViewManager<ReactGmfView> {

    public static final String REACT_CLASS = "RCTGmf";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected ReactGmfView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactGmfView(themedReactContext);
    }
}
