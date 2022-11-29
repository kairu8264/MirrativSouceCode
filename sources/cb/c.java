package cb;

import android.graphics.Bitmap;
import io.l;
import io.p;
import jo.q;
import l0.i;
import l0.l1;
import wn.v;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<i, Integer, v> {
        public final /* synthetic */ l<Bitmap, v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Bitmap f19002w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ cb.a f19003x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f19004y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f19005z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Bitmap bitmap, cb.a aVar, boolean z10, io.a<v> aVar2, l<? super Bitmap, v> lVar, int i10, int i11) {
            super(2);
            this.f19002w = bitmap;
            this.f19003x = aVar;
            this.f19004y = z10;
            this.f19005z = aVar2;
            this.A = lVar;
            this.B = i10;
            this.C = i11;
        }

        public final void a(i iVar, int i10) {
            c.a(this.f19002w, this.f19003x, this.f19004y, this.f19005z, this.A, iVar, this.B | 1, this.C);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(Bitmap bitmap, cb.a aVar, boolean z10, io.a<v> aVar2, l<? super Bitmap, v> lVar, i iVar, int i10, int i11) {
        jo.p.h(bitmap, "bitmap");
        jo.p.h(aVar, "aspectRatio");
        jo.p.h(aVar2, "onBackPressed");
        jo.p.h(lVar, "onSavePressed");
        i h10 = iVar.h(-1685381071);
        boolean z11 = (i11 & 4) != 0 ? false : z10;
        d.a(bitmap, aVar, z11, aVar2, lVar, h10, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10), 0);
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new a(bitmap, aVar, z11, aVar2, lVar, i10, i11));
    }
}
