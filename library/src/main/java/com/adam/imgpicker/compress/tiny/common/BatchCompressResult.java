package com.adam.imgpicker.compress.tiny.common;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by zhengxiaoyong on 2017/3/31.
 */
public final class BatchCompressResult implements Serializable {

    public boolean success;

    public CompressResult[] results;

    @Override
    public String toString() {
        return "BatchCompressResult{" +
                "results=" + Arrays.toString(results) +
                ", success=" + success +
                '}';
    }
}
