package gd;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.z;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import c1.c0;
import co.l;
import h0.k0;
import h0.m0;
import h0.v0;
import ha.a;
import jo.f0;
import jo.p;
import jo.q;
import l0.l1;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class f {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f33212w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f33212w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f33212w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f33213w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f33214x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f33215y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f33216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f33213w = aVar;
            this.f33214x = aVar2;
            this.f33215y = aVar3;
            this.f33216z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f33216z;
            vq.a aVar2 = this.f33213w;
            io.a aVar3 = this.f33214x;
            return kq.c.a(this.f33215y, new kq.b(f0.b(g.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.coin.CoinPassbookPageKt$CoinPassbookPage$1", f = "CoinPassbookPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33217w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ gd.c f33218x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gd.c cVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f33218x = cVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f33218x, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f33217w == 0) {
                m.b(obj);
                this.f33218x.g();
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g f33219w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ gd.c f33220x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Context f33221y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ tb.c f33222z;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ gd.c f33223w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ g f33224x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Context f33225y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ tb.c f33226z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gd.c cVar, g gVar, Context context, tb.c cVar2) {
                super(0);
                this.f33223w = cVar;
                this.f33224x = gVar;
                this.f33225y = context;
                this.f33226z = cVar2;
            }

            public final void a() {
                this.f33223w.i(false);
                Integer f10 = this.f33224x.f().f();
                if (f10 != null) {
                    Context context = this.f33225y;
                    context.startActivity(this.f33226z.X(context, "passbook_coin", f10.intValue()));
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar, gd.c cVar, Context context, tb.c cVar2) {
            super(2);
            this.f33219w = gVar;
            this.f33220x = cVar;
            this.f33221y = context;
            this.f33222z = cVar2;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else if (this.f33219w.n().getValue().booleanValue()) {
                m0.b(new a(this.f33220x, this.f33219w, this.f33221y, this.f33222z), null, null, null, c0.f18634b.d(), 0L, k0.f33936a.a(m2.g.l(0), 0.0f, 0.0f, 0.0f, iVar, 32774, 14), i.f33244a.a(), iVar, 12607488, 46);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.q<y.t0, l0.i, Integer, v> {
        public final /* synthetic */ gd.c A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g f33227w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f33228x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f33229y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Context f33230z;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Context f33231w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(0);
                this.f33231w = context;
            }

            public final void a() {
                Context context = this.f33231w;
                e.b bVar = context instanceof e.b ? (e.b) context : null;
                if (bVar != null) {
                    bVar.onBackPressed();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g f33232w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ gd.c f33233x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g gVar, gd.c cVar) {
                super(0);
                this.f33232w = gVar;
                this.f33233x = cVar;
            }

            public final void a() {
                Integer f10 = this.f33232w.i().f();
                if (f10 == null) {
                    f10 = 0;
                }
                int intValue = f10.intValue();
                if (p.c(this.f33232w.m().getValue(), a.d.f34697b) && (!this.f33232w.h().isEmpty()) && intValue > 0) {
                    this.f33233x.f(intValue);
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends q implements io.l<Boolean, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ gd.c f33234w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(gd.c cVar) {
                super(1);
                this.f33234w = cVar;
            }

            public final void a(boolean z10) {
                this.f33234w.i(z10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Boolean bool) {
                a(bool.booleanValue());
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g f33235w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ gd.c f33236x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(g gVar, gd.c cVar) {
                super(0);
                this.f33235w = gVar;
                this.f33236x = cVar;
            }

            public final void a() {
                Integer f10 = this.f33235w.i().f();
                if (f10 == null) {
                    f10 = 0;
                }
                int intValue = f10.intValue();
                if (intValue > 0) {
                    this.f33236x.f(intValue);
                } else {
                    this.f33236x.h();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g gVar, io.a<v> aVar, int i10, Context context, gd.c cVar) {
            super(3);
            this.f33227w = gVar;
            this.f33228x = aVar;
            this.f33229y = i10;
            this.f33230z = context;
            this.A = cVar;
        }

        public final void a(y.t0 t0Var, l0.i iVar, int i10) {
            p.h(t0Var, "it");
            if ((i10 & 81) == 16 && iVar.j()) {
                iVar.I();
            } else {
                gd.a.a(this.f33227w.m(), this.f33227w.k(), this.f33227w.g(), this.f33227w.j(), this.f33227w.l(), this.f33227w.h(), new a(this.f33230z), new b(this.f33227w, this.A), new c(this.A), new d(this.f33227w, this.A), this.f33228x, iVar, 262144, this.f33229y & 14);
            }
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ v s0(y.t0 t0Var, l0.i iVar, Integer num) {
            a(t0Var, iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: gd.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0402f extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f33237w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f33238x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0402f(io.a<v> aVar, int i10) {
            super(2);
            this.f33237w = aVar;
            this.f33238x = i10;
        }

        public final void a(l0.i iVar, int i10) {
            f.a(this.f33237w, iVar, this.f33238x | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void a(io.a<v> aVar, l0.i iVar, int i10) {
        int i11;
        l0.i iVar2;
        p.h(aVar, "onClickPurchase");
        l0.i h10 = iVar.h(1284576134);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && h10.j()) {
            h10.I();
            iVar2 = h10;
        } else {
            h10.x(1509148303);
            pq.b bVar = pq.b.f48484a;
            xq.a b10 = bVar.get().e().b();
            h10.x(-1688186670);
            h10.x(-1688186362);
            kq.a a10 = iq.a.a(h10, 0);
            h10.O();
            h10.x(-3686552);
            boolean P = h10.P(null) | h10.P(null);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new s0(f0.b(g.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            g gVar = (g) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(gd.c.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            gd.c cVar = (gd.c) y11;
            h10.x(-909571169);
            xq.a b12 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P3 = h10.P(null) | h10.P(null);
            Object y12 = h10.y();
            if (P3 || y12 == l0.i.f39065a.a()) {
                y12 = b12.c(f0.b(tb.c.class), null, null);
                h10.q(y12);
            }
            h10.O();
            h10.O();
            Context context = (Context) h10.G(z.g());
            l0.c0.c(v.f59242a, new c(cVar, null), h10, 64);
            iVar2 = h10;
            v0.a(null, null, null, null, null, s0.c.b(h10, -1463543362, true, new d(gVar, cVar, context, (tb.c) y12)), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s0.c.b(h10, -1769454584, true, new e(gVar, aVar, i11, context, cVar)), h10, 196608, 12582912, 131039);
        }
        l1 l10 = iVar2.l();
        if (l10 == null) {
            return;
        }
        l10.a(new C0402f(aVar, i10));
    }
}
