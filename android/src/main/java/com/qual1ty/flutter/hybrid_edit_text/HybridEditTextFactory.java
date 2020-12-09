package com.qual1ty.flutter.hybrid_edit_text;


import android.content.Context;

import java.util.Map;

import androidx.annotation.NonNull;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class HybridEditTextFactory extends PlatformViewFactory {

    @NonNull
    private final BinaryMessenger messenger;

    public HybridEditTextFactory(MessageCodec<Object> createArgsCodec, @NonNull BinaryMessenger messenger) {
        super(createArgsCodec);
        this.messenger = messenger;
    }

    @NonNull
    @Override
    public PlatformView create(Context context, int viewId, Object args) {
        final Map<String, Object> creationParams = (Map<String, Object>) args;
        return new HybridEditTextView(context,viewId,creationParams);
    }
}
