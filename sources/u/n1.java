package u;

import java.util.Map;
import u.i1;
import u.p;

/* loaded from: classes.dex */
public final class n1<V extends p> implements i1<V> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, wn.k<V, a0>> f54081a;

    /* renamed from: b  reason: collision with root package name */
    public final int f54082b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54083c;

    /* renamed from: d  reason: collision with root package name */
    public V f54084d;

    /* renamed from: e  reason: collision with root package name */
    public V f54085e;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(Map<Integer, ? extends wn.k<? extends V, ? extends a0>> map, int i10, int i11) {
        jo.p.h(map, "keyframes");
        this.f54081a = map;
        this.f54082b = i10;
        this.f54083c = i11;
    }

    @Override // u.f1
    public boolean a() {
        return i1.a.c(this);
    }

    @Override // u.i1
    public int b() {
        return this.f54083c;
    }

    @Override // u.i1
    public int c() {
        return this.f54082b;
    }

    @Override // u.f1
    public V d(V v10, V v11, V v12) {
        return (V) i1.a.b(this, v10, v11, v12);
    }

    @Override // u.f1
    public V e(long j10, V v10, V v11, V v12) {
        long c10;
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        c10 = g1.c(this, j10 / 1000000);
        if (c10 <= 0) {
            return v12;
        }
        p e10 = g1.e(this, c10 - 1, v10, v11, v12);
        p e11 = g1.e(this, c10, v10, v11, v12);
        h(v10);
        int i10 = 0;
        int b10 = e10.b();
        while (true) {
            V v13 = null;
            if (i10 >= b10) {
                break;
            }
            int i11 = i10 + 1;
            V v14 = this.f54085e;
            if (v14 == null) {
                jo.p.v("velocityVector");
            } else {
                v13 = v14;
            }
            v13.e(i10, (e10.a(i10) - e11.a(i10)) * 1000.0f);
            i10 = i11;
        }
        V v15 = this.f54085e;
        if (v15 == null) {
            jo.p.v("velocityVector");
            return null;
        }
        return v15;
    }

    @Override // u.f1
    public V f(long j10, V v10, V v11, V v12) {
        long c10;
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        c10 = g1.c(this, j10 / 1000000);
        int i10 = (int) c10;
        if (this.f54081a.containsKey(Integer.valueOf(i10))) {
            return (V) ((wn.k) xn.n0.f(this.f54081a, Integer.valueOf(i10))).c();
        }
        if (i10 >= c()) {
            return v11;
        }
        if (i10 <= 0) {
            return v10;
        }
        int c11 = c();
        a0 c12 = b0.c();
        int i11 = 0;
        V v13 = v10;
        int i12 = 0;
        for (Map.Entry<Integer, wn.k<V, a0>> entry : this.f54081a.entrySet()) {
            int intValue = entry.getKey().intValue();
            wn.k<V, a0> value = entry.getValue();
            if (i10 > intValue && intValue >= i12) {
                v13 = value.c();
                c12 = value.d();
                i12 = intValue;
            } else if (i10 < intValue && intValue <= c11) {
                v11 = value.c();
                c11 = intValue;
            }
        }
        float a10 = c12.a((i10 - i12) / (c11 - i12));
        h(v10);
        int b10 = v13.b();
        while (true) {
            V v14 = null;
            if (i11 >= b10) {
                break;
            }
            int i13 = i11 + 1;
            V v15 = this.f54084d;
            if (v15 == null) {
                jo.p.v("valueVector");
            } else {
                v14 = v15;
            }
            v14.e(i11, e1.k(v13.a(i11), v11.a(i11), a10));
            i11 = i13;
        }
        V v16 = this.f54084d;
        if (v16 == null) {
            jo.p.v("valueVector");
            return null;
        }
        return v16;
    }

    @Override // u.f1
    public long g(V v10, V v11, V v12) {
        return i1.a.a(this, v10, v11, v12);
    }

    public final void h(V v10) {
        if (this.f54084d == null) {
            this.f54084d = (V) q.d(v10);
            this.f54085e = (V) q.d(v10);
        }
    }
}
