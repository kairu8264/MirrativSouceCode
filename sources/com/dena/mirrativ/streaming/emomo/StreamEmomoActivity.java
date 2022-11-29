package com.dena.mirrativ.streaming.emomo;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.b3;
import be.d3;
import be.r;
import be.x;
import be.y4;
import ce.k;
import ce.l;
import ce.t;
import ce.w;
import com.airbnb.lottie.LottieAnimationView;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrativ.streaming.emomo.StreamEmomoActivity;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.Avatar;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.EventBannerTargetType;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.KaraokeActionType;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.AvatarItemBannerClickTargetDetail;
import com.dena.mirrorman.clientlog.logs.detail.CollabMatchingCancelTargetDetail;
import com.dena.mirrorman.clientlog.logs.detail.CurrentUserGiftRankTargetDetail;
import com.dena.mirrorman.clientlog.logs.detail.GiftTargetDetail;
import com.dena.mirrorman.customview.GiftGachaView;
import com.dena.mirrorman.customview.SpotlightWithBalloonView;
import com.dena.mirrorman.customview.SwitchableEventBannerIconView;
import com.dena.mirrorman.database.MirrorDatabase;
import com.dena.mirrorman.fragment.StreamEmomoCommentFragment;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.request.PurchaseAvatarsRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetAvatarRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.FeverValue;
import com.dena.mirrorman.net.api.response.GroupShotViewer;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.KaraokeDetail;
import com.dena.mirrorman.net.api.response.MutualGiftReceiveRewardResponse;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftEffectInfoResponse;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingTopUser;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.CameraDolly;
import com.dena.mirrorman.unity.MultiEmomoGiftAnimationErrorLogInfo;
import com.dena.mirrorman.unity.MultiEmomoGiftAnimationLogInfo;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityAnimation;
import com.dena.mirrorman.unity.UnityLoadAvatarModel;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.unity.UnityReceiverKt;
import com.dena.mirrorman.unity.UnityScreenShotAvatarPosition;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.unity.UnityStore;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import ie.b;
import ie.f;
import j6.i;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kq.a;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import tb.c;
import uo.d2;
import uo.l0;
import wn.l;
import xb.a;
import zb.j;

/* loaded from: classes2.dex */
public final class StreamEmomoActivity extends e.b implements je.d, je.a, vb.p, vb.v, be.i1, be.s1, bc.s, bc.q1, b.InterfaceC0486b, f.b, vb.g, vb.h, vb.f, be.d3, hc.s0, hc.y0, hc.i0, hc.t, gf.v0, vb.l, be.a0, vb.k, vb.j, uo.q0 {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final wn.f G0;
    public final wn.f H0;
    public final wn.f I0;
    public final uo.b0 J0;
    public EventBannerResponse K0;
    public EventBannerResponse L0;
    public EventBannerResponse M0;
    public final wn.f N0;
    public final /* synthetic */ da.j O = new da.j();
    public uo.d2 O0;
    public ac.g P;
    public final androidx.recyclerview.widget.s P0;
    public String Q;
    public boolean R;
    public boolean S;
    public final wn.f T;
    public nf.h0 U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f23214a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f23215b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f23216c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f23217d0;

    /* renamed from: e0  reason: collision with root package name */
    public bc.q f23218e0;

    /* renamed from: f0  reason: collision with root package name */
    public final FragmentRunner f23219f0;

    /* renamed from: g0  reason: collision with root package name */
    public final wn.f f23220g0;

    /* renamed from: h0  reason: collision with root package name */
    public final wn.f f23221h0;

    /* renamed from: i0  reason: collision with root package name */
    public App.AppParams f23222i0;

    /* renamed from: j0  reason: collision with root package name */
    public uo.d2 f23223j0;

    /* renamed from: k0  reason: collision with root package name */
    public uo.d2 f23224k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f23225l0;

    /* renamed from: m0  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f23226m0;

    /* renamed from: n0  reason: collision with root package name */
    public uo.d2 f23227n0;

    /* renamed from: o0  reason: collision with root package name */
    public final wn.f f23228o0;

    /* renamed from: p0  reason: collision with root package name */
    public final wn.f f23229p0;

    /* renamed from: q0  reason: collision with root package name */
    public final wn.f f23230q0;

    /* renamed from: r0  reason: collision with root package name */
    public final wn.f f23231r0;

    /* renamed from: s0  reason: collision with root package name */
    public final wn.f f23232s0;

    /* renamed from: t0  reason: collision with root package name */
    public File f23233t0;

    /* renamed from: u0  reason: collision with root package name */
    public File f23234u0;

    /* renamed from: v0  reason: collision with root package name */
    public final wn.f f23235v0;

