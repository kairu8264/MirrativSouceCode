package a0;

import l0.s0;
import l0.z1;
import u.e1;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public int f195a;

    /* renamed from: b  reason: collision with root package name */
    public final u.a<m2.k, u.n> f196b;

    /* renamed from: c  reason: collision with root package name */
    public long f197c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f198d;

    public o0(long j10, int i10) {
        s0 e10;
        this.f195a = i10;
        this.f196b = new u.a<>(m2.k.b(j10), e1.i(m2.k.f40528b), null, 4, null);
        this.f197c = j10;
        e10 = z1.e(Boolean.FALSE, null, 2, null);
        this.f198d = e10;
    }

    public /* synthetic */ o0(long j10, int i10, jo.h hVar) {
        this(j10, i10);
    }

    public final u.a<m2.k, u.n> a() {
        return this.f196b;
    }

    public final boolean b() {
        return ((Boolean) this.f198d.getValue()).booleanValue();
    }

    public final int c() {
        return this.f195a;
    }

    public final long d() {
        return this.f197c;
    }

    public final void e(boolean z10) {
        this.f198d.setValue(Boolean.valueOf(z10));
    }

    public final void f(int i10) {
        this.f195a = i10;
    }

    public final void g(long j10) {
        this.f197c = j10;
    }
}
