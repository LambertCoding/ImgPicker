package com.adam.imgpicker.compress.tiny.callback;

import android.graphics.Bitmap;

/**
 * Created by zhengxiaoyong on 2017/3/12.
 */
public interface BitmapCallback extends Callback {

    void callback(boolean isSuccess, Bitmap bitmap);

}
