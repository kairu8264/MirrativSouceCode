package u;

import l0.c2;
import l0.z1;
import u.p;

/* loaded from: classes.dex */
public final class k<T, V extends p> implements c2<T> {
    public long A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final c1<T, V> f54041w;

    /* renamed from: x  reason: collision with root package name */
    public final l0.s0 f54042x;

    /* renamed from: y  reason: collision with root package name */
    public V f54043y;

    /* renamed from: z  reason: collision with root package name */
    public long f54044z;

    public k(c1<T, V> c1Var, T t10, V v10, long j10, long j11, boolean z10) {
        l0.s0 e10;
        jo.p.h(c1Var, "typeConverter");
        this.f54041w = c1Var;
        e10 = z1.e(t10, null, 2, null);
        this.f54042x = e10;
        V v11 = v10 != null ? (V) q.b(v10) : null;
        this.f54043y = v11 == null ? (V) l.g(c1Var, t10) : v11;
        this.f54044z = j10;
        this.A = j11;
        this.B = z10;
    }

    public final long d() {
        return this.A;
    }

    @Override // l0.c2
    public T getValue() {
        return this.f54042x.getValue();
    }

    public final long j() {
        return this.f54044z;
    }

    public final c1<T, V> k() {
        return this.f54041w;
    }

    public final T p() {
        return this.f54041w.b().invoke(this.f54043y);
    }

    public final V q() {
        return this.f54043y;
    }

    public final boolean r() {
        return this.B;
    }

    public final void s(long j10) {
        this.A = j10;
    }

    public final void t(long j10) {
        this.f54044z = j10;
    }

    public final void u(boolean z10) {
        this.B = z10;
    }

    public void v(T t10) {
        this.f54042x.setValue(t10);
    }

    public final void w(V v10) {
        jo.p.h(v10, "<set-?>");
        this.f54043y = v10;
    }

    public /* synthetic */ k(c1 c1Var, Object obj, p pVar, long j10, long j11, boolean z10, int i10, jo.h hVar) {
        this(c1Var, obj, (i10 & 4) != 0 ? null : pVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
