package nq;

import java.util.List;
import jo.h;
import jo.p;
import jo.q;
import sq.c;
import wn.v;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f43767c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final nq.a f43768a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43769b;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a() {
            return new b(null);
        }
    }

    /* renamed from: nq.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0644b extends q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<tq.a> f43771x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0644b(List<tq.a> list) {
            super(0);
            this.f43771x = list;
        }

        public final void a() {
            b.this.d(this.f43771x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public b() {
        this.f43768a = new nq.a();
        this.f43769b = true;
    }

    public /* synthetic */ b(h hVar) {
        this();
    }

    public final void b() {
        this.f43768a.a();
    }

    public final nq.a c() {
        return this.f43768a;
    }

    public final void d(List<tq.a> list) {
        this.f43768a.f(list, this.f43769b);
    }

    public final b e(List<tq.a> list) {
        p.h(list, "modules");
        if (this.f43768a.d().f(sq.b.INFO)) {
            double a10 = yq.a.a(new C0644b(list));
            int i10 = this.f43768a.c().i();
            c d10 = this.f43768a.d();
            d10.e("loaded " + i10 + " definitions - " + a10 + " ms");
        } else {
            d(list);
        }
        return this;
    }
}
