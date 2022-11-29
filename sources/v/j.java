package v;

import l0.l1;
import y.g1;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x0.f f56233w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<e1.e, wn.v> f56234x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f56235y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x0.f fVar, io.l<? super e1.e, wn.v> lVar, int i10) {
            super(2);
            this.f56233w = fVar;
            this.f56234x = lVar;
            this.f56235y = i10;
        }

        public final void a(l0.i iVar, int i10) {
            j.a(this.f56233w, this.f56234x, iVar, this.f56235y | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(x0.f fVar, io.l<? super e1.e, wn.v> lVar, l0.i iVar, int i10) {
        int i11;
        jo.p.h(fVar, "modifier");
        jo.p.h(lVar, "onDraw");
        l0.i h10 = iVar.h(-932836462);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(lVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && h10.j()) {
            h10.I();
        } else {
            g1.a(z0.i.a(fVar, lVar), h10, 0);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(fVar, lVar, i10));
    }
}
