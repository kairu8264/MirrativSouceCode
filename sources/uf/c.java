package uf;

import io.l;
import io.q;
import jo.p;
import l0.k;
import po.n;
import t.d0;
import u.i;
import u.w;
import w.m;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f55884a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final l<qn.h, Float> f55885b = a.f55887w;

    /* renamed from: c  reason: collision with root package name */
    public static final q<qn.h, Integer, Integer, Integer> f55886c = b.f55888w;

    /* loaded from: classes3.dex */
    public static final class a extends jo.q implements l<qn.h, Float> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f55887w = new a();

        public a() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Float invoke(qn.h hVar) {
            p.h(hVar, "layoutInfo");
            return Float.valueOf(hVar.f() - hVar.g());
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements q<qn.h, Integer, Integer, Integer> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f55888w = new b();

        public b() {
            super(3);
        }

        public final Integer a(qn.h hVar, int i10, int i11) {
            p.h(hVar, "layoutInfo");
            return Integer.valueOf(n.m(n.m(i11, i10 - 1, i10 + 1), 0, hVar.h() - 1));
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Integer s0(qn.h hVar, Integer num, Integer num2) {
            return a(hVar, num.intValue(), num2.intValue());
        }
    }

    public final m a(f fVar, w<Float> wVar, i<Float> iVar, float f10, l0.i iVar2, int i10, int i11) {
        p.h(fVar, "state");
        iVar2.x(132228799);
        w<Float> b10 = (i11 & 2) != 0 ? d0.b(iVar2, 0) : wVar;
        i<Float> b11 = (i11 & 4) != 0 ? qn.f.f49650a.b() : iVar;
        float l10 = (i11 & 8) != 0 ? m2.g.l(0) : f10;
        if (k.O()) {
            k.Z(132228799, i10, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:181)");
        }
        m b12 = b(fVar, b10, b11, l10, f55886c, iVar2, (i10 & 14) | 576 | (i10 & 7168) | ((i10 << 3) & 458752), 0);
        if (k.O()) {
            k.Y();
        }
        iVar2.O();
        return b12;
    }

    public final m b(f fVar, w<Float> wVar, i<Float> iVar, float f10, q<? super qn.h, ? super Integer, ? super Integer, Integer> qVar, l0.i iVar2, int i10, int i11) {
        p.h(fVar, "state");
        p.h(qVar, "snapIndex");
        iVar2.x(-776119664);
        w<Float> b10 = (i11 & 2) != 0 ? d0.b(iVar2, 0) : wVar;
        i<Float> b11 = (i11 & 4) != 0 ? qn.f.f49650a.b() : iVar;
        float l10 = (i11 & 8) != 0 ? m2.g.l(0) : f10;
        if (k.O()) {
            k.Z(-776119664, i10, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:151)");
        }
        qn.e b12 = qn.a.b(fVar.l(), qn.d.f49617a.b(), l10, b10, b11, qVar, iVar2, 36864 | ((i10 >> 3) & 896) | ((i10 << 3) & 458752), 0);
        if (k.O()) {
            k.Y();
        }
        iVar2.O();
        return b12;
    }
}
