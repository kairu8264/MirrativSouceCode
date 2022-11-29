package ja;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.dena.mirrativ.livegame.detail.LiveGameDetailActivity;
import com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import hf.d0;
import hf.v0;
import io.p;
import jf.b0;
import jo.f0;
import jo.q;
import nd.f1;
import nd.i1;
import oa.u;
import tb.c;
import wn.v;
import yd.t1;

/* loaded from: classes.dex */
public final class c extends Fragment {
    public static final a I0 = new a(null);
    public static final int J0 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final String G0;
    public final wn.f H0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f37275x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f37276y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f37277z0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(boolean z10) {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_TAB_RESTORE_ENABLED", z10);
            cVar.V2(bundle);
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            Bundle n02 = c.this.n0();
            return Boolean.valueOf(n02 != null ? n02.getBoolean("EXTRA_TAB_RESTORE_ENABLED", true) : false);
        }
    }

    /* renamed from: ja.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0497c extends q implements p<l0.i, Integer, v> {

        /* renamed from: ja.c$c$a */
        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37280w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(0);
                this.f37280w = cVar;
            }

            public final void a() {
                pe.b.f47398a1.a(this.f37280w.G0, false, true).z3(this.f37280w.p0(), "RegistrationDialog");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$b */
        /* loaded from: classes.dex */
        public static final class b extends q implements io.l<LiveGameStartResponse, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37281w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar) {
                super(1);
                this.f37281w = cVar;
            }

            public final void a(LiveGameStartResponse liveGameStartResponse) {
                jo.p.h(liveGameStartResponse, "liveGameStartResponse");
                String c10 = this.f37281w.z3().a().c() ? this.f37281w.x3().c() : null;
                if (this.f37281w.A3().a(liveGameStartResponse.getLaunchUrl()) instanceof b0.l) {
                    c cVar = this.f37281w;
                    tb.c w32 = cVar.w3();
                    Context N2 = this.f37281w.N2();
                    jo.p.g(N2, "requireContext()");
                    Intent Q = w32.Q(N2, this.f37281w.z3().a().c() ? this.f37281w.x3().c() : null, liveGameStartResponse.getPlayId());
                    Q.addFlags(67108864);
                    cVar.f3(Q);
                    return;
                }
                c cVar2 = this.f37281w;
                LiveGameWebViewActivity.a aVar = LiveGameWebViewActivity.f21544b0;
                Context N22 = cVar2.N2();
                jo.p.g(N22, "requireContext()");
                Intent a10 = aVar.a(N22, this.f37281w.G0, liveGameStartResponse.getLiveGameId(), liveGameStartResponse.getLaunchUrl(), liveGameStartResponse.getPlayId(), liveGameStartResponse.isLandscape(), c10);
                a10.addFlags(67108864);
                cVar2.f3(a10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(LiveGameStartResponse liveGameStartResponse) {
                a(liveGameStartResponse);
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0498c extends q implements io.l<MRError, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37282w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0498c(c cVar) {
                super(1);
                this.f37282w = cVar;
            }

            public final void a(MRError mRError) {
                jo.p.h(mRError, "it");
                t1.a aVar = t1.f61795x;
                Context N2 = this.f37282w.N2();
                jo.p.g(N2, "requireContext()");
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f37282w.U0(f1.f41966c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                aVar.a(N2, message);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(MRError mRError) {
                a(mRError);
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$d */
        /* loaded from: classes.dex */
        public static final class d extends q implements io.l<na.d, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37283w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(c cVar) {
                super(1);
                this.f37283w = cVar;
            }

            public final void a(na.d dVar) {
                jo.p.h(dVar, "bindModel");
                c cVar = this.f37283w;
                LiveGameDetailActivity.a aVar = LiveGameDetailActivity.f21465e0;
                Context N2 = cVar.N2();
                jo.p.g(N2, "requireContext()");
                Intent a10 = aVar.a(N2, dVar);
                a10.addFlags(67108864);
                cVar.f3(a10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(na.d dVar) {
                a(dVar);
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$e */
        /* loaded from: classes.dex */
        public static final class e extends q implements io.l<na.d, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37284w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(c cVar) {
                super(1);
                this.f37284w = cVar;
            }

            public final void a(na.d dVar) {
                jo.p.h(dVar, "bindModel");
                if (jo.p.c(this.f37284w.v3().H().f(), Boolean.TRUE)) {
                    this.f37284w.u3().A();
                }
                this.f37284w.t3().g(this.f37284w.G0, dVar.f(), this.f37284w.z3().a().c() ? this.f37284w.x3().c() : null);
                hf.b.f35490a.k();
                FirebaseAnalytics.getInstance(this.f37284w.N2()).a("Listing_Game_Start", null);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(na.d dVar) {
                a(dVar);
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$f */
        /* loaded from: classes.dex */
        public static final class f extends q implements io.l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37285w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(c cVar) {
                super(1);
                this.f37285w = cVar;
            }

            public final void a(String str) {
                jo.p.h(str, "userId");
                if (jo.p.c(this.f37285w.B3().x(), str)) {
                    c cVar = this.f37285w;
                    tb.c w32 = cVar.w3();
                    Context N2 = this.f37285w.N2();
                    jo.p.g(N2, "requireContext()");
                    cVar.f3(w32.z0(N2));
                    return;
                }
                c cVar2 = this.f37285w;
                tb.c w33 = cVar2.w3();
                Context N22 = this.f37285w.N2();
                jo.p.g(N22, "requireContext()");
                cVar2.f3(w33.s(N22, str, this.f37285w.G0));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$g */
        /* loaded from: classes.dex */
        public static final class g extends q implements io.l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37286w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(c cVar) {
                super(1);
                this.f37286w = cVar;
            }

            public final void a(String str) {
                jo.p.h(str, "liveId");
                if (str.length() == 0) {
                    return;
                }
                tb.c w32 = this.f37286w.w3();
                Context N2 = this.f37286w.N2();
                jo.p.g(N2, "requireContext()");
                Intent f10 = c.a.f(w32, N2, str, this.f37286w.G0, null, null, false, false, false, false, null, 960, null);
                c cVar = this.f37286w;
                f10.addFlags(67108864);
                cVar.f3(f10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$h */
        /* loaded from: classes.dex */
        public static final class h extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37287w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(c cVar) {
                super(0);
                this.f37287w = cVar;
            }

            public final void a() {
                u.R0.a(this.f37287w.G0).z3(this.f37287w.p0(), "LiveGameDailyRankingYesterdayDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: ja.c$c$i */
        /* loaded from: classes.dex */
        public static final class i extends q implements io.l<oa.g, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f37288w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(c cVar) {
                super(1);
                this.f37288w = cVar;
            }

            public final void a(oa.g gVar) {
                jo.p.h(gVar, "bindModel");
                oa.k.P0.a(this.f37288w.G0, gVar.j()).z3(this.f37288w.p0(), "LiveGameDailyRankingRuleDialogFragment");
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(oa.g gVar) {
                a(gVar);
                return v.f59242a;
            }
        }

        public C0497c() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                ja.h.b(c.this.C3(), new a(c.this), new b(c.this), new C0498c(c.this), new d(c.this), new e(c.this), new f(c.this), new g(c.this), new h(c.this), new i(c.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<na.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37289w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37290x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37291y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37289w = componentCallbacks;
            this.f37290x = aVar;
            this.f37291y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [na.a, java.lang.Object] */
        @Override // io.a
        public final na.a invoke() {
            ComponentCallbacks componentCallbacks = this.f37289w;
            return gq.a.a(componentCallbacks).c(f0.b(na.a.class), this.f37290x, this.f37291y);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37292w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37293x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37294y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37292w = componentCallbacks;
            this.f37293x = aVar;
            this.f37294y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f37292w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f37293x, this.f37294y);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37295w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37296x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37297y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37295w = componentCallbacks;
            this.f37296x = aVar;
            this.f37297y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f37295w;
            return gq.a.a(componentCallbacks).c(f0.b(d0.class), this.f37296x, this.f37297y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37298w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37299x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37300y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37298w = componentCallbacks;
            this.f37299x = aVar;
            this.f37300y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f37298w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f37299x, this.f37300y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37301w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37302x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37303y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37301w = componentCallbacks;
            this.f37302x = aVar;
            this.f37303y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f37301w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f37302x, this.f37303y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37304w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37305x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37306y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37304w = componentCallbacks;
            this.f37305x = aVar;
            this.f37306y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f37304w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f37305x, this.f37306y);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37307w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37308x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37309y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37307w = componentCallbacks;
            this.f37308x = aVar;
            this.f37309y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f37307w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f37308x, this.f37309y);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37310w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37311x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37312y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37310w = componentCallbacks;
            this.f37311x = aVar;
            this.f37312y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f37310w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f37311x, this.f37312y);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37313w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37314x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37315y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37313w = componentCallbacks;
            this.f37314x = aVar;
            this.f37315y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f37313w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f37314x, this.f37315y);
        }
    }

    public c() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f37275x0 = wn.g.b(iVar, new d(this, null, null));
        this.f37276y0 = wn.g.b(iVar, new e(this, null, null));
        this.f37277z0 = wn.g.b(iVar, new f(this, null, null));
        this.A0 = wn.g.b(iVar, new g(this, null, null));
        this.B0 = wn.g.b(iVar, new h(this, null, null));
        this.C0 = wn.g.b(iVar, new i(this, null, null));
        this.D0 = wn.g.b(iVar, new j(this, null, null));
        this.E0 = wn.g.b(iVar, new k(this, null, null));
        this.F0 = wn.g.b(iVar, new l(this, null, null));
        this.G0 = "live_game.list";
        this.H0 = wn.g.a(new b());
    }

    public final of.k A3() {
        return (of.k) this.C0.getValue();
    }

    public final v0 B3() {
        return (v0) this.F0.getValue();
    }

    public final boolean C3() {
        return ((Boolean) this.H0.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        MRLogger y32 = y3();
        MRLog.Companion companion = MRLog.Companion;
        y32.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_LISTING_IMP).build());
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(236975751, true, new C0497c()));
        return composeView;
    }

    public final na.a t3() {
        return (na.a) this.f37275x0.getValue();
    }

    public final od.p u3() {
        return (od.p) this.B0.getValue();
    }

    public final nf.o v3() {
        return (nf.o) this.A0.getValue();
    }

    public final tb.c w3() {
        return (tb.c) this.D0.getValue();
    }

    public final d0 x3() {
        return (d0) this.f37277z0.getValue();
    }

    public final MRLogger y3() {
        return (MRLogger) this.E0.getValue();
    }

    public final i1 z3() {
        return (i1) this.f37276y0.getValue();
    }
}
