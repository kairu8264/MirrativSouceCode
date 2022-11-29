package com.dena.mirrativ.streaming.result;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.h3;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingLiveResult;
import com.dena.mirrativ.streaming.result.BroadcastResultActivity;
import com.dena.mirrativ.streaming.result.BroadcastResultBadgeView;
import com.dena.mirrorman.clientlog.logs.BulkSendLog;
import com.dena.mirrorman.clientlog.logs.BulkSendLogActionType;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.Review;
import com.dena.mirrorman.database.MirrorDatabase;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.BroadcastResult;
import com.dena.mirrorman.net.api.response.BroadcastResultEventType;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import hf.v0;
import java.io.Serializable;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import mc.k;
import mc.w;
import nf.c0;
import od.i0;
import sd.g;
import uo.b3;
import uo.d2;
import uo.q0;
import uo.r0;
import xe.d;
import yd.g1;

/* loaded from: classes2.dex */
public final class BroadcastResultActivity extends e.b implements d.b, g.b, h3.b, BroadcastResultBadgeView.a, k.b, vb.a, vb.e, vb.d, vb.c, vb.b, q0 {

    /* renamed from: o0  reason: collision with root package name */
    public static final a f23984o0 = new a(null);

    /* renamed from: p0  reason: collision with root package name */
    public static final int f23985p0 = 8;
    public final /* synthetic */ q0 O = r0.b();
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f23986a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f23987b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f23988c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f23989d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f23990e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f23991f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f23992g0;

    /* renamed from: h0  reason: collision with root package name */
    public String f23993h0;

    /* renamed from: i0  reason: collision with root package name */
    public mc.l f23994i0;

    /* renamed from: j0  reason: collision with root package name */
    public df.a f23995j0;

    /* renamed from: k0  reason: collision with root package name */
    public d2 f23996k0;

    /* renamed from: l0  reason: collision with root package name */
    public final wn.f f23997l0;

    /* renamed from: m0  reason: collision with root package name */
    public final wn.f f23998m0;

