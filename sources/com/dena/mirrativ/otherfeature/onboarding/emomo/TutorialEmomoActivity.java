package com.dena.mirrativ.otherfeature.onboarding.emomo;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import be.g1;
import be.i1;
import be.r1;
import be.s1;
import ce.t;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.Avatar;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.AvatarItemBannerClickTargetDetail;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.request.PurchaseAvatarsRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetAvatarRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.CameraDolly;
import com.dena.mirrorman.unity.InitializeState;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityAnimation;
import com.dena.mirrorman.unity.UnityLoadAvatarModel;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.unity.UnityReceiverKt;
import com.dena.mirrorman.unity.UnityScreenShotAvatarPosition;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.unity.UnityStore;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ie.b;
import ie.f;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kq.a;
import uo.b1;
import uo.d2;
import uo.i2;
import uo.q0;
import uo.r0;
import vb.p;
import wn.l;

/* loaded from: classes2.dex */
public final class TutorialEmomoActivity extends e.b implements je.d, vb.p, vb.o, i1, s1, je.a, be.c, f.b, vb.g, vb.h, vb.f, vb.k, q0 {

    /* renamed from: m0  reason: collision with root package name */
    public static final a f21813m0 = new a(null);

    /* renamed from: n0  reason: collision with root package name */
    public static final int f21814n0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public db.e P;
    public final uo.b0 Q;
    public final wn.f R;
    public gf.w S;
    public boolean T;
    public boolean U;
    public final FragmentRunner V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21815a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f21816b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f21817c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f21818d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f21819e0;

    /* renamed from: f0  reason: collision with root package name */
    public final wn.f f21820f0;

    /* renamed from: g0  reason: collision with root package name */
    public final wn.f f21821g0;

    /* renamed from: h0  reason: collision with root package name */
    public final wn.f f21822h0;

    /* renamed from: i0  reason: collision with root package name */
    public final wn.f f21823i0;

    /* renamed from: j0  reason: collision with root package name */
    public final wn.f f21824j0;

    /* renamed from: k0  reason: collision with root package name */
    public final wn.f f21825k0;

