package com.adam.imgpicker.compress.tiny.common;

/**
 * Created by zhengxiaoyong on 2017/3/10.
 */
public final class TinyException {

    public static final class UnsupportedOperationException extends RuntimeException {
        public UnsupportedOperationException(String message) {
            super(message);
        }
    }

    public static final class IllegalArgumentException extends RuntimeException {
        public IllegalArgumentException(String message) {
            super(message);
        }
    }

    public static final class UnsupportedParamException extends RuntimeException {
        public UnsupportedParamException(String message) {
            super(message);
        }
    }

    public static final class NetworkIOException extends RuntimeException {
        public NetworkIOException(String message) {
            super(message);
        }
    }

    public static final class EOFException extends RuntimeException {
        public EOFException(String message) {
            super(message);
        }
    }
}
