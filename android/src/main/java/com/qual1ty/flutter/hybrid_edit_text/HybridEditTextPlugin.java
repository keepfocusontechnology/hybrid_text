package com.qual1ty.flutter.hybrid_edit_text;

import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMessageCodec;

public class HybridEditTextPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {

    public static final String  VIEW_FLAG = "hybrid_edit_text";

    private MethodChannel channel;


    public HybridEditTextPlugin() {
    }

    @Override
    public void onAttachedToEngine(@NonNull FlutterPluginBinding binding) {
        channel = new MethodChannel(binding.getBinaryMessenger(), VIEW_FLAG);
        channel.setMethodCallHandler(this);
        binding
                .getPlatformViewRegistry()
                .registerViewFactory(VIEW_FLAG,
                        new HybridEditTextFactory(StandardMessageCodec.INSTANCE,binding.getBinaryMessenger()));
    }

    @Override
    public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
        channel.setMethodCallHandler(null);
    }

    @Override
    public void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result result) {

    }
}
