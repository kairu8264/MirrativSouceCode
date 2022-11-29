package k0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final float f38326a = m2.g.l(10);

    public static final float a(m2.d dVar, boolean z10, long j10) {
        jo.p.h(dVar, "$this$getRippleEndRadius");
        float k10 = b1.f.k(b1.g.a(b1.l.i(j10), b1.l.g(j10))) / 2.0f;
        return z10 ? k10 + dVar.I0(f38326a) : k10;
    }

    public static final float b(long j10) {
        return Math.max(b1.l.i(j10), b1.l.g(j10)) * 0.3f;
    }
}
