package com.dena.mirrativ.emomo.run;

import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import be.l1;
import ce.t;
import com.dena.mirrativ.emomo.run.EmomoRunActivity;
import com.dena.mirrativ.mirrativapi.closet.GameEffectType;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.EmomoGameStatusType;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunOpenGiftGachaResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunUserDetail;
import com.dena.mirrorman.ChooseReceiver;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.EmomoRunGameTargetDetail;
import com.dena.mirrorman.fragment.EmomoGameViewFragment;
import com.dena.mirrorman.fragment.StreamEmomoCommentFragment;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.unity.EmomoGameName;
import com.dena.mirrorman.unity.MiniGameInput;
import com.dena.mirrorman.unity.MiniGameStateType;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoRunConsumeGift;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoRunGameOver;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoRunHeartBeat;
import com.dena.mirrorman.unity.UnityMiniGameResult;
import com.dena.mirrorman.unity.UnityScreenShotAvatarPosition;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.unity.UnityStore;
import com.dena.mirrorman.util.FragmentRunner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import o3.p0;
import org.json.JSONObject;
import uo.b1;
import uo.b3;
import uo.d2;
import uo.r0;
import uo.v1;
import yd.g1;
import yd.t1;

/* loaded from: classes.dex */
public final class EmomoRunActivity extends e.b implements uo.q0 {

    /* renamed from: e0  reason: collision with root package name */
    public static final a f21055e0 = new a(null);

    /* renamed from: f0  reason: collision with root package name */
    public static final int f21056f0 = 8;

    /* renamed from: g0  reason: collision with root package name */
    public static final EmomoGameName f21057g0 = EmomoGameName.EMOMO_RUN;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = wn.g.a(new e());
    public final wn.f Q = new s0(jo.f0.b(ba.a.class), new m0(this), new l0(new k0(this), null, null, gq.a.a(this)));
    public final wn.f R = new s0(jo.f0.b(ba.w.class), new p0(this), new o0(new n0(this), null, null, gq.a.a(this)));
    public final wn.f S;
    public final wn.f T;
    public UnityStore U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final FragmentRunner Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21058a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f21059b0;

