package u;

/* loaded from: classes.dex */
public final class l {
    public static final k<Float, m> a(float f10, float f11, long j10, long j11, boolean z10) {
        return new k<>(e1.e(jo.i.f38148a), Float.valueOf(f10), q.a(f11), j10, j11, z10);
    }

    public static /* synthetic */ k b(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        long j12 = (i10 & 4) != 0 ? Long.MIN_VALUE : j10;
        long j13 = (i10 & 8) == 0 ? j11 : Long.MIN_VALUE;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return a(f10, f11, j12, j13, z10);
    }

    public static final k<Float, m> c(k<Float, m> kVar, float f10, float f11, long j10, long j11, boolean z10) {
        jo.p.h(kVar, "<this>");
        return new k<>(kVar.k(), Float.valueOf(f10), q.a(f11), j10, j11, z10);
    }

    public static final <T, V extends p> k<T, V> d(k<T, V> kVar, T t10, V v10, long j10, long j11, boolean z10) {
        jo.p.h(kVar, "<this>");
        return new k<>(kVar.k(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ k e(k kVar, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) kVar.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((m) kVar.q()).f();
        }
        float f12 = f11;
        if ((i10 & 4) != 0) {
            j10 = kVar.j();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = kVar.d();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = kVar.r();
        }
        return c(kVar, f10, f12, j12, j13, z10);
    }

    public static /* synthetic */ k f(k kVar, Object obj, p pVar, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = kVar.getValue();
        }
        if ((i10 & 2) != 0) {
            pVar = q.b(kVar.q());
        }
        p pVar2 = pVar;
        if ((i10 & 4) != 0) {
            j10 = kVar.j();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = kVar.d();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = kVar.r();
        }
        return d(kVar, obj, pVar2, j12, j13, z10);
    }

    public static final <T, V extends p> V g(c1<T, V> c1Var, T t10) {
        jo.p.h(c1Var, "<this>");
        return (V) q.d(c1Var.a().invoke(t10));
    }
}
