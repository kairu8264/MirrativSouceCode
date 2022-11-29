package f0;

import l0.l1;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g0.v f31397w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<l0.i, Integer, wn.v> f31398x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f31399y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g0.v vVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f31397w = vVar;
            this.f31398x = pVar;
            this.f31399y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            g.a(this.f31397w, this.f31398x, iVar, this.f31399y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(g0.v vVar, io.p<? super l0.i, ? super Integer, wn.v> pVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(vVar, "manager");
        jo.p.h(pVar, "content");
        l0.i h10 = iVar.h(-1985516685);
        if ((i10 & 112) == 0) {
            i11 = (h10.P(pVar) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 81) == 16 && h10.j()) {
            h10.I();
        } else {
            pVar.invoke(h10, Integer.valueOf((i11 >> 3) & 14));
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(vVar, pVar, i10));
    }
}
