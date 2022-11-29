package a0;

import b0.c;
import java.util.Map;
import l0.l1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final b0.c<h> f200a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f201b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f202c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Object, Integer> f203d;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f205x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f206y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(2);
            this.f205x = i10;
            this.f206y = i11;
        }

        public final void a(l0.i iVar, int i10) {
            r.this.a(this.f205x, iVar, this.f206y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public r(b0.c<h> cVar, boolean z10, po.i iVar) {
        jo.p.h(cVar, "intervals");
        jo.p.h(iVar, "nearestItemsRange");
        this.f200a = cVar;
        this.f201b = z10;
        this.f202c = new d0(this);
        this.f203d = n.c(iVar, cVar);
    }

    public final void a(int i10, l0.i iVar, int i11) {
        l0.i h10 = iVar.h(-405085610);
        c.a<h> aVar = this.f200a.get(i10);
        aVar.c().a().F(p.f199a, Integer.valueOf(i10 - aVar.b()), h10, 6);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(i10, i11));
    }

    public final Object b(int i10) {
        c.a<h> aVar = this.f200a.get(i10);
        return aVar.c().d().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public final boolean c() {
        return this.f201b;
    }

    public final int d() {
        return this.f200a.a();
    }

    public final Object e(int i10) {
        c.a<h> aVar = this.f200a.get(i10);
        int b10 = i10 - aVar.b();
        io.l<Integer, Object> b11 = aVar.c().b();
        Object invoke = b11 != null ? b11.invoke(Integer.valueOf(b10)) : null;
        return invoke == null ? b0.n.a(i10) : invoke;
    }

    public final Map<Object, Integer> f() {
        return this.f203d;
    }

    public final long g(q qVar, int i10) {
        jo.p.h(qVar, "$this$getSpan");
        c.a<h> aVar = this.f200a.get(i10);
        return aVar.c().c().invoke(qVar, Integer.valueOf(i10 - aVar.b())).g();
    }

    public final d0 h() {
        return this.f202c;
    }
}
