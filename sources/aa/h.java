package aa;

import io.p;
import java.util.List;
import jo.q;
import l0.l1;
import wn.v;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<e> f692w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f693x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f694y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f695z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends e> list, int i10, io.a<v> aVar, int i11) {
            super(2);
            this.f692w = list;
            this.f693x = i10;
            this.f694y = aVar;
            this.f695z = i11;
        }

        public final void a(l0.i iVar, int i10) {
            h.a(this.f692w, this.f693x, this.f694y, iVar, this.f695z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(List<? extends e> list, int i10, io.a<v> aVar, l0.i iVar, int i11) {
        jo.p.h(list, "listItems");
        jo.p.h(aVar, "onClickClose");
        l0.i h10 = iVar.h(-737462752);
        g.a(list, i10, aVar, h10, (i11 & 112) | 8 | (i11 & 896));
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(list, i10, aVar, i11));
    }
}
