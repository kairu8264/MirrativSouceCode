package com.dena.showroom.flvplayback.impl.util;

import android.os.Build;
import java.util.Set;

/* loaded from: classes3.dex */
public final class BlackList {
    public static final Set<String> EncoderOnTheFlyBitrateChange_HARDWARE = ImmutableCollections.set("mofd_v0", "mofd_v1");
    public static final Set<String> EncoderOnTheFlyBitrateChange_MODEL = ImmutableCollections.set("402HW", "403HW", "302HW");
    public static final Set<String> DecoderVideoResolutionChange_HARDWARE = ImmutableCollections.set("samsungexynos7420", "qcom", "flo");

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f26611a = ImmutableCollections.set("SC-02E");

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f26612b = ImmutableCollections.set("samsungexynos7420");

    /* renamed from: c  reason: collision with root package name */
    public static final Set<String> f26613c = ImmutableCollections.set("SC-03E");

    /* renamed from: d  reason: collision with root package name */
    public static Set<String> f26614d = ImmutableCollections.set("SBM101F");

    /* renamed from: e  reason: collision with root package name */
    public static Set<String> f26615e = ImmutableCollections.set("samsungexynos7420", "smdk4x12");

    public static boolean canChangeBitrateOnTheFly() {
        return (EncoderOnTheFlyBitrateChange_HARDWARE.contains(Build.HARDWARE) || EncoderOnTheFlyBitrateChange_MODEL.contains(Build.MODEL)) ? false : true;
    }

    public static boolean canChangeVideoResolution() {
        return !DecoderVideoResolutionChange_HARDWARE.contains(Build.HARDWARE);
    }

    public static boolean canRecycleSurfaceTexture() {
        return !f26613c.contains(Build.MODEL);
    }

    public static boolean decoderTellsSyncFrame() {
        return !f26615e.contains(Build.HARDWARE);
    }

    public static boolean mediaCodecResizesSurface() {
        return f26612b.contains(Build.HARDWARE);
    }

    public static boolean mediaPlayerHangsUpWithNullSurface() {
        return f26614d.contains(Build.HARDWARE);
    }

    public static boolean mustDrawAfterUpdateTexImage() {
        return f26611a.contains(Build.PRODUCT);
    }
}
