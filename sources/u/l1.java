package u;

import u.p;

/* loaded from: classes.dex */
public final class l1<V extends p> implements h1<V> {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f54064a;

    /* renamed from: b  reason: collision with root package name */
    public V f54065b;

    /* renamed from: c  reason: collision with root package name */
    public V f54066c;

    /* renamed from: d  reason: collision with root package name */
    public V f54067d;

    /* renamed from: e  reason: collision with root package name */
    public final float f54068e;

    public l1(e0 e0Var) {
        jo.p.h(e0Var, "floatDecaySpec");
        this.f54064a = e0Var;
        this.f54068e = e0Var.a();
    }

    @Override // u.h1
    public float a() {
        return this.f54068e;
    }

    @Override // u.h1
    public V b(V v10, V v11) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "initialVelocity");
        if (this.f54067d == null) {
            this.f54067d = (V) q.d(v10);
        }
        int i10 = 0;
        V v12 = this.f54067d;
        if (v12 == null) {
            jo.p.v("targetVector");
            v12 = null;
        }
        int b10 = v12.b();
        while (i10 < b10) {
            int i11 = i10 + 1;
            V v13 = this.f54067d;
            if (v13 == null) {
                jo.p.v("targetVector");
                v13 = null;
            }
            v13.e(i10, this.f54064a.d(v10.a(i10), v11.a(i10)));
            i10 = i11;
        }
        V v14 = this.f54067d;
        if (v14 == null) {
            jo.p.v("targetVector");
            return null;
        }
        return v14;
    }

    @Override // u.h1
    public long c(V v10, V v11) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "initialVelocity");
        if (this.f54066c == null) {
            this.f54066c = (V) q.d(v10);
        }
        V v12 = this.f54066c;
        if (v12 == null) {
            jo.p.v("velocityVector");
            v12 = null;
        }
        int b10 = v12.b();
        long j10 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            j10 = Math.max(j10, this.f54064a.c(v10.a(i10), v11.a(i10)));
        }
        return j10;
    }

    @Override // u.h1
    public V d(long j10, V v10, V v11) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "initialVelocity");
        if (this.f54066c == null) {
            this.f54066c = (V) q.d(v10);
        }
        int i10 = 0;
        V v12 = this.f54066c;
        if (v12 == null) {
            jo.p.v("velocityVector");
            v12 = null;
        }
        int b10 = v12.b();
        while (i10 < b10) {
            int i11 = i10 + 1;
            V v13 = this.f54066c;
            if (v13 == null) {
                jo.p.v("velocityVector");
                v13 = null;
            }
            v13.e(i10, this.f54064a.b(j10, v10.a(i10), v11.a(i10)));
            i10 = i11;
        }
        V v14 = this.f54066c;
        if (v14 == null) {
            jo.p.v("velocityVector");
            return null;
        }
        return v14;
    }

    @Override // u.h1
    public V e(long j10, V v10, V v11) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "initialVelocity");
        if (this.f54065b == null) {
            this.f54065b = (V) q.d(v10);
        }
        int i10 = 0;
        V v12 = this.f54065b;
        if (v12 == null) {
            jo.p.v("valueVector");
            v12 = null;
        }
        int b10 = v12.b();
        while (i10 < b10) {
            int i11 = i10 + 1;
            V v13 = this.f54065b;
            if (v13 == null) {
                jo.p.v("valueVector");
                v13 = null;
            }
            v13.e(i10, this.f54064a.e(j10, v10.a(i10), v11.a(i10)));
            i10 = i11;
        }
        V v14 = this.f54065b;
        if (v14 == null) {
            jo.p.v("valueVector");
            return null;
        }
        return v14;
    }
}
