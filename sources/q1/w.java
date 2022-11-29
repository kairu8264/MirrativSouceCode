package q1;

import l0.h2;
import l0.n1;

/* loaded from: classes.dex */
public final class w {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.q<n1<s1.a>, l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f48612w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.f fVar) {
            super(3);
            this.f48612w = fVar;
        }

        public final void a(l0.i iVar, l0.i iVar2, int i10) {
            jo.p.h(iVar, "$this$null");
            x0.f e10 = x0.e.e(iVar2, this.f48612w);
            iVar.x(509942095);
            h2.b(h2.a(iVar), e10, s1.a.f51802o.e());
            iVar.O();
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ wn.v s0(n1<s1.a> n1Var, l0.i iVar, Integer num) {
            a(n1Var.f(), iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final io.q<n1<s1.a>, l0.i, Integer, wn.v> a(x0.f fVar) {
        jo.p.h(fVar, "modifier");
        return s0.c.c(-1586257396, true, new a(fVar));
    }
}
