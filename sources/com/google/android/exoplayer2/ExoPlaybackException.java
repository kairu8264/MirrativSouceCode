package com.google.android.exoplayer2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class ExoPlaybackException extends Exception {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    private final Throwable cause;
    public final boolean isRecoverable;
    public final MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final long timestampMs;
    public final int type;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Type {
    }

    private ExoPlaybackException(int i10, Throwable th2) {
        this(i10, th2, null, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, str);
    }

    public static ExoPlaybackException createForRenderer(Exception exc) {
        return new ExoPlaybackException(1, exc, null, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    private static String deriveMessage(int i10, String str, String str2, int i11, Format format, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + format + ", format_supported=" + C.getFormatSupportString(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public ExoPlaybackException copyWithMediaPeriodId(MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException(getMessage(), this.cause, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    public Exception getRendererException() {
        Assertions.checkState(this.type == 1);
        return (Exception) Assertions.checkNotNull(this.cause);
    }

    public IOException getSourceException() {
        Assertions.checkState(this.type == 0);
        return (IOException) Assertions.checkNotNull(this.cause);
    }

    public RuntimeException getUnexpectedException() {
        Assertions.checkState(this.type == 2);
        return (RuntimeException) Assertions.checkNotNull(this.cause);
    }

    private ExoPlaybackException(int i10, String str) {
        this(i10, null, str, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th2, String str, int i10, Format format, int i11) {
        return createForRenderer(th2, str, i10, format, i11, false);
    }

    private ExoPlaybackException(int i10, Throwable th2, String str, String str2, int i11, Format format, int i12, boolean z10) {
        this(deriveMessage(i10, str, str2, i11, format, i12), th2, i10, str2, i11, format, i12, null, SystemClock.elapsedRealtime(), z10);
    }

    public static ExoPlaybackException createForRenderer(Throwable th2, String str, int i10, Format format, int i11, boolean z10) {
        if (format == null) {
            i11 = 4;
        }
        return new ExoPlaybackException(1, th2, null, str, i10, format, i11, z10);
    }

    private ExoPlaybackException(String str, Throwable th2, int i10, String str2, int i11, Format format, int i12, MediaPeriodId mediaPeriodId, long j10, boolean z10) {
        super(str, th2);
        this.type = i10;
        this.cause = th2;
        this.rendererName = str2;
        this.rendererIndex = i11;
        this.rendererFormat = format;
        this.rendererFormatSupport = i12;
        this.mediaPeriodId = mediaPeriodId;
        this.timestampMs = j10;
        this.isRecoverable = z10;
    }
}
