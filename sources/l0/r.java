package l0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d1<?>[] f39237w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.p<i, Integer, wn.v> f39238x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f39239y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d1<?>[] d1VarArr, io.p<? super i, ? super Integer, wn.v> pVar, int i10) {
            super(2);
            this.f39237w = d1VarArr;
            this.f39238x = pVar;
            this.f39239y = i10;
        }

        public final void a(i iVar, int i10) {
            d1<?>[] d1VarArr = this.f39237w;
            r.a((d1[]) Arrays.copyOf(d1VarArr, d1VarArr.length), this.f39238x, iVar, this.f39239y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(d1<?>[] d1VarArr, io.p<? super i, ? super Integer, wn.v> pVar, i iVar, int i10) {
        jo.p.h(d1VarArr, "values");
        jo.p.h(pVar, "content");
        i h10 = iVar.h(-1390796515);
        h10.p(d1VarArr);
        pVar.invoke(h10, Integer.valueOf((i10 >> 3) & 14));
        h10.J();
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(d1VarArr, pVar, i10));
    }

    public static final <T> c1<T> b(t1<T> t1Var, io.a<? extends T> aVar) {
        jo.p.h(t1Var, "policy");
        jo.p.h(aVar, "defaultFactory");
        return new b0(t1Var, aVar);
    }

    public static /* synthetic */ c1 c(t1 t1Var, io.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            t1Var = u1.n();
        }
        return b(t1Var, aVar);
    }

    public static final <T> c1<T> d(io.a<? extends T> aVar) {
        jo.p.h(aVar, "defaultFactory");
        return new d2(aVar);
    }
}
