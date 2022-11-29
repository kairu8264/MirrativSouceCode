package androidx.compose.ui.platform;

import androidx.lifecycle.o;

/* loaded from: classes.dex */
public final class f2 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: w */
        public final /* synthetic */ androidx.lifecycle.o f14445w;

        /* renamed from: x */
        public final /* synthetic */ androidx.lifecycle.r f14446x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.lifecycle.o oVar, androidx.lifecycle.r rVar) {
            super(0);
            this.f14445w = oVar;
            this.f14446x = rVar;
        }

        public final void a() {
            this.f14445w.c(this.f14446x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public static final /* synthetic */ io.a b(androidx.compose.ui.platform.a aVar, androidx.lifecycle.o oVar) {
        return c(aVar, oVar);
    }

    public static final io.a<wn.v> c(final androidx.compose.ui.platform.a aVar, androidx.lifecycle.o oVar) {
        if (oVar.b().compareTo(o.c.DESTROYED) > 0) {
            androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: androidx.compose.ui.platform.e2
                @Override // androidx.lifecycle.r
                public final void i(androidx.lifecycle.u uVar, o.b bVar) {
                    f2.d(a.this, uVar, bVar);
                }
            };
            oVar.a(rVar);
            return new a(oVar, rVar);
        }
        throw new IllegalStateException(("Cannot configure " + aVar + " to disposeComposition at Lifecycle ON_DESTROY: " + oVar + "is already destroyed").toString());
    }

    public static final void d(androidx.compose.ui.platform.a aVar, androidx.lifecycle.u uVar, o.b bVar) {
        jo.p.h(aVar, "$view");
        jo.p.h(uVar, "<anonymous parameter 0>");
        jo.p.h(bVar, "event");
        if (bVar == o.b.ON_DESTROY) {
            aVar.e();
        }
    }
}
