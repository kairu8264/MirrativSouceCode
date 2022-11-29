package oa;

import androidx.compose.ui.platform.g2;
import androidx.compose.ui.platform.o0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.google.android.exoplayer2.C;
import jo.f0;
import l0.c2;
import l0.h2;
import l0.l1;
import l0.n1;
import q1.c0;
import s1.a;
import uo.q0;
import x0.a;
import x0.f;
import y.d1;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f44381w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f44381w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f44381w.b().U();
            jo.p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f44382w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f44383x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f44384y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f44385z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f44382w = aVar;
            this.f44383x = aVar2;
            this.f44384y = aVar3;
            this.f44385z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f44385z;
            vq.a aVar2 = this.f44382w;
            io.a aVar3 = this.f44383x;
            return kq.c.a(this.f44384y, new kq.b(f0.b(n.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.ranking.LiveGameDailyRankingPageKt$LiveGameDailyRankingPage$1", f = "LiveGameDailyRankingPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44386w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ oa.e f44387x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44388y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44389z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oa.e eVar, String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44387x = eVar;
            this.f44388y = str;
            this.f44389z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44387x, this.f44388y, this.f44389z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f44386w == 0) {
                wn.m.b(obj);
                this.f44387x.c(this.f44388y, this.f44389z);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<g, wn.v> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ oa.e C;
        public final /* synthetic */ String D;
        public final /* synthetic */ String E;
        public final /* synthetic */ io.a<wn.v> F;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n f44390w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44391x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44392y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44393z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ oa.e f44394w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f44395x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f44396y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(oa.e eVar, String str, String str2) {
                super(0);
                this.f44394w = eVar;
                this.f44395x = str;
                this.f44396y = str2;
            }

            public final void a() {
                this.f44394w.c(this.f44395x, this.f44396y);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n f44397w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ oa.e f44398x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f44399y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n nVar, oa.e eVar, String str) {
                super(0);
                this.f44397w = nVar;
                this.f44398x = eVar;
                this.f44399y = str;
            }

            public final void a() {
                String value = this.f44397w.g().getValue();
                if (value != null) {
                    this.f44398x.d(this.f44399y, value);
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a<wn.v> f44400w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(io.a<wn.v> aVar) {
                super(0);
                this.f44400w = aVar;
            }

            public final void a() {
                this.f44400w.invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(n nVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, io.l<? super g, wn.v> lVar3, int i10, oa.e eVar, String str, String str2, io.a<wn.v> aVar2) {
            super(2);
            this.f44390w = nVar;
            this.f44391x = lVar;
            this.f44392y = lVar2;
            this.f44393z = aVar;
            this.A = lVar3;
            this.B = i10;
            this.C = eVar;
            this.D = str;
            this.E = str2;
            this.F = aVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, l0.i] */
        /* JADX WARN: Type inference failed for: r4v5 */
        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            c2<ha.a> h10 = this.f44390w.h();
            c2<g> f10 = this.f44390w.f();
            io.l<String, wn.v> lVar = this.f44391x;
            io.l<String, wn.v> lVar2 = this.f44392y;
            a aVar = new a(this.C, this.D, this.E);
            io.a<wn.v> aVar2 = this.f44393z;
            io.l<g, wn.v> lVar3 = this.A;
            b bVar = new b(this.f44390w, this.C, this.D);
            int i11 = this.B;
            q.a(h10, f10, lVar, lVar2, aVar, aVar2, lVar3, bVar, iVar, ((i11 << 3) & 896) | ((i11 << 3) & 7168) | (458752 & (i11 << 6)) | ((i11 << 6) & 3670016));
            f.a aVar3 = x0.f.f59359u;
            x0.f n10 = d1.n(aVar3, 0.0f, 1, null);
            io.a<wn.v> aVar4 = this.F;
            iVar.x(733328855);
            a.C0986a c0986a = x0.a.f59327a;
            c0 h11 = y.j.h(c0986a.o(), false, iVar, 0);
            iVar.x(-1323940314);
            m2.d dVar = (m2.d) iVar.G(o0.e());
            m2.q qVar = (m2.q) iVar.G(o0.j());
            g2 g2Var = (g2) iVar.G(o0.n());
            a.C0787a c0787a = s1.a.f51802o;
            io.a<s1.a> a10 = c0787a.a();
            io.q<n1<s1.a>, l0.i, Integer, wn.v> a11 = q1.w.a(n10);
            if (!(iVar.k() instanceof l0.e)) {
                l0.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.r(a10);
            } else {
                iVar.o();
            }
            iVar.E();
            l0.i a12 = h2.a(iVar);
            h2.b(a12, h11, c0787a.d());
            h2.b(a12, dVar, c0787a.b());
            h2.b(a12, qVar, c0787a.c());
            h2.b(a12, g2Var, c0787a.f());
            iVar.c();
            a11.s0(n1.a(n1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(-2137368960);
            y.l lVar4 = y.l.f60836a;
            iVar.x(1157296644);
            boolean P = iVar.P(aVar4);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new c(aVar4);
                iVar.q(y10);
            }
            iVar.O();
            h0.o0.a(y10, lVar4.a(aVar3, c0986a.n()), false, null, oa.a.f44312a.a(), iVar, 24576, 12);
            iVar.O();
            iVar.O();
            iVar.s();
            iVar.O();
            iVar.O();
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public final /* synthetic */ io.l<g, wn.v> A;
        public final /* synthetic */ io.a<wn.v> B;
        public final /* synthetic */ int C;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f44401w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44402x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f44403y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44404z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, io.l<? super g, wn.v> lVar3, io.a<wn.v> aVar2, int i10) {
            super(2);
            this.f44401w = str;
            this.f44402x = lVar;
            this.f44403y = lVar2;
            this.f44404z = aVar;
            this.A = lVar3;
            this.B = aVar2;
            this.C = i10;
        }

        public final void a(l0.i iVar, int i10) {
            j.a(this.f44401w, this.f44402x, this.f44403y, this.f44404z, this.A, this.B, iVar, this.C | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(String str, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar, io.l<? super g, wn.v> lVar3, io.a<wn.v> aVar2, l0.i iVar, int i10) {
        int i11;
        l0.i iVar2;
        jo.p.h(lVar, "onClickProfile");
        jo.p.h(lVar2, "onClickLive");
        jo.p.h(aVar, "onClickDailyRankingYesterday");
        jo.p.h(lVar3, "onClickDailyRankingRule");
        jo.p.h(aVar2, "onClose");
        l0.i h10 = iVar.h(-816490211);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(lVar2) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= h10.P(aVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= h10.P(lVar3) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= h10.P(aVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i12 = i11;
        if ((374491 & i12) == 74898 && h10.j()) {
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
                y10 = new s0(f0.b(n.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            n nVar = (n) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(oa.e.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            oa.e eVar = (oa.e) y11;
            l0.c0.c(wn.v.f59242a, new c(eVar, "live_game.daily_ranking", str, null), h10, 64);
            iVar2 = h10;
            h0.g.a(d1.l(x0.f.f59359u, 0.0f, 1, null), null, 0L, 0L, null, 0.0f, s0.c.b(iVar2, -337557222, true, new d(nVar, lVar, lVar2, aVar, lVar3, i12, eVar, "live_game.daily_ranking", str, aVar2)), iVar2, 1572870, 62);
        }
        l1 l10 = iVar2.l();
        if (l10 == null) {
            return;
        }
        l10.a(new e(str, lVar, lVar2, aVar, lVar3, aVar2, i10));
    }
}
