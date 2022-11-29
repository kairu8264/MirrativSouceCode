package de;

import android.app.Activity;
import jo.p;

/* loaded from: classes2.dex */
public final class a {
    public static final float a(Activity activity, float f10) {
        p.h(activity, "<this>");
        return activity.getResources().getDisplayMetrics().density * f10;
    }

    public static final int b(Activity activity, int i10) {
        p.h(activity, "<this>");
        return (int) (activity.getResources().getDisplayMetrics().density * i10);
    }

    public static final int c(Activity activity, int i10) {
        p.h(activity, "<this>");
        return (int) (activity.getResources().getDisplayMetrics().scaledDensity * i10);
    }
}
