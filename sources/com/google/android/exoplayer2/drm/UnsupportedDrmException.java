package com.google.android.exoplayer2.drm;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class UnsupportedDrmException extends Exception {
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Reason {
    }

    public UnsupportedDrmException(int i10) {
        this.reason = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.reason = i10;
    }
}
