package nq;

import java.util.List;
import jo.p;
import jo.q;
import wn.v;
import wq.c;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f43762a = new c(this);

    /* renamed from: b  reason: collision with root package name */
    public final wq.a f43763b = new wq.a(this);

    /* renamed from: c  reason: collision with root package name */
    public final wq.b f43764c = new wq.b(this);

    /* renamed from: d  reason: collision with root package name */
    public sq.c f43765d = new sq.a();

    /* renamed from: nq.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0643a extends q implements io.a<v> {
        public C0643a() {
            super(0);
        }

        public final void a() {
            a.this.c().a();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public final void a() {
        this.f43765d.e("create eager instances ...");
        if (this.f43765d.f(sq.b.DEBUG)) {
            double a10 = yq.a.a(new C0643a());
            sq.c cVar = this.f43765d;
            cVar.b("eager instances created in " + a10 + " ms");
            return;
        }
        this.f43763b.a();
    }

    public final <T> T b(qo.b<?> bVar, vq.a aVar, io.a<? extends uq.a> aVar2) {
        p.h(bVar, "clazz");
        return (T) this.f43762a.b().c(bVar, aVar, aVar2);
    }

    public final wq.a c() {
        return this.f43763b;
    }

    public final sq.c d() {
        return this.f43765d;
    }

    public final c e() {
        return this.f43762a;
    }

    public final void f(List<tq.a> list, boolean z10) {
        p.h(list, "modules");
        this.f43763b.d(list, z10);
        this.f43762a.d(list);
    }
}
