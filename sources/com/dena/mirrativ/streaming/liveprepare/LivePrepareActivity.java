package com.dena.mirrativ.streaming.liveprepare;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import be.i1;
import be.r1;
import be.s1;
import be.v2;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity;
import com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.Avatar;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import com.dena.mirrorman.net.MRUrl;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.user.Anniversary;
import com.dena.mirrorman.net.api.response.user.AnniversaryType;
import com.dena.mirrorman.unity.CameraDolly;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityAnimation;
import com.dena.mirrorman.unity.UnityLoadAvatarModel;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.unity.UnityReceiverKt;
import com.dena.mirrorman.unity.UnityScreenShotAvatarPosition;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.unity.UnityStore;
import com.dena.mirrorman.util.FragmentRunner;
import com.dena.mirrorman.widget.OutlineTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kq.a;
import nd.c;
import sf.i;
import uo.b3;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class LivePrepareActivity extends e.b implements lc.c0, v2, je.d, i1, s1, je.a, q0 {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f23740h0 = new a(null);

    /* renamed from: i0  reason: collision with root package name */
    public static final int f23741i0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public jc.f P;
    public jc.j Q;
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
    public final wn.f f23742a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f23743b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f23744c0;

    /* renamed from: d0  reason: collision with root package name */
    public d2 f23745d0;

    /* renamed from: e0  reason: collision with root package name */
    public ac.c f23746e0;

    /* renamed from: f0  reason: collision with root package name */
    public final FragmentRunner f23747f0;

    /* renamed from: g0  reason: collision with root package name */
    public final wn.f f23748g0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, LivePrepareActivity.class);
            intent.putExtra("EXTRA_APP_ID", str);
            intent.putExtra("EXTRA_COLLAB_LIVE_ID", str2);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23749w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23750x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23751y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23749w = componentCallbacks;
            this.f23750x = aVar;
            this.f23751y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f23749w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f23750x, this.f23751y);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23752a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f23753b;

        static {
            int[] iArr = new int[AnniversaryType.values().length];
            iArr[AnniversaryType.BIRTHDAY.ordinal()] = 1;
            iArr[AnniversaryType.FOLLOWER.ordinal()] = 2;
            iArr[AnniversaryType.NORMAL_CONTINUOUS.ordinal()] = 3;
            iArr[AnniversaryType.MASTER_CONTINUOUS.ordinal()] = 4;
            iArr[AnniversaryType.SUPER_CONTINUOUS.ordinal()] = 5;
            iArr[AnniversaryType.EXTREME_CONTINUOUS.ordinal()] = 6;
            iArr[AnniversaryType.MASTER_MONTHLY_CONTINUOUS.ordinal()] = 7;
            iArr[AnniversaryType.SUPER_MONTHLY_CONTINUOUS.ordinal()] = 8;
            iArr[AnniversaryType.EXTREME_MONTHLY_CONTINUOUS.ordinal()] = 9;
            iArr[AnniversaryType.UNDEFINED_API_PARAM.ordinal()] = 10;
            f23752a = iArr;
            int[] iArr2 = new int[jf.c0.values().length];
            iArr2[jf.c0.UP.ordinal()] = 1;
            iArr2[jf.c0.LEFT.ordinal()] = 2;
            iArr2[jf.c0.RIGHT.ordinal()] = 3;
            iArr2[jf.c0.DOWN.ordinal()] = 4;
            f23753b = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23754w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23755x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23756y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23754w = componentCallbacks;
            this.f23755x = aVar;
            this.f23756y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f23754w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f23755x, this.f23756y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return LivePrepareActivity.this.getIntent().getStringExtra("EXTRA_APP_ID");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23758w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23759x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23760y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23758w = componentCallbacks;
            this.f23759x = aVar;
            this.f23760y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f23758w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f23759x, this.f23760y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return LivePrepareActivity.this.getIntent().getStringExtra("EXTRA_COLLAB_LIVE_ID");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23762w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23763x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23764y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23762w = componentCallbacks;
            this.f23763x = aVar;
            this.f23764y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f23762w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f23763x, this.f23764y);
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
            return LivePrepareActivity.this.getCacheDir() + "/emomo.png";
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23766w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23767x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23768y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23766w = componentCallbacks;
            this.f23767x = aVar;
            this.f23768y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f23766w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f23767x, this.f23768y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends tj.f {
        public f() {
        }

        @Override // tj.f
        public void c(float f10, float f11, float f12, tj.m mVar) {
            jo.p.h(mVar, "shapePath");
            float f13 = f10 - (f10 / 2.0f);
            mVar.m(f13 - de.a.a(LivePrepareActivity.this, 2.0f), 0.0f);
            mVar.m(f13, -de.a.a(LivePrepareActivity.this, 3.0f));
            mVar.m(f13 + de.a.a(LivePrepareActivity.this, 2.0f), 0.0f);
            mVar.m(f10, 0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23770w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23771x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23772y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23770w = componentCallbacks;
            this.f23771x = aVar;
            this.f23772y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f23770w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f23771x, this.f23772y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements yd.s1 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EventNoticeResponse f23773a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LivePrepareActivity f23774b;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f23775a;

            static {
                int[] iArr = new int[nd.c.values().length];
                iArr[nd.c.EVENT.ordinal()] = 1;
                iArr[nd.c.INTERNAL.ordinal()] = 2;
                iArr[nd.c.NONE.ordinal()] = 3;
                f23775a = iArr;
            }
        }

        public g(EventNoticeResponse eventNoticeResponse, LivePrepareActivity livePrepareActivity) {
            this.f23773a = eventNoticeResponse;
            this.f23774b = livePrepareActivity;
        }

        @Override // yd.s1
        public void a(int i10) {
            EventBannerResponse eventBannerResponse = this.f23773a.getBanners().get(i10);
            c.a aVar = nd.c.Companion;
            int i11 = a.f23775a[aVar.a(eventBannerResponse.getType()).ordinal()];
            if (i11 == 1) {
                LivePrepareActivity livePrepareActivity = this.f23774b;
                livePrepareActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(livePrepareActivity, Referer.Broadcast.SETTING, livePrepareActivity.Z3().a(eventBannerResponse.getUrl())));
            } else if (i11 == 2) {
                LivePrepareActivity livePrepareActivity2 = this.f23774b;
                livePrepareActivity2.startActivity(HandleUrlSchemeActivity.f25127b0.a(livePrepareActivity2, Referer.Broadcast.SETTING, livePrepareActivity2.Z3().a(eventBannerResponse.getUrl())));
            }
            MRLogger U3 = this.f23774b.U3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(EventBannerActionType.EVENT_BANNER_CLICK.getRawValue());
            builder.setTargetType(aVar.a(eventBannerResponse.getType()).e().getRawValue());
            builder.setTargetId(eventBannerResponse.getTitle());
            EventBannerWhere eventBannerWhere = EventBannerWhere.LIVE_PREPARATION;
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, eventBannerWhere.getRawValue()), wn.q.a("page_id", eventBannerWhere.getRawValue())));
            U3.sendLog(builder.build());
        }

        @Override // yd.s1
        public void b(int i10) {
            EventBannerResponse eventBannerResponse = this.f23773a.getBanners().get(i10);
            MRLogger U3 = this.f23774b.U3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(EventBannerActionType.EVENT_BANNER_IMP.getRawValue());
            builder.setTargetType(nd.c.Companion.a(eventBannerResponse.getType()).e().getRawValue());
            builder.setTargetId(eventBannerResponse.getTitle());
            EventBannerWhere eventBannerWhere = EventBannerWhere.LIVE_PREPARATION;
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, eventBannerWhere.getRawValue()), wn.q.a("page_id", eventBannerWhere.getRawValue())));
            U3.sendLog(builder.build());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23776w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentActivity componentActivity) {
            super(0);
            this.f23776w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23776w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity$observeStoreValues$3", f = "LivePrepareActivity.kt", l = {320}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23777w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityLoadAvatarModel> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LivePrepareActivity f23779w;

            public a(LivePrepareActivity livePrepareActivity) {
                this.f23779w = livePrepareActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityLoadAvatarModel unityLoadAvatarModel, ao.d<? super wn.v> dVar) {
                ClosetAccessoryAsset companionType;
                UnityManager.Companion companion = UnityManager.Companion;
                companion.getInstance().setCameraDolly(CameraDolly.DEFAULT);
                UnityManager companion2 = companion.getInstance();
                ClosetAvatar N = this.f23779w.Q3().N();
                companion2.setCompanionName((N == null || (companionType = N.getCompanionType()) == null || (r0 = companionType.getName()) == null) ? "" : "");
                companion.getInstance().setMainichi(this.f23779w.a4().s3());
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
            int i10 = this.f23777w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityLoadAvatarModel> loadAvatarModelCompletedFlow = LivePrepareActivity.this.Y3().getLoadAvatarModelCompletedFlow();
                a aVar = new a(LivePrepareActivity.this);
                this.f23777w = 1;
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

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23780w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23781x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23782y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23783z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23780w = aVar;
            this.f23781x = aVar2;
            this.f23782y = aVar3;
            this.f23783z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23780w;
            vq.a aVar2 = this.f23781x;
            io.a aVar3 = this.f23782y;
            xq.a aVar4 = this.f23783z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity$observeStoreValues$4", f = "LivePrepareActivity.kt", l = {328}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23784w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityScreenshot> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LivePrepareActivity f23786w;

            /* renamed from: com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0210a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ UnityScreenshot f23787w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ LivePrepareActivity f23788x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0210a(UnityScreenshot unityScreenshot, LivePrepareActivity livePrepareActivity) {
                    super(0);
                    this.f23787w = unityScreenshot;
                    this.f23788x = livePrepareActivity;
                }

                public final void a() {
                    je.c.f37722g1.a(Referer.Broadcast.SETTING, this.f23787w, this.f23788x.a4().T4(), this.f23788x.a4().t4(), this.f23788x.Q3().B0(), false).z3(this.f23788x.a3(), "EmomoRegistrationDialog");
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
                public final /* synthetic */ LivePrepareActivity f23789w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(LivePrepareActivity livePrepareActivity) {
                    super(2);
                    this.f23789w = livePrepareActivity;
                }

                public final void a(String str, String str2) {
                    jo.p.h(str, "bodyPath");
                    jo.p.h(str2, "facePath");
                    this.f23789w.P3().u(new UpdateClosetImagesRequest(this.f23789w.Q3().y0(), str, str2));
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(String str, String str2) {
                    a(str, str2);
                    return wn.v.f59242a;
                }
            }

            public a(LivePrepareActivity livePrepareActivity) {
                this.f23786w = livePrepareActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityScreenshot unityScreenshot, ao.d<? super wn.v> dVar) {
                if (jo.p.c(unityScreenshot.getKey(), "emomo_live_prepare")) {
                    this.f23786w.f23747f0.c(new C0210a(unityScreenshot, this.f23786w));
                    File f10 = this.f23786w.W3().f().f();
                    if (f10 != null) {
                        LivePrepareActivity livePrepareActivity = this.f23786w;
                        Context applicationContext = livePrepareActivity.getApplicationContext();
                        jo.p.g(applicationContext, "applicationContext");
                        b bVar = new b(livePrepareActivity);
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

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23784w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityScreenshot> screenshotCompletedFlow = LivePrepareActivity.this.Y3().getScreenshotCompletedFlow();
                a aVar = new a(LivePrepareActivity.this);
                this.f23784w = 1;
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
    public static final class i0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23790w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ComponentActivity componentActivity) {
            super(0);
            this.f23790w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f23790w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23791w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f23791w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23791w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23792w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ComponentActivity componentActivity) {
            super(0);
            this.f23792w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23792w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23793w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23794x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23795y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23796z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23793w = aVar;
            this.f23794x = aVar2;
            this.f23795y = aVar3;
            this.f23796z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23793w;
            vq.a aVar2 = this.f23794x;
            io.a aVar3 = this.f23795y;
            xq.a aVar4 = this.f23796z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(jc.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23797w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23798x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23799y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23800z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23797w = aVar;
            this.f23798x = aVar2;
            this.f23799y = aVar3;
            this.f23800z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23797w;
            vq.a aVar2 = this.f23798x;
            io.a aVar3 = this.f23799y;
            xq.a aVar4 = this.f23800z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23801w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f23801w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f23801w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23802w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ComponentActivity componentActivity) {
            super(0);
            this.f23802w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f23802w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23803w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f23803w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23803w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23804w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23805x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23806y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23807z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23804w = aVar;
            this.f23805x = aVar2;
            this.f23806y = aVar3;
            this.f23807z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23804w;
            vq.a aVar2 = this.f23805x;
            io.a aVar3 = this.f23806y;
            xq.a aVar4 = this.f23807z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(jc.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23808w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f23808w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f23808w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<uq.a> {
        public p() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(LivePrepareActivity.this.O3(), LivePrepareActivity.this.R3());
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.l<View, wn.v> {
        public q() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            LiveMainSettingsBottomSheetDialogFragment.f23827e1.a().z3(LivePrepareActivity.this.a3(), "LiveMainSettingsBottomSheetDialogFragment");
            MRLogger U3 = LivePrepareActivity.this.U3();
            MRLog.Companion companion = MRLog.Companion;
            U3.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_PREPARATION_BUTTON_TAP).build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.l<View, wn.v> {
        public r() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            LivePrepareActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.l<View, wn.v> {
        public s() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            jc.j jVar = LivePrepareActivity.this.Q;
            ac.c cVar = null;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            if (jVar.H()) {
                ac.c cVar2 = LivePrepareActivity.this.f23746e0;
                if (cVar2 == null) {
                    jo.p.v("binding");
                } else {
                    cVar = cVar2;
                }
                ConstraintLayout constraintLayout = cVar.S;
                jo.p.g(constraintLayout, "binding.operationContainer");
                constraintLayout.setVisibility(8);
                LivePrepareActivity.this.h4();
                MRLogger U3 = LivePrepareActivity.this.U3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_SELECT_POSE_OPEN);
                builder.setTargetType(Referer.BROADCAST);
                builder.setTargetId("pose");
                U3.sendLog(builder.build());
                return;
            }
            LivePrepareActivity livePrepareActivity = LivePrepareActivity.this;
            livePrepareActivity.startActivity(livePrepareActivity.T3().K(LivePrepareActivity.this, false, false, true));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.l<View, wn.v> {
        public t() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            UnityManager.Companion.getInstance().unloadAvatarModel(0);
            jc.j jVar = LivePrepareActivity.this.Q;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            if (jVar.H()) {
                LivePrepareActivity livePrepareActivity = LivePrepareActivity.this;
                livePrepareActivity.startActivity(livePrepareActivity.T3().Z(LivePrepareActivity.this, 0, false, true));
                return;
            }
            LivePrepareActivity livePrepareActivity2 = LivePrepareActivity.this;
            livePrepareActivity2.startActivity(livePrepareActivity2.T3().K(LivePrepareActivity.this, false, false, true));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.l<View, wn.v> {
        public u() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            LivePrepareActivity livePrepareActivity = LivePrepareActivity.this;
            livePrepareActivity.startActivity(WebViewActivity.a.b(WebViewActivity.X, livePrepareActivity, MRUrl.ContinuousLive.INSTANCE.getUrl(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity$restartAutoSwitchBannerTimer$1", f = "LivePrepareActivity.kt", l = {384}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23815w;

        /* renamed from: x  reason: collision with root package name */
        public int f23816x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23817y;

        /* renamed from: z  reason: collision with root package name */
        public int f23818z;

        public v(ao.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:13:0x0041). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r7.f23818z
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r7.f23816x
                int r3 = r7.f23815w
                java.lang.Object r4 = r7.f23817y
                com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity r4 = (com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity) r4
                wn.m.b(r8)
                r8 = r7
                goto L41
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                wn.m.b(r8)
                r8 = 2147483647(0x7fffffff, float:NaN)
                com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity r1 = com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity.this
                r3 = 0
                r4 = r1
                r1 = r3
                r3 = r8
                r8 = r7
            L2d:
                if (r1 >= r3) goto L54
                r5 = 60000(0xea60, double:2.9644E-319)
                r8.f23817y = r4
                r8.f23815w = r3
                r8.f23816x = r1
                r8.f23818z = r2
                java.lang.Object r5 = uo.b1.a(r5, r8)
                if (r5 != r0) goto L41
                return r0
            L41:
                ac.c r5 = com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity.A3(r4)
                if (r5 != 0) goto L4d
                java.lang.String r5 = "binding"
                jo.p.v(r5)
                r5 = 0
            L4d:
                com.dena.mirrorman.customview.SwitchableEventBannerIconView r5 = r5.Y
                r5.e()
                int r1 = r1 + r2
                goto L2d
            L54:
                wn.v r8 = wn.v.f59242a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.liveprepare.LivePrepareActivity.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class w implements sf.i {
        public w() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ac.c cVar = LivePrepareActivity.this.f23746e0;
            ac.c cVar2 = null;
            if (cVar == null) {
                jo.p.v("binding");
                cVar = null;
            }
            cVar.F.s();
            ac.c cVar3 = LivePrepareActivity.this.f23746e0;
            if (cVar3 == null) {
                jo.p.v("binding");
                cVar3 = null;
            }
            cVar3.F.y(50, 260);
            ac.c cVar4 = LivePrepareActivity.this.f23746e0;
            if (cVar4 == null) {
                jo.p.v("binding");
                cVar4 = null;
            }
            cVar4.F.setRepeatCount(Integer.MAX_VALUE);
            ac.c cVar5 = LivePrepareActivity.this.f23746e0;
            if (cVar5 == null) {
                jo.p.v("binding");
            } else {
                cVar2 = cVar5;
            }
            cVar2.F.r();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<wn.v> {
        public x() {
            super(0);
        }

        public final void a() {
            r1.a.b(r1.R0, null, 1, null).z3(LivePrepareActivity.this.a3(), "EmomoShutterEffectDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23821w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23822x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23823y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23821w = componentCallbacks;
            this.f23822x = aVar;
            this.f23823y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f23821w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f23822x, this.f23823y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23824w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23825x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23826y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23824w = componentCallbacks;
            this.f23825x = aVar;
            this.f23826y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f23824w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f23825x, this.f23826y);
        }
    }

    public LivePrepareActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new y(this, null, null));
        this.S = wn.g.b(iVar, new z(this, null, null));
        this.T = wn.g.b(iVar, new a0(this, null, null));
        this.U = wn.g.b(iVar, new b0(this, null, null));
        this.V = wn.g.b(iVar, new c0(this, null, null));
        this.W = new s0(jo.f0.b(nf.f.class), new i0(this), new h0(new g0(this), null, null, gq.a.a(this)));
        this.X = wn.g.b(iVar, new d0(this, null, null));
        this.Y = wn.g.b(iVar, new e0(this, null, null));
        this.Z = wn.g.b(iVar, new f0(this, null, null));
        this.f23742a0 = wn.g.a(new c());
        this.f23743b0 = wn.g.a(new d());
        this.f23744c0 = wn.g.a(new e());
        this.f23745d0 = b3.b(null, 1, null);
        this.f23747f0 = new FragmentRunner(this);
        this.f23748g0 = new s0(jo.f0.b(je.e.class), new l0(this), new k0(new j0(this), null, null, gq.a.a(this)));
    }

    public static final void c4(LivePrepareActivity livePrepareActivity, EventNoticeResponse eventNoticeResponse) {
        jo.p.h(livePrepareActivity, "this$0");
        if (eventNoticeResponse == null) {
            return;
        }
        ac.c cVar = null;
        if (eventNoticeResponse.getBanners().isEmpty()) {
            ac.c cVar2 = livePrepareActivity.f23746e0;
            if (cVar2 == null) {
                jo.p.v("binding");
                cVar2 = null;
            }
            cVar2.Y.setVisibility(8);
            ac.c cVar3 = livePrepareActivity.f23746e0;
            if (cVar3 == null) {
                jo.p.v("binding");
            } else {
                cVar = cVar3;
            }
            cVar.P.setVisibility(8);
            return;
        }
        ac.c cVar4 = livePrepareActivity.f23746e0;
        if (cVar4 == null) {
            jo.p.v("binding");
            cVar4 = null;
        }
        cVar4.Y.setVisibility(0);
        ac.c cVar5 = livePrepareActivity.f23746e0;
        if (cVar5 == null) {
            jo.p.v("binding");
            cVar5 = null;
        }
        cVar5.O.setCardBackgroundColor(-1);
        ac.c cVar6 = livePrepareActivity.f23746e0;
        if (cVar6 == null) {
            jo.p.v("binding");
            cVar6 = null;
        }
        cVar6.O.setCardElevation(de.a.a(livePrepareActivity, 8.0f));
        ac.c cVar7 = livePrepareActivity.f23746e0;
        if (cVar7 == null) {
            jo.p.v("binding");
            cVar7 = null;
        }
        cVar7.O.setShapeAppearanceModel(tj.k.a().p(new tj.a(de.a.a(livePrepareActivity, 6.0f))).A(new f()).m());
        livePrepareActivity.e4();
        livePrepareActivity.g4();
        ac.c cVar8 = livePrepareActivity.f23746e0;
        if (cVar8 == null) {
            jo.p.v("binding");
            cVar8 = null;
        }
        SwitchableEventBannerIconView switchableEventBannerIconView = cVar8.Y;
        List<EventBannerResponse> banners = eventNoticeResponse.getBanners();
        ArrayList arrayList = new ArrayList(xn.t.u(banners, 10));
        for (EventBannerResponse eventBannerResponse : banners) {
            arrayList.add(wn.q.a(eventBannerResponse.getIconUrl(), Boolean.FALSE));
        }
        switchableEventBannerIconView.setEventBannerImageUrls(arrayList);
        ac.c cVar9 = livePrepareActivity.f23746e0;
        if (cVar9 == null) {
            jo.p.v("binding");
        } else {
            cVar = cVar9;
        }
        cVar.Y.setOnSingleTapUpListener(new g(eventNoticeResponse, livePrepareActivity));
    }

    public static final void d4(LivePrepareActivity livePrepareActivity, Boolean bool) {
        jo.p.h(livePrepareActivity, "this$0");
        ac.c cVar = livePrepareActivity.f23746e0;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        ProgressBar progressBar = cVar.U;
        jo.p.g(progressBar, "binding.progressBar");
        jo.p.g(bool, "it");
        progressBar.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // lc.c0
    public void A0() {
        finish();
    }

    @Override // je.a
    public void E0(float f10) {
        UnityManager.Companion.getInstance().setCameraDolly(f10);
    }

    @Override // be.s1
    public void G0(String str) {
        jo.p.h(str, "key");
        N3("EmomoShutterEffectDialog");
        j4();
    }

    @Override // be.i1
    public void J2() {
        N3("EmomoPoseDialog");
        ac.c cVar = null;
        UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        ac.c cVar2 = this.f23746e0;
        if (cVar2 == null) {
            jo.p.v("binding");
        } else {
            cVar = cVar2;
        }
        ConstraintLayout constraintLayout = cVar.S;
        jo.p.g(constraintLayout, "binding.operationContainer");
        constraintLayout.setVisibility(0);
    }

    public final void N3(String str) {
        Fragment e02 = a3().e0(str);
        if (e02 != null) {
            a3().k().q(e02).j();
        }
    }

    public final String O3() {
        return (String) this.f23742a0.getValue();
    }

    @Override // je.d
    public void P1() {
        N3("EmomoRegistrationDialog");
        ac.c cVar = this.f23746e0;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        ConstraintLayout constraintLayout = cVar.S;
        jo.p.g(constraintLayout, "binding.operationContainer");
        constraintLayout.setVisibility(0);
        ClosetAvatar R = Q3().R();
        if (R != null) {
            P3().o(jf.c.f37906y.a(R));
        }
        setResult(-1);
    }

    public final od.e P3() {
        return (od.e) this.T.getValue();
    }

    public final nf.f Q3() {
        return (nf.f) this.W.getValue();
    }

    public final String R3() {
        return (String) this.f23743b0.getValue();
    }

    public final String S3() {
        return (String) this.f23744c0.getValue();
    }

    public final tb.c T3() {
        return (tb.c) this.R.getValue();
    }

    @Override // be.i1
    public void U0(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        jo.p.h(closetAvatarSimpleValue, "pose");
        Puree.d(new Avatar.AvatarSelectPose(closetAvatarSimpleValue.getId()));
        UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), closetAvatarSimpleValue.getValue(), 0, 2, null);
    }

    public final MRLogger U3() {
        return (MRLogger) this.Y.getValue();
    }

    public final nd.i1 V3() {
        return (nd.i1) this.Z.getValue();
    }

    public final je.e W3() {
        return (je.e) this.f23748g0.getValue();
    }

    public final UnityActionCreator X3() {
        return (UnityActionCreator) this.U.getValue();
    }

    @Override // be.i1
    public void Y1() {
        N3("EmomoPoseDialog");
        i4();
    }

    public final UnityStore Y3() {
        return (UnityStore) this.V.getValue();
    }

    public final of.k Z3() {
        return (of.k) this.S.getValue();
    }

    public final kf.x a4() {
        return (kf.x) this.X.getValue();
    }

    public final void b4() {
        jc.j jVar = this.Q;
        if (jVar == null) {
            jo.p.v("store");
            jVar = null;
        }
        jVar.F().i(this, new androidx.lifecycle.f0() { // from class: jc.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePrepareActivity.c4(LivePrepareActivity.this, (EventNoticeResponse) obj);
            }
        });
        jc.j jVar2 = this.Q;
        if (jVar2 == null) {
            jo.p.v("store");
            jVar2 = null;
        }
        jVar2.b0().i(this, new androidx.lifecycle.f0() { // from class: jc.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePrepareActivity.d4(LivePrepareActivity.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
    }

    public final void e4() {
        d2 d10;
        d2.a.a(this.f23745d0, null, 1, null);
        d10 = uo.l.d(r0.a(g1.c()), null, null, new v(null), 3, null);
        this.f23745d0 = d10;
    }

    public final void f4() {
        ac.c cVar;
        ac.c cVar2;
        ac.c cVar3;
        ac.c cVar4;
        ac.c cVar5;
        ac.c cVar6;
        ac.c cVar7;
        ac.c cVar8;
        ac.c cVar9;
        ac.c cVar10;
        ac.c cVar11;
        ac.c cVar12;
        ac.c cVar13;
        ac.c cVar14;
        jc.j jVar;
        ac.c cVar15;
        jc.j jVar2 = this.Q;
        if (jVar2 == null) {
            jo.p.v("store");
            jVar2 = null;
        }
        Anniversary u10 = jVar2.u();
        if ((u10 != null ? u10.getType() : null) == null) {
            ac.c cVar16 = this.f23746e0;
            if (cVar16 == null) {
                jo.p.v("binding");
                cVar16 = null;
            }
            cVar16.J.setAlpha(0.5f);
            ac.c cVar17 = this.f23746e0;
            if (cVar17 == null) {
                jo.p.v("binding");
                cVar17 = null;
            }
            cVar17.J.setVisibility(0);
            ac.c cVar18 = this.f23746e0;
            if (cVar18 == null) {
                jo.p.v("binding");
                cVar18 = null;
            }
            cVar18.B.setVisibility(8);
            ac.c cVar19 = this.f23746e0;
            if (cVar19 == null) {
                jo.p.v("binding");
                cVar19 = null;
            }
            cVar19.E.setVisibility(8);
            ac.c cVar20 = this.f23746e0;
            if (cVar20 == null) {
                jo.p.v("binding");
                cVar20 = null;
            }
            cVar20.F.setFrame(165);
            ac.c cVar21 = this.f23746e0;
            if (cVar21 == null) {
                jo.p.v("binding");
                cVar21 = null;
            }
            cVar21.G.setText(getString(xb.r.text_every_notifications_title));
            ac.c cVar22 = this.f23746e0;
            if (cVar22 == null) {
                jo.p.v("binding");
                cVar22 = null;
            }
            OutlineTextView outlineTextView = cVar22.H;
            int i10 = xb.r.text_continuous_stream_days;
            Object[] objArr = new Object[1];
            jc.j jVar3 = this.Q;
            if (jVar3 == null) {
                jo.p.v("store");
                jVar3 = null;
            }
            objArr[0] = String.valueOf(jVar3.x());
            outlineTextView.setText(getString(i10, objArr));
            jc.j jVar4 = this.Q;
            if (jVar4 == null) {
                jo.p.v("store");
                jVar4 = null;
            }
            int x10 = jVar4.x();
            if (x10 == 0) {
                ac.c cVar23 = this.f23746e0;
                if (cVar23 == null) {
                    jo.p.v("binding");
                    cVar23 = null;
                }
                cVar23.D.setVisibility(8);
                ac.c cVar24 = this.f23746e0;
                if (cVar24 == null) {
                    jo.p.v("binding");
                    cVar15 = null;
                } else {
                    cVar15 = cVar24;
                }
                cVar15.V.setVisibility(0);
                return;
            }
            if (1 <= x10 && x10 < 7) {
                ac.c cVar25 = this.f23746e0;
                if (cVar25 == null) {
                    jo.p.v("binding");
                    cVar25 = null;
                }
                cVar25.W.setVisibility(0);
                ac.c cVar26 = this.f23746e0;
                if (cVar26 == null) {
                    jo.p.v("binding");
                    cVar26 = null;
                }
                AppCompatTextView appCompatTextView = cVar26.X;
                int i11 = xb.r.text_continuous_streamer_in_progress1;
                Object[] objArr2 = new Object[1];
                jc.j jVar5 = this.Q;
                if (jVar5 == null) {
                    jo.p.v("store");
                    jVar = null;
                } else {
                    jVar = jVar5;
                }
                objArr2[0] = String.valueOf(7 - jVar.x());
                appCompatTextView.setText(getString(i11, objArr2));
                return;
            }
            if (7 <= x10 && x10 < 30) {
                ac.c cVar27 = this.f23746e0;
                if (cVar27 == null) {
                    jo.p.v("binding");
                    cVar27 = null;
                }
                cVar27.F.setAnimation("live_start_mainichi/live_start_mainichi.json");
                ac.c cVar28 = this.f23746e0;
                if (cVar28 == null) {
                    jo.p.v("binding");
                    cVar14 = null;
                } else {
                    cVar14 = cVar28;
                }
                cVar14.F.setImageAssetsFolder("live_start_mainichi/images");
                return;
            }
            if (30 <= x10 && x10 < 100) {
                ac.c cVar29 = this.f23746e0;
                if (cVar29 == null) {
                    jo.p.v("binding");
                    cVar29 = null;
                }
                cVar29.F.setAnimation("live_start_meimainichi/live_start_meimainichi.json");
                ac.c cVar30 = this.f23746e0;
                if (cVar30 == null) {
                    jo.p.v("binding");
                    cVar13 = null;
                } else {
                    cVar13 = cVar30;
                }
                cVar13.F.setImageAssetsFolder("live_start_meimainichi/images");
                return;
            }
            if (100 <= x10 && x10 < 365) {
                ac.c cVar31 = this.f23746e0;
                if (cVar31 == null) {
                    jo.p.v("binding");
                    cVar31 = null;
                }
                cVar31.F.setAnimation("live_start_choumainichi/live_start_choumainichi.json");
                ac.c cVar32 = this.f23746e0;
                if (cVar32 == null) {
                    jo.p.v("binding");
                    cVar12 = null;
                } else {
                    cVar12 = cVar32;
                }
                cVar12.F.setImageAssetsFolder("live_start_choumainichi/images");
                return;
            }
            ac.c cVar33 = this.f23746e0;
            if (cVar33 == null) {
                jo.p.v("binding");
                cVar33 = null;
            }
            cVar33.F.setAnimation("live_start_kiwamimainichi/live_start_kiwamimainichi.json");
            ac.c cVar34 = this.f23746e0;
            if (cVar34 == null) {
                jo.p.v("binding");
                cVar11 = null;
            } else {
                cVar11 = cVar34;
            }
            cVar11.F.setImageAssetsFolder("live_start_kiwamimainichi/images");
            return;
        }
        ac.c cVar35 = this.f23746e0;
        if (cVar35 == null) {
            jo.p.v("binding");
            cVar35 = null;
        }
        cVar35.J.setVisibility(8);
        ac.c cVar36 = this.f23746e0;
        if (cVar36 == null) {
            jo.p.v("binding");
            cVar36 = null;
        }
        cVar36.B.setVisibility(0);
        ac.c cVar37 = this.f23746e0;
        if (cVar37 == null) {
            jo.p.v("binding");
            cVar37 = null;
        }
        cVar37.F.y(1, 49);
        ac.c cVar38 = this.f23746e0;
        if (cVar38 == null) {
            jo.p.v("binding");
            cVar38 = null;
        }
        cVar38.F.r();
        ac.c cVar39 = this.f23746e0;
        if (cVar39 == null) {
            jo.p.v("binding");
            cVar39 = null;
        }
        cVar39.F.e(new w());
        AnniversaryType type = u10.getType();
        switch (type == null ? -1 : b.f23752a[type.ordinal()]) {
            case 1:
                ac.c cVar40 = this.f23746e0;
                if (cVar40 == null) {
                    jo.p.v("binding");
                    cVar40 = null;
                }
                cVar40.G.setText(getString(xb.r.text_anniversary_birthday_message));
                ac.c cVar41 = this.f23746e0;
                if (cVar41 == null) {
                    jo.p.v("binding");
                    cVar41 = null;
                }
                cVar41.H.setText(getString(xb.r.text_birthday_popup_message_on_main));
                ac.c cVar42 = this.f23746e0;
                if (cVar42 == null) {
                    jo.p.v("binding");
                    cVar42 = null;
                }
                cVar42.E.setText(getString(xb.r.text_anniversary_enabled_birthday_item));
                ac.c cVar43 = this.f23746e0;
                if (cVar43 == null) {
                    jo.p.v("binding");
                    cVar43 = null;
                }
                cVar43.B.setImageResource(xb.n.bg_birthday);
                ac.c cVar44 = this.f23746e0;
                if (cVar44 == null) {
                    jo.p.v("binding");
                    cVar44 = null;
                }
                cVar44.F.setAnimation("live_start_birthday/live_start_birthday.json");
                ac.c cVar45 = this.f23746e0;
                if (cVar45 == null) {
                    jo.p.v("binding");
                    cVar = null;
                } else {
                    cVar = cVar45;
                }
                cVar.F.setImageAssetsFolder("live_start_birthday/images");
                return;
            case 2:
                ac.c cVar46 = this.f23746e0;
                if (cVar46 == null) {
                    jo.p.v("binding");
                    cVar46 = null;
                }
                cVar46.G.setText(getString(xb.r.Q0));
                ac.c cVar47 = this.f23746e0;
                if (cVar47 == null) {
                    jo.p.v("binding");
                    cVar47 = null;
                }
                cVar47.H.setText(getString(xb.r.text_anniversary_exceed_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.f60068a2)}));
                ac.c cVar48 = this.f23746e0;
                if (cVar48 == null) {
                    jo.p.v("binding");
                    cVar48 = null;
                }
                cVar48.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar49 = this.f23746e0;
                if (cVar49 == null) {
                    jo.p.v("binding");
                    cVar49 = null;
                }
                cVar49.B.setImageResource(xb.n.bg_follow_anniversary);
                ac.c cVar50 = this.f23746e0;
                if (cVar50 == null) {
                    jo.p.v("binding");
                    cVar50 = null;
                }
                cVar50.F.setAnimation("live_start_follower/live_start_follower.json");
                ac.c cVar51 = this.f23746e0;
                if (cVar51 == null) {
                    jo.p.v("binding");
                    cVar2 = null;
                } else {
                    cVar2 = cVar51;
                }
                cVar2.F.setImageAssetsFolder("live_start_follower/images");
                return;
            case 3:
                ac.c cVar52 = this.f23746e0;
                if (cVar52 == null) {
                    jo.p.v("binding");
                    cVar52 = null;
                }
                cVar52.G.setText(getString(xb.r.text_continuous_stream));
                ac.c cVar53 = this.f23746e0;
                if (cVar53 == null) {
                    jo.p.v("binding");
                    cVar53 = null;
                }
                cVar53.H.setText(getString(xb.r.text_anniversary_achieve_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.text_time_unit_day)}));
                ac.c cVar54 = this.f23746e0;
                if (cVar54 == null) {
                    jo.p.v("binding");
                    cVar54 = null;
                }
                cVar54.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar55 = this.f23746e0;
                if (cVar55 == null) {
                    jo.p.v("binding");
                    cVar55 = null;
                }
                cVar55.B.setImageResource(xb.n.bg_stream_anniversary);
                ac.c cVar56 = this.f23746e0;
                if (cVar56 == null) {
                    jo.p.v("binding");
                    cVar56 = null;
                }
                cVar56.F.setAnimation("live_start_mainichi/live_start_mainichi.json");
                ac.c cVar57 = this.f23746e0;
                if (cVar57 == null) {
                    jo.p.v("binding");
                    cVar3 = null;
                } else {
                    cVar3 = cVar57;
                }
                cVar3.F.setImageAssetsFolder("live_start_mainichi/images");
                return;
            case 4:
                ac.c cVar58 = this.f23746e0;
                if (cVar58 == null) {
                    jo.p.v("binding");
                    cVar58 = null;
                }
                cVar58.G.setText(getString(xb.r.text_continuous_stream));
                ac.c cVar59 = this.f23746e0;
                if (cVar59 == null) {
                    jo.p.v("binding");
                    cVar59 = null;
                }
                cVar59.H.setText(getString(xb.r.text_anniversary_achieve_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.text_time_unit_day)}));
                ac.c cVar60 = this.f23746e0;
                if (cVar60 == null) {
                    jo.p.v("binding");
                    cVar60 = null;
                }
                cVar60.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar61 = this.f23746e0;
                if (cVar61 == null) {
                    jo.p.v("binding");
                    cVar61 = null;
                }
                cVar61.B.setImageResource(xb.n.bg_stream_anniversary);
                ac.c cVar62 = this.f23746e0;
                if (cVar62 == null) {
                    jo.p.v("binding");
                    cVar62 = null;
                }
                cVar62.F.setAnimation("live_start_meimainichi/live_start_meimainichi.json");
                ac.c cVar63 = this.f23746e0;
                if (cVar63 == null) {
                    jo.p.v("binding");
                    cVar4 = null;
                } else {
                    cVar4 = cVar63;
                }
                cVar4.F.setImageAssetsFolder("live_start_meimainichi/images");
                return;
            case 5:
                ac.c cVar64 = this.f23746e0;
                if (cVar64 == null) {
                    jo.p.v("binding");
                    cVar64 = null;
                }
                cVar64.G.setText(getString(xb.r.text_continuous_stream));
                ac.c cVar65 = this.f23746e0;
                if (cVar65 == null) {
                    jo.p.v("binding");
                    cVar65 = null;
                }
                cVar65.H.setText(getString(xb.r.text_anniversary_achieve_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.text_time_unit_day)}));
                ac.c cVar66 = this.f23746e0;
                if (cVar66 == null) {
                    jo.p.v("binding");
                    cVar66 = null;
                }
                cVar66.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar67 = this.f23746e0;
                if (cVar67 == null) {
                    jo.p.v("binding");
                    cVar67 = null;
                }
                cVar67.B.setImageResource(xb.n.bg_stream_anniversary);
                ac.c cVar68 = this.f23746e0;
                if (cVar68 == null) {
                    jo.p.v("binding");
                    cVar68 = null;
                }
                cVar68.F.setAnimation("live_start_choumainichi/live_start_choumainichi.json");
                ac.c cVar69 = this.f23746e0;
                if (cVar69 == null) {
                    jo.p.v("binding");
                    cVar5 = null;
                } else {
                    cVar5 = cVar69;
                }
                cVar5.F.setImageAssetsFolder("live_start_choumainichi/images");
                return;
            case 6:
                ac.c cVar70 = this.f23746e0;
                if (cVar70 == null) {
                    jo.p.v("binding");
                    cVar70 = null;
                }
                cVar70.G.setText(getString(xb.r.text_continuous_stream));
                ac.c cVar71 = this.f23746e0;
                if (cVar71 == null) {
                    jo.p.v("binding");
                    cVar71 = null;
                }
                cVar71.H.setText(getString(xb.r.text_anniversary_achieve_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.text_time_unit_day)}));
                ac.c cVar72 = this.f23746e0;
                if (cVar72 == null) {
                    jo.p.v("binding");
                    cVar72 = null;
                }
                cVar72.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar73 = this.f23746e0;
                if (cVar73 == null) {
                    jo.p.v("binding");
                    cVar73 = null;
                }
                cVar73.B.setImageResource(xb.n.bg_stream_anniversary);
                ac.c cVar74 = this.f23746e0;
                if (cVar74 == null) {
                    jo.p.v("binding");
                    cVar74 = null;
                }
                cVar74.F.setAnimation("live_start_kiwamimainichi/live_start_kiwamimainichi.json");
                ac.c cVar75 = this.f23746e0;
                if (cVar75 == null) {
                    jo.p.v("binding");
                    cVar6 = null;
                } else {
                    cVar6 = cVar75;
                }
                cVar6.F.setImageAssetsFolder("live_start_kiwamimainichi/images");
                return;
            case 7:
                ac.c cVar76 = this.f23746e0;
                if (cVar76 == null) {
                    jo.p.v("binding");
                    cVar76 = null;
                }
                cVar76.G.setText(getString(xb.r.text_continuous_stream));
                ac.c cVar77 = this.f23746e0;
                if (cVar77 == null) {
                    jo.p.v("binding");
                    cVar77 = null;
                }
                cVar77.H.setText(getString(xb.r.text_anniversary_achieve_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.text_time_unit_month)}));
                ac.c cVar78 = this.f23746e0;
                if (cVar78 == null) {
                    jo.p.v("binding");
                    cVar78 = null;
                }
                cVar78.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar79 = this.f23746e0;
                if (cVar79 == null) {
                    jo.p.v("binding");
                    cVar79 = null;
                }
                cVar79.B.setImageResource(xb.n.bg_stream_anniversary);
                ac.c cVar80 = this.f23746e0;
                if (cVar80 == null) {
                    jo.p.v("binding");
                    cVar80 = null;
                }
                cVar80.F.setAnimation("live_start_meimainichi/live_start_meimainichi.json");
                ac.c cVar81 = this.f23746e0;
                if (cVar81 == null) {
                    jo.p.v("binding");
                    cVar7 = null;
                } else {
                    cVar7 = cVar81;
                }
                cVar7.F.setImageAssetsFolder("live_start_meimainichi/images");
                return;
            case 8:
                ac.c cVar82 = this.f23746e0;
                if (cVar82 == null) {
                    jo.p.v("binding");
                    cVar82 = null;
                }
                cVar82.G.setText(getString(xb.r.text_continuous_stream));
                ac.c cVar83 = this.f23746e0;
                if (cVar83 == null) {
                    jo.p.v("binding");
                    cVar83 = null;
                }
                cVar83.H.setText(getString(xb.r.text_anniversary_achieve_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.text_time_unit_month)}));
                ac.c cVar84 = this.f23746e0;
                if (cVar84 == null) {
                    jo.p.v("binding");
                    cVar84 = null;
                }
                cVar84.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar85 = this.f23746e0;
                if (cVar85 == null) {
                    jo.p.v("binding");
                    cVar85 = null;
                }
                cVar85.B.setImageResource(xb.n.bg_stream_anniversary);
                ac.c cVar86 = this.f23746e0;
                if (cVar86 == null) {
                    jo.p.v("binding");
                    cVar86 = null;
                }
                cVar86.F.setAnimation("live_start_choumainichi/live_start_choumainichi.json");
                ac.c cVar87 = this.f23746e0;
                if (cVar87 == null) {
                    jo.p.v("binding");
                    cVar8 = null;
                } else {
                    cVar8 = cVar87;
                }
                cVar8.F.setImageAssetsFolder("live_start_choumainichi/images");
                return;
            case 9:
                ac.c cVar88 = this.f23746e0;
                if (cVar88 == null) {
                    jo.p.v("binding");
                    cVar88 = null;
                }
                cVar88.G.setText(getString(xb.r.text_continuous_stream));
                ac.c cVar89 = this.f23746e0;
                if (cVar89 == null) {
                    jo.p.v("binding");
                    cVar89 = null;
                }
                cVar89.H.setText(getString(xb.r.text_anniversary_achieve_2, new Object[]{String.valueOf(u10.getCount()), getString(xb.r.text_time_unit_month)}));
                ac.c cVar90 = this.f23746e0;
                if (cVar90 == null) {
                    jo.p.v("binding");
                    cVar90 = null;
                }
                cVar90.E.setText(getString(xb.r.text_anniversary_enabled_use_emomo_item));
                ac.c cVar91 = this.f23746e0;
                if (cVar91 == null) {
                    jo.p.v("binding");
                    cVar91 = null;
                }
                cVar91.B.setImageResource(xb.n.bg_stream_anniversary);
                ac.c cVar92 = this.f23746e0;
                if (cVar92 == null) {
                    jo.p.v("binding");
                    cVar92 = null;
                }
                cVar92.F.setAnimation("live_start_kiwamimainichi/live_start_kiwamimainichi.json");
                ac.c cVar93 = this.f23746e0;
                if (cVar93 == null) {
                    jo.p.v("binding");
                    cVar9 = null;
                } else {
                    cVar9 = cVar93;
                }
                cVar9.F.setImageAssetsFolder("live_start_kiwamimainichi/images");
                return;
            case 10:
                ac.c cVar94 = this.f23746e0;
                if (cVar94 == null) {
                    jo.p.v("binding");
                    cVar10 = null;
                } else {
                    cVar10 = cVar94;
                }
                cVar10.I.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public final void g4() {
        ac.c cVar = this.f23746e0;
        ac.c cVar2 = null;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        cVar.P.clearAnimation();
        ac.c cVar3 = this.f23746e0;
        if (cVar3 == null) {
            jo.p.v("binding");
            cVar3 = null;
        }
        cVar3.P.setVisibility(0);
        ac.c cVar4 = this.f23746e0;
        if (cVar4 == null) {
            jo.p.v("binding");
        } else {
            cVar2 = cVar4;
        }
        FrameLayout frameLayout = cVar2.P;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(300L);
        frameLayout.startAnimation(alphaAnimation);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void h4() {
        be.g1.U0.a(true, false).z3(a3(), "EmomoPoseDialog");
    }

    public final void i4() {
        this.f23747f0.c(new x());
    }

    public final void j4() {
        ClosetAvatar R = Q3().R();
        if (R != null) {
            P3().s(Q3().y0(), R);
        }
        Puree.d(new Avatar.AvatarTakePicture(""));
        X3().captureScreenshot(UnityScreenShotAvatarPosition.CENTER, S3(), UnityReceiverKt.EMOMO_PHOTO_SIZE, UnityReceiverKt.EMOMO_PHOTO_SIZE, "emomo_live_prepare");
    }

    @Override // je.d
    public void l() {
        N3("EmomoRegistrationDialog");
        h4();
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
        jc.f fVar = null;
        this.P = (jc.f) ((androidx.lifecycle.q0) new s0(jo.f0.b(jc.f.class), new l(this), new k(new j(this), null, null, gq.a.a(this))).getValue());
        this.Q = (jc.j) ((androidx.lifecycle.q0) new s0(jo.f0.b(jc.j.class), new o(this), new n(new m(this), null, new p(), gq.a.a(this))).getValue());
        ViewDataBinding g10 = androidx.databinding.f.g(this, xb.p.activity_live_prepare);
        jo.p.g(g10, "setContentView(this, R.l…ut.activity_live_prepare)");
        this.f23746e0 = (ac.c) g10;
        a3().k().s(xb.o.M, gf.w.B0.a(), "EmomoStreamViewFragment").i();
        ac.c cVar = this.f23746e0;
        if (cVar == null) {
            jo.p.v("binding");
            cVar = null;
        }
        AppCompatTextView appCompatTextView = cVar.T;
        jo.p.g(appCompatTextView, "binding.prepareImageView");
        yd.g1.a(appCompatTextView, new q());
        ac.c cVar2 = this.f23746e0;
        if (cVar2 == null) {
            jo.p.v("binding");
            cVar2 = null;
        }
        AppCompatImageView appCompatImageView = cVar2.K;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new r());
        ac.c cVar3 = this.f23746e0;
        if (cVar3 == null) {
            jo.p.v("binding");
            cVar3 = null;
        }
        AppCompatButton appCompatButton = cVar3.N;
        jo.p.g(appCompatButton, "binding.emomoPhotoButton");
        yd.g1.a(appCompatButton, new s());
        ac.c cVar4 = this.f23746e0;
        if (cVar4 == null) {
            jo.p.v("binding");
            cVar4 = null;
        }
        AppCompatImageView appCompatImageView2 = cVar4.L;
        jo.p.g(appCompatImageView2, "binding.closetImageView");
        yd.g1.a(appCompatImageView2, new t());
        ac.c cVar5 = this.f23746e0;
        if (cVar5 == null) {
            jo.p.v("binding");
            cVar5 = null;
        }
        AppCompatImageView appCompatImageView3 = cVar5.R;
        jo.p.g(appCompatImageView3, "binding.helpImageView");
        yd.g1.a(appCompatImageView3, new u());
        ac.c cVar6 = this.f23746e0;
        if (cVar6 == null) {
            jo.p.v("binding");
            cVar6 = null;
        }
        cVar6.M.setEmomoMotionViewListener(this);
        f4();
        b4();
        jc.f fVar2 = this.P;
        if (fVar2 == null) {
            jo.p.v("actionCreator");
            fVar2 = null;
        }
        fVar2.F();
        jc.f fVar3 = this.P;
        if (fVar3 == null) {
            jo.p.v("actionCreator");
        } else {
            fVar = fVar3;
        }
        fVar.H();
        P3().k();
        MRLogger U3 = U3();
        MRLog.Companion companion = MRLog.Companion;
        U3.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_PREPARATION_IMP).build());
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        d2.a.a(this.f23745d0, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        Fragment e02 = a3().e0("LiveAppSettingDialog");
        if (e02 != null) {
            a3().k().q(e02).j();
        }
        jc.f fVar = this.P;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.I(intent != null ? intent.getStringExtra("EXTRA_APP_ID") : null);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        if (V3().a().d()) {
            finish();
        }
    }

    @Override // be.v2
    public void p1(jf.w wVar) {
        jc.f fVar = this.P;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.y(wVar);
    }

    @Override // je.a
    public void p2(jf.c0 c0Var) {
        ClosetAvatarSimpleValue motion1;
        jo.p.h(c0Var, "direction");
        int i10 = b.f23753b[c0Var.ordinal()];
        if (i10 == 1) {
            ClosetAvatar N = Q3().N();
            if (N != null) {
                motion1 = N.getMotion1();
            }
            motion1 = null;
        } else if (i10 == 2) {
            ClosetAvatar N2 = Q3().N();
            if (N2 != null) {
                motion1 = N2.getMotion2();
            }
            motion1 = null;
        } else if (i10 == 3) {
            ClosetAvatar N3 = Q3().N();
            if (N3 != null) {
                motion1 = N3.getMotion3();
            }
            motion1 = null;
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            ClosetAvatar N4 = Q3().N();
            if (N4 != null) {
                motion1 = N4.getMotion4();
            }
            motion1 = null;
        }
        if (motion1 != null) {
            UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), motion1.getValue(), 0, 2, null);
            MRLogger U3 = U3();
            MRLog.Companion companion = MRLog.Companion;
            U3.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_GESTURE).build());
        }
    }

    @Override // be.i1
    public void u() {
    }

    @Override // je.a
    public void z0(String str) {
        jo.p.h(str, "targetDetail");
        MRLogger U3 = U3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_ZOOM);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str)));
        U3.sendLog(builder.build());
    }
}
