package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
final class SubtitleViewUtils {
    private SubtitleViewUtils() {
    }

    public static float resolveTextSize(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else if (i10 != 1) {
            if (i10 != 2) {
                return -3.4028235E38f;
            }
            return f10;
        } else {
            f11 = i11;
        }
        return f10 * f11;
    }
}
