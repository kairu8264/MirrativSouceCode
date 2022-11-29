package com.dena.mirrativ.streaming.liveprepare.mainsettings;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.n3;
import be.o3;
import be.u2;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.streaming.CastService;
import com.dena.mirrativ.streaming.liveprepare.LivePermissionActivity;
import com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment;
import com.dena.mirrativ.streaming.liveprepare.mainsettings.LivePrepareForFriendActivity;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.feature.live.LivePrepareLiveThumbnailActivity;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.AppCampaign;
import com.dena.mirrorman.net.api.response.FavoriteLiveSetting;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;
import gf.c0;
import hf.o0;
import ie.f;
import java.util.List;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import tb.c;
import uo.b1;
import vb.m;
import yd.g1;
import yd.t1;

/* loaded from: classes2.dex */
public final class LiveMainSettingsBottomSheetDialogFragment extends com.google.android.material.bottomsheet.b implements lc.b0, vb.m, lc.l, o3, f.b, uo.q0 {
    public final /* synthetic */ da.j O0 = new da.j();
    public lc.c0 P0;
    public jc.f Q0;
    public jc.j R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final FragmentRunner V0;
    public final AutoClearedValue W0;
    public boolean X0;
    public final wn.f Y0;
    public final wn.f Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final wn.f f23830a1;

    /* renamed from: b1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f23831b1;

    /* renamed from: c1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f23832c1;

    /* renamed from: d1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f23833d1;

    /* renamed from: f1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f23828f1 = {jo.f0.d(new jo.s(LiveMainSettingsBottomSheetDialogFragment.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/BottomSheetDialogFragmentLiveMainSettingsBinding;", 0))};

    /* renamed from: e1  reason: collision with root package name */
    public static final a f23827e1 = new a(null);

