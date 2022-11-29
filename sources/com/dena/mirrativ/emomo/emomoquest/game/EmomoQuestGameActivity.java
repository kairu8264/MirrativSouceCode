package com.dena.mirrativ.emomo.emomoquest.game;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.emomo.emomoquest.ranking.EmomoQuestRankingActivity;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGiftGachaResult;
import com.dena.mirrorman.ChooseReceiver;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.unity.EmomoGameName;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityMiniGameOutputEmomoQuestLog;
import com.dena.mirrorman.unity.UnityScreenShotAvatarPosition;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.unity.UnityStore;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import o3.p0;
import org.json.JSONObject;
import uo.d2;
import uo.g1;
import uo.g3;

/* loaded from: classes.dex */
public final class EmomoQuestGameActivity extends e.b implements vb.q, v9.e, vb.w, uo.q0 {

    /* renamed from: l0  reason: collision with root package name */
    public static final a f20812l0 = new a(null);

    /* renamed from: m0  reason: collision with root package name */
    public static final int f20813m0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P;
    public t9.d Q;
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
    public final wn.f f20814a0;

    /* renamed from: b0  reason: collision with root package name */
    public final EmomoGameName f20815b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f20816c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AtomicBoolean f20817d0;

    /* renamed from: e0  reason: collision with root package name */
    public final AtomicBoolean f20818e0;

    /* renamed from: f0  reason: collision with root package name */
    public final wn.f f20819f0;

    /* renamed from: g0  reason: collision with root package name */
    public final wn.f f20820g0;

    /* renamed from: h0  reason: collision with root package name */
    public final wn.f f20821h0;

    /* renamed from: i0  reason: collision with root package name */
    public d2 f20822i0;

    /* renamed from: j0  reason: collision with root package name */
    public Integer f20823j0;

