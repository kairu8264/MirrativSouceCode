package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class ExoTimeoutException extends Exception {
    public static final int TIMEOUT_OPERATION_DETACH_SURFACE = 3;
    public static final int TIMEOUT_OPERATION_RELEASE = 1;
    public static final int TIMEOUT_OPERATION_SET_FOREGROUND_MODE = 2;
    public static final int TIMEOUT_OPERATION_UNDEFINED = 0;
    public final int timeoutOperation;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TimeoutOperation {
    }

    public ExoTimeoutException(int i10) {
        super(getErrorMessage(i10));
        this.timeoutOperation = i10;
    }

    private static String getErrorMessage(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
