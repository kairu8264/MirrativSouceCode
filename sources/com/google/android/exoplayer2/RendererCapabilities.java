package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public interface RendererCapabilities {
    public static final int ADAPTIVE_NOT_SEAMLESS = 8;
    public static final int ADAPTIVE_NOT_SUPPORTED = 0;
    public static final int ADAPTIVE_SEAMLESS = 16;
    public static final int ADAPTIVE_SUPPORT_MASK = 24;
    @Deprecated
    public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;
    @Deprecated
    public static final int FORMAT_HANDLED = 4;
    public static final int FORMAT_SUPPORT_MASK = 7;
    @Deprecated
    public static final int FORMAT_UNSUPPORTED_DRM = 2;
    @Deprecated
    public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;
    @Deprecated
    public static final int FORMAT_UNSUPPORTED_TYPE = 0;
    public static final int TUNNELING_NOT_SUPPORTED = 0;
    public static final int TUNNELING_SUPPORTED = 32;
    public static final int TUNNELING_SUPPORT_MASK = 32;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AdaptiveSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Capabilities {
    }

    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FormatSupport {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TunnelingSupport {
    }

    static int create(int i10) {
        return create(i10, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int create(int i10, int i11, int i12) {
        return i10 | i11 | i12;
    }

    @SuppressLint({"WrongConstant"})
    static int getAdaptiveSupport(int i10) {
        return i10 & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int getFormatSupport(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int getTunnelingSupport(int i10) {
        return i10 & 32;
    }

    String getName();

    int getTrackType();

    int supportsFormat(Format format) throws ExoPlaybackException;

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;
}
