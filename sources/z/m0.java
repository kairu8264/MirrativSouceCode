package z;

import l0.s0;
import l0.z1;
import u.e1;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public int f62305a;

    /* renamed from: b  reason: collision with root package name */
    public final u.a<m2.k, u.n> f62306b;

    /* renamed from: c  reason: collision with root package name */
    public long f62307c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f62308d;

    public m0(long j10, int i10) {
        s0 e10;
        this.f62305a = i10;
        this.f62306b = new u.a<>(m2.k.b(j10), e1.i(m2.k.f40528b), null, 4, null);
        this.f62307c = j10;
        e10 = z1.e(Boolean.FALSE, null, 2, null);
        this.f62308d = e10;
    }

    public /* synthetic */ m0(long j10, int i10, jo.h hVar) {
        this(j10, i10);
    }

    public final u.a<m2.k, u.n> a() {
        return this.f62306b;
    }

    public final boolean b() {
        return ((Boolean) this.f62308d.getValue()).booleanValue();
    }

    public final int c() {
        return this.f62305a;
    }

    public final long d() {
        return this.f62307c;
    }

    public final void e(boolean z10) {
        this.f62308d.setValue(Boolean.valueOf(z10));
    }

    public final void f(int i10) {
        this.f62305a = i10;
    }

    public final void g(long j10) {
        this.f62307c = j10;
    }
}
