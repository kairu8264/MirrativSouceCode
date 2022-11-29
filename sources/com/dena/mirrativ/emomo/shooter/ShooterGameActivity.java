package com.dena.mirrativ.emomo.shooter;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import be.s3;
import be.t3;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.fragment.EmomoGameViewFragment;
import com.dena.mirrorman.fragment.PlayerCommentFragment;
import com.dena.mirrorman.fragment.StreamEmomoCommentFragment;
import com.dena.mirrorman.net.api.response.event.DiarkisAuthInfoResponse;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.api.response.event.ShooterGroupStatus;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatar;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatarsResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import com.dena.mirrorman.net.api.response.event.ShooterTeamResultResponse;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateMemberResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateTeamResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMemberStateChangedBcsvrResponse;
import com.dena.mirrorman.unity.EmomoGameName;
import com.dena.mirrorman.unity.MiniGameStateType;
import com.dena.mirrorman.unity.ShooterAnalysisLogPayload;
import com.dena.mirrorman.unity.ShooterNotifyRoomId;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityMiniGameOutputShooterGameOver;
import com.dena.mirrorman.unity.UnityMiniGameResult;
import com.dena.mirrorman.unity.UnityStore;
import com.dena.mirrorman.util.FragmentRunner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import uo.b1;
import uo.g1;

/* loaded from: classes.dex */
public final class ShooterGameActivity extends e.b implements t3, uo.q0 {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f21208h0 = new a(null);

    /* renamed from: i0  reason: collision with root package name */
    public static final int f21209i0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final EmomoGameName W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21210a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f21211b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f21212c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f21213d0;

    /* renamed from: e0  reason: collision with root package name */
    public final FragmentRunner f21214e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f21215f0;

