package com.dena.mirrativ.user.emomo;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
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
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.user.emomo.HomeEmomoActivity;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.Avatar;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.AvatarItemBannerClickTargetDetail;
import com.dena.mirrorman.feature.player.emomo.SpeechAnalyzer;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.request.UpdateClosetAvatarRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
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
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.mirrativ.llstream.encoder.AACEncoder;
import ie.b;
import ie.f;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kq.a;
import of.q;
import pc.i3;
import tb.c;
import uo.b1;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class HomeEmomoActivity extends e.b implements qc.c, je.d, vb.p, vb.v, i1, s1, je.a, f.b, vb.g, vb.h, vb.f, q0 {

    /* renamed from: o0  reason: collision with root package name */
    public static final a f24154o0 = new a(null);

    /* renamed from: p0  reason: collision with root package name */
    public static final int f24155p0 = 8;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f24156q0 = Math.max(88200, AudioRecord.getMinBufferSize(AACEncoder.SAMPLING_RATE, 16, 2) * 2);
    public pc.k P;
    public gf.w Q;
    public AudioRecord R;
    public je.f S;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f24157a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f24158b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f24159c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f24160d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f24161e0;

    /* renamed from: f0  reason: collision with root package name */
    public final wn.f f24162f0;

    /* renamed from: g0  reason: collision with root package name */
    public final wn.f f24163g0;

    /* renamed from: h0  reason: collision with root package name */
    public final wn.f f24164h0;

    /* renamed from: i0  reason: collision with root package name */
    public final wn.f f24165i0;

    /* renamed from: j0  reason: collision with root package name */
    public final wn.f f24166j0;

    /* renamed from: k0  reason: collision with root package name */
    public EventBannerResponse f24167k0;

    /* renamed from: l0  reason: collision with root package name */
    public final wn.f f24168l0;

    /* renamed from: m0  reason: collision with root package name */
    public final wn.f f24169m0;

    /* renamed from: n0  reason: collision with root package name */
    public final wn.f f24170n0;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f T = wn.g.a(c.f24179w);
    public final FragmentRunner U = new FragmentRunner(this);
    public final wn.f V = new s0(jo.f0.b(je.e.class), new i0(this), new h0(new g0(this), null, null, gq.a.a(this)));
    public final wn.f W = wn.g.a(m0.f24228w);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, Integer num, boolean z10, boolean z11) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, HomeEmomoActivity.class);
            intent.putExtra("EXTRA_PART_TYPE_ID", num);
            intent.putExtra("EXTRA_FROM_PLAYER", z10);
            intent.putExtra("EXTRA_FROM_LIVE_PREPARE", z11);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<qc.j> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24171w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24172x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24171w = componentCallbacks;
            this.f24172x = aVar;
            this.f24173y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qc.j] */
        @Override // io.a
        public final qc.j invoke() {
            ComponentCallbacks componentCallbacks = this.f24171w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(qc.j.class), this.f24172x, this.f24173y);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24174a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f24175b;

        static {
            int[] iArr = new int[nd.c.values().length];
            iArr[nd.c.EVENT.ordinal()] = 1;
            iArr[nd.c.INTERNAL.ordinal()] = 2;
            iArr[nd.c.NONE.ordinal()] = 3;
            f24174a = iArr;
            int[] iArr2 = new int[jf.c0.values().length];
            iArr2[jf.c0.UP.ordinal()] = 1;
            iArr2[jf.c0.LEFT.ordinal()] = 2;
            iArr2[jf.c0.RIGHT.ordinal()] = 3;
            iArr2[jf.c0.DOWN.ordinal()] = 4;
            f24175b = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<nf.w> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24176w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24177x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24178y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24176w = componentCallbacks;
            this.f24177x = aVar;
            this.f24178y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.w, java.lang.Object] */
        @Override // io.a
        public final nf.w invoke() {
            ComponentCallbacks componentCallbacks = this.f24176w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.w.class), this.f24177x, this.f24178y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<AudioTrack> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f24179w = new c();

        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final AudioTrack invoke() {
            return new AudioTrack(3, AACEncoder.SAMPLING_RATE, 4, 2, HomeEmomoActivity.f24156q0, 1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24180w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24181x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24182y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24180w = componentCallbacks;
            this.f24181x = aVar;
            this.f24182y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f24180w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f24181x, this.f24182y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActivity$doPoseAndSnapShot$2", f = "HomeEmomoActivity.kt", l = {662}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24183w;

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
            int i10 = this.f24183w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f24183w = 1;
                if (b1.a(750L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            HomeEmomoActivity.this.Q4();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<hf.m0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24185w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24186x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24187y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24185w = componentCallbacks;
            this.f24186x = aVar;
            this.f24187y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.m0] */
        @Override // io.a
        public final hf.m0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24185w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.m0.class), this.f24186x, this.f24187y);
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
            return HomeEmomoActivity.this.getCacheDir() + "/emomo.png";
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24189w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24190x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24191y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24189w = componentCallbacks;
            this.f24190x = aVar;
            this.f24191y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24189w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f24190x, this.f24191y);
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
            return Boolean.valueOf(HomeEmomoActivity.this.getIntent().getBooleanExtra("EXTRA_FROM_LIVE_PREPARE", false));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24193w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24194x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24195y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24193w = componentCallbacks;
            this.f24194x = aVar;
            this.f24195y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f24193w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f24194x, this.f24195y);
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
            return Boolean.valueOf(HomeEmomoActivity.this.getIntent().getBooleanExtra("EXTRA_FROM_PLAYER", false));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24197w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentActivity componentActivity) {
            super(0);
            this.f24197w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24197w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActivity$observeStoreValue$3", f = "HomeEmomoActivity.kt", l = {AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24198w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24199x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24200y;

        /* renamed from: z  reason: collision with root package name */
        public int f24201z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00bd, TryCatch #2 {all -> 0x00bd, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0081, B:29:0x0090, B:30:0x00a8), top: B:45:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
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
                int r1 = r9.f24201z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f24200y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f24199x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f24198w
                com.dena.mirrativ.user.emomo.HomeEmomoActivity r4 = (com.dena.mirrativ.user.emomo.HomeEmomoActivity) r4
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
                com.dena.mirrativ.user.emomo.HomeEmomoActivity r10 = com.dena.mirrativ.user.emomo.HomeEmomoActivity.this
                qc.j r10 = com.dena.mirrativ.user.emomo.HomeEmomoActivity.J3(r10)
                wo.x r3 = r10.j()
                com.dena.mirrativ.user.emomo.HomeEmomoActivity r10 = com.dena.mirrativ.user.emomo.HomeEmomoActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lc0
                r4 = r10
                r10 = r9
            L3d:
                r10.f24198w = r4     // Catch: java.lang.Throwable -> Lc0
                r10.f24199x = r3     // Catch: java.lang.Throwable -> Lc0
                r10.f24200y = r1     // Catch: java.lang.Throwable -> Lc0
                r10.f24201z = r2     // Catch: java.lang.Throwable -> Lc0
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
                com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse r10 = (com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse) r10     // Catch: java.lang.Throwable -> Lbd
                od.e r6 = com.dena.mirrativ.user.emomo.HomeEmomoActivity.F3(r5)     // Catch: java.lang.Throwable -> Lbd
                r6.E(r10)     // Catch: java.lang.Throwable -> Lbd
                com.dena.mirrativ.user.emomo.HomeEmomoActivity.D3(r5)     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r6 = "EmomoDressUpShopDialog"
                com.dena.mirrativ.user.emomo.HomeEmomoActivity.C3(r5, r6)     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r6 = r10.getResultImageUrl()     // Catch: java.lang.Throwable -> Lbd
                int r6 = r6.length()     // Catch: java.lang.Throwable -> Lbd
                r7 = 0
                if (r6 <= 0) goto L7e
                r6 = r2
                goto L7f
            L7e:
                r6 = r7
            L7f:
                if (r6 == 0) goto La8
                java.lang.String r6 = r10.getResultMessage()     // Catch: java.lang.Throwable -> Lbd
                int r6 = r6.length()     // Catch: java.lang.Throwable -> Lbd
                if (r6 <= 0) goto L8d
                r6 = r2
                goto L8e
            L8d:
                r6 = r7
            L8e:
                if (r6 == 0) goto La8
                be.u$a r6 = be.u.Q0     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r7 = r10.getResultImageUrl()     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r10 = r10.getResultMessage()     // Catch: java.lang.Throwable -> Lbd
                be.u r10 = r6.a(r7, r10)     // Catch: java.lang.Throwable -> Lbd
                androidx.fragment.app.FragmentManager r6 = r5.a3()     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r7 = "AvatarPartsPurchaseResultDialog"
                r10.z3(r6, r7)     // Catch: java.lang.Throwable -> Lbd
                goto Lb1
            La8:
                android.content.Context r10 = r5.getBaseContext()     // Catch: java.lang.Throwable -> Lbd
                int r6 = nc.i.O2     // Catch: java.lang.Throwable -> Lbd
                of.n.A(r10, r6, r7)     // Catch: java.lang.Throwable -> Lbd
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.emomo.HomeEmomoActivity.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24202w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24203x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24204y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24205z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24202w = aVar;
            this.f24203x = aVar2;
            this.f24204y = aVar3;
            this.f24205z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24202w;
            vq.a aVar2 = this.f24203x;
            io.a aVar3 = this.f24204y;
            xq.a aVar4 = this.f24205z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActivity$observeStoreValue$5", f = "HomeEmomoActivity.kt", l = {353}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24206w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityLoadAvatarModel> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HomeEmomoActivity f24208w;

            public a(HomeEmomoActivity homeEmomoActivity) {
                this.f24208w = homeEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityLoadAvatarModel unityLoadAvatarModel, ao.d<? super wn.v> dVar) {
                ClosetAccessoryAsset companionType;
                if (this.f24208w.b4()) {
                    return wn.v.f59242a;
                }
                UnityManager.Companion companion = UnityManager.Companion;
                companion.getInstance().restoreCameraDolly();
                UnityManager companion2 = companion.getInstance();
                ClosetAvatar N = this.f24208w.Z3().N();
                companion2.setCompanionName((N == null || (companionType = N.getCompanionType()) == null || (r0 = companionType.getName()) == null) ? "" : "");
                companion.getInstance().setMainichi(this.f24208w.q4().s3());
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
            int i10 = this.f24206w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityLoadAvatarModel> loadAvatarModelCompletedFlow = HomeEmomoActivity.this.o4().getLoadAvatarModelCompletedFlow();
                a aVar = new a(HomeEmomoActivity.this);
                this.f24206w = 1;
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
    public static final class i0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24209w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ComponentActivity componentActivity) {
            super(0);
            this.f24209w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24209w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActivity$observeStoreValue$6", f = "HomeEmomoActivity.kt", l = {362}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24210w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityScreenshot> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HomeEmomoActivity f24212w;

            /* renamed from: com.dena.mirrativ.user.emomo.HomeEmomoActivity$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0213a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ UnityScreenshot f24213w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ HomeEmomoActivity f24214x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0213a(UnityScreenshot unityScreenshot, HomeEmomoActivity homeEmomoActivity) {
                    super(0);
                    this.f24213w = unityScreenshot;
                    this.f24214x = homeEmomoActivity;
                }

                public final void a() {
                    je.c.f37722g1.a(Referer.HOME, this.f24213w, this.f24214x.q4().T4(), this.f24214x.q4().t4(), this.f24214x.Z3().B0(), false).z3(this.f24214x.a3(), "EmomoRegistrationDialog");
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
                public final /* synthetic */ HomeEmomoActivity f24215w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HomeEmomoActivity homeEmomoActivity) {
                    super(2);
                    this.f24215w = homeEmomoActivity;
                }

                public final void a(String str, String str2) {
                    jo.p.h(str, "bodyPath");
                    jo.p.h(str2, "facePath");
                    this.f24215w.Y3().u(new UpdateClosetImagesRequest(this.f24215w.Z3().y0(), str, str2));
                }

                @Override // io.p
                public /* bridge */ /* synthetic */ wn.v invoke(String str, String str2) {
                    a(str, str2);
                    return wn.v.f59242a;
                }
            }

            public a(HomeEmomoActivity homeEmomoActivity) {
                this.f24212w = homeEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityScreenshot unityScreenshot, ao.d<? super wn.v> dVar) {
                if (jo.p.c(unityScreenshot.getKey(), UnityReceiverKt.EMOMO)) {
                    this.f24212w.U.c(new C0213a(unityScreenshot, this.f24212w));
                    File f10 = this.f24212w.l4().f().f();
                    if (f10 != null) {
                        HomeEmomoActivity homeEmomoActivity = this.f24212w;
                        Context applicationContext = homeEmomoActivity.getApplicationContext();
                        jo.p.g(applicationContext, "applicationContext");
                        b bVar = new b(homeEmomoActivity);
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
            int i10 = this.f24210w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityScreenshot> screenshotCompletedFlow = HomeEmomoActivity.this.o4().getScreenshotCompletedFlow();
                a aVar = new a(HomeEmomoActivity.this);
                this.f24210w = 1;
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
    public static final class j0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24216w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ComponentActivity componentActivity) {
            super(0);
            this.f24216w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24216w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActivity$observeStoreValue$7", f = "HomeEmomoActivity.kt", l = {390}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24217w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HomeEmomoActivity f24219w;

            public a(HomeEmomoActivity homeEmomoActivity) {
                this.f24219w = homeEmomoActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f24219w.L4();
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
            int i10 = this.f24217w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> screenshotFailedFlow = HomeEmomoActivity.this.o4().getScreenshotFailedFlow();
                a aVar = new a(HomeEmomoActivity.this);
                this.f24217w = 1;
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
    public static final class k0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24220w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24221x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24222y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24223z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24220w = aVar;
            this.f24221x = aVar2;
            this.f24222y = aVar3;
            this.f24223z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24220w;
            vq.a aVar2 = this.f24221x;
            io.a aVar3 = this.f24222y;
            xq.a aVar4 = this.f24223z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends f8.c<File> {
        public l() {
        }

        @Override // f8.j
        /* renamed from: a */
        public void e(File file, g8.b<? super File> bVar) {
            jo.p.h(file, "resource");
            HomeEmomoActivity.this.l4().f().p(file);
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24225w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ComponentActivity componentActivity) {
            super(0);
            this.f24225w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24225w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements AudioRecord.OnRecordPositionUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f24226a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeEmomoActivity f24227b;

        public m(byte[] bArr, HomeEmomoActivity homeEmomoActivity) {
            this.f24226a = bArr;
            this.f24227b = homeEmomoActivity;
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onMarkerReached(AudioRecord audioRecord) {
        }

        @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
        public void onPeriodicNotification(AudioRecord audioRecord) {
            if (audioRecord != null) {
                audioRecord.read(this.f24226a, 0, 8192);
            }
            this.f24227b.m4().k(this.f24226a, 2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 extends jo.q implements io.a<SpeechAnalyzer> {

        /* renamed from: w  reason: collision with root package name */
        public static final m0 f24228w = new m0();

        public m0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final SpeechAnalyzer invoke() {
            return new SpeechAnalyzer();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            HomeEmomoActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.l<View, wn.v> {
        public o() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            HomeEmomoActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.l<View, wn.v> {
        public p() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (of.q.f45417a.d(HomeEmomoActivity.this)) {
                return;
            }
            b3.a.q(HomeEmomoActivity.this, new String[]{"android.permission.RECORD_AUDIO"}, 204);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.l<View, wn.v> {
        public q() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            HomeEmomoActivity.this.r4();
            HomeEmomoActivity.J4(HomeEmomoActivity.this, null, 1, null);
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
            HomeEmomoActivity.this.r4();
            HomeEmomoActivity.this.U3("EmomoStreamViewFragment");
            HomeEmomoActivity.this.finish();
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
            HomeEmomoActivity.this.r4();
            HomeEmomoActivity.this.M4();
            MRLogger h42 = HomeEmomoActivity.this.h4();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_SELECT_POSE_OPEN);
            builder.setTargetType(Referer.MY_PAGE);
            builder.setTargetId("pose");
            h42.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<wn.v> {
        public t() {
            super(0);
        }

        public final void a() {
            r1.a.b(r1.R0, null, 1, null).z3(HomeEmomoActivity.this.a3(), "EmomoShutterEffectDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<od.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24236w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24237x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24238y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24236w = componentCallbacks;
            this.f24237x = aVar;
            this.f24238y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.e] */
        @Override // io.a
        public final od.e invoke() {
            ComponentCallbacks componentCallbacks = this.f24236w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.e.class), this.f24237x, this.f24238y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24239w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24240x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24241y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24239w = componentCallbacks;
            this.f24240x = aVar;
            this.f24241y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            ComponentCallbacks componentCallbacks = this.f24239w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.z.class), this.f24240x, this.f24241y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24242w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24243x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24244y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24242w = componentCallbacks;
            this.f24243x = aVar;
            this.f24244y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24242w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f24243x, this.f24244y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24245w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24246x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24247y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24245w = componentCallbacks;
            this.f24246x = aVar;
            this.f24247y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f24245w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f24246x, this.f24247y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24248w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24249x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24250y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24248w = componentCallbacks;
            this.f24249x = aVar;
            this.f24250y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f24248w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f24249x, this.f24250y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<qc.d> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24251w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24252x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24251w = componentCallbacks;
            this.f24252x = aVar;
            this.f24253y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qc.d] */
        @Override // io.a
        public final qc.d invoke() {
            ComponentCallbacks componentCallbacks = this.f24251w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(qc.d.class), this.f24252x, this.f24253y);
        }
    }

    public HomeEmomoActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.X = wn.g.b(iVar, new x(this, null, null));
        this.Y = wn.g.b(iVar, new y(this, null, null));
        this.Z = wn.g.b(iVar, new z(this, null, null));
        this.f24157a0 = wn.g.b(iVar, new a0(this, null, null));
        this.f24158b0 = wn.g.b(iVar, new b0(this, null, null));
        this.f24159c0 = wn.g.b(iVar, new c0(this, null, null));
        this.f24160d0 = wn.g.b(iVar, new d0(this, null, null));
        this.f24161e0 = wn.g.b(iVar, new e0(this, null, null));
        this.f24162f0 = wn.g.b(iVar, new f0(this, null, null));
        this.f24163g0 = new s0(jo.f0.b(nf.f.class), new l0(this), new k0(new j0(this), null, null, gq.a.a(this)));
        this.f24164h0 = wn.g.b(iVar, new u(this, null, null));
        this.f24165i0 = wn.g.b(iVar, new v(this, null, null));
        this.f24166j0 = wn.g.b(iVar, new w(this, null, null));
        this.f24168l0 = wn.g.a(new e());
        this.f24169m0 = wn.g.a(new f());
        this.f24170n0 = wn.g.a(new g());
    }

    public static /* synthetic */ void J4(HomeEmomoActivity homeEmomoActivity, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        homeEmomoActivity.I4(num);
    }

    public static final void u4(HomeEmomoActivity homeEmomoActivity, EventNoticeResponse eventNoticeResponse) {
        jo.p.h(homeEmomoActivity, "this$0");
        if (eventNoticeResponse == null) {
            return;
        }
        homeEmomoActivity.l4().g().p(eventNoticeResponse);
    }

    public static final void v4(HomeEmomoActivity homeEmomoActivity, MRError mRError) {
        jo.p.h(homeEmomoActivity, "this$0");
        if (mRError instanceof MRError.Failure) {
            of.n.f45411a.B(homeEmomoActivity, ((MRError.Failure) mRError).getErrorMessage(), false);
        } else if (mRError instanceof MRError.Blocked) {
            of.n.f45411a.B(homeEmomoActivity, ((MRError.Blocked) mRError).getErrorMessage(), false);
        } else {
            if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                of.n.f45411a.l(homeEmomoActivity, mRError);
            } else {
                of.n.z(homeEmomoActivity);
            }
        }
    }

    public static final void w4(HomeEmomoActivity homeEmomoActivity, MRError mRError) {
        jo.p.h(homeEmomoActivity, "this$0");
        homeEmomoActivity.V3();
    }

    public static final void x4(i3 i3Var, HomeEmomoActivity homeEmomoActivity, Boolean bool) {
        jo.p.h(i3Var, "$this_apply");
        jo.p.h(homeEmomoActivity, "this$0");
        jo.p.g(bool, "micEnabled");
        if (bool.booleanValue()) {
            i3Var.L.setText(homeEmomoActivity.getString(nc.i.text_on));
            i3Var.L.setTextColor(e3.h.d(homeEmomoActivity.getResources(), nc.b.f41805y, null));
            i3Var.L.setCompoundDrawablesWithIntrinsicBounds(nc.h.ic_mic_on, 0, 0, 0);
            return;
        }
        i3Var.L.setText(homeEmomoActivity.getString(nc.i.text_off));
        i3Var.L.setCompoundDrawablesWithIntrinsicBounds(nc.h.ic_mic_off, 0, 0, 0);
        i3Var.L.setTextColor(e3.h.d(homeEmomoActivity.getResources(), nc.b.f41806z, null));
    }

    public static final void y4(i3 i3Var, Boolean bool) {
        jo.p.h(i3Var, "$this_apply");
        View view = i3Var.C;
        jo.p.g(bool, "isUnreadItem");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public final void A4(EventBannerResponse eventBannerResponse, EventBannerWhere eventBannerWhere) {
        D4(EventBannerActionType.EVENT_BANNER_IMP, eventBannerResponse, eventBannerWhere);
    }

    public final void B4(String str) {
        jf.b0 a10 = p4().a(str);
        MRLogger h42 = h4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(EventBannerActionType.AVATAR_ITEM_BANNER_CLICK.getRawValue());
        ClosetAvatar R = Z3().R();
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new AvatarItemBannerClickTargetDetail(str, R != null ? UpdateClosetAvatarRequest.Companion.convert(R, Z3().y0()) : null).toJson())));
        h42.sendLog(builder.build());
        if (!(a10 instanceof b0.l0)) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.CLOSET, a10));
        } else {
            startActivity(WebViewActivity.a.b(WebViewActivity.X, this, str, false, false, 12, null));
        }
    }

    public final void C4() {
        androidx.lifecycle.e0<Boolean> i10 = l4().i();
        q.a aVar = of.q.f45417a;
        i10.p(Boolean.valueOf(aVar.d(this)));
        if (this.R == null && aVar.d(this)) {
            of.d dVar = of.d.f45388a;
            AudioRecord audioRecord = new AudioRecord((dVar.f() || dVar.b()) ? 5 : 1, AACEncoder.SAMPLING_RATE, 16, 2, f24156q0);
            audioRecord.setPositionNotificationPeriod(4096);
            audioRecord.setRecordPositionUpdateListener(new m(new byte[8192], this));
            this.R = audioRecord;
        }
        try {
            AudioRecord audioRecord2 = this.R;
            if (audioRecord2 != null) {
                audioRecord2.startRecording();
            }
        } catch (IllegalStateException e10) {
            g9.a.c(e10);
        }
    }

    public final void D4(EventBannerActionType eventBannerActionType, EventBannerResponse eventBannerResponse, EventBannerWhere eventBannerWhere) {
        Puree.d(new EventBannerLog(eventBannerActionType, nd.c.Companion.a(eventBannerResponse.getType()).e(), eventBannerResponse.getTitle(), eventBannerWhere, null, null, 32, null));
    }

    @Override // vb.g
    public void E(int i10) {
        l4().f().p(null);
        Y3().h(i10);
    }

    @Override // je.a
    public void E0(float f10) {
        UnityManager.Companion.getInstance().setCameraDolly(f10);
    }

    public final void E4() {
        pc.k kVar = this.P;
        if (kVar == null) {
            jo.p.v("binding");
            kVar = null;
        }
        i3 i3Var = kVar.D;
        i3Var.J.setEmomoMotionViewListener(this);
        if (c4()) {
            AppCompatImageView appCompatImageView = i3Var.O;
            jo.p.g(appCompatImageView, "playerThumbnailImageView");
            te.c f10 = i4().j1().f();
            td.a.m(appCompatImageView, f10 != null ? f10.getImage_url() : null);
            AppCompatImageView appCompatImageView2 = i3Var.D;
            jo.p.g(appCompatImageView2, "backToPlayerArrowImageView");
            g1.a(appCompatImageView2, new n());
            FrameLayout frameLayout = i3Var.N;
            jo.p.g(frameLayout, "playerThumbnailContainer");
            g1.a(frameLayout, new o());
        }
        AppCompatTextView appCompatTextView = i3Var.L;
        jo.p.g(appCompatTextView, "micStatusTextView");
        g1.a(appCompatTextView, new p());
        AppCompatImageView appCompatImageView3 = i3Var.B;
        jo.p.g(appCompatImageView3, "avatarDressUpImageView");
        g1.a(appCompatImageView3, new q());
        AppCompatButton appCompatButton = i3Var.G;
        jo.p.g(appCompatButton, "closeButton");
        g1.a(appCompatButton, new r());
        AppCompatButton appCompatButton2 = i3Var.K;
        jo.p.g(appCompatButton2, "emomoPhotoButton");
        g1.a(appCompatButton2, new s());
        ConstraintLayout constraintLayout = i3Var.E;
        jo.p.g(constraintLayout, "backToPlayerContainer");
        constraintLayout.setVisibility(c4() ? 0 : 8);
        FrameLayout frameLayout2 = i3Var.N;
        jo.p.g(frameLayout2, "playerThumbnailContainer");
        frameLayout2.setVisibility(c4() ? 0 : 8);
        AppCompatButton appCompatButton3 = i3Var.G;
        jo.p.g(appCompatButton3, "closeButton");
        appCompatButton3.setVisibility(c4() ^ true ? 0 : 8);
    }

    public final void F4() {
        tb.a O = f4().O(true);
        O.a().z3(a3(), O.b());
    }

    @Override // be.s1
    public void G0(String str) {
        jo.p.h(str, "key");
        U3("EmomoShutterEffectDialog");
        T4();
    }

    @Override // vb.p
    public void G2(String str) {
        jo.p.h(str, "url");
        GlideApp.with((androidx.fragment.app.h) this).asFile().load(str).into((GlideRequest<File>) new l());
    }

    public final void G4() {
        tb.a c10 = f4().c();
        c10.a().z3(a3(), c10.b());
    }

    public final void H4() {
        f.a aVar = ie.f.V0;
        String string = getString(nc.i.N2);
        jo.p.g(string, "getString(R.string.text_emomo_confirm_close)");
        f.a.b(aVar, string, getString(nc.i.E4), getString(nc.i.B), null, false, 24, null).z3(a3(), "DIALOG_TAG_CONFIRM_CANCEL_DRESS_UP_DIALOG");
    }

    @Override // vb.v
    public void I1() {
        U3("ShooterDressUpDialog");
        J4(this, null, 1, null);
    }

    public final void I4(Integer num) {
        String str;
        U3("EmomoDressUpDialog");
        tb.a d10 = c.a.d(f4(), Referer.HOME, num, false, 4, null);
        d10.a().z3(a3(), d10.b());
        MRLogger h42 = h4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_IMP_CLOSET);
        if (c4()) {
            str = Referer.LIVE_VIEW;
        } else {
            str = b4() ? Referer.LIVE_PREPARATION : Referer.HOME;
        }
        builder.setPageId(str);
        h42.sendLog(builder.build());
    }

    @Override // vb.p
    public void J0() {
        P4();
    }

    @Override // be.i1
    public void J2() {
        U3("EmomoPoseDialog");
        UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        L4();
    }

    public final void K4() {
        k4().b();
        qc.b.P0.a().z3(a3(), "EmomoPermissionDialog");
    }

    public final void L4() {
        pc.k kVar = this.P;
        if (kVar == null) {
            jo.p.v("binding");
            kVar = null;
        }
        ConstraintLayout constraintLayout = kVar.D.H;
        jo.p.g(constraintLayout, "binding.operationView.container");
        constraintLayout.setVisibility(0);
    }

    public final void M4() {
        be.g1.U0.a(true, false).z3(a3(), "EmomoPoseDialog");
    }

    public final void N4() {
        tb.a D0 = f4().D0();
        D0.a().z3(a3(), D0.b());
    }

    @Override // vb.h
    public void O1(int i10) {
        Y3().F(i10);
        W3();
    }

    public final void O4() {
        tb.a k10 = f4().k();
        k10.a().z3(a3(), k10.b());
    }

    @Override // je.d
    public void P1() {
        U3("EmomoRegistrationDialog");
        L4();
        ClosetAvatar R = Z3().R();
        if (R != null) {
            Y3().o(jf.c.f37906y.a(R));
        }
        setResult(-1);
        if (b4()) {
            UnityManager.Companion.getInstance().unloadAvatarModel(0);
            finish();
        }
    }

    public final void P4() {
        tb.a l02 = f4().l0();
        l02.a().z3(a3(), l02.b());
    }

    public final void Q4() {
        this.U.c(new t());
    }

    public final void R4() {
        b.a aVar = ie.b.P0;
        String string = getString(nc.i.P5);
        jo.p.g(string, "getString(R.string.text_should_purchase_companion)");
        b.a.b(aVar, string, null, null, 6, null).z3(a3(), "CustomMessageDialog");
    }

    @Override // qc.c
    public void S0() {
        T3();
    }

    public final void S4() {
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

    @Override // vb.f
    public void T1() {
        ClosetAvatar clone;
        l4().f().p(null);
        ClosetAvatar N = Z3().N();
        if (N == null || (clone = N.clone()) == null) {
            return;
        }
        Y3().m(clone);
    }

    public final void T3() {
        if (of.q.f45417a.d(this)) {
            C4();
            L4();
            return;
        }
        b3.a.q(this, new String[]{"android.permission.RECORD_AUDIO"}, 204);
    }

    public final void T4() {
        ClosetAvatar R = Z3().R();
        if (R != null) {
            Y3().s(Z3().y0(), R);
        }
        Puree.d(new Avatar.AvatarTakePicture(""));
        n4().captureScreenshot(UnityScreenShotAvatarPosition.CENTER, a4(), UnityReceiverKt.EMOMO_PHOTO_SIZE, UnityReceiverKt.EMOMO_PHOTO_SIZE, UnityReceiverKt.EMOMO);
    }

    @Override // be.i1
    public void U0(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        jo.p.h(closetAvatarSimpleValue, "pose");
        Puree.d(new Avatar.AvatarSelectPose(closetAvatarSimpleValue.getId()));
        UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), closetAvatarSimpleValue.getValue(), 0, 2, null);
    }

    public final void U3(String str) {
        Fragment e02 = a3().e0(str);
        if (e02 != null) {
            a3().k().q(e02).j();
        }
    }

    @Override // vb.p
    public void V1(Serializable serializable) {
        jo.p.h(serializable, MRLog.TARGET_TYPE_BANNER);
        if (serializable instanceof EventBannerResponse) {
            A4((EventBannerResponse) serializable, EventBannerWhere.AVATAR_CLOSET);
        }
    }

    public final void V3() {
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

    @Override // vb.p
    public void W0(float f10) {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        pc.k kVar = this.P;
        pc.k kVar2 = null;
        if (kVar == null) {
            jo.p.v("binding");
            kVar = null;
        }
        cVar.g(kVar.C);
        pc.k kVar3 = this.P;
        if (kVar3 == null) {
            jo.p.v("binding");
            kVar3 = null;
        }
        int id2 = kVar3.B.getId();
        pc.k kVar4 = this.P;
        if (kVar4 == null) {
            jo.p.v("binding");
            kVar4 = null;
        }
        cVar.l(id2, kVar4.u().getHeight() - ((int) f10));
        pc.k kVar5 = this.P;
        if (kVar5 == null) {
            jo.p.v("binding");
        } else {
            kVar2 = kVar5;
        }
        cVar.c(kVar2.C);
    }

    public final void W3() {
        ClosetAvatarSimpleValue pose;
        String value;
        Y3().d();
        ClosetAvatar R = Z3().R();
        if (R != null && (pose = R.getPose()) != null && (value = pose.getValue()) != null) {
            UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), value, 0, 2, null);
        }
        UnityManager.Companion.getInstance().setCameraDolly(CameraDolly.DEFAULT);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final AudioTrack X3() {
        return (AudioTrack) this.T.getValue();
    }

    @Override // be.i1
    public void Y1() {
        U3("EmomoPoseDialog");
        Q4();
    }

    public final od.e Y3() {
        return (od.e) this.f24164h0.getValue();
    }

    public final nf.f Z3() {
        return (nf.f) this.f24163g0.getValue();
    }

    public final String a4() {
        return (String) this.f24168l0.getValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        int hashCode = str.hashCode();
        if (hashCode == -1962891250) {
            if (str.equals("DIALOG_TAG_CONFIRM_DRESS_UP_EVENT_DIALOG")) {
                Y3().f();
                Y3().d();
                L4();
                Puree.d(new Avatar.AvatarCloseCloset(""));
                EventBannerResponse eventBannerResponse = this.f24167k0;
                if (eventBannerResponse != null) {
                    z4(eventBannerResponse, EventBannerWhere.AVATAR_CLOSET);
                }
            }
        } else if (hashCode == 1088502653) {
            if (str.equals("DIALOG_TAG_CONFIRM_SAVE_DRESS_UP_DIALOG")) {
                Y3().f();
                Y3().d();
                L4();
            }
        } else if (hashCode == 2005743546 && str.equals("DIALOG_TAG_CONFIRM_CANCEL_DRESS_UP_DIALOG")) {
            l4().f().p(null);
            Y3().f();
            Y3().d();
            Puree.d(new Avatar.AvatarCloseCloset(""));
            if (b4()) {
                UnityManager.Companion.getInstance().unloadAvatarModel(0);
                finish();
                return;
            }
            L4();
        }
    }

    @Override // vb.p
    public void b2() {
        G4();
    }

    public final boolean b4() {
        return ((Boolean) this.f24169m0.getValue()).booleanValue();
    }

    @Override // ie.f.b
    public void c(String str) {
        jo.p.h(str, "tag");
    }

    public final boolean c4() {
        return ((Boolean) this.f24170n0.getValue()).booleanValue();
    }

    public final qc.d d4() {
        return (qc.d) this.Z.getValue();
    }

    public final qc.j e4() {
        return (qc.j) this.f24157a0.getValue();
    }

    @Override // vb.f
    public void f2() {
        l4().f().p(null);
    }

    public final tb.c f4() {
        return (tb.c) this.f24166j0.getValue();
    }

    public final nf.w g4() {
        return (nf.w) this.f24158b0.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // vb.p
    public void h() {
        U3("EmomoDressUpShopDialog");
    }

    public final MRLogger h4() {
        return (MRLogger) this.f24161e0.getValue();
    }

    @Override // vb.p
    public void i() {
        List<Closet> f10 = Z3().K().f();
        if (f10 != null) {
            if ((!f10.isEmpty()) && f10.get(0).isUsed()) {
                N4();
                return;
            }
            Y3().F(1);
            W3();
        }
    }

    @Override // vb.p
    public void i1() {
        U3("EmomoDressUpDialog");
        O4();
    }

    public final nf.z i4() {
        return (nf.z) this.f24165i0.getValue();
    }

    @Override // vb.p
    public void j2(String str) {
        jo.p.h(str, "bannerUrl");
        B4(str);
    }

    public final void j4() {
        d4().k(Referer.HOME);
    }

    @Override // vb.p
    public void k1(Serializable serializable, boolean z10) {
        jo.p.h(serializable, MRLog.TARGET_TYPE_BANNER);
        if (serializable instanceof EventBannerResponse) {
            if (z10) {
                this.f24167k0 = (EventBannerResponse) serializable;
                f.a aVar = ie.f.V0;
                String string = getString(nc.i.N2);
                jo.p.g(string, "getString(R.string.text_emomo_confirm_close)");
                f.a.b(aVar, string, getString(nc.i.E4), getString(nc.i.B), null, false, 24, null).z3(a3(), "DIALOG_TAG_CONFIRM_DRESS_UP_EVENT_DIALOG");
                return;
            }
            Y3().f();
            Y3().d();
            L4();
            Puree.d(new Avatar.AvatarCloseCloset(""));
            z4((EventBannerResponse) serializable, EventBannerWhere.AVATAR_CLOSET);
        }
    }

    public final hf.m0 k4() {
        return (hf.m0) this.f24160d0.getValue();
    }

    @Override // je.d
    public void l() {
        U3("EmomoRegistrationDialog");
        M4();
    }

    @Override // vb.v
    public void l1() {
        U3("ShooterDressUpDialog");
        J4(this, null, 1, null);
        Boolean f10 = Z3().D().f();
        if (f10 == null) {
            f10 = Boolean.FALSE;
        }
        if (f10.booleanValue()) {
            Y3().C(jf.m0.COMPANION);
            R4();
            return;
        }
        i();
    }

    public final je.e l4() {
        return (je.e) this.V.getValue();
    }

    public final SpeechAnalyzer m4() {
        return (SpeechAnalyzer) this.W.getValue();
    }

    public final UnityActionCreator n4() {
        return (UnityActionCreator) this.X.getValue();
    }

    public final UnityStore o4() {
        return (UnityStore) this.Y.getValue();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        } else {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.activity_home_emomo);
        jo.p.g(g10, "setContentView(this, R.layout.activity_home_emomo)");
        this.P = (pc.k) g10;
        C4();
        gf.w a10 = gf.w.B0.a();
        a3().k().s(nc.e.f41854z, a10, "EmomoStreamViewFragment").i();
        this.Q = a10;
        j4();
        t4();
        d4().j();
        E4();
        int intExtra = getIntent().getIntExtra("EXTRA_PART_TYPE_ID", -1);
        if (!of.q.f45417a.d(this) && !s4() && !b4()) {
            K4();
        } else if (intExtra != -1) {
            if (intExtra == 52) {
                M4();
            } else {
                I4(Integer.valueOf(intExtra));
            }
        } else {
            L4();
            if (bundle != null) {
                U3("EmomoDressUpDialog");
                U3("EmomoPoseDialog");
                U3("EmomoDressUpShopDialog");
                U3("ShooterDressUpDialog");
            }
        }
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        AudioRecord audioRecord = this.R;
        if (audioRecord != null) {
            audioRecord.release();
        }
        X3().release();
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        AudioRecord audioRecord = this.R;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        X3().stop();
        super.onPause();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        je.f fVar = this.S;
        if (fVar != null) {
            if (fVar.c() == 204) {
                this.S = new je.f(fVar.c(), fVar.b(), fVar.a());
                if ((!(fVar.a().length == 0)) && fVar.a()[0] == 0) {
                    C4();
                    Puree.d(new Avatar.EmomoTabPermission("mic", true));
                } else {
                    Puree.d(new Avatar.EmomoTabPermission("mic", false));
                }
                L4();
            } else {
                super.onRequestPermissionsResult(fVar.c(), fVar.b(), fVar.a());
            }
        }
        this.S = null;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        jo.p.h(strArr, "permissions");
        jo.p.h(iArr, "grantResults");
        this.S = new je.f(i10, strArr, iArr);
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        AudioRecord audioRecord = this.R;
        if (audioRecord != null) {
            audioRecord.startRecording();
        }
        X3().play();
        if (jo.p.c(Z3().N0().f(), Boolean.TRUE)) {
            Y3().k();
            Y3().i();
        }
        Y3().j();
    }

    @Override // je.a
    public void p2(jf.c0 c0Var) {
        ClosetAvatarSimpleValue motion1;
        jo.p.h(c0Var, "direction");
        int i10 = b.f24175b[c0Var.ordinal()];
        if (i10 == 1) {
            ClosetAvatar N = Z3().N();
            if (N != null) {
                motion1 = N.getMotion1();
            }
            motion1 = null;
        } else if (i10 == 2) {
            ClosetAvatar N2 = Z3().N();
            if (N2 != null) {
                motion1 = N2.getMotion2();
            }
            motion1 = null;
        } else if (i10 == 3) {
            ClosetAvatar N3 = Z3().N();
            if (N3 != null) {
                motion1 = N3.getMotion3();
            }
            motion1 = null;
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            ClosetAvatar N4 = Z3().N();
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

    public final of.k p4() {
        return (of.k) this.f24162f0.getValue();
    }

    public final kf.x q4() {
        return (kf.x) this.f24159c0.getValue();
    }

    @Override // vb.p
    public void r1(boolean z10) {
        if (!z10) {
            Puree.d(new Avatar.AvatarCloseCloset(""));
            if (b4()) {
                UnityManager.Companion.getInstance().unloadAvatarModel(0);
                finish();
                return;
            }
            Y3().d();
            L4();
            return;
        }
        H4();
    }

    public final void r4() {
        pc.k kVar = this.P;
        if (kVar == null) {
            jo.p.v("binding");
            kVar = null;
        }
        ConstraintLayout constraintLayout = kVar.D.H;
        jo.p.g(constraintLayout, "binding.operationView.container");
        constraintLayout.setVisibility(8);
    }

    public final boolean s4() {
        return (g4().h() || b3.a.s(this, "android.permission.RECORD_AUDIO")) ? false : true;
    }

    @Override // vb.p
    public void t1() {
        F4();
    }

    public final void t4() {
        e4().h().i(this, new androidx.lifecycle.f0() { // from class: qc.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeEmomoActivity.u4(HomeEmomoActivity.this, (EventNoticeResponse) obj);
            }
        });
        e4().g().i(this, new androidx.lifecycle.f0() { // from class: qc.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeEmomoActivity.v4(HomeEmomoActivity.this, (MRError) obj);
            }
        });
        pc.k kVar = null;
        uo.l.d(this, null, null, new h(null), 3, null);
        e4().i().i(this, new androidx.lifecycle.f0() { // from class: qc.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeEmomoActivity.w4(HomeEmomoActivity.this, (MRError) obj);
            }
        });
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new j(null), 3, null);
        uo.l.d(this, null, null, new k(null), 3, null);
        pc.k kVar2 = this.P;
        if (kVar2 == null) {
            jo.p.v("binding");
        } else {
            kVar = kVar2;
        }
        final i3 i3Var = kVar.D;
        l4().i().i(this, new androidx.lifecycle.f0() { // from class: qc.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeEmomoActivity.x4(i3.this, this, (Boolean) obj);
            }
        });
        Z3().P1().i(this, new androidx.lifecycle.f0() { // from class: qc.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeEmomoActivity.y4(i3.this, (Boolean) obj);
            }
        });
    }

    @Override // be.i1
    public void u() {
    }

    @Override // vb.p
    public void y2(Parcelable parcelable, boolean z10) {
        jo.p.h(parcelable, "equipAvatars");
        if (parcelable instanceof ke.a) {
            if (z10) {
                b.a aVar = ie.b.P0;
                String string = getString(nc.i.D);
                jo.p.g(string, "getString(R.string.text_canning_alert_title)");
                aVar.a(string, getString(nc.i.C), getString(nc.i.E4)).z3(a3(), "CustomMessageDialog");
                return;
            }
            S4();
            d4().l(Referer.HOME, (ke.a) parcelable);
        }
    }

    @Override // je.a
    public void z0(String str) {
        jo.p.h(str, "targetDetail");
        Puree.d(new Avatar.AvatarZoom(a3().e0("EmomoDressUpDialog") != null ? "avatar_closet" : Referer.AVATAR, str));
    }

    public final void z4(EventBannerResponse eventBannerResponse, EventBannerWhere eventBannerWhere) {
        int i10 = b.f24174a[nd.c.Companion.a(eventBannerResponse.getType()).ordinal()];
        if (i10 == 1) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.HOME, p4().a(eventBannerResponse.getUrl())));
        } else if (i10 == 2) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.HOME, p4().a(eventBannerResponse.getUrl())));
        }
        D4(EventBannerActionType.EVENT_BANNER_CLICK, eventBannerResponse, eventBannerWhere);
    }
}
