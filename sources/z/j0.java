package z;

import java.util.Map;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f62271a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.i f62272b;

    /* renamed from: c  reason: collision with root package name */
    public final l0 f62273c;

    /* renamed from: d  reason: collision with root package name */
    public final long f62274d;

    public j0(long j10, boolean z10, q qVar, b0.i iVar, l0 l0Var) {
        this.f62271a = qVar;
        this.f62272b = iVar;
        this.f62273c = l0Var;
        this.f62274d = m2.c.b(0, z10 ? m2.b.n(j10) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : m2.b.m(j10), 5, null);
    }

    public /* synthetic */ j0(long j10, boolean z10, q qVar, b0.i iVar, l0 l0Var, jo.h hVar) {
        this(j10, z10, qVar, iVar, l0Var);
    }

    public final i0 a(int i10) {
        return this.f62273c.a(i10, this.f62271a.e(i10), this.f62272b.J(i10, this.f62274d));
    }

    public final long b() {
        return this.f62274d;
    }

    public final Map<Object, Integer> c() {
        return this.f62271a.c();
    }
}
