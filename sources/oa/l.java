package oa;

import l0.l1;

/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f44409w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44410x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44411y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, io.a<wn.v> aVar, int i10) {
            super(2);
            this.f44409w = str;
            this.f44410x = aVar;
            this.f44411y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            l.a(this.f44409w, this.f44410x, iVar, this.f44411y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(String str, io.a<wn.v> aVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(str, "rulePopupImageUrl");
        jo.p.h(aVar, "onClose");
        l0.i h10 = iVar.h(438064752);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(aVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            m.a(str, aVar, h10, (i11 & 112) | (i11 & 14));
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(str, aVar, i10));
    }
}
