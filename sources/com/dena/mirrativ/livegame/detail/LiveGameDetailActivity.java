package com.dena.mirrativ.livegame.detail;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bumptech.glide.load.engine.GlideException;
import com.dena.mirrativ.livegame.detail.LiveGameDetailActivity;
import com.dena.mirrativ.livegame.webview.LiveGameWebViewActivity;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import hf.d0;
import hf.v0;
import ie.f;
import ie.i;
import ie.j;
import java.util.UUID;
import jf.b0;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.f1;
import nd.i1;
import nd.w0;
import p.d;
import uo.q0;
import wb.a;
import yd.g1;
import yd.t1;

/* loaded from: classes.dex */
public final class LiveGameDetailActivity extends e.b implements f.b, ie.j, q0 {

    /* renamed from: e0  reason: collision with root package name */
    public static final a f21465e0 = new a(null);

    /* renamed from: f0  reason: collision with root package name */
    public static final int f21466f0 = 8;

    /* renamed from: g0  reason: collision with root package name */
    public static final String f21467g0;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = wn.g.a(new b());
    public final wn.f Q = new s0(f0.b(la.g.class), new z(this), new y(new x(this), null, a0.f21472w, gq.a.a(this)));
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21468a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f21469b0;

    /* renamed from: c0  reason: collision with root package name */
    public ka.c f21470c0;

