package z5;

import c1.d0;
import io.l;
import io.p;
import jo.q;
import l0.l1;
import wn.v;
import x0.f;
import z5.b;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {
        public final /* synthetic */ f1.d A;
        public final /* synthetic */ f1.d B;
        public final /* synthetic */ l<b.c.C1077c, v> C;
        public final /* synthetic */ l<b.c.d, v> D;
        public final /* synthetic */ l<b.c.C1076b, v> E;
        public final /* synthetic */ x0.a F;
        public final /* synthetic */ q1.f G;
        public final /* synthetic */ float H;
        public final /* synthetic */ d0 I;
        public final /* synthetic */ int J;
        public final /* synthetic */ int K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object f62569w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f62570x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0.f f62571y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ f1.d f62572z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, String str, x0.f fVar, f1.d dVar, f1.d dVar2, f1.d dVar3, l<? super b.c.C1077c, v> lVar, l<? super b.c.d, v> lVar2, l<? super b.c.C1076b, v> lVar3, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10, int i11, int i12, int i13) {
            super(2);
            this.f62569w = obj;
            this.f62570x = str;
            this.f62571y = fVar;
            this.f62572z = dVar;
            this.A = dVar2;
            this.B = dVar3;
            this.C = lVar;
            this.D = lVar2;
            this.E = lVar3;
            this.F = aVar;
            this.G = fVar2;
            this.H = f10;
            this.I = d0Var;
            this.J = i10;
            this.K = i11;
            this.L = i12;
            this.M = i13;
        }

        public final void a(l0.i iVar, int i10) {
            i.a(this.f62569w, this.f62570x, this.f62571y, this.f62572z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, iVar, this.K | 1, this.L, this.M);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(Object obj, String str, x0.f fVar, f1.d dVar, f1.d dVar2, f1.d dVar3, l<? super b.c.C1077c, v> lVar, l<? super b.c.d, v> lVar2, l<? super b.c.C1076b, v> lVar3, x0.a aVar, q1.f fVar2, float f10, d0 d0Var, int i10, l0.i iVar, int i11, int i12, int i13) {
        f1.d dVar4;
        int i14;
        int i15;
        int i16;
        l0.i h10 = iVar.h(-1423046543);
        f.a aVar2 = (i13 & 4) != 0 ? x0.f.f59359u : fVar;
        f1.d dVar5 = (i13 & 8) != 0 ? null : dVar;
        f1.d dVar6 = (i13 & 16) != 0 ? null : dVar2;
        if ((i13 & 32) != 0) {
            i14 = i11 & (-458753);
            dVar4 = dVar6;
        } else {
            dVar4 = dVar3;
            i14 = i11;
        }
        l<? super b.c.C1077c, v> lVar4 = (i13 & 64) != 0 ? null : lVar;
        l<? super b.c.d, v> lVar5 = (i13 & 128) != 0 ? null : lVar2;
        l<? super b.c.C1076b, v> lVar6 = (i13 & 256) != 0 ? null : lVar3;
        x0.a e10 = (i13 & 512) != 0 ? x0.a.f59327a.e() : aVar;
        q1.f d10 = (i13 & 1024) != 0 ? q1.f.f48569a.d() : fVar2;
        float f11 = (i13 & 2048) != 0 ? 1.0f : f10;
        d0 d0Var2 = (i13 & 4096) != 0 ? null : d0Var;
        if ((i13 & 8192) != 0) {
            i16 = i12 & (-7169);
            i15 = e1.e.f30042e.b();
        } else {
            i15 = i10;
            i16 = i12;
        }
        int i17 = 2392584 | (i14 & 112);
        int i18 = i14 << 3;
        int i19 = i16 << 3;
        z5.a.b(obj, str, g.c(h.a(), h10, 6), aVar2, dVar5, dVar6, dVar4, lVar4, lVar5, lVar6, e10, d10, f11, d0Var2, i15, h10, (i18 & 7168) | i17 | (29360128 & i18) | (234881024 & i18) | (1879048192 & i18), ((i14 >> 27) & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (i19 & 57344), 0);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(obj, str, aVar2, dVar5, dVar6, dVar4, lVar4, lVar5, lVar6, e10, d10, f11, d0Var2, i15, i11, i12, i13));
    }
}
