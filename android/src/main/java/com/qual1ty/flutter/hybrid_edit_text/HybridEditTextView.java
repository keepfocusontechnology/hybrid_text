package com.qual1ty.flutter.hybrid_edit_text;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.util.Map;
import java.util.function.BiConsumer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.platform.PlatformView;

class HybridEditTextView implements PlatformView {

    private static final String TAG = "HybridEditTextView";

    @NonNull
    private final FlutterEditText editText;

    public HybridEditTextView(Context context, int id, @Nullable Map<String, Object> creationParams) {

        assert creationParams != null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            creationParams.forEach(new BiConsumer<String, Object>() {
                @Override
                public void accept(String key, Object value) {
                    Log.d(TAG, "key = " + key + ",value = " + value);
                }
            });
        }
        Log.d(TAG, "id = " + id);
        editText = (FlutterEditText) LayoutInflater.from(context).inflate(R.layout.layout_native_view, null);
        editText.setOnMentionInputListener(new FlutterEditText.OnMentionInputListener() {
            @Override
            public void onTopicInput() {
                Log.d(TAG, "onTopicInput");
            }

            @Override
            public void onUserInput() {
                Log.d(TAG, "onUserInput");
            }
        });
    }

    @Override
    public View getView() {
        return editText;
    }

    @Override
    public void dispose() {

    }
}