    /* renamed from: c0  reason: collision with root package name */
    public d2 f21060c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f21061d0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, int i10) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, EmomoRunActivity.class);
            intent.putExtra("EXTRA_GIFT_EVENT_ID", i10);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$onCreate$2", f = "EmomoRunActivity.kt", l = {139}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21062w;

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
            int i10 = this.f21062w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f21062w = 1;
                if (b1.a(1000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            EmomoRunActivity.this.x4();
            EmomoRunActivity.this.Z3().p(Referer.Event.EMOMO_RUN, EmomoRunActivity.this.c4());
            EmomoRunActivity.this.Z3().j(Referer.Event.EMOMO_RUN, EmomoRunActivity.this.c4());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21064a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21065b;

        static {
            int[] iArr = new int[MiniGameStateType.values().length];
            iArr[MiniGameStateType.RESULT.ordinal()] = 1;
            f21064a = iArr;
            int[] iArr2 = new int[EmomoGameStatusType.values().length];
            iArr2[EmomoGameStatusType.Ready.ordinal()] = 1;
            iArr2[EmomoGameStatusType.Running.ordinal()] = 2;
            iArr2[EmomoGameStatusType.Finished.ordinal()] = 3;
            f21065b = iArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.l<View, wn.v> {
        public b0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EmomoRunActivity.this.Z3().u(Referer.Event.EMOMO_RUN, EmomoRunActivity.this.c4(), false);
            EmomoRunActivity.this.W3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<s9.c> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final s9.c invoke() {
            return (s9.c) androidx.databinding.f.g(EmomoRunActivity.this, q9.h.activity_emomo_run);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$shareImage$1", f = "EmomoRunActivity.kt", l = {666}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21068w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f21070y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f21071z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<MRLogger, String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f21072w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(2);
                this.f21072w = str;
            }

            public final void a(MRLogger mRLogger, String str) {
                jo.p.h(mRLogger, "logger");
                MRLog.Companion companion = MRLog.Companion;
                String str2 = this.f21072w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_SHARE_PANEL);
                builder.setTargetId(MRLog.TARGET_ID_TAP);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LogBase.SERVICE_NAME, str);
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str2), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                mRLogger.sendLog(builder.build());
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(MRLogger mRLogger, String str) {
                a(mRLogger, str);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Bitmap bitmap, String str, ao.d<? super c0> dVar) {
            super(2, dVar);
            this.f21070y = bitmap;
            this.f21071z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c0(this.f21070y, this.f21071z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21068w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRLogger e42 = EmomoRunActivity.this.e4();
                    MRLog.Companion companion = MRLog.Companion;
                    EmomoRunActivity emomoRunActivity = EmomoRunActivity.this;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_SHARE_PANEL);
                    builder.setTargetId(MRLog.TARGET_ID_IMP);
                    builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, emomoRunActivity.d4().b())));
                    e42.sendLog(builder.build());
                    hf.k0 f42 = EmomoRunActivity.this.f4();
                    Bitmap bitmap = this.f21070y;
                    this.f21068w = 1;
                    obj = f42.a("FILE_NAME_SHARE_SHOT", bitmap, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Uri a10 = EmomoRunActivity.this.b4().a((File) obj);
                Intent intent = new Intent();
                String str = this.f21071z;
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", a10);
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("image/png");
                EmomoRunActivity.this.startActivity(Intent.createChooser(intent, "", PendingIntent.getBroadcast(EmomoRunActivity.this, 0, ChooseReceiver.f25051x.a(EmomoRunActivity.this, new a(EmomoRunActivity.this.d4().b())), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()));
            } catch (FileNotFoundException unused) {
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return EmomoRunActivity.this.getCacheDir() + "/emomo.png";
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.a<wn.v> {
        public d0() {
            super(0);
        }

        public final void a() {
            EmomoRunActivity.this.a3().k().r(q9.g.f48832h, EmomoGameViewFragment.f26056y0.a()).i();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<Integer> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(EmomoRunActivity.this.getIntent().getIntExtra("EXTRA_GIFT_EVENT_ID", 0));
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21076w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21077x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21078y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21076w = componentCallbacks;
            this.f21077x = aVar;
            this.f21078y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f21076w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f21077x, this.f21078y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$10", f = "EmomoRunActivity.kt", l = {347}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21079w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends UnityMiniGameOutputEmomoRunGameOver>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21081w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21081w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, UnityMiniGameOutputEmomoRunGameOver> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                UnityMiniGameOutputEmomoRunGameOver b10 = kVar.b();
                if (EmomoRunActivity.f21057g0 != a10) {
                    return wn.v.f59242a;
                }
                Integer f10 = this.f21081w.a4().o().f();
                if (f10 != null) {
                    EmomoRunActivity emomoRunActivity = this.f21081w;
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Mac mac = Mac.getInstance("HmacSHA256");
                    Charset charset = so.c.f52772b;
                    byte[] bytes = ("emomo_run:" + emomoRunActivity.c4() + ':' + f10.intValue() + ':' + currentTimeMillis).getBytes(charset);
                    jo.p.g(bytes, "this as java.lang.String).getBytes(charset)");
                    mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b10.getScore());
                    sb2.append(':');
                    sb2.append(b10.getScoreRunMultiple());
                    sb2.append(':');
                    sb2.append(b10.getScoreCoinMultiple());
                    sb2.append(':');
                    sb2.append(b10.getScoreKicksMultiple());
                    sb2.append(':');
                    sb2.append(b10.getStageEnemyMultiple());
                    byte[] bytes2 = sb2.toString().getBytes(charset);
                    jo.p.g(bytes2, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(mac.doFinal(bytes2), 3);
                    ba.a Z3 = emomoRunActivity.Z3();
                    int c42 = emomoRunActivity.c4();
                    int intValue = f10.intValue();
                    int score = b10.getScore();
                    float scoreRunMultiple = b10.getScoreRunMultiple();
                    float scoreCoinMultiple = b10.getScoreCoinMultiple();
                    float scoreKicksMultiple = b10.getScoreKicksMultiple();
                    int stageEnemyMultiple = b10.getStageEnemyMultiple();
                    jo.p.g(encodeToString, "hash");
                    Z3.l(Referer.Event.EMOMO_RUN, c42, intValue, score, scoreRunMultiple, scoreCoinMultiple, scoreKicksMultiple, stageEnemyMultiple, currentTimeMillis, encodeToString);
                    MRLogger e42 = emomoRunActivity.e4();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_GAME_HEARTBEAT);
                    builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, emomoRunActivity.d4().b()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new EmomoRunGameTargetDetail(String.valueOf(b10.getSelfTime()), String.valueOf(b10.getSelfRun()), String.valueOf(b10.getGiftedRun()), String.valueOf(b10.getStageCoins()), String.valueOf(b10.getGiftedCoins()), String.valueOf(b10.getGiftedScore()), String.valueOf(b10.getKicks()), String.valueOf(b10.getCoinBonus()), String.valueOf(b10.getScore()), String.valueOf(b10.getPresetRunScaler()), String.valueOf(b10.getScoreRunMultiple()), String.valueOf(b10.getScoreCoinMultiple()), String.valueOf(b10.getScoreKicksMultiple()), String.valueOf(b10.getStageEnemyMultiple()), String.valueOf(f10.intValue()), "gameover").toJson())));
                    e42.sendLog(builder.build());
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21079w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<wn.k<EmomoGameName, UnityMiniGameOutputEmomoRunGameOver>> miniGameOutputEmomoRunGameOverFlow = unityStore.getMiniGameOutputEmomoRunGameOverFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21079w = 1;
                if (miniGameOutputEmomoRunGameOverFlow.a(aVar, this) == c10) {
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
    public static final class f0 extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21082w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21083x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21084y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21082w = componentCallbacks;
            this.f21083x = aVar;
            this.f21084y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f21082w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f21083x, this.f21084y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$11", f = "EmomoRunActivity.kt", l = {397}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21085w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends UnityMiniGameResult>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21087w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21087w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, UnityMiniGameResult> kVar, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 != kVar.a()) {
                    return wn.v.f59242a;
                }
                this.f21087w.Z3().t(MiniGameStateType.RESULT);
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
            int i10 = this.f21085w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<wn.k<EmomoGameName, UnityMiniGameResult>> miniGameOutputResultFlow = unityStore.getMiniGameOutputResultFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21085w = 1;
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

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.a<hf.k0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21088w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21089x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21090y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21088w = componentCallbacks;
            this.f21089x = aVar;
            this.f21090y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.k0] */
        @Override // io.a
        public final hf.k0 invoke() {
            ComponentCallbacks componentCallbacks = this.f21088w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.k0.class), this.f21089x, this.f21090y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$12", f = "EmomoRunActivity.kt", l = {404}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21091w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends UnityMiniGameOutputEmomoRunHeartBeat>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21093w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21093w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, UnityMiniGameOutputEmomoRunHeartBeat> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                UnityMiniGameOutputEmomoRunHeartBeat b10 = kVar.b();
                if (EmomoRunActivity.f21057g0 != a10) {
                    return wn.v.f59242a;
                }
                Integer f10 = this.f21093w.a4().o().f();
                if (f10 != null) {
                    EmomoRunActivity emomoRunActivity = this.f21093w;
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Mac mac = Mac.getInstance("HmacSHA256");
                    Charset charset = so.c.f52772b;
                    byte[] bytes = ("emomo_run:" + emomoRunActivity.c4() + ':' + f10.intValue() + ':' + currentTimeMillis).getBytes(charset);
                    jo.p.g(bytes, "this as java.lang.String).getBytes(charset)");
                    mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b10.getScore());
                    sb2.append(':');
                    sb2.append(b10.getScoreRunMultiple());
                    sb2.append(':');
                    sb2.append(b10.getScoreCoinMultiple());
                    sb2.append(':');
                    sb2.append(b10.getScoreKicksMultiple());
                    sb2.append(':');
                    sb2.append(b10.getStageEnemyMultiple());
                    byte[] bytes2 = sb2.toString().getBytes(charset);
                    jo.p.g(bytes2, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(mac.doFinal(bytes2), 3);
                    ba.a Z3 = emomoRunActivity.Z3();
                    int c42 = emomoRunActivity.c4();
                    int intValue = f10.intValue();
                    int score = b10.getScore();
                    float scoreRunMultiple = b10.getScoreRunMultiple();
                    float scoreCoinMultiple = b10.getScoreCoinMultiple();
                    float scoreKicksMultiple = b10.getScoreKicksMultiple();
                    int stageEnemyMultiple = b10.getStageEnemyMultiple();
                    jo.p.g(encodeToString, "hash");
                    Z3.n(Referer.Event.EMOMO_RUN, c42, intValue, score, scoreRunMultiple, scoreCoinMultiple, scoreKicksMultiple, stageEnemyMultiple, currentTimeMillis, encodeToString);
                    MRLogger e42 = emomoRunActivity.e4();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_GAME_HEARTBEAT);
                    builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, emomoRunActivity.d4().b()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new EmomoRunGameTargetDetail(String.valueOf(b10.getSelfTime()), String.valueOf(b10.getSelfRun()), String.valueOf(b10.getGiftedRun()), String.valueOf(b10.getStageCoins()), String.valueOf(b10.getGiftedCoins()), String.valueOf(b10.getGiftedScore()), String.valueOf(b10.getKicks()), String.valueOf(b10.getCoinBonus()), String.valueOf(b10.getScore()), String.valueOf(b10.getPresetRunScaler()), String.valueOf(b10.getScoreRunMultiple()), String.valueOf(b10.getScoreCoinMultiple()), String.valueOf(b10.getScoreKicksMultiple()), String.valueOf(b10.getStageEnemyMultiple()), String.valueOf(f10.intValue()), "running").toJson())));
                    e42.sendLog(builder.build());
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
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21091w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<wn.k<EmomoGameName, UnityMiniGameOutputEmomoRunHeartBeat>> miniGameOutputEmomoRunHeartBeatFlow = unityStore.getMiniGameOutputEmomoRunHeartBeatFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21091w = 1;
                if (miniGameOutputEmomoRunHeartBeatFlow.a(aVar, this) == c10) {
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
    public static final class h0 extends jo.q implements io.a<hf.y> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21094w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21095x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21096y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21094w = componentCallbacks;
            this.f21095x = aVar;
            this.f21096y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.y, java.lang.Object] */
        @Override // io.a
        public final hf.y invoke() {
            ComponentCallbacks componentCallbacks = this.f21094w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.y.class), this.f21095x, this.f21096y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$13", f = "EmomoRunActivity.kt", l = {454}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21097w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends UnityMiniGameOutputEmomoRunConsumeGift>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21099w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21099w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, UnityMiniGameOutputEmomoRunConsumeGift> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                UnityMiniGameOutputEmomoRunConsumeGift b10 = kVar.b();
                if (EmomoRunActivity.f21057g0 != a10) {
                    return wn.v.f59242a;
                }
                this.f21099w.Z3().m(Referer.Event.EMOMO_RUN, this.f21099w.c4(), b10.getGameGiftId());
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
            int i10 = this.f21097w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<wn.k<EmomoGameName, UnityMiniGameOutputEmomoRunConsumeGift>> miniGameOutputEmomoRunConsumeGiftFlow = unityStore.getMiniGameOutputEmomoRunConsumeGiftFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21097w = 1;
                if (miniGameOutputEmomoRunConsumeGiftFlow.a(aVar, this) == c10) {
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
    public static final class i0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21100w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21101x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21100w = componentCallbacks;
            this.f21101x = aVar;
            this.f21102y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21100w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f21101x, this.f21102y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$14", f = "EmomoRunActivity.kt", l = {461}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21103w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21105w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21105w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21105w.Z3().o(Referer.Event.EMOMO_RUN, this.f21105w.c4(), System.currentTimeMillis() / 1000);
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
            int i10 = this.f21103w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchTitleFlow = unityStore.getMiniGameOutputTouchTitleFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21103w = 1;
                if (miniGameOutputTouchTitleFlow.a(aVar, this) == c10) {
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
    public static final class j0 extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21106w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21107x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21108y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21106w = componentCallbacks;
            this.f21107x = aVar;
            this.f21108y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f21106w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f21107x, this.f21108y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$15", f = "EmomoRunActivity.kt", l = {468}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21109w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends Integer>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21111w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21111w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, Integer> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                int intValue = kVar.b().intValue();
                if (EmomoRunActivity.f21057g0 != a10) {
                    return wn.v.f59242a;
                }
                this.f21111w.Z3().s(Referer.Event.EMOMO_RUN, this.f21111w.c4(), intValue);
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
            int i10 = this.f21109w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<wn.k<EmomoGameName, Integer>> miniGameOutputOpenGiftTreasureFlow = unityStore.getMiniGameOutputOpenGiftTreasureFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21109w = 1;
                if (miniGameOutputOpenGiftTreasureFlow.a(aVar, this) == c10) {
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
    public static final class k0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21112w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(ComponentActivity componentActivity) {
            super(0);
            this.f21112w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21112w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$16", f = "EmomoRunActivity.kt", l = {475}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21113w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f21115w = new a();

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                UnityManager.Companion.getInstance().miniGameInput(MiniGameInput.EmomoRunJump.INSTANCE);
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
            int i10 = this.f21113w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchPlayingFlow = unityStore.getMiniGameOutputTouchPlayingFlow();
                a aVar = a.f21115w;
                this.f21113w = 1;
                if (miniGameOutputTouchPlayingFlow.a(aVar, this) == c10) {
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
    public static final class l0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21116w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21117x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21118y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21119z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21116w = aVar;
            this.f21117x = aVar2;
            this.f21118y = aVar3;
            this.f21119z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21116w;
            vq.a aVar2 = this.f21117x;
            io.a aVar3 = this.f21118y;
            xq.a aVar4 = this.f21119z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ba.a.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$17", f = "EmomoRunActivity.kt", l = {482}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21120w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21122w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21122w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 == emomoGameName && jo.p.c(this.f21122w.a4().x().f(), co.b.a(true))) {
                    UnityManager.Companion.getInstance().miniGameInput(MiniGameInput.EmomoRunNextTitle.INSTANCE);
                    this.f21122w.Z3().t(MiniGameStateType.LOADED);
                    MRLogger e42 = this.f21122w.e4();
                    MRLog.Companion companion = MRLog.Companion;
                    EmomoRunActivity emomoRunActivity = this.f21122w;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_TITLE_IMP);
                    builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, emomoRunActivity.d4().b())));
                    e42.sendLog(builder.build());
                    return wn.v.f59242a;
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
            int i10 = this.f21120w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchResultNextTitleFlow = unityStore.getMiniGameOutputTouchResultNextTitleFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21120w = 1;
                if (miniGameOutputTouchResultNextTitleFlow.a(aVar, this) == c10) {
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
    public static final class m0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21123w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ComponentActivity componentActivity) {
            super(0);
            this.f21123w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21123w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$18", f = "EmomoRunActivity.kt", l = {498}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21124w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21126w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21126w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 == emomoGameName && jo.p.c(this.f21126w.a4().x().f(), co.b.a(true))) {
                    this.f21126w.Z3().o(Referer.Event.EMOMO_RUN, this.f21126w.c4(), System.currentTimeMillis() / 1000);
                    return wn.v.f59242a;
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
            int i10 = this.f21124w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchResultNextStartFlow = unityStore.getMiniGameOutputTouchResultNextStartFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21124w = 1;
                if (miniGameOutputTouchResultNextStartFlow.a(aVar, this) == c10) {
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
    public static final class n0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21127w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ComponentActivity componentActivity) {
            super(0);
            this.f21127w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21127w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$19", f = "EmomoRunActivity.kt", l = {506}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21128w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21130w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21130w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 == emomoGameName && jo.p.c(this.f21130w.a4().x().f(), co.b.a(true))) {
                    this.f21130w.V3();
                    return wn.v.f59242a;
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
            int i10 = this.f21128w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchResultShareFlow = unityStore.getMiniGameOutputTouchResultShareFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21128w = 1;
                if (miniGameOutputTouchResultShareFlow.a(aVar, this) == c10) {
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
    public static final class o0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21131w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21132x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21133y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21134z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21131w = aVar;
            this.f21132x = aVar2;
            this.f21133y = aVar3;
            this.f21134z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21131w;
            vq.a aVar2 = this.f21132x;
            io.a aVar3 = this.f21133y;
            xq.a aVar4 = this.f21134z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ba.w.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$20", f = "EmomoRunActivity.kt", l = {514}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21135w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21137w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21137w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 == emomoGameName && jo.p.c(this.f21137w.a4().x().f(), co.b.a(true))) {
                    ba.s.R0.a(Referer.Event.EMOMO_RUN, this.f21137w.c4()).z3(this.f21137w.a3(), "EmomoRunRankingDialog");
                    return wn.v.f59242a;
                }
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
            int i10 = this.f21135w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchResultRankingFlow = unityStore.getMiniGameOutputTouchResultRankingFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21135w = 1;
                if (miniGameOutputTouchResultRankingFlow.a(aVar, this) == c10) {
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
    public static final class p0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21138w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(ComponentActivity componentActivity) {
            super(0);
            this.f21138w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21138w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$21", f = "EmomoRunActivity.kt", l = {522}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21139w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21141w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21141w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 == emomoGameName && jo.p.c(this.f21141w.a4().x().f(), co.b.a(true))) {
                    ba.s.R0.a(Referer.Event.EMOMO_RUN, this.f21141w.c4()).z3(this.f21141w.a3(), "EmomoRunRankingDialog");
                    return wn.v.f59242a;
                }
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
            int i10 = this.f21139w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchTitleRankingFlow = unityStore.getMiniGameOutputTouchTitleRankingFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21139w = 1;
                if (miniGameOutputTouchTitleRankingFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$startStateHeartbeatTimer$1", f = "EmomoRunActivity.kt", l = {613}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21142w;

        /* renamed from: x  reason: collision with root package name */
        public int f21143x;

        /* renamed from: y  reason: collision with root package name */
        public Object f21144y;

        /* renamed from: z  reason: collision with root package name */
        public int f21145z;

        public q0(ao.d<? super q0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:13:0x0040). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f21145z
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f21143x
                int r3 = r8.f21142w
                java.lang.Object r4 = r8.f21144y
                com.dena.mirrativ.emomo.run.EmomoRunActivity r4 = (com.dena.mirrativ.emomo.run.EmomoRunActivity) r4
                wn.m.b(r9)
                r9 = r8
                goto L40
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                wn.m.b(r9)
                r9 = 2147483647(0x7fffffff, float:NaN)
                com.dena.mirrativ.emomo.run.EmomoRunActivity r1 = com.dena.mirrativ.emomo.run.EmomoRunActivity.this
                r3 = 0
                r4 = r1
                r1 = r3
                r3 = r9
                r9 = r8
            L2d:
                if (r1 >= r3) goto L4f
                r5 = 6000(0x1770, double:2.9644E-320)
                r9.f21144y = r4
                r9.f21142w = r3
                r9.f21143x = r1
                r9.f21145z = r2
                java.lang.Object r5 = uo.b1.a(r5, r9)
                if (r5 != r0) goto L40
                return r0
            L40:
                ba.a r5 = com.dena.mirrativ.emomo.run.EmomoRunActivity.H3(r4)
                int r6 = com.dena.mirrativ.emomo.run.EmomoRunActivity.M3(r4)
                java.lang.String r7 = "event.emomo_run"
                r5.u(r7, r6, r2)
                int r1 = r1 + r2
                goto L2d
            L4f:
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.emomo.run.EmomoRunActivity.q0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$22", f = "EmomoRunActivity.kt", l = {530}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21146w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21148w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21148w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                EmomoRunEventResponse f10;
                if (EmomoRunActivity.f21057g0 == emomoGameName && (f10 = this.f21148w.a4().j().f()) != null) {
                    l1.R0.a(f10.getRulePopupImageUrl()).z3(this.f21148w.a3(), "EmomoRunRankingRuleDialog");
                    return wn.v.f59242a;
                }
                return wn.v.f59242a;
            }
        }

        public r(ao.d<? super r> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21146w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputTouchHelpFlow = unityStore.getMiniGameOutputTouchHelpFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21146w = 1;
                if (miniGameOutputTouchHelpFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$23", f = "EmomoRunActivity.kt", l = {538}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21149w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21151w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21151w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21151w.Z3().k(Referer.Event.EMOMO_RUN, this.f21151w.c4());
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
            int i10 = this.f21149w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputOpenGiftGachaFlow = unityStore.getMiniGameOutputOpenGiftGachaFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21149w = 1;
                if (miniGameOutputOpenGiftGachaFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$24", f = "EmomoRunActivity.kt", l = {545}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21152w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<UnityScreenshot> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21154w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21154w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityScreenshot unityScreenshot, ao.d<? super wn.v> dVar) {
                String shareText;
                Bitmap decodeFile = BitmapFactory.decodeFile(unityScreenshot.getImagePath());
                try {
                    new File(unityScreenshot.getImagePath()).delete();
                } catch (IOException unused) {
                }
                EmomoRunScoreResponse f10 = this.f21154w.a4().s().f();
                if (f10 != null && (shareText = f10.getShareText()) != null) {
                    this.f21154w.w4(decodeFile, shareText);
                }
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
            int i10 = this.f21152w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<UnityScreenshot> screenshotCompletedFlow = unityStore.getScreenshotCompletedFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21152w = 1;
                if (screenshotCompletedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$25", f = "EmomoRunActivity.kt", l = {559}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21155w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21157w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21157w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                of.n nVar = of.n.f45411a;
                EmomoRunActivity emomoRunActivity = this.f21157w;
                nVar.B(emomoRunActivity, emomoRunActivity.getString(q9.i.f48840a), false);
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
            int i10 = this.f21155w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<wn.v> screenshotFailedFlow = unityStore.getScreenshotFailedFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21155w = 1;
                if (screenshotFailedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$26", f = "EmomoRunActivity.kt", l = {565}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21158w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21160w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21160w = emomoRunActivity;
            }

            public final Object a(int i10, ao.d<? super wn.v> dVar) {
                if (i10 <= 0) {
                    return wn.v.f59242a;
                }
                this.f21160w.h4().emomoRunGiftGachaCount(i10);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
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
            int i10 = this.f21158w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Integer> w10 = EmomoRunActivity.this.a4().w();
                a aVar = new a(EmomoRunActivity.this);
                this.f21158w = 1;
                if (w10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$27", f = "EmomoRunActivity.kt", l = {572}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21161w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoRunOpenGiftGachaResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21163w;

            /* renamed from: com.dena.mirrativ.emomo.run.EmomoRunActivity$w$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0185a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ EmomoRunActivity f21164w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ EmomoRunOpenGiftGachaResponse f21165x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0185a(EmomoRunActivity emomoRunActivity, EmomoRunOpenGiftGachaResponse emomoRunOpenGiftGachaResponse) {
                    super(0);
                    this.f21164w = emomoRunActivity;
                    this.f21165x = emomoRunOpenGiftGachaResponse;
                }

                public final void a() {
                    this.f21164w.h4().emomoRunGiftGachaCount(this.f21165x.getRemainingGachaCount());
                    ba.j.S0.a(this.f21165x.getResults(), this.f21165x.getDuplicatedExplainImageUrl(), true, q9.d.f48820x).z3(this.f21164w.a3(), "EmomoRunGiftGachaOpenDialog");
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21163w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoRunOpenGiftGachaResponse emomoRunOpenGiftGachaResponse, ao.d<? super wn.v> dVar) {
                this.f21163w.Z.c(new C0185a(this.f21163w, emomoRunOpenGiftGachaResponse));
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
            int i10 = this.f21161w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoRunOpenGiftGachaResponse> u10 = EmomoRunActivity.this.a4().u();
                a aVar = new a(EmomoRunActivity.this);
                this.f21161w = 1;
                if (u10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$28", f = "EmomoRunActivity.kt", l = {586}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21166w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21168w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21168w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                t1.a aVar = t1.f61795x;
                EmomoRunActivity emomoRunActivity = this.f21168w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f21168w.getString(q9.i.f48840a);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                aVar.a(emomoRunActivity, message);
                this.f21168w.Z3().r();
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
            int i10 = this.f21166w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> t10 = EmomoRunActivity.this.a4().t();
                a aVar = new a(EmomoRunActivity.this);
                this.f21166w = 1;
                if (t10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$8", f = "EmomoRunActivity.kt", l = {333}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21169w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21171w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21171w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21171w.i4();
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
            int i10 = this.f21169w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> loadMiniGameCompletedFlow = unityStore.getLoadMiniGameCompletedFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21169w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActivity$observeStoreValues$9", f = "EmomoRunActivity.kt", l = {340}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21172w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoRunActivity f21174w;

            public a(EmomoRunActivity emomoRunActivity) {
                this.f21174w = emomoRunActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (EmomoRunActivity.f21057g0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f21174w.Z3().t(MiniGameStateType.PLAYING);
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
            int i10 = this.f21172w;
            if (i10 == 0) {
                wn.m.b(obj);
                UnityStore unityStore = EmomoRunActivity.this.U;
                if (unityStore == null) {
                    jo.p.v("unityStore");
                    unityStore = null;
                }
                xo.w<EmomoGameName> miniGameOutputStartedFlow = unityStore.getMiniGameOutputStartedFlow();
                a aVar = new a(EmomoRunActivity.this);
                this.f21172w = 1;
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

    public EmomoRunActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.S = wn.g.b(iVar, new e0(this, null, null));
        this.T = wn.g.b(iVar, new f0(this, null, null));
        this.V = wn.g.b(iVar, new g0(this, null, null));
        this.W = wn.g.b(iVar, new h0(this, null, null));
        this.X = wn.g.b(iVar, new i0(this, null, null));
        this.Y = wn.g.b(iVar, new j0(this, null, null));
        this.Z = new FragmentRunner(this);
        this.f21058a0 = wn.g.a(new c());
        this.f21059b0 = wn.g.a(new d());
        this.f21060c0 = b3.b(null, 1, null);
        this.f21061d0 = true;
    }

    public static final void k4(EmomoRunActivity emomoRunActivity, EmomoGameStatusType emomoGameStatusType) {
        String valueOf;
        EmomoRunGameResponse f10;
        String valueOf2;
        EmomoRunUserDetail scoreReward;
        List<EmomoRunReward> rewards;
        jo.p.h(emomoRunActivity, "this$0");
        if (emomoGameStatusType != null) {
            if (!emomoRunActivity.g4().a().c()) {
                of.n.f45411a.B(emomoRunActivity, emomoRunActivity.getString(q9.i.text_emomo_run_force_stop), false);
                emomoRunActivity.Z3().u(Referer.Event.EMOMO_RUN, emomoRunActivity.c4(), false);
                emomoRunActivity.W3();
                return;
            }
            int i10 = b.f21065b[emomoGameStatusType.ordinal()];
            if (i10 == 1) {
                MiniGameStateType f11 = emomoRunActivity.a4().p().f();
                if (f11 != null) {
                    if (b.f21064a[f11.ordinal()] == 1) {
                        UnityManager.Companion.getInstance().miniGameInput(MiniGameInput.EmomoRunNextStart.INSTANCE);
                    } else {
                        UnityManager.Companion.getInstance().miniGameInput(MiniGameInput.Start.INSTANCE);
                    }
                    MRLogger e42 = emomoRunActivity.e4();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_GAME_START);
                    wn.k[] kVarArr = new wn.k[2];
                    kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, emomoRunActivity.d4().b());
                    xm.e eVar = new xm.e();
                    HashMap hashMap = new HashMap();
                    List<EmomoRunGameEffect> f12 = emomoRunActivity.a4().l().f();
                    if (f12 != null) {
                        jo.p.g(f12, "gameEffects");
                        for (EmomoRunGameEffect emomoRunGameEffect : f12) {
                            String effectCommand = emomoRunGameEffect.getEffectCommand();
                            if (emomoRunGameEffect.getEffectType() == GameEffectType.StageEnemy) {
                                valueOf = String.valueOf((int) emomoRunGameEffect.getValue());
                            } else {
                                valueOf = String.valueOf(emomoRunGameEffect.getValue());
                            }
                            hashMap.put(effectCommand, valueOf);
                        }
                    }
                    wn.v vVar = wn.v.f59242a;
                    kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap));
                    builder.setPayload(xn.s.m(kVarArr));
                    e42.sendLog(builder.build());
                }
            } else if (i10 == 3 && (f10 = emomoRunActivity.a4().k().f()) != null) {
                EmomoRunScoreResponse f13 = emomoRunActivity.a4().s().f();
                if (f13 != null && (scoreReward = f13.getScoreReward()) != null && (rewards = scoreReward.getRewards()) != null) {
                    for (EmomoRunReward emomoRunReward : rewards) {
                        UnityManager.Companion.getInstance().miniGameInputReward(emomoRunReward, f10.getHighScore());
                    }
                }
                EmomoRunGameResponse f14 = emomoRunActivity.a4().v().f();
                int highScore = f14 != null ? f14.getHighScore() : 0;
                UnityManager companion2 = UnityManager.Companion.getInstance();
                jo.p.g(f10, "game");
                companion2.miniGameInput(new MiniGameInput.EmomoRunResult(f10, highScore));
                MRLogger e43 = emomoRunActivity.e4();
                MRLog.Companion companion3 = MRLog.Companion;
                MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_RESULT_IMP);
                wn.k[] kVarArr2 = new wn.k[2];
                kVarArr2[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, emomoRunActivity.d4().b());
                xm.e eVar2 = new xm.e();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("score", String.valueOf(f10.getScore()));
                hashMap2.put("cumulative_score", String.valueOf(f10.getTotalScore()));
                hashMap2.put("high_score", String.valueOf(f10.getHighScore()));
                List<EmomoRunGameEffect> f15 = emomoRunActivity.a4().l().f();
                if (f15 != null) {
                    jo.p.g(f15, "gameEffects");
                    for (EmomoRunGameEffect emomoRunGameEffect2 : f15) {
                        String effectCommand2 = emomoRunGameEffect2.getEffectCommand();
                        if (emomoRunGameEffect2.getEffectType() == GameEffectType.StageEnemy) {
                            valueOf2 = String.valueOf((int) emomoRunGameEffect2.getValue());
                        } else {
                            valueOf2 = String.valueOf(emomoRunGameEffect2.getValue());
                        }
                        hashMap2.put(effectCommand2, valueOf2);
                    }
                }
                wn.v vVar2 = wn.v.f59242a;
                kVarArr2[1] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar2.s(hashMap2));
                builder2.setPayload(xn.s.m(kVarArr2));
                e43.sendLog(builder2.build());
            }
        }
    }

    public static final void l4(EmomoRunActivity emomoRunActivity, EmomoRunGameGift emomoRunGameGift) {
        jo.p.h(emomoRunActivity, "this$0");
        if (emomoRunGameGift != null) {
            emomoRunActivity.t4(emomoRunGameGift);
        }
    }

    public static final void m4(EmomoRunActivity emomoRunActivity, Boolean bool) {
        jo.p.h(emomoRunActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (bool.booleanValue()) {
            emomoRunActivity.Z3().u(Referer.Event.EMOMO_RUN, emomoRunActivity.c4(), false);
            emomoRunActivity.W3();
        }
    }

    public static final void n4(EmomoRunActivity emomoRunActivity, MRError mRError) {
        jo.p.h(emomoRunActivity, "this$0");
        if (mRError == null) {
            return;
        }
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(emomoRunActivity, mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Banned ? true : mRError instanceof MRError.Blocked) {
            of.n.f45411a.B(emomoRunActivity, mRError.getMessage(), false);
            emomoRunActivity.Z3().u(Referer.Event.EMOMO_RUN, emomoRunActivity.c4(), false);
            emomoRunActivity.W3();
        } else if (mRError instanceof MRError.Network) {
            of.n.z(emomoRunActivity);
        }
    }

    public static final void o4(EmomoRunActivity emomoRunActivity, EmomoRunScoreResponse emomoRunScoreResponse) {
        jo.p.h(emomoRunActivity, "this$0");
        if (emomoRunScoreResponse != null) {
            emomoRunActivity.Z3().q();
            for (EmomoRunReward emomoRunReward : emomoRunScoreResponse.getScoreReward().getRewards()) {
                UnityManager.Companion.getInstance().miniGameParamReward(emomoRunReward, emomoRunScoreResponse.getScoreReward().getHighScore());
            }
            emomoRunActivity.Z3().u(Referer.Event.EMOMO_RUN, emomoRunActivity.c4(), true);
        }
    }

    public static final void p4(EmomoRunActivity emomoRunActivity, List list) {
        jo.p.h(emomoRunActivity, "this$0");
        jo.p.g(list, "gameEffects");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            emomoRunActivity.s4((EmomoRunGameEffect) it.next());
        }
    }

    public static final void q4(EmomoRunActivity emomoRunActivity, jf.c cVar) {
        jo.p.h(emomoRunActivity, "this$0");
        if (cVar != null) {
            UnityManager.Companion companion = UnityManager.Companion;
            companion.getInstance().setTranslucentBackground();
            companion.getInstance().loadMiniGame(cVar);
            emomoRunActivity.Z3().t(MiniGameStateType.LOADING);
        }
    }

    public static final o3.p0 r4(View view, o3.p0 p0Var) {
        jo.p.g(view, "v");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = p0Var.f(p0.m.f()).f31716d;
        view.setLayoutParams(marginLayoutParams);
        return o3.p0.f44009b;
    }

    public final void V3() {
        h4().captureScreenshot(UnityScreenShotAvatarPosition.CENTER, Y3(), X3().G.getWidth(), X3().G.getHeight(), "EMOMO_RUN_SCREEN_SHOT_KEY");
    }

    public final void W3() {
        if (this.f21061d0) {
            this.f21061d0 = false;
            r0.d(this, null, 1, null);
            d2.a.a(this.f21060c0, null, 1, null);
            h4().endGame(EmomoGameName.EMOMO_RUN);
            finish();
        }
    }

    public final s9.c X3() {
        Object value = this.f21058a0.getValue();
        jo.p.g(value, "<get-binding>(...)");
        return (s9.c) value;
    }

    public final String Y3() {
        return (String) this.f21059b0.getValue();
    }

    public final ba.a Z3() {
        return (ba.a) this.Q.getValue();
    }

    public final ba.w a4() {
        return (ba.w) this.R.getValue();
    }

    public final hf.y b4() {
        return (hf.y) this.W.getValue();
    }

    public final int c4() {
        return ((Number) this.P.getValue()).intValue();
    }

    public final kf.m d4() {
        return (kf.m) this.Y.getValue();
    }

    public final MRLogger e4() {
        return (MRLogger) this.X.getValue();
    }

    public final hf.k0 f4() {
        return (hf.k0) this.V.getValue();
    }

    public final i1 g4() {
        return (i1) this.S.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final UnityActionCreator h4() {
        return (UnityActionCreator) this.T.getValue();
    }

    public final void i4() {
        Z3().t(MiniGameStateType.LOADED);
        EmomoRunEventResponse f10 = a4().j().f();
        if (f10 != null) {
            h4().emomoRunGiftGachaCount(f10.getRemainingGachaCount());
        }
        List<EmomoRunGameGift> f11 = a4().n().f();
        if (f11 != null) {
            for (EmomoRunGameGift emomoRunGameGift : f11) {
                t4(emomoRunGameGift);
            }
        }
        MRLogger e42 = e4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_RUN_TITLE_IMP);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, d4().b())));
        e42.sendLog(builder.build());
    }

    public final void j4() {
        a4().s().i(this, new androidx.lifecycle.f0() { // from class: ba.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunActivity.o4(EmomoRunActivity.this, (EmomoRunScoreResponse) obj);
            }
        });
        a4().l().i(this, new androidx.lifecycle.f0() { // from class: ba.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunActivity.p4(EmomoRunActivity.this, (List) obj);
            }
        });
        a4().i().i(this, new androidx.lifecycle.f0() { // from class: ba.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunActivity.q4(EmomoRunActivity.this, (jf.c) obj);
            }
        });
        a4().q().i(this, new androidx.lifecycle.f0() { // from class: ba.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunActivity.k4(EmomoRunActivity.this, (EmomoGameStatusType) obj);
            }
        });
        a4().m().i(this, new androidx.lifecycle.f0() { // from class: ba.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunActivity.l4(EmomoRunActivity.this, (EmomoRunGameGift) obj);
            }
        });
        a4().y().i(this, new androidx.lifecycle.f0() { // from class: ba.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunActivity.m4(EmomoRunActivity.this, (Boolean) obj);
            }
        });
        a4().r().i(this, new androidx.lifecycle.f0() { // from class: ba.b
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                EmomoRunActivity.n4(EmomoRunActivity.this, (MRError) obj);
            }
        });
        uo.l.d(this, null, null, new y(null), 3, null);
        uo.l.d(this, null, null, new z(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        uo.l.d(this, null, null, new m(null), 3, null);
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new o(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
        uo.l.d(this, null, null, new q(null), 3, null);
        uo.l.d(this, null, null, new r(null), 3, null);
        uo.l.d(this, null, null, new s(null), 3, null);
        uo.l.d(this, null, null, new t(null), 3, null);
        uo.l.d(this, null, null, new u(null), 3, null);
        uo.l.d(this, null, null, new v(null), 3, null);
        uo.l.d(this, null, null, new w(null), 3, null);
        uo.l.d(this, null, null, new x(null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.U = (UnityStore) gq.a.a(this).c(jo.f0.b(UnityStore.class), null, null);
        h4().emomoRunInitMiniGame();
        o3.n0.a(getWindow(), false);
        o3.c0.F0(X3().u(), ba.i.f17150w);
        X3().M(this);
        v4();
        u4();
        j4();
        uo.l.d(this, null, null, new a0(null), 3, null);
        y4();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        W3();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        if (g4().a().c()) {
            dq.c.c().l(t.k.f19482a);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        if (g4().a().c()) {
            dq.c.c().l(t.j.f19481a);
        }
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onStart() {
        super.onStart();
        if (g4().a().c()) {
            dq.c.c().l(t.j.f19481a);
        }
    }

    public final void s4(EmomoRunGameEffect emomoRunGameEffect) {
        UnityManager.Companion.getInstance().miniGameParamEffect(emomoRunGameEffect);
    }

    public final void t4(EmomoRunGameGift emomoRunGameGift) {
        UnityManager.Companion.getInstance().miniGameInputComment(emomoRunGameGift);
    }

    public final void u4() {
        ConstraintLayout constraintLayout = X3().C;
        jo.p.g(constraintLayout, "binding.closeButtonContainer");
        g1.a(constraintLayout, new b0());
    }

    public final void v4() {
        X3().F.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, xn.a0.A0(xn.s.m(Integer.valueOf(c3.a.d(this, q9.d.C)), Integer.valueOf(c3.a.d(this, q9.d.f48804b))))));
        a3().k().r(X3().D.getId(), StreamEmomoCommentFragment.B0.a(true)).i();
    }

    public final void w4(Bitmap bitmap, String str) {
        if (bitmap == null) {
            return;
        }
        uo.l.d(v1.f56093w, uo.g1.c(), null, new c0(bitmap, str, null), 2, null);
    }

    public final void x4() {
        this.Z.c(new d0());
    }

    public final void y4() {
        d2 d10;
        d2.a.a(this.f21060c0, null, 1, null);
        d10 = uo.l.d(r0.a(uo.g1.c()), null, null, new q0(null), 3, null);
        this.f21060c0 = d10;
    }
}