    /* renamed from: g1  reason: collision with root package name */
    public static final int f23829g1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final LiveMainSettingsBottomSheetDialogFragment a() {
            return new LiveMainSettingsBottomSheetDialogFragment();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends tj.f {
        public a0() {
        }

        @Override // tj.f
        public void c(float f10, float f11, float f12, tj.m mVar) {
            jo.p.h(mVar, "shapePath");
            mVar.m(de.e.b(LiveMainSettingsBottomSheetDialogFragment.this, 48) - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 16.0f), 0.0f);
            mVar.m(de.e.b(LiveMainSettingsBottomSheetDialogFragment.this, 48) - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 11.0f), -de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 5.0f));
            mVar.m(de.e.b(LiveMainSettingsBottomSheetDialogFragment.this, 48) - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 6.0f), 0.0f);
            mVar.m(f10, 0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ sd.b f23835w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23836x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sd.b bVar, LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
            super(0);
            this.f23835w = bVar;
            this.f23836x = liveMainSettingsBottomSheetDialogFragment;
        }

        public final void a() {
            this.f23835w.z3(this.f23836x.p0(), "ProgressDialogFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends tj.f {
        public b0() {
        }

        @Override // tj.f
        public void c(float f10, float f11, float f12, tj.m mVar) {
            jo.p.h(mVar, "shapePath");
            mVar.m(de.e.b(LiveMainSettingsBottomSheetDialogFragment.this, 48) - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 16.0f), 0.0f);
            mVar.m(de.e.b(LiveMainSettingsBottomSheetDialogFragment.this, 48) - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 11.0f), -de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 5.0f));
            mVar.m(de.e.b(LiveMainSettingsBottomSheetDialogFragment.this, 48) - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 6.0f), 0.0f);
            mVar.m(f10, 0.0f);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$10", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {518}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23838w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23840w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23840w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f23840w.o4(mRError);
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23838w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<MRError> E = jVar.E();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23838w = 1;
                if (E.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class c0 extends tj.f {
        public c0() {
        }

        @Override // tj.f
        public void c(float f10, float f11, float f12, tj.m mVar) {
            jo.p.h(mVar, "shapePath");
            mVar.m(f10 - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 16.0f), 0.0f);
            mVar.m(f10 - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 11.0f), -de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 5.0f));
            mVar.m(f10 - de.e.a(LiveMainSettingsBottomSheetDialogFragment.this, 6.0f), 0.0f);
            mVar.m(f10, 0.0f);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$11", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {523}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23842w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23844w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23844w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                of.n.f45411a.B(this.f23844w.N2(), this.f23844w.U0(xb.r.text_setting_reflected), false);
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23842w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<wn.v> Z = jVar.Z();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23842w = 1;
                if (Z.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.l<View, wn.v> {
        public d0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            lc.a0.Q0.a().z3(LiveMainSettingsBottomSheetDialogFragment.this.p0(), "LiveOptionMenuBottomSheetDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$12", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {528}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23846w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23848w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23848w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                f.a aVar = ie.f.V0;
                String U0 = this.f23848w.U0(xb.r.f60085o0);
                String U02 = this.f23848w.U0(xb.r.f60088r2);
                String U03 = this.f23848w.U0(xb.r.H);
                jo.p.g(U0, "getString(R.string.text_…_to_sign_in_with_twitter)");
                aVar.a(U0, U02, U03, null, true).z3(this.f23848w.p0(), "DIALOG_TAG_TWITTER_LINK");
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23846w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<wn.v> S = jVar.S();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23846w = 1;
                if (S.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.l<View, wn.v> {
        public e0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            androidx.activity.result.c cVar = LiveMainSettingsBottomSheetDialogFragment.this.f23832c1;
            LivePermissionActivity.a aVar = LivePermissionActivity.V;
            Context N2 = LiveMainSettingsBottomSheetDialogFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            cVar.a(aVar.a(N2));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$13", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {542}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23850w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23852w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23852w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f23852w.G4();
                return wn.v.f59242a;
            }
        }

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23850w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<wn.v> Y = jVar.Y();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23850w = 1;
                if (Y.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.l<View, wn.v> {
        public f0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            androidx.activity.result.c cVar = LiveMainSettingsBottomSheetDialogFragment.this.f23832c1;
            LivePermissionActivity.a aVar = LivePermissionActivity.V;
            Context N2 = LiveMainSettingsBottomSheetDialogFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            cVar.a(aVar.a(N2));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$15", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {578}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23854w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23856w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23856w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                Fragment e02 = this.f23856w.p0().e0("ProgressDialogFragment");
                sd.b bVar = e02 instanceof sd.b ? (sd.b) e02 : null;
                if (bVar != null) {
                    bVar.n3();
                }
                this.f23856w.o4(mRError);
                return wn.v.f59242a;
            }
        }

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23854w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<MRError> C = jVar.C();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23854w = 1;
                if (C.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.l<View, wn.v> {
        public g0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            LiveMainSettingsBottomSheetDialogFragment.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$16", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {584}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23858w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23860w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23860w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                jc.j jVar = this.f23860w.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                String K = jVar.K();
                if (K == null) {
                    return wn.v.f59242a;
                }
                androidx.activity.result.c cVar = this.f23860w.f23831b1;
                LivePrepareLiveThumbnailActivity.a aVar = LivePrepareLiveThumbnailActivity.Y;
                Context N2 = this.f23860w.N2();
                jo.p.g(N2, "requireContext()");
                cVar.a(aVar.a(N2, Referer.Broadcast.SETTING, 1, K, null));
                return wn.v.f59242a;
            }
        }

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23858w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<wn.v> X = jVar.X();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23858w = 1;
                if (X.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.l<Integer, wn.v> {
        public h0() {
            super(1);
        }

        public final void a(int i10) {
            jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
            jc.f fVar = null;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            if (jVar.U() == i10) {
                i10 = 0;
            }
            jc.f fVar2 = LiveMainSettingsBottomSheetDialogFragment.this.Q0;
            if (fVar2 == null) {
                jo.p.v("actionCreator");
            } else {
                fVar = fVar2;
            }
            fVar.M(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$17", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {598}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23862w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23864w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23864w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f23864w.o4(mRError);
                return wn.v.f59242a;
            }
        }

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23862w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<MRError> B = jVar.B();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23862w = 1;
                if (B.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class i0 extends jo.q implements io.l<xb.t, wn.v> {
        public i0() {
            super(1);
        }

        public final void a(xb.t tVar) {
            jo.p.h(tVar, "bindModel");
            jc.f fVar = null;
            if (tVar.i()) {
                jc.f fVar2 = LiveMainSettingsBottomSheetDialogFragment.this.Q0;
                if (fVar2 == null) {
                    jo.p.v("actionCreator");
                    fVar2 = null;
                }
                fVar2.L(null, null);
                return;
            }
            jc.f fVar3 = LiveMainSettingsBottomSheetDialogFragment.this.Q0;
            if (fVar3 == null) {
                jo.p.v("actionCreator");
            } else {
                fVar = fVar3;
            }
            fVar.L(Integer.valueOf(tVar.d()), tVar.c());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(xb.t tVar) {
            a(tVar);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$18", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {603}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23866w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23868w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23868w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                jc.f fVar;
                Fragment e02 = this.f23868w.p0().e0("ProgressDialogFragment");
                jc.j jVar = null;
                sd.b bVar = e02 instanceof sd.b ? (sd.b) e02 : null;
                if (bVar != null) {
                    bVar.n3();
                }
                jc.j jVar2 = this.f23868w.R0;
                if (jVar2 == null) {
                    jo.p.v("store");
                    jVar2 = null;
                }
                ye.c f10 = jVar2.Q().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                jc.f fVar2 = this.f23868w.Q0;
                if (fVar2 == null) {
                    jo.p.v("actionCreator");
                    fVar = null;
                } else {
                    fVar = fVar2;
                }
                String b10 = f10.b();
                jc.j jVar3 = this.f23868w.R0;
                if (jVar3 == null) {
                    jo.p.v("store");
                    jVar3 = null;
                }
                String f11 = jVar3.L().k().f();
                if (f11 == null) {
                    f11 = "";
                }
                jc.j jVar4 = this.f23868w.R0;
                if (jVar4 == null) {
                    jo.p.v("store");
                    jVar4 = null;
                }
                String f12 = jVar4.y().f().f();
                String str = f12 == null ? "" : f12;
                jc.j jVar5 = this.f23868w.R0;
                if (jVar5 == null) {
                    jo.p.v("store");
                } else {
                    jVar = jVar5;
                }
                fVar.E(b10, f11, jVar.T(), str, f10.d());
                return wn.v.f59242a;
            }
        }

        public j(ao.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23866w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<wn.v> W = jVar.W();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23866w = 1;
                if (W.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class j0 implements TextWatcher {
        public j0() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jo.p.h(editable, "s");
            jc.f fVar = LiveMainSettingsBottomSheetDialogFragment.this.Q0;
            if (fVar == null) {
                jo.p.v("actionCreator");
                fVar = null;
            }
            fVar.u(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$19", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {616}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23870w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23872w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23872w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f23872w.o4(mRError);
                return wn.v.f59242a;
            }
        }

        public k(ao.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23870w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<MRError> A = jVar.A();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23870w = 1;
                if (A.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class k0 extends jo.q implements io.p<Integer, KeyEvent, wn.v> {
        public k0() {
            super(2);
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                LiveMainSettingsBottomSheetDialogFragment.this.h4().f934w0.clearFocus();
                of.j.f45405a.c(LiveMainSettingsBottomSheetDialogFragment.this.q0(), LiveMainSettingsBottomSheetDialogFragment.this.h4().f934w0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$20", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {622}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23874w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23876w;

            @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$20$1", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {623}, m = "emit")
            /* renamed from: com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0211a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f23877w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f23878x;

                /* renamed from: z  reason: collision with root package name */
                public int f23880z;

                public C0211a(ao.d<? super C0211a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f23878x = obj;
                    this.f23880z |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23876w = liveMainSettingsBottomSheetDialogFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(wn.v r6, ao.d<? super wn.v> r7) {
                /*
                    r5 = this;
                    boolean r6 = r7 instanceof com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment.l.a.C0211a
                    if (r6 == 0) goto L13
                    r6 = r7
                    com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$l$a$a r6 = (com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment.l.a.C0211a) r6
                    int r0 = r6.f23880z
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r6.f23880z = r0
                    goto L18
                L13:
                    com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$l$a$a r6 = new com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$l$a$a
                    r6.<init>(r7)
                L18:
                    java.lang.Object r7 = r6.f23878x
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r6.f23880z
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2d
                    java.lang.Object r6 = r6.f23877w
                    com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$l$a r6 = (com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment.l.a) r6
                    wn.m.b(r7)
                    goto L46
                L2d:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L35:
                    wn.m.b(r7)
                    r3 = 100
                    r6.f23877w = r5
                    r6.f23880z = r2
                    java.lang.Object r6 = uo.b1.a(r3, r6)
                    if (r6 != r0) goto L45
                    return r0
                L45:
                    r6 = r5
                L46:
                    com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment r7 = r6.f23876w
                    jc.j r7 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment.X3(r7)
                    r0 = 0
                    if (r7 != 0) goto L55
                    java.lang.String r7 = "store"
                    jo.p.v(r7)
                    r7 = r0
                L55:
                    androidx.lifecycle.LiveData r7 = r7.N()
                    java.lang.Object r7 = r7.f()
                    java.util.List r7 = (java.util.List) r7
                    r1 = 0
                    if (r7 == 0) goto L6a
                    boolean r7 = r7.isEmpty()
                    r7 = r7 ^ r2
                    if (r7 != r2) goto L6a
                    goto L6b
                L6a:
                    r2 = r1
                L6b:
                    if (r2 == 0) goto L85
                    com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment r6 = r6.f23876w
                    ac.m r6 = com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment.S3(r6)
                    androidx.recyclerview.widget.RecyclerView r6 = r6.Z
                    androidx.recyclerview.widget.RecyclerView$p r6 = r6.getLayoutManager()
                    boolean r7 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
                    if (r7 == 0) goto L80
                    r0 = r6
                    androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                L80:
                    if (r0 == 0) goto L85
                    r0.J2(r1, r1)
                L85:
                    wn.v r6 = wn.v.f59242a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment.l.a.emit(wn.v, ao.d):java.lang.Object");
            }
        }

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23874w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<wn.v> O = jVar.O();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23874w = 1;
                if (O.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class l0 extends jo.q implements io.l<View, wn.v> {
        public l0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
            jc.f fVar = null;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            String K = jVar.K();
            if (K == null) {
                jc.f fVar2 = LiveMainSettingsBottomSheetDialogFragment.this.Q0;
                if (fVar2 == null) {
                    jo.p.v("actionCreator");
                } else {
                    fVar = fVar2;
                }
                fVar.D();
                return;
            }
            androidx.activity.result.c cVar = LiveMainSettingsBottomSheetDialogFragment.this.f23831b1;
            LivePrepareLiveThumbnailActivity.a aVar = LivePrepareLiveThumbnailActivity.Y;
            Context N2 = LiveMainSettingsBottomSheetDialogFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            cVar.a(aVar.a(N2, Referer.Broadcast.SETTING, 1, K, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$21", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {631}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23882w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23884w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23884w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f23884w.o4(mRError);
                return wn.v.f59242a;
            }
        }

        public m(ao.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23882w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<MRError> D = jVar.D();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23882w = 1;
                if (D.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class m0 extends jo.q implements io.l<View, wn.v> {
        public m0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            u2.a aVar = u2.Z0;
            jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
            jc.j jVar2 = null;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            String T = jVar.T();
            jc.j jVar3 = LiveMainSettingsBottomSheetDialogFragment.this.R0;
            if (jVar3 == null) {
                jo.p.v("store");
            } else {
                jVar2 = jVar3;
            }
            List<AppCampaign> f10 = jVar2.v().f();
            if (f10 == null) {
                f10 = xn.s.k();
            }
            aVar.a(T, f10).z3(LiveMainSettingsBottomSheetDialogFragment.this.O2(), "LiveAppSettingDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$7", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {500}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23886w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<AppCampaign> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23888w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23888w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(AppCampaign appCampaign, ao.d<? super wn.v> dVar) {
                this.f23888w.F4(appCampaign);
                return wn.v.f59242a;
            }
        }

        public n(ao.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23886w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<AppCampaign> V = jVar.V();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23886w = 1;
                if (V.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class n0 extends jo.q implements io.l<View, wn.v> {
        public n0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            of.j.f45405a.c(LiveMainSettingsBottomSheetDialogFragment.this.q0(), LiveMainSettingsBottomSheetDialogFragment.this.h4().f934w0);
            kc.w.S0.a().z3(LiveMainSettingsBottomSheetDialogFragment.this.p0(), "LiveDetailSettingsBottomSheetDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$8", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {505}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23890w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23892w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23892w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f23892w.h4().F.clearAnimation();
                this.f23892w.h4().E.clearAnimation();
                this.f23892w.h4().F.setVisibility(8);
                this.f23892w.h4().E.setVisibility(8);
                return wn.v.f59242a;
            }
        }

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23890w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<wn.v> z10 = jVar.z();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23890w = 1;
                if (z10.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class o0 extends jo.q implements io.l<View, wn.v> {
        public o0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            jc.f fVar = LiveMainSettingsBottomSheetDialogFragment.this.Q0;
            jc.j jVar = null;
            if (fVar == null) {
                jo.p.v("actionCreator");
                fVar = null;
            }
            jc.j jVar2 = LiveMainSettingsBottomSheetDialogFragment.this.R0;
            if (jVar2 == null) {
                jo.p.v("store");
            } else {
                jVar = jVar2;
            }
            fVar.N(!jo.p.c(jVar.L().p().f(), Boolean.TRUE));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$9", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {513}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23900w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23902w;

            public a(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                this.f23902w = liveMainSettingsBottomSheetDialogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f23902w.o4(mRError);
                return wn.v.f59242a;
            }
        }

        public p(ao.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23900w;
            if (i10 == 0) {
                wn.m.b(obj);
                jc.j jVar = LiveMainSettingsBottomSheetDialogFragment.this.R0;
                if (jVar == null) {
                    jo.p.v("store");
                    jVar = null;
                }
                xo.w<MRError> G = jVar.G();
                a aVar = new a(LiveMainSettingsBottomSheetDialogFragment.this);
                this.f23900w = 1;
                if (G.a(aVar, this) == c10) {
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

    /* loaded from: classes2.dex */
    public static final class p0 extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ AppCampaign f23904x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(AppCampaign appCampaign) {
            super(1);
            this.f23904x = appCampaign;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            jf.b0 a10 = LiveMainSettingsBottomSheetDialogFragment.this.m4().a(this.f23904x.getUrl());
            if (a10 instanceof b0.l0) {
                return;
            }
            LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment = LiveMainSettingsBottomSheetDialogFragment.this;
            HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
            Context N2 = liveMainSettingsBottomSheetDialogFragment.N2();
            jo.p.g(N2, "requireContext()");
            liveMainSettingsBottomSheetDialogFragment.f3(aVar.a(N2, Referer.Broadcast.SETTING, a10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$onResume$1", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {210}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23905w;

        public q(ao.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23905w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23905w = 1;
                if (b1.a(200L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            LiveMainSettingsBottomSheetDialogFragment.this.h4().f915d0.r();
            LiveMainSettingsBottomSheetDialogFragment.this.h4().f918g0.r();
            LiveMainSettingsBottomSheetDialogFragment.this.X0 = false;
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 extends jo.q implements io.l<View, wn.v> {
        public q0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            LiveMainSettingsBottomSheetDialogFragment.this.h4().E.clearAnimation();
            LiveMainSettingsBottomSheetDialogFragment.this.h4().F.clearAnimation();
            LiveMainSettingsBottomSheetDialogFragment.this.h4().F.setVisibility(8);
            LiveMainSettingsBottomSheetDialogFragment.this.h4().E.setVisibility(8);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r implements View.OnLayoutChangeListener {
        public r() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            LiveMainSettingsBottomSheetDialogFragment.this.A4();
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 extends jo.q implements io.l<Uri, wn.v> {
        public r0() {
            super(1);
        }

        public final void a(Uri uri) {
            if (uri == null) {
                return;
            }
            AppCompatImageView appCompatImageView = LiveMainSettingsBottomSheetDialogFragment.this.h4().G;
            jo.p.g(appCompatImageView, "binding.appCampaignImageView");
            String uri2 = uri.toString();
            Boolean bool = Boolean.TRUE;
            td.a.r(appCompatImageView, uri2, 8, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : bool, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : bool, (r19 & 128) != 0 ? null : null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Uri uri) {
            a(uri);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f23910w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Fragment fragment) {
            super(0);
            this.f23910w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f23910w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f23910w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class s0 extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23911w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23912x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23913y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23911w = componentCallbacks;
            this.f23912x = aVar;
            this.f23913y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f23911w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f23912x, this.f23913y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23914w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar) {
            super(0);
            this.f23914w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f23914w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class t0 extends jo.q implements io.a<hf.o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23915w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23916x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23917y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23915w = componentCallbacks;
            this.f23916x = aVar;
            this.f23917y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.o0, java.lang.Object] */
        @Override // io.a
        public final hf.o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23915w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.o0.class), this.f23916x, this.f23917y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23918w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23919x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23920y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23921z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23918w = aVar;
            this.f23919x = aVar2;
            this.f23920y = aVar3;
            this.f23921z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23918w;
            vq.a aVar2 = this.f23919x;
            io.a aVar3 = this.f23920y;
            xq.a aVar4 = this.f23921z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(jc.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class u0 extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23922w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23923x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23924y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23922w = componentCallbacks;
            this.f23923x = aVar;
            this.f23924y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f23922w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f23923x, this.f23924y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23925w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar) {
            super(0);
            this.f23925w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f23925w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v0 extends jo.q implements io.a<hf.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23926w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23927x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23928y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23926w = componentCallbacks;
            this.f23927x = aVar;
            this.f23928y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.u0, java.lang.Object] */
        @Override // io.a
        public final hf.u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23926w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.u0.class), this.f23927x, this.f23928y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f23929w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Fragment fragment) {
            super(0);
            this.f23929w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f23929w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23930w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23931x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23932y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23930w = componentCallbacks;
            this.f23931x = aVar;
            this.f23932y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f23930w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f23931x, this.f23932y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23933w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar) {
            super(0);
            this.f23933w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f23933w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class x0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23934w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23935x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23936y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23934w = componentCallbacks;
            this.f23935x = aVar;
            this.f23936y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f23934w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f23935x, this.f23936y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23937w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23938x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23939y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23940z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23937w = aVar;
            this.f23938x = aVar2;
            this.f23939y = aVar3;
            this.f23940z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23937w;
            vq.a aVar2 = this.f23938x;
            io.a aVar3 = this.f23939y;
            xq.a aVar4 = this.f23940z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(jc.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$yesCustomYesNoDialog$1", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {770}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23941w;

        /* renamed from: x  reason: collision with root package name */
        public int f23942x;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ sd.b f23944w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23945x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(sd.b bVar, LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                super(0);
                this.f23944w = bVar;
                this.f23945x = liveMainSettingsBottomSheetDialogFragment;
            }

            public final void a() {
                this.f23944w.z3(this.f23945x.p0(), "ProgressDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ in.x f23946w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23947x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(in.x xVar, LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
                super(0);
                this.f23946w = xVar;
                this.f23947x = liveMainSettingsBottomSheetDialogFragment;
            }

            public final void a() {
                c0.a aVar = gf.c0.Q0;
                in.x xVar = this.f23946w;
                jo.p.e(xVar);
                String c10 = xVar.c();
                jo.p.g(c10, "twitterSession!!.userName");
                aVar.a(Referer.Broadcast.SETTING, c10).z3(this.f23947x.p0(), "FollowOfficialTwitterAccountDialog");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public y0(ao.d<? super y0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            sd.b bVar;
            Object c10 = bo.c.c();
            int i10 = this.f23942x;
            if (i10 == 0) {
                wn.m.b(obj);
                sd.b a10 = sd.b.O0.a(false);
                LiveMainSettingsBottomSheetDialogFragment.this.V0.c(new a(a10, LiveMainSettingsBottomSheetDialogFragment.this));
                hf.o0 l42 = LiveMainSettingsBottomSheetDialogFragment.this.l4();
                androidx.fragment.app.h L2 = LiveMainSettingsBottomSheetDialogFragment.this.L2();
                jo.p.g(L2, "requireActivity()");
                FragmentManager p02 = LiveMainSettingsBottomSheetDialogFragment.this.p0();
                jo.p.g(p02, "childFragmentManager");
                this.f23941w = a10;
                this.f23942x = 1;
                Object j10 = l42.j(L2, p02, Referer.Broadcast.SETTING, this);
                if (j10 == c10) {
                    return c10;
                }
                bVar = a10;
                obj = j10;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                bVar = (sd.b) this.f23941w;
                wn.m.b(obj);
            }
            wn.p pVar = (wn.p) obj;
            o0.b bVar2 = (o0.b) pVar.a();
            Social.SocialAccount socialAccount = (Social.SocialAccount) pVar.b();
            in.x xVar = (in.x) pVar.c();
            bVar.n3();
            o0.b bVar3 = o0.b.Success;
            if (bVar2 == bVar3) {
                jo.p.e(socialAccount);
                Integer isFollowOfficialTwitter = socialAccount.isFollowOfficialTwitter();
                if (isFollowOfficialTwitter != null && isFollowOfficialTwitter.intValue() == 0) {
                    LiveMainSettingsBottomSheetDialogFragment.this.V0.c(new b(xVar, LiveMainSettingsBottomSheetDialogFragment.this));
                }
            }
            if (bVar2 == bVar3) {
                jc.f fVar = LiveMainSettingsBottomSheetDialogFragment.this.Q0;
                if (fVar == null) {
                    jo.p.v("actionCreator");
                    fVar = null;
                }
                fVar.N(true);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23948w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(io.a aVar) {
            super(0);
            this.f23948w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f23948w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public LiveMainSettingsBottomSheetDialogFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S0 = wn.g.b(iVar, new s0(this, null, null));
        this.T0 = wn.g.b(iVar, new t0(this, null, null));
        this.U0 = wn.g.b(iVar, new u0(this, null, null));
        this.V0 = new FragmentRunner(this);
        this.W0 = nd.a.a(this);
        this.X0 = true;
        this.Y0 = wn.g.b(iVar, new v0(this, null, null));
        this.Z0 = wn.g.b(iVar, new w0(this, null, null));
        this.f23830a1 = wn.g.b(iVar, new x0(this, null, null));
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: lc.t
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.q4(LiveMainSettingsBottomSheetDialogFragment.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…loadLiveThumbnail()\n    }");
        this.f23831b1 = I2;
        androidx.activity.result.c<Intent> I22 = I2(new c.c(), new androidx.activity.result.b() { // from class: lc.s
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.p4(LiveMainSettingsBottomSheetDialogFragment.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I22, "registerForActivityResul…_user_num\n        )\n    }");
        this.f23832c1 = I22;
        androidx.activity.result.c<Intent> I23 = I2(new c.c(), new androidx.activity.result.b() { // from class: lc.r
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.r4(LiveMainSettingsBottomSheetDialogFragment.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I23, "registerForActivityResul…gFragmentListener()\n    }");
        this.f23833d1 = I23;
    }

    public static final boolean D4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        if (i10 == 6) {
            textView.clearFocus();
            of.j.f45405a.c(liveMainSettingsBottomSheetDialogFragment.q0(), liveMainSettingsBottomSheetDialogFragment.h4().f934w0);
            return false;
        }
        return false;
    }

    public static final boolean E4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, View view, MotionEvent motionEvent) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        if (1 == motionEvent.getAction()) {
            xb.u.N0.a().z3(liveMainSettingsBottomSheetDialogFragment.p0(), "RankingFocusEventHelpDialogFragment");
            return false;
        }
        return false;
    }

    public static final void p4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, androidx.activity.result.a aVar) {
        jc.f fVar;
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        LivePermissionActivity.a aVar2 = LivePermissionActivity.V;
        jo.p.g(aVar, "result");
        if (aVar2.b(aVar)) {
            of.j.f45405a.c(liveMainSettingsBottomSheetDialogFragment.q0(), liveMainSettingsBottomSheetDialogFragment.h4().f934w0);
            kc.w.S0.a().z3(liveMainSettingsBottomSheetDialogFragment.p0(), "LiveDetailSettingsBottomSheetDialogFragment");
        } else if (aVar2.c(aVar)) {
            liveMainSettingsBottomSheetDialogFragment.V0.c(new b(sd.b.O0.a(false), liveMainSettingsBottomSheetDialogFragment));
            jc.j jVar = liveMainSettingsBottomSheetDialogFragment.R0;
            jc.j jVar2 = null;
            jc.f fVar2 = null;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            ye.c f10 = jVar.Q().f();
            if (f10 == null) {
                jc.f fVar3 = liveMainSettingsBottomSheetDialogFragment.Q0;
                if (fVar3 == null) {
                    jo.p.v("actionCreator");
                } else {
                    fVar2 = fVar3;
                }
                fVar2.C();
                return;
            }
            jc.f fVar4 = liveMainSettingsBottomSheetDialogFragment.Q0;
            if (fVar4 == null) {
                jo.p.v("actionCreator");
                fVar = null;
            } else {
                fVar = fVar4;
            }
            String b10 = f10.b();
            jc.j jVar3 = liveMainSettingsBottomSheetDialogFragment.R0;
            if (jVar3 == null) {
                jo.p.v("store");
                jVar3 = null;
            }
            String f11 = jVar3.L().k().f();
            String str = f11 == null ? "" : f11;
            jc.j jVar4 = liveMainSettingsBottomSheetDialogFragment.R0;
            if (jVar4 == null) {
                jo.p.v("store");
                jVar4 = null;
            }
            String f12 = jVar4.y().f().f();
            String str2 = f12 == null ? "" : f12;
            jc.j jVar5 = liveMainSettingsBottomSheetDialogFragment.R0;
            if (jVar5 == null) {
                jo.p.v("store");
            } else {
                jVar2 = jVar5;
            }
            fVar.E(b10, str, jVar2.T(), str2, f10.d());
        }
    }

    public static final void q4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, androidx.activity.result.a aVar) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        if (aVar.b() != -1) {
            g9.a.f32826a.b("REQUEST_CODE_EDIT_LIVE_THUMBNAILIMAGE not OK", new Object[0]);
            return;
        }
        jc.f fVar = liveMainSettingsBottomSheetDialogFragment.Q0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.J();
    }

    public static final void r4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, androidx.activity.result.a aVar) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        jc.j jVar = liveMainSettingsBottomSheetDialogFragment.R0;
        if (jVar == null) {
            jo.p.v("store");
            jVar = null;
        }
        ye.c f10 = jVar.Q().f();
        if (aVar.b() != -1 || f10 == null) {
            return;
        }
        liveMainSettingsBottomSheetDialogFragment.k4().a().i("live_created");
        Context N2 = liveMainSettingsBottomSheetDialogFragment.N2();
        CastService.a aVar2 = CastService.X0;
        Context N22 = liveMainSettingsBottomSheetDialogFragment.N2();
        jo.p.g(N22, "requireContext()");
        c3.a.n(N2, aVar2.a(N22, ye.c.L.a(f10, aVar.b(), aVar.a()), false));
        lc.c0 c0Var = liveMainSettingsBottomSheetDialogFragment.P0;
        if (c0Var != null) {
            c0Var.A0();
        }
    }

    public static final void t4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, List list) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        RecyclerView recyclerView = liveMainSettingsBottomSheetDialogFragment.h4().f931t0;
        jo.p.g(recyclerView, "binding.thumbnailFrameRecyclerView");
        jo.p.g(list, "bindModels");
        recyclerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        RecyclerView.h adapter = liveMainSettingsBottomSheetDialogFragment.h4().f931t0.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.liveprepare.mainsettings.ThumbnailFrameAdapter");
        ((lc.n0) adapter).f(list);
    }

    public static final void u4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, String str) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        AppCompatImageView appCompatImageView = liveMainSettingsBottomSheetDialogFragment.h4().H;
        jo.p.g(appCompatImageView, "binding.appImageView");
        td.a.j(appCompatImageView, str, xb.n.ic_app_default);
    }

    public static final void v4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, Integer num) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        liveMainSettingsBottomSheetDialogFragment.h4().f924m0.setVisibility((num != null && num.intValue() == -1) ? 0 : 8);
    }

    public static final void w4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, Boolean bool) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        LottieAnimationView lottieAnimationView = liveMainSettingsBottomSheetDialogFragment.h4().f915d0;
        jo.p.g(bool, "isEnabled");
        lottieAnimationView.setVisibility(bool.booleanValue() ? 8 : 0);
        liveMainSettingsBottomSheetDialogFragment.h4().f918g0.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void x4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, List list) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        if (list.isEmpty()) {
            liveMainSettingsBottomSheetDialogFragment.h4().U.setVisibility(8);
            liveMainSettingsBottomSheetDialogFragment.h4().Z.setVisibility(8);
            return;
        }
        liveMainSettingsBottomSheetDialogFragment.h4().U.setVisibility(0);
        liveMainSettingsBottomSheetDialogFragment.h4().Z.setVisibility(0);
        RecyclerView.h adapter = liveMainSettingsBottomSheetDialogFragment.h4().Z.getAdapter();
        xb.w wVar = adapter instanceof xb.w ? (xb.w) adapter : null;
        if (wVar != null) {
            wVar.d(list);
        }
    }

    public static final void y4(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, xb.t tVar) {
        jo.p.h(liveMainSettingsBottomSheetDialogFragment, "this$0");
        if (tVar != null) {
            liveMainSettingsBottomSheetDialogFragment.h4().Y.setVisibility(0);
            liveMainSettingsBottomSheetDialogFragment.h4().W.setVisibility(0);
            liveMainSettingsBottomSheetDialogFragment.h4().Y.setText(tVar.h());
            liveMainSettingsBottomSheetDialogFragment.h4().W.setText(tVar.g());
            return;
        }
        liveMainSettingsBottomSheetDialogFragment.h4().Y.setVisibility(8);
        liveMainSettingsBottomSheetDialogFragment.h4().W.setVisibility(8);
    }

    public final void A4() {
        Window window;
        View decorView;
        Rect rect = new Rect();
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int height = rect.height() - de.e.b(this, 24);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(h4().R);
        cVar.l(h4().S.getId(), height);
        cVar.c(h4().R);
        Dialog p33 = p3();
        jo.p.f(p33, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((com.google.android.material.bottomsheet.a) p33).findViewById(xb.o.f60021p2);
        if (findViewById == null) {
            return;
        }
        BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
        jo.p.g(c02, "from(bottomSheet)");
        c02.z0(3);
        c02.v0(height);
        findViewById.setBackgroundColor(c3.a.d(N2(), 17170445));
    }

    public final void B4() {
        h4().f931t0.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        h4().f931t0.g(new p001if.c(de.e.b(this, 6), 0, 0, 0, 0, 0));
        h4().f931t0.setAdapter(new lc.n0());
        h4().B.setCardElevation(de.e.a(this, 8.0f));
        h4().B.setShapeAppearanceModel(tj.k.a().p(new tj.a(de.e.a(this, 8.0f))).A(new a0()).m());
        h4().f922k0.setCardBackgroundColor(c3.a.d(N2(), xb.l.f59943n));
        h4().f922k0.setStrokeWidth(de.e.b(this, 2));
        MaterialCardView materialCardView = h4().f922k0;
        Context N2 = N2();
        int i10 = xb.l.f59952y;
        materialCardView.setStrokeColor(c3.a.d(N2, i10));
        h4().f922k0.setCardElevation(de.e.a(this, 8.0f));
        h4().f922k0.setShapeAppearanceModel(tj.k.a().p(new tj.a(de.e.a(this, 8.0f))).A(new b0()).m());
        h4().f916e0.setCardBackgroundColor(c3.a.d(N2(), xb.l.f59937f));
        h4().f916e0.setStrokeWidth(de.e.b(this, 2));
        h4().f916e0.setStrokeColor(c3.a.d(N2(), i10));
        h4().f916e0.setCardElevation(de.e.a(this, 8.0f));
        h4().f916e0.setShapeAppearanceModel(tj.k.a().p(new tj.a(de.e.a(this, 8.0f))).A(new c0()).m());
        h4().Z.setLayoutManager(new LinearLayoutManager(N2(), 0, false));
        h4().Z.g(new p001if.c(de.e.b(this, 10), 0, 0, 0, 0, 0));
        h4().Z.setAdapter(new xb.w());
    }

    public final void C4() {
        RecyclerView.h adapter = h4().f931t0.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.liveprepare.mainsettings.ThumbnailFrameAdapter");
        ((lc.n0) adapter).g(new h0());
        RecyclerView.h adapter2 = h4().Z.getAdapter();
        jo.p.f(adapter2, "null cannot be cast to non-null type com.dena.mirrativ.streaming.RankingFocusEventListAdapter");
        ((xb.w) adapter2).h(new i0());
        h4().f934w0.setHorizontallyScrolling(false);
        h4().f934w0.setMaxLines(3);
        h4().f934w0.addTextChangedListener(new j0());
        h4().f934w0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lc.q
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean D4;
                D4 = LiveMainSettingsBottomSheetDialogFragment.D4(LiveMainSettingsBottomSheetDialogFragment.this, textView, i10, keyEvent);
                return D4;
            }
        });
        h4().f934w0.setOnKeyPreImeListener(new k0());
        EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener = h4().f934w0;
        Integer valueOf = Integer.valueOf(O0().getString(xb.r.limit_live_title));
        jo.p.g(valueOf, "valueOf(resources.getStr…string.limit_live_title))");
        editTextWithOnKeyPreImeListener.setFilters(new sf.b[]{new sf.b(valueOf.intValue())});
        ConstraintLayout constraintLayout = h4().f930s0;
        jo.p.g(constraintLayout, "binding.thumbnailContainer");
        g1.a(constraintLayout, new l0());
        AppCompatImageView appCompatImageView = h4().H;
        jo.p.g(appCompatImageView, "binding.appImageView");
        g1.a(appCompatImageView, new m0());
        AppCompatImageView appCompatImageView2 = h4().T;
        jo.p.g(appCompatImageView2, "binding.detailSettingImageView");
        g1.a(appCompatImageView2, new n0());
        View view = h4().I;
        jo.p.g(view, "binding.autoTweetClickableView");
        g1.a(view, new o0());
        AppCompatImageView appCompatImageView3 = h4().f919h0;
        jo.p.g(appCompatImageView3, "binding.optionImageView");
        g1.a(appCompatImageView3, new d0());
        LottieAnimationView lottieAnimationView = h4().f915d0;
        jo.p.g(lottieAnimationView, "binding.liveStartLottieAnimationView");
        g1.a(lottieAnimationView, new e0());
        LottieAnimationView lottieAnimationView2 = h4().f918g0;
        jo.p.g(lottieAnimationView2, "binding.omotenashiLiveStartLottieAnimationView");
        g1.a(lottieAnimationView2, new f0());
        AppCompatImageView appCompatImageView4 = h4().Q;
        jo.p.g(appCompatImageView4, "binding.closeImageView");
        g1.a(appCompatImageView4, new g0());
        h4().V.setOnTouchListener(new View.OnTouchListener() { // from class: lc.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean E4;
                E4 = LiveMainSettingsBottomSheetDialogFragment.E4(LiveMainSettingsBottomSheetDialogFragment.this, view2, motionEvent);
                return E4;
            }
        });
    }

    @Override // be.o3
    public void E() {
        n4().b();
        MRLogger j42 = j4();
        MRLog.Companion companion = MRLog.Companion;
        j42.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_ANNOUNCEMENT_FOREGROUND_PERMISSION_TAP).build());
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ac.m T = ac.m.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        z4(T);
        View u10 = h4().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // lc.b0
    public void F() {
        lc.k.X0.a(Referer.Broadcast.SETTING).z3(p0(), "FavoriteLiveSettingsDialog");
    }

    public final void F4(AppCampaign appCampaign) {
        h4().F.clearAnimation();
        h4().F.setVisibility(0);
        h4().E.setVisibility(0);
        AnimationSet a10 = jc.i.f37524a.a();
        h4().E.startAnimation(a10);
        h4().F.startAnimation(a10);
        FrameLayout frameLayout = h4().F;
        jo.p.g(frameLayout, "binding.appCampaignContainer");
        g1.a(frameLayout, new p0(appCampaign));
        AppCompatImageView appCompatImageView = h4().E;
        jo.p.g(appCompatImageView, "binding.appCampaignCloseImageView");
        g1.a(appCompatImageView, new q0());
        AppCompatImageView appCompatImageView2 = h4().G;
        jo.p.g(appCompatImageView2, "binding.appCampaignImageView");
        de.f.d(appCompatImageView2, appCampaign.getImageUrl(), false, new r0(), 2, null);
    }

    public final void G4() {
        Fragment e02 = p0().e0("ProgressDialogFragment");
        sd.b bVar = e02 instanceof sd.b ? (sd.b) e02 : null;
        if (bVar != null) {
            bVar.n3();
        }
        Object systemService = N2().getSystemService("media_projection");
        jo.p.f(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        this.f23833d1.a(((MediaProjectionManager) systemService).createScreenCaptureIntent());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        this.P0 = null;
        super.I1();
    }

    @Override // vb.m
    public void J() {
        jc.j jVar = this.R0;
        if (jVar == null) {
            jo.p.v("store");
            jVar = null;
        }
        String f10 = jVar.L().e().f();
        if (f10 != null) {
            MRLogger j42 = j4();
            MRLog.Companion companion = MRLog.Companion;
            j42.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_OMOTENASHI_LP_IMP).build());
            jf.b0 a10 = m4().a(f10);
            if (!(a10 instanceof b0.l0)) {
                HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                Context N2 = N2();
                jo.p.g(N2, "requireContext()");
                f3(aVar.a(N2, Referer.Broadcast.SETTING, a10));
                return;
            }
            WebViewActivity.a aVar2 = WebViewActivity.X;
            Context N22 = N2();
            jo.p.g(N22, "requireContext()");
            f3(WebViewActivity.a.b(aVar2, N22, f10, false, false, 12, null));
        }
    }

    @Override // lc.l
    public void K(FavoriteLiveSetting favoriteLiveSetting) {
        jo.p.h(favoriteLiveSetting, MRLog.PAYLOAD_KEY_SETTING);
        jc.f fVar = this.Q0;
        jc.j jVar = null;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        jc.j jVar2 = this.R0;
        if (jVar2 == null) {
            jo.p.v("store");
        } else {
            jVar = jVar2;
        }
        fVar.O(jVar.K(), favoriteLiveSetting);
    }

    @Override // be.o3
    public void S() {
        G4();
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        jc.f fVar = this.Q0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.K();
        if (this.X0) {
            uo.l.d(this, null, null, new q(null), 3, null);
        }
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_TWITTER_LINK")) {
            uo.l.d(this, null, null, new y0(null), 3, null);
        }
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void c2() {
        Window window;
        FrameLayout frameLayout;
        super.c2();
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(xb.o.f60021p2)) == null) {
            return;
        }
        BottomSheetBehavior.c0(frameLayout).u0(-1);
    }

    @Override // vb.m
    public void d() {
        m.a.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        w wVar = new w(this);
        jc.j jVar = null;
        jc.f fVar = null;
        this.Q0 = (jc.f) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(jc.f.class), new z(new x(wVar)), new y(wVar, null, null, gq.a.a(this))).getValue());
        s sVar = new s(this);
        this.R0 = (jc.j) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(jc.j.class), new v(new t(sVar)), new u(sVar, null, null, gq.a.a(this))).getValue());
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        h4().M(a1());
        ac.m h42 = h4();
        jc.j jVar2 = this.R0;
        if (jVar2 == null) {
            jo.p.v("store");
            jVar2 = null;
        }
        h42.V(jVar2.L());
        View u10 = h4().u();
        jo.p.g(u10, "binding.root");
        if (o3.c0.V(u10) && !u10.isLayoutRequested()) {
            A4();
        } else {
            u10.addOnLayoutChangeListener(new r());
        }
        B4();
        C4();
        s4();
        jc.j jVar3 = this.R0;
        if (jVar3 == null) {
            jo.p.v("store");
            jVar3 = null;
        }
        AppCampaign I = jVar3.I();
        if (I != null) {
            F4(I);
        }
        jc.f fVar2 = this.Q0;
        if (fVar2 == null) {
            jo.p.v("actionCreator");
            fVar2 = null;
        }
        jc.j jVar4 = this.R0;
        if (jVar4 == null) {
            jo.p.v("store");
            jVar4 = null;
        }
        fVar2.I(jVar4.J());
        jc.j jVar5 = this.R0;
        if (jVar5 == null) {
            jo.p.v("store");
            jVar5 = null;
        }
        if (jVar5.w() == null) {
            jc.f fVar3 = this.Q0;
            if (fVar3 == null) {
                jo.p.v("actionCreator");
            } else {
                fVar = fVar3;
            }
            fVar.B();
            return;
        }
        jc.f fVar4 = this.Q0;
        if (fVar4 == null) {
            jo.p.v("actionCreator");
            fVar4 = null;
        }
        jc.j jVar6 = this.R0;
        if (jVar6 == null) {
            jo.p.v("store");
        } else {
            jVar = jVar6;
        }
        String w10 = jVar.w();
        jo.p.e(w10);
        fVar4.A(w10);
    }

    public final void g4() {
        Fragment e02 = p0().e0("RequestUsageStatsPermissionDialogFragment");
        n3 n3Var = e02 instanceof n3 ? (n3) e02 : null;
        if (n3Var != null) {
            n3Var.n3();
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }

    public final ac.m h4() {
        return (ac.m) this.W0.b(this, f23828f1[0]);
    }

    public final tb.c i4() {
        return (tb.c) this.f23830a1.getValue();
    }

    public final MRLogger j4() {
        return (MRLogger) this.Z0.getValue();
    }

    public final i1 k4() {
        return (i1) this.U0.getValue();
    }

    public final hf.o0 l4() {
        return (hf.o0) this.T0.getValue();
    }

    public final of.k m4() {
        return (of.k) this.S0.getValue();
    }

    public final hf.u0 n4() {
        return (hf.u0) this.Y0.getValue();
    }

    @Override // vb.m
    public void o() {
        Fragment e02 = p0().e0("LiveOptionMenuBottomSheetDialogFragment");
        androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
        if (eVar != null) {
            eVar.n3();
        }
    }

    public final void o4(MRError mRError) {
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(N2(), mRError);
            return;
        }
        of.n nVar = of.n.f45411a;
        Context N2 = N2();
        String message = mRError.getMessage();
        if (message == null) {
            message = U0(xb.r.f60070c);
            jo.p.g(message, "getString(R.string.error_access)");
        }
        nVar.B(N2, message, false);
    }

    @Override // lc.b0
    public void q() {
        jc.j jVar = this.R0;
        if (jVar == null) {
            jo.p.v("store");
            jVar = null;
        }
        if (jo.p.c(jVar.c0().f(), Boolean.TRUE)) {
            t1.a aVar = t1.f61795x;
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            String U0 = U0(xb.r.text_omotenashi_broadcast_cancel_message_for_private_broadcast);
            jo.p.g(U0, "getString(R.string.text_…ge_for_private_broadcast)");
            aVar.a(N2, U0);
            return;
        }
        LivePrepareForFriendActivity.a aVar2 = LivePrepareForFriendActivity.Y;
        Context N22 = N2();
        jo.p.g(N22, "requireContext()");
        g3(aVar2.a(N22), ActivityOptions.makeCustomAnimation(N2(), xb.j.activity_live_prepare_for_friend_enter, xb.j.activity_live_prepare_for_friend_exit).toBundle());
        Fragment e02 = p0().e0("LiveOptionMenuBottomSheetDialogFragment");
        androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
        if (eVar != null) {
            eVar.n3();
        }
    }

    public final void s4() {
        jc.j jVar = this.R0;
        if (jVar == null) {
            jo.p.v("store");
            jVar = null;
        }
        jVar.L().f().i(this, new androidx.lifecycle.f0() { // from class: lc.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.t4(LiveMainSettingsBottomSheetDialogFragment.this, (List) obj);
            }
        });
        jc.j jVar2 = this.R0;
        if (jVar2 == null) {
            jo.p.v("store");
            jVar2 = null;
        }
        jVar2.L().a().i(this, new androidx.lifecycle.f0() { // from class: lc.x
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.u4(LiveMainSettingsBottomSheetDialogFragment.this, (String) obj);
            }
        });
        jc.j jVar3 = this.R0;
        if (jVar3 == null) {
            jo.p.v("store");
            jVar3 = null;
        }
        jVar3.M().i(this, new androidx.lifecycle.f0() { // from class: lc.w
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.v4(LiveMainSettingsBottomSheetDialogFragment.this, (Integer) obj);
            }
        });
        jc.j jVar4 = this.R0;
        if (jVar4 == null) {
            jo.p.v("store");
            jVar4 = null;
        }
        jVar4.c0().i(a1(), new androidx.lifecycle.f0() { // from class: lc.v
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.w4(LiveMainSettingsBottomSheetDialogFragment.this, (Boolean) obj);
            }
        });
        jc.j jVar5 = this.R0;
        if (jVar5 == null) {
            jo.p.v("store");
            jVar5 = null;
        }
        jVar5.N().i(this, new androidx.lifecycle.f0() { // from class: lc.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.x4(LiveMainSettingsBottomSheetDialogFragment.this, (List) obj);
            }
        });
        jc.j jVar6 = this.R0;
        if (jVar6 == null) {
            jo.p.v("store");
            jVar6 = null;
        }
        jVar6.P().i(this, new androidx.lifecycle.f0() { // from class: lc.u
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveMainSettingsBottomSheetDialogFragment.y4(LiveMainSettingsBottomSheetDialogFragment.this, (xb.t) obj);
            }
        });
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new o(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14(this, null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        uo.l.d(this, null, null, new m(null), 3, null);
    }

    @Override // lc.b0
    public void t(boolean z10) {
        jc.f fVar = this.Q0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.v(z10);
        if (z10) {
            tb.c i42 = i4();
            Integer valueOf = Integer.valueOf(xb.n.f59964m0);
            String U0 = U0(xb.r.text_omotenashi_broadcast_popup_title);
            String U02 = U0(xb.r.text_omotenashi_broadcast_popup_message);
            String U03 = U0(xb.r.text_see_for_details);
            o9.b bVar = o9.b.f44283a;
            tb.a a10 = c.a.a(i42, null, valueOf, U0, U02, U03, new k9.a(bVar.a().B(), bVar.a().w(), bVar.a().w(), 0L, 0L, 0L, 56, null), null, null, false, 449, null);
            a10.a().z3(p0(), a10.b());
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof lc.c0 ? (lc.c0) context : null;
    }

    public final void z4(ac.m mVar) {
        this.W0.a(this, f23828f1[0], mVar);
    }
}
