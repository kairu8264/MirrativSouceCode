package uf;

import jo.q;
import l0.i;
import l0.k;

/* loaded from: classes3.dex */
public final class g {

    /* loaded from: classes3.dex */
    public static final class a extends q implements io.a<f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f55908w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(0);
            this.f55908w = i10;
        }

        @Override // io.a
        /* renamed from: a */
        public final f invoke() {
            return new f(this.f55908w);
        }
    }

    public static final f a(int i10, i iVar, int i11, int i12) {
        iVar.x(1352421093);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (k.O()) {
            k.Z(1352421093, i11, -1, "com.google.accompanist.pager.rememberPagerState (PagerState.kt:56)");
        }
        Object[] objArr = new Object[0];
        u0.i<f, ?> a10 = f.f55890h.a();
        Integer valueOf = Integer.valueOf(i10);
        iVar.x(1157296644);
        boolean P = iVar.P(valueOf);
        Object y10 = iVar.y();
        if (P || y10 == i.f39065a.a()) {
            y10 = new a(i10);
            iVar.q(y10);
        }
        iVar.O();
        f fVar = (f) u0.b.b(objArr, a10, null, (io.a) y10, iVar, 72, 4);
        if (k.O()) {
            k.Y();
        }
        iVar.O();
        return fVar;
    }
}
