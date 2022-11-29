package h0;

import java.util.Set;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public static final j1 f33924a = new j1();

    /* renamed from: b  reason: collision with root package name */
    public static final u.u0<Float> f33925b = new u.u0<>(0.0f, 0.0f, null, 7, null);

    /* renamed from: c  reason: collision with root package name */
    public static final float f33926c = m2.g.l(125);

    public static /* synthetic */ u0 d(j1 j1Var, Set set, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 10.0f;
        }
        return j1Var.c(set, f10, f11);
    }

    public final u.u0<Float> a() {
        return f33925b;
    }

    public final float b() {
        return f33926c;
    }

    public final u0 c(Set<Float> set, float f10, float f11) {
        jo.p.h(set, "anchors");
        if (set.size() <= 1) {
            return null;
        }
        Float l02 = xn.a0.l0(set);
        jo.p.e(l02);
        float floatValue = l02.floatValue();
        Float n02 = xn.a0.n0(set);
        jo.p.e(n02);
        return new u0(floatValue - n02.floatValue(), f10, f11);
    }
}
