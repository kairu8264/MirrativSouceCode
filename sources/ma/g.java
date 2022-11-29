package ma;

import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.l;
import jo.f0;
import jo.p;
import jo.q;
import l0.c0;
import l0.l1;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f40663w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f40663w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f40663w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f40664w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f40665x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f40666y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f40667z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f40664w = aVar;
            this.f40665x = aVar2;
            this.f40666y = aVar3;
            this.f40667z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f40667z;
            vq.a aVar2 = this.f40664w;
            io.a aVar3 = this.f40665x;
            return kq.c.a(this.f40666y, new kq.b(f0.b(h.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.gifthelp.LiveGameGiftHelpPageKt$LiveGameGiftHelpPage$1", f = "LiveGameGiftHelpPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40668w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ma.a f40669x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40670y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40671z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ma.a aVar, String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f40669x = aVar;
            this.f40670y = str;
            this.f40671z = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f40669x, this.f40670y, this.f40671z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f40668w == 0) {
                m.b(obj);
                this.f40669x.c(this.f40670y, this.f40671z);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.p<l0.i, Integer, v> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f40672w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f40673x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, v> f40674y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f40675z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, io.l<? super String, v> lVar, io.a<v> aVar, int i10) {
            super(2);
            this.f40672w = str;
            this.f40673x = str2;
            this.f40674y = lVar;
            this.f40675z = aVar;
            this.A = i10;
        }

        public final void a(l0.i iVar, int i10) {
            g.a(this.f40672w, this.f40673x, this.f40674y, this.f40675z, iVar, this.A | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(String str, String str2, io.l<? super String, v> lVar, io.a<v> aVar, l0.i iVar, int i10) {
        int i11;
        p.h(str, "referer");
        p.h(str2, "liveGameId");
        p.h(lVar, "onClickLink");
        p.h(aVar, "onClickClose");
        l0.i h10 = iVar.h(1939498055);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(str2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(lVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(aVar) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && h10.j()) {
            h10.I();
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
                y10 = new s0(f0.b(h.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            h hVar = (h) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(ma.a.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            c0.c(v.f59242a, new c((ma.a) y11, str, str2, null), h10, 64);
            ma.c value = hVar.h().getValue();
            if (value != null) {
                i.a(value, aVar, lVar, h10, (i11 & 896) | ((i11 >> 6) & 112) | 8);
            }
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new d(str, str2, lVar, aVar, i10));
    }
}
