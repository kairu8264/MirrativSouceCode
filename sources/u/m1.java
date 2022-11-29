package u;

import u.f1;
import u.p;

/* loaded from: classes.dex */
public final class m1<V extends p> implements f1<V> {

    /* renamed from: a  reason: collision with root package name */
    public final i1<V> f54071a;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f54072b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54073c;

    /* renamed from: d  reason: collision with root package name */
    public final long f54074d;

    public m1(i1<V> i1Var, q0 q0Var, long j10) {
        this.f54071a = i1Var;
        this.f54072b = q0Var;
        this.f54073c = (i1Var.b() + i1Var.c()) * 1000000;
        this.f54074d = j10 * 1000000;
    }

    public /* synthetic */ m1(i1 i1Var, q0 q0Var, long j10, jo.h hVar) {
        this(i1Var, q0Var, j10);
    }

    @Override // u.f1
    public boolean a() {
        return true;
    }

    @Override // u.f1
    public V d(V v10, V v11, V v12) {
        return (V) f1.a.a(this, v10, v11, v12);
    }

    @Override // u.f1
    public V e(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54071a.e(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    @Override // u.f1
    public V f(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return this.f54071a.f(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    @Override // u.f1
    public long g(V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        return Long.MAX_VALUE;
    }

    public final long h(long j10) {
        long j11 = this.f54074d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f54073c;
        long j14 = j12 / j13;
        return (this.f54072b == q0.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    public final V i(long j10, V v10, V v11, V v12) {
        long j11 = this.f54074d;
        long j12 = this.f54073c;
        return j10 + j11 > j12 ? e(j12 - j11, v10, v11, v12) : v11;
    }
}
