package z;

import b0.c;
import java.util.List;
import java.util.Map;
import l0.l1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final b0.c<m> f62341a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Integer> f62342b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, Integer> f62343c;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h f62345x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f62346y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f62347z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, int i10, int i11) {
            super(2);
            this.f62345x = hVar;
            this.f62346y = i10;
            this.f62347z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            t.this.a(this.f62345x, this.f62346y, iVar, this.f62347z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public t(b0.c<m> cVar, List<Integer> list, po.i iVar) {
        jo.p.h(cVar, "intervals");
        jo.p.h(list, "headerIndexes");
        jo.p.h(iVar, "nearestItemsRange");
        this.f62341a = cVar;
        this.f62342b = list;
        this.f62343c = s.c(iVar, cVar);
    }

    public final void a(h hVar, int i10, l0.i iVar, int i11) {
        jo.p.h(hVar, "scope");
        l0.i h10 = iVar.h(1922528915);
        c.a<m> aVar = this.f62341a.get(i10);
        aVar.c().a().F(hVar, Integer.valueOf(i10 - aVar.b()), h10, Integer.valueOf(i11 & 14));
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(hVar, i10, i11));
    }

    public final Object b(int i10) {
        c.a<m> aVar = this.f62341a.get(i10);
        return aVar.c().c().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public final List<Integer> c() {
        return this.f62342b;
    }

    public final int d() {
        return this.f62341a.a();
    }

    public final Object e(int i10) {
        c.a<m> aVar = this.f62341a.get(i10);
        int b10 = i10 - aVar.b();
        io.l<Integer, Object> b11 = aVar.c().b();
        Object invoke = b11 != null ? b11.invoke(Integer.valueOf(b10)) : null;
        return invoke == null ? b0.n.a(i10) : invoke;
    }

    public final Map<Object, Integer> f() {
        return this.f62343c;
    }
}