    /* renamed from: k0  reason: collision with root package name */
    public Bitmap f20824k0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2) {
            jo.p.h(context, "context");
            jo.p.h(str2, "playId");
            Intent intent = new Intent(context, EmomoQuestGameActivity.class);
            intent.putExtra("EXTRA_LIVE_ID", str);
            intent.putExtra("EXTRA_PLAY_ID", str2);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$9", f = "EmomoQuestGameActivity.kt", l = {444}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20825w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20827w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20827w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f20827w.f20815b0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                t9.d dVar2 = this.f20827w.Q;
                if (dVar2 == null) {
                    jo.p.v("store");
                    dVar2 = null;
                }
                String f10 = dVar2.w().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                this.f20827w.j4().openEquipmentGachaEmomoQuest(f10);
                v9.d.O0.a().z3(this.f20827w.a3(), "EmomoQuestEquipmentGachaDialogFragment");
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
            int i10 = this.f20825w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputOpenEquipmentGachaAnimationCompletedFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputOpenEquipmentGachaAnimationCompletedFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20825w = 1;
                if (miniGameOutputOpenEquipmentGachaAnimationCompletedFlow.a(aVar, this) == c10) {
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
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return EmomoQuestGameActivity.this.getCacheDir() + "/emomo.png";
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20829w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentActivity componentActivity) {
            super(0);
            this.f20829w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f20829w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$finishGame$2", f = "EmomoQuestGameActivity.kt", l = {200}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20830w;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$finishGame$2$1", f = "EmomoQuestGameActivity.kt", l = {604}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public Object f20832w;

            /* renamed from: x  reason: collision with root package name */
            public int f20833x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20834y;

            @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$finishGame$2$1$1$1", f = "EmomoQuestGameActivity.kt", l = {209}, m = "invokeSuspend")
            /* renamed from: com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0182a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f20835w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f20836x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ EmomoQuestGameActivity f20837y;

                /* renamed from: z  reason: collision with root package name */
                public final /* synthetic */ uo.p<wn.v> f20838z;

                /* renamed from: com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0183a implements xo.d<wn.v> {

                    /* renamed from: w  reason: collision with root package name */
                    public final /* synthetic */ uo.p<wn.v> f20839w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ uo.q0 f20840x;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C0183a(uo.p<? super wn.v> pVar, uo.q0 q0Var) {
                        this.f20839w = pVar;
                        this.f20840x = q0Var;
                    }

                    @Override // xo.d
                    /* renamed from: a */
                    public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                        uo.p<wn.v> pVar = this.f20839w;
                        wn.v vVar2 = wn.v.f59242a;
                        pVar.R(vVar2, null);
                        uo.r0.d(this.f20840x, null, 1, null);
                        return vVar2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0182a(EmomoQuestGameActivity emomoQuestGameActivity, uo.p<? super wn.v> pVar, ao.d<? super C0182a> dVar) {
                    super(2, dVar);
                    this.f20837y = emomoQuestGameActivity;
                    this.f20838z = pVar;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    C0182a c0182a = new C0182a(this.f20837y, this.f20838z, dVar);
                    c0182a.f20836x = obj;
                    return c0182a;
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C0182a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f20835w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        xo.w<wn.v> unloadMiniGameCompletedFlow = this.f20837y.k4().getUnloadMiniGameCompletedFlow();
                        C0183a c0183a = new C0183a(this.f20838z, (uo.q0) this.f20836x);
                        this.f20835w = 1;
                        if (unloadMiniGameCompletedFlow.a(c0183a, this) == c10) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EmomoQuestGameActivity emomoQuestGameActivity, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f20834y = emomoQuestGameActivity;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f20834y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f20833x;
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoQuestGameActivity emomoQuestGameActivity = this.f20834y;
                    this.f20832w = emomoQuestGameActivity;
                    this.f20833x = 1;
                    uo.q qVar = new uo.q(bo.b.b(this), 1);
                    qVar.y();
                    if (emomoQuestGameActivity.f20817d0.get()) {
                        emomoQuestGameActivity.j4().endGame(emomoQuestGameActivity.f20815b0);
                        emomoQuestGameActivity.f20818e0.set(true);
                        uo.l.d(uo.r0.a(g1.b()), null, null, new C0182a(emomoQuestGameActivity, qVar, null), 3, null);
                    } else {
                        qVar.R(wn.v.f59242a, null);
                    }
                    Object t10 = qVar.t();
                    if (t10 == bo.c.c()) {
                        co.h.c(this);
                    }
                    if (t10 == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    EmomoQuestGameActivity emomoQuestGameActivity2 = (EmomoQuestGameActivity) this.f20832w;
                    wn.m.b(obj);
                }
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
            int i10 = this.f20830w;
            if (i10 == 0) {
                wn.m.b(obj);
                a aVar = new a(EmomoQuestGameActivity.this, null);
                this.f20830w = 1;
                if (g3.d(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            EmomoQuestGameActivity.this.X3();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20841w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20842x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20843y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20844z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20841w = aVar;
            this.f20842x = aVar2;
            this.f20843y = aVar3;
            this.f20844z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20841w;
            vq.a aVar2 = this.f20842x;
            io.a aVar3 = this.f20843y;
            xq.a aVar4 = this.f20844z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(t9.d.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
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
            return EmomoQuestGameActivity.this.getIntent().getStringExtra("EXTRA_LIVE_ID");
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20846w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentActivity componentActivity) {
            super(0);
            this.f20846w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f20846w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$1", f = "EmomoQuestGameActivity.kt", l = {276}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20847w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20849w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20849w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Failure) {
                    of.n.f45411a.B(this.f20849w, ((MRError.Failure) mRError).getErrorMessage(), false);
                } else if (mRError instanceof MRError.Blocked) {
                    of.n.f45411a.B(this.f20849w, ((MRError.Blocked) mRError).getErrorMessage(), false);
                } else {
                    if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                        of.n.f45411a.l(this.f20849w, mRError);
                    } else if (mRError instanceof MRError.Network) {
                        of.n.z(this.f20849w);
                    }
                }
                this.f20849w.Y3();
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
            int i10 = this.f20847w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<MRError> p10 = dVar.p();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20847w = 1;
                if (p10.a(aVar, this) == c10) {
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
    public static final class e0 extends jo.q implements io.a<String> {
        public e0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = EmomoQuestGameActivity.this.getIntent().getStringExtra("EXTRA_PLAY_ID");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$2", f = "EmomoQuestGameActivity.kt", l = {289}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20851w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s9.a f20853y;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends jf.c, ? extends Set<? extends jf.k0>>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20854w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s9.a f20855x;

            public a(EmomoQuestGameActivity emomoQuestGameActivity, s9.a aVar) {
                this.f20854w = emomoQuestGameActivity;
                this.f20855x = aVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<jf.c, ? extends Set<? extends jf.k0>> kVar, ao.d<? super wn.v> dVar) {
                jf.c a10 = kVar.a();
                Set<? extends jf.k0> b10 = kVar.b();
                if (this.f20854w.f20818e0.get()) {
                    return wn.v.f59242a;
                }
                if (this.f20854w.f20817d0.get()) {
                    UnityActionCreator.updateAllParts$default(this.f20854w.j4(), a10, b10, 0, 4, null);
                } else {
                    t9.d dVar2 = this.f20854w.Q;
                    if (dVar2 == null) {
                        jo.p.v("store");
                        dVar2 = null;
                    }
                    Integer f10 = dVar2.s().f();
                    if (f10 == null) {
                        return wn.v.f59242a;
                    }
                    int intValue = f10.intValue();
                    this.f20854w.j4().setHttpRequestConfig();
                    this.f20854w.j4().loadEmomoQuest(intValue, this.f20854w.g4(), a10);
                    this.f20854w.f20817d0.set(true);
                    tb.b R = this.f20854w.c4().R();
                    this.f20854w.a3().k().s(this.f20855x.B.getId(), R.a(), R.b()).l();
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s9.a aVar, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f20853y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f20853y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20851w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<wn.k<jf.c, Set<jf.k0>>> q10 = dVar.q();
                a aVar = new a(EmomoQuestGameActivity.this, this.f20853y);
                this.f20851w = 1;
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

    /* loaded from: classes.dex */
    public static final class f0 extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ s9.a f20857x;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$setupUserActions$1$1", f = "EmomoQuestGameActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f20858w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s9.a f20859x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20860y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s9.a aVar, EmomoQuestGameActivity emomoQuestGameActivity, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f20859x = aVar;
                this.f20860y = emomoQuestGameActivity;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f20859x, this.f20860y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f20858w == 0) {
                    wn.m.b(obj);
                    this.f20859x.D.setVisibility(8);
                    this.f20860y.Y3();
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(s9.a aVar) {
            super(1);
            this.f20857x = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EmomoQuestGameActivity emomoQuestGameActivity = EmomoQuestGameActivity.this;
            uo.l.d(emomoQuestGameActivity, null, null, new a(this.f20857x, emomoQuestGameActivity, null), 3, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$3", f = "EmomoQuestGameActivity.kt", l = {308}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20861w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends String, ? extends List<? extends EmomoRunGiftGachaResult>>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20863w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20863w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<String, ? extends List<EmomoRunGiftGachaResult>> kVar, ao.d<? super wn.v> dVar) {
                this.f20863w.j4().openGiftGachaEmomoQuest(kVar.a());
                tb.a s02 = this.f20863w.c4().s0(kVar.b(), null, false, q9.d.J);
                s02.a().z3(this.f20863w.a3(), s02.b());
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
            int i10 = this.f20861w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<wn.k<String, List<EmomoRunGiftGachaResult>>> z10 = dVar.z();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20861w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$shareImage$1", f = "EmomoQuestGameActivity.kt", l = {550}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public int B;
        public final /* synthetic */ Bitmap D;

        /* renamed from: w  reason: collision with root package name */
        public Object f20864w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20865x;

        /* renamed from: y  reason: collision with root package name */
        public Object f20866y;

        /* renamed from: z  reason: collision with root package name */
        public Object f20867z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.p<MRLogger, String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f20868w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f20869x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Integer f20870y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f20871z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, Integer num, int i10) {
                super(2);
                this.f20868w = str;
                this.f20869x = str2;
                this.f20870y = num;
                this.f20871z = i10;
            }

            public final void a(MRLogger mRLogger, String str) {
                jo.p.h(mRLogger, "logger");
                MRLog.Companion companion = MRLog.Companion;
                String str2 = this.f20868w;
                String str3 = this.f20869x;
                Integer num = this.f20870y;
                int i10 = this.f20871z;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_QUEST_SHARE_PANEL_COMPLETE);
                builder.setTargetId(MRLog.TARGET_ID_TAP);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LogBase.SERVICE_NAME, str);
                jSONObject.put("game_no", num);
                jSONObject.put("gift_event_id", i10);
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str2), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, str3), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                mRLogger.sendLog(builder.build());
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(MRLogger mRLogger, String str) {
                a(mRLogger, str);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(Bitmap bitmap, ao.d<? super g0> dVar) {
            super(2, dVar);
            this.D = bitmap;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g0(this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String T4;
            int i10;
            Integer num;
            String str2;
            Object c10 = bo.c.c();
            int i11 = this.B;
            try {
                if (i11 == 0) {
                    wn.m.b(obj);
                    String d42 = EmomoQuestGameActivity.this.d4();
                    str = d42 == null ? "" : d42;
                    T4 = EmomoQuestGameActivity.this.m4().T4();
                    t9.d dVar = EmomoQuestGameActivity.this.Q;
                    if (dVar == null) {
                        jo.p.v("store");
                        dVar = null;
                    }
                    Integer f10 = dVar.s().f();
                    if (f10 == null) {
                        f10 = co.b.d(0);
                    }
                    int intValue = f10.intValue();
                    Integer num2 = EmomoQuestGameActivity.this.f20823j0;
                    MRLogger f42 = EmomoQuestGameActivity.this.f4();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_QUEST_SHARE_PANEL_IMP);
                    builder.setTargetId(MRLog.TARGET_ID_IMP);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("game_no", num2);
                    jSONObject.put("gift_event_id", intValue);
                    wn.v vVar = wn.v.f59242a;
                    builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, T4), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                    f42.sendLog(builder.build());
                    String str3 = EmomoQuestGameActivity.this.getString(q9.i.text_emomo_quest_share_text) + ((String) xn.a0.Z(of.s.f45426a.a(EmomoQuestGameActivity.this.e4().q3())));
                    hf.k0 h42 = EmomoQuestGameActivity.this.h4();
                    Bitmap bitmap = this.D;
                    this.f20864w = str;
                    this.f20865x = T4;
                    this.f20866y = num2;
                    this.f20867z = str3;
                    this.A = intValue;
                    this.B = 1;
                    Object a10 = h42.a("FILE_NAME_SHARE_SHOT", bitmap, this);
                    if (a10 == c10) {
                        return c10;
                    }
                    i10 = intValue;
                    obj = a10;
                    num = num2;
                    str2 = str3;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i10 = this.A;
                    str2 = (String) this.f20867z;
                    num = (Integer) this.f20866y;
                    T4 = (String) this.f20865x;
                    str = (String) this.f20864w;
                    wn.m.b(obj);
                }
                Uri a11 = EmomoQuestGameActivity.this.b4().a((File) obj);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", a11);
                intent.putExtra("android.intent.extra.TEXT", str2);
                intent.setType("image/png");
                EmomoQuestGameActivity.this.startActivity(Intent.createChooser(intent, "", PendingIntent.getBroadcast(EmomoQuestGameActivity.this, 0, ChooseReceiver.f25051x.a(EmomoQuestGameActivity.this, new a(str, T4, num, i10)), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()));
            } catch (FileNotFoundException unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$4", f = "EmomoQuestGameActivity.kt", l = {317}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20872w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20874w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20874w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f20874w.j4().notifyEquipmentGachaRequestFinished(true);
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
            int i10 = this.f20872w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<wn.v> y10 = dVar.y();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20872w = 1;
                if (y10.a(aVar, this) == c10) {
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
    public static final class h0 extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20875w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20876x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20875w = componentCallbacks;
            this.f20876x = aVar;
            this.f20877y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f20875w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f20876x, this.f20877y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$5", f = "EmomoQuestGameActivity.kt", l = {323}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20878w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20880w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20880w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f20880w.j4().notifyEquipmentGachaRequestFinished(false);
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
            int i10 = this.f20878w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<MRError> x10 = dVar.x();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20878w = 1;
                if (x10.a(aVar, this) == c10) {
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
        public final /* synthetic */ ComponentCallbacks f20881w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20882x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20883y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20881w = componentCallbacks;
            this.f20882x = aVar;
            this.f20883y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f20881w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f20882x, this.f20883y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$6", f = "EmomoQuestGameActivity.kt", l = {329}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20884w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20886w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20886w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f20886w.j4().receiveGiftEmomoQuest(str);
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
            int i10 = this.f20884w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<String> r10 = dVar.r();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20884w = 1;
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

    /* loaded from: classes.dex */
    public static final class j0 extends jo.q implements io.a<t9.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20887w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20888x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20887w = componentCallbacks;
            this.f20888x = aVar;
            this.f20889y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t9.a] */
        @Override // io.a
        public final t9.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20887w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(t9.a.class), this.f20888x, this.f20889y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$7", f = "EmomoQuestGameActivity.kt", l = {335}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20890w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20892w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20892w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f20892w.j4().notifyGiftGachaSent();
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
            int i10 = this.f20890w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<wn.v> t10 = dVar.t();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20890w = 1;
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

    /* loaded from: classes.dex */
    public static final class k0 extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20893w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20894x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20893w = componentCallbacks;
            this.f20894x = aVar;
            this.f20895y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f20893w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f20894x, this.f20895y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeApiStoreValues$8", f = "EmomoQuestGameActivity.kt", l = {341}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20896w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20898w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20898w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f20898w.Y3();
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
            int i10 = this.f20896w;
            if (i10 == 0) {
                wn.m.b(obj);
                t9.d dVar = EmomoQuestGameActivity.this.Q;
                if (dVar == null) {
                    jo.p.v("store");
                    dVar = null;
                }
                xo.w<wn.v> n10 = dVar.n();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20896w = 1;
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

    /* loaded from: classes.dex */
    public static final class l0 extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20899w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20900x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20899w = componentCallbacks;
            this.f20900x = aVar;
            this.f20901y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f20899w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f20900x, this.f20901y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$1", f = "EmomoQuestGameActivity.kt", l = {350}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20902w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s9.a f20904y;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20905w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s9.a f20906x;

            public a(EmomoQuestGameActivity emomoQuestGameActivity, s9.a aVar) {
                this.f20905w = emomoQuestGameActivity;
                this.f20906x = aVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f20905w.f20815b0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f20906x.D.setVisibility(8);
                this.f20905w.t4();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(s9.a aVar, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f20904y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f20904y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20902w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> loadMiniGameCompletedFlow = EmomoQuestGameActivity.this.k4().getLoadMiniGameCompletedFlow();
                a aVar = new a(EmomoQuestGameActivity.this, this.f20904y);
                this.f20902w = 1;
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

    /* loaded from: classes.dex */
    public static final class m0 extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20907w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20908x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20909y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20907w = componentCallbacks;
            this.f20908x = aVar;
            this.f20909y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f20907w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f20908x, this.f20909y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$10", f = "EmomoQuestGameActivity.kt", l = {454}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20910w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends UnityMiniGameOutputEmomoQuestLog>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20912w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20912w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, UnityMiniGameOutputEmomoQuestLog> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                UnityMiniGameOutputEmomoQuestLog b10 = kVar.b();
                if (this.f20912w.f20815b0 != a10) {
                    return wn.v.f59242a;
                }
                MRLogger f42 = this.f20912w.f4();
                MRLog.Companion companion = MRLog.Companion;
                String actionType = b10.getActionType();
                EmomoQuestGameActivity emomoQuestGameActivity = this.f20912w;
                MRLog.Builder builder = new MRLog.Builder(actionType);
                wn.k[] kVarArr = new wn.k[3];
                String d42 = emomoQuestGameActivity.d4();
                if (d42 == null) {
                    d42 = "";
                }
                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, d42);
                kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, emomoQuestGameActivity.m4().T4());
                kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, b10.getTargetDetail());
                builder.setPayload(xn.s.m(kVarArr));
                f42.sendLog(builder.build());
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
            int i10 = this.f20910w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, UnityMiniGameOutputEmomoQuestLog>> miniGameOutputEmomoQuestLogFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputEmomoQuestLogFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20910w = 1;
                if (miniGameOutputEmomoQuestLogFlow.a(aVar, this) == c10) {
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
    public static final class n0 extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20913w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20914x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20915y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20913w = componentCallbacks;
            this.f20914x = aVar;
            this.f20915y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f20913w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f20914x, this.f20915y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$11", f = "EmomoQuestGameActivity.kt", l = {469}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20916w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s9.a f20918y;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends Integer>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20919w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s9.a f20920x;

            public a(EmomoQuestGameActivity emomoQuestGameActivity, s9.a aVar) {
                this.f20919w = emomoQuestGameActivity;
                this.f20920x = aVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, Integer> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                int intValue = kVar.b().intValue();
                if (this.f20919w.f20815b0 != a10) {
                    return wn.v.f59242a;
                }
                this.f20919w.f20823j0 = co.b.d(intValue);
                this.f20919w.j4().captureScreenshot(UnityScreenShotAvatarPosition.CENTER, this.f20919w.a4(), this.f20920x.B.getWidth(), this.f20920x.B.getHeight(), "EMOMO_QUEST_SCREEN_SHOT_KEY");
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(s9.a aVar, ao.d<? super o> dVar) {
            super(2, dVar);
            this.f20918y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(this.f20918y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20916w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, Integer>> miniGameOutputEmomoQuestTouchResultShareFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputEmomoQuestTouchResultShareFlow();
                a aVar = new a(EmomoQuestGameActivity.this, this.f20918y);
                this.f20916w = 1;
                if (miniGameOutputEmomoQuestTouchResultShareFlow.a(aVar, this) == c10) {
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
    public static final class o0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20921w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20922x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20923y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20921w = componentCallbacks;
            this.f20922x = aVar;
            this.f20923y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f20921w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f20922x, this.f20923y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$12", f = "EmomoQuestGameActivity.kt", l = {483}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20924w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<UnityScreenshot> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20926w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20926w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityScreenshot unityScreenshot, ao.d<? super wn.v> dVar) {
                if (jo.p.c(unityScreenshot.getKey(), "EMOMO_QUEST_SCREEN_SHOT_KEY")) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(unityScreenshot.getImagePath());
                    try {
                        new File(unityScreenshot.getImagePath()).delete();
                    } catch (IOException unused) {
                    }
                    if (this.f20926w.i4().a().c()) {
                        this.f20926w.f20824k0 = decodeFile;
                        tb.a j10 = this.f20926w.c4().j(null);
                        j10.a().z3(this.f20926w.a3(), j10.b());
                    } else {
                        this.f20926w.s4(decodeFile);
                    }
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
            int i10 = this.f20924w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityScreenshot> screenshotCompletedFlow = EmomoQuestGameActivity.this.k4().getScreenshotCompletedFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20924w = 1;
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

    /* loaded from: classes.dex */
    public static final class p0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20927w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20928x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20929y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20927w = componentCallbacks;
            this.f20928x = aVar;
            this.f20929y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f20927w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f20928x, this.f20929y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$13", f = "EmomoQuestGameActivity.kt", l = {502}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20930w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20932w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20932w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f20932w.f20815b0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                this.f20932w.Y3();
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
            int i10 = this.f20930w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputCloseGameFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputCloseGameFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20930w = 1;
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

    /* loaded from: classes.dex */
    public static final class q0 extends jo.q implements io.a<hf.k0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20933w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20934x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20935y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20933w = componentCallbacks;
            this.f20934x = aVar;
            this.f20935y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.k0] */
        @Override // io.a
        public final hf.k0 invoke() {
            ComponentCallbacks componentCallbacks = this.f20933w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.k0.class), this.f20934x, this.f20935y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$14", f = "EmomoQuestGameActivity.kt", l = {509}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20936w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20938w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20938w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                if (str.length() > 0) {
                    of.n.f45411a.B(this.f20938w, str, false);
                } else {
                    of.n.z(this.f20938w);
                }
                this.f20938w.Y3();
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
            int i10 = this.f20936w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> httpRequestFailed = EmomoQuestGameActivity.this.k4().getHttpRequestFailed();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20936w = 1;
                if (httpRequestFailed.a(aVar, this) == c10) {
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
    public static final class r0 extends jo.q implements io.a<hf.y> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20939w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20940x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20941y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20939w = componentCallbacks;
            this.f20940x = aVar;
            this.f20941y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.y, java.lang.Object] */
        @Override // io.a
        public final hf.y invoke() {
            ComponentCallbacks componentCallbacks = this.f20939w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.y.class), this.f20940x, this.f20941y);
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$15", f = "EmomoQuestGameActivity.kt", l = {520}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20942w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20944w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20944w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f20944w.Y3();
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
            int i10 = this.f20942w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> loadMiniGameFailedFlow = EmomoQuestGameActivity.this.k4().getLoadMiniGameFailedFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20942w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$startPostGameStateJob$1", f = "EmomoQuestGameActivity.kt", l = {241, 244, 244}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public int f20945w;

        /* renamed from: x  reason: collision with root package name */
        public int f20946x;

        /* renamed from: y  reason: collision with root package name */
        public int f20947y;

        /* renamed from: z  reason: collision with root package name */
        public Object f20948z;

        @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$startPostGameStateJob$1$2", f = "EmomoQuestGameActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f20949w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20950x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ int f20951y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EmomoQuestGameActivity emomoQuestGameActivity, int i10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f20950x = emomoQuestGameActivity;
                this.f20951y = i10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f20950x, this.f20951y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f20949w == 0) {
                    wn.m.b(obj);
                    this.f20950x.Z3().i("event.emomo_quest", this.f20951y, false, this.f20950x.g4(), this.f20950x.d4());
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public s0(ao.d<? super s0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009a -> B:33:0x009b). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity.s0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$2", f = "EmomoQuestGameActivity.kt", l = {360}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20952w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends Integer>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20954w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20954w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, Integer> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                int intValue = kVar.b().intValue();
                if (this.f20954w.f20815b0 != a10) {
                    return wn.v.f59242a;
                }
                t9.a Z3 = this.f20954w.Z3();
                jf.k0[] values = jf.k0.values();
                ArrayList arrayList = new ArrayList();
                for (jf.k0 k0Var : values) {
                    if (k0Var.i() == intValue) {
                        arrayList.add(k0Var);
                    }
                }
                Z3.e("event.emomo_quest", xn.a0.F0(arrayList));
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
            int i10 = this.f20952w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, Integer>> miniGameOutputUpdateAvatarFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputUpdateAvatarFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20952w = 1;
                if (miniGameOutputUpdateAvatarFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$3", f = "EmomoQuestGameActivity.kt", l = {367}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20955w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends Integer>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20957w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20957w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, Integer> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                int intValue = kVar.b().intValue();
                if (this.f20957w.f20815b0 != a10) {
                    return wn.v.f59242a;
                }
                t9.d dVar2 = this.f20957w.Q;
                if (dVar2 == null) {
                    jo.p.v("store");
                    dVar2 = null;
                }
                Integer f10 = dVar2.s().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                y9.a.P0.a(f10.intValue(), intValue).z3(this.f20957w.a3(), "EmomoQuestRankingDialogFragment");
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
            int i10 = this.f20955w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, Integer>> miniGameOutputEmomoQuestTouchResultRankingFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputEmomoQuestTouchResultRankingFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20955w = 1;
                if (miniGameOutputEmomoQuestTouchResultRankingFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$4", f = "EmomoQuestGameActivity.kt", l = {376}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20958w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20960w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20960w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f20960w.f20815b0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                t9.d dVar2 = this.f20960w.Q;
                if (dVar2 == null) {
                    jo.p.v("store");
                    dVar2 = null;
                }
                Integer f10 = dVar2.s().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                int intValue = f10.intValue();
                EmomoQuestGameActivity emomoQuestGameActivity = this.f20960w;
                emomoQuestGameActivity.startActivity(EmomoQuestRankingActivity.U.a(emomoQuestGameActivity, "event.emomo_quest", intValue, true));
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
            int i10 = this.f20958w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputEmomoQuestTouchTitleRankingFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputEmomoQuestTouchTitleRankingFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20958w = 1;
                if (miniGameOutputEmomoQuestTouchTitleRankingFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$5", f = "EmomoQuestGameActivity.kt", l = {391}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20961w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends String>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20963w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20963w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, String> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                String b10 = kVar.b();
                if (this.f20963w.f20815b0 != a10) {
                    return wn.v.f59242a;
                }
                jf.b0 a11 = this.f20963w.l4().a(b10);
                if (!(a11 instanceof b0.l0)) {
                    EmomoQuestGameActivity emomoQuestGameActivity = this.f20963w;
                    emomoQuestGameActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(emomoQuestGameActivity, "event.emomo_quest", a11));
                } else {
                    EmomoQuestGameActivity emomoQuestGameActivity2 = this.f20963w;
                    emomoQuestGameActivity2.startActivity(WebViewActivity.a.b(WebViewActivity.X, emomoQuestGameActivity2, b10, false, false, 12, null));
                }
                MRLogger f42 = this.f20963w.f4();
                MRLog.Companion companion = MRLog.Companion;
                EmomoQuestGameActivity emomoQuestGameActivity3 = this.f20963w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_QUEST_LANDING_PAGE_IMP);
                builder.setTargetId(MRLog.TARGET_ID_IMP);
                wn.k[] kVarArr = new wn.k[3];
                String d42 = emomoQuestGameActivity3.d4();
                if (d42 == null) {
                    d42 = "";
                }
                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, d42);
                kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, emomoQuestGameActivity3.m4().T4());
                JSONObject jSONObject = new JSONObject();
                t9.d dVar2 = emomoQuestGameActivity3.Q;
                if (dVar2 == null) {
                    jo.p.v("store");
                    dVar2 = null;
                }
                Integer f10 = dVar2.s().f();
                if (f10 == null) {
                    f10 = co.b.d(0);
                }
                jo.p.g(f10, "store.giftEventId.value ?: 0");
                jSONObject.put("gift_event_id", f10.intValue());
                wn.v vVar = wn.v.f59242a;
                kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
                builder.setPayload(xn.s.m(kVarArr));
                f42.sendLog(builder.build());
                return vVar;
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
            int i10 = this.f20961w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, String>> miniGameOutputEmomoQuestTouchHelpFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputEmomoQuestTouchHelpFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20961w = 1;
                if (miniGameOutputEmomoQuestTouchHelpFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$6", f = "EmomoQuestGameActivity.kt", l = {416}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20964w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends String>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20966w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20966w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, String> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                String b10 = kVar.b();
                if (this.f20966w.f20815b0 != a10) {
                    return wn.v.f59242a;
                }
                jf.b0 a11 = this.f20966w.l4().a(b10);
                if (!(a11 instanceof b0.l0)) {
                    EmomoQuestGameActivity emomoQuestGameActivity = this.f20966w;
                    emomoQuestGameActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(emomoQuestGameActivity, "event.emomo_quest", a11));
                } else {
                    EmomoQuestGameActivity emomoQuestGameActivity2 = this.f20966w;
                    emomoQuestGameActivity2.startActivity(WebViewActivity.a.b(WebViewActivity.X, emomoQuestGameActivity2, b10, false, false, 12, null));
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
            int i10 = this.f20964w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, String>> miniGameOutputOpenGiftGachaLpFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputOpenGiftGachaLpFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20964w = 1;
                if (miniGameOutputOpenGiftGachaLpFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$7", f = "EmomoQuestGameActivity.kt", l = {428}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20967w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<EmomoGameName> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20969w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20969w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoGameName emomoGameName, ao.d<? super wn.v> dVar) {
                if (this.f20969w.f20815b0 != emomoGameName) {
                    return wn.v.f59242a;
                }
                t9.d dVar2 = this.f20969w.Q;
                if (dVar2 == null) {
                    jo.p.v("store");
                    dVar2 = null;
                }
                Integer f10 = dVar2.s().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                this.f20969w.Z3().k("event.emomo_quest", f10.intValue());
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
            int i10 = this.f20967w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoGameName> miniGameOutputOpenGiftGachaFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputOpenGiftGachaFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20967w = 1;
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

    @co.f(c = "com.dena.mirrativ.emomo.emomoquest.game.EmomoQuestGameActivity$observeUnityStoreValues$8", f = "EmomoQuestGameActivity.kt", l = {436}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20970w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<wn.k<? extends EmomoGameName, ? extends Integer>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ EmomoQuestGameActivity f20972w;

            public a(EmomoQuestGameActivity emomoQuestGameActivity) {
                this.f20972w = emomoQuestGameActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends EmomoGameName, Integer> kVar, ao.d<? super wn.v> dVar) {
                EmomoGameName a10 = kVar.a();
                int intValue = kVar.b().intValue();
                if (this.f20972w.f20815b0 != a10) {
                    return wn.v.f59242a;
                }
                t9.d dVar2 = this.f20972w.Q;
                if (dVar2 == null) {
                    jo.p.v("store");
                    dVar2 = null;
                }
                Integer f10 = dVar2.s().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                this.f20972w.Z3().j("event.emomo_quest", f10.intValue(), intValue);
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
            int i10 = this.f20970w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<EmomoGameName, Integer>> miniGameOutputOpenEquipmentGachaFlow = EmomoQuestGameActivity.this.k4().getMiniGameOutputOpenEquipmentGachaFlow();
                a aVar = new a(EmomoQuestGameActivity.this);
                this.f20970w = 1;
                if (miniGameOutputOpenEquipmentGachaFlow.a(aVar, this) == c10) {
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

    public EmomoQuestGameActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P = wn.g.b(iVar, new j0(this, null, null));
        this.R = wn.g.b(iVar, new k0(this, null, null));
        this.S = wn.g.b(iVar, new l0(this, null, null));
        this.T = wn.g.b(iVar, new m0(this, null, null));
        this.U = wn.g.b(iVar, new n0(this, null, null));
        this.V = wn.g.b(iVar, new o0(this, null, null));
        this.W = wn.g.b(iVar, new p0(this, null, null));
        this.X = wn.g.b(iVar, new q0(this, null, null));
        this.Y = wn.g.b(iVar, new r0(this, null, null));
        this.Z = wn.g.b(iVar, new h0(this, null, null));
        this.f20814a0 = wn.g.b(iVar, new i0(this, null, null));
        this.f20815b0 = EmomoGameName.EMOMO_QUEST;
        this.f20816c0 = true;
        this.f20817d0 = new AtomicBoolean(false);
        this.f20818e0 = new AtomicBoolean(false);
        this.f20819f0 = wn.g.a(new d());
        this.f20820g0 = wn.g.a(new e0());
        this.f20821h0 = wn.g.a(new b());
    }

    public static final o3.p0 q4(View view, o3.p0 p0Var) {
        jo.p.g(view, "v");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = p0Var.f(p0.m.f()).f31716d;
        view.setLayoutParams(marginLayoutParams);
        return o3.p0.f44009b;
    }

    @Override // vb.w
    public void A2() {
    }

    @Override // v9.e
    public void B1() {
        j4().notifyEquipmentGachaClose();
    }

    public final void X3() {
        if (this.f20816c0) {
            this.f20816c0 = false;
            uo.r0.d(this, null, 1, null);
            u4();
            Z3().h("event.emomo_quest", g4(), d4());
            finish();
        }
    }

    public final void Y3() {
        if (this.f20818e0.get()) {
            return;
        }
        Fragment e02 = a3().e0("EmomoGameViewFragment");
        if (e02 != null) {
            a3().k().p(e02).l();
        }
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final t9.a Z3() {
        return (t9.a) this.P.getValue();
    }

    public final String a4() {
        return (String) this.f20821h0.getValue();
    }

    public final hf.y b4() {
        return (hf.y) this.Y.getValue();
    }

    public final tb.c c4() {
        return (tb.c) this.W.getValue();
    }

    public final String d4() {
        return (String) this.f20819f0.getValue();
    }

    public final kf.m e4() {
        return (kf.m) this.U.getValue();
    }

    public final MRLogger f4() {
        return (MRLogger) this.f20814a0.getValue();
    }

    public final String g4() {
        return (String) this.f20820g0.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final hf.k0 h4() {
        return (hf.k0) this.X.getValue();
    }

    public final i1 i4() {
        return (i1) this.T.getValue();
    }

    public final UnityActionCreator j4() {
        return (UnityActionCreator) this.R.getValue();
    }

    public final UnityStore k4() {
        return (UnityStore) this.S.getValue();
    }

    public final of.k l4() {
        return (of.k) this.Z.getValue();
    }

    public final kf.x m4() {
        return (kf.x) this.V.getValue();
    }

    public final void n4(s9.a aVar) {
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(aVar, null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
    }

    public final void o4(s9.a aVar) {
        n4(aVar);
        p4(aVar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        wn.k a10;
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, q9.h.activity_emomo_quest_game);
        jo.p.g(g10, "setContentView(this, R.l…ctivity_emomo_quest_game)");
        s9.a aVar = (s9.a) g10;
        this.Q = (t9.d) ((androidx.lifecycle.q0) new androidx.lifecycle.s0(jo.f0.b(t9.d.class), new d0(this), new c0(new b0(this), null, null, gq.a.a(this))).getValue());
        o3.n0.a(getWindow(), false);
        o3.c0.F0(aVar.u(), t9.c.f53330w);
        if (i4().a().c()) {
            tb.b P = c4().P(true);
            a10 = wn.q.a(P.a(), P.b());
        } else {
            a10 = wn.q.a(u9.b.f54635y0.a(), "EmomoQuestGameDummyCommentFragment");
        }
        a3().k().s(aVar.F.getId(), (Fragment) a10.a(), (String) a10.b()).l();
        r4(aVar);
        o4(aVar);
        this.f20817d0.set(false);
        this.f20818e0.set(false);
        t9.a.f(Z3(), "event.emomo_quest", null, 2, null);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        if (!this.f20818e0.get()) {
            j4().endGame(this.f20815b0);
        }
        X3();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        u4();
        if (i4().a().c()) {
            Z3().l();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        t4();
        if (i4().a().c()) {
            Z3().g();
        }
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    public final void p4(s9.a aVar) {
        uo.l.d(this, null, null, new m(aVar, null), 3, null);
        uo.l.d(this, null, null, new t(null), 3, null);
        uo.l.d(this, null, null, new u(null), 3, null);
        uo.l.d(this, null, null, new v(null), 3, null);
        uo.l.d(this, null, null, new w(null), 3, null);
        uo.l.d(this, null, null, new x(null), 3, null);
        uo.l.d(this, null, null, new y(null), 3, null);
        uo.l.d(this, null, null, new z(null), 3, null);
        uo.l.d(this, null, null, new a0(null), 3, null);
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new o(aVar, null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
        uo.l.d(this, null, null, new q(null), 3, null);
        uo.l.d(this, null, null, new r(null), 3, null);
        uo.l.d(this, null, null, new s(null), 3, null);
    }

    @Override // vb.q
    public void q0() {
        j4().notifyGiftGachaClose();
    }

    public final void r4(s9.a aVar) {
        AppCompatImageView appCompatImageView = aVar.D;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new f0(aVar));
    }

    public final void s4(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        uo.l.d(uo.r0.a(g1.c()), null, null, new g0(bitmap, null), 3, null);
    }

    @Override // vb.w
    public void t0() {
        s4(this.f20824k0);
    }

    public final void t4() {
        d2 d10;
        if (this.f20822i0 == null && this.f20817d0.get()) {
            d10 = uo.l.d(uo.r0.a(g1.c()), null, null, new s0(null), 3, null);
            this.f20822i0 = d10;
        }
    }

    public final void u4() {
        d2 d2Var = this.f20822i0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.f20822i0 = null;
    }
}