    /* renamed from: n0  reason: collision with root package name */
    public final FragmentRunner f23999n0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, df.a aVar, boolean z10, boolean z11) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            Intent intent = new Intent(context, BroadcastResultActivity.class);
            intent.putExtra(MRLog.PAYLOAD_KEY_LIVE_ID, str);
            intent.putExtra("event_live_result", aVar);
            intent.putExtra("should_show_app_rater", z10);
            intent.putExtra("after_finishing_broadcast", z11);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24000w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentActivity componentActivity) {
            super(0);
            this.f24000w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24000w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<ac.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ac.a invoke() {
            return (ac.a) androidx.databinding.f.g(BroadcastResultActivity.this, xb.p.activity_broadcast_result);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements w.b {
        public c() {
        }

        @Override // mc.w.b
        public void a() {
            BroadcastResultActivity.this.f23986a0 = true;
            BroadcastResultActivity.this.v4();
        }

        @Override // mc.w.b
        public void b() {
            BroadcastResultActivity.this.f23987b0 = true;
            BroadcastResultActivity.this.v4();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActivity$observeStoreValues$5", f = "BroadcastResultActivity.kt", l = {335}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24003w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ BroadcastResultActivity f24005w;

            public a(BroadcastResultActivity broadcastResultActivity) {
                this.f24005w = broadcastResultActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Maintenance ? true : jo.p.c(mRError, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(this.f24005w, mRError);
                } else if (mRError instanceof MRError.Network) {
                    of.n.z(this.f24005w);
                } else {
                    of.n nVar = of.n.f45411a;
                    BroadcastResultActivity broadcastResultActivity = this.f24005w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f24005w.getString(xb.r.f60070c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(broadcastResultActivity, message, false);
                }
                this.f24005w.Y3().I.setVisibility(8);
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
            int i10 = this.f24003w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> n10 = BroadcastResultActivity.this.f4().n();
                a aVar = new a(BroadcastResultActivity.this);
                this.f24003w = 1;
                if (n10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActivity$observeStoreValues$6", f = "BroadcastResultActivity.kt", l = {355}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24006w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ BroadcastResultActivity f24008w;

            public a(BroadcastResultActivity broadcastResultActivity) {
                this.f24008w = broadcastResultActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Maintenance ? true : jo.p.c(mRError, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(this.f24008w, mRError);
                } else {
                    of.n nVar = of.n.f45411a;
                    BroadcastResultActivity broadcastResultActivity = this.f24008w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f24008w.getString(xb.r.f60070c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(broadcastResultActivity, message, false);
                }
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
            int i10 = this.f24006w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> o10 = BroadcastResultActivity.this.f4().o();
                a aVar = new a(BroadcastResultActivity.this);
                this.f24006w = 1;
                if (o10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActivity$observeStoreValues$7", f = "BroadcastResultActivity.kt", l = {368}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24009w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ BroadcastResultActivity f24011w;

            public a(BroadcastResultActivity broadcastResultActivity) {
                this.f24011w = broadcastResultActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Maintenance ? true : jo.p.c(mRError, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(this.f24011w, mRError);
                } else {
                    of.n nVar = of.n.f45411a;
                    BroadcastResultActivity broadcastResultActivity = this.f24011w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f24011w.getString(xb.r.f60070c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(broadcastResultActivity, message, false);
                }
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24009w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> r10 = BroadcastResultActivity.this.f4().r();
                a aVar = new a(BroadcastResultActivity.this);
                this.f24009w = 1;
                if (r10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActivity$observeStoreValues$8", f = "BroadcastResultActivity.kt", l = {381}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24012w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ BroadcastResultActivity f24014w;

            public a(BroadcastResultActivity broadcastResultActivity) {
                this.f24014w = broadcastResultActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Maintenance ? true : jo.p.c(mRError, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(this.f24014w, mRError);
                } else {
                    of.n nVar = of.n.f45411a;
                    BroadcastResultActivity broadcastResultActivity = this.f24014w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f24014w.getString(xb.r.f60070c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(broadcastResultActivity, message, false);
                }
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24012w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> q10 = BroadcastResultActivity.this.f4().q();
                a aVar = new a(BroadcastResultActivity.this);
                this.f24012w = 1;
                if (q10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActivity$observeStoreValues$9", f = "BroadcastResultActivity.kt", l = {393}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24015w;

        @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActivity$observeStoreValues$9$1", f = "BroadcastResultActivity.kt", l = {394}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f24017w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ BroadcastResultActivity f24018x;

            /* renamed from: com.dena.mirrativ.streaming.result.BroadcastResultActivity$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0212a implements xo.d<SeasonRatingLiveResult> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ BroadcastResultActivity f24019w;

                public C0212a(BroadcastResultActivity broadcastResultActivity) {
                    this.f24019w = broadcastResultActivity;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(SeasonRatingLiveResult seasonRatingLiveResult, ao.d<? super wn.v> dVar) {
                    tb.c Z3 = this.f24019w.Z3();
                    String str = this.f24019w.f23993h0;
                    if (str == null) {
                        jo.p.v("liveId");
                        str = null;
                    }
                    tb.a U = Z3.U(seasonRatingLiveResult, str);
                    if (this.f24019w.a3().e0(U.b()) != null) {
                        return wn.v.f59242a;
                    }
                    U.a().z3(this.f24019w.a3(), U.b());
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BroadcastResultActivity broadcastResultActivity, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f24018x = broadcastResultActivity;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f24018x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f24017w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.c<SeasonRatingLiveResult> j10 = this.f24018x.e4().j();
                    C0212a c0212a = new C0212a(this.f24018x);
                    this.f24017w = 1;
                    if (j10.a(c0212a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24015w;
            if (i10 == 0) {
                wn.m.b(obj);
                BroadcastResultActivity broadcastResultActivity = BroadcastResultActivity.this;
                o.c cVar = o.c.STARTED;
                a aVar = new a(broadcastResultActivity, null);
                this.f24015w = 1;
                if (RepeatOnLifecycleKt.b(broadcastResultActivity, cVar, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<String, wn.v> {
        public i() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            BroadcastResultActivity.this.W3().e(BroadcastResultActivity.this.c4(), str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<String, wn.v> {
        public j() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            BroadcastResultActivity.this.W3().k(BroadcastResultActivity.this.c4(), str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.p<String, Integer, wn.v> {
        public k() {
            super(2);
        }

        public final void a(String str, int i10) {
            jo.p.h(str, "userId");
            ChatStatus f10 = BroadcastResultActivity.this.f4().m().f();
            if (f10 != null) {
                boolean isEnabled = f10.isEnabled();
                BroadcastResultActivity broadcastResultActivity = BroadcastResultActivity.this;
                if (isEnabled) {
                    mc.a W3 = broadcastResultActivity.W3();
                    String c42 = broadcastResultActivity.c4();
                    String str2 = broadcastResultActivity.f23993h0;
                    if (str2 == null) {
                        jo.p.v("liveId");
                        str2 = null;
                    }
                    W3.j(c42, str2, str, i10);
                    return;
                }
                tb.a F = broadcastResultActivity.Z3().F(Referer.Broadcast.RESULT);
                F.a().z3(broadcastResultActivity.a3(), F.b());
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(String str, Integer num) {
            a(str, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends RecyclerView.u {
        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            int childCount = recyclerView.getChildCount();
            RecyclerView.p layoutManager = BroadcastResultActivity.this.Y3().J.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int j02 = ((LinearLayoutManager) layoutManager).j0();
            RecyclerView.p layoutManager2 = BroadcastResultActivity.this.Y3().J.getLayoutManager();
            jo.p.f(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            if (j02 == ((LinearLayoutManager) layoutManager2).i2() + childCount) {
                BroadcastResultActivity broadcastResultActivity = BroadcastResultActivity.this;
                String str = broadcastResultActivity.f23993h0;
                if (str == null) {
                    jo.p.v("liveId");
                    str = null;
                }
                broadcastResultActivity.l4(str, BroadcastResultActivity.this.f23992g0, false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<String> {
        public m() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return BroadcastResultActivity.this.Y ? Referer.LIVE_RESULT : Referer.LIVE_VIEWERS;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            BroadcastResultActivity.this.Y3().I.setVisibility(0);
            mc.a W3 = BroadcastResultActivity.this.W3();
            String c42 = BroadcastResultActivity.this.c4();
            String str = BroadcastResultActivity.this.f23993h0;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            W3.f(c42, str);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultActivity$showInAppReview$1", f = "BroadcastResultActivity.kt", l = {430, 431}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24026w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ gk.a f24027x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ BroadcastResultActivity f24028y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(gk.a aVar, BroadcastResultActivity broadcastResultActivity, ao.d<? super o> dVar) {
            super(2, dVar);
            this.f24027x = aVar;
            this.f24028y = broadcastResultActivity;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(this.f24027x, this.f24028y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24026w;
            try {
            } catch (Exception e10) {
                g9.a.c(e10);
            }
            if (i10 == 0) {
                wn.m.b(obj);
                gk.a aVar = this.f24027x;
                this.f24026w = 1;
                obj = ek.a.b(aVar, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    wn.m.b(obj);
                    this.f24028y.X3().a();
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            gk.a aVar2 = this.f24027x;
            BroadcastResultActivity broadcastResultActivity = this.f24028y;
            this.f24026w = 2;
            if (ek.a.a(aVar2, broadcastResultActivity, (ReviewInfo) obj, this) == c10) {
                return c10;
            }
            this.f24028y.X3().a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<wn.v> {
        public p() {
            super(0);
        }

        public final void a() {
            h3.a aVar = h3.U0;
            String c42 = BroadcastResultActivity.this.c4();
            String str = BroadcastResultActivity.this.f23993h0;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            aVar.a(c42, str).z3(BroadcastResultActivity.this.a3(), "MissionAchievementDialogFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24030w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24031x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24032y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24030w = componentCallbacks;
            this.f24031x = aVar;
            this.f24032y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24030w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f24031x, this.f24032y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<MirrorDatabase> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24033w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24034x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24035y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24033w = componentCallbacks;
            this.f24034x = aVar;
            this.f24035y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.database.MirrorDatabase] */
        @Override // io.a
        public final MirrorDatabase invoke() {
            ComponentCallbacks componentCallbacks = this.f24033w;
            return gq.a.a(componentCallbacks).c(f0.b(MirrorDatabase.class), this.f24034x, this.f24035y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24036w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24037x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24038y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24036w = componentCallbacks;
            this.f24037x = aVar;
            this.f24038y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24036w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f24037x, this.f24038y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<xe.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24039w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24040x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24041y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24039w = componentCallbacks;
            this.f24040x = aVar;
            this.f24041y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xe.a, java.lang.Object] */
        @Override // io.a
        public final xe.a invoke() {
            ComponentCallbacks componentCallbacks = this.f24039w;
            return gq.a.a(componentCallbacks).c(f0.b(xe.a.class), this.f24040x, this.f24041y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<mc.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24042w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24043x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24044y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24042w = componentCallbacks;
            this.f24043x = aVar;
            this.f24044y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [mc.m, java.lang.Object] */
        @Override // io.a
        public final mc.m invoke() {
            ComponentCallbacks componentCallbacks = this.f24042w;
            return gq.a.a(componentCallbacks).c(f0.b(mc.m.class), this.f24043x, this.f24044y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<mc.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24045w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24046x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24047y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24045w = componentCallbacks;
            this.f24046x = aVar;
            this.f24047y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mc.a] */
        @Override // io.a
        public final mc.a invoke() {
            ComponentCallbacks componentCallbacks = this.f24045w;
            return gq.a.a(componentCallbacks).c(f0.b(mc.a.class), this.f24046x, this.f24047y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<i0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24048w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24049x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24050y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24048w = componentCallbacks;
            this.f24049x = aVar;
            this.f24050y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.i0] */
        @Override // io.a
        public final i0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24048w;
            return gq.a.a(componentCallbacks).c(f0.b(i0.class), this.f24049x, this.f24050y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24051w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24052x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24051w = componentCallbacks;
            this.f24052x = aVar;
            this.f24053y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24051w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f24052x, this.f24053y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24054w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
            super(0);
            this.f24054w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24054w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24055w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24056x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24057y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24058z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24055w = aVar;
            this.f24056x = aVar2;
            this.f24057y = aVar3;
            this.f24058z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24055w;
            vq.a aVar2 = this.f24056x;
            io.a aVar3 = this.f24057y;
            xq.a aVar4 = this.f24058z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(c0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    public BroadcastResultActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new q(this, null, null));
        this.Q = wn.g.b(iVar, new r(this, null, null));
        this.R = wn.g.b(iVar, new s(this, null, null));
        this.S = wn.g.b(iVar, new t(this, null, null));
        this.T = wn.g.b(iVar, new u(this, null, null));
        this.U = wn.g.b(iVar, new v(this, null, null));
        this.V = wn.g.b(iVar, new w(this, null, null));
        this.W = new s0(f0.b(c0.class), new a0(this), new z(new y(this), null, null, gq.a.a(this)));
        this.X = wn.g.b(iVar, new x(this, null, null));
        this.f23991f0 = 1;
        this.f23992g0 = 1;
        this.f23996k0 = b3.b(null, 1, null);
        this.f23997l0 = wn.g.a(new b());
        this.f23998m0 = wn.g.a(new m());
        this.f23999n0 = new FragmentRunner(this);
    }

    public static final void i4(BroadcastResultActivity broadcastResultActivity, View view) {
        jo.p.h(broadcastResultActivity, "this$0");
        ChatStatus f10 = broadcastResultActivity.f4().m().f();
        if (f10 != null) {
            if (!f10.isEnabled()) {
                tb.a F = broadcastResultActivity.Z3().F(Referer.Broadcast.RESULT);
                F.a().z3(broadcastResultActivity.a3(), F.b());
                return;
            }
            BulkSendLogActionType bulkSendLogActionType = BulkSendLogActionType.POST_THANKS_AT_SAME_TIME_BTN_TAP;
            String str = broadcastResultActivity.f23993h0;
            String str2 = null;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            Puree.d(new BulkSendLog(bulkSendLogActionType, str, null));
            df.a aVar = broadcastResultActivity.f23995j0;
            if (aVar == null) {
                jo.p.v("eventLiveResult");
                aVar = null;
            }
            boolean U3 = broadcastResultActivity.U3(aVar);
            w.a aVar2 = mc.w.U0;
            String str3 = broadcastResultActivity.f23993h0;
            if (str3 == null) {
                jo.p.v("liveId");
            } else {
                str2 = str3;
            }
            mc.w a10 = aVar2.a(str2, broadcastResultActivity.f23986a0, broadcastResultActivity.f23987b0, U3);
            a10.l4(new c());
            a10.z3(broadcastResultActivity.a3(), a10.W0());
        }
    }

    public static final void n4(BroadcastResultActivity broadcastResultActivity, Long l10) {
        jo.p.h(broadcastResultActivity, "this$0");
        BroadcastResultPictureView broadcastResultPictureView = broadcastResultActivity.Y3().D;
        jo.p.g(l10, "it");
        broadcastResultPictureView.c(l10.longValue());
    }

    public static final void o4(BroadcastResultActivity broadcastResultActivity, BroadcastResult broadcastResult) {
        jo.p.h(broadcastResultActivity, "this$0");
        if (broadcastResult == null) {
            return;
        }
        broadcastResultActivity.f23989d0 = broadcastResult.getPostThanksToLiveWatchedUsersEnabled();
        if (broadcastResult.getEventType() != BroadcastResultEventType.NONE && broadcastResult.getEventType() != BroadcastResultEventType.DEBUT) {
            broadcastResultActivity.Y3().C.setListener(broadcastResultActivity);
        } else {
            broadcastResultActivity.d4().e();
        }
        broadcastResultActivity.Y3().C.a(broadcastResult.getEventType());
        BroadcastResultPictureView broadcastResultPictureView = broadcastResultActivity.Y3().D;
        df.a aVar = broadcastResultActivity.f23995j0;
        if (aVar == null) {
            jo.p.v("eventLiveResult");
            aVar = null;
        }
        broadcastResultPictureView.b(broadcastResult, aVar, broadcastResultActivity.Y);
        broadcastResultActivity.h4();
        broadcastResultActivity.y4();
    }

    public static final void p4(BroadcastResultActivity broadcastResultActivity, ChatStatus chatStatus) {
        jo.p.h(broadcastResultActivity, "this$0");
        if (chatStatus == null) {
            return;
        }
        broadcastResultActivity.w4();
        mc.l lVar = broadcastResultActivity.f23994i0;
        if (lVar == null) {
            jo.p.v("adapter");
            lVar = null;
        }
        lVar.k(!chatStatus.isUnder18());
    }

    public static final void q4(BroadcastResultActivity broadcastResultActivity, mc.y yVar) {
        jo.p.h(broadcastResultActivity, "this$0");
        if (yVar == null) {
            return;
        }
        broadcastResultActivity.f23991f0 = yVar.c();
        broadcastResultActivity.f23992g0 = yVar.e();
        mc.l lVar = broadcastResultActivity.f23994i0;
        if (lVar == null) {
            jo.p.v("adapter");
            lVar = null;
        }
        lVar.d(yVar.f());
        if (yVar.d()) {
            broadcastResultActivity.Y3().H.setEnabled(false);
            broadcastResultActivity.Z = true;
            hf.b.f35490a.h();
            FirebaseAnalytics.getInstance(broadcastResultActivity.getApplicationContext()).a("jdwii7", null);
            broadcastResultActivity.Y3().I.setVisibility(8);
        }
        broadcastResultActivity.w4();
        broadcastResultActivity.f23990e0 = false;
        broadcastResultActivity.y4();
    }

    public static final void r4(BroadcastResultActivity broadcastResultActivity, View view) {
        jo.p.h(broadcastResultActivity, "this$0");
        broadcastResultActivity.onBackPressed();
    }

    public static final void s4(BroadcastResultActivity broadcastResultActivity, AppBarLayout appBarLayout, int i10) {
        int i11;
        jo.p.h(broadcastResultActivity, "this$0");
        int height = broadcastResultActivity.Y3().N.getHeight();
        int height2 = broadcastResultActivity.Y3().D.getHeight();
        if (i10 == 0) {
            i11 = 0;
        } else {
            int i12 = -i10;
            int i13 = height2 - height;
            i11 = i12 < i13 ? (int) ((i12 * 255.0f) / i13) : 255;
        }
        broadcastResultActivity.Y3().N.getBackground().setAlpha(i11);
    }

    public static final boolean t4(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void x4(BroadcastResultActivity broadcastResultActivity, View view) {
        jo.p.h(broadcastResultActivity, "this$0");
        ChatStatus f10 = broadcastResultActivity.f4().m().f();
        if (f10 != null) {
            if (f10.isEnabled()) {
                mc.k.T0.a(broadcastResultActivity.c4()).z3(broadcastResultActivity.a3(), "BroadcastResultCustomThanksMessageDialog");
                return;
            }
            tb.a F = broadcastResultActivity.Z3().F(Referer.Broadcast.RESULT);
            F.a().z3(broadcastResultActivity.a3(), F.b());
        }
    }

    @Override // sd.g.b
    public void A(DialogInterface dialogInterface) {
        if (this.f23988c0) {
            this.f23988c0 = false;
            z4();
        }
    }

    public final void A4() {
        gk.a a10 = gk.b.a(this);
        jo.p.g(a10, "create(this)");
        uo.l.d(this, null, null, new o(a10, this, null), 3, null);
    }

    public final void B4() {
        this.f23999n0.c(new p());
    }

    public final void C4() {
        String f10 = g4().f();
        if (f10.length() > 0) {
            Y3().K.setText(f10);
        } else {
            Y3().K.setText(xb.r.text_desc_comm_thanks);
        }
    }

    @Override // vb.b
    public void P() {
        W3().i(ChatStatus.Companion.createChatAvailable());
    }

    @Override // vb.a
    public void P0(int i10) {
        BroadcastResult f10 = f4().l().f();
        boolean z10 = true;
        if (f10 == null || !f10.getHasReceivableMission()) {
            z10 = false;
        }
        if (z10) {
            B4();
        }
    }

    @Override // vb.e
    public void R1() {
        ChatStatus f10 = f4().m().f();
        if (f10 == null) {
            return;
        }
        u4(f10);
    }

    @Override // vb.c
    public void U1(boolean z10) {
        ChatStatus copy$default;
        ChatStatus f10 = f4().m().f();
        if (f10 == null || (copy$default = ChatStatus.copy$default(f10, false, false, z10, false, 10, null)) == null) {
            return;
        }
        W3().i(copy$default);
        u4(copy$default);
    }

    public final boolean U3(df.a aVar) {
        Integer b10;
        if ((aVar == null || (b10 = aVar.b()) == null || b10.intValue() != 0) ? false : true) {
            return true;
        }
        return (aVar == null || aVar.c()) ? false : true;
    }

    public final void V3(String str) {
        W3().g(c4(), str);
    }

    public final mc.a W3() {
        return (mc.a) this.U.getValue();
    }

    @Override // vb.d
    public void X(boolean z10, boolean z11) {
        ChatStatus copy$default;
        ChatStatus f10 = f4().m().f();
        if (f10 == null || (copy$default = ChatStatus.copy$default(f10, z10, false, z11, false, 8, null)) == null) {
            return;
        }
        W3().i(copy$default);
        u4(copy$default);
    }

    public final xe.a X3() {
        return (xe.a) this.S.getValue();
    }

    public final ac.a Y3() {
        Object value = this.f23997l0.getValue();
        jo.p.g(value, "<get-binding>(...)");
        return (ac.a) value;
    }

    public final tb.c Z3() {
        return (tb.c) this.X.getValue();
    }

    @Override // xe.d.b
    public void a() {
    }

    public final MRLogger a4() {
        return (MRLogger) this.R.getValue();
    }

    public final MirrorDatabase b4() {
        return (MirrorDatabase) this.Q.getValue();
    }

    public final String c4() {
        return (String) this.f23998m0.getValue();
    }

    @Override // com.dena.mirrativ.streaming.result.BroadcastResultBadgeView.a
    public void d() {
        d4().e();
    }

    public final i0 d4() {
        return (i0) this.V.getValue();
    }

    public final c0 e4() {
        return (c0) this.W.getValue();
    }

    public final mc.m f4() {
        return (mc.m) this.T.getValue();
    }

    public final v0 g4() {
        return (v0) this.P.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void h4() {
        w4();
        Y3().E.setOnClickListener(new View.OnClickListener() { // from class: mc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BroadcastResultActivity.i4(BroadcastResultActivity.this, view);
            }
        });
    }

    public final boolean j4(int i10) {
        if (this.Y) {
            return true;
        }
        return (i10 == 0 || this.f23989d0 == 0) ? false : true;
    }

    public final boolean k4(int i10) {
        return i10 > 0;
    }

    @Override // mc.k.b
    public void l2() {
        C4();
    }

    public final void l4(String str, int i10, boolean z10) {
        if (this.f23990e0 || this.f23991f0 > this.f23992g0) {
            return;
        }
        Integer valueOf = i10 > 1 ? Integer.valueOf(i10) : null;
        this.f23990e0 = true;
        W3().h(c4(), str, valueOf, z10);
    }

    public final void m4() {
        e4().h().i(this, new androidx.lifecycle.f0() { // from class: mc.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                BroadcastResultActivity.n4(BroadcastResultActivity.this, (Long) obj);
            }
        });
        f4().l().i(this, new androidx.lifecycle.f0() { // from class: mc.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                BroadcastResultActivity.o4(BroadcastResultActivity.this, (BroadcastResult) obj);
            }
        });
        f4().m().i(this, new androidx.lifecycle.f0() { // from class: mc.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                BroadcastResultActivity.p4(BroadcastResultActivity.this, (ChatStatus) obj);
            }
        });
        f4().p().i(this, new androidx.lifecycle.f0() { // from class: mc.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                BroadcastResultActivity.q4(BroadcastResultActivity.this, (y) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(androidx.lifecycle.v.a(this), null, null, new h(null), 3, null);
    }

    @Override // be.h3.b
    public void n() {
        startActivity(Z3().d0(this, c4()));
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.Y) {
            startActivity(Z3().v(this, null, null));
            finish();
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        dq.c.c().p(this);
        String stringExtra = getIntent().getStringExtra(MRLog.PAYLOAD_KEY_LIVE_ID);
        jo.p.e(stringExtra);
        this.f23993h0 = stringExtra;
        this.Y = getIntent().getBooleanExtra("after_finishing_broadcast", false);
        this.f23988c0 = getIntent().getBooleanExtra("should_show_app_rater", false);
        Serializable serializableExtra = getIntent().getSerializableExtra("event_live_result");
        jo.p.f(serializableExtra, "null cannot be cast to non-null type com.dena.mirrorman.feature.result.EventLiveResult");
        this.f23995j0 = (df.a) serializableExtra;
        Toolbar toolbar = Y3().N;
        toolbar.setNavigationIcon(xb.n.T);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: mc.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BroadcastResultActivity.r4(BroadcastResultActivity.this, view);
            }
        });
        Y3().B.b(new AppBarLayout.e() { // from class: mc.j
            @Override // com.google.android.material.appbar.AppBarLayout.c
            public final void a(AppBarLayout appBarLayout, int i10) {
                BroadcastResultActivity.s4(BroadcastResultActivity.this, appBarLayout, i10);
            }
        });
        if (this.f23988c0) {
            this.f23988c0 = false;
            z4();
        }
        mc.l lVar = new mc.l();
        lVar.h(new i());
        lVar.j(new j());
        lVar.i(new k());
        this.f23994i0 = lVar;
        RecyclerView recyclerView = Y3().J;
        mc.l lVar2 = this.f23994i0;
        String str2 = null;
        if (lVar2 == null) {
            jo.p.v("adapter");
            lVar2 = null;
        }
        recyclerView.setAdapter(lVar2);
        androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k(this, 1);
        Drawable f10 = c3.a.f(this, xb.n.divider_broadcast_result);
        jo.p.e(f10);
        kVar.n(f10);
        Y3().J.g(kVar);
        Y3().J.k(new l());
        m4();
        String str3 = this.f23993h0;
        if (str3 == null) {
            jo.p.v("liveId");
            str3 = null;
        }
        l4(str3, this.f23992g0, false);
        String str4 = this.f23993h0;
        if (str4 == null) {
            jo.p.v("liveId");
            str4 = null;
        }
        V3(str4);
        MRLogger a42 = a4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_RESULT_IMP);
        String c42 = c4();
        if (jo.p.c(c42, Referer.LIVE_RESULT)) {
            str = "live_end";
        } else {
            str = jo.p.c(c42, Referer.LIVE_VIEWERS) ? Referer.MY_PAGE : null;
        }
        builder.setPageId(str);
        String str5 = this.f23993h0;
        if (str5 == null) {
            jo.p.v("liveId");
            str5 = null;
        }
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str5)));
        a42.sendLog(builder.build());
        i0 d42 = d4();
        String c43 = c4();
        String str6 = this.f23993h0;
        if (str6 == null) {
            jo.p.v("liveId");
        } else {
            str2 = str6;
        }
        d42.c(c43, str2);
        Y3().C.setOnTouchListener(mc.e.f40763w);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        Y3().J.t();
        d2.a.a(this.f23996k0, null, 1, null);
        r0.d(this, null, 1, null);
        dq.c.c().r(this);
        super.onDestroy();
    }

    @dq.l
    public final void onEvent(df.a aVar) {
        jo.p.h(aVar, "event");
        String a10 = aVar.a();
        if (a10 != null) {
            if (a10.length() > 0) {
                if (b4().C().c(a10) == null) {
                    sd.g.U0.a(aVar.a(), Boolean.TRUE).z3(a3(), "WebViewDialogFragment");
                    b4().C().b(new zd.a(aVar.a(), null, 2, null));
                    return;
                }
                g9.a.g("[live_end anouncementurl] url is already shown :" + aVar.a());
            }
        }
    }

    @Override // xe.d.b
    public void q2(String str) {
        if (isFinishing()) {
            return;
        }
        if (str == null || so.n.r(str)) {
            return;
        }
        Puree.d(new Review(str, "ReviewRequire.show"));
        A4();
    }

    public final void u4(ChatStatus chatStatus) {
        if (chatStatus.getRequireGeneration()) {
            tb.a w10 = Z3().w(Referer.Broadcast.RESULT);
            w10.a().z3(a3(), w10.b());
        } else if (chatStatus.getRequireBirthday()) {
            tb.a L = Z3().L(Referer.Broadcast.RESULT);
            L.a().z3(a3(), L.b());
        } else if (chatStatus.getRequireChatConfirmationAgreement()) {
            tb.a f02 = Z3().f0(Referer.Broadcast.RESULT);
            f02.a().z3(a3(), f02.b());
        }
    }

    public final void v4() {
        this.f23991f0 = 1;
        this.f23992g0 = 1;
        String str = this.f23993h0;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        l4(str, this.f23992g0, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w4() {
        /*
            r6 = this;
            mc.l r0 = r6.f23994i0
            if (r0 != 0) goto La
            java.lang.String r0 = "adapter"
            jo.p.v(r0)
            r0 = 0
        La:
            int r0 = r0.getItemCount()
            boolean r1 = r6.k4(r0)
            r2 = 1
            r3 = 8
            r4 = 0
            if (r1 == 0) goto L4e
            mc.m r1 = r6.f4()
            androidx.lifecycle.LiveData r1 = r1.m()
            java.lang.Object r1 = r1.f()
            com.dena.mirrativ.mirrativapi.user.ChatStatus r1 = (com.dena.mirrativ.mirrativapi.user.ChatStatus) r1
            if (r1 == 0) goto L30
            boolean r1 = r1.isUnder18()
            if (r1 != 0) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = r4
        L31:
            if (r1 == 0) goto L4e
            ac.a r1 = r6.Y3()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.G
            r1.setVisibility(r4)
            r6.C4()
            ac.a r1 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r1 = r1.K
            mc.c r5 = new mc.c
            r5.<init>()
            r1.setOnClickListener(r5)
            goto L57
        L4e:
            ac.a r1 = r6.Y3()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.G
            r1.setVisibility(r3)
        L57:
            boolean r0 = r6.j4(r0)
            if (r0 == 0) goto L83
            ac.a r0 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.E
            r0.setEnabled(r2)
            ac.a r0 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.E
            r0.setVisibility(r4)
            ac.a r0 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.E
            android.content.Context r1 = r6.getApplicationContext()
            int r2 = xb.l.f59948t
            int r1 = c3.a.d(r1, r2)
            r0.setTextColor(r1)
            goto La8
        L83:
            ac.a r0 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.E
            r0.setEnabled(r4)
            ac.a r0 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.E
            r0.setVisibility(r3)
            ac.a r0 = r6.Y3()
            androidx.appcompat.widget.AppCompatTextView r0 = r0.E
            android.content.Context r1 = r6.getApplicationContext()
            int r2 = xb.l.f59944p
            int r1 = c3.a.d(r1, r2)
            r0.setTextColor(r1)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.result.BroadcastResultActivity.w4():void");
    }

    public final void y4() {
        if (this.Y) {
            mc.l lVar = this.f23994i0;
            if (lVar == null) {
                jo.p.v("adapter");
                lVar = null;
            }
            if (lVar.getItemCount() != 0 && this.f23989d0 != 0) {
                Y3().H.setVisibility(0);
                if (this.Z) {
                    Y3().H.setEnabled(false);
                    Y3().H.setTextColor(c3.a.d(getApplicationContext(), xb.l.f59952y));
                    Y3().H.setText(xb.r.text_btn_followed_all_title);
                    Y3().H.setCompoundDrawablesRelativeWithIntrinsicBounds(xb.n.ic_btn_followed, 0, 0, 0);
                    Y3().H.setBackgroundResource(xb.n.N0);
                } else {
                    Y3().H.setEnabled(true);
                    Y3().H.setTextColor(c3.a.e(getApplicationContext(), xb.l.btn_follow_all_text));
                    Y3().H.setText(xb.r.text_btn_follow_all_title);
                    Y3().H.setCompoundDrawablesRelativeWithIntrinsicBounds(xb.n.ic_btn_follow, 0, 0, 0);
                    Y3().H.setBackgroundResource(xb.n.btn_follow_all);
                }
                AppCompatTextView appCompatTextView = Y3().H;
                jo.p.g(appCompatTextView, "binding.followAllButtonTextView");
                g1.a(appCompatTextView, new n());
                Y3().o();
            }
        }
        Y3().H.setVisibility(8);
        Y3().o();
    }

    public final void z4() {
        if (isFinishing()) {
            return;
        }
        String str = null;
        if (X3().d()) {
            String str2 = this.f23993h0;
            if (str2 == null) {
                jo.p.v("liveId");
                str2 = null;
            }
            Puree.d(new Review(str2, "SatisfactionConfirm.show"));
            d.a aVar = xe.d.O0;
            String str3 = this.f23993h0;
            if (str3 == null) {
                jo.p.v("liveId");
            } else {
                str = str3;
            }
            aVar.a(str, true).z3(a3(), "SatisfactionConfirmDialog");
            return;
        }
        String str4 = this.f23993h0;
        if (str4 == null) {
            jo.p.v("liveId");
        } else {
            str = str4;
        }
        Puree.d(new Review(str, "ReviewRequire.show"));
        A4();
    }

    @dq.l
    public final void onEvent(mc.x xVar) {
        jo.p.h(xVar, "event");
        String l10 = xVar.a().l();
        if (!g4().i(l10)) {
            v0 g42 = g4();
            FragmentManager a32 = a3();
            jo.p.g(a32, "supportFragmentManager");
            if (!v0.c(g42, a32, c4(), false, 4, null)) {
                return;
            }
        }
        String c42 = c4();
        String simpleName = BroadcastResultActivity.class.getSimpleName();
        jo.p.g(simpleName, "javaClass.simpleName");
        g9.a.j(l10, c42, simpleName, "forResult");
        startActivity(Z3().s(this, l10, c4()));
    }
}