    /* renamed from: l0  reason: collision with root package name */
    public final wn.f f21826l0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, boolean z10, boolean z11, boolean z12) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, TutorialEmomoActivity.class);
            intent.putExtra("EXTRA_IS_FIRST_LAUNCH", z10);
            intent.putExtra("EXTRA_IS_FROM_ONBOARDING", z11);
            intent.putExtra("EXTRA_FROM_LIVE_PREPARE", z12);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21827w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentActivity componentActivity) {
            super(0);
            this.f21827w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21827w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21828a;

        static {
            int[] iArr = new int[jf.c0.values().length];
            iArr[jf.c0.UP.ordinal()] = 1;
            iArr[jf.c0.LEFT.ordinal()] = 2;
            iArr[jf.c0.RIGHT.ordinal()] = 3;
            iArr[jf.c0.DOWN.ordinal()] = 4;
            f21828a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21829w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21830x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21831y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21832z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21829w = aVar;
            this.f21830x = aVar2;
            this.f21831y = aVar3;
            this.f21832z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21829w;
            vq.a aVar2 = this.f21830x;
            io.a aVar3 = this.f21831y;
            xq.a aVar4 = this.f21832z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity$doPoseAndSnapShot$1", f = "TutorialEmomoActivity.kt", l = {329}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21833w;

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
            int i10 = this.f21833w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f21833w = 1;
                if (b1.a(750L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            TutorialEmomoActivity.this.m4();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21835w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentActivity componentActivity) {
            super(0);
            this.f21835w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21835w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity$doPoseAndSnapShot$2", f = "TutorialEmomoActivity.kt", l = {341}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21836w;

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
            int i10 = this.f21836w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f21836w = 1;
                if (b1.a(750L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            TutorialEmomoActivity.this.q4();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21838w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentActivity componentActivity) {
            super(0);
            this.f21838w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f21838w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return TutorialEmomoActivity.this.getCacheDir() + "/emomo.png";
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21840w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21841x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21842y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21843z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21840w = aVar;
            this.f21841x = aVar2;
            this.f21842y = aVar3;
            this.f21843z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21840w;
            vq.a aVar2 = this.f21841x;
            io.a aVar3 = this.f21842y;
            xq.a aVar4 = this.f21843z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<Boolean> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(TutorialEmomoActivity.this.getIntent().getBooleanExtra("EXTRA_FROM_LIVE_PREPARE", false));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f21845w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentActivity componentActivity) {
            super(0);
            this.f21845w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f21845w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<Boolean> {
        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(TutorialEmomoActivity.this.getIntent().getBooleanExtra("EXTRA_IS_FROM_ONBOARDING", false));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends f8.c<File> {
        public h() {
        }

        @Override // f8.j
        /* renamed from: a */
        public void e(File file, g8.b<? super File> bVar) {
            jo.p.h(file, "resource");
            TutorialEmomoActivity.this.b4().f().p(file);
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class i<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f21848a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f21849b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f21850c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f21851d;

        public i(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3) {
            this.f21848a = c0Var;
            this.f21849b = liveData;
            this.f21850c = liveData2;
            this.f21851d = liveData3;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f21848a.f();
            Object f11 = this.f21849b.f();
            Object f12 = this.f21850c.f();
            Object f13 = this.f21851d.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f21848a;
            boolean booleanValue = ((Boolean) f13).booleanValue();
            boolean booleanValue2 = ((Boolean) f12).booleanValue();
            boolean booleanValue3 = ((Boolean) f11).booleanValue();
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf((!booleanValue3 || booleanValue2 || booleanValue) ? false : true));
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity$onCreate$1", f = "TutorialEmomoActivity.kt", l = {157}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21852w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityLoadAvatarModel> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ TutorialEmomoActivity f21854w;

            public a(TutorialEmomoActivity tutorialEmomoActivity) {
                this.f21854w = tutorialEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityLoadAvatarModel unityLoadAvatarModel, ao.d<? super wn.v> dVar) {
                ClosetAccessoryAsset companionType;
                UnityManager.Companion companion = UnityManager.Companion;
                companion.getInstance().restoreCameraDolly();
                UnityManager companion2 = companion.getInstance();
                ClosetAvatar N = this.f21854w.S3().N();
                companion2.setCompanionName((N == null || (companionType = N.getCompanionType()) == null || (r0 = companionType.getName()) == null) ? "" : "");
                companion.getInstance().setMainichi(this.f21854w.f4().s3());
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21852w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityLoadAvatarModel> loadAvatarModelCompletedFlow = TutorialEmomoActivity.this.d4().getLoadAvatarModelCompletedFlow();
                a aVar = new a(TutorialEmomoActivity.this);
                this.f21852w = 1;
                if (loadAvatarModelCompletedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity$onCreate$2", f = "TutorialEmomoActivity.kt", l = {165}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21855w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ TutorialEmomoActivity f21857w;

            public a(TutorialEmomoActivity tutorialEmomoActivity) {
                this.f21857w = tutorialEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f21857w.R3().k();
                this.f21857w.R3().i();
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21855w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> finishedMiniGameFlow = TutorialEmomoActivity.this.d4().getFinishedMiniGameFlow();
                a aVar = new a(TutorialEmomoActivity.this);
                this.f21855w = 1;
                if (finishedMiniGameFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity$onCreate$3", f = "TutorialEmomoActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f21858w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityScreenshot> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ TutorialEmomoActivity f21860w;

            /* renamed from: com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0191a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ TutorialEmomoActivity f21861w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ UnityScreenshot f21862x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0191a(TutorialEmomoActivity tutorialEmomoActivity, UnityScreenshot unityScreenshot) {
                    super(0);
                    this.f21861w = tutorialEmomoActivity;
                    this.f21862x = unityScreenshot;
                }

                public final void a() {
                    if (this.f21861w.V3()) {
                        be.b.Z0.a(Referer.AVATAR, this.f21862x, this.f21861w.f4().T4(), this.f21861w.f4().t4(), this.f21861w.S3().B0(), false).z3(this.f21861w.a3(), "AfterShutterEmomoOnboardingDialog");
                        return;
                    }
                    je.c.f37722g1.a(Referer.AVATAR, this.f21862x, this.f21861w.f4().T4(), this.f21861w.f4().t4(), this.f21861w.S3().B0(), false).z3(this.f21861w.a3(), "EmomoRegistrationDialog");
                    this.f21861w.U = true;
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            /* loaded from: classes2.dex */
            public static final class b extends jo.q implements io.p<String, String, wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ TutorialEmomoActivity f21863w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TutorialEmomoActivity tutorialEmomoActivity) {
                    super(2);
                    this.f21863w = tutorialEmomoActivity;
                }

                public final void a(String str, String str2) {
                    jo.p.h(str, "bodyPath");
                    jo.p.h(str2, "facePath");
                    ClosetAvatar R = this.f21863w.S3().R();
                    if (R != null) {
                        TutorialEmomoActivity tutorialEmomoActivity = this.f21863w;
                        tutorialEmomoActivity.R3().t(tutorialEmomoActivity.S3().y0(), R, new UpdateClosetImagesRequest(tutorialEmomoActivity.S3().y0(), str, str2), tutorialEmomoActivity.V3());
                    }
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(String str, String str2) {
                    a(str, str2);
                    return wn.v.f59242a;
                }
            }

            public a(TutorialEmomoActivity tutorialEmomoActivity) {
                this.f21860w = tutorialEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityScreenshot unityScreenshot, ao.d<? super wn.v> dVar) {
                if (jo.p.c(unityScreenshot.getKey(), UnityReceiverKt.EMOMO)) {
                    this.f21860w.V.c(new C0191a(this.f21860w, unityScreenshot));
                    File f10 = this.f21860w.b4().f().f();
                    if (f10 != null) {
                        TutorialEmomoActivity tutorialEmomoActivity = this.f21860w;
                        Context applicationContext = tutorialEmomoActivity.getApplicationContext();
                        jo.p.g(applicationContext, "applicationContext");
                        b bVar = new b(tutorialEmomoActivity);
                        Bitmap decodeFile = BitmapFactory.decodeFile(f10.getAbsolutePath());
                        jo.p.g(decodeFile, "decodeFile(it.absolutePath)");
                        unityScreenshot.saveAvatarImages(applicationContext, bVar, decodeFile);
                    }
                    UnityManager.Companion companion = UnityManager.Companion;
                    UnityManager.setAnimation$default(companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
                    companion.getInstance().restoreCameraDolly();
                    return wn.v.f59242a;
                }
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
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f21858w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityScreenshot> screenshotCompletedFlow = TutorialEmomoActivity.this.d4().getScreenshotCompletedFlow();
                a aVar = new a(TutorialEmomoActivity.this);
                this.f21858w = 1;
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

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<wn.v> {
        public m() {
            super(0);
        }

        public final void a() {
            tb.a g10 = TutorialEmomoActivity.this.X3().g(true);
            g10.a().z3(TutorialEmomoActivity.this.a3(), g10.b());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.onboarding.emomo.TutorialEmomoActivity$onPurchase$1", f = "TutorialEmomoActivity.kt", l = {476}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ sd.b A;

        /* renamed from: w  reason: collision with root package name */
        public int f21865w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f21866x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Parcelable f21868z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Parcelable parcelable, sd.b bVar, ao.d<? super n> dVar) {
            super(2, dVar);
            this.f21868z = parcelable;
            this.A = bVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            n nVar = new n(this.f21868z, this.A, dVar);
            nVar.f21866x = obj;
            return nVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object a10;
            Object c10 = bo.c.c();
            int i10 = this.f21865w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    q0 q0Var = (q0) this.f21866x;
                    TutorialEmomoActivity tutorialEmomoActivity = TutorialEmomoActivity.this;
                    Parcelable parcelable = this.f21868z;
                    l.a aVar = wn.l.f59224w;
                    MRRequest a42 = tutorialEmomoActivity.a4();
                    PurchaseAvatarsRequest b10 = ((ke.a) parcelable).b();
                    this.f21865w = 1;
                    obj = a42.postPurchaseAvatars(Referer.AVATAR, b10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a10 = wn.l.a((PurchaseAvatarsResponse) obj);
            } catch (Throwable th2) {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th2));
            }
            TutorialEmomoActivity tutorialEmomoActivity2 = TutorialEmomoActivity.this;
            sd.b bVar = this.A;
            Parcelable parcelable2 = this.f21868z;
            if (wn.l.b(a10) == null) {
                PurchaseAvatarsResponse purchaseAvatarsResponse = (PurchaseAvatarsResponse) a10;
                MRLogger Z3 = tutorialEmomoActivity2.Z3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COIN_CONSUME);
                builder.setTargetType("avatar_shop");
                builder.setPayload(xn.r.d(companion.purchaseItemIds((ke.a) parcelable2)));
                Z3.sendLog(builder.build());
                tutorialEmomoActivity2.R3().E(purchaseAvatarsResponse);
                if (purchaseAvatarsResponse.getResultImageUrl().length() > 0) {
                    if (purchaseAvatarsResponse.getResultMessage().length() > 0) {
                        be.u.Q0.a(purchaseAvatarsResponse.getResultImageUrl(), purchaseAvatarsResponse.getResultMessage()).z3(tutorialEmomoActivity2.a3(), "AvatarPartsPurchaseResultDialog");
                        tutorialEmomoActivity2.M3("EmomoDressUpShopDialog");
                        bVar.n3();
                    }
                }
                of.n.A(tutorialEmomoActivity2.getBaseContext(), wa.j.f58554n, false);
                tutorialEmomoActivity2.M3("EmomoDressUpShopDialog");
                bVar.n3();
            } else {
                bVar.n3();
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21869w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21870x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21871y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21869w = componentCallbacks;
            this.f21870x = aVar;
            this.f21871y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21869w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f21870x, this.f21871y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21872w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21873x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21874y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21872w = componentCallbacks;
            this.f21873x = aVar;
            this.f21874y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f21872w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.b.class), this.f21873x, this.f21874y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21875w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21876x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21875w = componentCallbacks;
            this.f21876x = aVar;
            this.f21877y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f21875w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f21876x, this.f21877y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21878w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21879x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21880y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21878w = componentCallbacks;
            this.f21879x = aVar;
            this.f21880y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f21878w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f21879x, this.f21880y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21881w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21882x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21883y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21881w = componentCallbacks;
            this.f21882x = aVar;
            this.f21883y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f21881w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f21882x, this.f21883y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21884w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21885x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21886y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21884w = componentCallbacks;
            this.f21885x = aVar;
            this.f21886y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f21884w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f21885x, this.f21886y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21887w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21888x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21887w = componentCallbacks;
            this.f21888x = aVar;
            this.f21889y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21887w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f21888x, this.f21889y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21890w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21891x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21890w = componentCallbacks;
            this.f21891x = aVar;
            this.f21892y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f21890w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f21891x, this.f21892y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21893w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21894x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21893w = componentCallbacks;
            this.f21894x = aVar;
            this.f21895y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f21893w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f21894x, this.f21895y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21896w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21897x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21898y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21896w = componentCallbacks;
            this.f21897x = aVar;
            this.f21898y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f21896w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f21897x, this.f21898y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21899w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21900x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21899w = componentCallbacks;
            this.f21900x = aVar;
            this.f21901y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f21899w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f21900x, this.f21901y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21902w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21903x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21904y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21902w = componentCallbacks;
            this.f21903x = aVar;
            this.f21904y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f21902w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.c.class), this.f21903x, this.f21904y);
        }
    }

    public TutorialEmomoActivity() {
        uo.b0 b10;
        b10 = i2.b(null, 1, null);
        this.Q = b10;
        this.R = wn.g.a(new e());
        this.V = new FragmentRunner(this);
        this.W = new s0(jo.f0.b(je.e.class), new c0(this), new b0(new a0(this), null, null, gq.a.a(this)));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.X = wn.g.b(iVar, new r(this, null, null));
        this.Y = wn.g.b(iVar, new s(this, null, null));
        this.Z = wn.g.b(iVar, new t(this, null, null));
        this.f21815a0 = wn.g.b(iVar, new u(this, null, null));
        this.f21816b0 = wn.g.b(iVar, new v(this, null, null));
        this.f21817c0 = wn.g.b(iVar, new w(this, null, null));
        this.f21818d0 = wn.g.b(iVar, new x(this, null, null));
        this.f21819e0 = new s0(jo.f0.b(nf.f.class), new f0(this), new e0(new d0(this), null, null, gq.a.a(this)));
        this.f21820f0 = wn.g.b(iVar, new y(this, null, null));
        this.f21821g0 = wn.g.b(iVar, new z(this, null, null));
        this.f21822h0 = wn.g.b(iVar, new o(this, null, null));
        this.f21823i0 = wn.g.b(iVar, new p(this, null, null));
        this.f21824j0 = wn.g.b(iVar, new q(this, null, null));
        this.f21825k0 = wn.g.a(new f());
        this.f21826l0 = wn.g.a(new g());
    }

    public static final void g4(TutorialEmomoActivity tutorialEmomoActivity, Boolean bool) {
        jo.p.h(tutorialEmomoActivity, "this$0");
        if (bool.booleanValue()) {
            tutorialEmomoActivity.V.c(new m());
            tutorialEmomoActivity.P3().Q();
        }
    }

    @Override // vb.g
    public void E(int i10) {
        b4().f().p(null);
        R3().h(i10);
    }

    @Override // je.a
    public void E0(float f10) {
        UnityManager.Companion.getInstance().setCameraDolly(f10);
    }

    @Override // be.c
    public void F0() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // be.s1
    public void G0(String str) {
        jo.p.h(str, "key");
        M3("EmomoShutterEffectDialog");
        Puree.d(new Avatar.AvatarTakePicture(""));
        c4().captureScreenshot(UnityScreenShotAvatarPosition.CENTER, T3(), UnityReceiverKt.EMOMO_PHOTO_SIZE, UnityReceiverKt.EMOMO_PHOTO_SIZE, UnityReceiverKt.EMOMO);
    }

    @Override // vb.p
    public void G2(String str) {
        jo.p.h(str, "url");
        GlideApp.with((androidx.fragment.app.h) this).asFile().load(str).into((GlideRequest<File>) new h());
    }

    @Override // vb.p
    public void J0() {
        p4();
    }

    @Override // be.i1
    public void J2() {
    }

    public final void M3(String str) {
        Fragment e02 = a3().e0(str);
        if (e02 != null) {
            a3().k().q(e02).j();
        }
    }

    public final void N3() {
        setResult(-1, new Intent());
        dq.c.c().l(new ce.u());
        finish();
    }

    @Override // vb.h
    public void O1(int i10) {
        R3().F(i10);
        O3();
    }

    public final void O3() {
        R3().d();
        if (V3()) {
            uo.l.d(this, null, null, new c(null), 3, null);
        } else if (!this.T) {
            this.T = true;
            Puree.d(new Avatar.EmomoTabTutorial("", "created"));
            m4();
        } else if (this.U) {
            UnityManager.Companion.getInstance().setCameraDolly(CameraDolly.DEFAULT);
            uo.l.d(this, null, null, new d(null), 3, null);
        } else {
            n4();
        }
    }

    @Override // je.d
    public void P1() {
        M3("EmomoRegistrationDialog");
        N3();
    }

    public final od.b P3() {
        return (od.b) this.f21823i0.getValue();
    }

    public final nf.c Q3() {
        return (nf.c) this.f21821g0.getValue();
    }

    public final od.e R3() {
        return (od.e) this.f21818d0.getValue();
    }

    public final nf.f S3() {
        return (nf.f) this.f21819e0.getValue();
    }

    @Override // vb.f
    public void T1() {
        ClosetAvatar clone;
        b4().f().p(null);
        ClosetAvatar N = S3().N();
        if (N == null || (clone = N.clone()) == null) {
            return;
        }
        R3().m(clone);
    }

    public final String T3() {
        return (String) this.R.getValue();
    }

    @Override // be.i1
    public void U0(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        jo.p.h(closetAvatarSimpleValue, "pose");
        Puree.d(new Avatar.AvatarSelectPose(closetAvatarSimpleValue.getId()));
        UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), closetAvatarSimpleValue.getValue(), 0, 2, null);
    }

    public final boolean U3() {
        return ((Boolean) this.f21825k0.getValue()).booleanValue();
    }

    @Override // vb.p
    public void V1(Serializable serializable) {
        p.a.b(this, serializable);
    }

    public final boolean V3() {
        return ((Boolean) this.f21826l0.getValue()).booleanValue();
    }

    @Override // vb.p
    public void W0(float f10) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        db.e eVar = this.P;
        db.e eVar2 = null;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        cVar.g(eVar.C);
        db.e eVar3 = this.P;
        if (eVar3 == null) {
            jo.p.v("binding");
            eVar3 = null;
        }
        int id2 = eVar3.B.getId();
        db.e eVar4 = this.P;
        if (eVar4 == null) {
            jo.p.v("binding");
            eVar4 = null;
        }
        cVar.l(id2, eVar4.u().getHeight() - ((int) f10));
        db.e eVar5 = this.P;
        if (eVar5 == null) {
            jo.p.v("binding");
        } else {
            eVar2 = eVar5;
        }
        cVar.c(eVar2.C);
    }

    public final nf.o W3() {
        return (nf.o) this.f21816b0.getValue();
    }

    public final tb.c X3() {
        return (tb.c) this.f21822h0.getValue();
    }

    @Override // be.i1
    public void Y1() {
        R3().n();
        M3("EmomoPoseDialog");
        if (UnityManager.Companion.getInstance().getInitializeState() == InitializeState.INITIALIZED) {
            q4();
        }
    }

    public final kf.m Y3() {
        return (kf.m) this.f21824j0.getValue();
    }

    public final MRLogger Z3() {
        return (MRLogger) this.f21815a0.getValue();
    }

    public final MRRequest a4() {
        return (MRRequest) this.Z.getValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_CONFIRM_CANCEL_DRESS_UP_DIALOG")) {
            b4().f().p(null);
            R3().f();
            R3().d();
            Puree.d(new Avatar.AvatarCloseCloset(""));
            dq.c.c().l(t.i.f19480a);
            finish();
            return;
        }
        N3();
    }

    @Override // vb.p
    public void b2() {
        j4();
    }

    public final je.e b4() {
        return (je.e) this.W.getValue();
    }

    @Override // ie.f.b
    public void c(String str) {
        jo.p.h(str, "tag");
    }

    public final UnityActionCreator c4() {
        return (UnityActionCreator) this.X.getValue();
    }

    public final UnityStore d4() {
        return (UnityStore) this.Y.getValue();
    }

    public final of.k e4() {
        return (of.k) this.f21817c0.getValue();
    }

    @Override // vb.f
    public void f2() {
        b4().f().p(null);
    }

    public final kf.x f4() {
        return (kf.x) this.f21820f0.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // vb.p
    public void h() {
        M3("EmomoDressUpShopDialog");
    }

    public final void h4(String str) {
        jf.b0 a10 = e4().a(str);
        MRLogger Z3 = Z3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(EventBannerActionType.AVATAR_ITEM_BANNER_CLICK.getRawValue());
        ClosetAvatar R = S3().R();
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new AvatarItemBannerClickTargetDetail(str, R != null ? UpdateClosetAvatarRequest.Companion.convert(R, S3().y0()) : null).toJson())));
        Z3.sendLog(builder.build());
        if (!(a10 instanceof b0.l0)) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.CLOSET, a10));
        } else {
            startActivity(WebViewActivity.a.b(WebViewActivity.X, this, str, false, false, 12, null));
        }
    }

    @Override // vb.p
    public void i() {
        List<Closet> f10 = S3().K().f();
        if (f10 != null) {
            if (V3()) {
                R3().n();
                O3();
            } else if ((!f10.isEmpty()) && f10.get(0).isUsed()) {
                o4();
            } else {
                O3();
            }
        }
    }

    @Override // vb.p
    public void i1() {
        M3("EmomoDressUpDialog");
    }

    public final void i4() {
        tb.a O = X3().O(true);
        O.a().z3(a3(), O.b());
    }

    @Override // vb.p
    public void j2(String str) {
        jo.p.h(str, "bannerUrl");
        h4(str);
    }

    public final void j4() {
        tb.a c10 = X3().c();
        c10.a().z3(a3(), c10.b());
    }

    @Override // vb.p
    public void k1(Serializable serializable, boolean z10) {
        p.a.a(this, serializable, z10);
    }

    public final void k4() {
        f.a aVar = ie.f.V0;
        String string = getString(wa.j.f58553m);
        jo.p.g(string, "getString(R.string.text_emomo_confirm_close)");
        f.a.b(aVar, string, getString(wa.j.f58558z), getString(wa.j.f58549f), null, false, 24, null).z3(a3(), "DIALOG_TAG_CONFIRM_CANCEL_DRESS_UP_DIALOG");
    }

    @Override // je.d
    public void l() {
        M3("EmomoRegistrationDialog");
        n4();
    }

    public final void l4() {
        tb.a T = X3().T(Referer.AVATAR, null, V3());
        T.a().z3(a3(), T.b());
        MRLogger Z3 = Z3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_IMP_CLOSET);
        String f10 = W3().q().f();
        if (U3()) {
            builder.setPageId(Referer.LIVE_PREPARATION);
        } else if (f10 == null) {
            builder.setPageId(Referer.HOME);
        } else {
            builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
            builder.setTargetId(f10);
            builder.setPageId(Referer.BROADCAST_AVATAR);
        }
        Z3.sendLog(builder.build());
    }

    public final void m4() {
        tb.a c02 = X3().c0(true);
        c02.a().z3(a3(), c02.b());
    }

    public final void n4() {
        g1.U0.a(false, true).z3(a3(), "EmomoPoseDialog");
    }

    @Override // vb.o
    public void o2() {
        M3("EmomoDressUpCompleteDialog");
        n4();
    }

    public final void o4() {
        tb.a D0 = X3().D0();
        D0.a().z3(a3(), D0.b());
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, wa.f.activity_tutorial_emomo);
        jo.p.g(g10, "setContentView(this, R.l….activity_tutorial_emomo)");
        this.P = (db.e) g10;
        gf.w a10 = gf.w.B0.a();
        a3().k().s(wa.e.f58531g, a10, "EmomoStreamViewFragment").i();
        this.S = a10;
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        uo.l.d(this, null, null, new l(null), 3, null);
        Boolean bool = Boolean.FALSE;
        LiveData<Boolean> L0 = Q3().L0();
        LiveData<Boolean> y02 = Q3().y0();
        LiveData<Boolean> H0 = Q3().H0();
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(bool);
        for (LiveData liveData : xn.s.m(L0, y02, H0)) {
            c0Var.q(liveData, new i(c0Var, L0, y02, H0));
        }
        LiveData a11 = p0.a(c0Var);
        jo.p.g(a11, "distinctUntilChanged(this)");
        a11.i(this, new androidx.lifecycle.f0() { // from class: fb.a
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                TutorialEmomoActivity.g4(TutorialEmomoActivity.this, (Boolean) obj);
            }
        });
        l4();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        d2.a.a(this.Q, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        if (jo.p.c(S3().N0().f(), Boolean.TRUE)) {
            R3().k();
            R3().i();
        }
        UnityManager.Companion.getInstance().getCollabAvatarManager().stopCollabMode();
        R3().j();
    }

    @Override // je.a
    public void p2(jf.c0 c0Var) {
        ClosetAvatarSimpleValue motion1;
        jo.p.h(c0Var, "direction");
        int i10 = b.f21828a[c0Var.ordinal()];
        if (i10 == 1) {
            ClosetAvatar N = S3().N();
            if (N != null) {
                motion1 = N.getMotion1();
            }
            motion1 = null;
        } else if (i10 == 2) {
            ClosetAvatar N2 = S3().N();
            if (N2 != null) {
                motion1 = N2.getMotion2();
            }
            motion1 = null;
        } else if (i10 == 3) {
            ClosetAvatar N3 = S3().N();
            if (N3 != null) {
                motion1 = N3.getMotion3();
            }
            motion1 = null;
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            ClosetAvatar N4 = S3().N();
            if (N4 != null) {
                motion1 = N4.getMotion4();
            }
            motion1 = null;
        }
        if (motion1 != null) {
            UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), motion1.getValue(), 0, 2, null);
            Puree.d(new Avatar.AvatarGesture("", motion1.getId()));
        }
    }

    public final void p4() {
        tb.a l02 = X3().l0();
        l02.a().z3(a3(), l02.b());
    }

    @Override // be.c
    public void q() {
        n4();
    }

    public final void q4() {
        r1.a.b(r1.R0, null, 1, null).z3(a3(), "EmomoShutterEffectDialog");
    }

    @Override // vb.p
    public void r1(boolean z10) {
        if (!z10) {
            R3().d();
            Puree.d(new Avatar.AvatarCloseCloset(""));
            dq.c.c().l(t.i.f19480a);
            finish();
            return;
        }
        k4();
    }

    @Override // vb.p
    public void t1() {
        i4();
    }

    @Override // be.i1
    public void u() {
        M3("EmomoPoseDialog");
        UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        l4();
    }

    @Override // vb.k
    public void v1(boolean z10) {
        P3().a0(Referer.AVATAR, Y3().b(), z10);
    }

    @Override // vb.p
    public void y2(Parcelable parcelable, boolean z10) {
        jo.p.h(parcelable, "equipAvatars");
        if (parcelable instanceof ke.a) {
            if (z10) {
                b.a aVar = ie.b.P0;
                String string = getString(wa.j.f58551h);
                jo.p.g(string, "getString(R.string.text_canning_alert_title)");
                aVar.a(string, getString(wa.j.f58550g), getString(wa.j.f58558z)).z3(a3(), "CustomMessageDialog");
                return;
            }
            sd.b a10 = sd.b.O0.a(false);
            a10.z3(a3(), "ProgressDialogFragment");
            uo.l.d(r0.a(uo.g1.c().plus(this.Q)), null, null, new n(parcelable, a10, null), 3, null);
        }
    }

    @Override // je.a
    public void z0(String str) {
        jo.p.h(str, "targetDetail");
        Puree.d(new Avatar.AvatarZoom(a3().e0("EmomoDressUpDialog") != null ? "avatar_closet" : Referer.TUTORIAL, str));
    }
}