    /* renamed from: d0  reason: collision with root package name */
    public final String f21471d0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, na.d dVar) {
            jo.p.h(context, "context");
            jo.p.h(dVar, "bindModel");
            Intent intent = new Intent(context, LiveGameDetailActivity.class);
            intent.putExtra("EXTRA_BIND_MODEL", dVar);
            return intent;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.a<uq.a> {

        /* renamed from: w  reason: collision with root package name */
        public static final a0 f21472w = new a0();

        public a0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(LiveGameDetailActivity.f21467g0);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<na.d> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final na.d invoke() {
            Parcelable parcelableExtra = LiveGameDetailActivity.this.getIntent().getParcelableExtra("EXTRA_BIND_MODEL");
            jo.p.e(parcelableExtra);
            return (na.d) parcelableExtra;
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.detail.LiveGameDetailActivity$observeStoreValues$2", f = "LiveGameDetailActivity.kt", l = {286}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21474w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDetailActivity f21476w;

            public a(LiveGameDetailActivity liveGameDetailActivity) {
                this.f21476w = liveGameDetailActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                pe.b.f47398a1.a(this.f21476w.f21471d0, false, true).z3(this.f21476w.a3(), "RegistrationDialog");
                return wn.v.f59242a;
            }
        }

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21474w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r<wn.v> k10 = LiveGameDetailActivity.this.V3().k();
                a aVar = new a(LiveGameDetailActivity.this);
                this.f21474w = 1;
                if (k10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.detail.LiveGameDetailActivity$observeStoreValues$3", f = "LiveGameDetailActivity.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21477w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<LiveGameStartResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDetailActivity f21479w;

            public a(LiveGameDetailActivity liveGameDetailActivity) {
                this.f21479w = liveGameDetailActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(LiveGameStartResponse liveGameStartResponse, ao.d<? super wn.v> dVar) {
                String c10 = this.f21479w.U3().a().c() ? this.f21479w.R3().c() : null;
                if (this.f21479w.W3().a(liveGameStartResponse.getLaunchUrl()) instanceof b0.l) {
                    LiveGameDetailActivity liveGameDetailActivity = this.f21479w;
                    tb.c Q3 = liveGameDetailActivity.Q3();
                    LiveGameDetailActivity liveGameDetailActivity2 = this.f21479w;
                    liveGameDetailActivity.startActivity(Q3.Q(liveGameDetailActivity2, liveGameDetailActivity2.U3().a().c() ? this.f21479w.R3().c() : null, liveGameStartResponse.getPlayId()));
                } else {
                    LiveGameDetailActivity liveGameDetailActivity3 = this.f21479w;
                    LiveGameWebViewActivity.a aVar = LiveGameWebViewActivity.f21544b0;
                    Context applicationContext = liveGameDetailActivity3.getApplicationContext();
                    jo.p.g(applicationContext, "applicationContext");
                    liveGameDetailActivity3.startActivity(aVar.a(applicationContext, this.f21479w.f21471d0, liveGameStartResponse.getLiveGameId(), liveGameStartResponse.getLaunchUrl(), liveGameStartResponse.getPlayId(), liveGameStartResponse.isLandscape(), c10));
                }
                this.f21479w.finish();
                return wn.v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21477w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<LiveGameStartResponse> j10 = LiveGameDetailActivity.this.V3().j();
                a aVar = new a(LiveGameDetailActivity.this);
                this.f21477w = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.livegame.detail.LiveGameDetailActivity$observeStoreValues$4", f = "LiveGameDetailActivity.kt", l = {322}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21480w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveGameDetailActivity f21482w;

            public a(LiveGameDetailActivity liveGameDetailActivity) {
                this.f21482w = liveGameDetailActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                LiveGameDetailActivity liveGameDetailActivity = this.f21482w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f21482w.getString(f1.f41966c);
                    jo.p.g(message, "getString(com.dena.mirro…an.R.string.error_access)");
                }
                aVar.a(liveGameDetailActivity, message);
                return wn.v.f59242a;
            }
        }

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21480w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> i11 = LiveGameDetailActivity.this.V3().i();
                a aVar = new a(LiveGameDetailActivity.this);
                this.f21480w = 1;
                if (i11.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.p<l0.i, Integer, wn.v> {
        public f() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                la.f.a(LiveGameDetailActivity.this.M3(), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements e8.g<Drawable> {
        public g() {
        }

        @Override // e8.g
        public boolean a(GlideException glideException, Object obj, f8.j<Drawable> jVar, boolean z10) {
            return false;
        }

        @Override // e8.g
        /* renamed from: b */
        public boolean h(Drawable drawable, Object obj, f8.j<Drawable> jVar, m7.a aVar, boolean z10) {
            ka.c cVar = LiveGameDetailActivity.this.f21470c0;
            if (cVar == null) {
                jo.p.v("binding");
                cVar = null;
            }
            cVar.M.setVisibility(0);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements e8.g<Drawable> {
        public h() {
        }

        @Override // e8.g
        public boolean a(GlideException glideException, Object obj, f8.j<Drawable> jVar, boolean z10) {
            return false;
        }

        @Override // e8.g
        /* renamed from: b */
        public boolean h(Drawable drawable, Object obj, f8.j<Drawable> jVar, m7.a aVar, boolean z10) {
            ka.c cVar = LiveGameDetailActivity.this.f21470c0;
            if (cVar == null) {
                jo.p.v("binding");
                cVar = null;
            }
            cVar.L.setVisibility(0);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l<View, wn.v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            LiveGameDetailActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {
        public j() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ka.c cVar = LiveGameDetailActivity.this.f21470c0;
            if (cVar == null) {
                jo.p.v("binding");
                cVar = null;
            }
            if (cVar.Z.getAlpha() < 0.5d) {
                return;
            }
            LiveGameDetailActivity.this.c4();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<View, wn.v> {
        public k() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            LiveGameDetailActivity.this.c4();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<View, wn.v> {
        public l() {
            super(1);
        }

        public final void a(View view) {
            ie.i a10;
            jo.p.h(view, "it");
            if (LiveGameDetailActivity.this.N3().j()) {
                i.a aVar = ie.i.U0;
                LiveGameDetailActivity liveGameDetailActivity = LiveGameDetailActivity.this;
                String string = liveGameDetailActivity.getString(ja.n.text_live_game_inquiry_confirm_title, new Object[]{liveGameDetailActivity.M3().l()});
                jo.p.g(string, "getString(R.string.text_…m_title, bindModel.title)");
                LiveGameDetailActivity liveGameDetailActivity2 = LiveGameDetailActivity.this;
                String string2 = liveGameDetailActivity2.getString(ja.n.text_live_game_inquiry_confirm_message, new Object[]{liveGameDetailActivity2.M3().k()});
                String string3 = LiveGameDetailActivity.this.getString(ja.n.text_live_game_inquiry_action);
                jo.p.g(string3, "getString(R.string.text_live_game_inquiry_action)");
                a10 = aVar.a(string, (r16 & 2) != 0 ? null : string2, (r16 & 4) != 0 ? w0.f42236l : 0, string3, (r16 & 16) != 0 ? w0.f42242u0 : 0, (r16 & 32) != 0 ? null : LiveGameDetailActivity.this.getString(ja.n.f37438b));
                a10.z3(LiveGameDetailActivity.this.a3(), "SimpleYesOrNoDialog");
                return;
            }
            f.a aVar2 = ie.f.V0;
            String string4 = LiveGameDetailActivity.this.getString(f1.Q3);
            jo.p.g(string4, "getString(com.dena.mirro…pdate_due_to_app_version)");
            f.a.b(aVar2, string4, LiveGameDetailActivity.this.getString(f1.f41996w5), LiveGameDetailActivity.this.getString(f1.f41995w0), null, false, 24, null).z3(LiveGameDetailActivity.this.a3(), "CustomYesNoDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21490w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21491x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21492y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21490w = componentCallbacks;
            this.f21491x = aVar;
            this.f21492y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f21490w;
            return gq.a.a(componentCallbacks).c(f0.b(ServerConfig.class), this.f21491x, this.f21492y);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21493w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21494x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21495y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21493w = componentCallbacks;
            this.f21494x = aVar;
            this.f21495y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21493w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f21494x, this.f21495y);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21496w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21497x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21498y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21496w = componentCallbacks;
            this.f21497x = aVar;
            this.f21498y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21496w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f21497x, this.f21498y);
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21499w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21500x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21501y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21499w = componentCallbacks;
            this.f21500x = aVar;
            this.f21501y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f21499w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f21500x, this.f21501y);
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21502w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21503x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21504y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21502w = componentCallbacks;
            this.f21503x = aVar;
            this.f21504y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21502w;
            return gq.a.a(componentCallbacks).c(f0.b(d0.class), this.f21503x, this.f21504y);
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21505w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21506x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21507y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21505w = componentCallbacks;
            this.f21506x = aVar;
            this.f21507y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f21505w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f21506x, this.f21507y);
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21508w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21509x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21510y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21508w = componentCallbacks;
            this.f21509x = aVar;
            this.f21510y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f21508w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f21509x, this.f21510y);
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21511w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21512x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21513y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21511w = componentCallbacks;
            this.f21512x = aVar;
            this.f21513y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21511w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f21512x, this.f21513y);
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.a<la.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21514w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21515x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21516y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21514w = componentCallbacks;
            this.f21515x = aVar;
            this.f21516y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, la.a] */
        @Override // io.a
        public final la.a invoke() {
            ComponentCallbacks componentCallbacks = this.f21514w;
            return gq.a.a(componentCallbacks).c(f0.b(la.a.class), this.f21515x, this.f21516y);
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21517w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21518x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21519y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21517w = componentCallbacks;
            this.f21518x = aVar;
            this.f21519y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21517w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.k.class), this.f21518x, this.f21519y);
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21520w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21521x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21522y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21520w = componentCallbacks;
            this.f21521x = aVar;
            this.f21522y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21520w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f21521x, this.f21522y);
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21523w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
            super(0);
            this.f21523w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21523w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21524w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21525x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21526y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21527z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21524w = aVar;
            this.f21525x = aVar2;
            this.f21526y = aVar3;
            this.f21527z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21524w;
            vq.a aVar2 = this.f21525x;
            io.a aVar3 = this.f21526y;
            xq.a aVar4 = this.f21527z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(la.g.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21528w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f21528w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21528w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    static {
        String uuid = UUID.randomUUID().toString();
        jo.p.g(uuid, "randomUUID().toString()");
        f21467g0 = uuid;
    }

    public LiveGameDetailActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new o(this, null, null));
        this.S = wn.g.b(iVar, new p(this, null, null));
        this.T = wn.g.b(iVar, new q(this, null, null));
        this.U = wn.g.b(iVar, new r(this, null, null));
        this.V = wn.g.b(iVar, new s(this, null, null));
        this.W = wn.g.b(iVar, new t(this, null, null));
        this.X = wn.g.b(iVar, new u(this, null, null));
        this.Y = wn.g.b(iVar, new v(this, null, null));
        this.Z = wn.g.b(iVar, new w(this, null, null));
        this.f21468a0 = wn.g.b(iVar, new m(this, null, null));
        this.f21469b0 = wn.g.b(iVar, new n(this, null, null));
        this.f21471d0 = "live_game.catalog";
    }

    public static final void Z3(LiveGameDetailActivity liveGameDetailActivity, Boolean bool) {
        jo.p.h(liveGameDetailActivity, "this$0");
        ka.c cVar = liveGameDetailActivity.f21470c0;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        ConstraintLayout constraintLayout = cVar.K;
        jo.p.g(bool, "it");
        constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void a4(LiveGameDetailActivity liveGameDetailActivity, AppBarLayout appBarLayout, int i10) {
        jo.p.h(liveGameDetailActivity, "this$0");
        ka.c cVar = liveGameDetailActivity.f21470c0;
        ka.c cVar2 = null;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        Toolbar toolbar = cVar.Z;
        float f10 = i10;
        float abs = Math.abs(f10);
        ka.c cVar3 = liveGameDetailActivity.f21470c0;
        if (cVar3 == null) {
            jo.p.v("binding");
            cVar3 = null;
        }
        toolbar.setAlpha(abs / cVar3.B.getTotalScrollRange());
        ka.c cVar4 = liveGameDetailActivity.f21470c0;
        if (cVar4 == null) {
            jo.p.v("binding");
            cVar4 = null;
        }
        View view = cVar4.E;
        boolean z10 = true;
        float f11 = 1;
        float abs2 = Math.abs(f10);
        ka.c cVar5 = liveGameDetailActivity.f21470c0;
        if (cVar5 == null) {
            jo.p.v("binding");
            cVar5 = null;
        }
        view.setAlpha(f11 - (abs2 / cVar5.B.getTotalScrollRange()));
        ka.c cVar6 = liveGameDetailActivity.f21470c0;
        if (cVar6 == null) {
            jo.p.v("binding");
            cVar6 = null;
        }
        ViewGroup.LayoutParams layoutParams = cVar6.K.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar != null) {
            fVar.setMargins(0, appBarLayout.getHeight() + i10, 0, 0);
            ka.c cVar7 = liveGameDetailActivity.f21470c0;
            if (cVar7 == null) {
                jo.p.v("binding");
                cVar7 = null;
            }
            cVar7.K.setLayoutParams(fVar);
        }
        ka.c cVar8 = liveGameDetailActivity.f21470c0;
        if (cVar8 == null) {
            jo.p.v("binding");
        } else {
            cVar2 = cVar8;
        }
        SwipeRefreshLayout swipeRefreshLayout = cVar2.Y;
        if (i10 != 0 || Build.VERSION.SDK_INT < 29) {
            z10 = false;
        }
        swipeRefreshLayout.setEnabled(z10);
    }

    public static final void b4(LiveGameDetailActivity liveGameDetailActivity) {
        jo.p.h(liveGameDetailActivity, "this$0");
        ka.c cVar = liveGameDetailActivity.f21470c0;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        cVar.Y.setRefreshing(false);
        tb.b a10 = liveGameDetailActivity.Q3().a(f21467g0, liveGameDetailActivity.f21471d0, new a.d(liveGameDetailActivity.f21471d0, liveGameDetailActivity.M3().f(), null, 4, null));
        liveGameDetailActivity.a3().k().s(ja.l.catalog_layout, a10.a(), a10.b()).i();
    }

    @Override // ie.j
    public void L1(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "SimpleYesOrNoDialog")) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{M3().j()});
            intent.putExtra("android.intent.extra.SUBJECT", getString(ja.n.text_live_game_inquiry_mail_title, new Object[]{M3().k()}));
            intent.putExtra("android.intent.extra.TEXT", getString(f1.M2, new Object[]{X3().x(), BuildConfig.VERSION_NAME, Build.MODEL, Build.VERSION.RELEASE}));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }

    public final la.a L3() {
        return (la.a) this.X.getValue();
    }

    public final na.d M3() {
        return (na.d) this.P.getValue();
    }

    public final nf.k N3() {
        return (nf.k) this.Y.getValue();
    }

    public final od.p O3() {
        return (od.p) this.V.getValue();
    }

    public final nf.o P3() {
        return (nf.o) this.U.getValue();
    }

    public final tb.c Q3() {
        return (tb.c) this.R.getValue();
    }

    public final d0 R3() {
        return (d0) this.T.getValue();
    }

    public final MRLogger S3() {
        return (MRLogger) this.f21469b0.getValue();
    }

    public final ServerConfig T3() {
        return (ServerConfig) this.f21468a0.getValue();
    }

    public final i1 U3() {
        return (i1) this.S.getValue();
    }

    public final la.g V3() {
        return (la.g) this.Q.getValue();
    }

    public final of.k W3() {
        return (of.k) this.W.getValue();
    }

    public final v0 X3() {
        return (v0) this.Z.getValue();
    }

    public final void Y3() {
        V3().l().i(this, new androidx.lifecycle.f0() { // from class: la.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveGameDetailActivity.Z3(LiveGameDetailActivity.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "CustomYesNoDialog")) {
            new d.a().a().a(this, Uri.parse(ApiUtil.INSTANCE.urlForceUpdate(T3())));
        }
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    public final void c4() {
        if (jo.p.c(P3().H().f(), Boolean.TRUE)) {
            O3().A();
        }
        L3().d(this.f21471d0, M3().f(), U3().a().c() ? R3().c() : null);
        hf.b.f35490a.k();
        FirebaseAnalytics.getInstance(getApplicationContext()).a("Listing_Game_Start", null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // ie.j
    public void k(String str) {
        j.a.a(this, str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MRLogger S3 = S3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_DETAIL_IMP);
        wn.v vVar = wn.v.f59242a;
        S3.sendLog(builder.build());
        ViewDataBinding g10 = androidx.databinding.f.g(this, ja.m.activity_live_game_catalog);
        jo.p.g(g10, "setContentView(this, R.l…tivity_live_game_catalog)");
        ka.c cVar = (ka.c) g10;
        this.f21470c0 = cVar;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        cVar.R.setText(M3().l());
        ka.c cVar2 = this.f21470c0;
        if (cVar2 == null) {
            jo.p.v("binding");
            cVar2 = null;
        }
        cVar2.N.setText(M3().d());
        ka.c cVar3 = this.f21470c0;
        if (cVar3 == null) {
            jo.p.v("binding");
            cVar3 = null;
        }
        GlideRequest<Drawable> load = GlideApp.with(cVar3.f38503a0).load(M3().e());
        int i10 = ja.k.ic_live_game_default;
        GlideRequest<Drawable> apply = load.placeholder(i10).apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new v7.y(de.a.b(this, 4)))));
        ka.c cVar4 = this.f21470c0;
        if (cVar4 == null) {
            jo.p.v("binding");
            cVar4 = null;
        }
        apply.into(cVar4.f38503a0);
        ka.c cVar5 = this.f21470c0;
        if (cVar5 == null) {
            jo.p.v("binding");
            cVar5 = null;
        }
        GlideRequest<Drawable> placeholder = GlideApp.with(cVar5.P).load(M3().e()).placeholder(i10);
        m7.l[] lVarArr = new m7.l[2];
        lVarArr[0] = new v7.i();
        ka.c cVar6 = this.f21470c0;
        if (cVar6 == null) {
            jo.p.v("binding");
            cVar6 = null;
        }
        AppCompatImageView appCompatImageView = cVar6.P;
        jo.p.g(appCompatImageView, "binding.liveGameIconImageView");
        int b10 = de.n.b(appCompatImageView, 24);
        ka.c cVar7 = this.f21470c0;
        if (cVar7 == null) {
            jo.p.v("binding");
            cVar7 = null;
        }
        AppCompatImageView appCompatImageView2 = cVar7.P;
        jo.p.g(appCompatImageView2, "binding.liveGameIconImageView");
        int b11 = de.n.b(appCompatImageView2, 2);
        ka.c cVar8 = this.f21470c0;
        if (cVar8 == null) {
            jo.p.v("binding");
            cVar8 = null;
        }
        lVarArr[1] = new xd.d(b10, b11, c3.a.d(cVar8.P.getContext(), ja.j.f37423v));
        GlideRequest<Drawable> apply2 = placeholder.apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(lVarArr)));
        ka.c cVar9 = this.f21470c0;
        if (cVar9 == null) {
            jo.p.v("binding");
            cVar9 = null;
        }
        apply2.into(cVar9.P);
        ka.c cVar10 = this.f21470c0;
        if (cVar10 == null) {
            jo.p.v("binding");
            cVar10 = null;
        }
        cVar10.B.b(new AppBarLayout.e() { // from class: la.e
            @Override // com.google.android.material.appbar.AppBarLayout.c
            public final void a(AppBarLayout appBarLayout, int i11) {
                LiveGameDetailActivity.a4(LiveGameDetailActivity.this, appBarLayout, i11);
            }
        });
        ka.c cVar11 = this.f21470c0;
        if (cVar11 == null) {
            jo.p.v("binding");
            cVar11 = null;
        }
        cVar11.M.setVisibility(4);
        ka.c cVar12 = this.f21470c0;
        if (cVar12 == null) {
            jo.p.v("binding");
            cVar12 = null;
        }
        cVar12.L.setVisibility(4);
        ka.c cVar13 = this.f21470c0;
        if (cVar13 == null) {
            jo.p.v("binding");
            cVar13 = null;
        }
        ComposeView composeView = cVar13.S;
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-1805567137, true, new f()));
        ka.c cVar14 = this.f21470c0;
        if (cVar14 == null) {
            jo.p.v("binding");
            cVar14 = null;
        }
        cVar14.Y.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: la.d
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                LiveGameDetailActivity.b4(LiveGameDetailActivity.this);
            }
        });
        if (M3().n()) {
            ka.c cVar15 = this.f21470c0;
            if (cVar15 == null) {
                jo.p.v("binding");
                cVar15 = null;
            }
            cVar15.f38504b0.setVisibility(0);
            ka.c cVar16 = this.f21470c0;
            if (cVar16 == null) {
                jo.p.v("binding");
                cVar16 = null;
            }
            cVar16.D.setVisibility(8);
            ka.c cVar17 = this.f21470c0;
            if (cVar17 == null) {
                jo.p.v("binding");
                cVar17 = null;
            }
            cVar17.X.setEnabled(true);
            ka.c cVar18 = this.f21470c0;
            if (cVar18 == null) {
                jo.p.v("binding");
                cVar18 = null;
            }
            cVar18.X.setBackgroundGradientStartColor(ja.j.game_color_purple_start);
            ka.c cVar19 = this.f21470c0;
            if (cVar19 == null) {
                jo.p.v("binding");
                cVar19 = null;
            }
            cVar19.X.setBackgroundGradientEndColor(ja.j.game_color_purple_end);
        } else {
            ka.c cVar20 = this.f21470c0;
            if (cVar20 == null) {
                jo.p.v("binding");
                cVar20 = null;
            }
            cVar20.D.setVisibility(0);
            ka.c cVar21 = this.f21470c0;
            if (cVar21 == null) {
                jo.p.v("binding");
                cVar21 = null;
            }
            cVar21.f38504b0.setVisibility(8);
            ka.c cVar22 = this.f21470c0;
            if (cVar22 == null) {
                jo.p.v("binding");
                cVar22 = null;
            }
            cVar22.X.setEnabled(false);
            ka.c cVar23 = this.f21470c0;
            if (cVar23 == null) {
                jo.p.v("binding");
                cVar23 = null;
            }
            RoundedButtonView roundedButtonView = cVar23.X;
            int i11 = ja.j.f37419q;
            roundedButtonView.setBackgroundGradientStartColor(i11);
            ka.c cVar24 = this.f21470c0;
            if (cVar24 == null) {
                jo.p.v("binding");
                cVar24 = null;
            }
            cVar24.X.setBackgroundGradientEndColor(i11);
        }
        ka.c cVar25 = this.f21470c0;
        if (cVar25 == null) {
            jo.p.v("binding");
            cVar25 = null;
        }
        GlideRequest<Drawable> listener = GlideApp.with(cVar25.M).load(M3().b()).listener((e8.g<Drawable>) new g());
        ka.c cVar26 = this.f21470c0;
        if (cVar26 == null) {
            jo.p.v("binding");
            cVar26 = null;
        }
        listener.into(cVar26.M);
        ka.c cVar27 = this.f21470c0;
        if (cVar27 == null) {
            jo.p.v("binding");
            cVar27 = null;
        }
        GlideRequest<Drawable> listener2 = GlideApp.with(cVar27.L).load(M3().a()).listener((e8.g<Drawable>) new h());
        ka.c cVar28 = this.f21470c0;
        if (cVar28 == null) {
            jo.p.v("binding");
            cVar28 = null;
        }
        listener2.into(cVar28.L);
        if (M3().o()) {
            ka.c cVar29 = this.f21470c0;
            if (cVar29 == null) {
                jo.p.v("binding");
                cVar29 = null;
            }
            cVar29.W.setText(getResources().getString(ja.n.text_live_game_inquiry_provider, M3().k()));
            ka.c cVar30 = this.f21470c0;
            if (cVar30 == null) {
                jo.p.v("binding");
                cVar30 = null;
            }
            cVar30.W.setVisibility(0);
            ka.c cVar31 = this.f21470c0;
            if (cVar31 == null) {
                jo.p.v("binding");
                cVar31 = null;
            }
            cVar31.V.setVisibility(0);
        } else {
            ka.c cVar32 = this.f21470c0;
            if (cVar32 == null) {
                jo.p.v("binding");
                cVar32 = null;
            }
            cVar32.W.setVisibility(8);
            ka.c cVar33 = this.f21470c0;
            if (cVar33 == null) {
                jo.p.v("binding");
                cVar33 = null;
            }
            cVar33.V.setVisibility(8);
        }
        ka.c cVar34 = this.f21470c0;
        if (cVar34 == null) {
            jo.p.v("binding");
            cVar34 = null;
        }
        ConstraintLayout constraintLayout = cVar34.G;
        jo.p.g(constraintLayout, "binding.closeButtonLayout");
        g1.a(constraintLayout, new i());
        ka.c cVar35 = this.f21470c0;
        if (cVar35 == null) {
            jo.p.v("binding");
            cVar35 = null;
        }
        RoundedButtonView roundedButtonView2 = cVar35.f38504b0;
        jo.p.g(roundedButtonView2, "binding.toolbarStartLiveGameButton");
        g1.a(roundedButtonView2, new j());
        ka.c cVar36 = this.f21470c0;
        if (cVar36 == null) {
            jo.p.v("binding");
            cVar36 = null;
        }
        RoundedButtonView roundedButtonView3 = cVar36.X;
        jo.p.g(roundedButtonView3, "binding.startLiveGameButton");
        g1.a(roundedButtonView3, new k());
        ka.c cVar37 = this.f21470c0;
        if (cVar37 == null) {
            jo.p.v("binding");
            cVar37 = null;
        }
        AppCompatTextView appCompatTextView = cVar37.V;
        jo.p.g(appCompatTextView, "binding.providerLinkTextView");
        g1.a(appCompatTextView, new l());
        if (bundle == null) {
            FragmentManager a32 = a3();
            jo.p.g(a32, "supportFragmentManager");
            androidx.fragment.app.z k10 = a32.k();
            jo.p.g(k10, "fragmentManager.beginTransaction()");
            k10.g(null);
            tb.b a10 = Q3().a(f21467g0, this.f21471d0, new a.d(this.f21471d0, M3().f(), null, 4, null));
            k10.s(ja.l.catalog_layout, a10.a(), a10.b());
            k10.i();
        }
        Y3();
    }
}
