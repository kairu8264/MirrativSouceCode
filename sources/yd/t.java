package yd;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class t extends androidx.recyclerview.widget.r {
    public t(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.r
    public int s(int i10, int i11, int i12, int i13, int i14) {
        return (i12 + ((i13 - i12) / 2)) - (i10 + ((i11 - i10) / 2));
    }

    @Override // androidx.recyclerview.widget.r
    public float v(DisplayMetrics displayMetrics) {
        jo.p.h(displayMetrics, "displayMetrics");
        return 100.0f / displayMetrics.densityDpi;
    }
}
