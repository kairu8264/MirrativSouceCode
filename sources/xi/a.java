package xi;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f60297a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f60298b = new i4.b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f60299c = new i4.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f60300d = new i4.c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f60301e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f10 : f14 > f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
