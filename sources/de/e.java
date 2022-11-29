package de;

import androidx.fragment.app.Fragment;
import jo.p;

/* loaded from: classes2.dex */
public final class e {
    public static final float a(Fragment fragment, float f10) {
        p.h(fragment, "<this>");
        return fragment.O0().getDisplayMetrics().density * f10;
    }

    public static final int b(Fragment fragment, int i10) {
        p.h(fragment, "<this>");
        return (int) (fragment.O0().getDisplayMetrics().density * i10);
    }

    public static final int c(Fragment fragment, int i10) {
        p.h(fragment, "<this>");
        return (int) (fragment.O0().getDisplayMetrics().scaledDensity * i10);
    }
}
