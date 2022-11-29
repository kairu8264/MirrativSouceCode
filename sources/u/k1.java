package u;

import java.util.Iterator;
import u.j1;
import u.p;

/* loaded from: classes.dex */
public final class k1<V extends p> implements j1<V> {

    /* renamed from: a  reason: collision with root package name */
    public final r f54053a;

    /* renamed from: b  reason: collision with root package name */
    public V f54054b;

    /* renamed from: c  reason: collision with root package name */
    public V f54055c;

    /* renamed from: d  reason: collision with root package name */
    public V f54056d;

    /* loaded from: classes.dex */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d0 f54057a;

        public a(d0 d0Var) {
            this.f54057a = d0Var;
        }

        @Override // u.r
        public d0 get(int i10) {
            return this.f54057a;
        }
    }

    public k1(r rVar) {
        jo.p.h(rVar, "anims");
        this.f54053a = rVar;
    }

    @Override // u.f1
    public boolean a() {
        return j1.a.b(this);
    }

    @Override // u.f1
    public V d(V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        if (this.f54056d == null) {
            this.f54056d = (V) q.d(v12);
        }
        int i10 = 0;
        V v13 = this.f54056d;
        if (v13 == null) {
            jo.p.v("endVelocityVector");
            v13 = null;
        }
        int b10 = v13.b();
        while (i10 < b10) {
            int i11 = i10 + 1;
            V v14 = this.f54056d;
            if (v14 == null) {
                jo.p.v("endVelocityVector");
                v14 = null;
            }
            v14.e(i10, this.f54053a.get(i10).b(v10.a(i10), v11.a(i10), v12.a(i10)));
            i10 = i11;
        }
        V v15 = this.f54056d;
        if (v15 == null) {
            jo.p.v("endVelocityVector");
            return null;
        }
        return v15;
    }

    @Override // u.f1
    public V e(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        if (this.f54055c == null) {
            this.f54055c = (V) q.d(v12);
        }
        int i10 = 0;
        V v13 = this.f54055c;
        if (v13 == null) {
            jo.p.v("velocityVector");
            v13 = null;
        }
        int b10 = v13.b();
        while (i10 < b10) {
            int i11 = i10 + 1;
            V v14 = this.f54055c;
            if (v14 == null) {
                jo.p.v("velocityVector");
                v14 = null;
            }
            v14.e(i10, this.f54053a.get(i10).d(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
            i10 = i11;
        }
        V v15 = this.f54055c;
        if (v15 == null) {
            jo.p.v("velocityVector");
            return null;
        }
        return v15;
    }

    @Override // u.f1
    public V f(long j10, V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        if (this.f54054b == null) {
            this.f54054b = (V) q.d(v10);
        }
        int i10 = 0;
        V v13 = this.f54054b;
        if (v13 == null) {
            jo.p.v("valueVector");
            v13 = null;
        }
        int b10 = v13.b();
        while (i10 < b10) {
            int i11 = i10 + 1;
            V v14 = this.f54054b;
            if (v14 == null) {
                jo.p.v("valueVector");
                v14 = null;
            }
            v14.e(i10, this.f54053a.get(i10).c(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
            i10 = i11;
        }
        V v15 = this.f54054b;
        if (v15 == null) {
            jo.p.v("valueVector");
            return null;
        }
        return v15;
    }

    @Override // u.f1
    public long g(V v10, V v11, V v12) {
        jo.p.h(v10, "initialValue");
        jo.p.h(v11, "targetValue");
        jo.p.h(v12, "initialVelocity");
        Iterator<Integer> it = po.n.t(0, v10.b()).iterator();
        long j10 = 0;
        while (it.hasNext()) {
            int b10 = ((xn.i0) it).b();
            j10 = Math.max(j10, this.f54053a.get(b10).e(v10.a(b10), v11.a(b10), v12.a(b10)));
        }
        return j10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k1(d0 d0Var) {
        this(new a(d0Var));
        jo.p.h(d0Var, "anim");
    }
}