    /* renamed from: g0  reason: collision with root package name */
    public List<Integer> f21216g0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, boolean z10, boolean z11, int i10, int i11, int i12, String str, String str2) {
            jo.p.h(context, "context");
            jo.p.h(str, "stageId");
            Intent intent = new Intent(context, ShooterGameActivity.class);
            intent.putExtra("EXTRA_IS_HOST", z10);
            intent.putExtra("EXTRA_IS_STREAMER", z11);
            intent.putExtra("EXTRA_SEASON_ID", i10);
            intent.putExtra("EXTRA_GROUP_ID", i11);
            intent.putExtra("EXTRA_TEAM_ID", i12);
            intent.putExtra("EXTRA_STAGE_ID", str);
            intent.putExtra("EXTRA_LIVE_ID", str2);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$11", f = "ShooterGameActivity.kt", l = {464}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21217w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends ShooterAnalysisLogPayload>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21219w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21219w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, ShooterAnalysisLogPayload> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                ShooterAnalysisLogPayload b10 = kVar.b();
                if (this.f21219w.W != a10) {
                    return wn.v.f59242a;
                }
                MRLogger T3 = this.f21219w.T3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SHOOTER_ANALYSIS_LOG);
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, b10.getPayload())));
                T3.sendLog(builder.build());
                return wn.v.f59242a;
            }
        }

        public a0(ao.d<? super a0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21217w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, ShooterAnalysisLogPayload>> miniGameOutputShooterAnalysisLogFlow = ShooterGameActivity.this.b4().getMiniGameOutputShooterAnalysisLogFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21217w = 1;
                if (miniGameOutputShooterAnalysisLogFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$closeGameIfNeeded$2", f = "ShooterGameActivity.kt", l = {525, 532}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21220w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21220w;
            if (i10 == 0) {
                wn.m.b(obj);
                if (ShooterGameActivity.this.X3().B().getValue() != MiniGameStateType.GAMEOVER) {
                    ShooterGameActivity.this.W3().m(ShooterGameActivity.this.U3(), ShooterGameActivity.this.R3(), ShooterGameActivity.this.Z3(), ShooterMemberStatus.RETIRED, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null);
                }
                ShooterGameActivity.this.a4().shooterCloseGame();
                this.f21220w = 1;
                if (b1.a(500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                ShooterGameActivity.this.setResult(-1);
                ShooterGameActivity.this.finish();
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            ShooterGameActivity.this.a4().endGame(ShooterGameActivity.this.W);
            this.f21220w = 2;
            if (b1.a(500L, this) == c10) {
                return c10;
            }
            ShooterGameActivity.this.setResult(-1);
            ShooterGameActivity.this.finish();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$12", f = "ShooterGameActivity.kt", l = {476}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21222w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21224w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21224w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f21224w.W != this.f21224w.W) {
                    return wn.v.f59242a;
                }
                ShooterGameActivity.Q3(this.f21224w, null, 1, null);
                return wn.v.f59242a;
            }
        }

        public b0(ao.d<? super b0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21222w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputCloseGameFlow = ShooterGameActivity.this.b4().getMiniGameOutputCloseGameFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21222w = 1;
                if (miniGameOutputCloseGameFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$closeShooterCommentInputDialogFragmentListener$1", f = "ShooterGameActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21225w;

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
            bo.c.c();
            if (this.f21225w == 0) {
                wn.m.b(obj);
                ShooterGameActivity.this.a4().shooterCloseKeyboard();
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$2", f = "ShooterGameActivity.kt", l = {376}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21227w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21229w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21229w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                ShooterGameActivity.Q3(this.f21229w, null, 1, null);
                return wn.v.f59242a;
            }
        }

        public c0(ao.d<? super c0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21227w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> loadMiniGameFailedFlow = ShooterGameActivity.this.b4().getLoadMiniGameFailedFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21227w = 1;
                if (loadMiniGameFailedFlow.a(aVar, this) == c10) {
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
    public static final class d extends jo.q implements io.a<Integer> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(ShooterGameActivity.this.getIntent().getIntExtra("EXTRA_GROUP_ID", 0));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$3", f = "ShooterGameActivity.kt", l = {382}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21231w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21233w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21233w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f21233w.W != this.f21233w.W) {
                    return wn.v.f59242a;
                }
                this.f21233w.W3().l(MiniGameStateType.PLAYING);
                this.f21233w.W3().m(this.f21233w.U3(), this.f21233w.R3(), this.f21233w.Z3(), ShooterMemberStatus.PLAYING, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null);
                return wn.v.f59242a;
            }
        }

        public d0(ao.d<? super d0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21231w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputStartedFlow = ShooterGameActivity.this.b4().getMiniGameOutputStartedFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21231w = 1;
                if (miniGameOutputStartedFlow.a(aVar, this) == c10) {
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
    public static final class e extends jo.q implements io.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(ShooterGameActivity.this.getIntent().getBooleanExtra("EXTRA_IS_HOST", false));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$4", f = "ShooterGameActivity.kt", l = {394}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21235w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21237w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21237w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f21237w.W != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21237w.W3().d();
                return wn.v.f59242a;
            }
        }

        public e0(ao.d<? super e0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21235w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputRequestAuthInfoFlow = ShooterGameActivity.this.b4().getMiniGameOutputRequestAuthInfoFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21235w = 1;
                if (miniGameOutputRequestAuthInfoFlow.a(aVar, this) == c10) {
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
    public static final class f extends jo.q implements io.a<Boolean> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(ShooterGameActivity.this.getIntent().getBooleanExtra("EXTRA_IS_STREAMER", false));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$5", f = "ShooterGameActivity.kt", l = {400}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21239w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterNotifyRoomId> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21241w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21241w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterNotifyRoomId shooterNotifyRoomId, ao.d<? super wn.v> dVar) {
                if (this.f21241w.W != shooterNotifyRoomId.getGameName()) {
                    return wn.v.f59242a;
                }
                this.f21241w.j4(MRLog.ACTION_TYPE_SHOOTER_HOST_CREATE_ROOM);
                this.f21241w.W3().i(shooterNotifyRoomId.getRoomId());
                return wn.v.f59242a;
            }
        }

        public f0(ao.d<? super f0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21239w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<ShooterNotifyRoomId> miniGameOutputShooterNotifyRoomIdFlow = ShooterGameActivity.this.b4().getMiniGameOutputShooterNotifyRoomIdFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21239w = 1;
                if (miniGameOutputShooterNotifyRoomIdFlow.a(aVar, this) == c10) {
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
    public static final class g extends jo.q implements io.a<String> {
        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return ShooterGameActivity.this.getIntent().getStringExtra("EXTRA_LIVE_ID");
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$6", f = "ShooterGameActivity.kt", l = {407}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21243w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21245w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21245w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f21245w.W != this.f21245w.W) {
                    return wn.v.f59242a;
                }
                ShooterGameActivity shooterGameActivity = this.f21245w;
                shooterGameActivity.j4(shooterGameActivity.d4() ? MRLog.ACTION_TYPE_SHOOTER_HOST_WAIT_AT_LOBBY : MRLog.ACTION_TYPE_SHOOTER_CLIENT_WAIT_AT_LOBBY);
                return wn.v.f59242a;
            }
        }

        public g0(ao.d<? super g0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21243w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputShooterWaitingFlow = ShooterGameActivity.this.b4().getMiniGameOutputShooterWaitingFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21243w = 1;
                if (miniGameOutputShooterWaitingFlow.a(aVar, this) == c10) {
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
    public static final class h extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s9.i f21247x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(s9.i iVar) {
            super(0);
            this.f21247x = iVar;
        }

        public final void a() {
            ShooterGameActivity.this.a3().k().s(this.f21247x.B.getId(), EmomoGameViewFragment.f26056y0.a(), "EmomoGameViewFragment").i();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$7", f = "ShooterGameActivity.kt", l = {419}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21248w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<UnityMiniGameOutputShooterGameOver> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21250w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21250w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityMiniGameOutputShooterGameOver unityMiniGameOutputShooterGameOver, ao.d<? super wn.v> dVar) {
                this.f21250w.W3().l(MiniGameStateType.GAMEOVER);
                this.f21250w.W3().m(this.f21250w.U3(), this.f21250w.R3(), this.f21250w.Z3(), ShooterMemberStatus.FINISHED, co.b.d(unityMiniGameOutputShooterGameOver.getRank()), co.b.d(unityMiniGameOutputShooterGameOver.getKickNum()), co.b.d(unityMiniGameOutputShooterGameOver.getLife()), co.b.d(unityMiniGameOutputShooterGameOver.getGameTeamRank()), co.b.d(unityMiniGameOutputShooterGameOver.getGameTeamPoint()), co.b.d(unityMiniGameOutputShooterGameOver.getFlagWavingCount()), co.b.d(unityMiniGameOutputShooterGameOver.getFlagPlunderCount()));
                return wn.v.f59242a;
            }
        }

        public h0(ao.d<? super h0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21248w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityMiniGameOutputShooterGameOver> miniGameOutputShooterGameOverFlow = ShooterGameActivity.this.b4().getMiniGameOutputShooterGameOverFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21248w = 1;
                if (miniGameOutputShooterGameOverFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$1", f = "ShooterGameActivity.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21251w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterEventResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21253w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21253w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterEventResponse shooterEventResponse, ao.d<? super wn.v> dVar) {
                this.f21253w.W3().f(this.f21253w.U3(), this.f21253w.R3(), this.f21253w.Z3());
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
            int i10 = this.f21251w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ShooterEventResponse> x10 = ShooterGameActivity.this.X3().x();
                a aVar = new a(ShooterGameActivity.this);
                this.f21251w = 1;
                if (x10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$8", f = "ShooterGameActivity.kt", l = {437}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21254w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends UnityMiniGameResult>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21256w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21256w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, UnityMiniGameResult> kVar, ao.d<? super wn.v> dVar) {
                if (this.f21256w.W != kVar.a()) {
                    return wn.v.f59242a;
                }
                this.f21256w.W3().g("SHOOTER_GAME", this.f21256w.U3(), this.f21256w.R3(), this.f21256w.Z3());
                return wn.v.f59242a;
            }
        }

        public i0(ao.d<? super i0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21254w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, UnityMiniGameResult>> miniGameOutputResultFlow = ShooterGameActivity.this.b4().getMiniGameOutputResultFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21254w = 1;
                if (miniGameOutputResultFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$10", f = "ShooterGameActivity.kt", l = {260}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21257w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21259w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21259w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                ShooterGameActivity shooterGameActivity = this.f21259w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = "";
                }
                shooterGameActivity.P3(message);
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
            int i10 = this.f21257w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> K = ShooterGameActivity.this.X3().K();
                a aVar = new a(ShooterGameActivity.this);
                this.f21257w = 1;
                if (K.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$9", f = "ShooterGameActivity.kt", l = {448}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21260w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21262w;

            /* renamed from: com.dena.mirrativ.emomo.shooter.ShooterGameActivity$j0$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0186a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ ShooterGameActivity f21263w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0186a(ShooterGameActivity shooterGameActivity) {
                    super(0);
                    this.f21263w = shooterGameActivity;
                }

                public final void a() {
                    s3.O0.a().z3(this.f21263w.a3(), "ShooterCommentInputDialogFragment");
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21262w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f21262w.W != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21262w.f21214e0.c(new C0186a(this.f21262w));
                return wn.v.f59242a;
            }
        }

        public j0(ao.d<? super j0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21260w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputShowCommentFlow = ShooterGameActivity.this.b4().getMiniGameOutputShowCommentFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21260w = 1;
                if (miniGameOutputShowCommentFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$11", f = "ShooterGameActivity.kt", l = {267}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21264w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterTeamResultResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21266w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21266w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterTeamResultResponse shooterTeamResultResponse, ao.d<? super wn.v> dVar) {
                this.f21266w.a4().shooterSetTeamResult(this.f21266w.X3().H(), this.f21266w.X3().D(), shooterTeamResultResponse, this.f21266w.X3().J());
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
            int i10 = this.f21264w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ShooterTeamResultResponse> A = ShooterGameActivity.this.X3().A();
                a aVar = new a(ShooterGameActivity.this);
                this.f21264w = 1;
                if (A.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class k0 extends jo.q implements io.a<Integer> {
        public k0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(ShooterGameActivity.this.getIntent().getIntExtra("EXTRA_SEASON_ID", 0));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$12", f = "ShooterGameActivity.kt", l = {278}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21268w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f21270w = new a();

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                return wn.v.f59242a;
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
            int i10 = this.f21268w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> C = ShooterGameActivity.this.X3().C();
                a aVar = a.f21270w;
                this.f21268w = 1;
                if (C.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$sendCommentShooterCommentInputDialogFragmentListener$1", f = "ShooterGameActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21271w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f21273y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(String str, ao.d<? super l0> dVar) {
            super(2, dVar);
            this.f21273y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l0(this.f21273y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f21271w == 0) {
                wn.m.b(obj);
                od.k0 W3 = ShooterGameActivity.this.W3();
                String S3 = ShooterGameActivity.this.S3();
                jo.p.e(S3);
                W3.j("SHOOTER_GAME", S3, 1, this.f21273y);
                Fragment e02 = ShooterGameActivity.this.a3().e0("ShooterCommentInputDialogFragment");
                androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
                if (eVar != null) {
                    eVar.n3();
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$13", f = "ShooterGameActivity.kt", l = {284}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21274w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21276w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21276w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                if (str.length() == 0) {
                    return wn.v.f59242a;
                }
                if (!this.f21276w.d4()) {
                    if (this.f21276w.X3().B().getValue() == MiniGameStateType.LOADED) {
                        this.f21276w.a4().shooterSetRoomId(str);
                        this.f21276w.W3().l(MiniGameStateType.STARTING);
                    }
                } else {
                    this.f21276w.W3().o(this.f21276w.U3(), this.f21276w.R3(), this.f21276w.Z3(), str, ShooterTeamStatus.LAUNCHING);
                }
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
            int i10 = this.f21274w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.g0<String> G = ShooterGameActivity.this.X3().G();
                a aVar = new a(ShooterGameActivity.this);
                this.f21274w = 1;
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

    /* loaded from: classes.dex */
    public static final class m0 extends jo.q implements io.l<View, wn.v> {

        @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$setupUserActions$1$1", f = "ShooterGameActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f21278w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21279x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ShooterGameActivity shooterGameActivity, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f21279x = shooterGameActivity;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f21279x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f21278w == 0) {
                    wn.m.b(obj);
                    ShooterGameActivity.Q3(this.f21279x, null, 1, null);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public m0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ShooterGameActivity shooterGameActivity = ShooterGameActivity.this;
            uo.l.d(shooterGameActivity, null, null, new a(shooterGameActivity, null), 3, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$14", f = "ShooterGameActivity.kt", l = {302}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21280w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterMatchingStateChangedBcsvrResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21282w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21282w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterMatchingStateChangedBcsvrResponse shooterMatchingStateChangedBcsvrResponse, ao.d<? super wn.v> dVar) {
                if ((shooterMatchingStateChangedBcsvrResponse.getMatchingStatus() == ShooterTeamStatus.MATCHED || shooterMatchingStateChangedBcsvrResponse.getMatchingStatus() == ShooterTeamStatus.LAUNCHING) && shooterMatchingStateChangedBcsvrResponse.getGroupStatus() == ShooterGroupStatus.LAUNCHING) {
                    od.k0 W3 = this.f21282w.W3();
                    String roomId = shooterMatchingStateChangedBcsvrResponse.getRoomId();
                    if (roomId == null) {
                        roomId = "";
                    }
                    W3.i(roomId);
                }
                if (shooterMatchingStateChangedBcsvrResponse.getMatchingStatus() == ShooterTeamStatus.CANCELED) {
                    ShooterGameActivity shooterGameActivity = this.f21282w;
                    String string = shooterGameActivity.getString(q9.i.text_shooter_game_canceled_by_host);
                    jo.p.g(string, "getString(R.string.text_…er_game_canceled_by_host)");
                    shooterGameActivity.P3(string);
                }
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
            int i10 = this.f21280w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ShooterMatchingStateChangedBcsvrResponse> E = ShooterGameActivity.this.X3().E();
                a aVar = new a(ShooterGameActivity.this);
                this.f21280w = 1;
                if (E.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class n0 extends jo.q implements io.a<od.k0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21283w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21284x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21285y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21283w = componentCallbacks;
            this.f21284x = aVar;
            this.f21285y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.k0, java.lang.Object] */
        @Override // io.a
        public final od.k0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21283w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.k0.class), this.f21284x, this.f21285y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$15", f = "ShooterGameActivity.kt", l = {315}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21286w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterMemberStateChangedBcsvrResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21288w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21288w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse, ao.d<? super wn.v> dVar) {
                if (shooterMemberStateChangedBcsvrResponse.getTeamId() != this.f21288w.Z3() && jo.p.c(shooterMemberStateChangedBcsvrResponse.getUserId(), this.f21288w.c4().T4()) && shooterMemberStateChangedBcsvrResponse.getInviteStatus() == ShooterMemberStatus.INVITING) {
                    this.f21288w.W3().m(shooterMemberStateChangedBcsvrResponse.getSeasonId(), 0, shooterMemberStateChangedBcsvrResponse.getTeamId(), ShooterMemberStatus.BUSY, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null);
                }
                if (shooterMemberStateChangedBcsvrResponse.getTeamId() == this.f21288w.Z3() && shooterMemberStateChangedBcsvrResponse.getInviteStatus() == ShooterMemberStatus.RETIRED) {
                    MiniGameStateType miniGameStateType = MiniGameStateType.UNLOADED;
                    MiniGameStateType miniGameStateType2 = MiniGameStateType.LOADING;
                    if (xn.s.m(miniGameStateType, miniGameStateType2, MiniGameStateType.LOADED).contains(this.f21288w.X3().B().getValue()) && shooterMemberStateChangedBcsvrResponse.getMemberType() == ShooterMemberType.HOST && !this.f21288w.d4()) {
                        ShooterGameActivity shooterGameActivity = this.f21288w;
                        String string = shooterGameActivity.getString(q9.i.text_shooter_game_canceled_by_host);
                        jo.p.g(string, "getString(R.string.text_…er_game_canceled_by_host)");
                        shooterGameActivity.P3(string);
                    }
                    if (xn.s.m(miniGameStateType, miniGameStateType2).contains(this.f21288w.X3().B().getValue())) {
                        if (this.f21288w.f21216g0.contains(co.b.d(Integer.parseInt(shooterMemberStateChangedBcsvrResponse.getUserId())))) {
                            this.f21288w.f21216g0.add(co.b.d(Integer.parseInt(shooterMemberStateChangedBcsvrResponse.getUserId())));
                        }
                    } else {
                        this.f21288w.a4().shooterRetireGame(Integer.parseInt(shooterMemberStateChangedBcsvrResponse.getUserId()));
                    }
                }
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
            int i10 = this.f21286w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ShooterMemberStateChangedBcsvrResponse> F = ShooterGameActivity.this.X3().F();
                a aVar = new a(ShooterGameActivity.this);
                this.f21286w = 1;
                if (F.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class o0 extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21289w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21290x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21291y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21289w = componentCallbacks;
            this.f21290x = aVar;
            this.f21291y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f21289w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f21290x, this.f21291y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$16", f = "ShooterGameActivity.kt", l = {347}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21292w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21294w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21294w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                ShooterGameActivity.Q3(this.f21294w, null, 1, null);
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
            int i10 = this.f21292w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> t10 = ShooterGameActivity.this.X3().t();
                a aVar = new a(ShooterGameActivity.this);
                this.f21292w = 1;
                if (t10.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class p0 extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21295w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21296x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21297y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21295w = componentCallbacks;
            this.f21296x = aVar;
            this.f21297y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f21295w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f21296x, this.f21297y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$2", f = "ShooterGameActivity.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21298w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21300w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21300w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                ShooterGameActivity shooterGameActivity = this.f21300w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = "";
                }
                shooterGameActivity.P3(message);
                return wn.v.f59242a;
            }
        }

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
            int i10 = this.f21298w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> w10 = ShooterGameActivity.this.X3().w();
                a aVar = new a(ShooterGameActivity.this);
                this.f21298w = 1;
                if (w10.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class q0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21301w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21302x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21303y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21301w = componentCallbacks;
            this.f21302x = aVar;
            this.f21303y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21301w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f21302x, this.f21303y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$3", f = "ShooterGameActivity.kt", l = {195}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21304w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s9.i f21306y;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterMemberAvatarsResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21307w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s9.i f21308x;

            public a(ShooterGameActivity shooterGameActivity, s9.i iVar) {
                this.f21307w = shooterGameActivity;
                this.f21308x = iVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterMemberAvatarsResponse shooterMemberAvatarsResponse, ao.d<? super wn.v> dVar) {
                ShooterGameActivity shooterGameActivity = this.f21307w;
                shooterGameActivity.j4(shooterGameActivity.d4() ? MRLog.ACTION_TYPE_SHOOTER_HOST_FETCH_INFORMATION : MRLog.ACTION_TYPE_SHOOTER_CLIENT_FETCH_INFORMATION);
                List list = this.f21307w.f21216g0;
                List<ShooterMemberAvatar> viewers = shooterMemberAvatarsResponse.getViewers();
                ArrayList<ShooterMemberAvatar> arrayList = new ArrayList();
                for (Object obj : viewers) {
                    if (((ShooterMemberAvatar) obj).getUser().getMemberStatus() == ShooterMemberStatus.RETIRED) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
                for (ShooterMemberAvatar shooterMemberAvatar : arrayList) {
                    arrayList2.add(co.b.d(shooterMemberAvatar.getUser().getUserId()));
                }
                list.addAll(arrayList2);
                this.f21307w.a4().shooterLoad(shooterMemberAvatarsResponse, this.f21307w.Y3(), this.f21307w.d4());
                this.f21307w.a4().shooterSetSeasonNo(this.f21307w.X3().I());
                this.f21307w.a4().shooterSetRewards(this.f21307w.X3().H());
                this.f21307w.a4().shooterSetRatingRewards(this.f21307w.X3().D());
                this.f21307w.W3().l(MiniGameStateType.LOADING);
                this.f21307w.W3().m(this.f21307w.U3(), this.f21307w.R3(), this.f21307w.Z3(), ShooterMemberStatus.LAUNCHING, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null);
                this.f21307w.f4(this.f21308x);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(s9.i iVar, ao.d<? super r> dVar) {
            super(2, dVar);
            this.f21306y = iVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(this.f21306y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21304w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ShooterMemberAvatarsResponse> z10 = ShooterGameActivity.this.X3().z();
                a aVar = new a(ShooterGameActivity.this, this.f21306y);
                this.f21304w = 1;
                if (z10.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class r0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21309w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21310x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21311y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21309w = componentCallbacks;
            this.f21310x = aVar;
            this.f21311y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f21309w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f21310x, this.f21311y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$4", f = "ShooterGameActivity.kt", l = {215}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21312w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21314w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21314w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                ShooterGameActivity shooterGameActivity = this.f21314w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = "";
                }
                shooterGameActivity.P3(message);
                return wn.v.f59242a;
            }
        }

        public s(ao.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21312w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> y10 = ShooterGameActivity.this.X3().y();
                a aVar = new a(ShooterGameActivity.this);
                this.f21312w = 1;
                if (y10.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class s0 extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21315w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21316x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21317y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21315w = componentCallbacks;
            this.f21316x = aVar;
            this.f21317y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f21315w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f21316x, this.f21317y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$5", f = "ShooterGameActivity.kt", l = {223}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21318w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<DiarkisAuthInfoResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21320w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21320w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(DiarkisAuthInfoResponse diarkisAuthInfoResponse, ao.d<? super wn.v> dVar) {
                this.f21320w.a4().shooterSetDiarkisAuthInfo(diarkisAuthInfoResponse);
                return wn.v.f59242a;
            }
        }

        public t(ao.d<? super t> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21318w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<DiarkisAuthInfoResponse> v10 = ShooterGameActivity.this.X3().v();
                a aVar = new a(ShooterGameActivity.this);
                this.f21318w = 1;
                if (v10.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class t0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21321w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(ComponentActivity componentActivity) {
            super(0);
            this.f21321w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21321w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$6", f = "ShooterGameActivity.kt", l = {228}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21322w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21324w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21324w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                ShooterGameActivity shooterGameActivity = this.f21324w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = "";
                }
                shooterGameActivity.P3(message);
                return wn.v.f59242a;
            }
        }

        public u(ao.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21322w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> u10 = ShooterGameActivity.this.X3().u();
                a aVar = new a(ShooterGameActivity.this);
                this.f21322w = 1;
                if (u10.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class u0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21325w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21326x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21327y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21328z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21325w = aVar;
            this.f21326x = aVar2;
            this.f21327y = aVar3;
            this.f21328z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21325w;
            vq.a aVar2 = this.f21326x;
            io.a aVar3 = this.f21327y;
            xq.a aVar4 = this.f21328z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$7", f = "ShooterGameActivity.kt", l = {235}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21329w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterUpdateTeamResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21331w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21331w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterUpdateTeamResponse shooterUpdateTeamResponse, ao.d<? super wn.v> dVar) {
                if (shooterUpdateTeamResponse.getTeamStatus() == ShooterTeamStatus.LAUNCHING) {
                    this.f21331w.j4(MRLog.ACTION_TYPE_SHOOTER_HOST_ROOM_ID_SEND);
                }
                return wn.v.f59242a;
            }
        }

        public v(ao.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21329w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ShooterUpdateTeamResponse> N = ShooterGameActivity.this.X3().N();
                a aVar = new a(ShooterGameActivity.this);
                this.f21329w = 1;
                if (N.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class v0 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21332w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(ComponentActivity componentActivity) {
            super(0);
            this.f21332w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f21332w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$8", f = "ShooterGameActivity.kt", l = {242}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21333w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21335w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21335w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                ShooterGameActivity shooterGameActivity = this.f21335w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = "";
                }
                shooterGameActivity.P3(message);
                return wn.v.f59242a;
            }
        }

        public w(ao.d<? super w> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21333w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> M = ShooterGameActivity.this.X3().M();
                a aVar = new a(ShooterGameActivity.this);
                this.f21333w = 1;
                if (M.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class w0 extends jo.q implements io.a<String> {
        public w0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = ShooterGameActivity.this.getIntent().getStringExtra("EXTRA_STAGE_ID");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeShooterGameStoreValues$9", f = "ShooterGameActivity.kt", l = {249}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21337w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ShooterUpdateMemberResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21339w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21339w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterUpdateMemberResponse shooterUpdateMemberResponse, ao.d<? super wn.v> dVar) {
                if (shooterUpdateMemberResponse.getMemberStatus() == ShooterMemberStatus.LAUNCHING) {
                    this.f21339w.W3().i(shooterUpdateMemberResponse.getRoomId());
                }
                if (shooterUpdateMemberResponse.getMemberStatus() == ShooterMemberStatus.FINISHED) {
                    this.f21339w.a4().shooterSetMemberResult(shooterUpdateMemberResponse);
                }
                return wn.v.f59242a;
            }
        }

        public x(ao.d<? super x> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21337w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<ShooterUpdateMemberResponse> L = ShooterGameActivity.this.X3().L();
                a aVar = new a(ShooterGameActivity.this);
                this.f21337w = 1;
                if (L.a(aVar, this) == c10) {
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

    /* loaded from: classes.dex */
    public static final class x0 extends jo.q implements io.a<Integer> {
        public x0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(ShooterGameActivity.this.getIntent().getIntExtra("EXTRA_TEAM_ID", 0));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$1", f = "ShooterGameActivity.kt", l = {355}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21341w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21343w;

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21343w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f21343w.W != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21343w.W3().l(MiniGameStateType.LOADED);
                if (!this.f21343w.d4()) {
                    String value = this.f21343w.X3().G().getValue();
                    if (value.length() > 0) {
                        this.f21343w.a4().shooterSetRoomId(value);
                        this.f21343w.W3().l(MiniGameStateType.STARTING);
                    }
                }
                List<Number> list = this.f21343w.f21216g0;
                ShooterGameActivity shooterGameActivity = this.f21343w;
                for (Number number : list) {
                    shooterGameActivity.a4().shooterRetireGame(number.intValue());
                }
                ShooterGameActivity shooterGameActivity2 = this.f21343w;
                shooterGameActivity2.j4(shooterGameActivity2.d4() ? MRLog.ACTION_TYPE_SHOOTER_HOST_UNITY_LAUNCH : MRLog.ACTION_TYPE_SHOOTER_CLIENT_UNITY_LAUNCH);
                return wn.v.f59242a;
            }
        }

        public y(ao.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21341w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> loadMiniGameCompletedFlow = ShooterGameActivity.this.b4().getLoadMiniGameCompletedFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21341w = 1;
                if (loadMiniGameCompletedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.shooter.ShooterGameActivity$observeUnityStoreValues$10", f = "ShooterGameActivity.kt", l = {456}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21344w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ShooterGameActivity f21346w;

            /* renamed from: com.dena.mirrativ.emomo.shooter.ShooterGameActivity$z$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0187a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ ShooterGameActivity f21347w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0187a(ShooterGameActivity shooterGameActivity) {
                    super(0);
                    this.f21347w = shooterGameActivity;
                }

                public final void a() {
                    Fragment e02 = this.f21347w.a3().e0("ShooterCommentInputDialogFragment");
                    androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
                    if (eVar != null) {
                        eVar.n3();
                    }
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(ShooterGameActivity shooterGameActivity) {
                this.f21346w = shooterGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f21346w.W != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21346w.f21214e0.c(new C0187a(this.f21346w));
                return wn.v.f59242a;
            }
        }

        public z(ao.d<? super z> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21344w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputHideCommentFlow = ShooterGameActivity.this.b4().getMiniGameOutputHideCommentFlow();
                a aVar = new a(ShooterGameActivity.this);
                this.f21344w = 1;
                if (miniGameOutputHideCommentFlow.a(aVar, this) == c10) {
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

    public ShooterGameActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new n0(this, null, null));
        this.Q = new androidx.lifecycle.s0(jo.f0.b(nf.e0.class), new v0(this), new u0(new t0(this), null, null, gq.a.a(this)));
        this.R = wn.g.b(iVar, new o0(this, null, null));
        this.S = wn.g.b(iVar, new p0(this, null, null));
        this.T = wn.g.b(iVar, new q0(this, null, null));
        this.U = wn.g.b(iVar, new r0(this, null, null));
        this.V = wn.g.b(iVar, new s0(this, null, null));
        this.W = EmomoGameName.SHOOTER;
        this.X = wn.g.a(new e());
        this.Y = wn.g.a(new f());
        this.Z = wn.g.a(new k0());
        this.f21210a0 = wn.g.a(new d());
        this.f21211b0 = wn.g.a(new x0());
        this.f21212c0 = wn.g.a(new w0());
        this.f21213d0 = wn.g.a(new g());
        this.f21214e0 = new FragmentRunner(this);
        this.f21215f0 = true;
        this.f21216g0 = new ArrayList();
    }

    public static /* synthetic */ void Q3(ShooterGameActivity shooterGameActivity, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        shooterGameActivity.P3(str);
    }

    public final void P3(String str) {
        Fragment e02 = a3().e0("ShooterCommentInputDialogFragment");
        androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
        if (eVar != null) {
            eVar.n3();
        }
        if (this.f21215f0) {
            this.f21215f0 = false;
            uo.r0.d(this, null, 1, null);
            if (str.length() > 0) {
                of.n.f45411a.B(this, str, false);
            }
            Fragment e03 = a3().e0("EmomoGameViewFragment");
            if (e03 != null) {
                a3().k().p(e03).l();
            }
            uo.l.d(uo.r0.a(g1.c()), null, null, new b(null), 3, null);
        }
    }

    @Override // be.t3
    public void Q0() {
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final int R3() {
        return ((Number) this.f21210a0.getValue()).intValue();
    }

    public final String S3() {
        return (String) this.f21213d0.getValue();
    }

    public final MRLogger T3() {
        return (MRLogger) this.T.getValue();
    }

    public final int U3() {
        return ((Number) this.Z.getValue()).intValue();
    }

    public final i1 V3() {
        return (i1) this.V.getValue();
    }

    public final od.k0 W3() {
        return (od.k0) this.P.getValue();
    }

    public final nf.e0 X3() {
        return (nf.e0) this.Q.getValue();
    }

    public final String Y3() {
        return (String) this.f21212c0.getValue();
    }

    public final int Z3() {
        return ((Number) this.f21211b0.getValue()).intValue();
    }

    public final UnityActionCreator a4() {
        return (UnityActionCreator) this.R.getValue();
    }

    public final UnityStore b4() {
        return (UnityStore) this.S.getValue();
    }

    public final kf.x c4() {
        return (kf.x) this.U.getValue();
    }

    public final boolean d4() {
        return ((Boolean) this.X.getValue()).booleanValue();
    }

    public final boolean e4() {
        return ((Boolean) this.Y.getValue()).booleanValue();
    }

    public final void f4(s9.i iVar) {
        this.f21214e0.c(new h(iVar));
    }

    public final void g4(s9.i iVar) {
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new q(null), 3, null);
        uo.l.d(this, null, null, new r(iVar, null), 3, null);
        uo.l.d(this, null, null, new s(null), 3, null);
        uo.l.d(this, null, null, new t(null), 3, null);
        uo.l.d(this, null, null, new u(null), 3, null);
        uo.l.d(this, null, null, new v(null), 3, null);
        uo.l.d(this, null, null, new w(null), 3, null);
        uo.l.d(this, null, null, new x(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        uo.l.d(this, null, null, new m(null), 3, null);
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new o(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void h4(s9.i iVar) {
        g4(iVar);
        i4(iVar);
    }

    public final void i4(s9.i iVar) {
        uo.l.d(this, null, null, new y(null), 3, null);
        uo.l.d(this, null, null, new c0(null), 3, null);
        uo.l.d(this, null, null, new d0(null), 3, null);
        uo.l.d(this, null, null, new e0(null), 3, null);
        uo.l.d(this, null, null, new f0(null), 3, null);
        uo.l.d(this, null, null, new g0(null), 3, null);
        uo.l.d(this, null, null, new h0(null), 3, null);
        uo.l.d(this, null, null, new i0(null), 3, null);
        uo.l.d(this, null, null, new j0(null), 3, null);
        uo.l.d(this, null, null, new z(null), 3, null);
        uo.l.d(this, null, null, new a0(null), 3, null);
        uo.l.d(this, null, null, new b0(null), 3, null);
    }

    public final void j4(String str) {
        MRLogger T3 = T3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(str);
        xm.e eVar = new xm.e();
        HashMap hashMap = new HashMap();
        hashMap.put("team_id", String.valueOf(Z3()));
        hashMap.put("group_id", String.valueOf(R3()));
        wn.v vVar = wn.v.f59242a;
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap))));
        T3.sendLog(builder.build());
    }

    public final void k4(s9.i iVar) {
        AppCompatImageView appCompatImageView = iVar.C;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new m0());
    }

    @Override // be.t3
    public void m(String str) {
        jo.p.h(str, "comment");
        uo.l.d(this, null, null, new l0(str, null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        Fragment a10;
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, q9.h.activity_shooter_game);
        jo.p.g(g10, "setContentView(this, R.l…ut.activity_shooter_game)");
        s9.i iVar = (s9.i) g10;
        androidx.fragment.app.z k10 = a3().k();
        int id2 = iVar.D.getId();
        if (e4()) {
            a10 = StreamEmomoCommentFragment.B0.a(true);
        } else {
            a10 = PlayerCommentFragment.D0.a(false, false, xn.s.m(-100, -104, -103));
        }
        k10.r(id2, a10).i();
        k4(iVar);
        h4(iVar);
        W3().e("SHOOTER_GAME", U3());
        j4(d4() ? MRLog.ACTION_TYPE_SHOOTER_HOST_GAME_SCREEN_START : MRLog.ACTION_TYPE_SHOOTER_CLIENT_GAME_SCREEN_START);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        Q3(this, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        if (V3().a().c()) {
            W3().k();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        if (V3().a().c()) {
            W3().h();
        }
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onStart() {
        super.onStart();
        if (V3().a().c()) {
            W3().h();
        }
    }
}