    /* renamed from: w0  reason: collision with root package name */
    public final wn.f f23236w0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f23237x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f23238y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f23239z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return aVar.a(context, num);
        }

        public final Intent a(Context context, Integer num) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, StreamEmomoActivity.class);
            intent.putExtra("EXTRA_PART_TYPE_ID", num);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23240w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentActivity componentActivity) {
            super(0);
            this.f23240w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23240w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$41", f = "StreamEmomoActivity.kt", l = {889}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23241w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23243w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23243w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f23243w.p5().a(Referer.BROADCAST_AVATAR, str);
                return wn.v.f59242a;
            }
        }

        public a1(ao.d<? super a1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23241w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> z02 = StreamEmomoActivity.this.l5().z0();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23241w = 1;
                if (z02.a(aVar, this) == c10) {
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
    public static final class a2 implements ViewTreeObserver.OnGlobalLayoutListener {
        public a2() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ac.g gVar = StreamEmomoActivity.this.P;
            ac.g gVar2 = null;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            gVar.f864j0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ac.g gVar3 = StreamEmomoActivity.this.P;
            if (gVar3 == null) {
                jo.p.v("binding");
                gVar3 = null;
            }
            gVar3.f880z0.setDirection(TtmlNode.RIGHT);
            ac.g gVar4 = StreamEmomoActivity.this.P;
            if (gVar4 == null) {
                jo.p.v("binding");
                gVar4 = null;
            }
            SpotlightWithBalloonView spotlightWithBalloonView = gVar4.f880z0;
            ac.g gVar5 = StreamEmomoActivity.this.P;
            if (gVar5 == null) {
                jo.p.v("binding");
                gVar5 = null;
            }
            float x10 = gVar5.f864j0.getX();
            ac.g gVar6 = StreamEmomoActivity.this.P;
            if (gVar6 == null) {
                jo.p.v("binding");
                gVar6 = null;
            }
            float y10 = gVar6.f864j0.getY();
            ac.g gVar7 = StreamEmomoActivity.this.P;
            if (gVar7 == null) {
                jo.p.v("binding");
                gVar7 = null;
            }
            float x11 = gVar7.f864j0.getX();
            ac.g gVar8 = StreamEmomoActivity.this.P;
            if (gVar8 == null) {
                jo.p.v("binding");
                gVar8 = null;
            }
            float width = x11 + gVar8.f864j0.getWidth();
            ac.g gVar9 = StreamEmomoActivity.this.P;
            if (gVar9 == null) {
                jo.p.v("binding");
                gVar9 = null;
            }
            float y11 = gVar9.f864j0.getY();
            ac.g gVar10 = StreamEmomoActivity.this.P;
            if (gVar10 == null) {
                jo.p.v("binding");
                gVar10 = null;
            }
            spotlightWithBalloonView.setSpotlightRect(new RectF(x10, y10, width, y11 + gVar10.f864j0.getHeight()));
            ac.g gVar11 = StreamEmomoActivity.this.P;
            if (gVar11 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar11;
            }
            SpotlightWithBalloonView spotlightWithBalloonView2 = gVar2.f880z0;
            String string = StreamEmomoActivity.this.getString(xb.r.text_emokara_start);
            jo.p.g(string, "getString(R.string.text_emokara_start)");
            spotlightWithBalloonView2.setText(string);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a3 extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23245w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23246x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23247y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23245w = componentCallbacks;
            this.f23246x = aVar;
            this.f23247y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f23245w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f23246x, this.f23247y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a4 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23248w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23249x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23250y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23251z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a4(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23248w = aVar;
            this.f23249x = aVar2;
            this.f23250y = aVar3;
            this.f23251z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23248w;
            vq.a aVar2 = this.f23249x;
            io.a aVar3 = this.f23250y;
            xq.a aVar4 = this.f23251z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23252a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f23253b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f23254c;

        static {
            int[] iArr = new int[jf.i.values().length];
            iArr[jf.i.NONE.ordinal()] = 1;
            iArr[jf.i.START_READY.ordinal()] = 2;
            iArr[jf.i.HOST_READY.ordinal()] = 3;
            iArr[jf.i.MATCHING.ordinal()] = 4;
            f23252a = iArr;
            int[] iArr2 = new int[nd.c.values().length];
            iArr2[nd.c.EVENT.ordinal()] = 1;
            iArr2[nd.c.INTERNAL.ordinal()] = 2;
            iArr2[nd.c.NONE.ordinal()] = 3;
            f23253b = iArr2;
            int[] iArr3 = new int[jf.c0.values().length];
            iArr3[jf.c0.LEFT.ordinal()] = 1;
            iArr3[jf.c0.RIGHT.ordinal()] = 2;
            iArr3[jf.c0.UP.ordinal()] = 3;
            iArr3[jf.c0.DOWN.ordinal()] = 4;
            f23254c = iArr3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23255w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23256x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23257y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23258z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23255w = aVar;
            this.f23256x = aVar2;
            this.f23257y = aVar3;
            this.f23258z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23255w;
            vq.a aVar2 = this.f23256x;
            io.a aVar3 = this.f23257y;
            xq.a aVar4 = this.f23258z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.h0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$42", f = "StreamEmomoActivity.kt", l = {895}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23259w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23261w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23261w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f23261w.e5();
                return wn.v.f59242a;
            }
        }

        public b1(ao.d<? super b1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23259w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> w02 = StreamEmomoActivity.this.l5().w0();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23259w = 1;
                if (w02.a(aVar, this) == c10) {
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
    public static final class b2 implements yd.s1 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ EventNoticeResponse f23263b;

        public b2(EventNoticeResponse eventNoticeResponse) {
            this.f23263b = eventNoticeResponse;
        }

        @Override // yd.s1
        public void a(int i10) {
            StreamEmomoActivity.this.V5(this.f23263b.getBanners().get(i10), EventBannerWhere.CAST_UPPER_RIGHT);
        }

        @Override // yd.s1
        public void b(int i10) {
            StreamEmomoActivity.this.i6(this.f23263b.getBanners().get(i10), EventBannerWhere.CAST_UPPER_RIGHT);
            StreamEmomoActivity.this.f23225l0 = this.f23263b.getBanners().get(i10).getType();
            StreamEmomoActivity.this.b5();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b3 extends jo.q implements io.a<od.n0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23264w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23265x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23266y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23264w = componentCallbacks;
            this.f23265x = aVar;
            this.f23266y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.n0, java.lang.Object] */
        @Override // io.a
        public final od.n0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23264w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.n0.class), this.f23265x, this.f23266y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b4 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23267w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b4(ComponentActivity componentActivity) {
            super(0);
            this.f23267w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f23267w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$closeEmokaraDialog$2", f = "StreamEmomoActivity.kt", l = {3049}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23268w;

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
            int i10 = this.f23268w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest D5 = StreamEmomoActivity.this.D5();
                    String c11 = StreamEmomoActivity.this.z5().c();
                    this.f23268w = 1;
                    if (D5.postKaraokeEnd(c11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Exception e10) {
                g9.a.c(e10);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23270w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentActivity componentActivity) {
            super(0);
            this.f23270w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f23270w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c1 extends jo.q implements io.a<wn.v> {
        public c1() {
            super(0);
        }

        public final void a() {
            od.f o52 = StreamEmomoActivity.this.o5();
            String str = StreamEmomoActivity.this.Q;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            o52.j(str, false);
            dq.c.c().l(new ce.s());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c2 extends jo.q implements io.l<String, wn.v> {
        public c2() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "bannerIconLinkUrl");
            if (!so.n.r(str)) {
                jf.b0 a10 = StreamEmomoActivity.this.K5().a(str);
                if (!(a10 instanceof b0.l0)) {
                    StreamEmomoActivity streamEmomoActivity = StreamEmomoActivity.this;
                    streamEmomoActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(streamEmomoActivity, Referer.BROADCAST_AVATAR, a10));
                } else {
                    StreamEmomoActivity streamEmomoActivity2 = StreamEmomoActivity.this;
                    streamEmomoActivity2.startActivity(WebViewActivity.a.b(WebViewActivity.X, streamEmomoActivity2, str, false, false, 12, null));
                }
                List<jf.u> f10 = StreamEmomoActivity.this.l5().l0().f();
                if (f10 != null) {
                    for (jf.u uVar : f10) {
                        if (jo.p.c(uVar.d(), str)) {
                            if (uVar != null) {
                                StreamEmomoActivity streamEmomoActivity3 = StreamEmomoActivity.this;
                                MRLogger B5 = streamEmomoActivity3.B5();
                                MRLog.Companion companion = MRLog.Companion;
                                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_CLICK_CURRENT_USER_GIFT_RANK);
                                wn.k[] kVarArr = new wn.k[4];
                                String str2 = streamEmomoActivity3.Q;
                                if (str2 == null) {
                                    jo.p.v("liveId");
                                    str2 = null;
                                }
                                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str2);
                                kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity3.M5().T4());
                                kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, streamEmomoActivity3.A5().h());
                                kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CurrentUserGiftRankTargetDetail(uVar.o(), uVar.e(), uVar.h(), uVar.j()).toJson());
                                builder.setPayload(xn.s.m(kVarArr));
                                B5.sendLog(builder.build());
                                return;
                            }
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c3 extends jo.q implements io.a<hf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23273w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23274x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23275y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23273w = componentCallbacks;
            this.f23274x = aVar;
            this.f23275y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.w, java.lang.Object] */
        @Override // io.a
        public final hf.w invoke() {
            ComponentCallbacks componentCallbacks = this.f23273w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.w.class), this.f23274x, this.f23275y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c4 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23276w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c4(ComponentActivity componentActivity) {
            super(0);
            this.f23276w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23276w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$closeEventWebView$1", f = "StreamEmomoActivity.kt", l = {1723}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23277w;

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
            int i10 = this.f23277w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23277w = 1;
                if (uo.b1.a(1500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StreamEmomoActivity.this.e5();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$1", f = "StreamEmomoActivity.kt", l = {350}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23279w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityLoadAvatarModel> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23281w;

            @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$1$1", f = "StreamEmomoActivity.kt", l = {359}, m = "emit")
            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$d0$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0198a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f23282w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f23283x;

                /* renamed from: z  reason: collision with root package name */
                public int f23285z;

                public C0198a(ao.d<? super C0198a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f23283x = obj;
                    this.f23285z |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23281w = streamEmomoActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(com.dena.mirrorman.unity.UnityLoadAvatarModel r5, ao.d<? super wn.v> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.d0.a.C0198a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$d0$a$a r0 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.d0.a.C0198a) r0
                    int r1 = r0.f23285z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23285z = r1
                    goto L18
                L13:
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$d0$a$a r0 = new com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$d0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f23283x
                    java.lang.Object r1 = bo.c.c()
                    int r2 = r0.f23285z
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f23282w
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$d0$a r5 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.d0.a) r5
                    wn.m.b(r6)
                    goto L93
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    wn.m.b(r6)
                    com.dena.mirrorman.unity.UnityManager$Companion r6 = com.dena.mirrorman.unity.UnityManager.Companion
                    com.dena.mirrorman.unity.UnityManager r2 = r6.getInstance()
                    r2.initGifting(r3)
                    int r5 = r5.getSlot()
                    if (r5 != 0) goto L4e
                    com.dena.mirrorman.unity.UnityManager r5 = r6.getInstance()
                    r5.restoreCameraDolly()
                L4e:
                    com.dena.mirrorman.unity.UnityManager r5 = r6.getInstance()
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r2 = r4.f23281w
                    nf.f r2 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.e4(r2)
                    com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r2 = r2.N()
                    if (r2 == 0) goto L6a
                    com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset r2 = r2.getCompanionType()
                    if (r2 == 0) goto L6a
                    java.lang.String r2 = r2.getName()
                    if (r2 != 0) goto L6c
                L6a:
                    java.lang.String r2 = ""
                L6c:
                    r5.setCompanionName(r2)
                    com.dena.mirrorman.unity.UnityManager r5 = r6.getInstance()
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r6 = r4.f23281w
                    kf.x r6 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.H4(r6)
                    int r6 = r6.s3()
                    r5.setMainichi(r6)
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r5 = r4.f23281w
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.O4(r5, r3)
                    r5 = 1500(0x5dc, double:7.41E-321)
                    r0.f23282w = r4
                    r0.f23285z = r3
                    java.lang.Object r5 = uo.b1.a(r5, r0)
                    if (r5 != r1) goto L92
                    return r1
                L92:
                    r5 = r4
                L93:
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r5 = r5.f23281w
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.W3(r5)
                    wn.v r5 = wn.v.f59242a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.d0.a.emit(com.dena.mirrorman.unity.UnityLoadAvatarModel, ao.d):java.lang.Object");
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
            int i10 = this.f23279w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityLoadAvatarModel> loadAvatarModelCompletedFlow = StreamEmomoActivity.this.J5().getLoadAvatarModelCompletedFlow();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23279w = 1;
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
    public static final class d1 extends jo.q implements io.l<View, wn.v> {
        public d1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            j.a aVar = zb.j.Y0;
            String str = StreamEmomoActivity.this.Q;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            aVar.a(Referer.BROADCAST_AVATAR, str).z3(StreamEmomoActivity.this.a3(), "CollabCandidateViewersBottomSheetDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d2 extends RecyclerView.u {
        public d2() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            StreamEmomoActivity.this.h7();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d3 extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23288w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23289x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23290y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23288w = componentCallbacks;
            this.f23289x = aVar;
            this.f23290y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f23288w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f23289x, this.f23290y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d4 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23291w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23292x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23293y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23294z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d4(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23291w = aVar;
            this.f23292x = aVar2;
            this.f23293y = aVar3;
            this.f23294z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23291w;
            vq.a aVar2 = this.f23292x;
            io.a aVar3 = this.f23293y;
            xq.a aVar4 = this.f23294z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ StreamEmomoActivity f23295w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l0.a aVar, StreamEmomoActivity streamEmomoActivity) {
            super(aVar);
            this.f23295w = streamEmomoActivity;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            this.f23295w.I5().unloadRichUniqueGift();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.l<View, wn.v> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f23297a;

            static {
                int[] iArr = new int[jf.i.values().length];
                iArr[jf.i.START_READY.ordinal()] = 1;
                iArr[jf.i.HOST_READY.ordinal()] = 2;
                f23297a = iArr;
            }
        }

        public e0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            jf.i f10 = StreamEmomoActivity.this.l5().O().f();
            int i10 = f10 == null ? -1 : a.f23297a[f10.ordinal()];
            if (i10 == 1 || i10 == 2) {
                tb.a h02 = StreamEmomoActivity.this.y5().h0(StreamEmomoActivity.this.l5().O().f() == jf.i.HOST_READY);
                h02.a().z3(StreamEmomoActivity.this.a3(), h02.b());
                ac.g gVar = StreamEmomoActivity.this.P;
                ac.g gVar2 = null;
                if (gVar == null) {
                    jo.p.v("binding");
                    gVar = null;
                }
                gVar.J.setVisibility(0);
                ac.g gVar3 = StreamEmomoActivity.this.P;
                if (gVar3 == null) {
                    jo.p.v("binding");
                    gVar3 = null;
                }
                gVar3.f871q0.setVisibility(8);
                ac.g gVar4 = StreamEmomoActivity.this.P;
                if (gVar4 == null) {
                    jo.p.v("binding");
                    gVar4 = null;
                }
                gVar4.f870p0.setVisibility(8);
                ac.g gVar5 = StreamEmomoActivity.this.P;
                if (gVar5 == null) {
                    jo.p.v("binding");
                    gVar5 = null;
                }
                gVar5.f869o0.setVisibility(8);
                ac.g gVar6 = StreamEmomoActivity.this.P;
                if (gVar6 == null) {
                    jo.p.v("binding");
                } else {
                    gVar2 = gVar6;
                }
                gVar2.f868n0.setVisibility(8);
                return;
            }
            tb.c y52 = StreamEmomoActivity.this.y5();
            Boolean f11 = StreamEmomoActivity.this.l5().H0().f();
            if (f11 == null) {
                f11 = Boolean.TRUE;
            }
            tb.a g10 = y52.g(f11.booleanValue());
            g10.a().z3(StreamEmomoActivity.this.a3(), g10.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e1 extends jo.q implements io.l<View, wn.v> {
        public e1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            tb.c y52 = StreamEmomoActivity.this.y5();
            Boolean f10 = StreamEmomoActivity.this.l5().H0().f();
            if (f10 == null) {
                f10 = Boolean.FALSE;
            }
            tb.a g10 = y52.g(f10.booleanValue());
            g10.a().z3(StreamEmomoActivity.this.a3(), g10.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$37$2", f = "StreamEmomoActivity.kt", l = {1586}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23299w;

        public e2(ao.d<? super e2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e2(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23299w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23299w = 1;
                if (uo.b1.a(1000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StreamEmomoActivity.this.h7();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e3 extends jo.q implements io.a<od.g> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23301w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23302x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23303y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23301w = componentCallbacks;
            this.f23302x = aVar;
            this.f23303y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.g] */
        @Override // io.a
        public final od.g invoke() {
            ComponentCallbacks componentCallbacks = this.f23301w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.g.class), this.f23302x, this.f23303y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e4 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23304w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e4(ComponentActivity componentActivity) {
            super(0);
            this.f23304w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f23304w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ StreamEmomoActivity f23305w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l0.a aVar, StreamEmomoActivity streamEmomoActivity) {
            super(aVar);
            this.f23305w = streamEmomoActivity;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            ac.g gVar2 = this.f23305w.P;
            if (gVar2 == null) {
                jo.p.v("binding");
                gVar2 = null;
            }
            gVar2.f855a0.F();
            this.f23305w.e5();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.l<View, wn.v> {
        public f0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            tb.a h02 = StreamEmomoActivity.this.y5().h0(StreamEmomoActivity.this.l5().O().f() == jf.i.HOST_READY);
            h02.a().z3(StreamEmomoActivity.this.a3(), h02.b());
            ac.g gVar = StreamEmomoActivity.this.P;
            ac.g gVar2 = null;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            gVar.J.setVisibility(0);
            ac.g gVar3 = StreamEmomoActivity.this.P;
            if (gVar3 == null) {
                jo.p.v("binding");
                gVar3 = null;
            }
            gVar3.f871q0.setVisibility(8);
            ac.g gVar4 = StreamEmomoActivity.this.P;
            if (gVar4 == null) {
                jo.p.v("binding");
                gVar4 = null;
            }
            gVar4.f870p0.setVisibility(8);
            ac.g gVar5 = StreamEmomoActivity.this.P;
            if (gVar5 == null) {
                jo.p.v("binding");
                gVar5 = null;
            }
            gVar5.f869o0.setVisibility(8);
            ac.g gVar6 = StreamEmomoActivity.this.P;
            if (gVar6 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar6;
            }
            gVar2.f868n0.setVisibility(8);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onEmokaraDialogDismiss$1", f = "StreamEmomoActivity.kt", l = {3059}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23307w;

        public f1(ao.d<? super f1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23307w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23307w = 1;
                if (uo.b1.a(1500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StreamEmomoActivity.this.e5();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$38", f = "StreamEmomoActivity.kt", l = {1603}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23309w;

        @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$38$1", f = "StreamEmomoActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.q<Integer, List<? extends String>, ao.d<? super List<? extends String>>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f23311w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ int f23312x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f23313y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23314z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StreamEmomoActivity streamEmomoActivity, ao.d<? super a> dVar) {
                super(3, dVar);
                this.f23314z = streamEmomoActivity;
            }

            public final Object a(int i10, List<String> list, ao.d<? super List<String>> dVar) {
                a aVar = new a(this.f23314z, dVar);
                aVar.f23312x = i10;
                aVar.f23313y = list;
                return aVar.invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                jf.u uVar;
                bo.c.c();
                if (this.f23311w == 0) {
                    wn.m.b(obj);
                    int i10 = this.f23312x;
                    List list = (List) this.f23313y;
                    List<jf.u> f10 = this.f23314z.l5().l0().f();
                    boolean z10 = false;
                    if (f10 != null && (uVar = (jf.u) xn.a0.a0(f10, i10)) != null && !uVar.o()) {
                        z10 = true;
                    }
                    return z10 ? list : xn.s.k();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ Object s0(Integer num, List<? extends String> list, ao.d<? super List<? extends String>> dVar) {
                return a(num.intValue(), list, dVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements xo.d<List<? extends String>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23315w;

            @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$38$2", f = "StreamEmomoActivity.kt", l = {1622, 1631}, m = "emit")
            /* loaded from: classes2.dex */
            public static final class a extends co.d {
                public int B;

                /* renamed from: w  reason: collision with root package name */
                public Object f23316w;

                /* renamed from: x  reason: collision with root package name */
                public Object f23317x;

                /* renamed from: y  reason: collision with root package name */
                public Object f23318y;

                /* renamed from: z  reason: collision with root package name */
                public /* synthetic */ Object f23319z;

                public a(ao.d<? super a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f23319z = obj;
                    this.B |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(StreamEmomoActivity streamEmomoActivity) {
                this.f23315w = streamEmomoActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0194 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0195 -> B:52:0x0197). Please submit an issue!!! */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.util.List<java.lang.String> r18, ao.d<? super wn.v> r19) {
                /*
                    Method dump skipped, instructions count: 439
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.f2.b.emit(java.util.List, ao.d):java.lang.Object");
            }
        }

        public f2(ao.d<? super f2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f2(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23309w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.h0 h0Var = StreamEmomoActivity.this.U;
                if (h0Var == null) {
                    jo.p.v("store");
                    h0Var = null;
                }
                xo.c h10 = xo.e.h(h0Var.s(), StreamEmomoActivity.this.l5().k0(), new a(StreamEmomoActivity.this, null));
                b bVar = new b(StreamEmomoActivity.this);
                this.f23309w = 1;
                if (h10.a(bVar, this) == c10) {
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
    public static final class f3 extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23320w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23321x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23322y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23320w = componentCallbacks;
            this.f23321x = aVar;
            this.f23322y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f23320w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f23321x, this.f23322y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$startAutoSwitchBannerTimer$1", f = "StreamEmomoActivity.kt", l = {1861}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f4 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23323w;

        /* renamed from: x  reason: collision with root package name */
        public int f23324x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23325y;

        /* renamed from: z  reason: collision with root package name */
        public int f23326z;

        public f4(ao.d<? super f4> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f4(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f4) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
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
                int r1 = r7.f23326z
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r7.f23324x
                int r3 = r7.f23323w
                java.lang.Object r4 = r7.f23325y
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
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
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r1 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                r3 = 0
                r4 = r1
                r1 = r3
                r3 = r8
                r8 = r7
            L2d:
                if (r1 >= r3) goto L54
                r5 = 60000(0xea60, double:2.9644E-319)
                r8.f23325y = r4
                r8.f23323w = r3
                r8.f23324x = r1
                r8.f23326z = r2
                java.lang.Object r5 = uo.b1.a(r5, r8)
                if (r5 != r0) goto L41
                return r0
            L41:
                ac.g r5 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r4)
                if (r5 != 0) goto L4d
                java.lang.String r5 = "binding"
                jo.p.v(r5)
                r5 = 0
            L4d:
                com.dena.mirrorman.customview.SwitchableEventBannerIconView r5 = r5.A0
                r5.e()
                int r1 = r1 + r2
                goto L2d
            L54:
                wn.v r8 = wn.v.f59242a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.f4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$consumeGift$1", f = "StreamEmomoActivity.kt", l = {2100}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23327w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<xb.a> f23329y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends xb.a> list, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f23329y = list;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f23329y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23327w;
            if (i10 == 0) {
                wn.m.b(obj);
                StreamEmomoActivity.this.k5().S();
                StreamEmomoActivity streamEmomoActivity = StreamEmomoActivity.this;
                List<xb.a> list = this.f23329y;
                this.f23327w = 1;
                if (streamEmomoActivity.N5(list, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StreamEmomoActivity.this.k5().M();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.l<View, wn.v> {
        public g0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ac.g gVar = StreamEmomoActivity.this.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            gVar.f870p0.performClick();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onPurchase$1", f = "StreamEmomoActivity.kt", l = {2839}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23331w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f23332x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Parcelable f23334z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(Parcelable parcelable, ao.d<? super g1> dVar) {
            super(2, dVar);
            this.f23334z = parcelable;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            g1 g1Var = new g1(this.f23334z, dVar);
            g1Var.f23332x = obj;
            return g1Var;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object a10;
            Object c10 = bo.c.c();
            int i10 = this.f23331w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    uo.q0 q0Var = (uo.q0) this.f23332x;
                    StreamEmomoActivity streamEmomoActivity = StreamEmomoActivity.this;
                    Parcelable parcelable = this.f23334z;
                    l.a aVar = wn.l.f59224w;
                    MRRequest D5 = streamEmomoActivity.D5();
                    PurchaseAvatarsRequest b10 = ((ke.a) parcelable).b();
                    this.f23331w = 1;
                    obj = D5.postPurchaseAvatars(Referer.BROADCAST_AVATAR, b10, this);
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
            StreamEmomoActivity streamEmomoActivity2 = StreamEmomoActivity.this;
            Parcelable parcelable2 = this.f23334z;
            Throwable b11 = wn.l.b(a10);
            if (b11 == null) {
                PurchaseAvatarsResponse purchaseAvatarsResponse = (PurchaseAvatarsResponse) a10;
                MRLogger B5 = streamEmomoActivity2.B5();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COIN_CONSUME);
                builder.setTargetType("avatar_shop");
                builder.setPayload(xn.r.d(companion.purchaseItemIds((ke.a) parcelable2)));
                B5.sendLog(builder.build());
                streamEmomoActivity2.m5().E(purchaseAvatarsResponse);
                if (purchaseAvatarsResponse.getResultImageUrl().length() > 0) {
                    if (purchaseAvatarsResponse.getResultMessage().length() > 0) {
                        be.u.Q0.a(purchaseAvatarsResponse.getResultImageUrl(), purchaseAvatarsResponse.getResultMessage()).z3(streamEmomoActivity2.a3(), "AvatarPartsPurchaseResultDialog");
                        streamEmomoActivity2.n6("EmomoDressUpShopDialog");
                        streamEmomoActivity2.f5();
                    }
                }
                of.n.A(streamEmomoActivity2.getBaseContext(), xb.r.B0, false);
                streamEmomoActivity2.n6("EmomoDressUpShopDialog");
                streamEmomoActivity2.f5();
            } else {
                g9.a.c(b11);
                streamEmomoActivity2.f5();
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$39", f = "StreamEmomoActivity.kt", l = {1648}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23335w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23337w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23337w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Failure) {
                    of.n.f45411a.B(this.f23337w, ((MRError.Failure) mRError).getErrorMessage(), false);
                } else if (mRError instanceof MRError.Blocked) {
                    of.n.f45411a.B(this.f23337w, ((MRError.Blocked) mRError).getErrorMessage(), false);
                }
                return wn.v.f59242a;
            }
        }

        public g2(ao.d<? super g2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g2(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23335w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> e02 = StreamEmomoActivity.this.l5().e0();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23335w = 1;
                if (e02.a(aVar, this) == c10) {
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
    public static final class g3 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23338w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23339x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23340y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23338w = componentCallbacks;
            this.f23339x = aVar;
            this.f23340y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f23338w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f23339x, this.f23340y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$startEmomoGiftAnimation$2$1", f = "StreamEmomoActivity.kt", l = {2545}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g4 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ uo.p<wn.v> A;

        /* renamed from: w  reason: collision with root package name */
        public int f23341w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f23342x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f23344z;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f23345w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ uo.p<wn.v> f23346x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f23347y;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, uo.p<? super wn.v> pVar, uo.q0 q0Var) {
                this.f23345w = str;
                this.f23346x = pVar;
                this.f23347y = q0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                if (jo.p.c(str, this.f23345w)) {
                    uo.p<wn.v> pVar = this.f23346x;
                    wn.v vVar = wn.v.f59242a;
                    pVar.R(vVar, null);
                    uo.r0.d(this.f23347y, null, 1, null);
                    return vVar;
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g4(String str, uo.p<? super wn.v> pVar, ao.d<? super g4> dVar) {
            super(2, dVar);
            this.f23344z = str;
            this.A = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            g4 g4Var = new g4(this.f23344z, this.A, dVar);
            g4Var.f23342x = obj;
            return g4Var;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g4) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23341w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> liveGiftAnimationFinishedFlow = StreamEmomoActivity.this.J5().getLiveGiftAnimationFinishedFlow();
                a aVar = new a(this.f23344z, this.A, (uo.q0) this.f23342x);
                this.f23341w = 1;
                if (liveGiftAnimationFinishedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$consumeGift$2", f = "StreamEmomoActivity.kt", l = {2113, 2138, 2145}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public int B;
        public final /* synthetic */ GiftItem D;
        public final /* synthetic */ List<xb.a> E;

        /* renamed from: w  reason: collision with root package name */
        public Object f23348w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23349x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23350y;

        /* renamed from: z  reason: collision with root package name */
        public int f23351z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<jf.c, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f23352w = new a();

            public a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(jf.c cVar) {
                jo.p.h(cVar, "closetAvatarModel");
                return "avatar_f_model,Avatar.prefab;" + cVar.b();
            }
        }

        @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$consumeGift$2$2$1", f = "StreamEmomoActivity.kt", l = {2141}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f23353w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23354x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ GiftItem f23355y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ jo.e0<String> f23356z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(StreamEmomoActivity streamEmomoActivity, GiftItem giftItem, jo.e0<String> e0Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f23354x = streamEmomoActivity;
                this.f23355y = giftItem;
                this.f23356z = e0Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f23354x, this.f23355y, this.f23356z, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f23353w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    UnityManager.Companion.getInstance().setAvatarSlot(0);
                    StreamEmomoActivity streamEmomoActivity = this.f23354x;
                    String liveSentGiftId = this.f23355y.getLiveSentGiftId();
                    String effectId = this.f23355y.getEffectId();
                    jo.p.e(effectId);
                    this.f23353w = 1;
                    if (streamEmomoActivity.Z6(liveSentGiftId, effectId, this.f23356z.f38136w, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(GiftItem giftItem, List<? extends xb.a> list, ao.d<? super h> dVar) {
            super(2, dVar);
            this.D = giftItem;
            this.E = list;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.D, this.E, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
        /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x013f -> B:46:0x0142). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 375
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.l<View, wn.v> {
        public h0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ac.g gVar = StreamEmomoActivity.this.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            gVar.f870p0.performClick();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onResume$5", f = "StreamEmomoActivity.kt", l = {AnalyticsListener.EVENT_AUDIO_ATTRIBUTES_CHANGED}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23358w;

        public h1(ao.d<? super h1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23358w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23358w = 1;
                if (uo.b1.a(1500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StreamEmomoActivity.this.e5();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$40", f = "StreamEmomoActivity.kt", l = {1659}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23360w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23362w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23362w = streamEmomoActivity;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                ac.g gVar = this.f23362w.P;
                ac.g gVar2 = null;
                if (gVar == null) {
                    jo.p.v("binding");
                    gVar = null;
                }
                gVar.f879y0.setVisibility(z10 ? 0 : 8);
                ac.g gVar3 = this.f23362w.P;
                if (gVar3 == null) {
                    jo.p.v("binding");
                } else {
                    gVar2 = gVar3;
                }
                AppCompatImageView appCompatImageView = gVar2.f879y0;
                jo.p.g(appCompatImageView, "binding.shooterMatchingFukidashiImageView");
                x5.a.a(appCompatImageView.getContext()).c(new i.a(appCompatImageView.getContext()).b(co.b.d(xb.n.shooter_matching_fukidashi)).l(appCompatImageView).a());
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        public h2(ao.d<? super h2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h2(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23360w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.h0 h0Var = StreamEmomoActivity.this.U;
                if (h0Var == null) {
                    jo.p.v("store");
                    h0Var = null;
                }
                xo.g0<Boolean> O = h0Var.O();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23360w = 1;
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
    public static final class h3 extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23363w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23364x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23365y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23363w = componentCallbacks;
            this.f23364x = aVar;
            this.f23365y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23363w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f23364x, this.f23365y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$startEmomoRichGiftAnimation$2$1", f = "StreamEmomoActivity.kt", l = {2567}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h4 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ uo.p<wn.v> A;

        /* renamed from: w  reason: collision with root package name */
        public int f23366w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f23367x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f23369z;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f23370w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ uo.p<wn.v> f23371x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f23372y;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, uo.p<? super wn.v> pVar, uo.q0 q0Var) {
                this.f23370w = str;
                this.f23371x = pVar;
                this.f23372y = q0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                if (jo.p.c(str, this.f23370w)) {
                    uo.p<wn.v> pVar = this.f23371x;
                    wn.v vVar = wn.v.f59242a;
                    pVar.R(vVar, null);
                    uo.r0.d(this.f23372y, null, 1, null);
                    return vVar;
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h4(String str, uo.p<? super wn.v> pVar, ao.d<? super h4> dVar) {
            super(2, dVar);
            this.f23369z = str;
            this.A = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            h4 h4Var = new h4(this.f23369z, this.A, dVar);
            h4Var.f23367x = obj;
            return h4Var;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h4) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23366w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<String> liveGiftAnimationFinishedFlow = StreamEmomoActivity.this.J5().getLiveGiftAnimationFinishedFlow();
                a aVar = new a(this.f23369z, this.A, (uo.q0) this.f23367x);
                this.f23366w = 1;
                if (liveGiftAnimationFinishedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$consumeGift$4", f = "StreamEmomoActivity.kt", l = {2169, 2182, 2190}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public int A;
        public int B;
        public int C;
        public final /* synthetic */ GiftItem E;
        public final /* synthetic */ List<xb.a> F;

        /* renamed from: w  reason: collision with root package name */
        public Object f23373w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23374x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23375y;

        /* renamed from: z  reason: collision with root package name */
        public Object f23376z;

        @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$consumeGift$4$1$1", f = "StreamEmomoActivity.kt", l = {2185}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f23377w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23378x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ jf.c f23379y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ UniqueEmomoGiftEffectInfoResponse f23380z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StreamEmomoActivity streamEmomoActivity, jf.c cVar, UniqueEmomoGiftEffectInfoResponse uniqueEmomoGiftEffectInfoResponse, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f23378x = streamEmomoActivity;
                this.f23379y = cVar;
                this.f23380z = uniqueEmomoGiftEffectInfoResponse;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f23378x, this.f23379y, this.f23380z, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f23377w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    UnityManager.Companion.getInstance().setAvatarSlot(0);
                    StreamEmomoActivity streamEmomoActivity = this.f23378x;
                    jf.c cVar = this.f23379y;
                    UniqueEmomoGiftEffectInfoResponse uniqueEmomoGiftEffectInfoResponse = this.f23380z;
                    this.f23377w = 1;
                    if (streamEmomoActivity.a7(cVar, uniqueEmomoGiftEffectInfoResponse, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(GiftItem giftItem, List<? extends xb.a> list, ao.d<? super i> dVar) {
            super(2, dVar);
            this.E = giftItem;
            this.F = list;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.E, this.F, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0128 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f9 -> B:40:0x00fc). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$16", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23381w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23382x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23383y;

        /* renamed from: z  reason: collision with root package name */
        public int f23384z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23385w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StreamEmomoActivity streamEmomoActivity) {
                super(0);
                this.f23385w = streamEmomoActivity;
            }

            public final void a() {
                hc.h0.Z0.a(Referer.BROADCAST_AVATAR).z3(this.f23385w.a3(), "GroupShotResultDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
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

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:21:0x005f, B:23:0x0067, B:25:0x0073, B:26:0x0077, B:28:0x007e, B:30:0x0084, B:31:0x008d, B:33:0x0093, B:34:0x00aa), top: B:44:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:44:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i1 extends jo.q implements io.l<ud.m0, wn.v> {
        public i1() {
            super(1);
        }

        public final void a(ud.m0 m0Var) {
            jo.p.h(m0Var, "giftGachaStock");
            od.b k52 = StreamEmomoActivity.this.k5();
            String str = StreamEmomoActivity.this.Q;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            k52.C(str, m0Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.m0 m0Var) {
            a(m0Var);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$41", f = "StreamEmomoActivity.kt", l = {1679}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23387w;

        @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$41$1", f = "StreamEmomoActivity.kt", l = {1674}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.q<Integer, GiftRankingChangedBcsvrResponse, ao.d<? super RecyclerView.e0>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f23389w;

            /* renamed from: x  reason: collision with root package name */
            public /* synthetic */ int f23390x;

            /* renamed from: y  reason: collision with root package name */
            public /* synthetic */ Object f23391y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23392z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StreamEmomoActivity streamEmomoActivity, ao.d<? super a> dVar) {
                super(3, dVar);
                this.f23392z = streamEmomoActivity;
            }

            public final Object a(int i10, GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse, ao.d<? super RecyclerView.e0> dVar) {
                a aVar = new a(this.f23392z, dVar);
                aVar.f23390x = i10;
                aVar.f23391y = giftRankingChangedBcsvrResponse;
                return aVar.invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Integer num;
                int i10;
                Object c10 = bo.c.c();
                int i11 = this.f23389w;
                ac.g gVar = null;
                if (i11 == 0) {
                    wn.m.b(obj);
                    int i12 = this.f23390x;
                    GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse = (GiftRankingChangedBcsvrResponse) this.f23391y;
                    this.f23392z.k5().u();
                    List<jf.u> f10 = this.f23392z.l5().l0().f();
                    if (f10 != null) {
                        Iterator<jf.u> it = f10.iterator();
                        int i13 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i13 = -1;
                                break;
                            }
                            jf.u next = it.next();
                            if ((giftRankingChangedBcsvrResponse != null && next.e() == giftRankingChangedBcsvrResponse.getEventId()) && next.o() == giftRankingChangedBcsvrResponse.isAppEvent()) {
                                break;
                            }
                            i13++;
                        }
                        num = co.b.d(i13);
                    } else {
                        num = null;
                    }
                    if (num == null || i12 != num.intValue()) {
                        return null;
                    }
                    this.f23390x = i12;
                    this.f23389w = 1;
                    if (uo.b1.a(500L, this) == c10) {
                        return c10;
                    }
                    i10 = i12;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i10 = this.f23390x;
                    wn.m.b(obj);
                }
                ac.g gVar2 = this.f23392z.P;
                if (gVar2 == null) {
                    jo.p.v("binding");
                } else {
                    gVar = gVar2;
                }
                return gVar.R.Z(i10);
            }

            @Override // io.q
            public /* bridge */ /* synthetic */ Object s0(Integer num, GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse, ao.d<? super RecyclerView.e0> dVar) {
                return a(num.intValue(), giftRankingChangedBcsvrResponse, dVar);
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements xo.d<RecyclerView.e0> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f23393w = new b();

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(RecyclerView.e0 e0Var, ao.d<? super wn.v> dVar) {
                cc.j jVar = e0Var instanceof cc.j ? (cc.j) e0Var : null;
                if (jVar != null) {
                    jVar.g();
                }
                return wn.v.f59242a;
            }
        }

        public i2(ao.d<? super i2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i2(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23387w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.h0 h0Var = StreamEmomoActivity.this.U;
                if (h0Var == null) {
                    jo.p.v("store");
                    h0Var = null;
                }
                xo.c h10 = xo.e.h(h0Var.s(), StreamEmomoActivity.this.l5().o0(), new a(StreamEmomoActivity.this, null));
                b bVar = b.f23393w;
                this.f23387w = 1;
                if (h10.a(bVar, this) == c10) {
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
    public static final class i3 extends jo.q implements io.a<cc.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23394w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23395x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23396y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23394w = componentCallbacks;
            this.f23395x = aVar;
            this.f23396y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [cc.f, java.lang.Object] */
        @Override // io.a
        public final cc.f invoke() {
            ComponentCallbacks componentCallbacks = this.f23394w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(cc.f.class), this.f23395x, this.f23396y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$startRankDisplayJob$1", f = "StreamEmomoActivity.kt", l = {1835}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i4 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23397w;

        public i4(ao.d<? super i4> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i4(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i4) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23397w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23397w = 1;
                if (uo.b1.a(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            uo.d2 d2Var = StreamEmomoActivity.this.f23223j0;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            StreamEmomoActivity.this.b5();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$consumeGift$6", f = "StreamEmomoActivity.kt", l = {2203, 2217, 2211, 2222}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ GiftItem B;
        public final /* synthetic */ List<xb.a> C;

        /* renamed from: w  reason: collision with root package name */
        public Object f23399w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23400x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23401y;

        /* renamed from: z  reason: collision with root package name */
        public int f23402z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(GiftItem giftItem, List<? extends xb.a> list, ao.d<? super j> dVar) {
            super(2, dVar);
            this.B = giftItem;
            this.C = list;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$17", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23403w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23404x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23405y;

        /* renamed from: z  reason: collision with root package name */
        public int f23406z;

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

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {all -> 0x00ed, blocks: (B:21:0x005f, B:23:0x0067, B:26:0x0075, B:28:0x007b, B:29:0x007f, B:31:0x008c, B:32:0x0090, B:33:0x0096, B:35:0x009c, B:36:0x00a0, B:38:0x00a9, B:40:0x00af, B:41:0x00b3, B:42:0x00b8, B:44:0x00c2, B:46:0x00c8, B:47:0x00cc, B:49:0x00d7, B:50:0x00db), top: B:64:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:64:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j1 extends jo.q implements io.l<ud.o0, wn.v> {
        public j1() {
            super(1);
        }

        public final void a(ud.o0 o0Var) {
            jo.p.h(o0Var, "it");
            StreamEmomoActivity.this.k5().D(o0Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(ud.o0 o0Var) {
            a(o0Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j2 extends jo.q implements io.l<View, wn.v> {
        public j2() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ac.g gVar = StreamEmomoActivity.this.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            gVar.f880z0.setVisibility(8);
            StreamEmomoActivity.this.p6(true);
            StreamEmomoActivity.this.j6();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j3 extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23409w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23410x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23411y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23409w = componentCallbacks;
            this.f23410x = aVar;
            this.f23411y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f23409w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f23410x, this.f23411y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j4 extends jo.q implements io.a<wn.v> {
        public j4() {
            super(0);
        }

        public final void a() {
            StreamEmomoActivity.this.n6("LiveGiftRankingBottomSheetDialogFragment");
            androidx.fragment.app.z k10 = StreamEmomoActivity.this.a3().k();
            ac.g gVar = StreamEmomoActivity.this.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            k10.s(gVar.f862h0.getId(), hc.x0.G0.a(Referer.BROADCAST_AVATAR), "GroupShotSnapFragment").i();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$consumeGift$7", f = "StreamEmomoActivity.kt", l = {2237}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23413w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ GiftItem f23414x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ StreamEmomoActivity f23415y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GiftItem giftItem, StreamEmomoActivity streamEmomoActivity, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f23414x = giftItem;
            this.f23415y = streamEmomoActivity;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f23414x, this.f23415y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23413w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23413w = 1;
                if (uo.b1.a(this.f23414x.getPauseDuration() * 1000, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f23415y.R = false;
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$18", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23416w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23417x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23418y;

        /* renamed from: z  reason: collision with root package name */
        public int f23419z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ jf.p0 f23420w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23421x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jf.p0 p0Var, StreamEmomoActivity streamEmomoActivity) {
                super(0);
                this.f23420w = p0Var;
                this.f23421x = streamEmomoActivity;
            }

            public final void a() {
                be.d0.Q0.a(this.f23420w).A3(this.f23421x.a3(), "CollabReconnectingDialog");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public k0(ao.d<? super k0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x006b, B:23:0x006f, B:25:0x0079), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23419z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23418y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23417x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23416w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L94
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.h r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.i4(r10)
                wo.x r3 = r10.z()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L94
                r4 = r10
                r10 = r9
            L3d:
                r10.f23416w = r4     // Catch: java.lang.Throwable -> L94
                r10.f23417x = r3     // Catch: java.lang.Throwable -> L94
                r10.f23418y = r1     // Catch: java.lang.Throwable -> L94
                r10.f23419z = r2     // Catch: java.lang.Throwable -> L94
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L94
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L91
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L91
                if (r10 == 0) goto L8b
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L91
                jf.p0 r10 = (jf.p0) r10     // Catch: java.lang.Throwable -> L91
                java.lang.String r6 = "CollabMatchingWaitingDialog"
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.N4(r5, r6)     // Catch: java.lang.Throwable -> L91
                java.lang.String r6 = "CollabReconnectingDialog"
                if (r10 != 0) goto L6f
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.N4(r5, r6)     // Catch: java.lang.Throwable -> L91
                goto L85
            L6f:
                androidx.fragment.app.FragmentManager r7 = r5.a3()     // Catch: java.lang.Throwable -> L91
                androidx.fragment.app.Fragment r6 = r7.e0(r6)     // Catch: java.lang.Throwable -> L91
                if (r6 != 0) goto L85
                com.dena.mirrorman.util.FragmentRunner r6 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.q4(r5)     // Catch: java.lang.Throwable -> L91
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$k0$a r7 = new com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$k0$a     // Catch: java.lang.Throwable -> L91
                r7.<init>(r10, r5)     // Catch: java.lang.Throwable -> L91
                r6.c(r7)     // Catch: java.lang.Throwable -> L91
            L85:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L8b:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L91:
                r10 = move-exception
                r3 = r4
                goto L95
            L94:
                r10 = move-exception
            L95:
                throw r10     // Catch: java.lang.Throwable -> L96
            L96:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$15", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public /* synthetic */ Object A;

        /* renamed from: w  reason: collision with root package name */
        public Object f23422w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23423x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23424y;

        /* renamed from: z  reason: collision with root package name */
        public int f23425z;

        /* loaded from: classes2.dex */
        public static final class a extends FragmentManager.j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23426a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f23427b;

            @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$15$1$1$onFragmentDetached$1", f = "StreamEmomoActivity.kt", l = {1198}, m = "invokeSuspend")
            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$k1$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0199a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                /* renamed from: w  reason: collision with root package name */
                public int f23428w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ StreamEmomoActivity f23429x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0199a(StreamEmomoActivity streamEmomoActivity, ao.d<? super C0199a> dVar) {
                    super(2, dVar);
                    this.f23429x = streamEmomoActivity;
                }

                @Override // co.a
                public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                    return new C0199a(this.f23429x, dVar);
                }

                @Override // io.p
                public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                    return ((C0199a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    Object c10 = bo.c.c();
                    int i10 = this.f23428w;
                    if (i10 == 0) {
                        wn.m.b(obj);
                        this.f23428w = 1;
                        if (uo.b1.a(1500L, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    this.f23429x.e5();
                    return wn.v.f59242a;
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity, uo.q0 q0Var) {
                this.f23426a = streamEmomoActivity;
                this.f23427b = q0Var;
            }

            @Override // androidx.fragment.app.FragmentManager.j
            public void e(FragmentManager fragmentManager, Fragment fragment) {
                jo.p.h(fragmentManager, "fragmentManager");
                jo.p.h(fragment, "fragment");
                super.e(fragmentManager, fragment);
                if ((fragment instanceof be.v1) || (fragment instanceof be.u1)) {
                    Fragment d02 = this.f23426a.a3().d0(xb.o.M);
                    gf.w wVar = d02 instanceof gf.w ? (gf.w) d02 : null;
                    if (wVar != null) {
                        wVar.u3();
                    }
                    ac.g gVar = this.f23426a.P;
                    if (gVar == null) {
                        jo.p.v("binding");
                        gVar = null;
                    }
                    gVar.f856b0.j();
                    ac.g gVar2 = this.f23426a.P;
                    if (gVar2 == null) {
                        jo.p.v("binding");
                        gVar2 = null;
                    }
                    gVar2.f855a0.setVisibility(0);
                    uo.l.d(this.f23427b, null, null, new C0199a(this.f23426a, null), 3, null);
                    this.f23426a.a3().n1(this);
                }
            }
        }

        public k1(ao.d<? super k1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            k1 k1Var = new k1(dVar);
            k1Var.A = obj;
            return k1Var;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:16:0x0062, B:18:0x006b, B:21:0x0079, B:22:0x007d, B:24:0x0092, B:27:0x0098, B:28:0x009b, B:30:0x00a1, B:32:0x00a6, B:34:0x00b7, B:36:0x00d6, B:35:0x00c7), top: B:47:0x0062 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:47:0x0062). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.k1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class k2 extends jo.q implements io.l<View, wn.v> {
        public k2() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EventBannerResponse eventBannerResponse = StreamEmomoActivity.this.M0;
            if (eventBannerResponse != null) {
                StreamEmomoActivity.this.U5(eventBannerResponse, EventBannerWhere.CAST_LOWER_RIGHT);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k3 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23431w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23432x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23433y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23431w = componentCallbacks;
            this.f23432x = aVar;
            this.f23433y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f23431w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f23432x, this.f23433y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$doPoseAndSnapShot$2", f = "StreamEmomoActivity.kt", l = {2070}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23434w;

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
            int i10 = this.f23434w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23434w = 1;
                if (uo.b1.a(750L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StreamEmomoActivity.this.W6("EMOMO_SHUTTER_EFFECT_KEY_DRESS_UP");
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$19", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23436w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23437x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23438y;

        /* renamed from: z  reason: collision with root package name */
        public int f23439z;

        public l0(ao.d<? super l0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f, B:24:0x007b, B:28:0x0089), top: B:39:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:39:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f23439z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f23438y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f23437x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f23436w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L9b
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r9 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.h r9 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.i4(r9)
                wo.x r3 = r9.r()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r9 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9b
                r4 = r9
                r9 = r8
            L3d:
                r9.f23436w = r4     // Catch: java.lang.Throwable -> L9b
                r9.f23437x = r3     // Catch: java.lang.Throwable -> L9b
                r9.f23438y = r1     // Catch: java.lang.Throwable -> L9b
                r9.f23439z = r2     // Catch: java.lang.Throwable -> L9b
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L9b
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L98
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L98
                r6 = 0
                if (r9 == 0) goto L92
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L98
                jf.h r9 = (jf.h) r9     // Catch: java.lang.Throwable -> L98
                ac.g r9 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r5)     // Catch: java.lang.Throwable -> L98
                if (r9 != 0) goto L6e
                java.lang.String r9 = "binding"
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L98
                goto L6f
            L6e:
                r6 = r9
            L6f:
                androidx.appcompat.widget.AppCompatImageView r9 = r6.f863i0     // Catch: java.lang.Throwable -> L98
                nf.k r6 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.p4(r5)     // Catch: java.lang.Throwable -> L98
                boolean r6 = r6.w()     // Catch: java.lang.Throwable -> L98
                if (r6 == 0) goto L87
                nf.h r6 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.i4(r5)     // Catch: java.lang.Throwable -> L98
                boolean r6 = r6.E()     // Catch: java.lang.Throwable -> L98
                if (r6 != 0) goto L87
                r6 = 0
                goto L89
            L87:
                r6 = 8
            L89:
                r9.setVisibility(r6)     // Catch: java.lang.Throwable -> L98
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L92:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L98:
                r9 = move-exception
                r3 = r4
                goto L9c
            L9b:
                r9 = move-exception
            L9c:
                throw r9     // Catch: java.lang.Throwable -> L9d
            L9d:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$16", f = "StreamEmomoActivity.kt", l = {1210}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23440w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f23441x;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MutualGiftReceiveRewardResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23443w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ uo.q0 f23444x;

            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$l1$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0200a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ tb.a f23445w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ StreamEmomoActivity f23446x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0200a(tb.a aVar, StreamEmomoActivity streamEmomoActivity) {
                    super(0);
                    this.f23445w = aVar;
                    this.f23446x = streamEmomoActivity;
                }

                public final void a() {
                    this.f23445w.a().z3(this.f23446x.a3(), this.f23445w.b());
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            /* loaded from: classes2.dex */
            public static final class b extends FragmentManager.j {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ tb.a f23447a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ uo.q0 f23448b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ StreamEmomoActivity f23449c;

                @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$16$1$emit$3$onFragmentDetached$1", f = "StreamEmomoActivity.kt", l = {1222}, m = "invokeSuspend")
                /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$l1$a$b$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0201a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

                    /* renamed from: w  reason: collision with root package name */
                    public int f23450w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ StreamEmomoActivity f23451x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0201a(StreamEmomoActivity streamEmomoActivity, ao.d<? super C0201a> dVar) {
                        super(2, dVar);
                        this.f23451x = streamEmomoActivity;
                    }

                    @Override // co.a
                    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                        return new C0201a(this.f23451x, dVar);
                    }

                    @Override // io.p
                    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                        return ((C0201a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
                    }

                    @Override // co.a
                    public final Object invokeSuspend(Object obj) {
                        Object c10 = bo.c.c();
                        int i10 = this.f23450w;
                        if (i10 == 0) {
                            wn.m.b(obj);
                            this.f23450w = 1;
                            if (uo.b1.a(1500L, this) == c10) {
                                return c10;
                            }
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            wn.m.b(obj);
                        }
                        this.f23451x.e5();
                        return wn.v.f59242a;
                    }
                }

                public b(tb.a aVar, uo.q0 q0Var, StreamEmomoActivity streamEmomoActivity) {
                    this.f23447a = aVar;
                    this.f23448b = q0Var;
                    this.f23449c = streamEmomoActivity;
                }

                @Override // androidx.fragment.app.FragmentManager.j
                public void e(FragmentManager fragmentManager, Fragment fragment) {
                    jo.p.h(fragmentManager, "fragmentManager");
                    jo.p.h(fragment, "fragment");
                    super.e(fragmentManager, fragment);
                    if (jo.p.c(fragment.W0(), this.f23447a.b())) {
                        uo.l.d(this.f23448b, null, null, new C0201a(this.f23449c, null), 3, null);
                        this.f23449c.a3().n1(this);
                    }
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity, uo.q0 q0Var) {
                this.f23443w = streamEmomoActivity;
                this.f23444x = q0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MutualGiftReceiveRewardResponse mutualGiftReceiveRewardResponse, ao.d<? super wn.v> dVar) {
                tb.a e02 = this.f23443w.y5().e0(mutualGiftReceiveRewardResponse.getStreamer(), mutualGiftReceiveRewardResponse.getViewer(), mutualGiftReceiveRewardResponse.getReceivedReward());
                this.f23443w.f23219f0.c(new C0200a(e02, this.f23443w));
                this.f23443w.a3().X0(new b(e02, this.f23444x, this.f23443w), false);
                return wn.v.f59242a;
            }
        }

        public l1(ao.d<? super l1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            l1 l1Var = new l1(dVar);
            l1Var.f23441x = obj;
            return l1Var;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23440w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MutualGiftReceiveRewardResponse> u02 = StreamEmomoActivity.this.l5().u0();
                a aVar = new a(StreamEmomoActivity.this, (uo.q0) this.f23441x);
                this.f23440w = 1;
                if (u02.a(aVar, this) == c10) {
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
    public static final class l2 extends jo.q implements io.l<View, wn.v> {
        public l2() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            EventBannerResponse eventBannerResponse = StreamEmomoActivity.this.L0;
            if (eventBannerResponse != null) {
                StreamEmomoActivity.this.U5(eventBannerResponse, EventBannerWhere.CAST_LOWER_RIGHT);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l3 extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23453w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23454x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23455y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23453w = componentCallbacks;
            this.f23454x = aVar;
            this.f23455y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f23453w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f23454x, this.f23455y);
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
            return StreamEmomoActivity.this.getCacheDir() + "/emomo.png";
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$2", f = "StreamEmomoActivity.kt", l = {365}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23457w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23459w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23459w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f23459w.m5().k();
                this.f23459w.m5().i();
                return wn.v.f59242a;
            }
        }

        public m0(ao.d<? super m0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23457w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> finishedMiniGameFlow = StreamEmomoActivity.this.J5().getFinishedMiniGameFlow();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23457w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$17", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23460w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23461x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23462y;

        /* renamed from: z  reason: collision with root package name */
        public int f23463z;

        public m1(ao.d<? super m1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #0 {all -> 0x00c6, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:20:0x0067, B:22:0x0076, B:24:0x007c, B:25:0x0080, B:12:0x0041, B:27:0x0088, B:29:0x008e, B:31:0x0093, B:32:0x009d, B:34:0x00a3, B:35:0x00a7, B:37:0x00af, B:39:0x00b5, B:41:0x00ba, B:11:0x0037), top: B:51:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Object r0 = bo.c.c()
                int r2 = r1.f23463z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f23462y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f23461x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f23460w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r5 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r5
                wn.m.b(r19)     // Catch: java.lang.Throwable -> Lc6
                r7 = r19
                r6 = r1
                goto L50
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L28:
                wn.m.b(r19)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r2 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r2 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r2)
                wo.x r4 = r2.W()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r2 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> Lc6
                r6 = r1
                r17 = r5
                r5 = r2
                r2 = r17
            L41:
                r6.f23460w = r5     // Catch: java.lang.Throwable -> Lc6
                r6.f23461x = r4     // Catch: java.lang.Throwable -> Lc6
                r6.f23462y = r2     // Catch: java.lang.Throwable -> Lc6
                r6.f23463z = r3     // Catch: java.lang.Throwable -> Lc6
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> Lc6
                if (r7 != r0) goto L50
                return r0
            L50:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lc6
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lc6
                r8 = 0
                if (r7 == 0) goto Lc0
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> Lc6
                com.dena.mirrorman.net.bcsvr.response.EventFeverState r7 = (com.dena.mirrorman.net.bcsvr.response.EventFeverState) r7     // Catch: java.lang.Throwable -> Lc6
                boolean r9 = r7.isFever()     // Catch: java.lang.Throwable -> Lc6
                java.lang.String r10 = "binding"
                if (r9 == 0) goto L9d
                long r11 = r7.getFeverEndsAt()     // Catch: java.lang.Throwable -> Lc6
                long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc6
                r15 = 1000(0x3e8, double:4.94E-321)
                long r13 = r13 / r15
                int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r9 <= 0) goto L9d
                ac.g r9 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r5)     // Catch: java.lang.Throwable -> Lc6
                if (r9 != 0) goto L80
                jo.p.v(r10)     // Catch: java.lang.Throwable -> Lc6
                r9 = r8
            L80:
                com.dena.mirrorman.customview.GiftGachaView r9 = r9.f856b0     // Catch: java.lang.Throwable -> Lc6
                int r9 = r9.getVisibility()     // Catch: java.lang.Throwable -> Lc6
                if (r9 != 0) goto L41
                ac.g r9 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r5)     // Catch: java.lang.Throwable -> Lc6
                if (r9 != 0) goto L92
                jo.p.v(r10)     // Catch: java.lang.Throwable -> Lc6
                goto L93
            L92:
                r8 = r9
            L93:
                com.dena.mirrorman.customview.GiftGachaView r8 = r8.f856b0     // Catch: java.lang.Throwable -> Lc6
                long r9 = r7.getFeverEndsAt()     // Catch: java.lang.Throwable -> Lc6
                r8.n(r9)     // Catch: java.lang.Throwable -> Lc6
                goto L41
            L9d:
                ac.g r7 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r5)     // Catch: java.lang.Throwable -> Lc6
                if (r7 != 0) goto La7
                jo.p.v(r10)     // Catch: java.lang.Throwable -> Lc6
                r7 = r8
            La7:
                com.dena.mirrorman.customview.GiftGachaView r7 = r7.f856b0     // Catch: java.lang.Throwable -> Lc6
                int r7 = r7.getVisibility()     // Catch: java.lang.Throwable -> Lc6
                if (r7 != 0) goto L41
                ac.g r7 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r5)     // Catch: java.lang.Throwable -> Lc6
                if (r7 != 0) goto Lb9
                jo.p.v(r10)     // Catch: java.lang.Throwable -> Lc6
                goto Lba
            Lb9:
                r8 = r7
            Lba:
                com.dena.mirrorman.customview.GiftGachaView r7 = r8.f856b0     // Catch: java.lang.Throwable -> Lc6
                r7.f()     // Catch: java.lang.Throwable -> Lc6
                goto L41
            Lc0:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            Lc6:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> Lc9
            Lc9:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.m1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m2 extends jo.q implements io.l<View, wn.v> {
        public m2() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            StreamEmomoActivity streamEmomoActivity = StreamEmomoActivity.this;
            streamEmomoActivity.startActivity(streamEmomoActivity.y5().D(StreamEmomoActivity.this));
            MRLogger B5 = StreamEmomoActivity.this.B5();
            MRLog.Companion companion = MRLog.Companion;
            StreamEmomoActivity streamEmomoActivity2 = StreamEmomoActivity.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_LISTING_ICON_TAP);
            builder.setPayload(xn.s.p(wn.q.a("page_id", Referer.BROADCAST_AVATAR), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity2.L5().x()), wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity2.A5().b())));
            B5.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m3 extends jo.q implements io.a<od.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23465w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23466x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23465w = componentCallbacks;
            this.f23466x = aVar;
            this.f23467y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.f] */
        @Override // io.a
        public final od.f invoke() {
            ComponentCallbacks componentCallbacks = this.f23465w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.f.class), this.f23466x, this.f23467y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<wn.v> {
        public n() {
            super(0);
        }

        public final void a() {
            StreamEmomoActivity.this.n6("GroupShotSnapFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$20", f = "StreamEmomoActivity.kt", l = {590}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23469w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MultiEmomoGiftAnimationLogInfo> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23471w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23471w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, ao.d<? super wn.v> dVar) {
                MRLogger B5 = this.f23471w.B5();
                MRLog.Companion companion = MRLog.Companion;
                StreamEmomoActivity streamEmomoActivity = this.f23471w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MULTI_EMOMO_GIFT_LOAD);
                builder.setTargetId(multiEmomoGiftAnimationLogInfo.getGiftEffectTrigger());
                xm.e eVar = new xm.e();
                HashMap hashMap = new HashMap();
                hashMap.put("live_sent_gift_id", multiEmomoGiftAnimationLogInfo.getLiveSentGiftId());
                hashMap.put("is_loaded", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap)), wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity.A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity.M5().T4())));
                B5.sendLog(builder.build());
                return vVar;
            }
        }

        public n0(ao.d<? super n0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23469w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MultiEmomoGiftAnimationLogInfo> multiEmomoGiftAnimationStartedFlow = StreamEmomoActivity.this.J5().getMultiEmomoGiftAnimationStartedFlow();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23469w = 1;
                if (multiEmomoGiftAnimationStartedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$18", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23472w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23473x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23474y;

        /* renamed from: z  reason: collision with root package name */
        public int f23475z;

        public n1(ao.d<? super n1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:16:0x0053, B:18:0x005c, B:22:0x0086, B:25:0x0091, B:27:0x009a, B:29:0x00a0, B:31:0x00a6), top: B:42:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:42:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.n1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class n2 extends jo.q implements io.a<rf.f> {

        /* renamed from: w  reason: collision with root package name */
        public static final n2 f23476w = new n2();

        public n2() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final rf.f invoke() {
            return (rf.f) new t0.d().a(rf.f.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n3 extends jo.q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23477w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23478x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23479y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23477w = componentCallbacks;
            this.f23478x = aVar;
            this.f23479y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            ComponentCallbacks componentCallbacks = this.f23477w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.h.class), this.f23478x, this.f23479y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<wn.v> {
        public o() {
            super(0);
        }

        public final void a() {
            StreamEmomoActivity.this.n6("GroupShotFinishFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$21", f = "StreamEmomoActivity.kt", l = {610}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23481w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MultiEmomoGiftAnimationErrorLogInfo> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23483w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23483w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MultiEmomoGiftAnimationErrorLogInfo multiEmomoGiftAnimationErrorLogInfo, ao.d<? super wn.v> dVar) {
                MRLogger B5 = this.f23483w.B5();
                MRLog.Companion companion = MRLog.Companion;
                StreamEmomoActivity streamEmomoActivity = this.f23483w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MULTI_EMOMO_GIFT_LOAD);
                builder.setTargetId(multiEmomoGiftAnimationErrorLogInfo.getMultiEmomoGiftAnimationLogInfo().getGiftEffectTrigger());
                xm.e eVar = new xm.e();
                HashMap hashMap = new HashMap();
                hashMap.put("live_sent_gift_id", multiEmomoGiftAnimationErrorLogInfo.getMultiEmomoGiftAnimationLogInfo().getLiveSentGiftId());
                hashMap.put("is_loaded", "0");
                hashMap.put(MRLog.PAYLOAD_KEY_ERROR, multiEmomoGiftAnimationErrorLogInfo.getError());
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap)), wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity.A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity.M5().T4()), wn.q.a(MRLog.PAYLOAD_KEY_ERROR, multiEmomoGiftAnimationErrorLogInfo.getError())));
                B5.sendLog(builder.build());
                return vVar;
            }
        }

        public o0(ao.d<? super o0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23481w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MultiEmomoGiftAnimationErrorLogInfo> multiEmomoGiftAnimationFailedFlow = StreamEmomoActivity.this.J5().getMultiEmomoGiftAnimationFailedFlow();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23481w = 1;
                if (multiEmomoGiftAnimationFailedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$19", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23484w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23485x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23486y;

        /* renamed from: z  reason: collision with root package name */
        public int f23487z;

        public o1(ao.d<? super o1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x0076, B:33:0x0086, B:34:0x0091, B:36:0x0095, B:31:0x0082, B:28:0x007c, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23487z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23486y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23485x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23484w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La7
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r10)
                wo.x r3 = r10.b0()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La7
                r4 = r10
                r10 = r9
            L3d:
                r10.f23484w = r4     // Catch: java.lang.Throwable -> La7
                r10.f23485x = r3     // Catch: java.lang.Throwable -> La7
                r10.f23486y = r1     // Catch: java.lang.Throwable -> La7
                r10.f23487z = r2     // Catch: java.lang.Throwable -> La7
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La7
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La4
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L9e
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La4
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> La4
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> La4
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> La4
            L6e:
                if (r6 == 0) goto L76
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> La4
                goto L98
            L76:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L7c
                r6 = r2
                goto L7e
            L7c:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> La4
            L7e:
                if (r6 == 0) goto L82
                r6 = r2
                goto L84
            L82:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> La4
            L84:
                if (r6 == 0) goto L91
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La4
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> La4
                goto L98
            L91:
                boolean r10 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L98
                of.n.z(r5)     // Catch: java.lang.Throwable -> La4
            L98:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9e:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La4:
                r10 = move-exception
                r3 = r4
                goto La8
            La7:
                r10 = move-exception
            La8:
                throw r10     // Catch: java.lang.Throwable -> La9
            La9:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.o1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class o2 implements Animation.AnimationListener {
        public o2() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            StreamEmomoActivity.this.O5();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class o3 extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23489w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23490x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23491y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23489w = componentCallbacks;
            this.f23490x = aVar;
            this.f23491y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f23489w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f23490x, this.f23491y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<wn.v> {
        public p() {
            super(0);
        }

        public final void a() {
            androidx.fragment.app.z k10 = StreamEmomoActivity.this.a3().k();
            ac.g gVar = StreamEmomoActivity.this.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            k10.s(gVar.f862h0.getId(), hc.s.f35257z0.a(Referer.BROADCAST_AVATAR), "GroupShotFinishFragment").i();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$22", f = "StreamEmomoActivity.kt", l = {632}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23493w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MultiEmomoGiftAnimationLogInfo> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23495w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23495w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, ao.d<? super wn.v> dVar) {
                MRLogger B5 = this.f23495w.B5();
                MRLog.Companion companion = MRLog.Companion;
                StreamEmomoActivity streamEmomoActivity = this.f23495w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MULTI_EMOMO_GIFT_MOVIE_FINISHED);
                builder.setTargetId(multiEmomoGiftAnimationLogInfo.getGiftEffectTrigger());
                xm.e eVar = new xm.e();
                HashMap hashMap = new HashMap();
                hashMap.put("live_sent_gift_id", multiEmomoGiftAnimationLogInfo.getLiveSentGiftId());
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap)), wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity.A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity.M5().T4())));
                B5.sendLog(builder.build());
                return vVar;
            }
        }

        public p0(ao.d<? super p0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23493w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MultiEmomoGiftAnimationLogInfo> multiEmomoGiftAnimationFinishedFlow = StreamEmomoActivity.this.J5().getMultiEmomoGiftAnimationFinishedFlow();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23493w = 1;
                if (multiEmomoGiftAnimationFinishedFlow.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$20", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23496w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23497x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23498y;

        /* renamed from: z  reason: collision with root package name */
        public int f23499z;

        public p1(ao.d<? super p1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x009d, B:22:0x00a3), top: B:33:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:33:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.p1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class p2 extends WebViewClient {
        public p2() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            jo.p.h(webView, "view");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("webview redirect url:");
            jo.p.e(str);
            sb2.append(str);
            g9.a.g(sb2.toString());
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            if ((so.n.C(str, "http:", false, 2, null) || so.n.C(str, "https:", false, 2, null)) && StreamEmomoActivity.this.E5().checkDomainWhiteList(host)) {
                webView.loadUrl(str);
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            if (of.n.f45411a.d(StreamEmomoActivity.this, intent)) {
                StreamEmomoActivity.this.startActivity(intent);
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p3 extends jo.q implements io.a<hf.s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23501w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23502x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23503y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p3(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23501w = componentCallbacks;
            this.f23502x = aVar;
            this.f23503y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.s, java.lang.Object] */
        @Override // io.a
        public final hf.s invoke() {
            ComponentCallbacks componentCallbacks = this.f23501w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.s.class), this.f23502x, this.f23503y);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity", f = "StreamEmomoActivity.kt", l = {2667, 2677, 2687, 2697, 2702}, m = "handleAfterGiftAnimationDialogsShowAsync")
    /* loaded from: classes2.dex */
    public static final class q extends co.d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f23504w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23505x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f23506y;

        public q(ao.d<? super q> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f23506y = obj;
            this.A |= Integer.MIN_VALUE;
            return StreamEmomoActivity.this.N5(null, this);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$23", f = "StreamEmomoActivity.kt", l = {651}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23508w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23510w;

            @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$23$1", f = "StreamEmomoActivity.kt", l = {652}, m = "emit")
            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$q0$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0202a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f23511w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f23512x;

                /* renamed from: z  reason: collision with root package name */
                public int f23514z;

                public C0202a(ao.d<? super C0202a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f23512x = obj;
                    this.f23514z |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23510w = streamEmomoActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(wn.v r6, ao.d<? super wn.v> r7) {
                /*
                    r5 = this;
                    boolean r6 = r7 instanceof com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.q0.a.C0202a
                    if (r6 == 0) goto L13
                    r6 = r7
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$q0$a$a r6 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.q0.a.C0202a) r6
                    int r0 = r6.f23514z
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r6.f23514z = r0
                    goto L18
                L13:
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$q0$a$a r6 = new com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$q0$a$a
                    r6.<init>(r7)
                L18:
                    java.lang.Object r7 = r6.f23512x
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r6.f23514z
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2d
                    java.lang.Object r6 = r6.f23511w
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$q0$a r6 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.q0.a) r6
                    wn.m.b(r7)
                    goto L46
                L2d:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L35:
                    wn.m.b(r7)
                    r3 = 200(0xc8, double:9.9E-322)
                    r6.f23511w = r5
                    r6.f23514z = r2
                    java.lang.Object r6 = uo.b1.a(r3, r6)
                    if (r6 != r0) goto L45
                    return r0
                L45:
                    r6 = r5
                L46:
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r7 = r6.f23510w
                    nf.c r7 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r7)
                    androidx.lifecycle.LiveData r7 = r7.l0()
                    java.lang.Object r7 = r7.f()
                    java.util.List r7 = (java.util.List) r7
                    r0 = 0
                    r1 = -1
                    if (r7 == 0) goto L75
                    java.util.Iterator r7 = r7.iterator()
                    r2 = r0
                L5f:
                    boolean r3 = r7.hasNext()
                    if (r3 == 0) goto L75
                    java.lang.Object r3 = r7.next()
                    jf.u r3 = (jf.u) r3
                    boolean r3 = r3.p()
                    if (r3 == 0) goto L72
                    goto L76
                L72:
                    int r2 = r2 + 1
                    goto L5f
                L75:
                    r2 = r1
                L76:
                    if (r1 >= r2) goto La2
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r7 = r6.f23510w
                    ac.g r7 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r7)
                    r1 = 0
                    if (r7 != 0) goto L87
                    java.lang.String r7 = "binding"
                    jo.p.v(r7)
                    r7 = r1
                L87:
                    androidx.recyclerview.widget.RecyclerView r7 = r7.R
                    androidx.recyclerview.widget.RecyclerView$p r7 = r7.getLayoutManager()
                    boolean r3 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
                    if (r3 == 0) goto L94
                    r1 = r7
                    androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
                L94:
                    if (r1 == 0) goto L99
                    r1.J2(r2, r0)
                L99:
                    com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r6 = r6.f23510w
                    od.n0 r6 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.Y3(r6)
                    r6.k(r2)
                La2:
                    wn.v r6 = wn.v.f59242a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.q0.a.emit(wn.v, ao.d):java.lang.Object");
            }
        }

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23508w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> f02 = StreamEmomoActivity.this.l5().f0();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23508w = 1;
                if (f02.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$21", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23515w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23516x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23517y;

        /* renamed from: z  reason: collision with root package name */
        public int f23518z;

        public q1(ao.d<? super q1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x0076, B:33:0x0086, B:34:0x0091, B:36:0x0095, B:31:0x0082, B:28:0x007c, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23518z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23517y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23516x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23515w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La7
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r10)
                wo.x r3 = r10.a0()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La7
                r4 = r10
                r10 = r9
            L3d:
                r10.f23515w = r4     // Catch: java.lang.Throwable -> La7
                r10.f23516x = r3     // Catch: java.lang.Throwable -> La7
                r10.f23517y = r1     // Catch: java.lang.Throwable -> La7
                r10.f23518z = r2     // Catch: java.lang.Throwable -> La7
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La7
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La4
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L9e
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La4
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> La4
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> La4
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> La4
            L6e:
                if (r6 == 0) goto L76
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> La4
                goto L98
            L76:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L7c
                r6 = r2
                goto L7e
            L7c:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> La4
            L7e:
                if (r6 == 0) goto L82
                r6 = r2
                goto L84
            L82:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> La4
            L84:
                if (r6 == 0) goto L91
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La4
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> La4
                goto L98
            L91:
                boolean r10 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L98
                of.n.z(r5)     // Catch: java.lang.Throwable -> La4
            L98:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9e:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La4:
                r10 = move-exception
                r3 = r4
                goto La8
            La7:
                r10 = move-exception
            La8:
                throw r10     // Catch: java.lang.Throwable -> La9
            La9:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.q1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class q2 extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f23519w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ StreamEmomoActivity f23520x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q2(String str, StreamEmomoActivity streamEmomoActivity) {
            super(0);
            this.f23519w = str;
            this.f23520x = streamEmomoActivity;
        }

        public final void a() {
            be.r1.R0.a(this.f23519w).z3(this.f23520x.a3(), "EmomoShutterEffectDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q3 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23521w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q3(ComponentActivity componentActivity) {
            super(0);
            this.f23521w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23521w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$hideEventRank$1", f = "StreamEmomoActivity.kt", l = {1850}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23522w;

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
            int i10 = this.f23522w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23522w = 1;
                if (uo.b1.a(4000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            ac.g gVar = StreamEmomoActivity.this.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            gVar.V.setVisibility(8);
            uo.d2 d2Var = StreamEmomoActivity.this.f23224k0;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            StreamEmomoActivity.this.c7();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$3", f = "StreamEmomoActivity.kt", l = {372}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23524w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityScreenshot> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23526w;

            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$r0$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0203a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ UnityScreenshot f23527w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ StreamEmomoActivity f23528x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0203a(UnityScreenshot unityScreenshot, StreamEmomoActivity streamEmomoActivity) {
                    super(0);
                    this.f23527w = unityScreenshot;
                    this.f23528x = streamEmomoActivity;
                }

                public final void a() {
                    je.c.f37722g1.a(Referer.BROADCAST_AVATAR, this.f23527w, this.f23528x.M5().T4(), this.f23528x.M5().t4(), this.f23528x.n5().B0(), true).z3(this.f23528x.a3(), "EmomoRegistrationDialog");
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
                public final /* synthetic */ StreamEmomoActivity f23529w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(StreamEmomoActivity streamEmomoActivity) {
                    super(2);
                    this.f23529w = streamEmomoActivity;
                }

                public final void a(String str, String str2) {
                    jo.p.h(str, "bodyPath");
                    jo.p.h(str2, "facePath");
                    this.f23529w.m5().u(new UpdateClosetImagesRequest(this.f23529w.n5().y0(), str, str2));
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(String str, String str2) {
                    a(str, str2);
                    return wn.v.f59242a;
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23526w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityScreenshot unityScreenshot, ao.d<? super wn.v> dVar) {
                String key = unityScreenshot.getKey();
                if (jo.p.c(key, "EMOMO_GROUP_SHOT_KEY")) {
                    od.n0 i52 = this.f23526w.i5();
                    File f10 = this.f23526w.t5().f().f();
                    jo.p.e(f10);
                    String absolutePath = f10.getAbsolutePath();
                    jo.p.g(absolutePath, "emomoSharedViewModel.bac…File.value!!.absolutePath");
                    i52.q(unityScreenshot, absolutePath, this.f23526w.s5());
                } else if (jo.p.c(key, UnityReceiverKt.EMOMO)) {
                    this.f23526w.f23219f0.c(new C0203a(unityScreenshot, this.f23526w));
                    File f11 = this.f23526w.t5().f().f();
                    if (f11 != null) {
                        StreamEmomoActivity streamEmomoActivity = this.f23526w;
                        Context applicationContext = streamEmomoActivity.getApplicationContext();
                        jo.p.g(applicationContext, "applicationContext");
                        b bVar = new b(streamEmomoActivity);
                        Bitmap decodeFile = BitmapFactory.decodeFile(f11.getAbsolutePath());
                        jo.p.g(decodeFile, "decodeFile(it.absolutePath)");
                        unityScreenshot.saveAvatarImages(applicationContext, bVar, decodeFile);
                    }
                    UnityManager.Companion companion = UnityManager.Companion;
                    UnityManager.setAnimation$default(companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
                    companion.getInstance().restoreCameraDolly();
                }
                return wn.v.f59242a;
            }
        }

        public r0(ao.d<? super r0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23524w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityScreenshot> screenshotCompletedFlow = StreamEmomoActivity.this.J5().getScreenshotCompletedFlow();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23524w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$22", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23530w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23531x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23532y;

        /* renamed from: z  reason: collision with root package name */
        public int f23533z;

        public r1(ao.d<? super r1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00bd, TryCatch #2 {all -> 0x00bd, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x007a, B:26:0x0085, B:28:0x008b, B:31:0x0092, B:32:0x00a2), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23533z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23532y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23531x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23530w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> Lc0
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r10)
                wo.x r3 = r10.F0()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lc0
                r4 = r10
                r10 = r9
            L3d:
                r10.f23530w = r4     // Catch: java.lang.Throwable -> Lc0
                r10.f23531x = r3     // Catch: java.lang.Throwable -> Lc0
                r10.f23532y = r1     // Catch: java.lang.Throwable -> Lc0
                r10.f23533z = r2     // Catch: java.lang.Throwable -> Lc0
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> Lc0
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lbd
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lbd
                if (r10 == 0) goto Lb7
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> Lbd
                wn.v r10 = (wn.v) r10     // Catch: java.lang.Throwable -> Lbd
                ud.j r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.Z3(r5)     // Catch: java.lang.Throwable -> Lbd
                r6 = 0
                r10.T(r6)     // Catch: java.lang.Throwable -> Lbd
                nf.c r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r5)     // Catch: java.lang.Throwable -> Lbd
                androidx.lifecycle.LiveData r10 = r10.N()     // Catch: java.lang.Throwable -> Lbd
                java.lang.Object r10 = r10.f()     // Catch: java.lang.Throwable -> Lbd
                com.dena.mirrorman.net.api.response.AppUserDetailResponse r10 = (com.dena.mirrorman.net.api.response.AppUserDetailResponse) r10     // Catch: java.lang.Throwable -> Lbd
                if (r10 == 0) goto L82
                boolean r7 = r10.getRequireConfirmation()     // Catch: java.lang.Throwable -> Lbd
                if (r7 != r2) goto L82
                r7 = r2
                goto L83
            L82:
                r7 = r6
            L83:
                if (r7 == 0) goto La2
                com.dena.mirrorman.net.api.response.App$AppParams r6 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.j4(r5)     // Catch: java.lang.Throwable -> Lbd
                if (r6 == 0) goto Lb1
                java.lang.String r6 = r6.getAppUserIdLabel()     // Catch: java.lang.Throwable -> Lbd
                if (r6 != 0) goto L92
                goto Lb1
            L92:
                be.j$a r7 = be.j.R0     // Catch: java.lang.Throwable -> Lbd
                be.j r10 = r7.a(r6, r10)     // Catch: java.lang.Throwable -> Lbd
                androidx.fragment.app.FragmentManager r6 = r5.a3()     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r7 = "AppUserIdConfirmDialog"
                r10.z3(r6, r7)     // Catch: java.lang.Throwable -> Lbd
                goto Lb1
            La2:
                ud.j r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.Z3(r5)     // Catch: java.lang.Throwable -> Lbd
                androidx.lifecycle.e0 r10 = r10.C()     // Catch: java.lang.Throwable -> Lbd
                java.lang.Boolean r6 = co.b.a(r6)     // Catch: java.lang.Throwable -> Lbd
                r10.m(r6)     // Catch: java.lang.Throwable -> Lbd
            Lb1:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lb7:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            Lbd:
                r10 = move-exception
                r3 = r4
                goto Lc1
            Lc0:
                r10 = move-exception
            Lc1:
                throw r10     // Catch: java.lang.Throwable -> Lc2
            Lc2:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.r1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class r2 extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23534w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23535x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23536y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23534w = componentCallbacks;
            this.f23535x = aVar;
            this.f23536y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f23534w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.b.class), this.f23535x, this.f23536y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r3 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23537w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23538x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23539y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23540z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r3(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23537w = aVar;
            this.f23538x = aVar2;
            this.f23539y = aVar3;
            this.f23540z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23537w;
            vq.a aVar2 = this.f23538x;
            io.a aVar3 = this.f23539y;
            xq.a aVar4 = this.f23540z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.g.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends f8.c<File> {
        public s() {
        }

        @Override // f8.j
        /* renamed from: a */
        public void e(File file, g8.b<? super File> bVar) {
            jo.p.h(file, "resource");
            StreamEmomoActivity.this.t5().f().p(file);
            StreamEmomoActivity.this.f23234u0 = file;
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class s0 extends jo.q implements io.a<wn.v> {
        public s0() {
            super(0);
        }

        public final void a() {
            tb.a g10 = StreamEmomoActivity.this.y5().g(true);
            g10.a().z3(StreamEmomoActivity.this.a3(), g10.b());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$23", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23543w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23544x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23545y;

        /* renamed from: z  reason: collision with root package name */
        public int f23546z;

        public s1(ao.d<? super s1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:17:0x0054, B:19:0x005c, B:25:0x0071, B:38:0x0098, B:26:0x0077, B:34:0x0087, B:35:0x0091, B:37:0x0095, B:32:0x0083, B:29:0x007d, B:22:0x0068), top: B:51:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23546z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23545y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23544x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23543w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> Lae
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r10)
                wo.x r3 = r10.c0()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lae
                r4 = r10
                r10 = r9
            L3d:
                r10.f23543w = r4     // Catch: java.lang.Throwable -> Lae
                r10.f23544x = r3     // Catch: java.lang.Throwable -> Lae
                r10.f23545y = r1     // Catch: java.lang.Throwable -> Lae
                r10.f23546z = r2     // Catch: java.lang.Throwable -> Lae
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> Lae
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lab
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lab
                if (r10 == 0) goto La5
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> Lab
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> Lab
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lab
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lab
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> Lab
            L6e:
                r7 = 0
                if (r6 == 0) goto L77
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lab
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> Lab
                goto L98
            L77:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Lab
                if (r6 == 0) goto L7d
                r6 = r2
                goto L7f
            L7d:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Lab
            L7f:
                if (r6 == 0) goto L83
                r6 = r2
                goto L85
            L83:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Lab
            L85:
                if (r6 == 0) goto L91
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lab
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> Lab
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> Lab
                goto L98
            L91:
                boolean r10 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lab
                if (r10 == 0) goto L98
                of.n.z(r5)     // Catch: java.lang.Throwable -> Lab
            L98:
                ud.j r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.Z3(r5)     // Catch: java.lang.Throwable -> Lab
                r10.T(r7)     // Catch: java.lang.Throwable -> Lab
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La5:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            Lab:
                r10 = move-exception
                r3 = r4
                goto Laf
            Lae:
                r10 = move-exception
            Laf:
                throw r10     // Catch: java.lang.Throwable -> Lb0
            Lb0:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.s1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class s2 extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23547w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23548x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23549y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23547w = componentCallbacks;
            this.f23548x = aVar;
            this.f23549y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f23547w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.c.class), this.f23548x, this.f23549y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s3 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23550w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s3(ComponentActivity componentActivity) {
            super(0);
            this.f23550w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f23550w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<wn.v> {
        public t() {
            super(0);
        }

        public final void a() {
            StreamEmomoActivity.this.n6("GroupShotSnapFragment");
            hc.r0.Y0.a(Referer.BROADCAST_AVATAR).z3(StreamEmomoActivity.this.a3(), "GroupShotSettingsDialogFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$35", f = "StreamEmomoActivity.kt", l = {810}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23552w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23554w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23554w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(this.f23554w, mRError);
                } else {
                    if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
                        of.n.f45411a.B(this.f23554w, mRError.getMessage(), false);
                    } else if (mRError instanceof MRError.Network) {
                        of.n.z(this.f23554w);
                    }
                }
                od.g p52 = this.f23554w.p5();
                String str = this.f23554w.Q;
                if (str == null) {
                    jo.p.v("liveId");
                    str = null;
                }
                p52.d(Referer.BROADCAST_AVATAR, str, true);
                this.f23554w.n6("CollabMatchingWaitingDialog");
                return wn.v.f59242a;
            }
        }

        public t0(ao.d<? super t0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23552w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> k10 = StreamEmomoActivity.this.q5().k();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23552w = 1;
                if (k10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$24", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23555w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23556x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23557y;

        /* renamed from: z  reason: collision with root package name */
        public int f23558z;

        public t1(ao.d<? super t1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:12:0x0041, B:19:0x006f, B:11:0x0037), top: B:29:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = bo.c.c()
                int r2 = r1.f23558z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f23557y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f23556x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f23555w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r5 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r5
                wn.m.b(r18)     // Catch: java.lang.Throwable -> La1
                r7 = r18
                r6 = r1
                goto L50
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L28:
                wn.m.b(r18)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r2 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r2 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r2)
                wo.x r4 = r2.C0()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r2 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> La1
                r6 = r1
                r16 = r5
                r5 = r2
                r2 = r16
            L41:
                r6.f23555w = r5     // Catch: java.lang.Throwable -> La1
                r6.f23556x = r4     // Catch: java.lang.Throwable -> La1
                r6.f23557y = r2     // Catch: java.lang.Throwable -> La1
                r6.f23558z = r3     // Catch: java.lang.Throwable -> La1
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> La1
                if (r7 != r0) goto L50
                return r0
            L50:
                r8 = 0
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La1
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r7 == 0) goto L9b
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> La1
                wn.v r7 = (wn.v) r7     // Catch: java.lang.Throwable -> La1
                java.lang.String r7 = "jp.co.mixi.monsterstrike"
                kf.m r8 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.v4(r5)     // Catch: java.lang.Throwable -> La1
                java.lang.String r8 = r8.h()     // Catch: java.lang.Throwable -> La1
                boolean r7 = jo.p.c(r7, r8)     // Catch: java.lang.Throwable -> La1
                if (r7 == 0) goto L41
                ie.f$a r8 = ie.f.V0     // Catch: java.lang.Throwable -> La1
                int r7 = xb.r.I2     // Catch: java.lang.Throwable -> La1
                java.lang.String r9 = r5.getString(r7)     // Catch: java.lang.Throwable -> La1
                java.lang.String r7 = "getString(R.string.text_view_game_id_dialog_monst)"
                jo.p.g(r9, r7)     // Catch: java.lang.Throwable -> La1
                int r7 = xb.r.W1     // Catch: java.lang.Throwable -> La1
                java.lang.String r10 = r5.getString(r7)     // Catch: java.lang.Throwable -> La1
                int r7 = xb.r.H     // Catch: java.lang.Throwable -> La1
                java.lang.String r11 = r5.getString(r7)     // Catch: java.lang.Throwable -> La1
                r12 = 0
                r13 = 0
                r14 = 24
                r15 = 0
                ie.f r7 = ie.f.a.b(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> La1
                androidx.fragment.app.FragmentManager r8 = r5.a3()     // Catch: java.lang.Throwable -> La1
                java.lang.String r9 = "open_comment_url"
                r7.z3(r8, r9)     // Catch: java.lang.Throwable -> La1
                goto L41
            L9b:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            La1:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> La4
            La4:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.t1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class t2 extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23559w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23560x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23561y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23559w = componentCallbacks;
            this.f23560x = aVar;
            this.f23561y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f23559w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f23560x, this.f23561y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t3 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23562w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t3(ComponentActivity componentActivity) {
            super(0);
            this.f23562w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23562w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<wn.v> {
        public u() {
            super(0);
        }

        public final void a() {
            hc.r0.Y0.a(Referer.BROADCAST_AVATAR).z3(StreamEmomoActivity.this.a3(), "GroupShotSettingsDialogFragment");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$36", f = "StreamEmomoActivity.kt", l = {822}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23564w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23566w;

            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$u0$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0204a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ StreamEmomoActivity f23567w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0204a(StreamEmomoActivity streamEmomoActivity) {
                    super(0);
                    this.f23567w = streamEmomoActivity;
                }

                public final void a() {
                    this.f23567w.n6("CollabMatchingWaitingDialog");
                    x.a aVar = be.x.O0;
                    String string = this.f23567w.getString(xb.r.text_matching_collab_accept_error);
                    jo.p.g(string, "getString(R.string.text_…hing_collab_accept_error)");
                    aVar.a(string).A3(this.f23567w.a3(), "CollabMatchingRetryDialog");
                    MRLogger B5 = this.f23567w.B5();
                    MRLog.Companion companion = MRLog.Companion;
                    StreamEmomoActivity streamEmomoActivity = this.f23567w;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_START_FAILURE_NOTICE);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_type", "3");
                    wn.v vVar = wn.v.f59242a;
                    builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity.A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity.M5().T4()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                    B5.sendLog(builder.build());
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23566w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f23566w.f23219f0.c(new C0204a(this.f23566w));
                return wn.v.f59242a;
            }
        }

        public u0(ao.d<? super u0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23564w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> j10 = StreamEmomoActivity.this.q5().j();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23564w = 1;
                if (j10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$25", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23568w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23569x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23570y;

        /* renamed from: z  reason: collision with root package name */
        public int f23571z;

        public u1(ao.d<? super u1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x0076, B:33:0x0086, B:34:0x0091, B:36:0x0095, B:31:0x0082, B:28:0x007c, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23571z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23570y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23569x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23568w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La7
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r10)
                wo.x r3 = r10.Z()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La7
                r4 = r10
                r10 = r9
            L3d:
                r10.f23568w = r4     // Catch: java.lang.Throwable -> La7
                r10.f23569x = r3     // Catch: java.lang.Throwable -> La7
                r10.f23570y = r1     // Catch: java.lang.Throwable -> La7
                r10.f23571z = r2     // Catch: java.lang.Throwable -> La7
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La7
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La4
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L9e
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La4
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> La4
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> La4
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> La4
            L6e:
                if (r6 == 0) goto L76
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> La4
                goto L98
            L76:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L7c
                r6 = r2
                goto L7e
            L7c:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> La4
            L7e:
                if (r6 == 0) goto L82
                r6 = r2
                goto L84
            L82:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> La4
            L84:
                if (r6 == 0) goto L91
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La4
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> La4
                goto L98
            L91:
                boolean r10 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L98
                of.n.z(r5)     // Catch: java.lang.Throwable -> La4
            L98:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9e:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La4:
                r10 = move-exception
                r3 = r4
                goto La8
            La7:
                r10 = move-exception
            La8:
                throw r10     // Catch: java.lang.Throwable -> La9
            La9:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.u1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class u2 extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23572w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23573x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23574y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23572w = componentCallbacks;
            this.f23573x = aVar;
            this.f23574y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f23572w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ServerConfig.class), this.f23573x, this.f23574y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u3 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23575w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23576x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23577y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23578z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u3(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23575w = aVar;
            this.f23576x = aVar2;
            this.f23577y = aVar3;
            this.f23578z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23575w;
            vq.a aVar2 = this.f23576x;
            io.a aVar3 = this.f23577y;
            xq.a aVar4 = this.f23578z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.g0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onClickLinkedLiveStreamCommentFragmentListener$1", f = "StreamEmomoActivity.kt", l = {3287}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23579w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f23581y;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<Intent, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23582w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StreamEmomoActivity streamEmomoActivity) {
                super(1);
                this.f23582w = streamEmomoActivity;
            }

            public final void a(Intent intent) {
                jo.p.h(intent, "it");
                this.f23582w.startActivity(intent);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Intent intent) {
                a(intent);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, ao.d<? super v> dVar) {
            super(2, dVar);
            this.f23581y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(this.f23581y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23579w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest D5 = StreamEmomoActivity.this.D5();
                    String str = this.f23581y;
                    this.f23579w = 1;
                    obj = D5.getLiveDetail(Referer.BROADCAST, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StreamEmomoActivity streamEmomoActivity = StreamEmomoActivity.this;
                new ce.x(streamEmomoActivity, new a(streamEmomoActivity)).a((LiveDetailResponse) obj, Referer.BROADCAST_AVATAR);
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$37", f = "StreamEmomoActivity.kt", l = {842}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23583w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23585w;

            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$v0$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0205a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ StreamEmomoActivity f23586w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0205a(StreamEmomoActivity streamEmomoActivity) {
                    super(0);
                    this.f23586w = streamEmomoActivity;
                }

                public final void a() {
                    this.f23586w.n6("CollabMatchingWaitingDialog");
                    x.a aVar = be.x.O0;
                    String string = this.f23586w.getString(xb.r.text_collab_matching_error);
                    jo.p.g(string, "getString(R.string.text_collab_matching_error)");
                    aVar.a(string).A3(this.f23586w.a3(), "CollabMatchingRetryDialog");
                    MRLogger B5 = this.f23586w.B5();
                    MRLog.Companion companion = MRLog.Companion;
                    StreamEmomoActivity streamEmomoActivity = this.f23586w;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_START_FAILURE_NOTICE);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error_type", "2");
                    wn.v vVar = wn.v.f59242a;
                    builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity.A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity.M5().T4()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                    B5.sendLog(builder.build());
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23585w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                od.g p52 = this.f23585w.p5();
                String str = this.f23585w.Q;
                if (str == null) {
                    jo.p.v("liveId");
                    str = null;
                }
                p52.d(Referer.BROADCAST_AVATAR, str, true);
                if (this.f23585w.a3().e0("CollabMatchingWaitingDialog") == null) {
                    return wn.v.f59242a;
                }
                this.f23585w.f23219f0.c(new C0205a(this.f23585w));
                return wn.v.f59242a;
            }
        }

        public v0(ao.d<? super v0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23583w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> l10 = StreamEmomoActivity.this.q5().l();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23583w = 1;
                if (l10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$26", f = "StreamEmomoActivity.kt", l = {3498}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f23587w;

        /* renamed from: x  reason: collision with root package name */
        public Object f23588x;

        /* renamed from: y  reason: collision with root package name */
        public Object f23589y;

        /* renamed from: z  reason: collision with root package name */
        public int f23590z;

        public v1(ao.d<? super v1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x0076, B:33:0x0086, B:34:0x0091, B:36:0x0095, B:31:0x0082, B:28:0x007c, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f23590z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f23589y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f23588x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f23587w
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = (com.dena.mirrativ.streaming.emomo.StreamEmomoActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La7
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                nf.c r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.c4(r10)
                wo.x r3 = r10.Y()
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r10 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La7
                r4 = r10
                r10 = r9
            L3d:
                r10.f23587w = r4     // Catch: java.lang.Throwable -> La7
                r10.f23588x = r3     // Catch: java.lang.Throwable -> La7
                r10.f23589y = r1     // Catch: java.lang.Throwable -> La7
                r10.f23590z = r2     // Catch: java.lang.Throwable -> La7
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La7
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La4
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L9e
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La4
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> La4
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> La4
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> La4
            L6e:
                if (r6 == 0) goto L76
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> La4
                goto L98
            L76:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L7c
                r6 = r2
                goto L7e
            L7c:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> La4
            L7e:
                if (r6 == 0) goto L82
                r6 = r2
                goto L84
            L82:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> La4
            L84:
                if (r6 == 0) goto L91
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La4
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La4
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> La4
                goto L98
            L91:
                boolean r10 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La4
                if (r10 == 0) goto L98
                of.n.z(r5)     // Catch: java.lang.Throwable -> La4
            L98:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9e:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La4:
                r10 = move-exception
                r3 = r4
                goto La8
            La7:
                r10 = move-exception
            La8:
                throw r10     // Catch: java.lang.Throwable -> La9
            La9:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.v1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class v2 extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23591w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23592x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23593y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23591w = componentCallbacks;
            this.f23592x = aVar;
            this.f23593y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f23591w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.r.class), this.f23592x, this.f23593y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v3 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23594w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v3(ComponentActivity componentActivity) {
            super(0);
            this.f23594w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f23594w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCloseCollabMatchingRetryDialogListener$2", f = "StreamEmomoActivity.kt", l = {3426}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23595w;

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
            int i10 = this.f23595w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f23595w = 1;
                if (uo.b1.a(1500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            StreamEmomoActivity.this.e5();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$38", f = "StreamEmomoActivity.kt", l = {865}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23597w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23599w;

            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$w0$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0206a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ String f23600w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0206a(String str) {
                    super(0);
                    this.f23600w = str;
                }

                public final void a() {
                    dq.c.c().l(new nd.d0(this.f23600w, true));
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23599w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f23599w.f23219f0.c(new C0206a(str));
                return wn.v.f59242a;
            }
        }

        public w0(ao.d<? super w0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23597w;
            if (i10 == 0) {
                wn.m.b(obj);
                nf.h0 h0Var = StreamEmomoActivity.this.U;
                if (h0Var == null) {
                    jo.p.v("store");
                    h0Var = null;
                }
                xo.w<String> I = h0Var.I();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23597w = 1;
                if (I.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$27", f = "StreamEmomoActivity.kt", l = {1373}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23601w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.k<? extends String, ? extends MRError>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23603w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23603w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<String, ? extends MRError> kVar, ao.d<? super wn.v> dVar) {
                String a10 = kVar.a();
                MRError b10 = kVar.b();
                if (b10 instanceof MRError.ForceUpdate ? true : jo.p.c(b10, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(this.f23603w, b10);
                } else {
                    ac.g gVar = this.f23603w.P;
                    if (gVar == null) {
                        jo.p.v("binding");
                        gVar = null;
                    }
                    gVar.L.setText(a10);
                    of.n.z(this.f23603w);
                }
                return wn.v.f59242a;
            }
        }

        public w1(ao.d<? super w1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23601w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.k<String, MRError>> d02 = StreamEmomoActivity.this.l5().d0();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23601w = 1;
                if (d02.a(aVar, this) == c10) {
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
    public static final class w2 extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23604w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23605x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23606y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23604w = componentCallbacks;
            this.f23605x = aVar;
            this.f23606y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23604w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f23605x, this.f23606y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w3 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23607w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w3(ComponentActivity componentActivity) {
            super(0);
            this.f23607w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23607w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f23608a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f23609b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f23610c;

        public x(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f23608a = c0Var;
            this.f23609b = liveData;
            this.f23610c = liveData2;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f23608a.f();
            Object f11 = this.f23609b.f();
            Object f12 = this.f23610c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f23608a;
            boolean booleanValue = ((Boolean) f12).booleanValue();
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf(((List) f11).isEmpty() && booleanValue));
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$39", f = "StreamEmomoActivity.kt", l = {873}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23611w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23613w;

            /* renamed from: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$x0$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0207a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ StreamEmomoActivity f23614w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0207a(StreamEmomoActivity streamEmomoActivity) {
                    super(0);
                    this.f23614w = streamEmomoActivity;
                }

                public final void a() {
                    y4.O0.a().z3(this.f23614w.a3(), "ShooterMatchingRequestStartedDialogFragment");
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23613w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f23613w.f23219f0.c(new C0207a(this.f23613w));
                this.f23613w.i5().v(true);
                return wn.v.f59242a;
            }
        }

        public x0(ao.d<? super x0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23611w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> n10 = StreamEmomoActivity.this.G5().n();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23611w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$setupOperationContainer$28$1", f = "StreamEmomoActivity.kt", l = {1401}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23615w;

        public x1(ao.d<? super x1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x01c0 A[Catch: all -> 0x01dd, TryCatch #0 {all -> 0x01dd, blocks: (B:5:0x0012, B:40:0x00ee, B:42:0x00fd, B:46:0x0106, B:48:0x010e, B:49:0x0112, B:52:0x0118, B:54:0x013c, B:59:0x0147, B:67:0x0160, B:71:0x0170, B:73:0x0181, B:74:0x0185, B:76:0x0194, B:78:0x0199, B:79:0x019f, B:83:0x01af, B:85:0x01c0, B:86:0x01c4, B:88:0x01d3, B:90:0x01d8, B:37:0x00d3), top: B:94:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01d3 A[Catch: all -> 0x01dd, TryCatch #0 {all -> 0x01dd, blocks: (B:5:0x0012, B:40:0x00ee, B:42:0x00fd, B:46:0x0106, B:48:0x010e, B:49:0x0112, B:52:0x0118, B:54:0x013c, B:59:0x0147, B:67:0x0160, B:71:0x0170, B:73:0x0181, B:74:0x0185, B:76:0x0194, B:78:0x0199, B:79:0x019f, B:83:0x01af, B:85:0x01c0, B:86:0x01c4, B:88:0x01d3, B:90:0x01d8, B:37:0x00d3), top: B:94:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 480
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.x1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class x2 extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23617w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23618x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23619y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23617w = componentCallbacks;
            this.f23618x = aVar;
            this.f23619y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f23617w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.v.class), this.f23618x, this.f23619y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x3 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f23620w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23621x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23622y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f23623z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x3(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f23620w = aVar;
            this.f23621x = aVar2;
            this.f23622y = aVar3;
            this.f23623z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f23620w;
            vq.a aVar2 = this.f23621x;
            io.a aVar3 = this.f23622y;
            xq.a aVar4 = this.f23623z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class y<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f23624a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f23625b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f23626c;

        public y(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2) {
            this.f23624a = c0Var;
            this.f23625b = liveData;
            this.f23626c = liveData2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
            if (r0 != false) goto L11;
         */
        @Override // androidx.lifecycle.f0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.lang.Object r7) {
            /*
                r6 = this;
                androidx.lifecycle.c0 r7 = r6.f23624a
                java.lang.Object r7 = r7.f()
                androidx.lifecycle.LiveData r0 = r6.f23625b
                java.lang.Object r0 = r0.f()
                androidx.lifecycle.LiveData r1 = r6.f23626c
                java.lang.Object r1 = r1.f()
                if (r7 == 0) goto L68
                if (r0 == 0) goto L68
                if (r1 == 0) goto L68
                androidx.lifecycle.c0 r2 = r6.f23624a
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                java.util.List r0 = (java.util.List) r0
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                r7.booleanValue()
                r7 = 1
                r3 = 0
                if (r1 != 0) goto L60
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L33
            L31:
                r0 = r3
                goto L5d
            L33:
                java.util.Iterator r0 = r0.iterator()
            L37:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                com.dena.mirrorman.net.api.response.user.LiveViewingUser r1 = (com.dena.mirrorman.net.api.response.user.LiveViewingUser) r1
                com.dena.mirrorman.net.api.response.CollabType r4 = r1.getCollabType()
                com.dena.mirrorman.net.api.response.CollabType r5 = com.dena.mirrorman.net.api.response.CollabType.LIVE
                if (r4 != r5) goto L59
                java.lang.Boolean r1 = r1.isStartedCollab()
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                boolean r1 = jo.p.c(r1, r4)
                if (r1 == 0) goto L59
                r1 = r7
                goto L5a
            L59:
                r1 = r3
            L5a:
                if (r1 == 0) goto L37
                r0 = r7
            L5d:
                if (r0 == 0) goto L60
                goto L61
            L60:
                r7 = r3
            L61:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r2.p(r7)
            L68:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.y.d(java.lang.Object):void");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$4", f = "StreamEmomoActivity.kt", l = {409}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23627w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23629w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23629w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f23629w.R6();
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
            Object c10 = bo.c.c();
            int i10 = this.f23627w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> screenshotFailedFlow = StreamEmomoActivity.this.J5().getScreenshotFailedFlow();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23627w = 1;
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

    /* loaded from: classes2.dex */
    public static final class y1 extends jo.q implements io.l<View, wn.v> {
        public y1() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            StreamEmomoActivity.this.W5(false);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class y2 extends jo.q implements io.a<MirrorDatabase> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23631w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23632x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23633y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23631w = componentCallbacks;
            this.f23632x = aVar;
            this.f23633y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.database.MirrorDatabase] */
        @Override // io.a
        public final MirrorDatabase invoke() {
            ComponentCallbacks componentCallbacks = this.f23631w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MirrorDatabase.class), this.f23632x, this.f23633y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y3 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23634w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y3(ComponentActivity componentActivity) {
            super(0);
            this.f23634w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f23634w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class z<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f23635a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f23636b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f23637c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f23638d;

        public z(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3) {
            this.f23635a = c0Var;
            this.f23636b = liveData;
            this.f23637c = liveData2;
            this.f23638d = liveData3;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f23635a.f();
            Object f11 = this.f23636b.f();
            Object f12 = this.f23637c.f();
            Object f13 = this.f23638d.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f23635a;
            boolean booleanValue = ((Boolean) f13).booleanValue();
            boolean booleanValue2 = ((Boolean) f12).booleanValue();
            boolean booleanValue3 = ((Boolean) f11).booleanValue();
            ((Boolean) f10).booleanValue();
            c0Var.p(Boolean.valueOf((!booleanValue3 || booleanValue2 || booleanValue) ? false : true));
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.emomo.StreamEmomoActivity$onCreate$40", f = "StreamEmomoActivity.kt", l = {883}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f23639w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ StreamEmomoActivity f23641w;

            public a(StreamEmomoActivity streamEmomoActivity) {
                this.f23641w = streamEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f23641w.i5().v(false);
                return wn.v.f59242a;
            }
        }

        public z0(ao.d<? super z0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f23639w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> k10 = StreamEmomoActivity.this.G5().k();
                a aVar = new a(StreamEmomoActivity.this);
                this.f23639w = 1;
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

    /* loaded from: classes2.dex */
    public static final class z1 implements TextWatcher {
        public z1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
            if ((r4.length() > 0) == true) goto L7;
         */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                r5 = 1
                r6 = 0
                if (r4 == 0) goto L10
                int r4 = r4.length()
                if (r4 <= 0) goto Lc
                r4 = r5
                goto Ld
            Lc:
                r4 = r6
            Ld:
                if (r4 != r5) goto L10
                goto L11
            L10:
                r5 = r6
            L11:
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                ac.g r4 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r4)
                r7 = 0
                java.lang.String r0 = "binding"
                if (r4 != 0) goto L20
                jo.p.v(r0)
                r4 = r7
            L20:
                androidx.appcompat.widget.AppCompatTextView r4 = r4.P
                r1 = 8
                if (r5 == 0) goto L28
                r2 = r6
                goto L29
            L28:
                r2 = r1
            L29:
                r4.setVisibility(r2)
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                ac.g r4 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r4)
                if (r4 != 0) goto L38
                jo.p.v(r0)
                r4 = r7
            L38:
                androidx.appcompat.widget.AppCompatImageView r4 = r4.B
                if (r5 == 0) goto L3d
                r6 = r1
            L3d:
                r4.setVisibility(r6)
                if (r5 == 0) goto L54
                com.dena.mirrativ.streaming.emomo.StreamEmomoActivity r4 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.this
                ac.g r4 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.a4(r4)
                if (r4 != 0) goto L4e
                jo.p.v(r0)
                goto L4f
            L4e:
                r7 = r4
            L4f:
                androidx.appcompat.widget.AppCompatImageView r4 = r7.C
                r4.setVisibility(r1)
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.z1.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class z2 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f23643w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23644x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23645y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z2(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f23643w = componentCallbacks;
            this.f23644x = aVar;
            this.f23645y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f23643w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f23644x, this.f23645y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z3 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f23646w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z3(ComponentActivity componentActivity) {
            super(0);
            this.f23646w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f23646w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    public StreamEmomoActivity() {
        uo.b0 b10;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.T = wn.g.b(iVar, new b3(this, null, null));
        this.V = wn.g.b(iVar, new i3(this, null, null));
        this.W = wn.g.b(iVar, new j3(this, null, null));
        this.X = wn.g.b(iVar, new k3(this, null, null));
        this.Y = wn.g.b(iVar, new l3(this, null, null));
        this.Z = wn.g.b(iVar, new m3(this, null, null));
        this.f23214a0 = wn.g.b(iVar, new n3(this, null, null));
        this.f23215b0 = new androidx.lifecycle.s0(jo.f0.b(nf.f.class), new y3(this), new x3(new w3(this), null, null, gq.a.a(this)));
        this.f23216c0 = wn.g.b(iVar, new o3(this, null, null));
        this.f23217d0 = wn.g.b(iVar, new p3(this, null, null));
        this.f23219f0 = new FragmentRunner(this);
        this.f23220g0 = new androidx.lifecycle.s0(jo.f0.b(je.e.class), new b4(this), new a4(new z3(this), null, null, gq.a.a(this)));
        this.f23221h0 = wn.g.a(n2.f23476w);
        this.f23225l0 = nd.c.NONE.c();
        this.f23227n0 = uo.b3.b(null, 1, null);
        this.f23228o0 = wn.g.b(iVar, new r2(this, null, null));
        this.f23229p0 = wn.g.b(iVar, new s2(this, null, null));
        this.f23230q0 = wn.g.b(iVar, new t2(this, null, null));
        this.f23231r0 = new androidx.lifecycle.s0(jo.f0.b(ud.j.class), new e4(this), new d4(new c4(this), null, null, gq.a.a(this)));
        this.f23232s0 = wn.g.b(iVar, new u2(this, null, null));
        this.f23235v0 = wn.g.b(iVar, new v2(this, null, null));
        this.f23236w0 = wn.g.b(iVar, new w2(this, null, null));
        this.f23237x0 = wn.g.b(iVar, new x2(this, null, null));
        this.f23238y0 = wn.g.b(iVar, new y2(this, null, null));
        this.f23239z0 = wn.g.b(iVar, new z2(this, null, null));
        this.A0 = wn.g.b(iVar, new a3(this, null, null));
        this.B0 = wn.g.b(iVar, new c3(this, null, null));
        this.C0 = new androidx.lifecycle.s0(jo.f0.b(nf.g.class), new s3(this), new r3(new q3(this), null, null, gq.a.a(this)));
        this.D0 = wn.g.b(iVar, new d3(this, null, null));
        this.E0 = new androidx.lifecycle.s0(jo.f0.b(nf.g0.class), new v3(this), new u3(new t3(this), null, null, gq.a.a(this)));
        this.F0 = wn.g.b(iVar, new e3(this, null, null));
        this.G0 = wn.g.b(iVar, new f3(this, null, null));
        this.H0 = wn.g.b(iVar, new g3(this, null, null));
        this.I0 = wn.g.b(iVar, new h3(this, null, null));
        b10 = uo.i2.b(null, 1, null);
        this.J0 = b10;
        this.N0 = wn.g.a(new m());
        this.P0 = new androidx.recyclerview.widget.s();
    }

    public static final boolean A6(StreamEmomoActivity streamEmomoActivity, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(streamEmomoActivity, "this$0");
        if (i10 == 4) {
            ac.g gVar = streamEmomoActivity.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            streamEmomoActivity.m6(gVar.L.getText().toString());
            streamEmomoActivity.d5();
            return true;
        }
        return false;
    }

    public static final void B6(StreamEmomoActivity streamEmomoActivity, View view) {
        jo.p.h(streamEmomoActivity, "this$0");
        ac.g gVar = streamEmomoActivity.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        streamEmomoActivity.m6(gVar.L.getText().toString());
        streamEmomoActivity.d5();
    }

    public static final void C6(StreamEmomoActivity streamEmomoActivity, EventNoticeResponse eventNoticeResponse) {
        Object obj;
        Object obj2;
        boolean z10;
        boolean z11;
        jo.p.h(streamEmomoActivity, "this$0");
        if (eventNoticeResponse != null) {
            ac.g gVar = streamEmomoActivity.P;
            ac.g gVar2 = null;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            SwitchableEventBannerIconView switchableEventBannerIconView = gVar.A0;
            List<EventBannerResponse> banners = eventNoticeResponse.getBanners();
            ArrayList arrayList = new ArrayList(xn.t.u(banners, 10));
            for (EventBannerResponse eventBannerResponse : banners) {
                arrayList.add(wn.q.a(eventBannerResponse.getIconUrl(), Boolean.valueOf(eventBannerResponse.isFocus())));
            }
            switchableEventBannerIconView.setEventBannerImageUrls(arrayList);
            ac.g gVar3 = streamEmomoActivity.P;
            if (gVar3 == null) {
                jo.p.v("binding");
                gVar3 = null;
            }
            gVar3.A0.setOnSingleTapUpListener(new b2(eventNoticeResponse));
            EventBannerResponse eventBannerResponse2 = (EventBannerResponse) xn.a0.Z(eventNoticeResponse.getBanners());
            if (eventBannerResponse2 != null) {
                streamEmomoActivity.i6(eventBannerResponse2, EventBannerWhere.CAST_UPPER_RIGHT);
                streamEmomoActivity.f23225l0 = eventBannerResponse2.getType();
                streamEmomoActivity.b5();
            }
            Iterator<T> it = eventNoticeResponse.getBanners().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer eventType = ((EventBannerResponse) obj).getEventType();
                if (eventType != null && eventType.intValue() == 5) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            EventBannerResponse eventBannerResponse3 = (EventBannerResponse) obj;
            if (eventBannerResponse3 != null) {
                streamEmomoActivity.L0 = eventBannerResponse3;
                ac.g gVar4 = streamEmomoActivity.P;
                if (gVar4 == null) {
                    jo.p.v("binding");
                    gVar4 = null;
                }
                gVar4.U.setVisibility(0);
            }
            Iterator<T> it2 = eventNoticeResponse.getBanners().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                Integer eventType2 = ((EventBannerResponse) obj2).getEventType();
                if (eventType2 != null && eventType2.intValue() == 8) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            EventBannerResponse eventBannerResponse4 = (EventBannerResponse) obj2;
            if (eventBannerResponse4 != null) {
                streamEmomoActivity.M0 = eventBannerResponse4;
                ac.g gVar5 = streamEmomoActivity.P;
                if (gVar5 == null) {
                    jo.p.v("binding");
                } else {
                    gVar2 = gVar5;
                }
                gVar2.f878x0.setVisibility(0);
            }
        }
    }

    public static final void D6(StreamEmomoActivity streamEmomoActivity, Boolean bool) {
        jo.p.h(streamEmomoActivity, "this$0");
        ac.g gVar = streamEmomoActivity.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        View view = gVar.F;
        jo.p.g(bool, "isUnreadItem");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void E6(StreamEmomoActivity streamEmomoActivity, List list) {
        ud.a a10;
        jo.p.h(streamEmomoActivity, "this$0");
        ac.g gVar = null;
        if (list == null || list.isEmpty()) {
            ac.g gVar2 = streamEmomoActivity.P;
            if (gVar2 == null) {
                jo.p.v("binding");
                gVar2 = null;
            }
            gVar2.R.setVisibility(8);
            ac.g gVar3 = streamEmomoActivity.P;
            if (gVar3 == null) {
                jo.p.v("binding");
            } else {
                gVar = gVar3;
            }
            gVar.f856b0.h(false);
            return;
        }
        ac.g gVar4 = streamEmomoActivity.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        gVar4.f856b0.h(true);
        ac.g gVar5 = streamEmomoActivity.P;
        if (gVar5 == null) {
            jo.p.v("binding");
            gVar5 = null;
        }
        RecyclerView.h adapter = gVar5.R.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankAdapter");
        cc.b bVar = (cc.b) adapter;
        jo.p.g(list, "currentUserRank");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jf.u uVar = (jf.u) it.next();
            if (uVar.o()) {
                a10 = cc.t0.G.a(uVar);
            } else {
                a10 = cc.c.A.a(streamEmomoActivity, uVar);
            }
            arrayList.add(a10);
        }
        bVar.d(arrayList);
        ac.g gVar6 = streamEmomoActivity.P;
        if (gVar6 == null) {
            jo.p.v("binding");
            gVar6 = null;
        }
        if (gVar6.R.getVisibility() == 8) {
            uo.l.d(streamEmomoActivity, null, null, new e2(null), 3, null);
        }
        ac.g gVar7 = streamEmomoActivity.P;
        if (gVar7 == null) {
            jo.p.v("binding");
        } else {
            gVar = gVar7;
        }
        gVar.R.setVisibility(0);
    }

    public static /* synthetic */ void J6(StreamEmomoActivity streamEmomoActivity, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        streamEmomoActivity.I6(num);
    }

    public static final void X5(Boolean bool) {
        dq.c.c().l(jo.p.c(bool, Boolean.TRUE) ? t.e.f19476a : t.d.f19475a);
    }

    public static final void Y5(StreamEmomoActivity streamEmomoActivity, List list) {
        jo.p.h(streamEmomoActivity, "this$0");
        ac.g gVar = null;
        boolean z10 = false;
        if (list.isEmpty()) {
            ac.g gVar2 = streamEmomoActivity.P;
            if (gVar2 == null) {
                jo.p.v("binding");
                gVar2 = null;
            }
            gVar2.K.setVisibility(4);
        } else {
            ac.g gVar3 = streamEmomoActivity.P;
            if (gVar3 == null) {
                jo.p.v("binding");
                gVar3 = null;
            }
            gVar3.K.setVisibility(0);
        }
        ac.g gVar4 = streamEmomoActivity.P;
        if (gVar4 == null) {
            jo.p.v("binding");
        } else {
            gVar = gVar4;
        }
        RecyclerView.h adapter = gVar.K.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.EmomoCollabUserAdapter");
        rd.i iVar = (rd.i) adapter;
        jo.p.g(list, "collabMembers");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ud.z.f55793d.a((LiveViewingUser) it.next()));
        }
        iVar.f(arrayList);
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (jo.p.c(((LiveViewingUser) it2.next()).isStartedCollab(), Boolean.TRUE)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            streamEmomoActivity.n6("CollabMatchingWaitingDialog");
        }
    }

    public static final void Z5(StreamEmomoActivity streamEmomoActivity, Boolean bool) {
        jo.p.h(streamEmomoActivity, "this$0");
        if (bool.booleanValue()) {
            streamEmomoActivity.k5().R();
        }
    }

    public static final void a6(StreamEmomoActivity streamEmomoActivity, Boolean bool) {
        jo.p.h(streamEmomoActivity, "this$0");
        jo.p.g(bool, "isNeedReload");
        if (bool.booleanValue()) {
            streamEmomoActivity.m5().i();
        }
    }

    public static final void b6(StreamEmomoActivity streamEmomoActivity, Boolean bool) {
        jo.p.h(streamEmomoActivity, "this$0");
        if (jo.p.c(streamEmomoActivity.l5().L0().f(), Boolean.TRUE)) {
            ac.g gVar = streamEmomoActivity.P;
            ac.g gVar2 = null;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            if (gVar.f870p0.getVisibility() == 0) {
                return;
            }
            jo.p.g(bool, "it");
            if (bool.booleanValue()) {
                ac.g gVar3 = streamEmomoActivity.P;
                if (gVar3 == null) {
                    jo.p.v("binding");
                    gVar3 = null;
                }
                gVar3.J.setVisibility(8);
                ac.g gVar4 = streamEmomoActivity.P;
                if (gVar4 == null) {
                    jo.p.v("binding");
                } else {
                    gVar2 = gVar4;
                }
                gVar2.f871q0.setVisibility(0);
                return;
            }
            ac.g gVar5 = streamEmomoActivity.P;
            if (gVar5 == null) {
                jo.p.v("binding");
                gVar5 = null;
            }
            gVar5.J.setVisibility(0);
            ac.g gVar6 = streamEmomoActivity.P;
            if (gVar6 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar6;
            }
            gVar2.f871q0.setVisibility(8);
        }
    }

    public static final void c6(StreamEmomoActivity streamEmomoActivity, jf.i iVar) {
        jo.p.h(streamEmomoActivity, "this$0");
        ac.g gVar = streamEmomoActivity.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        if (gVar.I.getVisibility() == 8) {
            return;
        }
        int i10 = iVar == null ? -1 : b.f23252a[iVar.ordinal()];
        if (i10 == 1) {
            if (jo.p.c(streamEmomoActivity.l5().H0().f(), Boolean.TRUE)) {
                ac.g gVar3 = streamEmomoActivity.P;
                if (gVar3 == null) {
                    jo.p.v("binding");
                    gVar3 = null;
                }
                gVar3.J.setVisibility(8);
                ac.g gVar4 = streamEmomoActivity.P;
                if (gVar4 == null) {
                    jo.p.v("binding");
                    gVar4 = null;
                }
                gVar4.f871q0.setVisibility(0);
            } else {
                ac.g gVar5 = streamEmomoActivity.P;
                if (gVar5 == null) {
                    jo.p.v("binding");
                    gVar5 = null;
                }
                gVar5.J.setVisibility(0);
                ac.g gVar6 = streamEmomoActivity.P;
                if (gVar6 == null) {
                    jo.p.v("binding");
                    gVar6 = null;
                }
                gVar6.f871q0.setVisibility(8);
            }
            ac.g gVar7 = streamEmomoActivity.P;
            if (gVar7 == null) {
                jo.p.v("binding");
                gVar7 = null;
            }
            gVar7.f870p0.setVisibility(8);
            ac.g gVar8 = streamEmomoActivity.P;
            if (gVar8 == null) {
                jo.p.v("binding");
                gVar8 = null;
            }
            gVar8.f869o0.setVisibility(8);
            ac.g gVar9 = streamEmomoActivity.P;
            if (gVar9 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar9;
            }
            gVar2.f868n0.setVisibility(8);
        } else if (i10 == 2) {
            ac.g gVar10 = streamEmomoActivity.P;
            if (gVar10 == null) {
                jo.p.v("binding");
                gVar10 = null;
            }
            gVar10.f871q0.setVisibility(8);
            ac.g gVar11 = streamEmomoActivity.P;
            if (gVar11 == null) {
                jo.p.v("binding");
                gVar11 = null;
            }
            gVar11.f870p0.setVisibility(0);
            ac.g gVar12 = streamEmomoActivity.P;
            if (gVar12 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar12;
            }
            gVar2.f869o0.setVisibility(0);
        } else if (i10 == 3) {
            ac.g gVar13 = streamEmomoActivity.P;
            if (gVar13 == null) {
                jo.p.v("binding");
                gVar13 = null;
            }
            gVar13.f871q0.setVisibility(8);
            ac.g gVar14 = streamEmomoActivity.P;
            if (gVar14 == null) {
                jo.p.v("binding");
                gVar14 = null;
            }
            gVar14.f870p0.setVisibility(0);
            ac.g gVar15 = streamEmomoActivity.P;
            if (gVar15 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar15;
            }
            gVar2.f868n0.setVisibility(0);
        } else if (i10 != 4) {
        } else {
            ac.g gVar16 = streamEmomoActivity.P;
            if (gVar16 == null) {
                jo.p.v("binding");
                gVar16 = null;
            }
            gVar16.J.setVisibility(8);
            ac.g gVar17 = streamEmomoActivity.P;
            if (gVar17 == null) {
                jo.p.v("binding");
                gVar17 = null;
            }
            gVar17.f871q0.setVisibility(8);
            ac.g gVar18 = streamEmomoActivity.P;
            if (gVar18 == null) {
                jo.p.v("binding");
                gVar18 = null;
            }
            gVar18.f870p0.setVisibility(8);
            ac.g gVar19 = streamEmomoActivity.P;
            if (gVar19 == null) {
                jo.p.v("binding");
                gVar19 = null;
            }
            gVar19.f869o0.setVisibility(8);
            ac.g gVar20 = streamEmomoActivity.P;
            if (gVar20 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar20;
            }
            gVar2.f868n0.setVisibility(8);
        }
    }

    public static final void d6(StreamEmomoActivity streamEmomoActivity, Boolean bool) {
        jo.p.h(streamEmomoActivity, "this$0");
        if (bool.booleanValue()) {
            streamEmomoActivity.f23219f0.c(new s0());
            streamEmomoActivity.k5().Q();
        }
    }

    public static final void e6(StreamEmomoActivity streamEmomoActivity, Boolean bool) {
        jo.p.h(streamEmomoActivity, "this$0");
        ac.g gVar = null;
        if (!streamEmomoActivity.v5().i()) {
            ac.g gVar2 = streamEmomoActivity.P;
            if (gVar2 == null) {
                jo.p.v("binding");
            } else {
                gVar = gVar2;
            }
            gVar.f866l0.setVisibility(8);
            return;
        }
        ac.g gVar3 = streamEmomoActivity.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        gVar3.f866l0.setVisibility(0);
        ac.g gVar4 = streamEmomoActivity.P;
        if (gVar4 == null) {
            jo.p.v("binding");
        } else {
            gVar = gVar4;
        }
        View view = gVar.f865k0;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
        MRLogger B5 = streamEmomoActivity.B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_LISTING_ICON_IMP);
        wn.k[] kVarArr = new wn.k[4];
        kVarArr[0] = wn.q.a("page_id", Referer.BROADCAST_AVATAR);
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, streamEmomoActivity.L5().x());
        kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity.z5().c());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"has_new\": \"");
        sb2.append(bool.booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        sb2.append("\"}");
        kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, sb2.toString());
        builder.setPayload(xn.s.m(kVarArr));
        B5.sendLog(builder.build());
    }

    public static final void f6(StreamEmomoActivity streamEmomoActivity, EventNoticeResponse eventNoticeResponse) {
        jo.p.h(streamEmomoActivity, "this$0");
        streamEmomoActivity.t5().g().p(eventNoticeResponse);
    }

    public static final void g6(StreamEmomoActivity streamEmomoActivity, Boolean bool) {
        jo.p.h(streamEmomoActivity, "this$0");
        jo.p.g(bool, "it");
        ac.g gVar = null;
        if (bool.booleanValue()) {
            ac.g gVar2 = streamEmomoActivity.P;
            if (gVar2 == null) {
                jo.p.v("binding");
                gVar2 = null;
            }
            gVar2.I.setVisibility(0);
            if (jo.p.c(streamEmomoActivity.l5().H0().f(), Boolean.TRUE)) {
                ac.g gVar3 = streamEmomoActivity.P;
                if (gVar3 == null) {
                    jo.p.v("binding");
                    gVar3 = null;
                }
                gVar3.J.setVisibility(8);
                ac.g gVar4 = streamEmomoActivity.P;
                if (gVar4 == null) {
                    jo.p.v("binding");
                } else {
                    gVar = gVar4;
                }
                gVar.f871q0.setVisibility(0);
                return;
            }
            ac.g gVar5 = streamEmomoActivity.P;
            if (gVar5 == null) {
                jo.p.v("binding");
                gVar5 = null;
            }
            gVar5.J.setVisibility(0);
            ac.g gVar6 = streamEmomoActivity.P;
            if (gVar6 == null) {
                jo.p.v("binding");
            } else {
                gVar = gVar6;
            }
            gVar.f871q0.setVisibility(8);
            return;
        }
        ac.g gVar7 = streamEmomoActivity.P;
        if (gVar7 == null) {
            jo.p.v("binding");
            gVar7 = null;
        }
        gVar7.I.setVisibility(8);
        ac.g gVar8 = streamEmomoActivity.P;
        if (gVar8 == null) {
            jo.p.v("binding");
            gVar8 = null;
        }
        gVar8.f869o0.setVisibility(8);
        ac.g gVar9 = streamEmomoActivity.P;
        if (gVar9 == null) {
            jo.p.v("binding");
        } else {
            gVar = gVar9;
        }
        gVar.f868n0.setVisibility(8);
    }

    public static final void r6(StreamEmomoActivity streamEmomoActivity, View view) {
        jo.p.h(streamEmomoActivity, "this$0");
        streamEmomoActivity.d5();
    }

    public static final void s6(StreamEmomoActivity streamEmomoActivity, View view) {
        jo.p.h(streamEmomoActivity, "this$0");
        streamEmomoActivity.T5();
    }

    public static final void t6(StreamEmomoActivity streamEmomoActivity, View view) {
        jo.p.h(streamEmomoActivity, "this$0");
        streamEmomoActivity.c5();
    }

    public static final void u6(StreamEmomoActivity streamEmomoActivity, View view) {
        jo.p.h(streamEmomoActivity, "this$0");
        App.AppParams appParams = streamEmomoActivity.f23222i0;
        if (!jo.p.c(appParams != null ? Boolean.valueOf(appParams.isCategory()) : null, Boolean.FALSE)) {
            of.n.A(streamEmomoActivity, xb.r.J2, false);
            return;
        }
        App.AppParams appParams2 = streamEmomoActivity.f23222i0;
        if (appParams2 != null) {
            streamEmomoActivity.d5();
            r.a aVar = be.r.f18061c1;
            String appUserIdLabel = appParams2.getAppUserIdLabel();
            boolean isAppUserIdHidden = appParams2.isAppUserIdHidden();
            AppUserDetailResponse appUserDetail = appParams2.getAppUserDetail();
            String str = (appUserDetail == null || (r2 = appUserDetail.getUserId()) == null) ? "" : "";
            AppUserDetailResponse appUserDetail2 = appParams2.getAppUserDetail();
            r.a.b(aVar, Referer.BROADCAST_AVATAR, appUserIdLabel, isAppUserIdHidden, str, appUserDetail2 != null ? appUserDetail2.isPublishedUserId() : false, true, 0, 0, false, false, 960, null).z3(streamEmomoActivity.a3(), "AppUserIdSettingDialog");
            streamEmomoActivity.j5().F().m(Boolean.TRUE);
            streamEmomoActivity.k5().B(appParams2.getAppId());
            MRLogger B5 = streamEmomoActivity.B5();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GAME_ID_COMMENT_BTN_TAP);
            builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
            builder.setTargetId(appParams2.getAppId());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, streamEmomoActivity.A5().b())));
            B5.sendLog(builder.build());
        }
    }

    public static final void v6(StreamEmomoActivity streamEmomoActivity, AppUserDetailResponse appUserDetailResponse) {
        jo.p.h(streamEmomoActivity, "this$0");
        streamEmomoActivity.j5().W(appUserDetailResponse);
    }

    public static final void w6(StreamEmomoActivity streamEmomoActivity, Integer num) {
        jo.p.h(streamEmomoActivity, "this$0");
        ac.g gVar = streamEmomoActivity.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.f856b0.setVisibility((num != null && num.intValue() == 3) ? 0 : 8);
    }

    public static final void x6(StreamEmomoActivity streamEmomoActivity, wn.k kVar) {
        jo.p.h(streamEmomoActivity, "this$0");
        if (kVar == null) {
            return;
        }
        ac.g gVar = streamEmomoActivity.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        boolean z10 = false;
        if (gVar.f856b0.getVisibility() == 8) {
            ac.g gVar3 = streamEmomoActivity.P;
            if (gVar3 == null) {
                jo.p.v("binding");
                gVar3 = null;
            }
            gVar3.f856b0.setVisibility(0);
        }
        ac.g gVar4 = streamEmomoActivity.P;
        if (gVar4 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar4;
        }
        GiftGachaView giftGachaView = gVar2.f856b0;
        List<? extends ud.n0> list = (List) kVar.c();
        boolean booleanValue = ((Boolean) kVar.d()).booleanValue();
        Integer f10 = streamEmomoActivity.l5().V().f();
        if (f10 != null && f10.intValue() == 3) {
            z10 = true;
        }
        giftGachaView.l(list, booleanValue, z10);
    }

    public static final void y6(StreamEmomoActivity streamEmomoActivity, FeverValue feverValue) {
        jo.p.h(streamEmomoActivity, "this$0");
        if (feverValue == null) {
            return;
        }
        ac.g gVar = streamEmomoActivity.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.f856b0.k(feverValue.getCurrentMeter(), feverValue.getMaxMeter());
    }

    public static final void z6(StreamEmomoActivity streamEmomoActivity, View view) {
        jo.p.h(streamEmomoActivity, "this$0");
        uo.l.d(uo.r0.a(uo.g1.c().plus(streamEmomoActivity.J0)), null, null, new x1(null), 3, null);
    }

    public final kf.m A5() {
        return (kf.m) this.f23230q0.getValue();
    }

    @Override // vb.j
    public void B() {
        if (l5().O().f() == jf.i.START_READY) {
            od.g p52 = p5();
            String str = this.Q;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            p52.e(Referer.BROADCAST_AVATAR, str, false);
        } else {
            String f10 = l5().s0().f();
            if (f10 != null) {
                p5().a(Referer.BROADCAST_AVATAR, f10);
            }
        }
        be.c0.P0.a().z3(a3(), "CollabMatchingWaitingDialog");
    }

    @Override // hc.y0
    public void B0() {
        R6();
        int i10 = 0;
        nf.h0 h0Var = null;
        UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        t5().f().p(this.f23233t0);
        nf.h0 h0Var2 = this.U;
        if (h0Var2 == null) {
            jo.p.v("store");
        } else {
            h0Var = h0Var2;
        }
        List<GroupShotViewer> G = h0Var.G();
        if (G != null) {
            for (Object obj : G) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                GroupShotViewer groupShotViewer = (GroupShotViewer) obj;
                UnityManager.Companion.getInstance().unloadAvatarModel(i11);
                i10 = i11;
            }
        }
        UnityManager.Companion.getInstance().restoreCameraDolly();
        this.f23219f0.c(new t());
    }

    public final MRLogger B5() {
        return (MRLogger) this.X.getValue();
    }

    @Override // be.d3
    public void C() {
        this.f23219f0.c(new u());
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_SETTING_START);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b())));
        B5.sendLog(builder.build());
    }

    public final MirrorDatabase C5() {
        return (MirrorDatabase) this.f23238y0.getValue();
    }

    @Override // vb.l
    public void D0() {
        o5().k();
        Long f10 = q5().i().f();
        if (f10 != null) {
            MRLogger B5 = B5();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_CANCEL);
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, M5().T4()), wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, A5().h()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CollabMatchingCancelTargetDetail(2, Integer.valueOf((int) ((System.currentTimeMillis() - f10.longValue()) / 1000))).toJson())));
            B5.sendLog(builder.build());
        }
    }

    @Override // ie.b.InterfaceC0486b
    public void D1(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_SNAP_FAILED")) {
            return;
        }
        jo.p.c(str, "DIALOG_TAG_SET_PLAYBACK_PARAMS_FAILED");
    }

    public final MRRequest D5() {
        return (MRRequest) this.W.getValue();
    }

    @Override // vb.g
    public void E(int i10) {
        t5().f().p(null);
        m5().h(i10);
    }

    @Override // je.a
    public void E0(float f10) {
        UnityManager.Companion.getInstance().setCameraDolly(f10);
    }

    public final ServerConfig E5() {
        return (ServerConfig) this.f23232s0.getValue();
    }

    @Override // bc.q1
    public void F1(int i10) {
        bc.q qVar = this.f23218e0;
        if (qVar != null) {
            qVar.V3(i10);
        }
    }

    @Override // bc.s
    public void F2() {
        W5(true);
    }

    public final rf.f F5() {
        return (rf.f) this.f23221h0.getValue();
    }

    public final void F6() {
        tb.a O = y5().O(true);
        O.a().z3(a3(), O.b());
    }

    @Override // be.s1
    public void G0(String str) {
        jo.p.h(str, "key");
        n6("EmomoShutterEffectDialog");
        if (jo.p.c(str, "EMOMO_SHUTTER_EFFECT_KEY_DRESS_UP")) {
            f7();
        } else if (jo.p.c(str, "EMOMO_SHUTTER_EFFECT_KEY_GROUP_SHOT")) {
            I5().captureScreenshot(UnityScreenShotAvatarPosition.CENTER, s5(), 1113, 1113, "EMOMO_GROUP_SHOT_KEY");
        }
    }

    @Override // vb.p
    public void G2(String str) {
        jo.p.h(str, "url");
        GlideApp.with((androidx.fragment.app.h) this).asFile().load(str).into((GlideRequest<File>) new s());
    }

    public final nf.g0 G5() {
        return (nf.g0) this.E0.getValue();
    }

    public final void G6() {
        tb.a c10 = y5().c();
        c10.a().z3(a3(), c10.b());
    }

    @Override // bc.s
    public void H() {
        this.f23218e0 = null;
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        for (Fragment fragment : p02) {
            if (fragment instanceof androidx.fragment.app.e) {
                ((androidx.fragment.app.e) fragment).n3();
            }
        }
        R6();
        dq.c.c().l(t.f.f19477a);
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        Puree.d(new Live.CastCommentTypeChanged(str, Referer.AVATAR));
        uo.l.d(uo.r0.a(uo.g1.c().plus(this.J0)), null, null, new c(null), 3, null);
    }

    public final kf.v H5() {
        return (kf.v) this.f23237x0.getValue();
    }

    public final void H6() {
        f.a aVar = ie.f.V0;
        String string = getString(xb.r.A0);
        jo.p.g(string, "getString(R.string.text_emomo_confirm_close)");
        f.a.b(aVar, string, getString(xb.r.S1), getString(xb.r.H), null, false, 24, null).z3(a3(), "DIALOG_TAG_CONFIRM_CANCEL_DRESS_UP_DIALOG");
    }

    @Override // vb.v
    public void I1() {
        n6("ShooterDressUpDialog");
        J6(this, null, 1, null);
    }

    @Override // gf.v0
    public void I2(String str) {
        jo.p.h(str, "linkOwnerLiveId");
        uo.l.d(uo.r0.a(uo.g1.c().plus(this.J0)), null, null, new v(str, null), 3, null);
    }

    public final UnityActionCreator I5() {
        return (UnityActionCreator) this.G0.getValue();
    }

    public final void I6(Integer num) {
        n6("EmomoDressUpDialog");
        tb.a d10 = c.a.d(y5(), Referer.BROADCAST_AVATAR, num, false, 4, null);
        d10.a().z3(a3(), d10.b());
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_IMP_CLOSET);
        builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        builder.setTargetId(str);
        builder.setPageId(Referer.BROADCAST_AVATAR);
        B5.sendLog(builder.build());
        F5().g().p(Boolean.FALSE);
        UnityManager.Companion.getInstance().getCollabAvatarManager().stopCollabMode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r0.length() == 0) == true) goto L7;
     */
    @Override // vb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J() {
        /*
            r4 = this;
            nf.c r0 = r4.l5()
            androidx.lifecycle.e0 r0 = r0.s0()
            java.lang.Object r0 = r0.f()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            int r0 = r0.length()
            if (r0 != 0) goto L1a
            r0 = r1
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r0 != r1) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            if (r1 == 0) goto L2c
            java.lang.String r0 = r4.Q
            if (r0 != 0) goto L3a
            java.lang.String r0 = "liveId"
            jo.p.v(r0)
            r0 = 0
            goto L3a
        L2c:
            nf.c r0 = r4.l5()
            androidx.lifecycle.e0 r0 = r0.s0()
            java.lang.Object r0 = r0.f()
            java.lang.String r0 = (java.lang.String) r0
        L3a:
            if (r0 == 0) goto L45
            od.g r2 = r4.p5()
            java.lang.String r3 = "broadcast.avatar"
            r2.d(r3, r0, r1)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.J():void");
    }

    @Override // vb.p
    public void J0() {
        V6();
    }

    @Override // be.i1
    public void J2() {
        n6("EmomoPoseDialog");
        UnityManager.Companion companion = UnityManager.Companion;
        UnityManager.setAnimation$default(companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        companion.getInstance().getCollabAvatarManager().restartCollabMode();
        R6();
    }

    public final UnityStore J5() {
        return (UnityStore) this.D0.getValue();
    }

    @Override // hc.i0
    public void K() {
        this.f23219f0.c(new p());
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.O.setVisibility(0);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar3;
        }
        gVar2.T.setVisibility(0);
    }

    public final of.k K5() {
        return (of.k) this.Y.getValue();
    }

    public final void K6() {
        bc.y.P0.a().z3(a3(), "EmokaraHeadsetAlertDialog");
    }

    @Override // gf.v0
    public void L(String str) {
        jo.p.h(str, "userId");
        k5().v(Referer.Broadcast.COLLAB_END, str);
        hf.b.f35490a.h();
        FirebaseAnalytics.getInstance(getApplicationContext()).a("jdwii7", null);
    }

    public final hf.v0 L5() {
        return (hf.v0) this.I0.getValue();
    }

    public final void L6() {
        f.a aVar = ie.f.V0;
        String string = getString(xb.r.text_karaoke_confirm_finish_karaoke);
        jo.p.g(string, "getString(R.string.text_…e_confirm_finish_karaoke)");
        f.a.b(aVar, string, getString(xb.r.text_karaoke_finish_button_label), null, null, false, 24, null).z3(a3(), "DIALOG_TAG_EMOKARA_FINISH_CONFIRM");
    }

    @Override // bc.s
    public void M() {
        M6();
    }

    public final kf.x M5() {
        return (kf.x) this.f23239z0.getValue();
    }

    public final void M6() {
        b.a aVar = ie.b.P0;
        String string = getString(xb.r.text_karaoke_set_playback_params_error_message);
        jo.p.g(string, "getString(R.string.text_…ack_params_error_message)");
        b.a.b(aVar, string, getString(xb.r.f60082l), null, 4, null).z3(a3(), "DIALOG_TAG_SET_PLAYBACK_PARAMS_FAILED");
    }

    @Override // bc.s
    public void N(String str, float f10) {
        jo.p.h(str, "bgUrl");
        this.f23233t0 = t5().f().f();
        if (u5().n()) {
            UnityManager.Companion.getInstance().disableAlpha();
        }
        UnityManager.Companion companion = UnityManager.Companion;
        companion.getInstance().getCollabAvatarManager().stopCollabMode();
        companion.getInstance().initEmokara(true, f10);
        G2(str);
        String str2 = this.Q;
        if (str2 == null) {
            jo.p.v("liveId");
            str2 = null;
        }
        Puree.d(new Live.CastCommentTypeChanged(str2, "karaoke"));
    }

    @Override // bc.s
    public void N0(KaraokeDetail karaokeDetail, jf.v vVar) {
        jo.p.h(karaokeDetail, "karaokeDetail");
        jo.p.h(vVar, "karaokeModel");
        bc.q qVar = this.f23218e0;
        if (qVar != null) {
            qVar.z4(karaokeDetail, vVar);
        }
        F5().g().p(Boolean.TRUE);
    }

    @Override // bc.s
    public void N1(float f10) {
        UnityManager.Companion.getInstance().initEmokara(true, f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N5(java.util.List<? extends xb.a> r14, ao.d<? super wn.v> r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.N5(java.util.List, ao.d):java.lang.Object");
    }

    public final void N6(Karaoke karaoke, boolean z10) {
        bc.p1.W0.a(karaoke, z10).z3(a3(), "EmokaraSettingDialog");
    }

    @Override // bc.s
    public void O0() {
        bc.q qVar = this.f23218e0;
        if (qVar != null) {
            qVar.k4();
        }
        dq.c.c().l(t.f.f19477a);
    }

    @Override // vb.h
    public void O1(int i10) {
        m5().F(i10);
        g5();
    }

    public final void O5() {
        uo.d2 d10;
        uo.d2 d2Var = this.f23224k0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new r(null), 3, null);
        this.f23224k0 = d10;
    }

    public final void O6(int i10) {
        int b10;
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.W.setText(String.valueOf(i10));
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        ViewGroup.LayoutParams layoutParams = gVar3.V.getLayoutParams();
        if (i10 >= 100) {
            b10 = de.a.b(this, 74);
        } else if (i10 >= 10) {
            b10 = de.a.b(this, 62);
        } else {
            b10 = de.a.b(this, 50);
        }
        layoutParams.width = b10;
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        gVar4.V.requestLayout();
        ac.g gVar5 = this.P;
        if (gVar5 == null) {
            jo.p.v("binding");
            gVar5 = null;
        }
        if (gVar5.V.getVisibility() == 8) {
            uo.d2 d2Var = this.f23223j0;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            uo.d2 d2Var2 = this.f23224k0;
            if (d2Var2 != null) {
                d2.a.a(d2Var2, null, 1, null);
            }
            ac.g gVar6 = this.P;
            if (gVar6 == null) {
                jo.p.v("binding");
                gVar6 = null;
            }
            gVar6.V.setVisibility(0);
            ac.g gVar7 = this.P;
            if (gVar7 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar7;
            }
            ConstraintLayout constraintLayout = gVar2.V;
            Animation loadAnimation = AnimationUtils.loadAnimation(this, xb.j.gift_event_rank_bounce);
            loadAnimation.setInterpolator(new le.a(0.1d, 20.0d, 0.0d, 0.0d, 12, null));
            loadAnimation.setAnimationListener(new o2());
            constraintLayout.startAnimation(loadAnimation);
        }
    }

    @Override // je.d
    public void P1() {
        n6("EmomoRegistrationDialog");
        UnityManager.Companion.getInstance().getCollabAvatarManager().restartCollabMode();
        R6();
        ClosetAvatar R = n5().R();
        if (R != null) {
            m5().o(jf.c.f37906y.a(R));
        }
    }

    public final void P5() {
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.f872r0.setVisibility(8);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        gVar3.H.setVisibility(8);
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        gVar4.T.setVisibility(8);
        ac.g gVar5 = this.P;
        if (gVar5 == null) {
            jo.p.v("binding");
            gVar5 = null;
        }
        gVar5.f855a0.setVisibility(8);
        ac.g gVar6 = this.P;
        if (gVar6 == null) {
            jo.p.v("binding");
            gVar6 = null;
        }
        gVar6.G.setVisibility(8);
        ac.g gVar7 = this.P;
        if (gVar7 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar7;
        }
        gVar2.O.setVisibility(8);
    }

    public final void P6(String str) {
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.Z.setVisibility(0);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        gVar3.X.setWebViewClient(new p2());
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar4;
        }
        gVar2.X.loadUrl(str);
        F5().g().p(Boolean.FALSE);
    }

    @Override // bc.s
    public void Q() {
        this.f23218e0 = null;
        n6("EmoKaraDialog");
        UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        R6();
        Puree.d(new KaraokeLog(KaraokeActionType.CLOSE_SONG_LIST, null, null, null, null, null, null, 126, null));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void Q5(WebSettings webSettings) {
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setUserAgentString(ApiUtil.INSTANCE.userAgent());
    }

    public final void Q6() {
        bc.q a10 = bc.q.f17438d1.a();
        a10.z3(a3(), "EmoKaraDialog");
        this.f23218e0 = a10;
        F5().g().p(Boolean.FALSE);
    }

    @Override // hc.s0
    public void R(List<GroupShotViewer> list, File file) {
        jo.p.h(list, "viewers");
        jo.p.h(file, "backgroundImageFile");
        P5();
        UnityManager.Companion companion = UnityManager.Companion;
        companion.getInstance().setCameraDolly(CameraDolly.GROUP_SHOT);
        companion.getInstance().setCollaboGroupShot();
        this.f23233t0 = t5().f().f();
        t5().f().p(file);
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        for (GroupShotViewer groupShotViewer : list) {
            arrayList.add(new jf.c(groupShotViewer.getAvatar()));
        }
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            UnityManager.Companion.getInstance().loadAvatarModel((jf.c) obj, i11);
            i10 = i11;
        }
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.G.setVisibility(0);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        gVar3.f855a0.setVisibility(0);
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar4;
        }
        gVar2.T.setVisibility(0);
        this.f23219f0.c(new j4());
    }

    public final boolean R5() {
        ac.g gVar = this.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        return (gVar.Z.getVisibility() != 0 && a3().e0("CollabMatchingWaitingDialog") == null && a3().e0("CollabMatchingRetryDialog") == null && a3().e0("CollabMatchingRetryDialog") == null && a3().e0("BecameCheerleaderDialogFragment") == null && a3().e0("GiftAppEventRankingRankUpDialogFragment") == null && a3().e0("GiftRankingRankUpStreamerDialogFragment") == null && a3().e0("GiftRankingRankUpSenderDialogFragment") == null && a3().e0("LiveGiftRankingBottomSheetDialogFragment") == null && a3().e0("EmoKaraDialog") == null && a3().e0("MutualGiftBoxResultDialogFragment") == null) ? false : true;
    }

    public final void R6() {
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.f872r0.setVisibility(0);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        gVar3.H.setVisibility(0);
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        gVar4.T.setVisibility(0);
        ac.g gVar5 = this.P;
        if (gVar5 == null) {
            jo.p.v("binding");
            gVar5 = null;
        }
        gVar5.G.setVisibility(0);
        ac.g gVar6 = this.P;
        if (gVar6 == null) {
            jo.p.v("binding");
            gVar6 = null;
        }
        gVar6.f855a0.setVisibility(0);
        ac.g gVar7 = this.P;
        if (gVar7 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar7;
        }
        gVar2.O.setVisibility(0);
        F5().g().p(Boolean.TRUE);
    }

    @Override // gf.v0
    public void S(String str) {
        jo.p.h(str, "userId");
        dq.c.c().l(new nd.d0(str, false));
    }

    public final boolean S5() {
        ac.g gVar = this.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        return gVar.f855a0.getVisibility() == 0;
    }

    public final void S6() {
        be.g1.U0.a(true, false).z3(a3(), "EmomoPoseDialog");
        F5().g().p(Boolean.FALSE);
        UnityManager.Companion.getInstance().getCollabAvatarManager().stopCollabMode();
    }

    @Override // vb.f
    public void T1() {
        ClosetAvatar clone;
        t5().f().p(null);
        ClosetAvatar N = n5().N();
        if (N == null || (clone = N.clone()) == null) {
            return;
        }
        m5().m(clone);
    }

    public final void T5() {
        P5();
        J6(this, null, 1, null);
    }

    public final void T6() {
        tb.a D0 = y5().D0();
        D0.a().z3(a3(), D0.b());
    }

    @Override // be.i1
    public void U0(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        jo.p.h(closetAvatarSimpleValue, "pose");
        Puree.d(new Avatar.AvatarSelectPose(closetAvatarSimpleValue.getId()));
        UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), closetAvatarSimpleValue.getValue(), 0, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r0.length() > 0) == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U5(com.dena.mirrativ.mirrativapi.common.EventBannerResponse r4, com.dena.mirrorman.clientlog.logs.EventBannerWhere r5) {
        /*
            r3 = this;
            nd.c$a r0 = nd.c.Companion
            int r1 = r4.getType()
            nd.c r0 = r0.a(r1)
            int[] r1 = com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.b.f23253b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 2
            if (r0 == r2) goto L19
            goto L63
        L19:
            java.lang.String r0 = r4.getEventPageUrl()
            r2 = 0
            if (r0 == 0) goto L2c
            int r0 = r0.length()
            if (r0 <= 0) goto L28
            r0 = r1
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 != r1) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r1 == 0) goto L4c
            ac.g r0 = r3.P
            if (r0 != 0) goto L39
            java.lang.String r0 = "binding"
            jo.p.v(r0)
            r0 = 0
        L39:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f872r0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L63
            java.lang.String r0 = r4.getEventPageUrl()
            jo.p.e(r0)
            r3.P6(r0)
            goto L63
        L4c:
            com.dena.mirrorman.activity.HandleUrlSchemeActivity$a r0 = com.dena.mirrorman.activity.HandleUrlSchemeActivity.f25127b0
            of.k r1 = r3.K5()
            java.lang.String r2 = r4.getUrl()
            jf.b0 r1 = r1.a(r2)
            java.lang.String r2 = "broadcast.avatar"
            android.content.Intent r0 = r0.a(r3, r2, r1)
            r3.startActivity(r0)
        L63:
            com.dena.mirrorman.clientlog.logs.EventBannerActionType r0 = com.dena.mirrorman.clientlog.logs.EventBannerActionType.EVENT_BANNER_CLICK
            r3.o6(r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.U5(com.dena.mirrativ.mirrativapi.common.EventBannerResponse, com.dena.mirrorman.clientlog.logs.EventBannerWhere):void");
    }

    public final void U6() {
        tb.a k10 = y5().k();
        k10.a().z3(a3(), k10.b());
    }

    @Override // vb.p
    public void V1(Serializable serializable) {
        jo.p.h(serializable, MRLog.TARGET_TYPE_BANNER);
        if (serializable instanceof EventBannerResponse) {
            h6((EventBannerResponse) serializable, EventBannerWhere.CAST_CLOSET);
        }
    }

    public final void V5(EventBannerResponse eventBannerResponse, EventBannerWhere eventBannerWhere) {
        jo.p.h(eventBannerResponse, "eventBanner");
        jo.p.h(eventBannerWhere, MRLog.PAYLOAD_KEY_WHERE);
        U5(eventBannerResponse, eventBannerWhere);
    }

    public final void V6() {
        tb.a l02 = y5().l0();
        l02.a().z3(a3(), l02.b());
    }

    @Override // vb.p
    public void W0(float f10) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        cVar.g(gVar.Q);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        int id2 = gVar3.D.getId();
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        cVar.l(id2, gVar4.u().getHeight() - ((int) f10));
        ac.g gVar5 = this.P;
        if (gVar5 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar5;
        }
        cVar.c(gVar2.Q);
    }

    public final void W5(boolean z10) {
        b3.a.EnumC0122a enumC0122a;
        b3.a aVar = be.b3.X0;
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        if (z10) {
            enumC0122a = b3.a.EnumC0122a.Hidden;
        } else {
            enumC0122a = b3.a.EnumC0122a.GroupShotButton;
        }
        aVar.a(Referer.BROADCAST_AVATAR, str, enumC0122a).z3(a3(), "LiveGiftRankingBottomSheetDialogFragment");
    }

    public final void W6(String str) {
        this.f23219f0.c(new q2(str, this));
    }

    @Override // bc.q1
    public void X1(int i10) {
        bc.q qVar = this.f23218e0;
        if (qVar != null) {
            qVar.W3(i10);
        }
    }

    public final void X6() {
        b.a aVar = ie.b.P0;
        String string = getString(xb.r.f60086p2);
        jo.p.g(string, "getString(R.string.text_should_purchase_companion)");
        b.a.b(aVar, string, null, null, 6, null).z3(a3(), "CustomMessageDialog");
    }

    @Override // be.i1
    public void Y1() {
        n6("EmomoPoseDialog");
        W6("EMOMO_SHUTTER_EFFECT_KEY_DRESS_UP");
    }

    public final void Y6() {
        uo.d2 d10;
        d7();
        d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new f4(null), 3, null);
        this.f23227n0 = d10;
    }

    @Override // gf.v0
    public void Z0(String str) {
        jo.p.h(str, "appUserId");
        b.a aVar = ie.b.P0;
        String string = getString(xb.r.text_view_game_id_copy_toast);
        jo.p.g(string, "getString(R.string.text_view_game_id_copy_toast)");
        aVar.a(string, null, getString(xb.r.S1)).z3(a3(), "CustomMessageDialog");
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, z5().c())));
        B5.sendLog(builder.build());
    }

    public final Object Z6(String str, String str2, String str3, ao.d<? super wn.v> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        String uuid = UUID.randomUUID().toString();
        jo.p.g(uuid, "randomUUID().toString()");
        I5().loadLiveGiftEffect(uuid, str, str2, str3);
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new g4(uuid, qVar, null), 3, null);
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10 == bo.c.c() ? t10 : wn.v.f59242a;
    }

    public final Object a7(jf.c cVar, UniqueEmomoGiftEffectInfoResponse uniqueEmomoGiftEffectInfoResponse, ao.d<? super wn.v> dVar) {
        uo.q qVar = new uo.q(bo.b.b(dVar), 1);
        qVar.y();
        String uuid = UUID.randomUUID().toString();
        jo.p.g(uuid, "randomUUID().toString()");
        I5().loadStreamingRichUniqueGift(uuid, uniqueEmomoGiftEffectInfoResponse.getUnityPresetName(), cVar, jf.c.f37906y.a(uniqueEmomoGiftEffectInfoResponse.getAvatar()), uniqueEmomoGiftEffectInfoResponse.getTexts(), uniqueEmomoGiftEffectInfoResponse.getUnityMotionName());
        uo.l.d(uo.r0.a(uo.g1.b()), null, null, new h4(uuid, qVar, null), 3, null);
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10 == bo.c.c() ? t10 : wn.v.f59242a;
    }

    @Override // ie.f.b
    public void b(String str) {
        bc.q qVar;
        AppUserDetailResponse f10;
        String appId;
        jo.p.h(str, "tag");
        String str2 = null;
        switch (str.hashCode()) {
            case -1126982621:
                if (str.equals("DIALOG_TAG_EMOKARA_FINISH_CONFIRM") && (qVar = this.f23218e0) != null) {
                    qVar.Z3();
                    return;
                }
                return;
            case 257818906:
                if (str.equals("open_comment_url") && (f10 = l5().N().f()) != null) {
                    of.n.r(this, f10.getUrl());
                    App.AppParams appParams = this.f23222i0;
                    if (appParams == null || (appId = appParams.getAppId()) == null) {
                        return;
                    }
                    MRLogger B5 = B5();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
                    builder.setTargetType("url");
                    builder.setTargetId(appId);
                    builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b())));
                    B5.sendLog(builder.build());
                    return;
                }
                return;
            case 512536685:
                if (str.equals("DIALOG_TAG_DRESS_UP_EVENT_DIALOG")) {
                    m5().f();
                    m5().d();
                    R6();
                    UnityManager.Companion.getInstance().getCollabAvatarManager().restartCollabMode();
                    String str3 = this.Q;
                    if (str3 == null) {
                        jo.p.v("liveId");
                    } else {
                        str2 = str3;
                    }
                    Puree.d(new Avatar.AvatarCloseCloset(str2));
                    EventBannerResponse eventBannerResponse = this.K0;
                    if (eventBannerResponse != null) {
                        U5(eventBannerResponse, EventBannerWhere.CAST_CLOSET);
                        return;
                    }
                    return;
                }
                return;
            case 2005743546:
                if (str.equals("DIALOG_TAG_CONFIRM_CANCEL_DRESS_UP_DIALOG")) {
                    t5().f().p(null);
                    m5().f();
                    m5().d();
                    R6();
                    UnityManager.Companion.getInstance().getCollabAvatarManager().restartCollabMode();
                    String str4 = this.Q;
                    if (str4 == null) {
                        jo.p.v("liveId");
                    } else {
                        str2 = str4;
                    }
                    Puree.d(new Avatar.AvatarCloseCloset(str2));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // vb.p
    public void b2() {
        G6();
    }

    public final void b5() {
        if (this.f23225l0 == nd.c.INTERNAL.c()) {
            Integer f10 = t5().h().f();
            if (f10 != null && f10.intValue() > 0) {
                O6(f10.intValue());
                return;
            }
            e7();
            c7();
            return;
        }
        e7();
    }

    public final void b7() {
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            sd.b.O0.a(false).z3(a3(), "ProgressDialogFragment");
        }
    }

    @Override // ie.f.b
    public void c(String str) {
        jo.p.h(str, "tag");
    }

    public final void c5() {
        ac.g gVar = this.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        if (gVar.Z.getVisibility() == 0) {
            ac.g gVar2 = this.P;
            if (gVar2 == null) {
                jo.p.v("binding");
                gVar2 = null;
            }
            gVar2.Z.setVisibility(8);
            F5().g().p(Boolean.TRUE);
            uo.l.d(this, null, null, new d(null), 3, null);
        }
    }

    public final void c7() {
        uo.d2 d10;
        uo.d2 d2Var = this.f23223j0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new i4(null), 3, null);
        this.f23223j0 = d10;
    }

    @Override // gf.v0
    public void d1(String str) {
        jo.p.h(str, "liveId");
        Intent f10 = c.a.f(y5(), this, str, Referer.COLLAB_RECOMMEND_LIVE, null, null, false, false, false, false, null, AnalyticsListener.EVENT_AUDIO_ATTRIBUTES_CHANGED, null);
        f10.addFlags(335544320);
        startActivity(f10);
    }

    public final void d5() {
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.N.setVisibility(4);
        g7(0);
        of.j jVar = of.j.f45405a;
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar3;
        }
        jVar.c(this, gVar2.L);
    }

    public final void d7() {
        d2.a.a(this.f23227n0, null, 1, null);
    }

    @Override // gf.v0
    public void e0(EventBannerResponse eventBannerResponse) {
        jo.p.h(eventBannerResponse, "eventBanner");
        U5(eventBannerResponse, EventBannerWhere.CAST_COMMENT_LIST);
    }

    @Override // hc.y0
    public void e2() {
        this.f23219f0.c(new n());
        W6("EMOMO_SHUTTER_EFFECT_KEY_GROUP_SHOT");
    }

    public final void e5() {
        GiftItem d10;
        if (g().b() != o.c.RESUMED || !S5() || l5().O0().getValue().booleanValue() || R5() || (d10 = x5().d()) == null) {
            return;
        }
        x5().a(d10);
        List<xb.a> h52 = h5(d10);
        String str = null;
        if (d10.getCoins() <= 0) {
            uo.l.d(this, null, null, new g(h52, null), 3, null);
        } else {
            String effectId = d10.getEffectId();
            if (!(effectId == null || effectId.length() == 0)) {
                uo.l.d(this, null, null, new h(d10, h52, null), 3, null);
            } else if (d10.getGiftType() == ve.d.UNIQUE_EMOMO_GIFT_RICH.c()) {
                uo.l.d(this, new e(uo.l0.f56050r, this), null, new i(d10, h52, null), 2, null);
            } else {
                uo.l.d(this, new f(uo.l0.f56050r, this), null, new j(d10, h52, null), 2, null);
            }
        }
        if (d10.getGiftType() != ve.d.EMOMO_ANIMATION.c() && d10.getGiftType() != ve.d.COMPANION.c() && d10.getGiftType() != ve.d.USER_LEVEL.c() && d10.getGiftType() != ve.d.MULTI_EMOMO_GIFT.c()) {
            this.R = false;
        } else {
            this.R = true;
            uo.l.d(uo.r0.a(uo.g1.c().plus(this.J0)), null, null, new k(d10, this, null), 3, null);
        }
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_DISPLAYED_GIFT);
        builder.setPageId(Referer.BROADCAST_AVATAR);
        wn.k[] kVarArr = new wn.k[4];
        String str2 = this.Q;
        if (str2 == null) {
            jo.p.v("liveId");
        } else {
            str = str2;
        }
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str);
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, d10.getGiftId());
        kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_CATEGORY_ID, String.valueOf(d10.getGiftType()));
        kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_DESCRIPTION, new GiftTargetDetail(d10.getCollabStreamerUserName(), d10.getShouldPlayAnimation()).toJson());
        List<wn.k<String, String>> p10 = xn.s.p(kVarArr);
        String liveSentGiftId = d10.getLiveSentGiftId();
        if (liveSentGiftId != null) {
            p10.add(wn.q.a(MRLog.PAYLOAD_GIFT_ID, liveSentGiftId));
        }
        builder.setPayload(p10);
        builder.setTargetId(d10.getUserId());
        B5.sendLog(builder.build());
    }

    public final void e7() {
        ac.g gVar = this.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.V.setVisibility(8);
        uo.d2 d2Var = this.f23223j0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        uo.d2 d2Var2 = this.f23224k0;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
    }

    @Override // hc.y0
    public void f0(String str) {
        jo.p.h(str, "order");
        UnityManager.Companion.getInstance().setGroupOrder(str);
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_POSITION_SELECT);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b())));
        B5.sendLog(builder.build());
    }

    @Override // vb.f
    public void f2() {
        t5().f().p(null);
    }

    public final void f5() {
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        ArrayList<sd.b> arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        for (sd.b bVar : arrayList) {
            bVar.n3();
        }
    }

    public final void f7() {
        ClosetAvatar R = n5().R();
        if (R != null) {
            m5().s(n5().y0(), R);
        }
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        Puree.d(new Avatar.AvatarTakePicture(str));
        I5().captureScreenshot(UnityScreenShotAvatarPosition.CENTER, s5(), UnityReceiverKt.EMOMO_PHOTO_SIZE, UnityReceiverKt.EMOMO_PHOTO_SIZE, UnityReceiverKt.EMOMO);
    }

    public final void g5() {
        ClosetAvatarSimpleValue pose;
        String value;
        m5().d();
        ClosetAvatar R = n5().R();
        if (R != null && (pose = R.getPose()) != null && (value = pose.getValue()) != null) {
            UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), value, 0, 2, null);
        }
        UnityManager.Companion.getInstance().setCameraDolly(CameraDolly.DEFAULT);
        uo.l.d(this, null, null, new l(null), 3, null);
    }

    public final void g7(int i10) {
        boolean z10;
        List<EventBannerResponse> banners;
        boolean z11;
        List<EventBannerResponse> banners2;
        boolean z12;
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.S.setVisibility(i10);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        gVar3.M.setVisibility(i10);
        nf.h0 h0Var = this.U;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        EventNoticeResponse f10 = h0Var.q().f();
        boolean z13 = true;
        if (f10 != null && (banners2 = f10.getBanners()) != null && !banners2.isEmpty()) {
            for (EventBannerResponse eventBannerResponse : banners2) {
                Integer eventType = eventBannerResponse.getEventType();
                if (eventType != null && eventType.intValue() == 5) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        gVar4.U.setVisibility(z10 ? i10 : 8);
        nf.h0 h0Var2 = this.U;
        if (h0Var2 == null) {
            jo.p.v("store");
            h0Var2 = null;
        }
        EventNoticeResponse f11 = h0Var2.q().f();
        if (f11 != null && (banners = f11.getBanners()) != null && !banners.isEmpty()) {
            for (EventBannerResponse eventBannerResponse2 : banners) {
                Integer eventType2 = eventBannerResponse2.getEventType();
                if (eventType2 != null && eventType2.intValue() == 8) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
        }
        z13 = false;
        ac.g gVar5 = this.P;
        if (gVar5 == null) {
            jo.p.v("binding");
            gVar5 = null;
        }
        gVar5.f878x0.setVisibility(z13 ? i10 : 8);
        ac.g gVar6 = this.P;
        if (gVar6 == null) {
            jo.p.v("binding");
            gVar6 = null;
        }
        AppCompatImageView appCompatImageView = gVar6.f879y0;
        nf.h0 h0Var3 = this.U;
        if (h0Var3 == null) {
            jo.p.v("store");
            h0Var3 = null;
        }
        appCompatImageView.setVisibility(h0Var3.O().getValue().booleanValue() ? 0 : 8);
        if (v5().i()) {
            ac.g gVar7 = this.P;
            if (gVar7 == null) {
                jo.p.v("binding");
                gVar7 = null;
            }
            gVar7.f866l0.setVisibility(i10);
        }
        if (u5().e() && !z5().b()) {
            ac.g gVar8 = this.P;
            if (gVar8 == null) {
                jo.p.v("binding");
                gVar8 = null;
            }
            gVar8.f874t0.setVisibility(i10);
        }
        if (u5().o()) {
            ac.g gVar9 = this.P;
            if (gVar9 == null) {
                jo.p.v("binding");
                gVar9 = null;
            }
            gVar9.f864j0.setVisibility(i10);
        }
        nf.h0 h0Var4 = this.U;
        if (h0Var4 == null) {
            jo.p.v("store");
            h0Var4 = null;
        }
        if (h0Var4.t() != null) {
            ac.g gVar10 = this.P;
            if (gVar10 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar10;
            }
            gVar2.f861g0.setVisibility(i10);
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // vb.p
    public void h() {
        n6("EmomoDressUpShopDialog");
    }

    public final List<xb.a> h5(GiftItem giftItem) {
        ArrayList arrayList = new ArrayList();
        if (giftItem.getBecameCheerleader()) {
            arrayList.add(new a.C0995a(giftItem));
        }
        String liveSentGiftId = giftItem.getLiveSentGiftId();
        if (liveSentGiftId != null) {
            for (GiftRankingBcsvrResponse giftRankingBcsvrResponse : giftItem.getRankings()) {
                Boolean isLastSent = giftItem.isLastSent();
                Boolean bool = Boolean.TRUE;
                String str = null;
                if (jo.p.c(isLastSent, bool) && giftRankingBcsvrResponse.isAppEventRankUp()) {
                    Map<Integer, String> f10 = l5().n0().f();
                    if (jo.p.c(liveSentGiftId, f10 != null ? f10.getOrDefault(Integer.valueOf(giftRankingBcsvrResponse.getEventId()), "") : null)) {
                        int eventId = giftRankingBcsvrResponse.getEventId();
                        String str2 = this.Q;
                        if (str2 == null) {
                            jo.p.v("liveId");
                        } else {
                            str = str2;
                        }
                        arrayList.add(new a.b(eventId, giftItem, str, liveSentGiftId));
                    }
                }
                if (jo.p.c(giftItem.isLastSent(), bool) && giftRankingBcsvrResponse.isStreamerRankUp() && jo.p.c(liveSentGiftId, l5().p0().f())) {
                    int eventId2 = giftRankingBcsvrResponse.getEventId();
                    String str3 = this.Q;
                    if (str3 == null) {
                        jo.p.v("liveId");
                        str3 = null;
                    }
                    arrayList.add(new a.d(eventId2, giftItem, str3, liveSentGiftId));
                }
                if (jo.p.c(giftItem.isLastSent(), bool) && giftRankingBcsvrResponse.isSenderRankUp() && jo.p.c(giftItem.getLiveSentGiftId(), l5().p0().f())) {
                    int eventId3 = giftRankingBcsvrResponse.getEventId();
                    String str4 = this.Q;
                    if (str4 == null) {
                        jo.p.v("liveId");
                    } else {
                        str = str4;
                    }
                    arrayList.add(new a.c(eventId3, giftItem, str, liveSentGiftId));
                }
            }
        }
        return arrayList;
    }

    public final void h6(EventBannerResponse eventBannerResponse, EventBannerWhere eventBannerWhere) {
        o6(EventBannerActionType.EVENT_BANNER_IMP, eventBannerResponse, eventBannerWhere);
    }

    public final void h7() {
        View h10;
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        RecyclerView.p layoutManager = gVar.R.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (h10 = this.P0.h(linearLayoutManager)) == null) {
            return;
        }
        int o02 = linearLayoutManager.o0(h10);
        i5().k(o02);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar3;
        }
        RecyclerView.h adapter = gVar2.R.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankAdapter");
        List<ud.a> a10 = ((cc.b) adapter).a();
        jo.p.g(a10, "binding.currentUserGiftR…tRankAdapter).currentList");
        int i10 = 0;
        for (Object obj : a10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            ud.a aVar = (ud.a) obj;
            if (aVar instanceof cc.c) {
                ((cc.c) aVar).c().p(Boolean.valueOf(i10 == o02));
            }
            i10 = i11;
        }
    }

    @Override // vb.p
    public void i() {
        List<Closet> f10 = n5().K().f();
        if (f10 != null) {
            if ((!f10.isEmpty()) && f10.get(0).isUsed()) {
                T6();
                return;
            }
            m5().F(1);
            g5();
        }
    }

    @Override // vb.p
    public void i1() {
        n6("EmomoDressUpDialog");
        U6();
    }

    public final od.n0 i5() {
        return (od.n0) this.T.getValue();
    }

    public final void i6(EventBannerResponse eventBannerResponse, EventBannerWhere eventBannerWhere) {
        jo.p.h(eventBannerResponse, "eventBanner");
        jo.p.h(eventBannerWhere, MRLog.PAYLOAD_KEY_WHERE);
        h6(eventBannerResponse, eventBannerWhere);
    }

    @Override // vb.p
    public void j2(String str) {
        jo.p.h(str, "bannerUrl");
        l6(str);
    }

    public final ud.j j5() {
        return (ud.j) this.f23231r0.getValue();
    }

    public final void j6() {
        P5();
        Q6();
    }

    @Override // vb.p
    public void k1(Serializable serializable, boolean z10) {
        jo.p.h(serializable, MRLog.TARGET_TYPE_BANNER);
        if (serializable instanceof EventBannerResponse) {
            if (z10) {
                this.K0 = (EventBannerResponse) serializable;
                f.a aVar = ie.f.V0;
                String string = getString(xb.r.A0);
                jo.p.g(string, "getString(R.string.text_emomo_confirm_close)");
                f.a.b(aVar, string, getString(xb.r.S1), getString(xb.r.H), null, false, 24, null).z3(a3(), "DIALOG_TAG_DRESS_UP_EVENT_DIALOG");
                return;
            }
            m5().f();
            m5().d();
            R6();
            String str = this.Q;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            Puree.d(new Avatar.AvatarCloseCloset(str));
            U5((EventBannerResponse) serializable, EventBannerWhere.CAST_CLOSET);
        }
    }

    public final od.b k5() {
        return (od.b) this.f23228o0.getValue();
    }

    public final void k6(GiftRankingTopUser giftRankingTopUser) {
        ac.g gVar = this.P;
        if (gVar == null) {
            return;
        }
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        AppCompatImageView appCompatImageView = gVar.f876v0;
        if (TextUtils.isEmpty(giftRankingTopUser.getUserId())) {
            appCompatImageView.setImageResource(xb.n.ic_viewers_gift_ranking_for_stream_emomo);
            ac.g gVar3 = this.P;
            if (gVar3 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar3;
            }
            gVar2.f875u0.setVisibility(8);
            return;
        }
        jo.p.g(appCompatImageView, "it");
        td.a.i(appCompatImageView, giftRankingTopUser.getIconUrl());
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar4;
        }
        gVar2.f875u0.setVisibility(0);
    }

    @Override // je.d
    public void l() {
        n6("EmomoRegistrationDialog");
        S6();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    @Override // vb.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l0() {
        /*
            r7 = this;
            od.f r0 = r7.o5()
            jf.k r1 = jf.k.MATCHING_TIMEOUT
            r0.p(r1)
            nf.c r0 = r7.l5()
            androidx.lifecycle.e0 r0 = r0.s0()
            java.lang.Object r0 = r0.f()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L28
            int r0 = r0.length()
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != r1) goto L28
            r0 = r1
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L36
            java.lang.String r3 = r7.Q
            if (r3 != 0) goto L44
            java.lang.String r3 = "liveId"
            jo.p.v(r3)
            r3 = 0
            goto L44
        L36:
            nf.c r3 = r7.l5()
            androidx.lifecycle.e0 r3 = r3.s0()
            java.lang.Object r3 = r3.f()
            java.lang.String r3 = (java.lang.String) r3
        L44:
            if (r3 == 0) goto L4f
            od.g r4 = r7.p5()
            java.lang.String r5 = "broadcast.avatar"
            r4.d(r5, r3, r0)
        L4f:
            be.z$a r0 = be.z.P0
            int r3 = xb.r.text_collab_matching_not_found
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "getString(R.string.text_collab_matching_not_found)"
            jo.p.g(r3, r4)
            be.z r0 = r0.a(r3)
            androidx.fragment.app.FragmentManager r3 = r7.a3()
            java.lang.String r4 = "CollabMatchingRetryDialog"
            r0.A3(r3, r4)
            com.dena.mirrorman.clientlog.logs.MRLogger r0 = r7.B5()
            com.dena.mirrorman.clientlog.logs.MRLog$Companion r3 = com.dena.mirrorman.clientlog.logs.MRLog.Companion
            com.dena.mirrorman.clientlog.logs.MRLog$Builder r3 = new com.dena.mirrorman.clientlog.logs.MRLog$Builder
            java.lang.String r4 = "collab_matching.start_failure_notice"
            r3.<init>(r4)
            r4 = 3
            wn.k[] r4 = new wn.k[r4]
            kf.m r5 = r7.A5()
            java.lang.String r5 = r5.b()
            java.lang.String r6 = "live_id"
            wn.k r5 = wn.q.a(r6, r5)
            r4[r2] = r5
            kf.x r2 = r7.M5()
            java.lang.String r2 = r2.T4()
            java.lang.String r5 = "cast_id"
            wn.k r2 = wn.q.a(r5, r2)
            r4[r1] = r2
            r1 = 2
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r5 = "error_type"
            java.lang.String r6 = "1"
            r2.put(r5, r6)
            wn.v r5 = wn.v.f59242a
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "target_detail"
            wn.k r2 = wn.q.a(r5, r2)
            r4[r1] = r2
            java.util.List r1 = xn.s.m(r4)
            r3.setPayload(r1)
            com.dena.mirrorman.clientlog.logs.MRLog r1 = r3.build()
            r0.sendLog(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.l0():void");
    }

    @Override // vb.v
    public void l1() {
        n6("ShooterDressUpDialog");
        J6(this, null, 1, null);
        Boolean f10 = n5().D().f();
        if (f10 == null) {
            f10 = Boolean.FALSE;
        }
        if (f10.booleanValue()) {
            m5().C(jf.m0.COMPANION);
            X6();
            return;
        }
        i();
    }

    public final nf.c l5() {
        return (nf.c) this.f23229p0.getValue();
    }

    public final void l6(String str) {
        jf.b0 a10 = K5().a(str);
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(EventBannerActionType.AVATAR_ITEM_BANNER_CLICK.getRawValue());
        ClosetAvatar R = n5().R();
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new AvatarItemBannerClickTargetDetail(str, R != null ? UpdateClosetAvatarRequest.Companion.convert(R, n5().y0()) : null).toJson())));
        B5.sendLog(builder.build());
        if (!(a10 instanceof b0.l0)) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.CLOSET, a10));
        } else {
            startActivity(WebViewActivity.a.b(WebViewActivity.X, this, str, false, false, 12, null));
        }
    }

    @Override // bc.s
    public void m0() {
        n6("EmokaraHeadsetAlertDialog");
    }

    public final od.e m5() {
        return (od.e) this.f23216c0.getValue();
    }

    public final void m6(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ac.g gVar = this.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        Editable editableText = gVar.L.getEditableText();
        if (editableText != null) {
            editableText.clear();
        }
        k5().F(str);
        I5().setMyLiveComment(str);
    }

    public final nf.f n5() {
        return (nf.f) this.f23215b0.getValue();
    }

    public final void n6(String str) {
        Fragment e02 = a3().e0(str);
        if (e02 != null) {
            a3().k().q(e02).j();
        }
    }

    public final od.f o5() {
        return (od.f) this.Z.getValue();
    }

    public final void o6(EventBannerActionType eventBannerActionType, EventBannerResponse eventBannerResponse, EventBannerWhere eventBannerWhere) {
        String str;
        String str2;
        EventBannerTargetType e10 = nd.c.Companion.a(eventBannerResponse.getType()).e();
        String title = eventBannerResponse.getTitle();
        String str3 = this.Q;
        if (str3 == null) {
            jo.p.v("liveId");
            str = null;
        } else {
            str = str3;
        }
        Integer f10 = t5().h().f();
        if (f10 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("current_rank", f10.intValue());
            str2 = jSONObject.toString();
        } else {
            str2 = null;
        }
        Puree.d(new EventBannerLog(eventBannerActionType, e10, title, eventBannerWhere, str, str2));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.i iVar) {
        jo.p.h(iVar, "event");
        j5().T(true);
        k5().E(iVar.a(), jf.a.GAME_ID, iVar.b(), iVar.c());
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        } else {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        d5();
        c5();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        dq.c.c().p(this);
        ViewDataBinding g10 = androidx.databinding.f.g(this, xb.p.activity_stream_emomo);
        jo.p.g(g10, "setContentView(this, R.l…ut.activity_stream_emomo)");
        this.P = (ac.g) g10;
        this.Q = z5().c();
        this.U = (nf.h0) ((androidx.lifecycle.q0) new androidx.lifecycle.s0(jo.f0.b(nf.h0.class), new c0(this), new b0(new a0(this), null, null, gq.a.a(this))).getValue());
        FragmentManager a32 = a3();
        int i10 = xb.o.M;
        if (a32.d0(i10) == null) {
            a3().k().s(i10, gf.w.B0.a(), "EmomoStreamViewFragment").i();
        }
        uo.l.d(this, null, null, new d0(null), 3, null);
        uo.l.d(this, null, null, new m0(null), 3, null);
        uo.l.d(this, null, null, new r0(null), 3, null);
        uo.l.d(this, null, null, new y0(null), 3, null);
        F5().f().p(Boolean.TRUE);
        F5().g().i(this, cc.k0.f19074a);
        if (bundle != null) {
            n6("EmomoDressUpDialog");
            n6("EmomoPoseDialog");
            n6("EmomoDressUpShopDialog");
            wn.v vVar = wn.v.f59242a;
        }
        int intExtra = getIntent().getIntExtra("EXTRA_PART_TYPE_ID", -1);
        if (intExtra != -1) {
            P5();
            if (intExtra == 52) {
                S6();
            } else {
                I6(Integer.valueOf(intExtra));
            }
        } else {
            R6();
        }
        ac.g gVar = this.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.K.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ac.g gVar2 = this.P;
        if (gVar2 == null) {
            jo.p.v("binding");
            gVar2 = null;
        }
        RecyclerView recyclerView = gVar2.K;
        rd.i iVar = new rd.i();
        iVar.d(new c1());
        wn.v vVar2 = wn.v.f59242a;
        recyclerView.setAdapter(iVar);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        AppCompatImageView appCompatImageView = gVar3.f863i0;
        jo.p.g(appCompatImageView, "binding.inviteCollabImageView");
        yd.g1.a(appCompatImageView, new d1());
        ac.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        AppCompatImageView appCompatImageView2 = gVar4.J;
        jo.p.g(appCompatImageView2, "binding.collabMatchingImageView");
        yd.g1.a(appCompatImageView2, new e1());
        ac.g gVar5 = this.P;
        if (gVar5 == null) {
            jo.p.v("binding");
            gVar5 = null;
        }
        LottieAnimationView lottieAnimationView = gVar5.f871q0;
        jo.p.g(lottieAnimationView, "binding.matchingWaitingLottieAnimationView");
        yd.g1.a(lottieAnimationView, new e0());
        ac.g gVar6 = this.P;
        if (gVar6 == null) {
            jo.p.v("binding");
            gVar6 = null;
        }
        LottieAnimationView lottieAnimationView2 = gVar6.f870p0;
        jo.p.g(lottieAnimationView2, "binding.matchingResultLottieAnimationView");
        yd.g1.a(lottieAnimationView2, new f0());
        ac.g gVar7 = this.P;
        if (gVar7 == null) {
            jo.p.v("binding");
            gVar7 = null;
        }
        AppCompatImageView appCompatImageView3 = gVar7.f869o0;
        jo.p.g(appCompatImageView3, "binding.matchedStarterImageView");
        yd.g1.a(appCompatImageView3, new g0());
        ac.g gVar8 = this.P;
        if (gVar8 == null) {
            jo.p.v("binding");
            gVar8 = null;
        }
        AppCompatImageView appCompatImageView4 = gVar8.f868n0;
        jo.p.g(appCompatImageView4, "binding.matchedHostImageView");
        yd.g1.a(appCompatImageView4, new h0());
        i5().j();
        l5().m0().i(this, new androidx.lifecycle.f0() { // from class: cc.a0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.e6(StreamEmomoActivity.this, (Boolean) obj);
            }
        });
        nf.h0 h0Var = this.U;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        h0Var.q().i(this, new androidx.lifecycle.f0() { // from class: cc.s0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.f6(StreamEmomoActivity.this, (EventNoticeResponse) obj);
            }
        });
        i5().l();
        uo.l.d(this, null, null, new i0(null), 3, null);
        uo.l.d(this, null, null, new j0(null), 3, null);
        uo.l.d(this, null, null, new k0(null), 3, null);
        uo.l.d(this, null, null, new l0(null), 3, null);
        uo.l.d(this, null, null, new n0(null), 3, null);
        uo.l.d(this, null, null, new o0(null), 3, null);
        uo.l.d(this, null, null, new p0(null), 3, null);
        uo.l.d(this, null, null, new q0(null), 3, null);
        ac.g gVar9 = this.P;
        if (gVar9 == null) {
            jo.p.v("binding");
            gVar9 = null;
        }
        gVar9.f863i0.setVisibility((!v5().w() || r5().E()) ? 8 : 0);
        Boolean bool = Boolean.FALSE;
        LiveData<List<LiveViewingUser>> R = l5().R();
        LiveData<Boolean> L0 = l5().L0();
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(bool);
        for (LiveData liveData : xn.s.m(R, L0)) {
            c0Var.q(liveData, new x(c0Var, R, L0));
        }
        LiveData a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        a10.i(this, new androidx.lifecycle.f0() { // from class: cc.z
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.g6(StreamEmomoActivity.this, (Boolean) obj);
            }
        });
        l5().R().i(this, new androidx.lifecycle.f0() { // from class: cc.h0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.Y5(StreamEmomoActivity.this, (List) obj);
            }
        });
        Boolean bool2 = Boolean.FALSE;
        LiveData<List<LiveViewingUser>> R2 = l5().R();
        LiveData<Boolean> J0 = l5().J0();
        androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0();
        c0Var2.p(bool2);
        for (LiveData liveData2 : xn.s.m(R2, J0)) {
            c0Var2.q(liveData2, new y(c0Var2, R2, J0));
        }
        LiveData a11 = androidx.lifecycle.p0.a(c0Var2);
        jo.p.g(a11, "distinctUntilChanged(this)");
        a11.i(this, new androidx.lifecycle.f0() { // from class: cc.d0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.Z5(StreamEmomoActivity.this, (Boolean) obj);
            }
        });
        jf.p0 y10 = r5().y();
        if (y10 != null) {
            be.d0.Q0.a(y10).A3(a3(), "CollabReconnectingDialog");
            wn.v vVar3 = wn.v.f59242a;
        }
        n5().N0().i(this, new androidx.lifecycle.f0() { // from class: cc.b0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.a6(StreamEmomoActivity.this, (Boolean) obj);
            }
        });
        l5().H0().i(this, new androidx.lifecycle.f0() { // from class: cc.c0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.b6(StreamEmomoActivity.this, (Boolean) obj);
            }
        });
        l5().O().i(this, new androidx.lifecycle.f0() { // from class: cc.q0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.c6(StreamEmomoActivity.this, (jf.i) obj);
            }
        });
        Boolean bool3 = Boolean.FALSE;
        LiveData<Boolean> L02 = l5().L0();
        LiveData<Boolean> y02 = l5().y0();
        LiveData<Boolean> H0 = l5().H0();
        androidx.lifecycle.c0 c0Var3 = new androidx.lifecycle.c0();
        c0Var3.p(bool3);
        for (LiveData liveData3 : xn.s.m(L02, y02, H0)) {
            c0Var3.q(liveData3, new z(c0Var3, L02, y02, H0));
        }
        LiveData a12 = androidx.lifecycle.p0.a(c0Var3);
        jo.p.g(a12, "distinctUntilChanged(this)");
        a12.i(this, new androidx.lifecycle.f0() { // from class: cc.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.d6(StreamEmomoActivity.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new t0(null), 3, null);
        uo.l.d(this, null, null, new u0(null), 3, null);
        uo.l.d(this, null, null, new v0(null), 3, null);
        uo.l.d(this, null, null, new w0(null), 3, null);
        uo.l.d(this, null, null, new x0(null), 3, null);
        uo.l.d(this, null, null, new z0(null), 3, null);
        uo.l.d(this, null, null, new a1(null), 3, null);
        uo.l.d(this, null, null, new b1(null), 3, null);
        q6();
        androidx.fragment.app.z k10 = a3().k();
        ac.g gVar10 = this.P;
        if (gVar10 == null) {
            jo.p.v("binding");
            gVar10 = null;
        }
        k10.r(gVar10.O.getId(), StreamEmomoCommentFragment.a.b(StreamEmomoCommentFragment.B0, false, 1, null)).i();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        nf.h0 h0Var = this.U;
        ac.g gVar = null;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        List<GroupShotViewer> G = h0Var.G();
        if (G != null) {
            i5().i(G);
        }
        uo.d2 d2Var = this.O0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        uo.r0.d(this, null, 1, null);
        d2.a.a(this.f23227n0, null, 1, null);
        d2.a.a(this.J0, null, 1, null);
        UnityManager.Companion.getInstance().initGifting(false);
        dq.c.c().r(this);
        uo.d2 d2Var2 = this.f23223j0;
        if (d2Var2 != null) {
            d2.a.a(d2Var2, null, 1, null);
        }
        uo.d2 d2Var3 = this.f23224k0;
        if (d2Var3 != null) {
            d2.a.a(d2Var3, null, 1, null);
        }
        ac.g gVar2 = this.P;
        if (gVar2 == null) {
            jo.p.v("binding");
        } else {
            gVar = gVar2;
        }
        gVar.u().getViewTreeObserver().removeOnGlobalLayoutListener(this.f23226m0);
        d7();
        super.onDestroy();
    }

    @dq.l
    public final void onEvent(ye.a aVar) {
        jo.p.h(aVar, "events");
        if (aVar.h()) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    @Override // androidx.fragment.app.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208 A[LOOP:3: B:75:0x0202->B:77:0x0208, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.streaming.emomo.StreamEmomoActivity.onResume():void");
    }

    @Override // hc.t
    public void p0() {
        R6();
        this.f23219f0.c(new o());
        t5().f().p(this.f23233t0);
        od.n0 i52 = i5();
        nf.h0 h0Var = this.U;
        ac.g gVar = null;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        i52.i(h0Var.G());
        ac.g gVar2 = this.P;
        if (gVar2 == null) {
            jo.p.v("binding");
            gVar2 = null;
        }
        gVar2.f861g0.setVisibility(8);
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
        } else {
            gVar = gVar3;
        }
        gVar.f861g0.h();
    }

    @Override // je.a
    public void p2(jf.c0 c0Var) {
        ClosetAvatarSimpleValue motion2;
        jo.p.h(c0Var, "direction");
        if (l5().O0().getValue().booleanValue() && this.R) {
            return;
        }
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof hc.x0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return;
        }
        String str = null;
        if (this.f23218e0 != null) {
            int i10 = b.f23254c[c0Var.ordinal()];
            if (i10 == 1) {
                UnityManager companion = UnityManager.Companion.getInstance();
                UnityAnimation unityAnimation = UnityAnimation.EMOKARA_LEFT_FLICK;
                UnityManager.setAnimation$default(companion, unityAnimation, 0, 2, null);
                String str2 = this.Q;
                if (str2 == null) {
                    jo.p.v("liveId");
                } else {
                    str = str2;
                }
                Puree.d(new Avatar.AvatarGesture(str, unityAnimation.getRawValue()));
                return;
            } else if (i10 != 2) {
                return;
            } else {
                UnityManager companion2 = UnityManager.Companion.getInstance();
                UnityAnimation unityAnimation2 = UnityAnimation.EMOKARA_RIGHT_FLICK;
                UnityManager.setAnimation$default(companion2, unityAnimation2, 0, 2, null);
                String str3 = this.Q;
                if (str3 == null) {
                    jo.p.v("liveId");
                } else {
                    str = str3;
                }
                Puree.d(new Avatar.AvatarGesture(str, unityAnimation2.getRawValue()));
                return;
            }
        }
        int i11 = b.f23254c[c0Var.ordinal()];
        if (i11 == 1) {
            ClosetAvatar N = n5().N();
            if (N != null) {
                motion2 = N.getMotion2();
            }
            motion2 = null;
        } else if (i11 == 2) {
            ClosetAvatar N2 = n5().N();
            if (N2 != null) {
                motion2 = N2.getMotion3();
            }
            motion2 = null;
        } else if (i11 == 3) {
            ClosetAvatar N3 = n5().N();
            if (N3 != null) {
                motion2 = N3.getMotion1();
            }
            motion2 = null;
        } else if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            ClosetAvatar N4 = n5().N();
            if (N4 != null) {
                motion2 = N4.getMotion4();
            }
            motion2 = null;
        }
        if (motion2 != null) {
            UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), motion2.getValue(), 0, 2, null);
            String str4 = this.Q;
            if (str4 == null) {
                jo.p.v("liveId");
            } else {
                str = str4;
            }
            Puree.d(new Avatar.AvatarGesture(str, motion2.getId()));
        }
    }

    public final od.g p5() {
        return (od.g) this.F0.getValue();
    }

    public final void p6(boolean z10) {
        ac.g gVar = this.P;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.f874t0.setClickable(z10);
        gVar.E.setClickable(z10);
        gVar.M.setClickable(z10);
    }

    @Override // be.d3
    public void q1() {
        d3.a.a(this);
    }

    public final nf.g q5() {
        return (nf.g) this.C0.getValue();
    }

    public final void q6() {
        ac.g gVar = this.P;
        ac.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        gVar.H.setOnClickListener(new View.OnClickListener() { // from class: cc.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamEmomoActivity.r6(StreamEmomoActivity.this, view);
            }
        });
        ac.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        gVar3.N.setVisibility(4);
        if (!z5().b() && u5().e()) {
            ac.g gVar4 = this.P;
            if (gVar4 == null) {
                jo.p.v("binding");
                gVar4 = null;
            }
            gVar4.f874t0.setVisibility(0);
            ac.g gVar5 = this.P;
            if (gVar5 == null) {
                jo.p.v("binding");
                gVar5 = null;
            }
            ConstraintLayout constraintLayout = gVar5.f874t0;
            jo.p.g(constraintLayout, "binding.rankingContainer");
            yd.g1.a(constraintLayout, new y1());
        }
        if (u5().o()) {
            ac.g gVar6 = this.P;
            if (gVar6 == null) {
                jo.p.v("binding");
                gVar6 = null;
            }
            gVar6.f864j0.setVisibility(0);
        }
        ac.g gVar7 = this.P;
        if (gVar7 == null) {
            jo.p.v("binding");
            gVar7 = null;
        }
        gVar7.E.setOnClickListener(new View.OnClickListener() { // from class: cc.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamEmomoActivity.s6(StreamEmomoActivity.this, view);
            }
        });
        ac.g gVar8 = this.P;
        if (gVar8 == null) {
            jo.p.v("binding");
            gVar8 = null;
        }
        AppCompatButton appCompatButton = gVar8.f864j0;
        jo.p.g(appCompatButton, "binding.karaokeButton");
        yd.g1.a(appCompatButton, new j2());
        ac.g gVar9 = this.P;
        if (gVar9 == null) {
            jo.p.v("binding");
            gVar9 = null;
        }
        gVar9.Y.setOnClickListener(new View.OnClickListener() { // from class: cc.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamEmomoActivity.t6(StreamEmomoActivity.this, view);
            }
        });
        ac.g gVar10 = this.P;
        if (gVar10 == null) {
            jo.p.v("binding");
            gVar10 = null;
        }
        AppCompatButton appCompatButton2 = gVar10.f877w0;
        jo.p.g(appCompatButton2, "binding.shooterButton");
        yd.g1.a(appCompatButton2, new k2());
        ac.g gVar11 = this.P;
        if (gVar11 == null) {
            jo.p.v("binding");
            gVar11 = null;
        }
        AppCompatButton appCompatButton3 = gVar11.U;
        jo.p.g(appCompatButton3, "binding.emomoRunButton");
        yd.g1.a(appCompatButton3, new l2());
        ac.g gVar12 = this.P;
        if (gVar12 == null) {
            jo.p.v("binding");
            gVar12 = null;
        }
        ConstraintLayout constraintLayout2 = gVar12.f866l0;
        jo.p.g(constraintLayout2, "binding.livegameListContainer");
        yd.g1.a(constraintLayout2, new m2());
        ac.g gVar13 = this.P;
        if (gVar13 == null) {
            jo.p.v("binding");
            gVar13 = null;
        }
        gVar13.B.setOnClickListener(new View.OnClickListener() { // from class: cc.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamEmomoActivity.u6(StreamEmomoActivity.this, view);
            }
        });
        l5().N().i(this, new androidx.lifecycle.f0() { // from class: cc.r0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.v6(StreamEmomoActivity.this, (AppUserDetailResponse) obj);
            }
        });
        l5().V().i(this, new androidx.lifecycle.f0() { // from class: cc.f0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.w6(StreamEmomoActivity.this, (Integer) obj);
            }
        });
        l5().j0().i(this, new androidx.lifecycle.f0() { // from class: cc.j0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.x6(StreamEmomoActivity.this, (wn.k) obj);
            }
        });
        l5().g0().i(this, new androidx.lifecycle.f0() { // from class: cc.x
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.y6(StreamEmomoActivity.this, (FeverValue) obj);
            }
        });
        ac.g gVar14 = this.P;
        if (gVar14 == null) {
            jo.p.v("binding");
            gVar14 = null;
        }
        GiftGachaView giftGachaView = gVar14.f856b0;
        giftGachaView.setOnClickGiftGachaStock(new i1());
        giftGachaView.setOnClickGiftGachaMutualGift(new j1());
        uo.l.d(this, null, null, new k1(null), 3, null);
        uo.l.d(this, null, null, new l1(null), 3, null);
        uo.l.d(this, null, null, new m1(null), 3, null);
        uo.l.d(this, null, null, new n1(null), 3, null);
        uo.l.d(this, null, null, new o1(null), 3, null);
        uo.l.d(this, null, null, new p1(null), 3, null);
        uo.l.d(this, null, null, new q1(null), 3, null);
        uo.l.d(this, null, null, new r1(null), 3, null);
        uo.l.d(this, null, null, new s1(null), 3, null);
        uo.l.d(this, null, null, new t1(null), 3, null);
        uo.l.d(this, null, null, new u1(null), 3, null);
        uo.l.d(this, null, null, new v1(null), 3, null);
        uo.l.d(this, null, null, new w1(null), 3, null);
        ac.g gVar15 = this.P;
        if (gVar15 == null) {
            jo.p.v("binding");
            gVar15 = null;
        }
        gVar15.M.setOnClickListener(new View.OnClickListener() { // from class: cc.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamEmomoActivity.z6(StreamEmomoActivity.this, view);
            }
        });
        ac.g gVar16 = this.P;
        if (gVar16 == null) {
            jo.p.v("binding");
            gVar16 = null;
        }
        gVar16.L.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: cc.p0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean A6;
                A6 = StreamEmomoActivity.A6(StreamEmomoActivity.this, textView, i10, keyEvent);
                return A6;
            }
        });
        ac.g gVar17 = this.P;
        if (gVar17 == null) {
            jo.p.v("binding");
            gVar17 = null;
        }
        gVar17.L.addTextChangedListener(new z1());
        ac.g gVar18 = this.P;
        if (gVar18 == null) {
            jo.p.v("binding");
            gVar18 = null;
        }
        gVar18.P.setOnClickListener(new View.OnClickListener() { // from class: cc.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StreamEmomoActivity.B6(StreamEmomoActivity.this, view);
            }
        });
        ac.g gVar19 = this.P;
        if (gVar19 == null) {
            jo.p.v("binding");
            gVar19 = null;
        }
        gVar19.T.setEmomoMotionViewListener(this);
        if (H5().L4()) {
            ac.g gVar20 = this.P;
            if (gVar20 == null) {
                jo.p.v("binding");
                gVar20 = null;
            }
            gVar20.f880z0.setVisibility(0);
            a2 a2Var = new a2();
            ac.g gVar21 = this.P;
            if (gVar21 == null) {
                jo.p.v("binding");
                gVar21 = null;
            }
            gVar21.f864j0.getViewTreeObserver().addOnGlobalLayoutListener(a2Var);
            p6(false);
            this.f23226m0 = a2Var;
        }
        t5().g().i(this, new androidx.lifecycle.f0() { // from class: cc.w
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.C6(StreamEmomoActivity.this, (EventNoticeResponse) obj);
            }
        });
        n5().P1().i(this, new androidx.lifecycle.f0() { // from class: cc.e0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.D6(StreamEmomoActivity.this, (Boolean) obj);
            }
        });
        od.b k52 = k5();
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        k52.s(str);
        ac.g gVar22 = this.P;
        if (gVar22 == null) {
            jo.p.v("binding");
            gVar22 = null;
        }
        RecyclerView recyclerView = gVar22.R;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 0, false));
        cc.b bVar = new cc.b(this);
        bVar.i(new c2());
        recyclerView.setAdapter(bVar);
        jo.p.g(recyclerView, "");
        recyclerView.g(new p001if.c(de.n.b(recyclerView, 3), 0, 0, 0, 0, 0));
        recyclerView.k(new d2());
        androidx.recyclerview.widget.s sVar = this.P0;
        ac.g gVar23 = this.P;
        if (gVar23 == null) {
            jo.p.v("binding");
            gVar23 = null;
        }
        sVar.b(gVar23.R);
        l5().l0().i(this, new androidx.lifecycle.f0() { // from class: cc.i0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                StreamEmomoActivity.E6(StreamEmomoActivity.this, (List) obj);
            }
        });
        androidx.lifecycle.v.a(this).e(new f2(null));
        uo.l.d(this, null, null, new g2(null), 3, null);
        i5().h();
        uo.l.d(this, null, null, new h2(null), 3, null);
        androidx.lifecycle.v.a(this).e(new i2(null));
        ac.g gVar24 = this.P;
        if (gVar24 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar24;
        }
        WebSettings settings = gVar2.X.getSettings();
        jo.p.g(settings, "binding.eventWebview.settings");
        Q5(settings);
        H5().g2(false);
        Y6();
    }

    @Override // bc.s
    public void r() {
        ClosetAvatar f10;
        ClosetBackground background;
        String url;
        jf.c f11 = n5().I().f();
        if (f11 != null && (f10 = f11.f()) != null && (background = f10.getBackground()) != null && (url = background.getUrl()) != null) {
            G2(url);
        }
        UnityManager.Companion companion = UnityManager.Companion;
        companion.getInstance().initEmokara(false, 0.0f);
        companion.getInstance().getCollabAvatarManager().restartCollabMode();
        File file = this.f23233t0;
        if (file != null) {
            t5().f().p(file);
            this.f23233t0 = null;
        }
        this.f23234u0 = null;
    }

    @Override // bc.s
    public void r0(Karaoke karaoke, boolean z10) {
        jo.p.h(karaoke, "karaoke");
        N6(karaoke, z10);
    }

    @Override // vb.p
    public void r1(boolean z10) {
        if (!z10) {
            m5().d();
            R6();
            UnityManager.Companion.getInstance().getCollabAvatarManager().restartCollabMode();
            String str = this.Q;
            if (str == null) {
                jo.p.v("liveId");
                str = null;
            }
            Puree.d(new Avatar.AvatarCloseCloset(str));
            return;
        }
        H6();
    }

    @Override // gf.v0
    public void r2() {
        EventBannerResponse eventBannerResponse = this.M0;
        if (eventBannerResponse != null) {
            U5(eventBannerResponse, EventBannerWhere.CAST_LOWER_RIGHT);
        }
    }

    public final nf.h r5() {
        return (nf.h) this.f23214a0.getValue();
    }

    @Override // gf.v0
    public void s2(String str) {
        jo.p.h(str, "lpUrl");
        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, str, false, false, 12, null));
    }

    public final String s5() {
        return (String) this.N0.getValue();
    }

    @Override // vb.p
    public void t1() {
        F6();
    }

    public final je.e t5() {
        return (je.e) this.f23220g0.getValue();
    }

    @Override // be.i1
    public void u() {
    }

    @Override // gf.v0
    public void u0(String str) {
        jo.p.h(str, "url");
        of.n.r(this, str);
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
        builder.setTargetType("url");
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, z5().c())));
        B5.sendLog(builder.build());
    }

    public final hf.r u5() {
        return (hf.r) this.f23235v0.getValue();
    }

    @Override // vb.k
    public void v1(boolean z10) {
        od.b k52 = k5();
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        k52.a0(Referer.BROADCAST_AVATAR, str, z10);
    }

    public final nf.k v5() {
        return (nf.k) this.A0.getValue();
    }

    public final hf.w w5() {
        return (hf.w) this.B0.getValue();
    }

    @Override // be.a0
    public void x1() {
        if (r5().q() != null) {
            o5().k();
        }
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_CLOSE);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, M5().T4()), wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, A5().h())));
        B5.sendLog(builder.build());
        uo.l.d(this, null, null, new w(null), 3, null);
    }

    @Override // bc.s
    public void x2() {
        L6();
    }

    public final cc.f x5() {
        return (cc.f) this.V.getValue();
    }

    @Override // be.a0
    public void y1() {
        od.g p52 = p5();
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        p52.e(Referer.BROADCAST_AVATAR, str, true);
        be.c0.P0.a().z3(a3(), "CollabMatchingWaitingDialog");
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_RESTART);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, M5().T4()), wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, A5().h())));
        B5.sendLog(builder.build());
    }

    @Override // vb.p
    public void y2(Parcelable parcelable, boolean z10) {
        jo.p.h(parcelable, "equipAvatars");
        if (parcelable instanceof ke.a) {
            if (z10) {
                b.a aVar = ie.b.P0;
                String string = getString(xb.r.K);
                jo.p.g(string, "getString(R.string.text_canning_alert_title)");
                aVar.a(string, getString(xb.r.J), getString(xb.r.S1)).z3(a3(), "CustomMessageDialog");
                return;
            }
            b7();
            uo.l.d(uo.r0.a(uo.g1.c().plus(this.J0)), null, null, new g1(parcelable, null), 3, null);
        }
    }

    public final tb.c y5() {
        return (tb.c) this.H0.getValue();
    }

    @Override // bc.s
    public void z() {
        K6();
    }

    @Override // je.a
    public void z0(String str) {
        jo.p.h(str, "targetDetail");
        Puree.d(new Avatar.AvatarZoom(a3().e0("EmomoDressUpDialog") != null ? "live.avatar_closet" : MRLog.TARGET_TYPE_LIVE, str));
    }

    @Override // bc.s
    public void z1() {
        uo.l.d(uo.r0.a(uo.g1.c().plus(this.J0)), null, null, new f1(null), 3, null);
    }

    public final hf.d0 z5() {
        return (hf.d0) this.f23236w0.getValue();
    }

    @dq.l
    public final void onEvent(t.c cVar) {
        jo.p.h(cVar, "event");
        finish();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.d dVar) {
        jo.p.h(dVar, "event");
        k5().p(z5().c());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(w.a aVar) {
        jo.p.h(aVar, "event");
        k6(aVar.a());
        bc.q qVar = this.f23218e0;
        if (qVar != null) {
            qVar.m4(aVar.a());
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.e eVar) {
        jo.p.h(eVar, "event");
        k5().o(z5().c());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.g gVar) {
        jo.p.h(gVar, "event");
        App.AppParams appParams = this.f23222i0;
        if (appParams != null) {
            be.i.Q0.a(appParams).z3(a3(), "AppUserIdBottomSheetDialogFragment");
        }
    }

    @dq.l
    public final void onEvent(w.b bVar) {
        jo.p.h(bVar, "event");
        e5();
    }

    @dq.l
    public final void onEvent(k.a aVar) {
        jo.p.h(aVar, "event");
        U5(aVar.a(), EventBannerWhere.CAST_COMMENT_LIST);
    }

    @dq.l
    public final void onEvent(t.l lVar) {
        jo.p.h(lVar, "event");
        t5().h().p(Integer.valueOf(lVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.j jVar) {
        jo.p.h(jVar, "event");
        j5().C().m(Boolean.TRUE);
        j5().p().m(j5().z().f());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.f fVar) {
        AppUserDetailResponse appUserDetail;
        String userId;
        String appId;
        jo.p.h(fVar, "event");
        App.AppParams appParams = this.f23222i0;
        if (appParams == null || (appUserDetail = appParams.getAppUserDetail()) == null || (userId = appUserDetail.getUserId()) == null) {
            return;
        }
        ClipData clipData = new ClipData(new ClipDescription("text_data", new String[]{"text/plain"}), new ClipData.Item(userId));
        Object systemService = getSystemService("clipboard");
        jo.p.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(clipData);
        of.n.A(this, xb.r.text_view_game_id_copy_toast, false);
        App.AppParams appParams2 = this.f23222i0;
        if (appParams2 == null || (appId = appParams2.getAppId()) == null) {
            return;
        }
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_CAST_GAME_ID_TAP);
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setTargetId(appId);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b())));
        B5.sendLog(builder.build());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.h hVar) {
        AppUserDetailResponse appUserDetail;
        String url;
        String appId;
        jo.p.h(hVar, "event");
        App.AppParams appParams = this.f23222i0;
        if (appParams == null || (appUserDetail = appParams.getAppUserDetail()) == null || (url = appUserDetail.getUrl()) == null) {
            return;
        }
        of.n.r(this, url);
        App.AppParams appParams2 = this.f23222i0;
        if (appParams2 == null || (appId = appParams2.getAppId()) == null) {
            return;
        }
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_CAST_GAME_ID_URL_TAP);
        builder.setTargetType("url");
        builder.setTargetId(appId);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b())));
        B5.sendLog(builder.build());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.b bVar) {
        jo.p.h(bVar, "event");
        r.a aVar = be.r.f18061c1;
        String f10 = j5().k().f();
        if (f10 == null) {
            f10 = getResources().getString(xb.r.f60089v0);
        }
        String str = f10;
        String f11 = j5().i().f();
        if (f11 == null) {
            f11 = "";
        }
        String str2 = f11;
        Boolean f12 = j5().B().f();
        if (f12 == null) {
            f12 = Boolean.FALSE;
        }
        Boolean f13 = j5().G().f();
        if (f13 == null) {
            f13 = Boolean.FALSE;
        }
        jo.p.g(str, "appUserIdSettingBindMode…efault_app_user_id_label)");
        r.a.b(aVar, Referer.BROADCAST_AVATAR, str, f12.booleanValue(), str2, f13.booleanValue(), true, 0, 0, false, false, 960, null).z3(a3(), "AppUserIdSettingDialog");
        j5().C().m(Boolean.TRUE);
        j5().p().m(j5().z().f());
        MRLogger B5 = B5();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GAME_ID_EDIT_IMP);
        builder.setTargetId(bVar.a());
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setPageId(Referer.BROADCAST_AVATAR);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, A5().b())));
        B5.sendLog(builder.build());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.a aVar) {
        jo.p.h(aVar, "event");
        k5().q(aVar.a());
        r.a aVar2 = be.r.f18061c1;
        String f10 = j5().k().f();
        if (f10 == null) {
            f10 = getResources().getString(xb.r.f60089v0);
        }
        String str = f10;
        jo.p.g(str, "appUserIdSettingBindMode…efault_app_user_id_label)");
        Boolean f11 = j5().B().f();
        if (f11 == null) {
            f11 = Boolean.FALSE;
        }
        boolean booleanValue = f11.booleanValue();
        String f12 = j5().i().f();
        if (f12 == null) {
            f12 = "";
        }
        String str2 = f12;
        Boolean f13 = j5().G().f();
        if (f13 == null) {
            f13 = Boolean.FALSE;
        }
        r.a.b(aVar2, Referer.BROADCAST_AVATAR, str, booleanValue, str2, f13.booleanValue(), true, 0, 0, false, false, 960, null).z3(a3(), "AppUserIdSettingDialog");
        j5().F().m(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.i iVar) {
        jo.p.h(iVar, "event");
        od.f o52 = o5();
        String str = this.Q;
        if (str == null) {
            jo.p.v("liveId");
            str = null;
        }
        o52.j(str, false);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.x xVar) {
        jo.p.h(xVar, "event");
        if (jo.p.c(xVar.a(), "CastService")) {
            i5().j();
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.p pVar) {
        jo.p.h(pVar, "event");
        if (jo.p.c(pVar.b(), "CastService") && pVar.a().isReconnect()) {
            n6("CollabMatchingWaitingDialog");
            ac.g gVar = this.P;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            gVar.I.setVisibility(8);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.g1 g1Var) {
        jo.p.h(g1Var, "event");
        if (jo.p.c(g1Var.a(), "CastService")) {
            i5().v(false);
        }
    }
}
