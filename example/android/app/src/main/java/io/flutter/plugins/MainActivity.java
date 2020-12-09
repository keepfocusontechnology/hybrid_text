package io.flutter.plugins;

import com.qual1ty.flutter.hybrid_edit_text.HybridEditTextFactory;
import com.qual1ty.flutter.hybrid_edit_text.HybridEditTextPlugin;

import java.nio.ByteBuffer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;

class MainActivity extends FlutterActivity {

//    @Override
//    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
//        flutterEngine.getPlatformViewsController().getRegistry().registerViewFactory(
//                HybridEditTextPlugin.VIEW_FLAG,
//                new HybridEditTextFactory(StandardMessageCodec.INSTANCE, new BinaryMessenger() {
//                    @Override
//                    public void send(@NonNull String channel, @Nullable ByteBuffer message) {
//
//                    }
//
//                    @Override
//                    public void send(@NonNull String channel, @Nullable ByteBuffer message, @Nullable BinaryReply callback) {
//
//                    }
//
//                    @Override
//                    public void setMessageHandler(@NonNull String channel, @Nullable BinaryMessageHandler handler) {
//
//                    }
//                }));
//
//    }
}
