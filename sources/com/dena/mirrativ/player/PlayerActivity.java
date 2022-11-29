package com.dena.mirrativ.player;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
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
import be.n0;
import be.o1;
import be.r;
import be.u4;
import ce.k;
import ce.y;
import com.airbnb.lottie.LottieAnimationView;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGachaTicket;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrativ.player.PipStateManager;
import com.dena.mirrativ.player.PlayerActivity;
import com.dena.mirrativ.player.PlayerService;
import com.dena.mirrativ.player.gifting.MessageGiftView;
import com.dena.mirrativ.player.gifting.panel.PlayerGiftPagerCell;
import com.dena.mirrorman.ChooseReceiver;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.AdClick;
import com.dena.mirrorman.clientlog.logs.AdImp;
import com.dena.mirrorman.clientlog.logs.Avatar;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.Quiz;
import com.dena.mirrorman.clientlog.logs.detail.CurrentUserGiftRankTargetDetail;
import com.dena.mirrorman.customview.OneLineCommentView;
import com.dena.mirrorman.customview.PictureInPictureCommentView;
import com.dena.mirrorman.fragment.PlayerCommentFragment;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Ad;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.CollabInvitation;
import com.dena.mirrorman.net.api.response.CollabRequestResponse;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.Gift;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import com.dena.mirrorman.net.api.response.live.GiftAppealPopupImage;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import com.dena.mirrorman.net.api.response.live.LiveAd;
import com.dena.mirrorman.net.api.response.live.LiveAdAppBanner;
import com.dena.mirrorman.net.api.response.live.LiveCommentResponse;
import com.dena.mirrorman.net.api.response.live.LiveQuiz;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.net.bcsvr.response.CollabInviteCanceledByStreamerBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.net.bcsvr.response.ShooterMatchingStateChangedBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.ShooterMemberStateChangedBcsvrResponse;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequests;
import com.dena.mirrorman.net.quiz.QuizMessage;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.metrics.Trace;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import hb.f1;
import ia.a;
import ie.b;
import ie.f;
import java.io.Serializable;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kq.a;
import oe.b;
import oq.a;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import rb.b;
import sf.i;
import tb.c;
import ud.u2;
import uo.d2;
import yd.t1;

/* loaded from: classes2.dex */
public final class PlayerActivity extends e.b implements TextureView.SurfaceTextureListener, lb.l, f1.b, qb.s, f.b, uo.q0, oq.a, be.d3, gf.r0, be.p1, mb.d, be.i0, be.f0, be.b2, be.d2, be.f4, vb.i, PipStateManager.b {

    /* renamed from: s1  reason: collision with root package name */
    public static final a f21956s1 = new a(null);

    /* renamed from: t1  reason: collision with root package name */
    public static final int f21957t1 = 8;

    /* renamed from: u1  reason: collision with root package name */
    public static final int f21958u1;

    /* renamed from: v1  reason: collision with root package name */
    public static final Size f21959v1;

    /* renamed from: w1  reason: collision with root package name */
    public static final String[] f21960w1;

    /* renamed from: x1  reason: collision with root package name */
    public static CookieManager f21961x1;
    public boolean A0;
    public String B0;
    public long C0;
    public be.e0 D0;
    public Long E0;
    public String F0;
    public hb.f1 G0;
    public b H0;
    public BroadcastReceiver I0;
    public te.b J0;
    public boolean K0;
    public lb.h L0;
    public List<jf.q> M0;
    public boolean N0;
    public kb.d O;
    public boolean O0;
    public final ao.g P;
    public boolean P0;
    public final wn.f Q;
    public boolean Q0;
    public final wn.f R;
    public uo.d2 R0;
    public final wn.f S;
    public long S0;
    public final wn.f T;
    public long T0;
    public final wn.f U;
    public String U0;
    public final wn.f V;
    public boolean V0;
    public final wn.f W;
    public boolean W0;
    public final wn.f X;
    public String X0;
    public final wn.f Y;
    public boolean Y0;
    public final wn.f Z;
    public int Z0;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f21962a0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f21963a1;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f21964b0;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f21965b1;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f21966c0;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f21967c1;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f21968d0;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f21969d1;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f21970e0;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f21971e1;

    /* renamed from: f0  reason: collision with root package name */
    public final wn.f f21972f0;

    /* renamed from: f1  reason: collision with root package name */
    public int f21973f1;

    /* renamed from: g0  reason: collision with root package name */
    public final wn.f f21974g0;

    /* renamed from: g1  reason: collision with root package name */
    public rb.a f21975g1;

    /* renamed from: h0  reason: collision with root package name */
    public final wn.f f21976h0;

    /* renamed from: h1  reason: collision with root package name */
    public rb.c f21977h1;

    /* renamed from: i0  reason: collision with root package name */
    public final wn.f f21978i0;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f21979i1;

    /* renamed from: j0  reason: collision with root package name */
    public final wn.f f21980j0;

    /* renamed from: j1  reason: collision with root package name */
    public ArrayList<String> f21981j1;

    /* renamed from: k0  reason: collision with root package name */
    public final wn.f f21982k0;

    /* renamed from: k1  reason: collision with root package name */
    public List<jf.q> f21983k1;

    /* renamed from: l0  reason: collision with root package name */
    public final wn.f f21984l0;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f21985l1;

    /* renamed from: m0  reason: collision with root package name */
    public final wn.f f21986m0;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f21987m1;

    /* renamed from: n0  reason: collision with root package name */
    public final wn.f f21988n0;

    /* renamed from: n1  reason: collision with root package name */
    public sd.b f21989n1;

    /* renamed from: o0  reason: collision with root package name */
    public final wn.f f21990o0;

    /* renamed from: o1  reason: collision with root package name */
    public rb.d f21991o1;

    /* renamed from: p0  reason: collision with root package name */
    public final wn.f f21992p0;

    /* renamed from: p1  reason: collision with root package name */
    public hb.e2 f21993p1;

    /* renamed from: q0  reason: collision with root package name */
    public final wn.f f21994q0;

    /* renamed from: q1  reason: collision with root package name */
    public uo.d2 f21995q1;

    /* renamed from: r0  reason: collision with root package name */
    public final wn.f f21996r0;

    /* renamed from: r1  reason: collision with root package name */
    public String f21997r1;

    /* renamed from: s0  reason: collision with root package name */
    public final wn.f f21998s0;

    /* renamed from: t0  reason: collision with root package name */
    public final wn.f f21999t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f22000u0;

    /* renamed from: v0  reason: collision with root package name */
    public final uo.b0 f22001v0;

    /* renamed from: w0  reason: collision with root package name */
    public final androidx.recyclerview.widget.s f22002w0;

    /* renamed from: x0  reason: collision with root package name */
    public final FragmentRunner f22003x0;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f22004y0;

    /* renamed from: z0  reason: collision with root package name */
    public final LinkedList<LinkedLive> f22005z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "referer");
            Intent intent = new Intent(context, PlayerActivity.class);
            intent.putExtra("EXTRA_LIVE_ID", str);
            intent.putExtra("EXTRA_FROM_WHERE", str2);
            intent.putExtra("EXTRA_IS_LAUNCH_FROM_NOTIFICATION", z10);
            intent.putExtra("EXTRA_PREVIEW_IMAGE_URL", str3);
            intent.putExtra("EXTRA_ORIENTATION_V2", str4);
            intent.putExtra("EXTRA_IS_LAUNCH_PICTURE_IN_PICTURE", z11);
            intent.putExtra("EXTRA_IS_LAUNCH_SHOOTER_MATCHING", z12);
            intent.putExtra("EXTRA_IS_LAUNCH_FROM_ONBOARDING", z13);
            intent.putExtra("EXTRA_INVITED_LIVE_GAME_ID", str5);
            if (jo.p.c(((nf.o) br.a.b(nf.o.class, null, null, 6, null)).H().f(), Boolean.TRUE)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        public final void b() {
            if (jo.p.c(CookieHandler.getDefault(), PlayerActivity.f21961x1)) {
                return;
            }
            CookieHandler.setDefault(PlayerActivity.f21961x1);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$35", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22006w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22007x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22008y;

        /* renamed from: z  reason: collision with root package name */
        public int f22009z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22009z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22008y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22007x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22006w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.B0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22006w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22007x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22008y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22009z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.a0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$60", f = "PlayerActivity.kt", l = {3198}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22010w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<CollabInviteCanceledByStreamerBcsvrResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22012w;

            /* renamed from: com.dena.mirrativ.player.PlayerActivity$a1$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C0192a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f22013a;

                static {
                    int[] iArr = new int[CollabType.values().length];
                    iArr[CollabType.CALL.ordinal()] = 1;
                    iArr[CollabType.LIVE.ordinal()] = 2;
                    f22013a = iArr;
                }
            }

            public a(PlayerActivity playerActivity) {
                this.f22012w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(CollabInviteCanceledByStreamerBcsvrResponse collabInviteCanceledByStreamerBcsvrResponse, ao.d<? super wn.v> dVar) {
                int i10 = C0192a.f22013a[collabInviteCanceledByStreamerBcsvrResponse.getCollabType().ordinal()];
                if (i10 == 1) {
                    t1.a aVar = yd.t1.f61795x;
                    Context applicationContext = this.f22012w.getApplicationContext();
                    jo.p.g(applicationContext, "this@PlayerActivity.applicationContext");
                    String string = this.f22012w.getString(hb.b2.text_collab_talk_invite_cancel, new Object[]{collabInviteCanceledByStreamerBcsvrResponse.getUserName()});
                    jo.p.g(string, "getString(R.string.text_…vite_cancel, it.userName)");
                    aVar.a(applicationContext, string);
                    this.f22012w.T5("InvitedCollabCallDialogFragment");
                } else if (i10 == 2) {
                    t1.a aVar2 = yd.t1.f61795x;
                    Context applicationContext2 = this.f22012w.getApplicationContext();
                    jo.p.g(applicationContext2, "this@PlayerActivity.applicationContext");
                    String string2 = this.f22012w.getString(hb.b2.text_collab_streaming_invite_cancel, new Object[]{collabInviteCanceledByStreamerBcsvrResponse.getUserName()});
                    jo.p.g(string2, "getString(R.string.text_…vite_cancel, it.userName)");
                    aVar2.a(applicationContext2, string2);
                    this.f22012w.T5("InvitedCollabLiveDialogFragment");
                }
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
            int i10 = this.f22010w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<CollabInviteCanceledByStreamerBcsvrResponse> j02 = PlayerActivity.this.z6().j0();
                a aVar = new a(PlayerActivity.this);
                this.f22010w = 1;
                if (j02.a(aVar, this) == c10) {
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
    public static final class a2 extends jo.q implements io.a<a> {

        /* loaded from: classes2.dex */
        public static final class a extends hb.o1 {
            public final /* synthetic */ PlayerActivity A;

            public a(PlayerActivity playerActivity) {
                this.A = playerActivity;
            }

            @Override // hb.o1
            public void a() {
                if (c() != null) {
                    this.A.unbindService(this);
                }
                super.a();
            }

            @Override // hb.o1, android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                jo.p.h(componentName, "name");
                super.onServiceDisconnected(componentName);
                this.A.unbindService(this);
            }
        }

        public a2() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final a invoke() {
            return new a(PlayerActivity.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a3 extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22015w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22016x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22017y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22015w = aVar;
            this.f22016x = aVar2;
            this.f22017y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            xq.a b10;
            oq.a aVar = this.f22015w;
            vq.a aVar2 = this.f22016x;
            io.a<? extends uq.a> aVar3 = this.f22017y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.o.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a4 extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22018w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22019x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22020y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a4(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22018w = aVar;
            this.f22019x = aVar2;
            this.f22020y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            xq.a b10;
            oq.a aVar = this.f22018w;
            vq.a aVar2 = this.f22019x;
            io.a<? extends uq.a> aVar3 = this.f22020y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.p.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        None,
        Full,
        Message
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$36", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22021w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22022x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22023y;

        /* renamed from: z  reason: collision with root package name */
        public int f22024z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.l<Integer, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22025w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ EventNoticeResponse f22026x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerActivity playerActivity, EventNoticeResponse eventNoticeResponse) {
                super(1);
                this.f22025w = playerActivity;
                this.f22026x = eventNoticeResponse;
            }

            public final void a(int i10) {
                String liveId;
                te.c f10 = this.f22025w.z6().j1().f();
                if (f10 != null && (liveId = f10.getLiveId()) != null) {
                    this.f22025w.y6().U(ud.y2.f55749l.a(liveId, this.f22026x.getBanners().get(i10)));
                }
                if (this.f22025w.g().b() == o.c.RESUMED) {
                    EventBannerResponse eventBannerResponse = this.f22026x.getBanners().get(i10);
                    this.f22025w.P7(EventBannerActionType.EVENT_BANNER_IMP, nd.c.Companion.a(eventBannerResponse.getType()), eventBannerResponse.getTitle(), eventBannerResponse.getUrl(), EventBannerWhere.VIEW_COMMENT_LIST);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
                a(num.intValue());
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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x006e, B:23:0x0074, B:25:0x0093), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f22024z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.f22023y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r11.f22022x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r11.f22021w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r12)     // Catch: java.lang.Throwable -> La5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L53
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                wn.m.b(r12)
                com.dena.mirrativ.player.PlayerActivity r12 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r12 = com.dena.mirrativ.player.PlayerActivity.L4(r12)
                wo.x r3 = r12.r1()
                com.dena.mirrativ.player.PlayerActivity r12 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La5
                r4 = r12
                r12 = r11
            L3d:
                r12.f22021w = r4     // Catch: java.lang.Throwable -> La5
                r12.f22022x = r3     // Catch: java.lang.Throwable -> La5
                r12.f22023y = r1     // Catch: java.lang.Throwable -> La5
                r12.f22024z = r2     // Catch: java.lang.Throwable -> La5
                java.lang.Object r5 = r1.a(r12)     // Catch: java.lang.Throwable -> La5
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L53:
                r6 = 0
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> La2
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> La2
                if (r12 == 0) goto L9c
                java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> La2
                com.dena.mirrorman.net.api.response.EventNoticeResponse r12 = (com.dena.mirrorman.net.api.response.EventNoticeResponse) r12     // Catch: java.lang.Throwable -> La2
                java.util.List r6 = r12.getBanners()     // Catch: java.lang.Throwable -> La2
                java.lang.Object r6 = xn.a0.Z(r6)     // Catch: java.lang.Throwable -> La2
                com.dena.mirrativ.mirrativapi.common.EventBannerResponse r6 = (com.dena.mirrativ.mirrativapi.common.EventBannerResponse) r6     // Catch: java.lang.Throwable -> La2
                if (r6 == 0) goto L96
                boolean r6 = r5.isDestroyed()     // Catch: java.lang.Throwable -> La2
                if (r6 != 0) goto L96
                com.dena.mirrorman.net.api.response.DisplayTimingResponse r6 = r12.getDisplayTiming()     // Catch: java.lang.Throwable -> La2
                te.b r7 = new te.b     // Catch: java.lang.Throwable -> La2
                java.util.List r8 = r12.getBanners()     // Catch: java.lang.Throwable -> La2
                int r8 = r8.size()     // Catch: java.lang.Throwable -> La2
                com.dena.mirrativ.player.PlayerActivity$b0$a r9 = new com.dena.mirrativ.player.PlayerActivity$b0$a     // Catch: java.lang.Throwable -> La2
                r9.<init>(r5, r12)     // Catch: java.lang.Throwable -> La2
                r7.<init>(r8, r6, r9)     // Catch: java.lang.Throwable -> La2
                com.dena.mirrativ.player.PlayerActivity.o5(r5, r7)     // Catch: java.lang.Throwable -> La2
                te.b r12 = com.dena.mirrativ.player.PlayerActivity.z4(r5)     // Catch: java.lang.Throwable -> La2
                if (r12 == 0) goto L96
                r12.i()     // Catch: java.lang.Throwable -> La2
            L96:
                r12 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9c:
                wo.n.a(r4, r6)
                wn.v r12 = wn.v.f59242a
                return r12
            La2:
                r12 = move-exception
                r3 = r4
                goto La6
            La5:
                r12 = move-exception
            La6:
                throw r12     // Catch: java.lang.Throwable -> La7
            La7:
                r0 = move-exception
                wo.n.a(r3, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$61", f = "PlayerActivity.kt", l = {3213}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22027w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<jf.h> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22029w;

            public a(PlayerActivity playerActivity) {
                this.f22029w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(jf.h hVar, ao.d<? super wn.v> dVar) {
                if (hVar.c() != CollabType.LIVE) {
                    return wn.v.f59242a;
                }
                this.f22029w.finish();
                if (this.f22029w.D6().a().d()) {
                    PlayerActivity playerActivity = this.f22029w;
                    playerActivity.startActivity(playerActivity.s6().o(this.f22029w, null));
                } else {
                    PlayerActivity playerActivity2 = this.f22029w;
                    playerActivity2.startActivity(playerActivity2.s6().v(this.f22029w, null, hVar.a()));
                }
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
            int i10 = this.f22027w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<jf.h> b02 = PlayerActivity.this.z6().b0();
                a aVar = new a(PlayerActivity.this);
                this.f22027w = 1;
                if (b02.a(aVar, this) == c10) {
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
    public static final class b2 extends jo.q implements io.l<Boolean, wn.v> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ boolean f22030w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ EventBannerResponse f22031x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ PlayerActivity f22032y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f22033z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b2(boolean z10, EventBannerResponse eventBannerResponse, PlayerActivity playerActivity, boolean z11, String str) {
            super(1);
            this.f22030w = z10;
            this.f22031x = eventBannerResponse;
            this.f22032y = playerActivity;
            this.f22033z = z11;
            this.A = str;
        }

        public final void a(boolean z10) {
            String str;
            EventBannerResponse eventBannerResponse;
            String eventHelpPageUrl;
            if (this.f22030w) {
                if (z10 && (eventBannerResponse = this.f22031x) != null && (eventHelpPageUrl = eventBannerResponse.getEventHelpPageUrl()) != null) {
                    be.k1.R0.a(eventHelpPageUrl).z3(this.f22032y.a3(), "EmomoRunGiftInfoDialog");
                }
                if (this.f22031x == null || !this.f22032y.G6().Q()) {
                    return;
                }
                this.f22032y.G6().F4(false);
            } else if (!this.f22033z || (str = this.A) == null) {
            } else {
                PlayerActivity playerActivity = this.f22032y;
                jf.b0 a10 = playerActivity.H6().a(str);
                if (!(a10 instanceof b0.l0)) {
                    playerActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(playerActivity, Referer.LIVE_VIEW, a10));
                } else {
                    playerActivity.startActivity(WebViewActivity.a.b(WebViewActivity.X, playerActivity, str, false, false, 12, null));
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Boolean bool) {
            a(bool.booleanValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b3 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22034w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22035x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22036y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22034w = aVar;
            this.f22035x = aVar2;
            this.f22036y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f22034w;
            vq.a aVar2 = this.f22035x;
            io.a<? extends uq.a> aVar3 = this.f22036y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b4 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f22037w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b4(ComponentActivity componentActivity) {
            super(0);
            this.f22037w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f22037w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22038a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f22039b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f22040c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f22041d;

        static {
            int[] iArr = new int[ve.d.values().length];
            iArr[ve.d.BIRTHDAY.ordinal()] = 1;
            iArr[ve.d.ANNIVERSARY.ordinal()] = 2;
            f22038a = iArr;
            int[] iArr2 = new int[CollabType.values().length];
            iArr2[CollabType.CALL.ordinal()] = 1;
            iArr2[CollabType.LIVE.ordinal()] = 2;
            f22039b = iArr2;
            int[] iArr3 = new int[ShooterMemberStatus.values().length];
            iArr3[ShooterMemberStatus.INVITING.ordinal()] = 1;
            iArr3[ShooterMemberStatus.INVITED.ordinal()] = 2;
            iArr3[ShooterMemberStatus.CANCELING.ordinal()] = 3;
            f22040c = iArr3;
            int[] iArr4 = new int[nd.c.values().length];
            iArr4[nd.c.EVENT.ordinal()] = 1;
            iArr4[nd.c.INTERNAL.ordinal()] = 2;
            iArr4[nd.c.NONE.ordinal()] = 3;
            f22041d = iArr4;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$37", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22042w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22043x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22044y;

        /* renamed from: z  reason: collision with root package name */
        public int f22045z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22046w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerActivity playerActivity) {
                super(0);
                this.f22046w = playerActivity;
            }

            public final void a() {
                c0.g(this.f22046w);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public c0(ao.d<? super c0> dVar) {
            super(2, dVar);
        }

        public static final void g(PlayerActivity playerActivity) {
            be.k3.O0.a(playerActivity.J6().u2()).z3(playerActivity.a3(), "NominatedToModeratorDialog");
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0070, B:23:0x007c, B:24:0x0089), top: B:35:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22045z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22044y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22043x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22042w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.Z0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9b
                r4 = r9
                r9 = r8
            L3d:
                r9.f22042w = r4     // Catch: java.lang.Throwable -> L9b
                r9.f22043x = r3     // Catch: java.lang.Throwable -> L9b
                r9.f22044y = r1     // Catch: java.lang.Throwable -> L9b
                r9.f22045z = r2     // Catch: java.lang.Throwable -> L9b
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L98
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L98
                if (r9 == 0) goto L92
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L98
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L98
                kf.x r6 = com.dena.mirrativ.player.PlayerActivity.U4(r5)     // Catch: java.lang.Throwable -> L98
                java.lang.String r6 = r6.T4()     // Catch: java.lang.Throwable -> L98
                boolean r9 = jo.p.c(r9, r6)     // Catch: java.lang.Throwable -> L98
                if (r9 == 0) goto L8c
                androidx.lifecycle.o r9 = r5.g()     // Catch: java.lang.Throwable -> L98
                androidx.lifecycle.o$c r9 = r9.b()     // Catch: java.lang.Throwable -> L98
                androidx.lifecycle.o$c r6 = androidx.lifecycle.o.c.RESUMED     // Catch: java.lang.Throwable -> L98
                if (r9 == r6) goto L89
                com.dena.mirrorman.util.FragmentRunner r9 = com.dena.mirrativ.player.PlayerActivity.B4(r5)     // Catch: java.lang.Throwable -> L98
                com.dena.mirrativ.player.PlayerActivity$c0$a r6 = new com.dena.mirrativ.player.PlayerActivity$c0$a     // Catch: java.lang.Throwable -> L98
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L98
                r9.c(r6)     // Catch: java.lang.Throwable -> L98
                goto L8c
            L89:
                g(r5)     // Catch: java.lang.Throwable -> L98
            L8c:
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$62", f = "PlayerActivity.kt", l = {3225}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22047w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22049w;

            public a(PlayerActivity playerActivity) {
                this.f22049w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                te.c f10 = this.f22049w.z6().j1().f();
                if (f10 == null) {
                    return wn.v.f59242a;
                }
                this.f22049w.L5(f10.getCollabEnabled(), f10.getCollabHasVacancy());
                return wn.v.f59242a;
            }
        }

        public c1(ao.d<? super c1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22047w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<wn.v> n02 = PlayerActivity.this.z6().n0();
                a aVar = new a(PlayerActivity.this);
                this.f22047w = 1;
                if (n02.a(aVar, this) == c10) {
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
    public static final class c2 extends jo.q implements io.p<String, View, wn.v> {
        public c2() {
            super(2);
        }

        public final void a(String str, View view) {
            Object obj;
            jo.p.h(str, "giftId");
            jo.p.h(view, "cell");
            List<jf.q> f10 = PlayerActivity.this.z6().w0().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((jf.q) obj).h(), str)) {
                        break;
                    }
                }
                jf.q qVar = (jf.q) obj;
                if (qVar != null) {
                    PlayerActivity playerActivity = PlayerActivity.this;
                    if (qVar.q().e()) {
                        qVar.a();
                        qVar.r();
                        playerActivity.O7(qVar, view);
                    } else if (qVar.q() == ve.d.EMOMO_RUN_SCORE) {
                        o1.a aVar = be.o1.W0;
                        jf.f f11 = playerActivity.z6().h0().f();
                        int e10 = f11 != null ? f11.e() : 0;
                        Integer f12 = playerActivity.z6().x0().f();
                        if (f12 == null) {
                            f12 = 0;
                        }
                        jo.p.g(f12, "playerStore.emomoRunScores.value ?: 0");
                        aVar.a(qVar, e10, f12.intValue()).z3(playerActivity.a3(), "EmomoRunScoreGiftDialog");
                    }
                }
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(String str, View view) {
            a(str, view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c3 extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22051w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22052x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22051w = aVar;
            this.f22052x = aVar2;
            this.f22053y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            xq.a b10;
            oq.a aVar = this.f22051w;
            vq.a aVar2 = this.f22052x;
            io.a<? extends uq.a> aVar3 = this.f22053y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.m.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c4 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f22054w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22055x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22056y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f22057z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c4(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f22054w = aVar;
            this.f22055x = aVar2;
            this.f22056y = aVar3;
            this.f22057z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f22054w;
            vq.a aVar2 = this.f22055x;
            io.a aVar3 = this.f22056y;
            xq.a aVar4 = this.f22057z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ te.c f22059x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(te.c cVar) {
            super(0);
            this.f22059x = cVar;
        }

        public final void a() {
            if (!PlayerActivity.this.j6().K0() && !PlayerActivity.this.l6().s().h()) {
                PlayerActivity.this.i6().H.setVisibility(0);
                if (this.f22059x.isConnectedStreamingCollab()) {
                    PlayerActivity.this.i6().H.setImageResource(hb.v1.img_collab_off);
                    return;
                } else if (this.f22059x.getCollabEnabled() && this.f22059x.getCollabHasVacancy()) {
                    if (!this.f22059x.isStreamingCollabEnabled() && PlayerActivity.this.D6().a().d()) {
                        PlayerActivity.this.i6().H.setImageResource(hb.v1.img_collab_off);
                        return;
                    } else {
                        PlayerActivity.this.i6().H.setImageResource(hb.v1.img_collab_on);
                        return;
                    }
                } else {
                    PlayerActivity.this.i6().H.setImageResource(hb.v1.img_collab_off);
                    if (PlayerActivity.this.D0 == null || PlayerActivity.this.l6().s().c()) {
                        return;
                    }
                    t1.a aVar = yd.t1.f61795x;
                    Context applicationContext = PlayerActivity.this.getApplicationContext();
                    jo.p.g(applicationContext, "applicationContext");
                    String string = PlayerActivity.this.getString(hb.b2.text_collab_error_3);
                    jo.p.g(string, "getString(R.string.text_collab_error_3)");
                    aVar.a(applicationContext, string);
                    PlayerActivity.this.S5();
                    return;
                }
            }
            PlayerActivity.this.i6().H.setImageResource(hb.v1.img_collab_off);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$38", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22060w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22061x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22062y;

        /* renamed from: z  reason: collision with root package name */
        public int f22063z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22063z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22062y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22061x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22060w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L77
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.R0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L77
                r4 = r9
                r9 = r8
            L3d:
                r9.f22060w = r4     // Catch: java.lang.Throwable -> L77
                r9.f22061x = r3     // Catch: java.lang.Throwable -> L77
                r9.f22062y = r1     // Catch: java.lang.Throwable -> L77
                r9.f22063z = r2     // Catch: java.lang.Throwable -> L77
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L77
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L74
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L74
                if (r9 == 0) goto L6e
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L74
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L74
                int r9 = hb.b2.F     // Catch: java.lang.Throwable -> L74
                r6 = 0
                of.n.A(r5, r9, r6)     // Catch: java.lang.Throwable -> L74
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6e:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L74:
                r9 = move-exception
                r3 = r4
                goto L78
            L77:
                r9 = move-exception
            L78:
                throw r9     // Catch: java.lang.Throwable -> L79
            L79:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.d0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$63", f = "PlayerActivity.kt", l = {3232}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22064w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22066w;

            public a(PlayerActivity playerActivity) {
                this.f22066w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f22066w.H8(true);
                return wn.v.f59242a;
            }
        }

        public d1(ao.d<? super d1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22064w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> c02 = PlayerActivity.this.z6().c0();
                a aVar = new a(PlayerActivity.this);
                this.f22064w = 1;
                if (c02.a(aVar, this) == c10) {
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
    public static final class d2 extends jo.q implements io.a<wn.v> {
        public d2() {
            super(0);
        }

        public final void a() {
            LiveAd ad2;
            LiveAdAppBanner appBanner;
            te.c f10 = PlayerActivity.this.z6().j1().f();
            if (f10 == null || (ad2 = f10.getAd()) == null || (appBanner = ad2.getAppBanner()) == null) {
                return;
            }
            PlayerActivity.this.K6(appBanner);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d3 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22068w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22069x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22070y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22068w = aVar;
            this.f22069x = aVar2;
            this.f22070y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f22068w;
            vq.a aVar2 = this.f22069x;
            io.a<? extends uq.a> aVar3 = this.f22070y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d4 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f22071w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d4(ComponentActivity componentActivity) {
            super(0);
            this.f22071w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = this.f22071w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22073w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerActivity playerActivity) {
                super(0);
                this.f22073w = playerActivity;
            }

            public final void a() {
                this.f22073w.d6();
                if (!this.f22073w.x6().h(this.f22073w.getTaskId())) {
                    PlayerActivity.super.finish();
                } else {
                    this.f22073w.finishAndRemoveTask();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public e() {
            super(0);
        }

        public final void a() {
            n0.a.b(be.n0.O0, Referer.LIVE_VIEW, 0, 0, 0, new a(PlayerActivity.this), 14, null).z3(PlayerActivity.this.a3(), "ConfirmModeratorDialog");
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$39", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22074w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22075x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22076y;

        /* renamed from: z  reason: collision with root package name */
        public int f22077z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22077z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22076y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22075x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22074w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.Q0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22074w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22075x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22076y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22077z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$64", f = "PlayerActivity.kt", l = {3238}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22078w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22080w;

            public a(PlayerActivity playerActivity) {
                this.f22080w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f22080w.H8(false);
                return wn.v.f59242a;
            }
        }

        public e1(ao.d<? super e1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22078w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> t02 = PlayerActivity.this.z6().t0();
                a aVar = new a(PlayerActivity.this);
                this.f22078w = 1;
                if (t02.a(aVar, this) == c10) {
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
    public static final class e2 extends jo.q implements io.a<wn.v> {
        public e2() {
            super(0);
        }

        public final void a() {
            PlayerActivity.this.Y0 = true;
            PlayerActivity.this.G8();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e3 extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22082w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22083x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22084y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22082w = aVar;
            this.f22083x = aVar2;
            this.f22084y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            xq.a b10;
            oq.a aVar = this.f22082w;
            vq.a aVar2 = this.f22083x;
            io.a<? extends uq.a> aVar3 = this.f22084y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(MRRequest.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e4 extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ud.w1 f22085w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ PlayerActivity f22086x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22087y;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22088w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ ud.w1 f22089x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f22090y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerActivity playerActivity, ud.w1 w1Var, String str) {
                super(0);
                this.f22088w = playerActivity;
                this.f22089x = w1Var;
                this.f22090y = str;
            }

            public final void a() {
                this.f22088w.y6().h0(this.f22089x.c(), this.f22090y, true);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.l<wn.k<? extends ud.v1, ? extends PointF>, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22091w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PlayerActivity playerActivity) {
                super(1);
                this.f22091w = playerActivity;
            }

            public final void a(wn.k<ud.v1, ? extends PointF> kVar) {
                jo.p.h(kVar, "<name for destructuring parameter 0>");
                this.f22091w.S7(kVar.a(), kVar.b());
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(wn.k<? extends ud.v1, ? extends PointF> kVar) {
                a(kVar);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22092w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ ud.w1 f22093x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(PlayerActivity playerActivity, ud.w1 w1Var) {
                super(0);
                this.f22092w = playerActivity;
                this.f22093x = w1Var;
            }

            public final void a() {
                tb.a H = this.f22092w.s6().H(Referer.LIVE_VIEW, this.f22093x.c());
                H.a().z3(this.f22092w.a3(), H.b());
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e4(ud.w1 w1Var, PlayerActivity playerActivity, String str) {
            super(2);
            this.f22085w = w1Var;
            this.f22086x = playerActivity;
            this.f22087y = str;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            ud.w1 w1Var = this.f22085w;
            pb.b.a(w1Var, new a(this.f22086x, w1Var, this.f22087y), new b(this.f22086x), new c(this.f22086x, this.f22085w), iVar, ud.w1.f55633h);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$finishShooterLoadingDialogFragmentListener$1", f = "PlayerActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22094w;

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
            String liveId;
            bo.c.c();
            if (this.f22094w == 0) {
                wn.m.b(obj);
                te.c f10 = PlayerActivity.this.z6().j1().f();
                if (f10 != null && (liveId = f10.getLiveId()) != null) {
                    ShooterMatchingStateChangedBcsvrResponse value = PlayerActivity.this.z6().p1().getValue();
                    if (value != null) {
                        PlayerActivity playerActivity = PlayerActivity.this;
                        Integer groupId = value.getGroupId();
                        if (groupId != null) {
                            int intValue = groupId.intValue();
                            String stageId = value.getStageId();
                            if (stageId != null && (value.getMatchingStatus() == ShooterTeamStatus.MATCHED || value.getMatchingStatus() == ShooterTeamStatus.LAUNCHING)) {
                                playerActivity.startActivity(playerActivity.s6().a0(playerActivity, false, false, value.getSeasonId(), intValue, value.getTeamId(), stageId, liveId));
                                Fragment e02 = playerActivity.a3().e0("ShooterLoadingDialogFragment");
                                androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
                                if (eVar != null) {
                                    eVar.n3();
                                }
                            }
                        }
                    }
                    return wn.v.f59242a;
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 implements ViewTreeObserver.OnGlobalLayoutListener {
        public f0() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PlayerActivity.this.i6().V.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int[] iArr = new int[2];
            PlayerActivity.this.i6().V.getLocationInWindow(iArr);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = PlayerActivity.this.getSystemService("window");
            jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            float width = ((displayMetrics.widthPixels - iArr[0]) - (PlayerActivity.this.i6().U.getWidth() / 2)) - (PlayerActivity.this.i6().V.getWidth() / 2);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            PlayerActivity playerActivity = PlayerActivity.this;
            cVar.g(playerActivity.i6().T);
            cVar.A(playerActivity.i6().U.getId(), 7, (int) width);
            cVar.c(PlayerActivity.this.i6().T);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$65", f = "PlayerActivity.kt", l = {3244}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22097w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.k<? extends Integer, ? extends LiveCommentResponse>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22099w;

            public a(PlayerActivity playerActivity) {
                this.f22099w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<Integer, LiveCommentResponse> kVar, ao.d<? super wn.v> dVar) {
                int intValue = kVar.a().intValue();
                if (intValue == 1) {
                    this.f22099w.q7();
                    hf.b.f35490a.g();
                    FirebaseAnalytics.getInstance(this.f22099w).a("vmbe82", null);
                } else if (intValue == 3 || intValue == 106) {
                    PlayerService c10 = this.f22099w.B6().c();
                    if (c10 != null) {
                        c10.I0(true);
                    }
                    this.f22099w.X0 = null;
                    this.f22099w.F0 = null;
                    this.f22099w.f21997r1 = null;
                }
                return wn.v.f59242a;
            }
        }

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
            int i10 = this.f22097w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<Integer, LiveCommentResponse>> k12 = PlayerActivity.this.z6().k1();
                a aVar = new a(PlayerActivity.this);
                this.f22097w = 1;
                if (k12.a(aVar, this) == c10) {
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
    public static final class f2 extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0<uo.d2> f22101x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jo.e0<uo.d2> f22102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f2(jo.e0<uo.d2> e0Var, jo.e0<uo.d2> e0Var2) {
            super(0);
            this.f22101x = e0Var;
            this.f22102y = e0Var2;
        }

        public final void a() {
            String liveId;
            te.c f10 = PlayerActivity.this.z6().j1().f();
            if (f10 == null) {
                return;
            }
            String liveId2 = f10.getLiveId();
            LinkedLive linkedLive = f10.getLinkedLive();
            if (linkedLive == null || (liveId = linkedLive.getLiveId()) == null) {
                return;
            }
            PlayerActivity.this.k6().p(jf.k.PLAYER_LINKED_LIVE_VIEW);
            PlayerActivity.this.E0 = null;
            PlayerActivity.this.R5();
            PlayerActivity.this.S5();
            PlayerActivity.this.X0 = liveId2;
            PlayerActivity.this.M5(liveId2, liveId);
            PlayerActivity.this.L5(f10.getCollabEnabled(), f10.getCollabHasVacancy());
            LinkedLive linkedLive2 = new LinkedLive(f10.getLiveId(), f10.f(), f10.b(), f10.e(), f10.g());
            PlayerActivity.this.f22005z0.offer(linkedLive2);
            PlayerActivity.this.i6().f38521n0.setVisibility(0);
            PlayerActivity.this.i6().f38521n0.setCasterImageUrl(linkedLive2.getOwnerImageUrl());
            PlayerActivity.this.i6().f38521n0.setCasterBadgeImageUrl(linkedLive2.getOwnerBadgeImageUrl());
            PlayerActivity.this.i6().f38521n0.setLiveTitle(linkedLive2.getOwnerName());
            PlayerActivity.k8(this.f22101x, PlayerActivity.this);
            PlayerActivity.j8(this.f22102y, PlayerActivity.this);
            MRLogger u62 = PlayerActivity.this.u6();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_FRIEND_LINK_CLICK);
            builder.setTargetType("friend_link");
            builder.setTargetId(liveId);
            u62.sendLog(builder.build());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f3 extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22103w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22104x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22105y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22103w = aVar;
            this.f22104x = aVar2;
            this.f22105y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            xq.a b10;
            oq.a aVar = this.f22103w;
            vq.a aVar2 = this.f22104x;
            io.a<? extends uq.a> aVar3 = this.f22105y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(of.k.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f4 implements ia.a {
        public f4() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                if (PlayerActivity.this.g().b() != o.c.RESUMED) {
                    return;
                }
                PlayerActivity.this.i6().f38519l0.setVisibility(0);
                PlayerService c10 = PlayerActivity.this.B6().c();
                if (c10 != null) {
                    c10.H0(false);
                }
                PlayerActivity.this.H0 = b.Full;
            } catch (IndexOutOfBoundsException e10) {
                g9.a.c(e10);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements hb.f2 {
        public g() {
        }

        @Override // hb.f2
        public void a(String str) {
            jo.p.h(str, "userId");
            PlayerActivity.this.t8(str, false);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$40", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22108w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22109x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22110y;

        /* renamed from: z  reason: collision with root package name */
        public int f22111z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22111z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22110y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22109x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22108w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.C1()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22108w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22109x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22110y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22111z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrorman.net.api.response.live.LinkedLive r9 = (com.dena.mirrorman.net.api.response.live.LinkedLive) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.H5(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$66", f = "PlayerActivity.kt", l = {3264}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22112w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22114w;

            public a(PlayerActivity playerActivity) {
                this.f22114w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f22114w.L6(mRError);
                return wn.v.f59242a;
            }
        }

        public g1(ao.d<? super g1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22112w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> d02 = PlayerActivity.this.z6().d0();
                a aVar = new a(PlayerActivity.this);
                this.f22112w = 1;
                if (d02.a(aVar, this) == c10) {
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
    public static final class g2 extends jo.q implements io.a<wn.v> {
        public g2() {
            super(0);
        }

        public final void a() {
            PlayerActivity.this.i6().f38522o0.animate().translationX(of.t.b(PlayerActivity.this, TsExtractor.TS_STREAM_TYPE_DTS)).setDuration(300L);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g3 extends jo.q implements io.a<jf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22116w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22117x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22118y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22116w = aVar;
            this.f22117x = aVar2;
            this.f22118y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jf.d0] */
        @Override // io.a
        public final jf.d0 invoke() {
            xq.a b10;
            oq.a aVar = this.f22116w;
            vq.a aVar2 = this.f22117x;
            io.a<? extends uq.a> aVar3 = this.f22118y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(jf.d0.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g4 implements ia.a {
        public g4() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            PlayerActivity.this.i6().B0.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0 f22120a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f22121b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData f22122c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f22123d;

        public h(androidx.lifecycle.c0 c0Var, LiveData liveData, LiveData liveData2, LiveData liveData3) {
            this.f22120a = c0Var;
            this.f22121b = liveData;
            this.f22122c = liveData2;
            this.f22123d = liveData3;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            T f10 = this.f22120a.f();
            Object f11 = this.f22121b.f();
            Object f12 = this.f22122c.f();
            Object f13 = this.f22123d.f();
            if (f10 == null || f11 == null || f12 == null || f13 == null) {
                return;
            }
            androidx.lifecycle.c0 c0Var = this.f22120a;
            boolean booleanValue = ((Boolean) f12).booleanValue();
            boolean booleanValue2 = ((Boolean) f11).booleanValue();
            List list = (List) f10;
            ArrayList arrayList = new ArrayList();
            for (T t10 : (List) f13) {
                jf.q qVar = (jf.q) t10;
                if ((booleanValue2 && qVar.q().l()) || (booleanValue && qVar.q().h())) {
                    arrayList.add(t10);
                }
            }
            c0Var.p(arrayList);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$41", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22124w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22125x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22126y;

        /* renamed from: z  reason: collision with root package name */
        public int f22127z;

        public h0(ao.d<? super h0> dVar) {
            super(2, dVar);
        }

        public static final void g(PlayerActivity playerActivity) {
            rb.c cVar = playerActivity.f21977h1;
            if (cVar != null) {
                cVar.m();
            }
            playerActivity.i6().f38526s0.setVisibility(4);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22127z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22126y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22125x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22124w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L79
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.u0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L79
                r4 = r9
                r9 = r8
            L3d:
                r9.f22124w = r4     // Catch: java.lang.Throwable -> L79
                r9.f22125x = r3     // Catch: java.lang.Throwable -> L79
                r9.f22126y = r1     // Catch: java.lang.Throwable -> L79
                r9.f22127z = r2     // Catch: java.lang.Throwable -> L79
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L79
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L76
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L76
                if (r9 == 0) goto L70
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L76
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L76
                hb.r0 r9 = new hb.r0     // Catch: java.lang.Throwable -> L76
                r9.<init>()     // Catch: java.lang.Throwable -> L76
                r5.runOnUiThread(r9)     // Catch: java.lang.Throwable -> L76
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L70:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L76:
                r9 = move-exception
                r3 = r4
                goto L7a
            L79:
                r9 = move-exception
            L7a:
                throw r9     // Catch: java.lang.Throwable -> L7b
            L7b:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.h0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$67", f = "PlayerActivity.kt", l = {3270}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22128w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22130y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22131w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f22132x;

            /* renamed from: com.dena.mirrativ.player.PlayerActivity$h1$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0193a implements sf.i {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ PlayerActivity f22133a;

                public C0193a(PlayerActivity playerActivity) {
                    this.f22133a = playerActivity;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    i.a.a(this, animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f22133a.i6().f38515h0.setVisibility(8);
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

            public a(PlayerActivity playerActivity, String str) {
                this.f22131w = playerActivity;
                this.f22132x = str;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f22131w.i6().f38515h0.setVisibility(0);
                this.f22131w.i6().f38515h0.e(new C0193a(this.f22131w));
                this.f22131w.i6().f38515h0.r();
                te.c f10 = this.f22131w.z6().j1().f();
                if (f10 != null && f10.getLiveId() != null) {
                    PlayerActivity playerActivity = this.f22131w;
                    String str = this.f22132x;
                    hb.i y62 = playerActivity.y6();
                    u2.a aVar = ud.u2.f55565g;
                    String string = playerActivity.getString(hb.b2.text_app_mutual_gift_achieved_viewer);
                    jo.p.g(string, "getString(R.string.text_…ual_gift_achieved_viewer)");
                    y62.U(aVar.a(playerActivity, str, string));
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(String str, ao.d<? super h1> dVar) {
            super(2, dVar);
            this.f22130y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h1(this.f22130y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22128w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> a12 = PlayerActivity.this.z6().a1();
                a aVar = new a(PlayerActivity.this, this.f22130y);
                this.f22128w = 1;
                if (a12.a(aVar, this) == c10) {
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
    public static final class h2 extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0<uo.d2> f22135x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h2(jo.e0<uo.d2> e0Var) {
            super(0);
            this.f22135x = e0Var;
        }

        public final void a() {
            LinkedLive linkedLive;
            String ownerId;
            if (PlayerActivity.this.i6().f38522o0.getTranslationX() == 0.0f) {
                te.c f10 = PlayerActivity.this.z6().j1().f();
                if (f10 != null && (linkedLive = f10.getLinkedLive()) != null && (ownerId = linkedLive.getOwnerId()) != null) {
                    PlayerActivity.this.t8(ownerId, false);
                }
                PlayerActivity.k8(this.f22135x, PlayerActivity.this);
                return;
            }
            PlayerActivity.this.i6().f38522o0.animate().translationX(0.0f).setDuration(300L);
            PlayerActivity.k8(this.f22135x, PlayerActivity.this);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h3 extends jo.q implements io.a<hb.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22136w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22137x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22138y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22136w = aVar;
            this.f22137x = aVar2;
            this.f22138y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hb.i, java.lang.Object] */
        @Override // io.a
        public final hb.i invoke() {
            xq.a b10;
            oq.a aVar = this.f22136w;
            vq.a aVar2 = this.f22137x;
            io.a<? extends uq.a> aVar3 = this.f22138y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hb.i.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h4 implements ia.a {
        public h4() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                if (PlayerActivity.this.g().b() != o.c.RESUMED) {
                    return;
                }
                PlayerActivity.this.i6().f38519l0.setVisibility(8);
                PlayerActivity.this.i6().f38516i0.setVisibility(0);
                PlayerService c10 = PlayerActivity.this.B6().c();
                if (c10 != null) {
                    c10.H0(true);
                }
                PlayerActivity.this.H0 = b.Message;
            } catch (IndexOutOfBoundsException e10) {
                g9.a.c(e10);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$11$1", f = "PlayerActivity.kt", l = {2589}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22140w;

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
            int i10 = this.f22140w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f22140w = 1;
                if (uo.b1.a(500L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            wn.k<Boolean, Boolean> f10 = PlayerActivity.this.z6().m0().f();
            if (f10 == null) {
                return wn.v.f59242a;
            }
            PlayerActivity.this.L5(f10.c().booleanValue(), f10.d().booleanValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$42", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22142w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22143x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22144y;

        /* renamed from: z  reason: collision with root package name */
        public int f22145z;

        public i0(ao.d<? super i0> dVar) {
            super(2, dVar);
        }

        public static final void g(PlayerActivity playerActivity, QuizMessage quizMessage) {
            rb.c cVar = playerActivity.f21977h1;
            if (cVar != null) {
                cVar.setQuestionData(quizMessage);
            }
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22145z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22144y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22143x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22142w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L84
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.u1()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L84
                r4 = r9
                r9 = r8
            L3d:
                r9.f22142w = r4     // Catch: java.lang.Throwable -> L84
                r9.f22143x = r3     // Catch: java.lang.Throwable -> L84
                r9.f22144y = r1     // Catch: java.lang.Throwable -> L84
                r9.f22145z = r2     // Catch: java.lang.Throwable -> L84
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L84
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
                if (r9 == 0) goto L7b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L81
                com.dena.mirrorman.net.quiz.QuizMessage r9 = (com.dena.mirrorman.net.quiz.QuizMessage) r9     // Catch: java.lang.Throwable -> L81
                rb.c r6 = com.dena.mirrativ.player.PlayerActivity.H4(r5)     // Catch: java.lang.Throwable -> L81
                if (r6 == 0) goto L75
                java.lang.String r6 = "QuizPopupDialog"
                com.dena.mirrativ.player.PlayerActivity.k4(r5, r6)     // Catch: java.lang.Throwable -> L81
                hb.s0 r6 = new hb.s0     // Catch: java.lang.Throwable -> L81
                r6.<init>()     // Catch: java.lang.Throwable -> L81
                r5.runOnUiThread(r6)     // Catch: java.lang.Throwable -> L81
            L75:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L81:
                r9 = move-exception
                r3 = r4
                goto L85
            L84:
                r9 = move-exception
            L85:
                throw r9     // Catch: java.lang.Throwable -> L86
            L86:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$68", f = "PlayerActivity.kt", l = {3291}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22146w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22148y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.k<? extends LiveGameStartResponse, ? extends Boolean>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22149w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f22150x;

            public a(PlayerActivity playerActivity, String str) {
                this.f22149w = playerActivity;
                this.f22150x = str;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<LiveGameStartResponse, Boolean> kVar, ao.d<? super wn.v> dVar) {
                LiveGameStartResponse a10 = kVar.a();
                if (kVar.b().booleanValue()) {
                    if (a10.isLandscape() && this.f22149w.getResources().getConfiguration().orientation != 2) {
                        t1.a aVar = yd.t1.f61795x;
                        Context applicationContext = this.f22149w.getApplicationContext();
                        jo.p.g(applicationContext, "applicationContext");
                        String string = this.f22149w.getString(hb.b2.text_live_game_orientation_landscape);
                        jo.p.g(string, "getString(R.string.text_…me_orientation_landscape)");
                        aVar.a(applicationContext, string);
                        return wn.v.f59242a;
                    } else if (!a10.isLandscape() && this.f22149w.getResources().getConfiguration().orientation != 1) {
                        t1.a aVar2 = yd.t1.f61795x;
                        Context applicationContext2 = this.f22149w.getApplicationContext();
                        jo.p.g(applicationContext2, "applicationContext");
                        String string2 = this.f22149w.getString(hb.b2.text_live_game_orientation_portrait);
                        jo.p.g(string2, "getString(R.string.text_…ame_orientation_portrait)");
                        aVar2.a(applicationContext2, string2);
                        return wn.v.f59242a;
                    } else {
                        PlayerActivity playerActivity = this.f22149w;
                        tb.c s62 = playerActivity.s6();
                        Context applicationContext3 = this.f22149w.getApplicationContext();
                        jo.p.g(applicationContext3, "applicationContext");
                        playerActivity.startActivity(s62.t0(applicationContext3, Referer.LIVE_VIEW, a10.getLiveGameId(), a10.getLaunchUrl(), a10.getPlayId(), a10.isLandscape(), this.f22150x));
                    }
                } else {
                    PlayerActivity playerActivity2 = this.f22149w;
                    tb.c s63 = playerActivity2.s6();
                    Context applicationContext4 = this.f22149w.getApplicationContext();
                    jo.p.g(applicationContext4, "applicationContext");
                    playerActivity2.startActivity(s63.u(applicationContext4, Referer.LIVE_VIEW, a10.getLiveGameId(), a10.getLaunchUrl(), a10.getPlayId(), a10.isLandscape(), this.f22150x));
                }
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(String str, ao.d<? super i1> dVar) {
            super(2, dVar);
            this.f22148y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i1(this.f22148y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22146w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<LiveGameStartResponse, Boolean>> v12 = PlayerActivity.this.z6().v1();
                a aVar = new a(PlayerActivity.this, this.f22148y);
                this.f22146w = 1;
                if (v12.a(aVar, this) == c10) {
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
    public static final class i2 extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0<uo.d2> f22152x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jo.e0<uo.d2> f22153y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i2(jo.e0<uo.d2> e0Var, jo.e0<uo.d2> e0Var2) {
            super(0);
            this.f22152x = e0Var;
            this.f22153y = e0Var2;
        }

        public final void a() {
            LinkedLive linkedLive;
            String liveId;
            te.c f10 = PlayerActivity.this.z6().j1().f();
            if (f10 == null || (linkedLive = (LinkedLive) PlayerActivity.this.f22005z0.removeLast()) == null || (liveId = linkedLive.getLiveId()) == null) {
                return;
            }
            PlayerActivity.this.k6().p(jf.k.PLAYER_LINKED_LIVE_BACK_VIEW);
            PlayerActivity.this.E0 = null;
            PlayerActivity.this.R5();
            PlayerActivity.this.S5();
            PlayerActivity.this.F0 = f10.getLiveId();
            PlayerActivity.this.M5(f10.getLiveId(), liveId);
            PlayerActivity.this.L5(f10.getCollabEnabled(), f10.getCollabHasVacancy());
            if (!PlayerActivity.this.f22005z0.isEmpty()) {
                LinkedLive linkedLive2 = (LinkedLive) PlayerActivity.this.f22005z0.getLast();
                PlayerActivity.this.i6().f38521n0.setVisibility(0);
                PlayerActivity.this.i6().f38521n0.setCasterImageUrl(linkedLive2.getOwnerImageUrl());
                PlayerActivity.this.i6().f38521n0.setCasterBadgeImageUrl(linkedLive2.getOwnerBadgeImageUrl());
                PlayerActivity.this.i6().f38521n0.setLiveTitle(linkedLive2.getOwnerName());
                PlayerActivity.k8(this.f22152x, PlayerActivity.this);
                PlayerActivity.j8(this.f22153y, PlayerActivity.this);
                MRLogger u62 = PlayerActivity.this.u6();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_FRIEND_LINK_BACK);
                builder.setTargetType("friend_link");
                builder.setTargetId(liveId);
                u62.sendLog(builder.build());
                return;
            }
            PlayerActivity.this.i6().f38521n0.setVisibility(8);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i3 extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22154w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22155x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22156y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22154w = aVar;
            this.f22155x = aVar2;
            this.f22156y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            xq.a b10;
            oq.a aVar = this.f22154w;
            vq.a aVar2 = this.f22155x;
            io.a<? extends uq.a> aVar3 = this.f22156y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.z.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i4 implements ia.a {
        public i4() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            PlayerActivity.this.i6().B0.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ShooterMemberStateChangedBcsvrResponse f22158w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ PlayerActivity f22159x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse, PlayerActivity playerActivity) {
            super(1);
            this.f22158w = shooterMemberStateChangedBcsvrResponse;
            this.f22159x = playerActivity;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            be.u3.S0.a(this.f22158w.getSeasonId(), this.f22158w.getTeamId()).z3(this.f22159x.a3(), "ShooterInvitationDialogFragment");
            this.f22159x.i6().f38533z0.setVisibility(8);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$43", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22160w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22161x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22162y;

        /* renamed from: z  reason: collision with root package name */
        public int f22163z;

        public j0(ao.d<? super j0> dVar) {
            super(2, dVar);
        }

        public static final void g(PlayerActivity playerActivity, QuizMessage quizMessage) {
            rb.c cVar = playerActivity.f21977h1;
            if (cVar != null) {
                cVar.setAnswerData(quizMessage);
            }
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22163z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22162y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22161x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22160w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L84
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.s1()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L84
                r4 = r9
                r9 = r8
            L3d:
                r9.f22160w = r4     // Catch: java.lang.Throwable -> L84
                r9.f22161x = r3     // Catch: java.lang.Throwable -> L84
                r9.f22162y = r1     // Catch: java.lang.Throwable -> L84
                r9.f22163z = r2     // Catch: java.lang.Throwable -> L84
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L84
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
                if (r9 == 0) goto L7b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L81
                com.dena.mirrorman.net.quiz.QuizMessage r9 = (com.dena.mirrorman.net.quiz.QuizMessage) r9     // Catch: java.lang.Throwable -> L81
                rb.c r6 = com.dena.mirrativ.player.PlayerActivity.H4(r5)     // Catch: java.lang.Throwable -> L81
                if (r6 == 0) goto L75
                java.lang.String r6 = "QuizPopupDialog"
                com.dena.mirrativ.player.PlayerActivity.k4(r5, r6)     // Catch: java.lang.Throwable -> L81
                hb.t0 r6 = new hb.t0     // Catch: java.lang.Throwable -> L81
                r6.<init>()     // Catch: java.lang.Throwable -> L81
                r5.runOnUiThread(r6)     // Catch: java.lang.Throwable -> L81
            L75:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L81:
                r9 = move-exception
                r3 = r4
                goto L85
            L84:
                r9 = move-exception
            L85:
                throw r9     // Catch: java.lang.Throwable -> L86
            L86:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$69", f = "PlayerActivity.kt", l = {3308}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22164w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<EmomoQuestGachaTicket> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22166w;

            /* renamed from: com.dena.mirrativ.player.PlayerActivity$j1$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0194a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ mb.b f22167w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ PlayerActivity f22168x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0194a(mb.b bVar, PlayerActivity playerActivity) {
                    super(0);
                    this.f22167w = bVar;
                    this.f22168x = playerActivity;
                }

                public final void a() {
                    mb.c.P0.a(this.f22167w).z3(this.f22168x.a3(), "EmomoQuestGiftGachaTicketDialogFragment");
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
                public final /* synthetic */ PlayerActivity f22169w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(PlayerActivity playerActivity) {
                    super(0);
                    this.f22169w = playerActivity;
                }

                public final void a() {
                    b.a aVar = ie.b.P0;
                    String string = this.f22169w.getString(hb.b2.text_emomo_quest_gift_gacha_ticket_error_title);
                    jo.p.g(string, "getString(R.string.text_…gacha_ticket_error_title)");
                    aVar.a(string, this.f22169w.getString(hb.b2.text_emomo_quest_gift_gacha_ticket_error_message), this.f22169w.getString(hb.b2.f34730t0)).z3(this.f22169w.a3(), "CustomMessageDialog");
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(PlayerActivity playerActivity) {
                this.f22166w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(EmomoQuestGachaTicket emomoQuestGachaTicket, ao.d<? super wn.v> dVar) {
                mb.b a10 = mb.b.B.a(emomoQuestGachaTicket.getGiftId(), emomoQuestGachaTicket.getGachaTicketCount(), emomoQuestGachaTicket.getGiftEventId());
                if (a10.d()) {
                    this.f22166w.f22003x0.c(new C0194a(a10, this.f22166w));
                } else {
                    this.f22166w.f22003x0.c(new b(this.f22166w));
                }
                return wn.v.f59242a;
            }
        }

        public j1(ao.d<? super j1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22164w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<EmomoQuestGachaTicket> I0 = PlayerActivity.this.z6().I0();
                a aVar = new a(PlayerActivity.this);
                this.f22164w = 1;
                if (I0.a(aVar, this) == c10) {
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
    public static final class j2 extends jo.q implements io.a<wn.v> {
        public j2() {
            super(0);
        }

        public final void a() {
            PlayerActivity.this.i6().f38521n0.animate().translationX(of.t.b(PlayerActivity.this, -138)).setDuration(300L);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j3 extends jo.q implements io.a<hb.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22171w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22172x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22171w = aVar;
            this.f22172x = aVar2;
            this.f22173y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hb.b] */
        @Override // io.a
        public final hb.b invoke() {
            xq.a b10;
            oq.a aVar = this.f22171w;
            vq.a aVar2 = this.f22172x;
            io.a<? extends uq.a> aVar3 = this.f22173y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hb.b.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$updateLinkedLive$1", f = "PlayerActivity.kt", l = {4778}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j4 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22174w;

        public j4(ao.d<? super j4> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j4(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j4) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22174w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f22174w = 1;
                if (uo.b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            PlayerActivity.this.i6().f38522o0.animate().translationX(of.t.b(PlayerActivity.this, TsExtractor.TS_STREAM_TYPE_DTS)).setDuration(300L);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$19", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22176w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22177x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22178y;

        /* renamed from: z  reason: collision with root package name */
        public int f22179z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22179z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22178y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22177x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22176w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.F1()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22176w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22177x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22178y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22179z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$44", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22180w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22181x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22182y;

        /* renamed from: z  reason: collision with root package name */
        public int f22183z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22183z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22182y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22181x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22180w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.y0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22180w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22181x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22182y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22183z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.o4(r5)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$70", f = "PlayerActivity.kt", l = {3332}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22184w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22186w;

            @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$70$1", f = "PlayerActivity.kt", l = {3333}, m = "emit")
            /* renamed from: com.dena.mirrativ.player.PlayerActivity$k1$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0195a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f22187w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f22188x;

                /* renamed from: z  reason: collision with root package name */
                public int f22190z;

                public C0195a(ao.d<? super C0195a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f22188x = obj;
                    this.f22190z |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(PlayerActivity playerActivity) {
                this.f22186w = playerActivity;
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
                    boolean r6 = r7 instanceof com.dena.mirrativ.player.PlayerActivity.k1.a.C0195a
                    if (r6 == 0) goto L13
                    r6 = r7
                    com.dena.mirrativ.player.PlayerActivity$k1$a$a r6 = (com.dena.mirrativ.player.PlayerActivity.k1.a.C0195a) r6
                    int r0 = r6.f22190z
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r6.f22190z = r0
                    goto L18
                L13:
                    com.dena.mirrativ.player.PlayerActivity$k1$a$a r6 = new com.dena.mirrativ.player.PlayerActivity$k1$a$a
                    r6.<init>(r7)
                L18:
                    java.lang.Object r7 = r6.f22188x
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r6.f22190z
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2d
                    java.lang.Object r6 = r6.f22187w
                    com.dena.mirrativ.player.PlayerActivity$k1$a r6 = (com.dena.mirrativ.player.PlayerActivity.k1.a) r6
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
                    r6.f22187w = r5
                    r6.f22190z = r2
                    java.lang.Object r6 = uo.b1.a(r3, r6)
                    if (r6 != r0) goto L45
                    return r0
                L45:
                    r6 = r5
                L46:
                    com.dena.mirrativ.player.PlayerActivity r7 = r6.f22186w
                    nf.z r7 = com.dena.mirrativ.player.PlayerActivity.L4(r7)
                    androidx.lifecycle.LiveData r7 = r7.O0()
                    java.lang.Object r7 = r7.f()
                    java.util.List r7 = (java.util.List) r7
                    r0 = 0
                    r1 = -1
                    if (r7 == 0) goto L75
                    java.util.Iterator r7 = r7.iterator()
                    r3 = r0
                L5f:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L75
                    java.lang.Object r4 = r7.next()
                    jf.u r4 = (jf.u) r4
                    boolean r4 = r4.p()
                    if (r4 == 0) goto L72
                    goto L76
                L72:
                    int r3 = r3 + 1
                    goto L5f
                L75:
                    r3 = r1
                L76:
                    if (r1 >= r3) goto Lab
                    com.dena.mirrativ.player.PlayerActivity r7 = r6.f22186w
                    kb.d r7 = r7.i6()
                    androidx.recyclerview.widget.RecyclerView r7 = r7.N
                    androidx.recyclerview.widget.RecyclerView$p r7 = r7.getLayoutManager()
                    boolean r1 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
                    r4 = 0
                    if (r1 == 0) goto L8c
                    androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
                    goto L8d
                L8c:
                    r7 = r4
                L8d:
                    if (r7 == 0) goto L92
                    r7.J2(r3, r0)
                L92:
                    com.dena.mirrativ.player.PlayerActivity r6 = r6.f22186w
                    kb.d r6 = r6.i6()
                    android.widget.RadioGroup r6 = r6.M
                    android.view.View r6 = r6.getChildAt(r3)
                    boolean r7 = r6 instanceof android.widget.RadioButton
                    if (r7 == 0) goto La5
                    r4 = r6
                    android.widget.RadioButton r4 = (android.widget.RadioButton) r4
                La5:
                    if (r4 != 0) goto La8
                    goto Lab
                La8:
                    r4.setChecked(r2)
                Lab:
                    wn.v r6 = wn.v.f59242a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.k1.a.emit(wn.v, ao.d):java.lang.Object");
            }
        }

        public k1(ao.d<? super k1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22184w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> J0 = PlayerActivity.this.z6().J0();
                a aVar = new a(PlayerActivity.this);
                this.f22184w = 1;
                if (J0.a(aVar, this) == c10) {
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
    public static final class k2 extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jo.e0<uo.d2> f22192x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k2(jo.e0<uo.d2> e0Var) {
            super(0);
            this.f22192x = e0Var;
        }

        public final void a() {
            String ownerId;
            if (PlayerActivity.this.i6().f38521n0.getTranslationX() == 0.0f) {
                LinkedLive linkedLive = (LinkedLive) xn.a0.j0(PlayerActivity.this.f22005z0);
                if (linkedLive != null && (ownerId = linkedLive.getOwnerId()) != null) {
                    PlayerActivity.this.t8(ownerId, false);
                }
                PlayerActivity.j8(this.f22192x, PlayerActivity.this);
                return;
            }
            PlayerActivity.this.i6().f38521n0.animate().translationX(0.0f).setDuration(300L);
            PlayerActivity.j8(this.f22192x, PlayerActivity.this);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k3 extends jo.q implements io.a<hf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22193w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22194x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22195y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22193w = aVar;
            this.f22194x = aVar2;
            this.f22195y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.c, java.lang.Object] */
        @Override // io.a
        public final hf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f22193w;
            vq.a aVar2 = this.f22194x;
            io.a<? extends uq.a> aVar3 = this.f22195y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.c.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$20", f = "PlayerActivity.kt", l = {2737}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22196w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22198w;

            public a(PlayerActivity playerActivity) {
                this.f22198w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                this.f22198w.t7(str);
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
            int i10 = this.f22196w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<String> f12 = PlayerActivity.this.z6().f1();
                a aVar = new a(PlayerActivity.this);
                this.f22196w = 1;
                if (f12.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$45", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22199w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22200x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22201y;

        /* renamed from: z  reason: collision with root package name */
        public int f22202z;

        /* loaded from: classes2.dex */
        public static final class a extends FragmentManager.j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22203a;

            public a(PlayerActivity playerActivity) {
                this.f22203a = playerActivity;
            }

            @Override // androidx.fragment.app.FragmentManager.j
            public void e(FragmentManager fragmentManager, Fragment fragment) {
                jo.p.h(fragmentManager, "fm");
                jo.p.h(fragment, "f");
                super.e(fragmentManager, fragment);
                if (fragment instanceof lb.h) {
                    if (this.f22203a.z6().b1()) {
                        this.f22203a.y6().Y();
                    }
                    this.f22203a.a3().n1(this);
                }
            }
        }

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x006e, B:23:0x0078, B:24:0x0080), top: B:35:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
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
                int r1 = r9.f22202z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22201y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22200x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22199w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L9c
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
                com.dena.mirrativ.player.PlayerActivity r10 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r10 = com.dena.mirrativ.player.PlayerActivity.L4(r10)
                wo.x r3 = r10.k0()
                com.dena.mirrativ.player.PlayerActivity r10 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9c
                r4 = r10
                r10 = r9
            L3d:
                r10.f22199w = r4     // Catch: java.lang.Throwable -> L9c
                r10.f22200x = r3     // Catch: java.lang.Throwable -> L9c
                r10.f22201y = r1     // Catch: java.lang.Throwable -> L9c
                r10.f22202z = r2     // Catch: java.lang.Throwable -> L9c
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L9c
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L99
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L99
                if (r10 == 0) goto L93
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L99
                wn.v r10 = (wn.v) r10     // Catch: java.lang.Throwable -> L99
                androidx.fragment.app.FragmentManager r10 = r5.a3()     // Catch: java.lang.Throwable -> L99
                java.lang.String r6 = "GiftPanelBottomSheetDialogFragment"
                androidx.fragment.app.Fragment r10 = r10.e0(r6)     // Catch: java.lang.Throwable -> L99
                if (r10 != 0) goto L80
                nf.z r10 = com.dena.mirrativ.player.PlayerActivity.L4(r5)     // Catch: java.lang.Throwable -> L99
                boolean r10 = r10.b1()     // Catch: java.lang.Throwable -> L99
                if (r10 == 0) goto L8d
                hb.i r10 = com.dena.mirrativ.player.PlayerActivity.K4(r5)     // Catch: java.lang.Throwable -> L99
                r10.Y()     // Catch: java.lang.Throwable -> L99
                goto L8d
            L80:
                androidx.fragment.app.FragmentManager r10 = r5.a3()     // Catch: java.lang.Throwable -> L99
                com.dena.mirrativ.player.PlayerActivity$l0$a r6 = new com.dena.mirrativ.player.PlayerActivity$l0$a     // Catch: java.lang.Throwable -> L99
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L99
                r7 = 0
                r10.X0(r6, r7)     // Catch: java.lang.Throwable -> L99
            L8d:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L93:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L99:
                r10 = move-exception
                r3 = r4
                goto L9d
            L9c:
                r10 = move-exception
            L9d:
                throw r10     // Catch: java.lang.Throwable -> L9e
            L9e:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$71", f = "PlayerActivity.kt", l = {3343}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22204w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22206w;

            public a(PlayerActivity playerActivity) {
                this.f22206w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f22206w.d6();
                return wn.v.f59242a;
            }
        }

        public l1(ao.d<? super l1> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l1(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22204w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> g02 = PlayerActivity.this.z6().g0();
                a aVar = new a(PlayerActivity.this);
                this.f22204w = 1;
                if (g02.a(aVar, this) == c10) {
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
            String liveId;
            b3.a.EnumC0122a enumC0122a;
            jo.p.h(view, "it");
            te.c f10 = PlayerActivity.this.z6().j1().f();
            if (f10 == null || (liveId = f10.getLiveId()) == null) {
                return;
            }
            if (!PlayerActivity.this.J6().U3() && !PlayerActivity.this.D6().a().d()) {
                enumC0122a = b3.a.EnumC0122a.DressUpButton;
            } else {
                enumC0122a = b3.a.EnumC0122a.Hidden;
            }
            be.b3.X0.a(Referer.LIVE_VIEW, liveId, enumC0122a).z3(PlayerActivity.this.a3(), "LiveGiftRankingBottomSheetDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l3 extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22208w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22209x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22210y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22208w = aVar;
            this.f22209x = aVar2;
            this.f22210y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            xq.a b10;
            oq.a aVar = this.f22208w;
            vq.a aVar2 = this.f22209x;
            io.a<? extends uq.a> aVar3 = this.f22210y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.t.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$21", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22211w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22212x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22213y;

        /* renamed from: z  reason: collision with root package name */
        public int f22214z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:17:0x0054, B:19:0x005c, B:23:0x0073, B:24:0x0077), top: B:35:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22214z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22213y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22212x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22211w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L8d
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.c r9 = com.dena.mirrativ.player.PlayerActivity.r4(r9)
                wo.x r3 = r9.v0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L8d
                r4 = r9
                r9 = r8
            L3d:
                r9.f22211w = r4     // Catch: java.lang.Throwable -> L8d
                r9.f22212x = r3     // Catch: java.lang.Throwable -> L8d
                r9.f22213y = r1     // Catch: java.lang.Throwable -> L8d
                r9.f22214z = r2     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L8d
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L8a
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L8a
                if (r9 == 0) goto L84
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L8a
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L8a
                nd.i1 r6 = com.dena.mirrativ.player.PlayerActivity.P4(r5)     // Catch: java.lang.Throwable -> L8a
                ye.a r6 = r6.a()     // Catch: java.lang.Throwable -> L8a
                boolean r6 = r6.d()     // Catch: java.lang.Throwable -> L8a
                if (r6 != 0) goto L71
                goto L7e
            L71:
                if (r9 != 0) goto L77
                r5.finish()     // Catch: java.lang.Throwable -> L8a
                goto L7e
            L77:
                hb.i r6 = com.dena.mirrativ.player.PlayerActivity.K4(r5)     // Catch: java.lang.Throwable -> L8a
                r6.i0(r9, r2)     // Catch: java.lang.Throwable -> L8a
            L7e:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L84:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L8a:
                r9 = move-exception
                r3 = r4
                goto L8e
            L8d:
                r9 = move-exception
            L8e:
                throw r9     // Catch: java.lang.Throwable -> L8f
            L8f:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$46", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22215w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22216x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22217y;

        /* renamed from: z  reason: collision with root package name */
        public int f22218z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:16:0x0053, B:18:0x005c), top: B:33:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:33:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22218z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22217y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22216x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22215w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L80
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
                com.dena.mirrativ.player.PlayerActivity r10 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r10 = com.dena.mirrativ.player.PlayerActivity.L4(r10)
                wo.x r3 = r10.q1()
                com.dena.mirrativ.player.PlayerActivity r10 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L80
                r4 = r10
                r10 = r9
            L3d:
                r10.f22215w = r4     // Catch: java.lang.Throwable -> L80
                r10.f22216x = r3     // Catch: java.lang.Throwable -> L80
                r10.f22217y = r1     // Catch: java.lang.Throwable -> L80
                r10.f22218z = r2     // Catch: java.lang.Throwable -> L80
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L80
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7d
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7d
                r6 = 0
                if (r10 == 0) goto L77
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L7d
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L7d
                sd.g$a r7 = sd.g.U0     // Catch: java.lang.Throwable -> L7d
                sd.g r10 = r7.a(r10, r6)     // Catch: java.lang.Throwable -> L7d
                androidx.fragment.app.FragmentManager r6 = r5.a3()     // Catch: java.lang.Throwable -> L7d
                java.lang.String r7 = "WebViewDialogFragment"
                r10.z3(r6, r7)     // Catch: java.lang.Throwable -> L7d
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L77:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L7d:
                r10 = move-exception
                r3 = r4
                goto L81
            L80:
                r10 = move-exception
            L81:
                throw r10     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m1 extends jo.q implements io.l<String, wn.v> {
        public m1() {
            super(1);
        }

        public final void a(String str) {
            String liveId;
            jo.p.h(str, "collabLiveId");
            if (PlayerActivity.this.l6().F()) {
                t1.a aVar = yd.t1.f61795x;
                Context applicationContext = PlayerActivity.this.getApplicationContext();
                jo.p.g(applicationContext, "this@PlayerActivity.applicationContext");
                String string = PlayerActivity.this.getString(hb.b2.text_collab_move_in_collab_talk);
                jo.p.g(string, "getString(R.string.text_…llab_move_in_collab_talk)");
                aVar.a(applicationContext, string);
                return;
            }
            if (!(str.length() == 0)) {
                if (!jo.p.c(str, PlayerActivity.this.t6().b())) {
                    te.c f10 = PlayerActivity.this.z6().j1().f();
                    if (f10 == null || (liveId = f10.getLiveId()) == null) {
                        return;
                    }
                    PlayerActivity playerActivity = PlayerActivity.this;
                    if (jo.p.c(liveId, str)) {
                        return;
                    }
                    playerActivity.f21997r1 = liveId;
                    PlayerService c10 = playerActivity.B6().c();
                    if (c10 != null) {
                        c10.I0(false);
                    }
                    playerActivity.M5(liveId, str);
                    return;
                }
                t1.a aVar2 = yd.t1.f61795x;
                Context applicationContext2 = PlayerActivity.this.getApplicationContext();
                jo.p.g(applicationContext2, "this@PlayerActivity.applicationContext");
                String string2 = PlayerActivity.this.getString(hb.b2.text_collab_error_view_self_broadcast_android);
                jo.p.g(string2, "getString(R.string.text_…w_self_broadcast_android)");
                aVar2.a(applicationContext2, string2);
                return;
            }
            t1.a aVar3 = yd.t1.f61795x;
            Context applicationContext3 = PlayerActivity.this.getApplicationContext();
            jo.p.g(applicationContext3, "this@PlayerActivity.applicationContext");
            String string3 = PlayerActivity.this.getString(hb.b2.text_collab_move_live_talk);
            jo.p.g(string3, "getString(R.string.text_collab_move_live_talk)");
            aVar3.a(applicationContext3, string3);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m2 extends jo.q implements io.l<View, wn.v> {
        public m2() {
            super(1);
        }

        public final void a(View view) {
            GiftAppealPopupImage giftAppealPopupImage;
            jo.p.h(view, "it");
            PlayerActivity.this.i6().T.setVisibility(8);
            te.c f10 = PlayerActivity.this.z6().j1().f();
            if (f10 == null || (giftAppealPopupImage = f10.getGiftAppealPopupImage()) == null) {
                return;
            }
            PlayerActivity.this.y6().T(giftAppealPopupImage.getGiftAppealPopupId());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m3 extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22221w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22222x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22223y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22221w = aVar;
            this.f22222x = aVar2;
            this.f22223y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            xq.a b10;
            oq.a aVar = this.f22221w;
            vq.a aVar2 = this.f22222x;
            io.a<? extends uq.a> aVar3 = this.f22223y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nd.i1.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$22", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22224w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22225x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22226y;

        /* renamed from: z  reason: collision with root package name */
        public int f22227z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22227z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22226y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22225x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22224w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.K0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22224w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22225x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22226y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22227z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$47", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22228w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22229x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22230y;

        /* renamed from: z  reason: collision with root package name */
        public int f22231z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22231z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22230y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22229x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22228w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L80
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.M0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L80
                r4 = r9
                r9 = r8
            L3d:
                r9.f22228w = r4     // Catch: java.lang.Throwable -> L80
                r9.f22229x = r3     // Catch: java.lang.Throwable -> L80
                r9.f22230y = r1     // Catch: java.lang.Throwable -> L80
                r9.f22231z = r2     // Catch: java.lang.Throwable -> L80
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L80
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7d
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7d
                if (r9 == 0) goto L77
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L7d
                com.dena.mirrorman.net.bcsvr.response.GiftItem r9 = (com.dena.mirrorman.net.bcsvr.response.GiftItem) r9     // Catch: java.lang.Throwable -> L7d
                boolean r6 = r5.isDestroyed()     // Catch: java.lang.Throwable -> L7d
                if (r6 != 0) goto L71
                kb.d r6 = r5.i6()     // Catch: java.lang.Throwable -> L7d
                com.dena.mirrativ.player.gifting.GiftNotificationListView r6 = r6.W     // Catch: java.lang.Throwable -> L7d
                r6.b(r9)     // Catch: java.lang.Throwable -> L7d
            L71:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L77:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L7d:
                r9 = move-exception
                r3 = r4
                goto L81
            L80:
                r9 = move-exception
            L81:
                throw r9     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class n1 extends BroadcastReceiver {
        public n1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            jo.p.h(context, "context");
            jo.p.h(intent, "intent");
            if (jo.p.c("com.dena.mirrorman.action.STOP_PLAYING", intent.getAction())) {
                PlayerActivity.this.finish();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class n2 extends jo.q implements io.l<View, wn.v> {
        public n2() {
            super(1);
        }

        public final void a(View view) {
            GiftAppealPopupImage giftAppealPopupImage;
            jo.p.h(view, "it");
            PlayerActivity.this.i6().T.setVisibility(8);
            te.c f10 = PlayerActivity.this.z6().j1().f();
            if (f10 == null || (giftAppealPopupImage = f10.getGiftAppealPopupImage()) == null) {
                return;
            }
            PlayerActivity.this.y6().T(giftAppealPopupImage.getGiftAppealPopupId());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n3 extends jo.q implements io.a<od.l0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22234w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22235x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22236y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22234w = aVar;
            this.f22235x = aVar2;
            this.f22236y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.l0, java.lang.Object] */
        @Override // io.a
        public final od.l0 invoke() {
            xq.a b10;
            oq.a aVar = this.f22234w;
            vq.a aVar2 = this.f22235x;
            io.a<? extends uq.a> aVar3 = this.f22236y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.l0.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$23", f = "PlayerActivity.kt", l = {2762}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22237w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.k<? extends Boolean, ? extends Integer>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22239w;

            @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$23$1", f = "PlayerActivity.kt", l = {2770}, m = "emit")
            /* renamed from: com.dena.mirrativ.player.PlayerActivity$o$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0196a extends co.d {
                public int A;

                /* renamed from: w  reason: collision with root package name */
                public Object f22240w;

                /* renamed from: x  reason: collision with root package name */
                public int f22241x;

                /* renamed from: y  reason: collision with root package name */
                public /* synthetic */ Object f22242y;

                public C0196a(ao.d<? super C0196a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f22242y = obj;
                    this.A |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(PlayerActivity playerActivity) {
                this.f22239w = playerActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(wn.k<java.lang.Boolean, java.lang.Integer> r11, ao.d<? super wn.v> r12) {
                /*
                    Method dump skipped, instructions count: 241
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.o.a.emit(wn.k, ao.d):java.lang.Object");
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
            int i10 = this.f22237w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.k<Boolean, Integer>> e02 = PlayerActivity.this.z6().e0();
                a aVar = new a(PlayerActivity.this);
                this.f22237w = 1;
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

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$48", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22244w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22245x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22246y;

        /* renamed from: z  reason: collision with root package name */
        public int f22247z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:21:0x006b), top: B:32:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:32:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22247z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22246y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22245x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22244w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7d
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.i0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r9
                r9 = r8
            L3d:
                r9.f22244w = r4     // Catch: java.lang.Throwable -> L7d
                r9.f22245x = r3     // Catch: java.lang.Throwable -> L7d
                r9.f22246y = r1     // Catch: java.lang.Throwable -> L7d
                r9.f22247z = r2     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7d
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7a
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7a
                r6 = 0
                if (r9 == 0) goto L74
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L7a
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L7a
                uo.d2 r9 = com.dena.mirrativ.player.PlayerActivity.O4(r5)     // Catch: java.lang.Throwable -> L7a
                if (r9 == 0) goto L6b
                uo.d2.a.a(r9, r6, r2, r6)     // Catch: java.lang.Throwable -> L7a
            L6b:
                com.dena.mirrativ.player.PlayerActivity.u5(r5, r6)     // Catch: java.lang.Throwable -> L7a
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L74:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L7a:
                r9 = move-exception
                r3 = r4
                goto L7e
            L7d:
                r9 = move-exception
            L7e:
                throw r9     // Catch: java.lang.Throwable -> L7f
            L7f:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.o0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class o1 extends jo.q implements io.l<String, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f22249x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(String str) {
            super(1);
            this.f22249x = str;
        }

        public final void a(String str) {
            jo.p.h(str, "bannerIconLinkUrl");
            if (!so.n.r(str)) {
                jf.b0 a10 = PlayerActivity.this.H6().a(str);
                if (!(a10 instanceof b0.l0)) {
                    PlayerActivity playerActivity = PlayerActivity.this;
                    playerActivity.startActivity(HandleUrlSchemeActivity.f25127b0.a(playerActivity, Referer.LIVE_VIEW, a10));
                } else {
                    PlayerActivity playerActivity2 = PlayerActivity.this;
                    playerActivity2.startActivity(WebViewActivity.a.b(WebViewActivity.X, playerActivity2, str, false, false, 12, null));
                }
                te.c f10 = PlayerActivity.this.z6().j1().f();
                String str2 = (f10 == null || (str2 = f10.g()) == null) ? "" : "";
                List<jf.u> f11 = PlayerActivity.this.z6().O0().f();
                if (f11 != null) {
                    for (jf.u uVar : f11) {
                        if (jo.p.c(uVar.d(), str)) {
                            if (uVar != null) {
                                PlayerActivity playerActivity3 = PlayerActivity.this;
                                String str3 = this.f22249x;
                                MRLogger u62 = playerActivity3.u6();
                                MRLog.Companion companion = MRLog.Companion;
                                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_CLICK_CURRENT_USER_GIFT_RANK);
                                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str3), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, str2), wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, playerActivity3.t6().h()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CurrentUserGiftRankTargetDetail(uVar.o(), uVar.e(), uVar.h(), uVar.j()).toJson())));
                                u62.sendLog(builder.build());
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
    public static final class o2 extends jo.q implements io.l<View, wn.v> {
        public o2() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            String f10 = PlayerActivity.this.p6().q().f();
            if (f10 == null) {
                return;
            }
            PlayerActivity playerActivity = PlayerActivity.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context applicationContext = playerActivity.getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            playerActivity.startActivity(WebViewActivity.a.b(aVar, applicationContext, f10, false, false, 12, null));
            te.c f11 = PlayerActivity.this.z6().j1().f();
            if (f11 == null) {
                return;
            }
            MRLogger u62 = PlayerActivity.this.u6();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_PLAYER_SEASON_RATING_TAP);
            wn.k[] kVarArr = new wn.k[5];
            kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f11.getLiveId());
            String title = f11.getTitle();
            if (title == null) {
                title = "";
            }
            kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_NAME, title);
            kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, f11.g());
            kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_NAME, f11.e());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("class_name", f11.getOwner().getSeasonRating().getClassName());
            wn.v vVar = wn.v.f59242a;
            kVarArr[4] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
            builder.setPayload(xn.s.m(kVarArr));
            u62.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o3 extends jo.q implements io.a<ef.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22251w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22252x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22251w = aVar;
            this.f22252x = aVar2;
            this.f22253y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ef.a] */
        @Override // io.a
        public final ef.a invoke() {
            xq.a b10;
            oq.a aVar = this.f22251w;
            vq.a aVar2 = this.f22252x;
            io.a<? extends uq.a> aVar3 = this.f22253y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(ef.a.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$24", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22254w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22255x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22256y;

        /* renamed from: z  reason: collision with root package name */
        public int f22257z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x0066, B:24:0x0074, B:26:0x007b, B:31:0x0086, B:33:0x008e, B:36:0x009f, B:35:0x0094, B:37:0x00a5, B:40:0x00b0), top: B:51:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$49", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22258w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22259x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22260y;

        /* renamed from: z  reason: collision with root package name */
        public int f22261z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22261z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22260y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22259x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22258w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7a
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.A1()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
                r4 = r9
                r9 = r8
            L3d:
                r9.f22258w = r4     // Catch: java.lang.Throwable -> L7a
                r9.f22259x = r3     // Catch: java.lang.Throwable -> L7a
                r9.f22260y = r1     // Catch: java.lang.Throwable -> L7a
                r9.f22261z = r2     // Catch: java.lang.Throwable -> L7a
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7a
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L77
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L71
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L77
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L77
                rb.c r9 = com.dena.mirrativ.player.PlayerActivity.H4(r5)     // Catch: java.lang.Throwable -> L77
                if (r9 == 0) goto L6b
                r9.p()     // Catch: java.lang.Throwable -> L77
            L6b:
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L71:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L77:
                r9 = move-exception
                r3 = r4
                goto L7b
            L7a:
                r9 = move-exception
            L7b:
                throw r9     // Catch: java.lang.Throwable -> L7c
            L7c:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.p0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class p1 extends RecyclerView.u {
        public p1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            View h10 = PlayerActivity.this.f22002w0.h(PlayerActivity.this.i6().N.getLayoutManager());
            if (h10 == null) {
                return;
            }
            View childAt = PlayerActivity.this.i6().M.getChildAt(PlayerActivity.this.i6().N.g0(h10));
            jo.p.f(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            ((RadioButton) childAt).setChecked(true);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p2 extends jo.q implements io.l<View, wn.v> {
        public p2() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (PlayerActivity.this.i6().f38525r0.getVisibility() == 0) {
                return;
            }
            PlayerActivity.this.W5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p3 extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22264w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22265x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22266y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22264w = aVar;
            this.f22265x = aVar2;
            this.f22266y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            xq.a b10;
            oq.a aVar = this.f22264w;
            vq.a aVar2 = this.f22265x;
            io.a<? extends uq.a> aVar3 = this.f22266y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.v.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$25", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22267w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22268x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22269y;

        /* renamed from: z  reason: collision with root package name */
        public int f22270z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22270z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22269y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22268x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22267w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.U0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22267w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22268x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22269y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22270z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$50", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22271w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22272x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22273y;

        /* renamed from: z  reason: collision with root package name */
        public int f22274z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068, B:22:0x006b), top: B:33:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22274z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22273y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22272x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22271w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7d
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.H0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r9
                r9 = r8
            L3d:
                r9.f22271w = r4     // Catch: java.lang.Throwable -> L7d
                r9.f22272x = r3     // Catch: java.lang.Throwable -> L7d
                r9.f22273y = r1     // Catch: java.lang.Throwable -> L7d
                r9.f22274z = r2     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7d
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7a
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7a
                if (r9 == 0) goto L74
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L7a
                rb.c r6 = com.dena.mirrativ.player.PlayerActivity.H4(r5)     // Catch: java.lang.Throwable -> L7a
                if (r6 == 0) goto L6b
                r6.j()     // Catch: java.lang.Throwable -> L7a
            L6b:
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L7a
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L74:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L7a:
                r9 = move-exception
                r3 = r4
                goto L7e
            L7d:
                r9 = move-exception
            L7e:
                throw r9     // Catch: java.lang.Throwable -> L7f
            L7f:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.q0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class q1 extends jo.q implements io.a<wn.v> {
        public q1() {
            super(0);
        }

        public final void a() {
            tb.a b10 = PlayerActivity.this.s6().b();
            b10.a().z3(PlayerActivity.this.a3(), b10.b());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q2 extends jo.q implements io.a<wn.v> {
        public q2() {
            super(0);
        }

        public final void a() {
            PlayerActivity.this.n8();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q3 extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22277w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22278x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22279y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22277w = aVar;
            this.f22278x = aVar2;
            this.f22279y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f22277w;
            vq.a aVar2 = this.f22278x;
            io.a<? extends uq.a> aVar3 = this.f22279y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.v0.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$26", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22280w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22281x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22282y;

        /* renamed from: z  reason: collision with root package name */
        public int f22283z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0089, B:23:0x0091), top: B:34:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f22283z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.f22282y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r11.f22281x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r11.f22280w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r12)     // Catch: java.lang.Throwable -> Lb9
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L53
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                wn.m.b(r12)
                com.dena.mirrativ.player.PlayerActivity r12 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r12 = com.dena.mirrativ.player.PlayerActivity.L4(r12)
                wo.x r3 = r12.c1()
                com.dena.mirrativ.player.PlayerActivity r12 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb9
                r4 = r12
                r12 = r11
            L3d:
                r12.f22280w = r4     // Catch: java.lang.Throwable -> Lb9
                r12.f22281x = r3     // Catch: java.lang.Throwable -> Lb9
                r12.f22282y = r1     // Catch: java.lang.Throwable -> Lb9
                r12.f22283z = r2     // Catch: java.lang.Throwable -> Lb9
                java.lang.Object r5 = r1.a(r12)     // Catch: java.lang.Throwable -> Lb9
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L53:
                r6 = 0
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Lb6
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lb6
                if (r12 == 0) goto Lb0
                java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> Lb6
                ud.r2 r12 = (ud.r2) r12     // Catch: java.lang.Throwable -> Lb6
                kb.d r6 = r5.i6()     // Catch: java.lang.Throwable -> Lb6
                com.dena.mirrorman.customview.OneLineCommentView r6 = r6.f38516i0     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r7 = r12.c()     // Catch: java.lang.Throwable -> Lb6
                android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder     // Catch: java.lang.Throwable -> Lb6
                r8.<init>()     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r9 = r12.a()     // Catch: java.lang.Throwable -> Lb6
                r8.append(r9)     // Catch: java.lang.Throwable -> Lb6
                wn.v r9 = wn.v.f59242a     // Catch: java.lang.Throwable -> Lb6
                r6.A(r7, r8)     // Catch: java.lang.Throwable -> Lb6
                kb.d r6 = r5.i6()     // Catch: java.lang.Throwable -> Lb6
                com.dena.mirrorman.customview.PictureInPictureCommentView r6 = r6.f38517j0     // Catch: java.lang.Throwable -> Lb6
                int r6 = r6.getVisibility()     // Catch: java.lang.Throwable -> Lb6
                if (r6 != 0) goto Laa
                int r6 = r12.d()     // Catch: java.lang.Throwable -> Lb6
                r7 = 35
                if (r6 == r7) goto Laa
                kb.d r6 = r5.i6()     // Catch: java.lang.Throwable -> Lb6
                com.dena.mirrorman.customview.PictureInPictureCommentView r6 = r6.f38517j0     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r7 = r12.c()     // Catch: java.lang.Throwable -> Lb6
                android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder     // Catch: java.lang.Throwable -> Lb6
                r8.<init>()     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r12 = r12.a()     // Catch: java.lang.Throwable -> Lb6
                r8.append(r12)     // Catch: java.lang.Throwable -> Lb6
                r6.A(r7, r8)     // Catch: java.lang.Throwable -> Lb6
            Laa:
                r12 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lb0:
                wo.n.a(r4, r6)
                wn.v r12 = wn.v.f59242a
                return r12
            Lb6:
                r12 = move-exception
                r3 = r4
                goto Lba
            Lb9:
                r12 = move-exception
            Lba:
                throw r12     // Catch: java.lang.Throwable -> Lbb
            Lbb:
                r0 = move-exception
                wo.n.a(r3, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$51", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22284w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22285x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22286y;

        /* renamed from: z  reason: collision with root package name */
        public int f22287z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x00bc, TryCatch #1 {all -> 0x00bc, blocks: (B:17:0x0053, B:19:0x005b, B:21:0x007e, B:23:0x008e), top: B:36:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0052). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r14.f22287z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r14.f22286y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r14.f22285x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r14.f22284w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r15)     // Catch: java.lang.Throwable -> Lbf
                r12 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r14
                goto L52
            L20:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L28:
                wn.m.b(r15)
                com.dena.mirrativ.player.PlayerActivity r15 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r15 = com.dena.mirrativ.player.PlayerActivity.L4(r15)
                wo.x r3 = r15.l1()
                com.dena.mirrativ.player.PlayerActivity r15 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lbf
                r4 = r15
                r15 = r14
            L3d:
                r15.f22284w = r4     // Catch: java.lang.Throwable -> Lbf
                r15.f22285x = r3     // Catch: java.lang.Throwable -> Lbf
                r15.f22286y = r1     // Catch: java.lang.Throwable -> Lbf
                r15.f22287z = r2     // Catch: java.lang.Throwable -> Lbf
                java.lang.Object r5 = r1.a(r15)     // Catch: java.lang.Throwable -> Lbf
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r12 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r15
                r15 = r5
            L52:
                r5 = 0
                java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> Lbc
                boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> Lbc
                if (r15 == 0) goto Lb6
                java.lang.Object r15 = r3.next()     // Catch: java.lang.Throwable -> Lbc
                java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Throwable -> Lbc
                com.dena.mirrativ.player.PlayerActivity.X4(r12, r15)     // Catch: java.lang.Throwable -> Lbc
                com.dena.mirrativ.player.PlayerActivity.Y4(r12)     // Catch: java.lang.Throwable -> Lbc
                nf.z r15 = com.dena.mirrativ.player.PlayerActivity.L4(r12)     // Catch: java.lang.Throwable -> Lbc
                androidx.lifecycle.LiveData r15 = r15.g1()     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object r15 = r15.f()     // Catch: java.lang.Throwable -> Lbc
                r5 = 0
                java.lang.Boolean r5 = co.b.a(r5)     // Catch: java.lang.Throwable -> Lbc
                boolean r15 = jo.p.c(r15, r5)     // Catch: java.lang.Throwable -> Lbc
                if (r15 == 0) goto Lb0
                nf.z r15 = com.dena.mirrativ.player.PlayerActivity.L4(r12)     // Catch: java.lang.Throwable -> Lbc
                androidx.lifecycle.LiveData r15 = r15.j1()     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object r15 = r15.f()     // Catch: java.lang.Throwable -> Lbc
                te.c r15 = (te.c) r15     // Catch: java.lang.Throwable -> Lbc
                if (r15 == 0) goto Lb0
                hb.i r13 = com.dena.mirrativ.player.PlayerActivity.K4(r12)     // Catch: java.lang.Throwable -> Lbc
                ud.v2$a r5 = ud.v2.f55599i     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r7 = r15.getLiveId()     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r8 = r15.g()     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r9 = r15.e()     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r10 = r15.f()     // Catch: java.lang.Throwable -> Lbc
                java.lang.String r11 = r15.b()     // Catch: java.lang.Throwable -> Lbc
                r6 = r12
                ud.v2 r15 = r5.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lbc
                r13.U(r15)     // Catch: java.lang.Throwable -> Lbc
            Lb0:
                r15 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r12
                goto L3d
            Lb6:
                wo.n.a(r4, r5)
                wn.v r15 = wn.v.f59242a
                return r15
            Lbc:
                r15 = move-exception
                r3 = r4
                goto Lc0
            Lbf:
                r15 = move-exception
            Lc0:
                throw r15     // Catch: java.lang.Throwable -> Lc1
            Lc1:
                r0 = move-exception
                wo.n.a(r3, r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.r0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class r1 implements b.InterfaceC0775b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f22288a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PlayerActivity f22289b;

        public r1(boolean z10, PlayerActivity playerActivity) {
            this.f22288a = z10;
            this.f22289b = playerActivity;
        }

        @Override // rb.b.InterfaceC0775b
        public void a() {
            te.c f10;
            String g10;
            if (!this.f22288a) {
                hf.v0 I6 = this.f22289b.I6();
                FragmentManager a32 = this.f22289b.a3();
                jo.p.g(a32, "supportFragmentManager");
                if (!hf.v0.c(I6, a32, "live_view.guide_follow.follow.liveowner", false, 4, null) || (f10 = this.f22289b.z6().j1().f()) == null || (g10 = f10.g()) == null) {
                    return;
                }
                this.f22289b.y6().D(g10, Referer.LiveView.GUIDE_FOLLOW);
            }
            if (this.f22289b.f21977h1 != null) {
                rb.c cVar = this.f22289b.f21977h1;
                jo.p.e(cVar);
                cVar.t();
            }
            of.n.A(this.f22289b.getApplicationContext(), hb.b2.toast_q_followed_and_recoverable, true);
        }

        @Override // rb.b.InterfaceC0775b
        public void b() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class r2 implements TextWatcher {
        public r2() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(PlayerActivity.this.i6().K.getText().toString())) {
                PlayerActivity.this.I8();
                PlayerActivity.this.i6().f38531x0.setImageResource(hb.z1.btn_delivery_setting);
                return;
            }
            PlayerActivity.this.i6().f38531x0.setImageResource(hb.z1.btn_view_send);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class r3 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22291w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22292x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22293y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22291w = aVar;
            this.f22292x = aVar2;
            this.f22293y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            xq.a b10;
            oq.a aVar = this.f22291w;
            vq.a aVar2 = this.f22292x;
            io.a<? extends uq.a> aVar3 = this.f22293y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.x.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$27", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22294w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22295x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22296y;

        /* renamed from: z  reason: collision with root package name */
        public int f22297z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00ff, TryCatch #2 {all -> 0x00ff, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x0074, B:26:0x0092, B:29:0x009d, B:31:0x00a6, B:34:0x00b7), top: B:49:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$52", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22298w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22299x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22300y;

        /* renamed from: z  reason: collision with root package name */
        public int f22301z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22301z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22300y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22299x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22298w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.F0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22298w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22299x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22300y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22301z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.s0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class s1 extends jo.q implements io.p<MRLogger, String, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f22302w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f22303x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(String str, String str2) {
            super(2);
            this.f22302w = str;
            this.f22303x = str2;
        }

        public final void a(MRLogger mRLogger, String str) {
            jo.p.h(mRLogger, "logger");
            MRLog.Companion companion = MRLog.Companion;
            String str2 = this.f22302w;
            String str3 = this.f22303x;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SHARE_PANEL_PROCEED);
            builder.setPageId(Referer.PLAYER_VIEWER_LIST);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogBase.SERVICE_NAME, str);
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

    /* loaded from: classes2.dex */
    public static final class s2 implements ia.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22304a;

        public s2(View view) {
            this.f22304a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            a.C0469a.a(this, animation);
            this.f22304a.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s3 extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22305w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22306x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22307y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22305w = aVar;
            this.f22306x = aVar2;
            this.f22307y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            xq.a b10;
            oq.a aVar = this.f22305w;
            vq.a aVar2 = this.f22306x;
            io.a<? extends uq.a> aVar3 = this.f22307y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.k.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$28", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22308w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22309x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22310y;

        /* renamed from: z  reason: collision with root package name */
        public int f22311z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22311z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22310y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22309x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22308w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.E0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22308w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22309x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22310y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22311z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$53", f = "PlayerActivity.kt", l = {3108}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22312w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<ShooterMatchingStateChangedBcsvrResponse> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22314w;

            public a(PlayerActivity playerActivity) {
                this.f22314w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ShooterMatchingStateChangedBcsvrResponse shooterMatchingStateChangedBcsvrResponse, ao.d<? super wn.v> dVar) {
                if (shooterMatchingStateChangedBcsvrResponse.getMatchingStatus() != ShooterTeamStatus.MATCHED && shooterMatchingStateChangedBcsvrResponse.getMatchingStatus() != ShooterTeamStatus.LAUNCHING) {
                    if (shooterMatchingStateChangedBcsvrResponse.getMatchingStatus() == ShooterTeamStatus.CANCELED) {
                        this.f22314w.i6().f38533z0.setVisibility(8);
                        Fragment e02 = this.f22314w.a3().e0("ShooterInvitationDialogFragment");
                        androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
                        if (eVar != null) {
                            eVar.n3();
                        }
                        Fragment e03 = this.f22314w.a3().e0("ShooterLoadingDialogFragment");
                        androidx.fragment.app.e eVar2 = e03 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e03 : null;
                        if (eVar2 != null) {
                            eVar2.n3();
                        }
                    }
                } else {
                    List<String> memberUserIds = shooterMatchingStateChangedBcsvrResponse.getMemberUserIds();
                    boolean z10 = true;
                    if (memberUserIds == null || !memberUserIds.contains(this.f22314w.J6().T4())) {
                        z10 = false;
                    }
                    if (!z10) {
                        return wn.v.f59242a;
                    }
                    if (this.f22314w.f22000u0) {
                        be.e4.Q0.a().z3(this.f22314w.a3(), "ShooterLoadingDialogFragment");
                    }
                }
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
            int i10 = this.f22312w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<ShooterMatchingStateChangedBcsvrResponse> o12 = PlayerActivity.this.z6().o1();
                a aVar = new a(PlayerActivity.this);
                this.f22312w = 1;
                if (o12.a(aVar, this) == c10) {
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
    public static final class t1 extends jo.q implements io.a<PipStateManager> {
        public t1() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final PipStateManager invoke() {
            Context applicationContext = PlayerActivity.this.getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            PipStateManager pipStateManager = new PipStateManager(applicationContext);
            pipStateManager.i(PlayerActivity.this);
            return pipStateManager;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$setupUserActions$resetLinkedLiveBackHideJob$1", f = "PlayerActivity.kt", l = {4113}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22316w;

        public t2(ao.d<? super t2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t2(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22316w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f22316w = 1;
                if (uo.b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            PlayerActivity.this.i6().f38521n0.animate().translationX(of.t.b(PlayerActivity.this, -138)).setDuration(300L);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class t3 extends jo.q implements io.a<xe.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22318w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22319x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22320y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22318w = aVar;
            this.f22319x = aVar2;
            this.f22320y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xe.a, java.lang.Object] */
        @Override // io.a
        public final xe.a invoke() {
            xq.a b10;
            oq.a aVar = this.f22318w;
            vq.a aVar2 = this.f22319x;
            io.a<? extends uq.a> aVar3 = this.f22320y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(xe.a.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$29", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22321w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22322x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22323y;

        /* renamed from: z  reason: collision with root package name */
        public int f22324z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:16:0x0053, B:18:0x005c, B:21:0x00a8), top: B:32:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:32:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$54", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22325w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22326x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22327y;

        /* renamed from: z  reason: collision with root package name */
        public int f22328z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0073, B:26:0x007e, B:27:0x0084, B:29:0x008a, B:31:0x0090, B:32:0x0093), top: B:43:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f22328z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f22327y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f22326x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f22325w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> La5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                com.dena.mirrativ.player.PlayerActivity r11 = com.dena.mirrativ.player.PlayerActivity.this
                nf.o r11 = com.dena.mirrativ.player.PlayerActivity.C4(r11)
                wo.x r3 = r11.B()
                com.dena.mirrativ.player.PlayerActivity r11 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La5
                r4 = r11
                r11 = r10
            L3d:
                r11.f22325w = r4     // Catch: java.lang.Throwable -> La5
                r11.f22326x = r3     // Catch: java.lang.Throwable -> La5
                r11.f22327y = r1     // Catch: java.lang.Throwable -> La5
                r11.f22328z = r2     // Catch: java.lang.Throwable -> La5
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> La5
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La2
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> La2
                if (r11 == 0) goto L9c
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> La2
                wn.v r11 = (wn.v) r11     // Catch: java.lang.Throwable -> La2
                nf.z r11 = com.dena.mirrativ.player.PlayerActivity.L4(r5)     // Catch: java.lang.Throwable -> La2
                androidx.lifecycle.LiveData r11 = r11.j1()     // Catch: java.lang.Throwable -> La2
                java.lang.Object r11 = r11.f()     // Catch: java.lang.Throwable -> La2
                te.c r11 = (te.c) r11     // Catch: java.lang.Throwable -> La2
                r6 = 0
                if (r11 == 0) goto L7b
                boolean r11 = r11.isPrivate()     // Catch: java.lang.Throwable -> La2
                if (r11 != r2) goto L7b
                r11 = r2
                goto L7c
            L7b:
                r11 = r6
            L7c:
                if (r11 != 0) goto L84
                r7 = 60000(0xea60, double:2.9644E-319)
                com.dena.mirrativ.player.PlayerActivity.e5(r5, r7)     // Catch: java.lang.Throwable -> La2
            L84:
                boolean r11 = com.dena.mirrativ.player.PlayerActivity.I4(r5)     // Catch: java.lang.Throwable -> La2
                if (r11 == 0) goto L96
                boolean r11 = com.dena.mirrativ.player.PlayerActivity.I4(r5)     // Catch: java.lang.Throwable -> La2
                if (r11 == 0) goto L93
                com.dena.mirrativ.player.PlayerActivity.y5(r5)     // Catch: java.lang.Throwable -> La2
            L93:
                com.dena.mirrativ.player.PlayerActivity.t5(r5, r6)     // Catch: java.lang.Throwable -> La2
            L96:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9c:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            La2:
                r11 = move-exception
                r3 = r4
                goto La6
            La5:
                r11 = move-exception
            La6:
                throw r11     // Catch: java.lang.Throwable -> La7
            La7:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.u0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$prepareLive$followAnimationJob$1", f = "PlayerActivity.kt", l = {3530, 3534, 3536, 3538, 3540}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public Object A;
        public long B;
        public int C;
        public final /* synthetic */ te.c D;
        public final /* synthetic */ PlayerActivity E;
        public final /* synthetic */ Animation F;
        public final /* synthetic */ long G;

        /* renamed from: w  reason: collision with root package name */
        public int f22329w;

        /* renamed from: x  reason: collision with root package name */
        public int f22330x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22331y;

        /* renamed from: z  reason: collision with root package name */
        public Object f22332z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(te.c cVar, PlayerActivity playerActivity, Animation animation, long j10, ao.d<? super u1> dVar) {
            super(2, dVar);
            this.D = cVar;
            this.E = playerActivity;
            this.F = animation;
            this.G = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u1(this.D, this.E, this.F, this.G, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0101 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x011f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0140 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x013e -> B:39:0x0141). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x014f -> B:41:0x0150). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.u1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$setupUserActions$resetLinkedLiveHideJob$1", f = "PlayerActivity.kt", l = {4102}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u2 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22333w;

        public u2(ao.d<? super u2> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u2(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u2) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22333w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f22333w = 1;
                if (uo.b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            PlayerActivity.this.i6().f38522o0.animate().translationX(of.t.b(PlayerActivity.this, TsExtractor.TS_STREAM_TYPE_DTS)).setDuration(300L);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u3 extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22335w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22336x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22337y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22335w = aVar;
            this.f22336x = aVar2;
            this.f22337y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f22335w;
            vq.a aVar2 = this.f22336x;
            io.a<? extends uq.a> aVar3 = this.f22337y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$30", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22338w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22339x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22340y;

        /* renamed from: z  reason: collision with root package name */
        public int f22341z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22341z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22340y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22339x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22338w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.D0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22338w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22339x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22340y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22341z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$55", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22342w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22343x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22344y;

        /* renamed from: z  reason: collision with root package name */
        public int f22345z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0073, B:26:0x007e, B:27:0x0084, B:29:0x008a, B:31:0x0090, B:32:0x0093), top: B:43:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f22345z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f22344y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f22343x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f22342w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> La5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                com.dena.mirrativ.player.PlayerActivity r11 = com.dena.mirrativ.player.PlayerActivity.this
                nf.o r11 = com.dena.mirrativ.player.PlayerActivity.C4(r11)
                wo.x r3 = r11.A()
                com.dena.mirrativ.player.PlayerActivity r11 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La5
                r4 = r11
                r11 = r10
            L3d:
                r11.f22342w = r4     // Catch: java.lang.Throwable -> La5
                r11.f22343x = r3     // Catch: java.lang.Throwable -> La5
                r11.f22344y = r1     // Catch: java.lang.Throwable -> La5
                r11.f22345z = r2     // Catch: java.lang.Throwable -> La5
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> La5
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La2
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> La2
                if (r11 == 0) goto L9c
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> La2
                wn.v r11 = (wn.v) r11     // Catch: java.lang.Throwable -> La2
                nf.z r11 = com.dena.mirrativ.player.PlayerActivity.L4(r5)     // Catch: java.lang.Throwable -> La2
                androidx.lifecycle.LiveData r11 = r11.j1()     // Catch: java.lang.Throwable -> La2
                java.lang.Object r11 = r11.f()     // Catch: java.lang.Throwable -> La2
                te.c r11 = (te.c) r11     // Catch: java.lang.Throwable -> La2
                r6 = 0
                if (r11 == 0) goto L7b
                boolean r11 = r11.isPrivate()     // Catch: java.lang.Throwable -> La2
                if (r11 != r2) goto L7b
                r11 = r2
                goto L7c
            L7b:
                r11 = r6
            L7c:
                if (r11 != 0) goto L84
                r7 = 60000(0xea60, double:2.9644E-319)
                com.dena.mirrativ.player.PlayerActivity.e5(r5, r7)     // Catch: java.lang.Throwable -> La2
            L84:
                boolean r11 = com.dena.mirrativ.player.PlayerActivity.I4(r5)     // Catch: java.lang.Throwable -> La2
                if (r11 == 0) goto L96
                boolean r11 = com.dena.mirrativ.player.PlayerActivity.I4(r5)     // Catch: java.lang.Throwable -> La2
                if (r11 == 0) goto L93
                com.dena.mirrativ.player.PlayerActivity.y5(r5)     // Catch: java.lang.Throwable -> La2
            L93:
                com.dena.mirrativ.player.PlayerActivity.t5(r5, r6)     // Catch: java.lang.Throwable -> La2
            L96:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9c:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            La2:
                r11 = move-exception
                r3 = r4
                goto La6
            La5:
                r11 = move-exception
            La6:
                throw r11     // Catch: java.lang.Throwable -> La7
            La7:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.v0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity", f = "PlayerActivity.kt", l = {3694}, m = "repeatGuideCommentShare")
    /* loaded from: classes2.dex */
    public static final class v1 extends co.d {
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f22346w;

        /* renamed from: x  reason: collision with root package name */
        public int f22347x;

        /* renamed from: y  reason: collision with root package name */
        public int f22348y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f22349z;

        public v1(ao.d<? super v1> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f22349z = obj;
            this.B |= Integer.MIN_VALUE;
            return PlayerActivity.this.K7(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v2 extends jo.q implements io.a<wn.v> {
        public v2() {
            super(0);
        }

        public final void a() {
            hb.f1 f1Var = PlayerActivity.this.G0;
            if (f1Var != null) {
                f1Var.z3(PlayerActivity.this.a3(), "playeractivity");
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v3 extends jo.q implements io.a<od.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22351w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22352x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22353y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22351w = aVar;
            this.f22352x = aVar2;
            this.f22353y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.f] */
        @Override // io.a
        public final od.f invoke() {
            xq.a b10;
            oq.a aVar = this.f22351w;
            vq.a aVar2 = this.f22352x;
            io.a<? extends uq.a> aVar3 = this.f22353y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.f.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$31", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22354w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22355x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22356y;

        /* renamed from: z  reason: collision with root package name */
        public int f22357z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0073, B:26:0x007e, B:29:0x008f, B:30:0x00a8), top: B:41:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
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
                int r1 = r9.f22357z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22356y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22355x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22354w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> Lc6
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
                com.dena.mirrativ.player.PlayerActivity r10 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r10 = com.dena.mirrativ.player.PlayerActivity.L4(r10)
                wo.x r3 = r10.z1()
                com.dena.mirrativ.player.PlayerActivity r10 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lc6
                r4 = r10
                r10 = r9
            L3d:
                r10.f22354w = r4     // Catch: java.lang.Throwable -> Lc6
                r10.f22355x = r3     // Catch: java.lang.Throwable -> Lc6
                r10.f22356y = r1     // Catch: java.lang.Throwable -> Lc6
                r10.f22357z = r2     // Catch: java.lang.Throwable -> Lc6
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> Lc6
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lc3
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lc3
                if (r10 == 0) goto Lbd
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> Lc3
                wn.v r10 = (wn.v) r10     // Catch: java.lang.Throwable -> Lc3
                nf.z r10 = com.dena.mirrativ.player.PlayerActivity.L4(r5)     // Catch: java.lang.Throwable -> Lc3
                androidx.lifecycle.LiveData r10 = r10.D1()     // Catch: java.lang.Throwable -> Lc3
                java.lang.Object r10 = r10.f()     // Catch: java.lang.Throwable -> Lc3
                com.dena.mirrorman.net.api.response.AppUserDetailResponse r10 = (com.dena.mirrorman.net.api.response.AppUserDetailResponse) r10     // Catch: java.lang.Throwable -> Lc3
                r6 = 0
                if (r10 == 0) goto L7b
                boolean r7 = r10.getRequireConfirmation()     // Catch: java.lang.Throwable -> Lc3
                if (r7 != r2) goto L7b
                r7 = r2
                goto L7c
            L7b:
                r7 = r6
            L7c:
                if (r7 == 0) goto La8
                nf.z r6 = com.dena.mirrativ.player.PlayerActivity.L4(r5)     // Catch: java.lang.Throwable -> Lc3
                androidx.lifecycle.LiveData r6 = r6.r0()     // Catch: java.lang.Throwable -> Lc3
                java.lang.Object r6 = r6.f()     // Catch: java.lang.Throwable -> Lc3
                com.dena.mirrorman.net.api.response.App$AppParams r6 = (com.dena.mirrorman.net.api.response.App.AppParams) r6     // Catch: java.lang.Throwable -> Lc3
                if (r6 != 0) goto L8f
                goto Lb7
            L8f:
                java.lang.String r7 = "playerStore.currentApp.value ?: return@consumeEach"
                jo.p.g(r6, r7)     // Catch: java.lang.Throwable -> Lc3
                be.j$a r7 = be.j.R0     // Catch: java.lang.Throwable -> Lc3
                java.lang.String r6 = r6.getAppUserIdLabel()     // Catch: java.lang.Throwable -> Lc3
                be.j r10 = r7.a(r6, r10)     // Catch: java.lang.Throwable -> Lc3
                androidx.fragment.app.FragmentManager r6 = r5.a3()     // Catch: java.lang.Throwable -> Lc3
                java.lang.String r7 = "AppUserIdConfirmDialog"
                r10.z3(r6, r7)     // Catch: java.lang.Throwable -> Lc3
                goto Lb7
            La8:
                ud.j r10 = com.dena.mirrativ.player.PlayerActivity.q4(r5)     // Catch: java.lang.Throwable -> Lc3
                androidx.lifecycle.e0 r10 = r10.C()     // Catch: java.lang.Throwable -> Lc3
                java.lang.Boolean r6 = co.b.a(r6)     // Catch: java.lang.Throwable -> Lc3
                r10.m(r6)     // Catch: java.lang.Throwable -> Lc3
            Lb7:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lbd:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            Lc3:
                r10 = move-exception
                r3 = r4
                goto Lc7
            Lc6:
                r10 = move-exception
            Lc7:
                throw r10     // Catch: java.lang.Throwable -> Lc8
            Lc8:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$56", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22358w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22359x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22360y;

        /* renamed from: z  reason: collision with root package name */
        public int f22361z;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22362a;

            static {
                int[] iArr = new int[jf.j.values().length];
                iArr[jf.j.ACCEPTED.ordinal()] = 1;
                iArr[jf.j.CONNECTED.ordinal()] = 2;
                iArr[jf.j.CLOSED.ordinal()] = 3;
                f22362a = iArr;
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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:16:0x0053, B:18:0x005c, B:25:0x0073, B:26:0x0077, B:27:0x0096, B:29:0x00a4, B:30:0x00b2), top: B:41:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:41:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.w0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$requestCollab$1", f = "PlayerActivity.kt", l = {3723}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22363w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ CollabType f22365y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ te.c f22366z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(CollabType collabType, te.c cVar, ao.d<? super w1> dVar) {
            super(2, dVar);
            this.f22365y = collabType;
            this.f22366z = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w1(this.f22365y, this.f22366z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22363w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    PlayerActivity.this.m8(this.f22365y);
                    MRRequest A6 = PlayerActivity.this.A6();
                    String liveId = this.f22366z.getLiveId();
                    int rawValue = this.f22365y.getRawValue();
                    this.f22363w = 1;
                    obj = MRRequest.DefaultImpls.postCollabRequest$default(A6, Referer.LIVE_VIEW, liveId, rawValue, null, this, 8, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                CollabRequestResponse collabRequestResponse = (CollabRequestResponse) obj;
                PlayerActivity.this.C0++;
                te.c f10 = PlayerActivity.this.z6().j1().f();
                if (f10 != null) {
                    f10.w(collabRequestResponse);
                }
                PlayerActivity.this.k6().l(new jf.h(this.f22366z.getLiveId(), this.f22366z.g(), this.f22366z.e(), collabRequestResponse.getCollabUnicastHost(), collabRequestResponse.getCollabUnicastPort(), collabRequestResponse.getCollabUnicastKey(), collabRequestResponse.getStunServers(), collabRequestResponse.getTurnServers(), collabRequestResponse.getStreamingCollabLiveId(), this.f22365y, "REQUEST_COLLAB"));
            } catch (Throwable th2) {
                PlayerActivity.this.k6().e(this.f22366z.getLiveId(), jf.k.REQUEST_ERROR);
                PlayerActivity.this.S5();
                PlayerActivity.this.f21965b1 = false;
                PlayerActivity.this.L6(MRErrorKt.convertMRException(th2).getError());
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w2 extends FragmentManager.j {
        public w2() {
        }

        @Override // androidx.fragment.app.FragmentManager.j
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            jo.p.h(fragmentManager, "fm");
            jo.p.h(fragment, "f");
            if (fragment instanceof lb.h) {
                PlayerActivity.this.N7();
                PlayerActivity.this.a3().n1(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class w3 extends jo.q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22368w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22369x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22370y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22368w = aVar;
            this.f22369x = aVar2;
            this.f22370y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            xq.a b10;
            oq.a aVar = this.f22368w;
            vq.a aVar2 = this.f22369x;
            io.a<? extends uq.a> aVar3 = this.f22370y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.h.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$32", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22371w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22372x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22373y;

        /* renamed from: z  reason: collision with root package name */
        public int f22374z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22374z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22373y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22372x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22371w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.G0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22371w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22372x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22373y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22374z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$57", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22375w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22376x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22377y;

        /* renamed from: z  reason: collision with root package name */
        public int f22378z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x0065, B:25:0x0074), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f22378z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.f22377y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r11.f22376x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r11.f22375w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L9d
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L53
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                wn.m.b(r12)
                com.dena.mirrativ.player.PlayerActivity r12 = com.dena.mirrativ.player.PlayerActivity.this
                nf.h r12 = com.dena.mirrativ.player.PlayerActivity.v4(r12)
                wo.x r3 = r12.r()
                com.dena.mirrativ.player.PlayerActivity r12 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9d
                r4 = r12
                r12 = r11
            L3d:
                r12.f22375w = r4     // Catch: java.lang.Throwable -> L9d
                r12.f22376x = r3     // Catch: java.lang.Throwable -> L9d
                r12.f22377y = r1     // Catch: java.lang.Throwable -> L9d
                r12.f22378z = r2     // Catch: java.lang.Throwable -> L9d
                java.lang.Object r5 = r1.a(r12)     // Catch: java.lang.Throwable -> L9d
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L53:
                r6 = 0
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L9a
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L9a
                if (r12 == 0) goto L94
                java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> L9a
                jf.h r12 = (jf.h) r12     // Catch: java.lang.Throwable -> L9a
                if (r12 != 0) goto L65
                goto L8e
            L65:
                nd.i1 r6 = com.dena.mirrativ.player.PlayerActivity.P4(r5)     // Catch: java.lang.Throwable -> L9a
                ye.a r6 = r6.a()     // Catch: java.lang.Throwable -> L9a
                boolean r6 = r6.d()     // Catch: java.lang.Throwable -> L9a
                if (r6 == 0) goto L74
                goto L8e
            L74:
                android.content.Context r6 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L9a
                com.dena.mirrorman.service.CollabService$a r7 = com.dena.mirrorman.service.CollabService.G     // Catch: java.lang.Throwable -> L9a
                android.content.Context r8 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L9a
                java.lang.String r9 = "applicationContext"
                jo.p.g(r8, r9)     // Catch: java.lang.Throwable -> L9a
                java.lang.String r12 = r12.b()     // Catch: java.lang.Throwable -> L9a
                android.content.Intent r12 = r7.a(r8, r12)     // Catch: java.lang.Throwable -> L9a
                c3.a.n(r6, r12)     // Catch: java.lang.Throwable -> L9a
            L8e:
                r12 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L94:
                wo.n.a(r4, r6)
                wn.v r12 = wn.v.f59242a
                return r12
            L9a:
                r12 = move-exception
                r3 = r4
                goto L9e
            L9d:
                r12 = move-exception
            L9e:
                throw r12     // Catch: java.lang.Throwable -> L9f
            L9f:
                r0 = move-exception
                wo.n.a(r3, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.x0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$reserveOfferingShare$1", f = "PlayerActivity.kt", l = {3752, 3753}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22379w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f22380x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ PlayerActivity f22381y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x1(long j10, PlayerActivity playerActivity, ao.d<? super x1> dVar) {
            super(2, dVar);
            this.f22380x = j10;
            this.f22381y = playerActivity;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x1(this.f22380x, this.f22381y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22379w;
            if (i10 == 0) {
                wn.m.b(obj);
                long j10 = this.f22380x;
                this.f22379w = 1;
                if (uo.b1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            PlayerActivity playerActivity = this.f22381y;
            this.f22379w = 2;
            if (playerActivity.K7(this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class x2 extends jo.q implements io.a<wn.v> {
        public x2() {
            super(0);
        }

        public static final void c(PlayerActivity playerActivity, DialogInterface dialogInterface, int i10) {
            jo.p.h(playerActivity, "this$0");
            playerActivity.finish();
        }

        public final void b() {
            AlertDialog.Builder builder = new AlertDialog.Builder(PlayerActivity.this);
            builder.setCancelable(false);
            builder.setTitle(hb.b2.f34723o);
            int i10 = hb.b2.f34730t0;
            final PlayerActivity playerActivity = PlayerActivity.this;
            builder.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: hb.u0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    PlayerActivity.x2.c(PlayerActivity.this, dialogInterface, i11);
                }
            });
            builder.create().show();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            b();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class x3 extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22383w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22384x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22385y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22383w = aVar;
            this.f22384x = aVar2;
            this.f22385y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            xq.a b10;
            oq.a aVar = this.f22383w;
            vq.a aVar2 = this.f22384x;
            io.a<? extends uq.a> aVar3 = this.f22385y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.r.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$33", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22386w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22387x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22388y;

        /* renamed from: z  reason: collision with root package name */
        public int f22389z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:19:0x0071, B:20:0x0075, B:12:0x0041, B:22:0x007b, B:11:0x0037), top: B:34:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
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
                int r2 = r1.f22389z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f22388y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f22387x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f22386w
                com.dena.mirrativ.player.PlayerActivity r5 = (com.dena.mirrativ.player.PlayerActivity) r5
                wn.m.b(r18)     // Catch: java.lang.Throwable -> Lad
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
                com.dena.mirrativ.player.PlayerActivity r2 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r2 = com.dena.mirrativ.player.PlayerActivity.L4(r2)
                wo.x r4 = r2.w1()
                com.dena.mirrativ.player.PlayerActivity r2 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> Lad
                r6 = r1
                r16 = r5
                r5 = r2
                r2 = r16
            L41:
                r6.f22386w = r5     // Catch: java.lang.Throwable -> Lad
                r6.f22387x = r4     // Catch: java.lang.Throwable -> Lad
                r6.f22388y = r2     // Catch: java.lang.Throwable -> Lad
                r6.f22389z = r3     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> Lad
                if (r7 != r0) goto L50
                return r0
            L50:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lad
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lad
                r8 = 0
                if (r7 == 0) goto La7
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> Lad
                wn.v r7 = (wn.v) r7     // Catch: java.lang.Throwable -> Lad
                java.lang.String r7 = "jp.co.mixi.monsterstrike"
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r5)     // Catch: java.lang.Throwable -> Lad
                androidx.lifecycle.LiveData r9 = r9.r0()     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r9 = r9.f()     // Catch: java.lang.Throwable -> Lad
                com.dena.mirrorman.net.api.response.App$AppParams r9 = (com.dena.mirrorman.net.api.response.App.AppParams) r9     // Catch: java.lang.Throwable -> Lad
                if (r9 == 0) goto L75
                java.lang.String r8 = r9.getAppId()     // Catch: java.lang.Throwable -> Lad
            L75:
                boolean r7 = jo.p.c(r7, r8)     // Catch: java.lang.Throwable -> Lad
                if (r7 == 0) goto L41
                ie.f$a r8 = ie.f.V0     // Catch: java.lang.Throwable -> Lad
                int r7 = hb.b2.U0     // Catch: java.lang.Throwable -> Lad
                java.lang.String r9 = r5.getString(r7)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r7 = "getString(R.string.text_view_game_id_dialog_monst)"
                jo.p.g(r9, r7)     // Catch: java.lang.Throwable -> Lad
                int r7 = hb.b2.f34731w0     // Catch: java.lang.Throwable -> Lad
                java.lang.String r10 = r5.getString(r7)     // Catch: java.lang.Throwable -> Lad
                int r7 = hb.b2.f34724p     // Catch: java.lang.Throwable -> Lad
                java.lang.String r11 = r5.getString(r7)     // Catch: java.lang.Throwable -> Lad
                r12 = 0
                r13 = 0
                r14 = 24
                r15 = 0
                ie.f r7 = ie.f.a.b(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lad
                androidx.fragment.app.FragmentManager r8 = r5.a3()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r9 = "open_comment_url"
                r7.z3(r8, r9)     // Catch: java.lang.Throwable -> Lad
                goto L41
            La7:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            Lad:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> Lb0
            Lb0:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$58", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22390w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22391x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22392y;

        /* renamed from: z  reason: collision with root package name */
        public int f22393z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00be, TryCatch #2 {all -> 0x00be, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0072, B:24:0x0079, B:25:0x0099, B:27:0x009f, B:28:0x00af), top: B:43:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r12.f22393z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r12.f22392y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r12.f22391x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r12.f22390w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r13)     // Catch: java.lang.Throwable -> Lc1
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto L53
            L20:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L28:
                wn.m.b(r13)
                com.dena.mirrativ.player.PlayerActivity r13 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r13 = com.dena.mirrativ.player.PlayerActivity.L4(r13)
                wo.x r3 = r13.o0()
                com.dena.mirrativ.player.PlayerActivity r13 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lc1
                r4 = r13
                r13 = r12
            L3d:
                r13.f22390w = r4     // Catch: java.lang.Throwable -> Lc1
                r13.f22391x = r3     // Catch: java.lang.Throwable -> Lc1
                r13.f22392y = r1     // Catch: java.lang.Throwable -> Lc1
                r13.f22393z = r2     // Catch: java.lang.Throwable -> Lc1
                java.lang.Object r5 = r1.a(r13)     // Catch: java.lang.Throwable -> Lc1
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r11 = r0
                r0 = r13
                r13 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r11
            L53:
                r6 = 0
                java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> Lbe
                boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> Lbe
                if (r13 == 0) goto Lb8
                java.lang.Object r13 = r3.next()     // Catch: java.lang.Throwable -> Lbe
                java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> Lbe
                nf.z r6 = com.dena.mirrativ.player.PlayerActivity.L4(r5)     // Catch: java.lang.Throwable -> Lbe
                androidx.lifecycle.LiveData r6 = r6.j1()     // Catch: java.lang.Throwable -> Lbe
                java.lang.Object r6 = r6.f()     // Catch: java.lang.Throwable -> Lbe
                te.c r6 = (te.c) r6     // Catch: java.lang.Throwable -> Lbe
                if (r6 == 0) goto Lb2
                java.lang.String r6 = r6.getLiveId()     // Catch: java.lang.Throwable -> Lbe
                if (r6 != 0) goto L79
                goto Lb2
            L79:
                kb.d r7 = r5.i6()     // Catch: java.lang.Throwable -> Lbe
                androidx.recyclerview.widget.RecyclerView r7 = r7.G     // Catch: java.lang.Throwable -> Lbe
                androidx.recyclerview.widget.RecyclerView$h r7 = r7.getAdapter()     // Catch: java.lang.Throwable -> Lbe
                java.lang.String r8 = "null cannot be cast to non-null type com.dena.mirrorman.adapter.PlayerCollabUserAdapter"
                jo.p.f(r7, r8)     // Catch: java.lang.Throwable -> Lbe
                rd.t0 r7 = (rd.t0) r7     // Catch: java.lang.Throwable -> Lbe
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbe
                r9 = 10
                int r9 = xn.t.u(r13, r9)     // Catch: java.lang.Throwable -> Lbe
                r8.<init>(r9)     // Catch: java.lang.Throwable -> Lbe
                java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> Lbe
            L99:
                boolean r9 = r13.hasNext()     // Catch: java.lang.Throwable -> Lbe
                if (r9 == 0) goto Laf
                java.lang.Object r9 = r13.next()     // Catch: java.lang.Throwable -> Lbe
                com.dena.mirrorman.net.api.response.user.LiveViewingUser r9 = (com.dena.mirrorman.net.api.response.user.LiveViewingUser) r9     // Catch: java.lang.Throwable -> Lbe
                ud.t$a r10 = ud.t.f55499e     // Catch: java.lang.Throwable -> Lbe
                ud.t r9 = r10.a(r6, r9)     // Catch: java.lang.Throwable -> Lbe
                r8.add(r9)     // Catch: java.lang.Throwable -> Lbe
                goto L99
            Laf:
                r7.f(r8)     // Catch: java.lang.Throwable -> Lbe
            Lb2:
                r13 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lb8:
                wo.n.a(r4, r6)
                wn.v r13 = wn.v.f59242a
                return r13
            Lbe:
                r13 = move-exception
                r3 = r4
                goto Lc2
            Lc1:
                r13 = move-exception
            Lc2:
                throw r13     // Catch: java.lang.Throwable -> Lc3
            Lc3:
                r0 = move-exception
                wo.n.a(r3, r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.y0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$sendGift$1", f = "PlayerActivity.kt", l = {3868}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ boolean C;

        /* renamed from: w  reason: collision with root package name */
        public int f22394w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jf.q f22396y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f22397z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y1(jf.q qVar, int i10, String str, String str2, boolean z10, ao.d<? super y1> dVar) {
            super(2, dVar);
            this.f22396y = qVar;
            this.f22397z = i10;
            this.A = str;
            this.B = str2;
            this.C = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y1(this.f22396y, this.f22397z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22394w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest A6 = PlayerActivity.this.A6();
                    String m10 = this.f22396y.m();
                    String h10 = this.f22396y.h();
                    int i11 = this.f22397z;
                    String str = this.A;
                    String str2 = this.B;
                    Integer k10 = this.f22396y.k();
                    Integer l10 = this.f22396y.l();
                    this.f22394w = 1;
                    obj = A6.giftSend(m10, h10, i11, str, str2, k10, l10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Gift.SendGift sendGift = (Gift.SendGift) obj;
                PlayerActivity.this.y6().t0(new jf.f(sendGift.getRemainingFreeCoins(), sendGift.getRemainingPaidCoins()));
                if (!this.C) {
                    PlayerActivity.this.y6().v(this.f22396y);
                } else if (this.f22396y.q().e()) {
                    PlayerActivity.this.y6().Y();
                } else {
                    PlayerActivity.this.J7();
                }
                hf.b.f35490a.c().a();
                if (sendGift.isAppMutualGiftEventAchieved()) {
                    PlayerActivity.this.y6().k();
                }
            } catch (Throwable th2) {
                t1.a aVar = yd.t1.f61795x;
                PlayerActivity playerActivity = PlayerActivity.this;
                String message = MRErrorKt.convertMRException(th2).getError().getMessage();
                if (message == null) {
                    message = PlayerActivity.this.getString(hb.b2.f34725p0);
                    jo.p.g(message, "getString(R.string.text_network_error)");
                }
                aVar.a(playerActivity, message);
                PlayerActivity.this.Z5();
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class y2 extends jo.q implements io.l<String, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ jf.q f22399x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ PlayerGiftPagerCell f22400y;

        @co.f(c = "com.dena.mirrativ.player.PlayerActivity$showMessageGiftView$1$1", f = "PlayerActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
            public final /* synthetic */ PlayerGiftPagerCell A;

            /* renamed from: w  reason: collision with root package name */
            public int f22401w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22402x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ jf.q f22403y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ String f22404z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayerActivity playerActivity, jf.q qVar, String str, PlayerGiftPagerCell playerGiftPagerCell, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f22402x = playerActivity;
                this.f22403y = qVar;
                this.f22404z = str;
                this.A = playerGiftPagerCell;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f22402x, this.f22403y, this.f22404z, this.A, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f22401w == 0) {
                    wn.m.b(obj);
                    this.f22402x.f21969d1 = false;
                    this.f22402x.o8();
                    this.f22403y.r();
                    this.f22402x.Q7(this.f22403y, false, this.f22404z);
                    this.f22402x.I5(this.A);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y2(jf.q qVar, PlayerGiftPagerCell playerGiftPagerCell) {
            super(1);
            this.f22399x = qVar;
            this.f22400y = playerGiftPagerCell;
        }

        public final void a(String str) {
            jo.p.h(str, "message");
            uo.l.d(uo.v1.f56093w, uo.g1.c(), null, new a(PlayerActivity.this, this.f22399x, str, this.f22400y, null), 2, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class y3 extends jo.q implements io.a<kf.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22405w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22406x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22405w = aVar;
            this.f22406x = aVar2;
            this.f22407y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.i, java.lang.Object] */
        @Override // io.a
        public final kf.i invoke() {
            xq.a b10;
            oq.a aVar = this.f22405w;
            vq.a aVar2 = this.f22406x;
            io.a<? extends uq.a> aVar3 = this.f22407y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.i.class), aVar2, aVar3);
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$34", f = "PlayerActivity.kt", l = {4801}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22408w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22409x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22410y;

        /* renamed from: z  reason: collision with root package name */
        public int f22411z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f22411z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f22410y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f22409x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f22408w
                com.dena.mirrativ.player.PlayerActivity r4 = (com.dena.mirrativ.player.PlayerActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
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
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                nf.z r9 = com.dena.mirrativ.player.PlayerActivity.L4(r9)
                wo.x r3 = r9.C0()
                com.dena.mirrativ.player.PlayerActivity r9 = com.dena.mirrativ.player.PlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f22408w = r4     // Catch: java.lang.Throwable -> L74
                r9.f22409x = r3     // Catch: java.lang.Throwable -> L74
                r9.f22410y = r1     // Catch: java.lang.Throwable -> L74
                r9.f22411z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrativ.player.PlayerActivity.W4(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$observeStoreValues$59", f = "PlayerActivity.kt", l = {3192}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22412w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PlayerActivity f22414w;

            public a(PlayerActivity playerActivity) {
                this.f22414w = playerActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f22414w.L6(mRError);
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
            int i10 = this.f22412w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.c<MRError> A0 = PlayerActivity.this.z6().A0();
                a aVar = new a(PlayerActivity.this);
                this.f22412w = 1;
                if (A0.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.player.PlayerActivity$sendLiveGameGift$1", f = "PlayerActivity.kt", l = {3829}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class z1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22415w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ud.v1 f22417y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f22418z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z1(ud.v1 v1Var, String str, ao.d<? super z1> dVar) {
            super(2, dVar);
            this.f22417y = v1Var;
            this.f22418z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new z1(this.f22417y, this.f22418z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((z1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22415w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest A6 = PlayerActivity.this.A6();
                    String b10 = this.f22417y.b();
                    String str = this.f22418z;
                    this.f22415w = 1;
                    obj = MRRequest.DefaultImpls.giftSend$default(A6, Referer.SHORTCUT_GIFT, b10, 1, str, null, null, null, this, 112, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Gift.SendGift sendGift = (Gift.SendGift) obj;
                PlayerActivity.this.y6().t0(new jf.f(sendGift.getRemainingFreeCoins(), sendGift.getRemainingPaidCoins()));
                hf.b.f35490a.c().a();
            } catch (Throwable th2) {
                t1.a aVar = yd.t1.f61795x;
                PlayerActivity playerActivity = PlayerActivity.this;
                String message = MRErrorKt.convertMRException(th2).getError().getMessage();
                if (message == null) {
                    message = PlayerActivity.this.getString(hb.b2.f34725p0);
                    jo.p.g(message, "getString(R.string.text_network_error)");
                }
                aVar.a(playerActivity, message);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class z2 implements b.InterfaceC0775b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f22420b;

        public z2(String str) {
            this.f22420b = str;
        }

        @Override // rb.b.InterfaceC0775b
        public void a() {
            PlayerActivity.this.e6(Referer.LiveView.GUIDE_FOLLOW);
            Puree.d(new Quiz.Click(this.f22420b, true));
            hf.b.f35490a.d().a();
        }

        @Override // rb.b.InterfaceC0775b
        public void b() {
            Puree.d(new Quiz.Click(this.f22420b, false));
        }
    }

    /* loaded from: classes2.dex */
    public static final class z3 extends jo.q implements io.a<hf.s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f22421w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22422x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22423y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z3(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f22421w = aVar;
            this.f22422x = aVar2;
            this.f22423y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.s, java.lang.Object] */
        @Override // io.a
        public final hf.s invoke() {
            xq.a b10;
            oq.a aVar = this.f22421w;
            vq.a aVar2 = this.f22422x;
            io.a<? extends uq.a> aVar3 = this.f22423y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.s.class), aVar2, aVar3);
        }
    }

    static {
        f21958u1 = of.n.n() ? 5 : 60;
        f21959v1 = new Size(TsExtractor.TS_STREAM_TYPE_E_AC3, PsExtractor.VIDEO_STREAM_MASK);
        f21960w1 = new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        f21961x1 = cookieManager;
    }

    public PlayerActivity() {
        uo.b0 b10;
        uo.b0 b11;
        uo.o2 c10 = uo.g1.c();
        b10 = uo.i2.b(null, 1, null);
        this.P = c10.plus(b10);
        this.Q = wn.g.a(new t1());
        this.R = wn.g.a(new a2());
        cr.a aVar = cr.a.f28611a;
        this.S = wn.g.b(aVar.b(), new k3(this, null, null));
        this.T = wn.g.b(aVar.b(), new t3(this, null, null));
        this.U = new androidx.lifecycle.s0(jo.f0.b(ud.j.class), new d4(this), new c4(new b4(this), null, null, gq.a.a(this)));
        this.V = wn.g.b(aVar.b(), new u3(this, null, null));
        this.W = wn.g.b(aVar.b(), new v3(this, null, null));
        this.X = wn.g.b(aVar.b(), new w3(this, null, null));
        this.Y = wn.g.b(aVar.b(), new x3(this, null, null));
        this.Z = wn.g.b(aVar.b(), new y3(this, null, null));
        this.f21962a0 = wn.g.b(aVar.b(), new z3(this, null, null));
        this.f21964b0 = wn.g.b(aVar.b(), new a4(this, null, null));
        this.f21966c0 = wn.g.b(aVar.b(), new a3(this, null, null));
        this.f21968d0 = wn.g.b(aVar.b(), new b3(this, null, null));
        this.f21970e0 = wn.g.b(aVar.b(), new c3(this, null, null));
        this.f21972f0 = wn.g.b(aVar.b(), new d3(this, null, null));
        this.f21974g0 = wn.g.b(aVar.b(), new e3(this, null, null));
        this.f21976h0 = wn.g.b(aVar.b(), new f3(this, null, null));
        this.f21978i0 = wn.g.b(aVar.b(), new g3(this, null, null));
        this.f21980j0 = wn.g.b(aVar.b(), new h3(this, null, null));
        this.f21982k0 = wn.g.b(aVar.b(), new i3(this, null, null));
        this.f21984l0 = wn.g.b(aVar.b(), new j3(this, null, null));
        this.f21986m0 = wn.g.b(aVar.b(), new l3(this, null, null));
        this.f21988n0 = wn.g.b(aVar.b(), new m3(this, null, null));
        this.f21990o0 = wn.g.b(aVar.b(), new n3(this, null, null));
        this.f21992p0 = wn.g.b(aVar.b(), new o3(this, null, null));
        this.f21994q0 = wn.g.b(aVar.b(), new p3(this, null, null));
        this.f21996r0 = wn.g.b(aVar.b(), new q3(this, null, null));
        this.f21998s0 = wn.g.b(aVar.b(), new r3(this, null, null));
        this.f21999t0 = wn.g.b(aVar.b(), new s3(this, null, null));
        b11 = uo.i2.b(null, 1, null);
        this.f22001v0 = b11;
        this.f22002w0 = new androidx.recyclerview.widget.s();
        this.f22003x0 = new FragmentRunner(this);
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: hb.p
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                PlayerActivity.M6(PlayerActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…dUserProfileImage()\n    }");
        this.f22004y0 = V2;
        this.f22005z0 = new LinkedList<>();
        this.H0 = b.None;
        this.f21981j1 = new ArrayList<>();
        this.f21983k1 = new ArrayList();
    }

    public static /* synthetic */ void B7(PlayerActivity playerActivity, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        playerActivity.A7(str, z10);
    }

    public static final void E7(te.c cVar, PlayerActivity playerActivity, uo.d2 d2Var, View view) {
        jo.p.h(cVar, "$params");
        jo.p.h(playerActivity, "this$0");
        jo.p.h(d2Var, "$followAnimationJob");
        if (cVar.d()) {
            return;
        }
        playerActivity.e6(Referer.LiveView.LEFTUP_FOLLOW_BUTTON);
        d2.a.a(d2Var, null, 1, null);
    }

    public static final void F7(PlayerActivity playerActivity) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.Y0 = true;
        playerActivity.G8();
    }

    public static final void G7(PlayerActivity playerActivity, View view) {
        String liveId;
        App.AppParams f10;
        be.r a10;
        jo.p.h(playerActivity, "this$0");
        te.c f11 = playerActivity.z6().j1().f();
        if (f11 == null || (liveId = f11.getLiveId()) == null) {
            return;
        }
        hf.v0 I6 = playerActivity.I6();
        FragmentManager a32 = playerActivity.a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_view.app_user_id", false, 4, null) && (f10 = playerActivity.z6().r0().f()) != null) {
            if (!f10.isCategory()) {
                if (!playerActivity.D6().a().c()) {
                    a10 = be.r.f18061c1.a(Referer.LIVE_VIEW, f10.getAppUserIdLabel(), f10.isAppUserIdHidden(), "", false, (r25 & 32) != 0 ? false : false, (r25 & 64) != 0 ? nd.f1.text_view_game_id_add_app_title_v2 : 0, (r25 & 128) != 0 ? nd.f1.text_view_game_id_add_app_title_landscape_v2 : 0, (r25 & 256) != 0, (r25 & 512) != 0 ? false : false);
                    a10.z3(playerActivity.a3(), "AppUserIdSettingDialog");
                    playerActivity.h6().F().p(Boolean.TRUE);
                    playerActivity.y6().J(f10.getAppId(), Referer.LIVE_VIEW);
                    MRLogger u62 = playerActivity.u6();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GAME_ID_COMMENT_BTN_TAP);
                    builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
                    builder.setTargetId(f10.getAppId());
                    builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
                    u62.sendLog(builder.build());
                    return;
                }
                of.n nVar = of.n.f45411a;
                Context applicationContext = playerActivity.getApplicationContext();
                jo.i0 i0Var = jo.i0.f38149a;
                String string = playerActivity.getResources().getString(hb.b2.text_app_used_id_noop_message);
                jo.p.g(string, "resources.getString(R.st…app_used_id_noop_message)");
                String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                jo.p.g(format, "format(format, *args)");
                nVar.B(applicationContext, format, false);
                return;
            }
            of.n.A(playerActivity.getApplicationContext(), hb.b2.V0, false);
        }
    }

    public static final void M6(PlayerActivity playerActivity, androidx.activity.result.a aVar) {
        jo.p.h(playerActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        playerActivity.J5();
    }

    public static final void Q5(PlayerActivity playerActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.finish();
    }

    public static /* synthetic */ void R7(PlayerActivity playerActivity, jf.q qVar, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "";
        }
        playerActivity.Q7(qVar, z10, str);
    }

    public static final void W6(PlayerActivity playerActivity, te.c cVar) {
        jo.p.h(playerActivity, "this$0");
        if (cVar == null) {
            return;
        }
        playerActivity.U7();
        playerActivity.h6().V(cVar.e(), cVar.f());
        ProgressBar progressBar = playerActivity.i6().f38525r0;
        jo.p.g(progressBar, "binding.progressBar");
        boolean z10 = true;
        if ((progressBar.getVisibility() == 8) && playerActivity.I6().l()) {
            PlayerService c10 = playerActivity.B6().c();
            if (c10 == null || c10.w0()) {
                z10 = false;
            }
            if (z10) {
                playerActivity.C7();
            }
        }
        playerActivity.H7();
    }

    public static final void X6(PlayerActivity playerActivity, Boolean bool) {
        jo.p.h(playerActivity, "this$0");
        ConstraintLayout constraintLayout = playerActivity.i6().f38519l0;
        jo.p.g(bool, "it");
        constraintLayout.setVisibility(bool.booleanValue() ? 8 : 0);
        playerActivity.H0 = bool.booleanValue() ? b.Message : b.Full;
    }

    public static /* synthetic */ boolean Y5(PlayerActivity playerActivity, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return playerActivity.X5(z10);
    }

    public static final void Y6(PlayerActivity playerActivity, MRError mRError) {
        jo.p.h(playerActivity, "this$0");
        if (mRError == null) {
            return;
        }
        playerActivity.L6(mRError);
        playerActivity.finish();
    }

    public static final void Z6(PlayerActivity playerActivity, te.c cVar) {
        String appId;
        jo.p.h(playerActivity, "this$0");
        if (cVar == null) {
            return;
        }
        if (playerActivity.f21985l1) {
            playerActivity.f21985l1 = true;
            Trace a10 = vd.b.f57299a.a("click_play");
            if (a10 != null) {
                a10.putAttribute(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.getLiveId());
                a10.putAttribute("is_live", "" + cVar.isLive());
                a10.putAttribute("is_archive", "" + cVar.isArchive());
            }
        }
        playerActivity.D7(cVar);
        playerActivity.y6().G(cVar.getLiveId());
        playerActivity.y6().B(cVar.getLiveId());
        String string = (playerActivity.J6().t4().length() > 0 ? (byte) 1 : (byte) 0) != 0 ? playerActivity.getString(hb.b2.text_live_description_user_name, new Object[]{playerActivity.J6().t4()}) : "";
        jo.p.g(string, "if (userPreference.NAME.…     \"\"\n                }");
        playerActivity.y6().X(cVar, Referer.LIVE_VIEW, string);
        PlayerService c10 = playerActivity.B6().c();
        if (c10 != null) {
            c10.P(cVar);
        }
        if (!playerActivity.F6().b(8).b()) {
            GiftAppealPopupImage giftAppealPopupImage = cVar.getGiftAppealPopupImage();
            if (giftAppealPopupImage != null) {
                playerActivity.i6().T.setVisibility(0);
                AppCompatImageView appCompatImageView = playerActivity.i6().R;
                jo.p.g(appCompatImageView, "binding.giftAppealBodyImageView");
                td.a.f(appCompatImageView, giftAppealPopupImage.getBody());
                AppCompatImageView appCompatImageView2 = playerActivity.i6().U;
                jo.p.g(appCompatImageView2, "binding.giftAppealTriangleImageView");
                td.a.f(appCompatImageView2, giftAppealPopupImage.getTriangle());
                playerActivity.i6().V.getViewTreeObserver().addOnGlobalLayoutListener(new f0());
            } else {
                playerActivity.i6().T.setVisibility(8);
            }
        }
        playerActivity.F6().f();
        playerActivity.y6().E(cVar.g(), cVar.getLiveId());
        if (playerActivity.P0 && playerActivity.Q0) {
            u4.Y0.a(cVar.g(), Referer.LIVE_VIEW).z3(playerActivity.a3(), "ShooterMatchedUserProfileDialogFragment");
            playerActivity.Q0 = false;
        }
        if (playerActivity.V0 && cVar.isNuuWelcome()) {
            MRLogger u62 = playerActivity.u6();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_NUU_WELCOME_LIVE);
            builder.setPayload(xn.s.p(wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, cVar.g()), wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.getLiveId())));
            u62.sendLog(builder.build());
            hb.g.N0.a().z3(playerActivity.a3(), "NuuWelcomeMessageDialog");
        } else if (cVar.isOmotenashi()) {
            tb.a a11 = c.a.a(playerActivity.s6(), null, Integer.valueOf(hb.v1.U), playerActivity.getString(hb.b2.text_omotenashi_welcome_popup_title), playerActivity.getString(hb.b2.text_omotenashi_welcome_popup_message), null, null, null, null, false, 497, null);
            a11.a().z3(playerActivity.a3(), a11.b());
        }
        MRLogger u63 = playerActivity.u6();
        MRLog.Companion companion2 = MRLog.Companion;
        MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_START);
        wn.k[] kVarArr = new wn.k[7];
        String stringExtra = playerActivity.getIntent().getStringExtra("EXTRA_FROM_WHERE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, stringExtra);
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_IS_MUTED, String.valueOf(playerActivity.R6()));
        kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, cVar.g());
        kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_NAME, cVar.e());
        kVarArr[4] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.getLiveId());
        String title = cVar.getTitle();
        if (title == null) {
            title = "";
        }
        kVarArr[5] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_NAME, title);
        xm.e eVar = new xm.e();
        HashMap hashMap = new HashMap();
        boolean isBirthday = cVar.getOwner().isBirthday();
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (isBirthday) {
            hashMap.put(MRLog.PAYLOAD_KEY_MEMORIAL_ID, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (!cVar.isOmotenashi()) {
            str = "0";
        }
        hashMap.put(MRLog.PAYLOAD_KEY_IS_OMOTENASHI, str);
        wn.v vVar = wn.v.f59242a;
        kVarArr[6] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap));
        List<wn.k<String, String>> p10 = xn.s.p(kVarArr);
        App.AppParams app = cVar.getApp();
        if (app != null && (appId = app.getAppId()) != null) {
            if (appId.length() > 0) {
                p10.add(wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, appId));
            }
        }
        builder2.setPayload(p10);
        u63.sendLog(builder2.build());
        MRLogger u64 = playerActivity.u6();
        MRLog.Builder builder3 = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_PLAYER_START);
        builder3.setTargetType(playerActivity.D6().a().d() ? "mirroring" : MRLog.TARGET_TYPE_LIVE);
        builder3.setTargetId(playerActivity.D6().a().d() ? playerActivity.t6().b() : cVar.getLiveId());
        builder3.setPageId("");
        wn.k[] kVarArr2 = new wn.k[7];
        kVarArr2[0] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, cVar.g());
        kVarArr2[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_NAME, cVar.e());
        kVarArr2[2] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.getLiveId());
        String title2 = cVar.getTitle();
        if (title2 == null) {
            title2 = "";
        }
        kVarArr2[3] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_NAME, title2);
        String stringExtra2 = playerActivity.getIntent().getStringExtra("EXTRA_FROM_WHERE");
        kVarArr2[4] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, stringExtra2 != null ? stringExtra2 : "");
        kVarArr2[5] = wn.q.a(MRLog.PAYLOAD_KEY_IS_MUTED, String.valueOf(playerActivity.R6()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        {\"is_friend_link\" :\"");
        LinkedLive linkedLive = cVar.getLinkedLive();
        sb2.append(jo.p.c(linkedLive != null ? linkedLive.getOwnerId() : null, playerActivity.J6().T4()) ? 1 : 0);
        sb2.append("\"}\n                            ");
        kVarArr2[6] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, so.g.f(sb2.toString()));
        List<wn.k<String, String>> p11 = xn.s.p(kVarArr2);
        String appId2 = cVar.getAppId();
        if (appId2 != null) {
            p11.add(wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, appId2));
        }
        builder3.setPayload(p11);
        u64.sendLog(builder3.build());
    }

    public static final void Z7(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        String obj = playerActivity.i6().K.getText().toString();
        if (!TextUtils.isEmpty(obj)) {
            playerActivity.i6().K.setText("");
            B7(playerActivity, obj, false, 2, null);
        } else if (playerActivity.a3().e0("LiveInfoBottomSheetDialog") != null) {
            playerActivity.V5();
        } else {
            playerActivity.w8();
        }
    }

    public static final void a7(PlayerActivity playerActivity, Boolean bool) {
        jo.p.h(playerActivity, "this$0");
        ProgressBar progressBar = playerActivity.i6().f38525r0;
        jo.p.g(bool, "it");
        progressBar.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void a8(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.T6();
        Puree.d(new Avatar.LaunchEmomoTab(Avatar.EmomoTabPageId.BOTTOM_NAV));
    }

    public static final void b7(PlayerActivity playerActivity, App.AppParams appParams) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.i6().B.setAlpha((appParams == null || appParams.isCategory() || playerActivity.D6().a().c()) ? 0.5f : 1.0f);
        if (playerActivity.o6().i2()) {
            boolean z10 = false;
            if (appParams != null && !appParams.isCategory()) {
                z10 = true;
            }
            if (z10) {
                GlideApp.with(playerActivity.i6().B).load(appParams.getIconUrl()).apply((e8.a<?>) e8.h.bitmapTransform(new xd.a(de.a.b(playerActivity, 1), -1))).into(playerActivity.i6().B);
                playerActivity.h6().Q(playerActivity, appParams);
            }
        }
        playerActivity.i6().B.setImageResource(hb.v1.ic_app_user_id);
        playerActivity.h6().Q(playerActivity, appParams);
    }

    public static final void b8(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.e6(Referer.LiveView.LEFTUP_FOLLOW_BUTTON);
    }

    public static final void c7(PlayerActivity playerActivity, AppUserDetailResponse appUserDetailResponse) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.h6().W(appUserDetailResponse);
    }

    public static final void c8(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.u8();
    }

    public static final void d7(PlayerActivity playerActivity, jf.f fVar) {
        jo.p.h(playerActivity, "this$0");
        if (fVar == null) {
            return;
        }
        playerActivity.y6().l0(fVar.a(playerActivity.f21983k1));
    }

    public static final void d8(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        if (playerActivity.i6().f38525r0.getVisibility() == 0) {
            return;
        }
        playerActivity.o8();
    }

    public static final void e7(PlayerActivity playerActivity, Boolean bool) {
        jo.p.h(playerActivity, "this$0");
        ud.j h62 = playerActivity.h6();
        jo.p.g(bool, "it");
        h62.T(bool.booleanValue());
    }

    public static final boolean e8(PlayerActivity playerActivity, View view, MotionEvent motionEvent) {
        jo.p.h(playerActivity, "this$0");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            if (playerActivity.f21969d1) {
                return true;
            }
            if (playerActivity.v6()) {
                playerActivity.Z5();
                return true;
            } else if (playerActivity.z6().J1().f() == null) {
                return true;
            } else {
                if (playerActivity.i6().f38519l0.getVisibility() == 0) {
                    playerActivity.D8();
                } else {
                    playerActivity.C8();
                }
            }
        }
        return true;
    }

    public static final void f7(PlayerActivity playerActivity, wn.k kVar) {
        jo.p.h(playerActivity, "this$0");
        if (kVar == null) {
            return;
        }
        if (((Boolean) kVar.c()).booleanValue()) {
            playerActivity.K0 = true;
            playerActivity.K8(true);
            hf.b.f35490a.h();
            FirebaseAnalytics.getInstance(playerActivity.getApplicationContext()).a("jdwii7", null);
            return;
        }
        playerActivity.K0 = false;
        playerActivity.K8(false);
    }

    public static final void f8(PlayerActivity playerActivity, View view) {
        CollabType collabType;
        te.c f10;
        String e10;
        jo.p.h(playerActivity, "this$0");
        CollabInvitation f11 = playerActivity.z6().l0().f();
        if (f11 == null || (collabType = f11.getCollabType()) == null || (f10 = playerActivity.z6().j1().f()) == null || (e10 = f10.e()) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new s2(view));
        view.startAnimation(alphaAnimation);
        int i10 = c.f22039b[collabType.ordinal()];
        if (i10 == 1) {
            be.a2.O0.a(e10).z3(playerActivity.a3(), "InvitedCollabCallDialogFragment");
            te.c f12 = playerActivity.z6().j1().f();
            if (f12 != null) {
                MRLogger u62 = playerActivity.u6();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_TAP_COLLAB_INVITE_BUTTON);
                builder.setTargetType(MRLog.TARGET_TYPE_USER);
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f12.getLiveId()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, f12.g())));
                u62.sendLog(builder.build());
            }
        } else if (i10 != 2) {
        } else {
            be.c2.P0.a(e10).z3(playerActivity.a3(), "InvitedCollabLiveDialogFragment");
            te.c f13 = playerActivity.z6().j1().f();
            if (f13 != null) {
                MRLogger u63 = playerActivity.u6();
                MRLog.Companion companion2 = MRLog.Companion;
                MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_TAP_COLLAB_INVITE_BUTTON);
                builder2.setTargetType(MRLog.TARGET_TYPE_LIVE);
                builder2.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f13.getLiveId()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, f13.g())));
                u63.sendLog(builder2.build());
            }
        }
    }

    public static final void g7(PlayerActivity playerActivity, wn.k kVar) {
        jo.p.h(playerActivity, "this$0");
        uo.l.d(playerActivity, null, null, new i(null), 3, null);
    }

    public static final void g8(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.P5();
    }

    public static final void h7(PlayerActivity playerActivity, List list) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.O6(list);
        playerActivity.i6().f38529v0.x1(0);
    }

    public static final void h8(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.P5();
    }

    public static final void i7(PlayerActivity playerActivity, List list) {
        jo.p.h(playerActivity, "this$0");
        jo.p.g(list, "emomoRunGifts");
        playerActivity.X7(list);
        playerActivity.A8(xn.a0.L(list));
        playerActivity.m6().d(list.isEmpty());
    }

    public static final void i8(PlayerActivity playerActivity, View view) {
        jo.p.h(playerActivity, "this$0");
        String f10 = playerActivity.z6().s0().f();
        if (f10 != null) {
            playerActivity.y6().i0(f10, false);
        }
        PlayerService c10 = playerActivity.B6().c();
        if (c10 != null) {
            c10.A0();
        }
    }

    public static final void j7(PlayerActivity playerActivity, CollabInvitation collabInvitation) {
        jo.p.h(playerActivity, "this$0");
        CollabType collabType = collabInvitation != null ? collabInvitation.getCollabType() : null;
        int i10 = collabType == null ? -1 : c.f22039b[collabType.ordinal()];
        if (i10 == 1) {
            of.g gVar = of.g.f45395a;
            LottieAnimationView lottieAnimationView = playerActivity.i6().Z;
            jo.p.g(lottieAnimationView, "binding.invitedCollabFirstLottieAnimationView");
            LottieAnimationView lottieAnimationView2 = playerActivity.i6().f38508a0;
            jo.p.g(lottieAnimationView2, "binding.invitedCollabLoopLottieAnimationView");
            gVar.a(lottieAnimationView, lottieAnimationView2);
            te.c f10 = playerActivity.z6().j1().f();
            if (f10 != null) {
                MRLogger u62 = playerActivity.u6();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_IMP_COLLAB_INVITE_BUTTON);
                builder.setTargetType(MRLog.TARGET_TYPE_USER);
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f10.getLiveId()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, f10.g())));
                u62.sendLog(builder.build());
            }
        } else if (i10 != 2) {
            playerActivity.i6().Z.setVisibility(8);
            playerActivity.i6().Z.h();
            playerActivity.i6().f38508a0.setVisibility(8);
            playerActivity.i6().f38508a0.h();
        } else {
            of.g gVar2 = of.g.f45395a;
            LottieAnimationView lottieAnimationView3 = playerActivity.i6().Z;
            jo.p.g(lottieAnimationView3, "binding.invitedCollabFirstLottieAnimationView");
            LottieAnimationView lottieAnimationView4 = playerActivity.i6().f38508a0;
            jo.p.g(lottieAnimationView4, "binding.invitedCollabLoopLottieAnimationView");
            gVar2.b(lottieAnimationView3, lottieAnimationView4);
            te.c f11 = playerActivity.z6().j1().f();
            if (f11 != null) {
                MRLogger u63 = playerActivity.u6();
                MRLog.Companion companion2 = MRLog.Companion;
                MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_IMP_COLLAB_INVITE_BUTTON);
                builder2.setTargetType(MRLog.TARGET_TYPE_LIVE);
                builder2.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f11.getLiveId()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, f11.g())));
                u63.sendLog(builder2.build());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [uo.d2, T] */
    public static final void j8(jo.e0<uo.d2> e0Var, PlayerActivity playerActivity) {
        ?? d10;
        uo.d2 d2Var = e0Var.f38136w;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(playerActivity, null, null, new t2(null), 3, null);
        e0Var.f38136w = d10;
    }

    public static final void k7(PlayerActivity playerActivity, ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.i6().f38533z0.setVisibility(8);
        ShooterMemberStatus inviteStatus = shooterMemberStateChangedBcsvrResponse != null ? shooterMemberStateChangedBcsvrResponse.getInviteStatus() : null;
        int i10 = inviteStatus == null ? -1 : c.f22040c[inviteStatus.ordinal()];
        if (i10 == 1) {
            playerActivity.E6().i(shooterMemberStateChangedBcsvrResponse.getSeasonId(), shooterMemberStateChangedBcsvrResponse.getTeamId(), shooterMemberStateChangedBcsvrResponse.getUserId(), ShooterMemberStatus.INVITED);
        } else if (i10 != 2) {
            if (i10 != 3) {
                Fragment e02 = playerActivity.a3().e0("ShooterInvitationDialogFragment");
                androidx.fragment.app.e eVar = e02 instanceof androidx.fragment.app.e ? (androidx.fragment.app.e) e02 : null;
                if (eVar != null) {
                    eVar.n3();
                    return;
                }
                return;
            }
            playerActivity.E6().i(shooterMemberStateChangedBcsvrResponse.getSeasonId(), shooterMemberStateChangedBcsvrResponse.getTeamId(), shooterMemberStateChangedBcsvrResponse.getUserId(), ShooterMemberStatus.CANCELED);
        } else {
            playerActivity.i6().f38533z0.setVisibility(0);
            of.h hVar = of.h.f45400a;
            LottieAnimationView lottieAnimationView = playerActivity.i6().f38509b0;
            jo.p.g(lottieAnimationView, "binding.invitedShooterFirstLottieAnimationView");
            LottieAnimationView lottieAnimationView2 = playerActivity.i6().f38510c0;
            jo.p.g(lottieAnimationView2, "binding.invitedShooterLoopLottieAnimationView");
            hVar.a(lottieAnimationView, lottieAnimationView2);
            ConstraintLayout constraintLayout = playerActivity.i6().f38533z0;
            jo.p.g(constraintLayout, "binding.shooterInvitedContainer");
            yd.g1.a(constraintLayout, new j(shooterMemberStateChangedBcsvrResponse, playerActivity));
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [uo.d2, T] */
    public static final void k8(jo.e0<uo.d2> e0Var, PlayerActivity playerActivity) {
        ?? d10;
        uo.d2 d2Var = e0Var.f38136w;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(playerActivity, null, null, new u2(null), 3, null);
        e0Var.f38136w = d10;
    }

    public static final void l7(PlayerActivity playerActivity, List list) {
        jo.p.h(playerActivity, "this$0");
        RecyclerView recyclerView = playerActivity.i6().N;
        jo.p.g(recyclerView, "binding.currentUserGiftRankingRecyclerView");
        if (recyclerView.getVisibility() == 0) {
            if (playerActivity.i6().M.getChildCount() != list.size()) {
                playerActivity.i6().M.removeAllViews();
                int size = list.size();
                int i10 = 0;
                while (i10 < size) {
                    RadioButton radioButton = new RadioButton(playerActivity);
                    radioButton.setButtonDrawable(c3.a.f(radioButton.getContext(), hb.v1.J));
                    int i11 = i10 + 1;
                    radioButton.setId(i11);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(de.a.b(playerActivity, 4), 0, de.a.b(playerActivity, 4), 0);
                    radioButton.setLayoutParams(layoutParams);
                    radioButton.setChecked(i10 == 0);
                    radioButton.setClickable(false);
                    playerActivity.i6().M.addView(radioButton);
                    i10 = i11;
                }
            }
            RecyclerView.h adapter = playerActivity.i6().N.getAdapter();
            jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.player.giftranking.PlayerCurrentUserGiftRankAdapter");
            ob.b bVar = (ob.b) adapter;
            jo.p.g(list, "currentUserRank");
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ob.c.J.a((jf.u) it.next()));
            }
            bVar.d(arrayList);
        }
    }

    public static final void m7(PlayerActivity playerActivity, ud.w1 w1Var) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.B8(w1Var);
        playerActivity.m6().d(w1Var == null);
    }

    public static final void o7(PlayerActivity playerActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(playerActivity, "this$0");
        super.onBackPressed();
    }

    public static final void q8(PlayerActivity playerActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(playerActivity, "this$0");
        playerActivity.l8();
    }

    @Override // com.dena.mirrativ.player.PipStateManager.b
    public void A1(PipStateManager pipStateManager) {
        jo.p.h(pipStateManager, "pipStateManager");
        g().c(pipStateManager.c());
    }

    public final MRRequest A6() {
        return (MRRequest) this.f21974g0.getValue();
    }

    public final void A7(String str, boolean z10) {
        String liveId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (!hf.v0.c(I6, a32, "live_view.post_comment", false, 4, null)) {
            i6().K.setText(str);
            return;
        }
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().Q(liveId, 1, (r25 & 4) != 0 ? null : str, (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : null, z10, (r25 & 64) != 0 ? null : null, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0 ? null : null, (r25 & 512) != 0 ? null : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (getResources().getConfiguration().orientation == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A8(boolean r3) {
        /*
            r2 = this;
            androidx.lifecycle.o r0 = r2.g()
            androidx.lifecycle.o$c r0 = r0.b()
            androidx.lifecycle.o$c r1 = androidx.lifecycle.o.c.RESUMED
            if (r0 == r1) goto Ld
            return
        Ld:
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L39
            nf.z r3 = r2.z6()
            androidx.lifecycle.LiveData r3 = r3.w0()
            java.lang.Object r3 = r3.f()
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L29
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L29
            r3 = r0
            goto L2a
        L29:
            r3 = r1
        L2a:
            if (r3 == 0) goto L39
            android.content.res.Resources r3 = r2.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            if (r3 != r0) goto L39
            goto L3a
        L39:
            r0 = r1
        L3a:
            kb.d r3 = r2.i6()
            com.dena.mirrativ.player.gifting.EmomoRunGiftsView r3 = r3.P
            if (r0 == 0) goto L43
            goto L45
        L43:
            r1 = 8
        L45:
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.A8(boolean):void");
    }

    public final hb.o1 B6() {
        return (hb.o1) this.R.getValue();
    }

    public final void B8(ud.w1 w1Var) {
        te.c f10;
        String liveId;
        if (g().b() != o.c.RESUMED || (f10 = z6().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 26) {
            i6().f38513f0.setVisibility(8);
        } else if (w1Var == null) {
            i6().f38513f0.setVisibility(8);
        } else {
            i6().f38513f0.setVisibility(0);
            ComposeView composeView = i6().f38513f0;
            composeView.setViewCompositionStrategy(d2.c.f14419b);
            composeView.setContent(s0.c.c(1845352253, true, new e4(w1Var, this, liveId)));
        }
    }

    @Override // be.d3
    public void C() {
        d3.a.b(this);
    }

    @Override // be.d2
    public void C2() {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        k6().d(liveId, jf.k.HANDLE_COLLAB_CANCEL);
    }

    public final kf.t C6() {
        return (kf.t) this.f21986m0.getValue();
    }

    public final void C7() {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        hb.i y62 = y6();
        int i10 = this.P0 ? 106 : 3;
        String str = this.X0;
        String str2 = this.F0;
        String str3 = this.f21997r1;
        String stringExtra = getIntent().getStringExtra("EXTRA_FROM_WHERE");
        boolean z10 = true;
        if (stringExtra == null || !so.n.C(stringExtra, Referer.HOME_SELECT, false, 2, null)) {
            z10 = false;
        }
        y62.Q(liveId, i10, (r25 & 4) != 0 ? null : "", (r25 & 8) != 0 ? null : null, (r25 & 16) != 0 ? null : str, false, (r25 & 64) != 0 ? null : str2, (r25 & 128) != 0 ? null : str3, (r25 & 256) != 0 ? null : z10 ? "2" : null, (r25 & 512) != 0 ? null : this.U0);
        this.U0 = null;
    }

    public final void C8() {
        if (this.H0 == b.Full) {
            return;
        }
        i6().f38516i0.setVisibility(8);
        ConstraintLayout constraintLayout = i6().f38519l0;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new f4());
        constraintLayout.startAnimation(alphaAnimation);
        ConstraintLayout constraintLayout2 = i6().B0;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300L);
        alphaAnimation2.setAnimationListener(new g4());
        constraintLayout2.startAnimation(alphaAnimation2);
    }

    @Override // lb.l
    public void D(jf.q qVar) {
        if (qVar == null || i6().f38525r0.getVisibility() == 0) {
            return;
        }
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_view.send_gift", false, 4, null)) {
            String j10 = qVar.j();
            if (!(j10 == null || j10.length() == 0)) {
                b.a aVar = ie.b.P0;
                String j11 = qVar.j();
                if (j11 == null) {
                    j11 = "";
                }
                b.a.b(aVar, j11, null, getString(hb.b2.f34730t0), 2, null).z3(a3(), "DIALOG_TAG_LOCKED_GIFT");
                return;
            }
            hb.i y62 = y6();
            Integer l10 = qVar.l();
            y62.A(l10 != null ? l10.intValue() : 0, qVar.h());
        }
    }

    public final nd.i1 D6() {
        return (nd.i1) this.f21988n0.getValue();
    }

    public final void D7(final te.c cVar) {
        final uo.d2 d10;
        B6().e(System.currentTimeMillis());
        this.f21967c1 = false;
        bindService(PlayerService.f22427t0.a(this), B6(), 0);
        this.f21973f1 = 0;
        V7(true);
        if (cVar.isGiftSupported()) {
            this.M0 = cVar.i();
        }
        this.f21983k1 = new ArrayList();
        L5(cVar.getCollabEnabled(), cVar.getCollabHasVacancy());
        i6().L.setVisibility(0);
        i6().f38525r0.setIndeterminate(true);
        if (!cVar.d()) {
            i6().f38511d0.setVisibility(0);
            d10 = uo.l.d(uo.r0.a(uo.g1.c().plus(this.f22001v0)), null, null, new u1(cVar, this, AnimationUtils.loadAnimation(this, hb.q1.player_follow_effect), 800L, null), 3, null);
            i6().f38511d0.setOnClickListener(new View.OnClickListener() { // from class: hb.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerActivity.E7(te.c.this, this, d10, view);
                }
            });
        }
        I8();
        K8(cVar.d());
        if (cVar.k() && I6().l()) {
            M7(30000L);
        }
        AppCompatImageView appCompatImageView = i6().f38512e0;
        jo.p.g(appCompatImageView, "binding.leftupProfileImage");
        de.f.e(appCompatImageView, cVar.f(), Integer.valueOf(hb.v1.R));
        this.Y0 = false;
        G8();
        if (cVar.getAd() != null) {
            LiveAd ad2 = cVar.getAd();
            jo.p.e(ad2);
            if (ad2.getAppBanner() != null) {
                LiveAd ad3 = cVar.getAd();
                jo.p.e(ad3);
                LiveAdAppBanner appBanner = ad3.getAppBanner();
                jo.p.e(appBanner);
                Puree.d(new AdImp(appBanner.getId(), Referer.LIVE_VIEW));
                LiveAd ad4 = cVar.getAd();
                jo.p.e(ad4);
                LiveAdAppBanner appBanner2 = ad4.getAppBanner();
                jo.p.e(appBanner2);
                if (appBanner2.getHideAfter() != null) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    Runnable runnable = new Runnable() { // from class: hb.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PlayerActivity.F7(PlayerActivity.this);
                        }
                    };
                    LiveAd ad5 = cVar.getAd();
                    jo.p.e(ad5);
                    LiveAdAppBanner appBanner3 = ad5.getAppBanner();
                    jo.p.e(appBanner3);
                    Integer hideAfter = appBanner3.getHideAfter();
                    jo.p.e(hideAfter);
                    handler.postDelayed(runnable, hideAfter.intValue() * 1000);
                }
            }
        }
        te.c f10 = z6().j1().f();
        J8(f10 != null ? f10.getLinkedLive() : null);
        this.Z0 = 0;
        J5();
        if (!o6().d5()) {
            i6().B.setVisibility(8);
            return;
        }
        i6().B.setOnClickListener(new View.OnClickListener() { // from class: hb.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.G7(PlayerActivity.this, view);
            }
        });
        if (cVar.getOwner().getSeasonRating().getIconUrl().length() > 0) {
            i6().E.setVisibility(0);
            AppCompatImageView appCompatImageView2 = i6().E;
            jo.p.g(appCompatImageView2, "binding.classIconImageView");
            td.a.v(appCompatImageView2, cVar.getOwner().getSeasonRating().getIconUrl());
            return;
        }
        i6().E.setVisibility(8);
    }

    public final void D8() {
        if (this.H0 == b.Message) {
            return;
        }
        ConstraintLayout constraintLayout = i6().f38519l0;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new h4());
        constraintLayout.startAnimation(alphaAnimation);
        ConstraintLayout constraintLayout2 = i6().B0;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(300L);
        alphaAnimation2.setAnimationListener(new i4());
        constraintLayout2.startAnimation(alphaAnimation2);
    }

    public final od.l0 E6() {
        return (od.l0) this.f21990o0.getValue();
    }

    public final void E8(String str) {
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_view.add_my_app", false, 4, null)) {
            y6().P(Referer.LiveView.SETTING, str);
        }
    }

    @Override // gf.r0
    public void F(String str) {
        String appId;
        te.c f10;
        String liveId;
        jo.p.h(str, "appUserIdLabel");
        b.a aVar = ie.b.P0;
        String string = getString(hb.b2.text_view_game_id_copy_toast_v2, new Object[]{str});
        jo.p.g(string, "getString(R.string.text_…toast_v2, appUserIdLabel)");
        aVar.a(string, null, getString(hb.b2.f34730t0)).z3(a3(), "CustomMessageDialog");
        App.AppParams f11 = z6().r0().f();
        if (f11 == null || (appId = f11.getAppId()) == null || (f10 = z6().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setTargetId(appId);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
        u62.sendLog(builder.build());
    }

    public final ef.a F6() {
        return (ef.a) this.f21992p0.getValue();
    }

    public final void F8(String str) {
        te.c f10;
        String g10;
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (!hf.v0.c(I6, a32, str + ".unfollow.liveowner", false, 4, null) || (f10 = z6().j1().f()) == null || (g10 = f10.g()) == null) {
            return;
        }
        y6().k0(g10, str);
    }

    public final kf.v G6() {
        return (kf.v) this.f21994q0.getValue();
    }

    public final void G8() {
        LiveAd ad2;
        if (g().b() != o.c.RESUMED) {
            return;
        }
        te.c f10 = z6().j1().f();
        LiveAdAppBanner appBanner = (f10 == null || (ad2 = f10.getAd()) == null) ? null : ad2.getAppBanner();
        if (!this.Y0 && appBanner != null && !f6().c(appBanner.getAppId())) {
            i6().f38518k0.setVisibility(0);
            i6().f38518k0.setAppImageUrl(appBanner.getIconUrl());
            i6().f38518k0.setTitle(appBanner.getTitle());
            i6().f38518k0.setDescription(appBanner.getDescription());
            return;
        }
        i6().f38518k0.setVisibility(8);
    }

    @Override // be.i0
    public void H0() {
        L7(CollabType.LIVE);
        Fragment e02 = a3().e0("CollabStartDialog");
        if (e02 != null) {
            a3().k().q(e02).j();
        }
    }

    public final of.k H6() {
        return (of.k) this.f21976h0.getValue();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void H7() {
        te.c f10 = z6().j1().f();
        LiveQuiz quiz = f10 != null ? f10.getQuiz() : null;
        if (quiz != null) {
            i6().N.setVisibility(8);
            i6().M.setVisibility(8);
            this.f21991o1 = new rb.d(this);
            if (this.f21977h1 == null) {
                te.c f11 = z6().j1().f();
                i6().f38527t0.setVisibility(f11 != null && f11.d() ? 8 : 0);
                this.f21977h1 = new rb.c(this, null, 0, 6, null);
                i6().f38528u0.addView(this.f21977h1);
                if (quiz.getQuestionNth() > 0) {
                    t1.a aVar = yd.t1.f61795x;
                    Context applicationContext = getApplicationContext();
                    jo.p.g(applicationContext, "applicationContext");
                    aVar.a(applicationContext, n6().k());
                }
            }
            setRequestedOrientation(1);
            return;
        }
        i6().f38527t0.setVisibility(8);
        setRequestedOrientation(-1);
    }

    public final void H8(boolean z10) {
        App.AppParams f10 = z6().r0().f();
        if (f10 == null) {
            return;
        }
        if (z10) {
            w6().b(xn.s.e(f10));
        } else {
            w6().c(f10.getAppId());
        }
        y6().o(z10);
        y6().W(f10);
    }

    @Override // gf.r0
    public void I(String str) {
        String liveId;
        jo.p.h(str, "playId");
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().m(liveId, str);
    }

    @Override // com.dena.mirrativ.player.PipStateManager.b
    public void I0(PipStateManager pipStateManager) {
        jo.p.h(pipStateManager, "pipStateManager");
        y6().d0(true);
    }

    public final void I5(PlayerGiftPagerCell playerGiftPagerCell) {
        String o10;
        jf.q gift = playerGiftPagerCell.getGift();
        if (gift == null || (o10 = gift.o()) == null) {
            return;
        }
        int[] iArr = new int[2];
        i6().u().getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        playerGiftPagerCell.getLocationOnScreen(iArr2);
        be.y1.P0.a(o10, new PointF((iArr2[0] + (playerGiftPagerCell.getWidth() / 2)) - iArr[0], (iArr2[1] + (playerGiftPagerCell.getHeight() / 2)) - iArr[1])).z3(a3(), "GiftParticleViewDialogFragment");
    }

    public final hf.v0 I6() {
        return (hf.v0) this.f21996r0.getValue();
    }

    public final void I7(String str) {
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_view.add_my_app", false, 4, null)) {
            y6().M(Referer.LiveView.SETTING, str);
        }
    }

    public final void I8() {
        i6().K.setHint(getString(hb.b2.text_post_comment));
    }

    @Override // vb.i
    public void J1() {
        this.f22003x0.c(new q1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Integer] */
    public final void J5() {
        if (!J6().U3() && !D6().a().d()) {
            i6().O.setVisibility(0);
            Object r10 = I6().r();
            GlideRequests with = GlideApp.with((androidx.fragment.app.h) this);
            if (r10.length() == 0) {
                r10 = Integer.valueOf(hb.v1.T);
            }
            with.load(r10).apply(e8.h.bitmapTransform(new xd.b(de.a.b(this, 1), getColor(hb.t1.f34978s)))).into(i6().O);
            return;
        }
        i6().O.setVisibility(8);
    }

    public final kf.x J6() {
        return (kf.x) this.f21998s0.getValue();
    }

    public final void J7() {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().Z(liveId);
    }

    public final void J8(LinkedLive linkedLive) {
        if (linkedLive == null) {
            i6().f38522o0.setVisibility(8);
            return;
        }
        String liveId = linkedLive.getLiveId();
        LinkedLive linkedLive2 = (LinkedLive) xn.a0.j0(this.f22005z0);
        if (jo.p.c(liveId, linkedLive2 != null ? linkedLive2.getLiveId() : null)) {
            i6().f38522o0.setVisibility(8);
        } else if (jo.p.c(t6().b(), linkedLive.getLiveId())) {
            i6().f38522o0.setVisibility(8);
        } else {
            i6().f38521n0.setTranslationX(of.t.b(this, -138));
            i6().f38522o0.setVisibility(0);
            i6().f38522o0.setTranslationX(0.0f);
            i6().f38522o0.setCasterImageUrl(linkedLive.getOwnerImageUrl());
            i6().f38522o0.setCasterBadgeImageUrl(linkedLive.getOwnerBadgeImageUrl());
            i6().f38522o0.setLiveTitle(linkedLive.getOwnerName());
            uo.l.d(this, null, null, new j4(null), 3, null);
        }
    }

    @Override // com.dena.mirrativ.player.PipStateManager.b
    public void K0(PipStateManager pipStateManager) {
        jo.p.h(pipStateManager, "pipStateManager");
        y6().d0(false);
        q6().p(false);
        q6().A();
        finishAndRemoveTask();
    }

    public final void K5() {
        ShooterTeamStatus shooterTeamStatus;
        ShooterMemberStateChangedBcsvrResponse f10 = z6().n1().f();
        if (f10 == null) {
            return;
        }
        ShooterMemberStatus inviteStatus = f10.getInviteStatus();
        ShooterMatchingStateChangedBcsvrResponse value = z6().p1().getValue();
        if (value == null || (shooterTeamStatus = value.getMatchingStatus()) == null) {
            shooterTeamStatus = ShooterTeamStatus.NONE;
        }
        boolean z10 = true;
        if (inviteStatus.compareTo(ShooterMemberStatus.APPROVED) <= 0 && inviteStatus.compareTo(ShooterMemberStatus.INVITING) >= 0) {
            ShooterTeamStatus shooterTeamStatus2 = ShooterTeamStatus.NONE;
            if (shooterTeamStatus.compareTo(ShooterTeamStatus.MATCHING) > 0 || shooterTeamStatus.compareTo(shooterTeamStatus2) < 0) {
                z10 = false;
            }
            if (z10) {
                E6().i(f10.getSeasonId(), f10.getTeamId(), f10.getUserId(), ShooterMemberStatus.CANCELED);
            }
        }
    }

    public final void K6(Ad.Actions actions) {
        List<String> actions2;
        if (actions == null || (actions2 = actions.getActions()) == null) {
            return;
        }
        Iterator<T> it = actions2.iterator();
        if (it.hasNext()) {
            String str = (String) it.next();
            jf.b0 a10 = H6().a(str);
            if (a10 instanceof b0.l0) {
                g9.a aVar = g9.a.f32826a;
                aVar.b("custom scheme DEFAULT unexpected url " + str, new Object[0]);
                of.n.r(this, str);
            } else {
                startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.LIVE_VIEW, a10));
            }
            Puree.d(new AdClick(actions.getId(), str, Referer.LIVE_VIEW));
            return;
        }
        Puree.d(new AdClick(actions.getId(), "", Referer.LIVE_VIEW));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a9 -> B:31:0x00ac). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K7(ao.d<? super wn.v> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.dena.mirrativ.player.PlayerActivity.v1
            if (r0 == 0) goto L13
            r0 = r12
            com.dena.mirrativ.player.PlayerActivity$v1 r0 = (com.dena.mirrativ.player.PlayerActivity.v1) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            com.dena.mirrativ.player.PlayerActivity$v1 r0 = new com.dena.mirrativ.player.PlayerActivity$v1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f22349z
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r2 = r0.f22348y
            int r4 = r0.f22347x
            java.lang.Object r5 = r0.f22346w
            com.dena.mirrativ.player.PlayerActivity r5 = (com.dena.mirrativ.player.PlayerActivity) r5
            wn.m.b(r12)
            goto Lac
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            wn.m.b(r12)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r5 = r11
            r4 = r12
        L43:
            if (r2 >= r4) goto Lae
            nf.z r12 = r5.z6()
            androidx.lifecycle.LiveData r12 = r12.j1()
            java.lang.Object r12 = r12.f()
            te.c r12 = (te.c) r12
            if (r12 != 0) goto L58
            wn.v r12 = wn.v.f59242a
            return r12
        L58:
            boolean r6 = r12.k()
            if (r6 != 0) goto L61
            wn.v r12 = wn.v.f59242a
            return r12
        L61:
            int r6 = r5.Z0
            int r6 = r6 + r3
            r5.Z0 = r6
            hb.i r6 = r5.y6()
            ud.d3$a r7 = ud.d3.f54864g
            java.lang.String r8 = r12.getLiveId()
            hf.v0 r9 = r5.I6()
            java.lang.String r9 = r9.x()
            java.lang.String r10 = r12.e()
            ud.d3 r7 = r7.a(r5, r8, r9, r10)
            r6.U(r7)
            hf.v0 r6 = r5.I6()
            boolean r6 = r6.p()
            if (r6 == 0) goto L90
            java.lang.String r6 = "twitter"
            goto L92
        L90:
            java.lang.String r6 = "share"
        L92:
            com.dena.mirrorman.clientlog.logs.Live$imp_comment_share_request r7 = new com.dena.mirrorman.clientlog.logs.Live$imp_comment_share_request
            r7.<init>(r12, r6)
            com.cookpad.puree.Puree.d(r7)
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            r0.f22346w = r5
            r0.f22347x = r4
            r0.f22348y = r2
            r0.B = r3
            java.lang.Object r12 = uo.b1.a(r6, r0)
            if (r12 != r1) goto Lac
            return r1
        Lac:
            int r2 = r2 + r3
            goto L43
        Lae:
            wn.v r12 = wn.v.f59242a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.PlayerActivity.K7(ao.d):java.lang.Object");
    }

    public final void K8(boolean z10) {
        if (z10) {
            i6().f38511d0.setVisibility(8);
            i6().f38527t0.setVisibility(8);
        }
        PlayerService c10 = B6().c();
        if (c10 != null) {
            c10.Q0(z10);
        }
    }

    @Override // gf.r0
    public void L0(String str) {
        jo.p.h(str, "userId");
        if (str.length() > 0) {
            t8(str, jo.p.c(z6().Y0(), J6().T4()));
        }
    }

    public final void L5(boolean z10, boolean z11) {
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        f10.setCollabEnabled(z10);
        f10.setCollabHasVacancy(z11);
        if (l6().F()) {
            return;
        }
        this.f22003x0.c(new d(f10));
    }

    public final void L6(MRError mRError) {
        if (mRError instanceof MRError.Failure) {
            of.n.f45411a.B(this, ((MRError.Failure) mRError).getErrorMessage(), false);
        } else if (mRError instanceof MRError.Blocked) {
            r7(mRError.getMessage());
            of.n.f45411a.B(this, ((MRError.Blocked) mRError).getErrorMessage(), false);
        } else {
            if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                of.n.f45411a.l(this, mRError);
            } else if (mRError instanceof MRError.Network) {
                of.n.z(this);
            }
        }
    }

    public final void L7(CollabType collabType) {
        te.c f10 = z6().j1().f();
        boolean z10 = false;
        if (!(f10 != null && f10.getCollabEnabled())) {
            t1.a aVar = yd.t1.f61795x;
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            String string = getString(hb.b2.text_collab_error_4);
            jo.p.g(string, "getString(R.string.text_collab_error_4)");
            aVar.a(applicationContext, string);
            return;
        }
        te.c f11 = z6().j1().f();
        if (f11 != null && f11.getCollabHasVacancy()) {
            z10 = true;
        }
        if (!z10) {
            t1.a aVar2 = yd.t1.f61795x;
            Context applicationContext2 = getApplicationContext();
            jo.p.g(applicationContext2, "applicationContext");
            String string2 = getString(hb.b2.text_collab_error_3);
            jo.p.g(string2, "getString(R.string.text_collab_error_3)");
            aVar2.a(applicationContext2, string2);
        } else if (O5()) {
            t1.a aVar3 = yd.t1.f61795x;
            Context applicationContext3 = getApplicationContext();
            jo.p.g(applicationContext3, "applicationContext");
            String string3 = getString(hb.b2.text_collab_error_2);
            jo.p.g(string3, "getString(R.string.text_collab_error_2)");
            aVar3.a(applicationContext3, string3);
        } else {
            te.c f12 = z6().j1().f();
            if (f12 == null || this.f21965b1) {
                return;
            }
            this.f21965b1 = true;
            uo.l.d(uo.r0.a(uo.g1.c().plus(this.f22001v0)), null, null, new w1(collabType, f12, null), 3, null);
        }
    }

    @Override // qb.s
    public void M0(int i10) {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().H(liveId, Referer.LIVE_VIEW, i10);
    }

    @Override // lb.l
    public void M1() {
        N7();
    }

    public final void M5(String str, String str2) {
        boolean z10;
        LinkedLive linkedLive;
        dq.c.c().l(new nd.n());
        this.f21971e1 = true;
        z8();
        PlayerService c10 = B6().c();
        if (c10 != null) {
            c10.z0();
        }
        te.c f10 = z6().j1().f();
        if (jo.p.c((f10 == null || (linkedLive = f10.getLinkedLive()) == null) ? null : linkedLive.getLiveId(), str2)) {
            z10 = false;
            y6().Q(str, 9, (r25 & 4) != 0 ? null : null, (r25 & 8) != 0 ? null : str2, (r25 & 16) != 0 ? null : null, false, (r25 & 64) != 0 ? null : null, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0 ? null : null, (r25 & 512) != 0 ? null : null);
            PlayerService c11 = B6().c();
            if (c11 != null) {
                c11.I0(false);
            }
        } else {
            z10 = false;
        }
        if (!jo.p.c(str, this.X0) && !jo.p.c(str, this.F0)) {
            this.f22005z0.clear();
            i6().f38521n0.setVisibility(8);
            i6().f38522o0.setVisibility(8);
        }
        if (!jo.p.c(str, str2)) {
            y6().S(str);
        }
        boolean z11 = z10;
        y6().i0(str2, z11);
        y6().G(str2);
        y6().B(str2);
        b6();
        this.f21971e1 = z11;
    }

    public final void M7(long j10) {
        uo.d2 d10;
        uo.d2 d2Var = this.f21995q1;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(this, null, null, new x1(j10, this, null), 3, null);
        this.f21995q1 = d10;
    }

    public final boolean N5(Context context, String[] strArr) {
        ArrayList<String> a10 = of.q.f45417a.a(context, strArr);
        this.f21981j1 = a10;
        if (a10.size() == 0) {
            return true;
        }
        if (U6(strArr)) {
            z7();
        } else if (this.f21981j1.size() > 0) {
            Object[] array = this.f21981j1.toArray(new String[0]);
            jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            b3.a.q(this, (String[]) array, 202);
        }
        return false;
    }

    public final void N6(String str) {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null || z6().q0().f() == null) {
            return;
        }
        hb.f1 a10 = hb.f1.W0.a(str, liveId, Referer.LIVE_VIEW);
        a10.S3(this.M0);
        this.G0 = a10;
        i6().L.setVisibility(4);
    }

    public final void N7() {
        lb.h hVar = this.L0;
        if (hVar != null) {
            hVar.S3();
        }
        for (jf.q qVar : this.f21983k1) {
            R7(this, qVar, false, null, 4, null);
        }
        this.f21983k1 = new ArrayList();
    }

    public final boolean O5() {
        if (System.currentTimeMillis() - this.S0 >= 30000) {
            this.A0 = false;
            this.C0 = 0L;
            this.S0 = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() - this.S0 < 30000 && this.C0 == 2) {
            this.A0 = true;
            this.S0 = System.currentTimeMillis();
        }
        return this.A0;
    }

    public final void O6(List<RankingUser> list) {
        if (this.f21993p1 == null) {
            this.f21993p1 = new hb.e2(this, new g());
            i6().f38529v0.setAdapter(this.f21993p1);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
            linearLayoutManager.M2(true);
            i6().f38529v0.setLayoutManager(linearLayoutManager);
        }
        i6().f38529v0.getLayoutParams().width = getResources().getDimensionPixelOffset(hb.u1.f34981d) * Math.min(list != null ? list.size() : 0, 3);
        hb.e2 e2Var = this.f21993p1;
        if (e2Var != null) {
            e2Var.f(list);
        }
    }

    public final void O7(jf.q qVar, View view) {
        jf.f f10;
        if (i6().f38525r0.getVisibility() == 0) {
            return;
        }
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_view.send_gift", false, 4, null) && (f10 = z6().h0().f()) != null) {
            int e10 = qVar.e() * qVar.p();
            if (!f10.f(qVar.s(), qVar.e())) {
                p8(qVar.s());
                return;
            }
            ve.d q10 = qVar.q();
            ve.d dVar = ve.d.EMOMO_RUN_SCORE;
            if (q10 == dVar) {
                Integer f11 = z6().x0().f();
                if (f11 == null) {
                    f11 = 0;
                }
                if (f11.intValue() < e10) {
                    of.n.f45411a.B(this, getString(hb.b2.f34718e0), false);
                    return;
                }
            }
            R7(this, qVar, false, null, 4, null);
            if (view != null) {
                int[] iArr = new int[2];
                i6().u().getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                be.y1.P0.a(qVar.o(), new PointF((iArr2[0] + (view.getWidth() / 2)) - iArr[0], (iArr2[1] + (view.getHeight() / 2)) - iArr[1])).z3(a3(), "GiftParticleViewDialogFragment");
            }
            y6().l0(f10.a(this.f21983k1));
            if (qVar.q() == dVar) {
                hb.i y62 = y6();
                Integer f12 = z6().x0().f();
                if (f12 == null) {
                    f12 = 0;
                }
                y62.m0(f12.intValue() - e10);
            }
        }
    }

    public final void P5() {
        rb.c cVar = this.f21977h1;
        if (cVar != null) {
            jo.p.e(cVar);
            if (!cVar.i(new DialogInterface.OnClickListener() { // from class: hb.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    PlayerActivity.Q5(PlayerActivity.this, dialogInterface, i10);
                }
            })) {
                return;
            }
        }
        if (l6().F()) {
            f.a aVar = ie.f.V0;
            String string = getString(hb.b2.text_collab_close_confirm);
            jo.p.g(string, "getString(R.string.text_collab_close_confirm)");
            f.a.b(aVar, string, getString(hb.b2.U), getString(hb.b2.f34724p), null, false, 24, null).z3(a3(), "DIALOG_TAG_CLOSE_LIVE_WITH_COLLAB");
            return;
        }
        U5();
    }

    public final void P6(List<? extends ud.r2> list) {
        if (list.isEmpty()) {
            return;
        }
        ud.r2 r2Var = (ud.r2) xn.a0.X(list);
        if (r2Var instanceof ud.z2) {
            ud.z2 z2Var = (ud.z2) r2Var;
            i6().f38516i0.A(z2Var.k(), z2Var.g());
        } else {
            OneLineCommentView oneLineCommentView = i6().f38516i0;
            String c10 = r2Var.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) r2Var.a());
            wn.v vVar = wn.v.f59242a;
            oneLineCommentView.A(c10, spannableStringBuilder);
        }
        if (i6().f38517j0.getVisibility() != 0 || r2Var.d() == 35) {
            return;
        }
        PictureInPictureCommentView pictureInPictureCommentView = i6().f38517j0;
        String c11 = r2Var.c();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) r2Var.a());
        wn.v vVar2 = wn.v.f59242a;
        pictureInPictureCommentView.A(c11, spannableStringBuilder2);
    }

    public final void P7(EventBannerActionType eventBannerActionType, nd.c cVar, String str, String str2, EventBannerWhere eventBannerWhere) {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        Puree.d(new EventBannerLog(eventBannerActionType, cVar.e(), str, eventBannerWhere, liveId, null, 32, null));
        dq.c.c().l(new k.b(cVar, str, str2, eventBannerWhere));
    }

    public final void Q6() {
        String anniversaryBotComment;
        te.c f10 = z6().j1().f();
        if (f10 == null || (anniversaryBotComment = f10.getAnniversaryBotComment()) == null) {
            return;
        }
        if (!(anniversaryBotComment.length() > 0) || this.O0) {
            return;
        }
        this.O0 = true;
        y6().U(ud.u2.f55565g.a(this, f10.getLiveId(), anniversaryBotComment));
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MEMORIAL_COMMENT);
        builder.setTargetType("memorial");
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f10.getLiveId()), wn.q.a("text", anniversaryBotComment)));
        u62.sendLog(builder.build());
    }

    public final void Q7(jf.q qVar, boolean z10, String str) {
        te.c f10;
        String liveId;
        if (!qVar.u() || (f10 = z6().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        int p10 = qVar.p();
        qVar.a();
        uo.l.d(uo.r0.a(uo.g1.c().plus(this.f22001v0)), null, null, new y1(qVar, p10, liveId, str, z10, null), 3, null);
    }

    @Override // lb.l
    public void R0(PlayerGiftPagerCell playerGiftPagerCell, jf.q qVar) {
        jf.q gift;
        Object obj;
        Object obj2;
        jo.p.h(playerGiftPagerCell, "cell");
        jo.p.h(qVar, "gift");
        if (i6().f38525r0.getVisibility() == 0) {
            return;
        }
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_view.send_gift", false, 4, null) && (gift = playerGiftPagerCell.getGift()) != null) {
            String j10 = gift.j();
            if (!(j10 == null || j10.length() == 0)) {
                b.a aVar = ie.b.P0;
                String j11 = gift.j();
                if (j11 == null) {
                    j11 = "";
                }
                b.a.b(aVar, j11, null, getString(hb.b2.f34730t0), 2, null).z3(a3(), "DIALOG_TAG_LOCKED_GIFT");
                return;
            }
            jf.f f10 = z6().h0().f();
            if (f10 == null) {
                return;
            }
            if (!f10.f(gift.s(), gift.e())) {
                p8(gift.s());
                return;
            }
            int i10 = c.f22038a[gift.q().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (gift.n()) {
                    gift.r();
                    y6().y(gift);
                    I5(playerGiftPagerCell);
                    R7(this, gift, true, null, 4, null);
                    return;
                }
                Iterator<T> it = this.f21983k1.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jo.p.c(((jf.q) obj2).h(), gift.h())) {
                        break;
                    }
                }
                if (obj2 == null) {
                    gift.r();
                    this.f21983k1.add(gift);
                } else {
                    Iterator<T> it2 = this.f21983k1.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (jo.p.c(((jf.q) next).h(), gift.h())) {
                            obj = next;
                            break;
                        }
                    }
                    jf.q qVar2 = (jf.q) obj;
                    if (qVar2 != null) {
                        qVar2.r();
                    }
                }
                playerGiftPagerCell.z();
                I5(playerGiftPagerCell);
            } else {
                s8(playerGiftPagerCell, gift);
            }
            jf.f f11 = r6().k().f();
            if (f11 != null) {
                y6().l0(f11.a(this.f21983k1));
            }
        }
    }

    public final void R5() {
        T5("DIALOG_TAG_CLOSE_COLLAB");
    }

    public final int R6() {
        Object systemService = getApplicationContext().getSystemService("audio");
        jo.p.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((AudioManager) systemService).getStreamVolume(3) > 0 ? 0 : 1;
    }

    @Override // mb.d
    public void S1(String str, int i10, int i11) {
        String liveId;
        jo.p.h(str, "giftId");
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().c0(liveId, str, i10, i11);
    }

    public final void S5() {
        be.e0 e0Var = this.D0;
        if (e0Var != null) {
            e0Var.n3();
            this.D0 = null;
            this.f21965b1 = false;
        }
    }

    public final void S6() {
        if (this.f21973f1 < 1) {
            if (I6().l()) {
                PlayerService c10 = B6().c();
                boolean z10 = false;
                if (c10 != null && !c10.w0()) {
                    z10 = true;
                }
                if (z10) {
                    C7();
                }
            }
            dq.c.c().l(new nd.z());
        }
        this.f21973f1++;
    }

    public final void S7(ud.v1 v1Var, PointF pointF) {
        jf.f f10;
        String liveId;
        if (i6().f38525r0.getVisibility() == 0) {
            return;
        }
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_view.send_gift", false, 4, null) && (f10 = z6().h0().f()) != null) {
            if (!f10.f(false, v1Var.a())) {
                p8(false);
                return;
            }
            int[] iArr = new int[2];
            i6().u().getLocationOnScreen(iArr);
            PointF pointF2 = new PointF((pointF.x + (de.a.b(this, 42) / 2)) - iArr[0], (pointF.y + (de.a.b(this, 28) / 2)) - iArr[1]);
            te.c f11 = z6().j1().f();
            if (f11 == null || (liveId = f11.getLiveId()) == null) {
                return;
            }
            be.y1.P0.a(v1Var.c(), pointF2).z3(a3(), "GiftParticleViewDialogFragment");
            uo.l.d(uo.r0.a(uo.g1.c().plus(this.f22001v0)), null, null, new z1(v1Var, liveId, null), 3, null);
        }
    }

    @Override // be.b2
    public void T0() {
        String liveId;
        te.c f10;
        UserProfile owner;
        String userId;
        te.c f11;
        UserProfile owner2;
        String name;
        te.c f12 = z6().j1().f();
        if (f12 == null || (liveId = f12.getLiveId()) == null || (f10 = z6().j1().f()) == null || (owner = f10.getOwner()) == null || (userId = owner.getUserId()) == null || (f11 = z6().j1().f()) == null || (owner2 = f11.getOwner()) == null || (name = owner2.getName()) == null || jo.p.c(z6().I1().f(), Boolean.TRUE)) {
            return;
        }
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        if (N5(applicationContext, f21960w1)) {
            y6().a(Referer.LIVE_VIEW, liveId, userId, name, CollabType.CALL);
            Fragment e02 = a3().e0("InvitedCollabCallDialogFragment");
            if (e02 != null) {
                a3().k().q(e02).j();
            }
        }
    }

    public final void T5(String str) {
        Fragment e02 = a3().e0(str);
        if (e02 != null) {
            a3().k().q(e02).j();
        }
    }

    public final void T6() {
        this.f22004y0.a(c.a.e(s6(), this, null, true, false, 10, null));
    }

    public final void T7(kb.d dVar) {
        jo.p.h(dVar, "<set-?>");
        this.O = dVar;
    }

    public final void U5() {
        if (Y5(this, false, 1, null)) {
            K5();
            of.j.f45405a.b(this);
            return;
        }
        K5();
        of.j.f45405a.b(this);
        finish();
    }

    public final boolean U6(String[] strArr) {
        if (C6().Z1() >= 2 || this.f21981j1.size() < f21960w1.length) {
            for (String str : strArr) {
                if (!b3.a.s(this, str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void U7() {
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        boolean isGiftSupported = f10.isGiftSupported();
        this.f21963a1 = isGiftSupported;
        if (isGiftSupported) {
            i6().V.setVisibility(0);
            i6().X.setVisibility(0);
            if (f10.getRemainingFreeCoins() > 0 || f10.getRemainingPaidCoins() > 0) {
                i6().V.r();
            }
            List<jf.q> f11 = z6().w0().f();
            if (f11 == null || f11.isEmpty()) {
                y6().Y();
            }
            if (!f10.h().isEmpty()) {
                O6(f10.h());
                i6().f38529v0.x1(0);
                return;
            }
            return;
        }
        i6().V.setVisibility(8);
        i6().X.setVisibility(8);
        Z5();
    }

    @Override // be.b2
    public void V0() {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        k6().d(liveId, jf.k.HANDLE_COLLAB_CANCEL);
    }

    public final void V5() {
        Fragment e02 = a3().e0("LiveInfoBottomSheetDialog");
        qb.q qVar = e02 instanceof qb.q ? (qb.q) e02 : null;
        if (qVar != null) {
            qVar.n3();
        }
    }

    public final void V6(String str) {
        z6().j1().i(this, new androidx.lifecycle.f0() { // from class: hb.s
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.W6(PlayerActivity.this, (te.c) obj);
            }
        });
        z6().J1().i(this, new androidx.lifecycle.f0() { // from class: hb.b0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.X6(PlayerActivity.this, (Boolean) obj);
            }
        });
        z6().z0().i(this, new androidx.lifecycle.f0() { // from class: hb.q
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.Y6(PlayerActivity.this, (MRError) obj);
            }
        });
        z6().S0().i(this, new androidx.lifecycle.f0() { // from class: hb.t
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.Z6(PlayerActivity.this, (te.c) obj);
            }
        });
        z6().K1().i(this, new androidx.lifecycle.f0() { // from class: hb.a0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.a7(PlayerActivity.this, (Boolean) obj);
            }
        });
        z6().r0().i(this, new androidx.lifecycle.f0() { // from class: hb.w
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.b7(PlayerActivity.this, (App.AppParams) obj);
            }
        });
        z6().D1().i(this, new androidx.lifecycle.f0() { // from class: hb.x
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.c7(PlayerActivity.this, (AppUserDetailResponse) obj);
            }
        });
        r6().k().i(this, new androidx.lifecycle.f0() { // from class: hb.v
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.d7(PlayerActivity.this, (jf.f) obj);
            }
        });
        z6().L1().i(this, new androidx.lifecycle.f0() { // from class: hb.c0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.e7(PlayerActivity.this, (Boolean) obj);
            }
        });
        z6().L0().i(this, new androidx.lifecycle.f0() { // from class: hb.h0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.f7(PlayerActivity.this, (wn.k) obj);
            }
        });
        z6().m0().i(this, new androidx.lifecycle.f0() { // from class: hb.i0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.g7(PlayerActivity.this, (wn.k) obj);
            }
        });
        z6().P0().i(this, new androidx.lifecycle.f0() { // from class: hb.g0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.h7(PlayerActivity.this, (List) obj);
            }
        });
        List k10 = xn.s.k();
        LiveData<Boolean> H1 = z6().H1();
        LiveData<Boolean> G1 = z6().G1();
        LiveData<List<jf.q>> w02 = z6().w0();
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        c0Var.p(k10);
        for (LiveData liveData : xn.s.m(H1, G1, w02)) {
            c0Var.q(liveData, new h(c0Var, H1, G1, w02));
        }
        LiveData a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        a10.i(this, new androidx.lifecycle.f0() { // from class: hb.d0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.i7(PlayerActivity.this, (List) obj);
            }
        });
        LiveData a11 = androidx.lifecycle.p0.a(z6().l0());
        jo.p.g(a11, "distinctUntilChanged(this)");
        a11.i(this, new androidx.lifecycle.f0() { // from class: hb.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.j7(PlayerActivity.this, (CollabInvitation) obj);
            }
        });
        LiveData a12 = androidx.lifecycle.p0.a(z6().n1());
        jo.p.g(a12, "distinctUntilChanged(this)");
        a12.i(this, new androidx.lifecycle.f0() { // from class: hb.z
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.k7(PlayerActivity.this, (ShooterMemberStateChangedBcsvrResponse) obj);
            }
        });
        z6().O0().i(this, new androidx.lifecycle.f0() { // from class: hb.e0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.l7(PlayerActivity.this, (List) obj);
            }
        });
        z6().T0().i(this, new androidx.lifecycle.f0() { // from class: hb.r
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PlayerActivity.m7(PlayerActivity.this, (ud.w1) obj);
            }
        });
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
        uo.l.d(this, null, null, new y(null), 3, null);
        uo.l.d(this, null, null, new z(null), 3, null);
        uo.l.d(this, null, null, new a0(null), 3, null);
        uo.l.d(this, null, null, new b0(null), 3, null);
        uo.l.d(this, null, null, new c0(null), 3, null);
        uo.l.d(this, null, null, new d0(null), 3, null);
        uo.l.d(this, null, null, new e0(null), 3, null);
        uo.l.d(this, null, null, new g0(null), 3, null);
        uo.l.d(this, null, null, new h0(null), 3, null);
        uo.l.d(this, null, null, new i0(null), 3, null);
        uo.l.d(this, null, null, new j0(null), 3, null);
        uo.l.d(this, null, null, new k0(null), 3, null);
        uo.l.d(this, null, null, new l0(null), 3, null);
        uo.l.d(this, null, null, new m0(null), 3, null);
        uo.l.d(this, null, null, new n0(null), 3, null);
        uo.l.d(this, null, null, new o0(null), 3, null);
        uo.l.d(this, null, null, new p0(null), 3, null);
        uo.l.d(this, null, null, new q0(null), 3, null);
        uo.l.d(this, null, null, new r0(null), 3, null);
        uo.l.d(this, null, null, new s0(null), 3, null);
        uo.l.d(this, null, null, new t0(null), 3, null);
        uo.l.d(this, null, null, new u0(null), 3, null);
        uo.l.d(this, null, null, new v0(null), 3, null);
        uo.l.d(this, null, null, new w0(null), 3, null);
        uo.l.d(this, null, null, new x0(null), 3, null);
        uo.l.d(this, null, null, new y0(null), 3, null);
        uo.l.d(this, null, null, new z0(null), 3, null);
        uo.l.d(this, null, null, new a1(null), 3, null);
        uo.l.d(this, null, null, new b1(null), 3, null);
        uo.l.d(this, null, null, new c1(null), 3, null);
        uo.l.d(this, null, null, new d1(null), 3, null);
        uo.l.d(this, null, null, new e1(null), 3, null);
        uo.l.d(this, null, null, new f1(null), 3, null);
        uo.l.d(this, null, null, new g1(null), 3, null);
        uo.l.d(this, null, null, new h1(str, null), 3, null);
        uo.l.d(this, null, null, new i1(str, null), 3, null);
        uo.l.d(this, null, null, new j1(null), 3, null);
        uo.l.d(this, null, null, new k1(null), 3, null);
        uo.l.d(this, null, null, new l1(null), 3, null);
    }

    public final void V7(boolean z10) {
        this.f22000u0 = z10;
        B6().d(z10);
    }

    @Override // lb.l
    public void W(ud.y0 y0Var) {
        jo.p.h(y0Var, MRLog.TARGET_TYPE_BANNER);
        n7(nd.c.Companion.a(y0Var.a()), y0Var.g(), y0Var.h(), EventBannerWhere.VIEW_GIFT_PANEL);
    }

    @Override // qb.s
    public void W1() {
        String appId;
        App.AppParams f10 = z6().r0().f();
        if (f10 == null || (appId = f10.getAppId()) == null) {
            return;
        }
        boolean d10 = f6().d(appId);
        if (d10) {
            E8(appId);
        } else {
            I7(appId);
        }
        y6().o(d10);
    }

    public final void W5() {
        String liveId;
        String e10;
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, "live_viewlive_view", false, 4, null)) {
            if (l6().F()) {
                f.a aVar = ie.f.V0;
                String string = getString(hb.b2.text_collab_end_confirmation);
                jo.p.g(string, "getString(R.string.text_collab_end_confirmation)");
                f.a.b(aVar, string, getString(hb.b2.U), getString(hb.b2.f34724p), null, false, 24, null).z3(a3(), "DIALOG_TAG_CLOSE_COLLAB");
                return;
            }
            te.c f10 = z6().j1().f();
            if (f10 == null) {
                return;
            }
            if (!f10.isStreamingCollabEnabled() && D6().a().d()) {
                te.c f11 = z6().j1().f();
                if (f11 == null || (e10 = f11.e()) == null) {
                    return;
                }
                t1.a aVar2 = yd.t1.f61795x;
                Context applicationContext = getApplicationContext();
                jo.p.g(applicationContext, "applicationContext");
                String string2 = getString(hb.b2.text_cant_collab_because_of_no_uesr_flag, new Object[]{e10});
                jo.p.g(string2, "getString(R.string.text_…ause_of_no_uesr_flag, it)");
                aVar2.a(applicationContext, string2);
            } else if (f10.isConnectedStreamingCollab()) {
                t1.a aVar3 = yd.t1.f61795x;
                Context applicationContext2 = getApplicationContext();
                jo.p.g(applicationContext2, "applicationContext");
                String string3 = getString(hb.b2.text_collab_error_8);
                jo.p.g(string3, "getString(R.string.text_collab_error_8)");
                aVar3.a(applicationContext2, string3);
            } else if (!f10.getCollabEnabled()) {
                t1.a aVar4 = yd.t1.f61795x;
                Context applicationContext3 = getApplicationContext();
                jo.p.g(applicationContext3, "applicationContext");
                String string4 = getString(hb.b2.text_collab_error_4);
                jo.p.g(string4, "getString(R.string.text_collab_error_4)");
                aVar4.a(applicationContext3, string4);
            } else if (f10.getCollabEnabled() && !f10.getCollabHasVacancy()) {
                t1.a aVar5 = yd.t1.f61795x;
                Context applicationContext4 = getApplicationContext();
                jo.p.g(applicationContext4, "applicationContext");
                String string5 = getString(hb.b2.text_collab_error_3);
                jo.p.g(string5, "getString(R.string.text_collab_error_3)");
                aVar5.a(applicationContext4, string5);
            } else if (!j6().K0() && !l6().s().h()) {
                be.h0.P0.a(f10.isStreamingCollabEnabled()).z3(a3(), "CollabStartDialog");
                te.c f12 = z6().j1().f();
                if (f12 == null || (liveId = f12.getLiveId()) == null) {
                    return;
                }
                MRLogger u62 = u6();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_COLLAB_REQUEST_IMP);
                builder.setTargetId(J6().T4());
                wn.k[] kVarArr = new wn.k[3];
                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId);
                kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, f10.getOwner().getUserId());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_streaming_collab_enabled", f10.isStreamingCollabEnabled() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
                wn.v vVar = wn.v.f59242a;
                kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
                builder.setPayload(xn.s.m(kVarArr));
                u62.sendLog(builder.build());
            } else {
                b.a aVar6 = ie.b.P0;
                String string6 = getString(hb.b2.text_collab_error_already_collaborating);
                jo.p.g(string6, "getString(R.string.text_…or_already_collaborating)");
                aVar6.a(string6, null, getString(hb.b2.f34730t0)).z3(a3(), "CustomMessageDialog");
            }
        }
    }

    public final void W7(boolean z10, boolean z11, oe.a aVar, String str, boolean z12) {
        Intent intent = new Intent("actiontype_dialog_afterplay");
        intent.putExtra("EXTRA_LIVE_REQUEST", aVar);
        te.c f10 = z6().j1().f();
        if (f10 != null) {
            intent.putExtra("EXTRA_STREAMER_USER_ID", f10.getOwner().getUserId());
            intent.putExtra("EXTRA_STREAMER_USER_NAME", f10.getOwner().getName());
        }
        intent.putExtra("EXTRA_SHOULD_SHOW_LIVE_REQUEST", z10);
        intent.putExtra("EXTRA_PARAM_FOLLOWED_BROAD_CASTER_THIS_LIVE", z11);
        intent.putExtra("EXTRA_LIVE_ID", str);
        intent.putExtra("EXTRA_SHOULD_SHOW_SATISFACTION", g6().e(B6().b()));
        intent.putExtra("EXTRA_IS_AFTER_TUTORIAL", z12);
        setResult(-1, intent);
    }

    @Override // be.f0
    public void X0() {
        jf.h q10 = l6().q();
        if (q10 == null) {
            return;
        }
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_COLLAB_START_BROADCAST_BUTTON_TAP);
        builder.setTargetId(J6().T4());
        builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, q10.g()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, q10.i())));
        u62.sendLog(builder.build());
        S5();
        finish();
        startActivity(s6().v(this, null, q10.a()));
    }

    public final boolean X5(boolean z10) {
        if (x6().d()) {
            if (z10 || !(g().b() != o.c.RESUMED || jo.p.c(r6().H().f(), Boolean.TRUE) || z6().j1().f() == null || i6().f38524q0.getVisibility() == 0 || i6().f38525r0.getVisibility() == 0 || i6().f38530w0.getVisibility() == 0)) {
                q6().p(true);
                g().a(x6().c());
                try {
                    return enterPictureInPictureMode(i6().A0.a(f21959v1));
                } catch (Exception e10) {
                    g9.a.c(e10);
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X7(List<jf.q> list) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = list instanceof Collection;
        boolean z14 = true;
        if (!z13 || !list.isEmpty()) {
            for (jf.q qVar : list) {
                if (qVar.q().l()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (!z13 || !list.isEmpty()) {
            for (jf.q qVar2 : list) {
                if (qVar2.q().h()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        List<EventBannerResponse> f02 = z6().f0();
        EventBannerResponse eventBannerResponse = null;
        if (f02 != null) {
            Iterator<T> it = f02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer eventType = ((EventBannerResponse) next).getEventType();
                if (eventType != null && eventType.intValue() == 5) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    eventBannerResponse = next;
                    break;
                }
            }
            eventBannerResponse = eventBannerResponse;
        }
        EventBannerResponse eventBannerResponse2 = eventBannerResponse;
        String f10 = z6().v0().f();
        i6().P.y(list, (z10 && eventBannerResponse2 != null && G6().Q()) ? false : false, new b2(z10, eventBannerResponse2, this, z11, f10), new c2());
    }

    public final void Y7() {
        AppCompatImageView appCompatImageView = i6().X;
        jo.p.g(appCompatImageView, "binding.giftRankingImageView");
        yd.g1.a(appCompatImageView, new l2());
        if (x6().d()) {
            i6().F.setVisibility(8);
            i6().Q.setOnClickListener(new View.OnClickListener() { // from class: hb.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerActivity.g8(PlayerActivity.this, view);
                }
            });
        } else {
            i6().Q.setVisibility(4);
            i6().F.setOnClickListener(new View.OnClickListener() { // from class: hb.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerActivity.h8(PlayerActivity.this, view);
                }
            });
        }
        i6().f38530w0.setOnClickListener(new View.OnClickListener() { // from class: hb.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.i8(PlayerActivity.this, view);
            }
        });
        AppCompatImageView appCompatImageView2 = i6().H;
        jo.p.g(appCompatImageView2, "binding.collaborateImageView");
        yd.g1.a(appCompatImageView2, new p2());
        i6().K.setTextFieldOnClickListener(new q2());
        i6().K.b(new r2());
        i6().f38531x0.setOnClickListener(new View.OnClickListener() { // from class: hb.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.Z7(PlayerActivity.this, view);
            }
        });
        i6().O.setOnClickListener(new View.OnClickListener() { // from class: hb.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.a8(PlayerActivity.this, view);
            }
        });
        i6().f38511d0.setOnClickListener(new View.OnClickListener() { // from class: hb.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.b8(PlayerActivity.this, view);
            }
        });
        i6().f38518k0.setDownloadButtonClickListener(new d2());
        i6().f38518k0.setCloseButtonClickListener(new e2());
        jo.e0 e0Var = new jo.e0();
        jo.e0 e0Var2 = new jo.e0();
        i6().f38522o0.setTextContainerClickListener(new f2(e0Var, e0Var2));
        i6().f38522o0.setCloseButtonClickListener(new g2());
        i6().f38522o0.setCasterImageClickListener(new h2(e0Var));
        i6().f38521n0.setTextContainerClickListener(new i2(e0Var, e0Var2));
        i6().f38521n0.setCloseButtonClickListener(new j2());
        i6().f38521n0.setCasterImageClickListener(new k2(e0Var2));
        i6().f38527t0.setOnClickListener(new View.OnClickListener() { // from class: hb.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.c8(PlayerActivity.this, view);
            }
        });
        i6().V.setOnClickListener(new View.OnClickListener() { // from class: hb.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.d8(PlayerActivity.this, view);
            }
        });
        i6().u().setOnTouchListener(new View.OnTouchListener() { // from class: hb.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean e82;
                e82 = PlayerActivity.e8(PlayerActivity.this, view, motionEvent);
                return e82;
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: hb.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity.f8(PlayerActivity.this, view);
            }
        };
        i6().Z.setOnClickListener(onClickListener);
        i6().f38508a0.setOnClickListener(onClickListener);
        ConstraintLayout constraintLayout = i6().T;
        jo.p.g(constraintLayout, "binding.giftAppealContainer");
        yd.g1.a(constraintLayout, new m2());
        AppCompatImageView appCompatImageView3 = i6().S;
        jo.p.g(appCompatImageView3, "binding.giftAppealCloseImageView");
        yd.g1.a(appCompatImageView3, new n2());
        AppCompatImageView appCompatImageView4 = i6().E;
        jo.p.g(appCompatImageView4, "binding.classIconImageView");
        yd.g1.a(appCompatImageView4, new o2());
    }

    public final void Z5() {
        String liveId;
        if (v6()) {
            Fragment e02 = a3().e0("GiftPanelBottomSheetDialogFragment");
            lb.h hVar = e02 instanceof lb.h ? (lb.h) e02 : null;
            if (hVar != null) {
                hVar.n3();
            }
            Fragment e03 = a3().e0("EmomoQuestGiftGachaTicketDialogFragment");
            mb.c cVar = e03 instanceof mb.c ? (mb.c) e03 : null;
            if (cVar != null) {
                cVar.n3();
            }
            this.L0 = null;
            te.c f10 = z6().j1().f();
            if (f10 == null || (liveId = f10.getLiveId()) == null) {
                return;
            }
            Puree.d(new Live.ImpGiftPanel(liveId, false));
        }
    }

    @Override // be.f4
    public void a2() {
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    public final void a6() {
        this.f21969d1 = false;
        o8();
        i6().f38514g0.z();
    }

    @Override // ie.f.b
    public void b(String str) {
        AppUserDetailResponse f10;
        String appId;
        te.c f11;
        String liveId;
        jo.p.h(str, "tag");
        int hashCode = str.hashCode();
        if (hashCode == -1289142512) {
            if (str.equals("DIALOG_TAG_CLOSE_COLLAB")) {
                t1.a aVar = yd.t1.f61795x;
                Context applicationContext = getApplicationContext();
                jo.p.g(applicationContext, "applicationContext");
                String string = getString(hb.b2.V);
                jo.p.g(string, "getString(R.string.text_ended)");
                aVar.a(applicationContext, string);
                y7();
                k6().p(jf.k.PLAYER_COLLAB_CANCEL_FROM_DIALOG);
            }
        } else if (hashCode == 114468374) {
            if (str.equals("DIALOG_TAG_CLOSE_LIVE_WITH_COLLAB")) {
                U5();
            }
        } else if (hashCode == 257818906 && str.equals("open_comment_url") && (f10 = z6().D1().f()) != null) {
            of.n.r(getApplicationContext(), f10.getUrl());
            App.AppParams f12 = z6().r0().f();
            if (f12 == null || (appId = f12.getAppId()) == null || (f11 = z6().j1().f()) == null || (liveId = f11.getLiveId()) == null) {
                return;
            }
            MRLogger u62 = u6();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
            builder.setTargetType("url");
            builder.setTargetId(appId);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
            u62.sendLog(builder.build());
        }
    }

    public final void b6() {
        sd.b bVar = this.f21989n1;
        if (bVar != null) {
            bVar.n3();
        }
        this.f21989n1 = null;
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    @Override // hb.f1.b
    public void c2(String str) {
        jo.p.h(str, "comment");
        B7(this, str, false, 2, null);
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COMMENT_SEND_BUTTON_TAP);
        builder.setTargetId(str);
        builder.setPageId(Referer.LIVE_VIEW);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f10.getLiveId())));
        u62.sendLog(builder.build());
    }

    public final void c6() {
        rb.c cVar = this.f21977h1;
        if (cVar != null) {
            jo.p.e(cVar);
            cVar.q();
            i6().f38528u0.removeAllViews();
            this.f21977h1 = null;
        }
        if (this.f21975g1 != null) {
            i6().f38526s0.removeAllViews();
            this.f21975g1 = null;
        }
    }

    @Override // qb.s
    public void d0() {
    }

    public final void d6() {
        y6().r0(null);
        int i10 = hb.q1.activity_close_swipedown;
        overridePendingTransition(i10, i10);
        uo.d2 d2Var = this.R0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        V5();
        A8(false);
        boolean z10 = !(this.f21967c1 || B6().b() <= ((long) f21958u1) || l6().E()) || z6().t1();
        te.c f10 = z6().j1().f();
        if (f10 != null) {
            boolean z11 = this.K0;
            String liveId = f10.getLiveId();
            String userId = f10.getOwner().getUserId();
            boolean t12 = z6().t1();
            long m12 = z6().m1();
            String str = this.X0;
            String str2 = str == null ? "" : str;
            b.a aVar = oe.b.J;
            UserProfile owner = f10.getOwner();
            Boolean f11 = z6().g1().f();
            if (f11 == null) {
                f11 = Boolean.FALSE;
            }
            jo.p.g(f11, "playerStore.ownerIsFollowing.value ?: false");
            W7(z10, z11, new oe.a(liveId, userId, t12, false, m12, str2, aVar.a(owner, f11.booleanValue())), f10.getLiveId(), this.N0);
        }
        q6().A();
        if (this.W0) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(67108864);
            te.c f12 = z6().j1().f();
            if (f12 != null && z10) {
                intent.setAction("actiontype_dialog_afterplay");
                String liveId2 = f12.getLiveId();
                String userId2 = f12.getOwner().getUserId();
                boolean t13 = z6().t1();
                long m13 = z6().m1();
                String str3 = this.X0;
                String str4 = str3 == null ? "" : str3;
                b.a aVar2 = oe.b.J;
                UserProfile owner2 = f12.getOwner();
                Boolean f13 = z6().g1().f();
                if (f13 == null) {
                    f13 = Boolean.FALSE;
                }
                jo.p.g(f13, "playerStore.ownerIsFollowing.value ?: false");
                intent.putExtra("EXTRA_LIVE_REQUEST", new oe.a(liveId2, userId2, t13, false, m13, str4, aVar2.a(owner2, f13.booleanValue())));
                intent.putExtra("EXTRA_STREAMER_USER_ID", f12.getOwner().getUserId());
                intent.putExtra("EXTRA_STREAMER_USER_NAME", f12.getOwner().getName());
                intent.putExtra("EXTRA_SHOULD_SHOW_LIVE_REQUEST", z10);
            }
            startActivity(intent);
        }
    }

    public final void e6(String str) {
        te.c f10;
        String g10;
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (!hf.v0.c(I6, a32, str + ".follow.liveowner", false, 4, null) || (f10 = z6().j1().f()) == null || (g10 = f10.g()) == null) {
            return;
        }
        y6().D(g10, str);
    }

    public final hf.c f6() {
        return (hf.c) this.S.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f21971e1) {
            return;
        }
        if (jo.p.c(z6().Y0(), J6().T4()) && !l6().E()) {
            this.f22003x0.c(new e());
            return;
        }
        d6();
        if (x6().h(getTaskId())) {
            finishAndRemoveTask();
        } else {
            super.finish();
        }
    }

    @Override // qb.s
    public void g2() {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().a0(liveId, Referer.LIVE_VIEW);
    }

    public final xe.a g6() {
        return (xe.a) this.T.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.P;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // lb.l
    public void h1(jf.q qVar) {
        if (qVar == null) {
            return;
        }
        N7();
    }

    @Override // qb.s
    public void h2() {
        String liveId;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        dq.c.c().l(new y.f(liveId));
    }

    public final ud.j h6() {
        return (ud.j) this.U.getValue();
    }

    @Override // qb.s
    public void i2() {
        String g10;
        te.c f10 = z6().j1().f();
        if (f10 == null || (g10 = f10.g()) == null) {
            return;
        }
        y6().l(g10);
    }

    public final kb.d i6() {
        kb.d dVar = this.O;
        if (dVar != null) {
            return dVar;
        }
        jo.p.v("binding");
        return null;
    }

    @Override // gf.r0
    public void j0(String str) {
        jo.p.h(str, "lpUrl");
        startActivity(WebViewActivity.a.b(WebViewActivity.X, this, str, false, false, 12, null));
    }

    @Override // hb.f1.b
    public void j1(String str) {
        jo.p.h(str, "comment");
        if (!TextUtils.isEmpty(str)) {
            i6().K.setText(str);
        }
        p7(false);
        N7();
    }

    public final nf.c j6() {
        return (nf.c) this.V.getValue();
    }

    @Override // be.d2
    public void k2() {
        te.c f10;
        String liveId;
        te.c f11;
        UserProfile owner;
        String userId;
        te.c f12;
        UserProfile owner2;
        String name;
        if (jo.p.c(z6().I1().f(), Boolean.TRUE) || (f10 = z6().j1().f()) == null || (liveId = f10.getLiveId()) == null || (f11 = z6().j1().f()) == null || (owner = f11.getOwner()) == null || (userId = owner.getUserId()) == null || (f12 = z6().j1().f()) == null || (owner2 = f12.getOwner()) == null || (name = owner2.getName()) == null) {
            return;
        }
        y6().a(Referer.LIVE_VIEW, liveId, userId, name, CollabType.LIVE);
        Fragment e02 = a3().e0("InvitedCollabLiveDialogFragment");
        if (e02 != null) {
            a3().k().q(e02).j();
        }
    }

    public final od.f k6() {
        return (od.f) this.W.getValue();
    }

    public final nf.h l6() {
        return (nf.h) this.X.getValue();
    }

    public final void l8() {
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (!hf.v0.c(I6, a32, Referer.LIVE_VIEW, false, 4, null)) {
            this.f21979i1 = true;
            return;
        }
        hb.f1 f1Var = this.G0;
        if (f1Var != null && f1Var.p3() != null) {
            f1Var.m3();
        }
        tb.a C = s6().C(Referer.LIVE_VIEW);
        C.a().z3(a3(), C.b());
        this.B0 = C.b();
        N7();
    }

    @Override // be.p1
    public void m2(jf.q qVar, int i10) {
        jo.p.h(qVar, "gift");
        qVar.w(i10);
        O7(qVar, i6().P.getScoreGiftView());
    }

    public final hb.b m6() {
        return (hb.b) this.f21984l0.getValue();
    }

    public final void m8(CollabType collabType) {
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        be.e0 a10 = be.e0.V0.a(f10.e(), J6().u2(), f10.f(), collabType);
        this.D0 = a10;
        if (a10 != null) {
            a10.z3(a3(), "CollabRequestDialog");
        }
    }

    @Override // qb.s
    public void n0() {
        String g10;
        te.c f10 = z6().j1().f();
        if (f10 == null || (g10 = f10.g()) == null) {
            return;
        }
        dq.c.c().l(new y.c(g10, Referer.LIVE_VIEW));
    }

    @Override // vb.i
    public void n1() {
    }

    public final hf.r n6() {
        return (hf.r) this.Y.getValue();
    }

    public final void n7(nd.c cVar, String str, String str2, EventBannerWhere eventBannerWhere) {
        int i10 = c.f22041d[cVar.ordinal()];
        if (i10 == 1) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.LIVE_VIEW, H6().a(str2)));
        } else if (i10 == 2) {
            startActivity(HandleUrlSchemeActivity.f25127b0.a(this, Referer.LIVE_VIEW, H6().a(str2)));
        } else if (i10 == 3) {
            return;
        }
        P7(EventBannerActionType.EVENT_BANNER_CLICK, cVar, str, str2, eventBannerWhere);
    }

    public final void n8() {
        String obj = i6().K.getText().toString();
        i6().K.setText("");
        N6(obj);
        this.f22003x0.c(new v2());
        p7(true);
    }

    @Override // gf.r0
    public void o(String str) {
        jo.p.h(str, "liveGameId");
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        y6().h0(str, f10.getLiveId(), false);
        hf.b.f35490a.i();
        FirebaseAnalytics.getInstance(getApplicationContext()).a("Invite_Game_Start", null);
    }

    @Override // gf.r0
    public void o1() {
        i6().f38516i0.B();
    }

    public final kf.i o6() {
        return (kf.i) this.Z.getValue();
    }

    public final void o8() {
        EventBannerResponse eventBannerResponse;
        String liveId;
        if (this.f21963a1 && !v6()) {
            a3().X0(new w2(), false);
            lb.h a10 = lb.h.X0.a();
            this.L0 = a10;
            jo.p.e(a10);
            a10.z3(a3(), "GiftPanelBottomSheetDialogFragment");
            te.c f10 = z6().j1().f();
            if (f10 != null && (liveId = f10.getLiveId()) != null) {
                Puree.d(new Live.ImpGiftPanel(liveId, true));
                J7();
            }
            List<EventBannerResponse> f02 = z6().f0();
            if (f02 == null || (eventBannerResponse = (EventBannerResponse) xn.a0.Z(f02)) == null) {
                return;
            }
            P7(EventBannerActionType.EVENT_BANNER_IMP, nd.c.Companion.a(eventBannerResponse.getType()), eventBannerResponse.getTitle(), eventBannerResponse.getUrl(), EventBannerWhere.VIEW_GIFT_PANEL);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.b bVar) {
        be.r a10;
        String liveId;
        jo.p.h(bVar, "event");
        r.a aVar = be.r.f18061c1;
        String f10 = h6().k().f();
        if (f10 == null) {
            f10 = getResources().getString(hb.b2.H);
        }
        String str = f10;
        jo.p.g(str, "appUserIdSettingBindMode…efault_app_user_id_label)");
        Boolean f11 = h6().B().f();
        if (f11 == null) {
            f11 = Boolean.FALSE;
        }
        a10 = aVar.a(Referer.LIVE_VIEW, str, f11.booleanValue(), "", false, (r25 & 32) != 0 ? false : false, (r25 & 64) != 0 ? nd.f1.text_view_game_id_add_app_title_v2 : 0, (r25 & 128) != 0 ? nd.f1.text_view_game_id_add_app_title_landscape_v2 : 0, (r25 & 256) != 0, (r25 & 512) != 0 ? false : false);
        a10.z3(a3(), "AppUserIdSettingDialog");
        h6().C().m(Boolean.TRUE);
        h6().p().m(h6().z().f());
        te.c f12 = z6().j1().f();
        if (f12 == null || (liveId = f12.getLiveId()) == null) {
            return;
        }
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GAME_ID_EDIT_IMP);
        builder.setTargetId(bVar.a());
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setPageId(Referer.LIVE_VIEW);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
        u62.sendLog(builder.build());
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
        GiftAppealPopupImage giftAppealPopupImage;
        rb.c cVar = this.f21977h1;
        if (cVar != null) {
            boolean z10 = false;
            if (cVar != null && !cVar.i(new DialogInterface.OnClickListener() { // from class: hb.u
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    PlayerActivity.o7(PlayerActivity.this, dialogInterface, i10);
                }
            })) {
                z10 = true;
            }
            if (z10) {
                return;
            }
        }
        if (v6() && !this.f21969d1) {
            Z5();
        } else if (this.f21969d1) {
            a6();
        } else if (i6().T.getVisibility() == 0) {
            i6().T.setVisibility(8);
            te.c f10 = z6().j1().f();
            if (f10 == null || (giftAppealPopupImage = f10.getGiftAppealPopupImage()) == null) {
                return;
            }
            y6().T(giftAppealPopupImage.getGiftAppealPopupId());
        } else {
            P5();
        }
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        hb.f1 f1Var = this.G0;
        if (f1Var != null && f1Var.p3() != null) {
            j1(f1Var.P3());
            f1Var.m3();
        }
        Fragment e02 = a3().e0(this.B0);
        if (e02 != null) {
            a3().k().q(e02).j();
            l8();
        }
        if (v6()) {
            N7();
        }
        int b10 = getResources().getConfiguration().orientation == 1 ? 0 : de.a.b(this, 42);
        ViewGroup.LayoutParams layoutParams = i6().f38516i0.getLayoutParams();
        jo.p.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(b10);
        i6().f38516i0.setLayoutParams(marginLayoutParams);
        A8(z6().P1());
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        float f10;
        dq.c.c().p(this);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("EXTRA_LIVE_ID");
        if (stringExtra == null) {
            finish();
            return;
        }
        ViewDataBinding g10 = androidx.databinding.f.g(this, hb.x1.activity_player);
        jo.p.g(g10, "setContentView(this, R.layout.activity_player)");
        T7((kb.d) g10);
        String stringExtra2 = getIntent().getStringExtra("EXTRA_PREVIEW_IMAGE_URL");
        if (stringExtra2 != null) {
            String stringExtra3 = getIntent().getStringExtra("EXTRA_ORIENTATION_V2");
            if (stringExtra3 != null) {
                int hashCode = stringExtra3.hashCode();
                if (hashCode != 54) {
                    if (hashCode == 56 && stringExtra3.equals("8")) {
                        f10 = 270.0f;
                        GlideApp.with(i6().f38524q0).load(stringExtra2).transform((m7.l<Bitmap>) new xd.c(f10)).into(i6().f38524q0);
                    }
                } else if (stringExtra3.equals("6")) {
                    f10 = 90.0f;
                    GlideApp.with(i6().f38524q0).load(stringExtra2).transform((m7.l<Bitmap>) new xd.c(f10)).into(i6().f38524q0);
                }
            }
            f10 = 0.0f;
            GlideApp.with(i6().f38524q0).load(stringExtra2).transform((m7.l<Bitmap>) new xd.c(f10)).into(i6().f38524q0);
        }
        this.N0 = F6().b(8).b();
        this.U0 = getIntent().getStringExtra("EXTRA_INVITED_LIVE_GAME_ID");
        this.P0 = getIntent().getBooleanExtra("EXTRA_IS_LAUNCH_SHOOTER_MATCHING", false);
        this.V0 = getIntent().getBooleanExtra("EXTRA_IS_LAUNCH_FROM_ONBOARDING", false);
        this.Q0 = this.P0;
        x6().j(getTaskId(), !this.N0);
        a3().k().r(hb.w1.f35000f0, PlayerCommentFragment.a.b(PlayerCommentFragment.D0, false, false, null, 7, null)).i();
        if (!D6().a().d()) {
            a3().k().s(hb.w1.f35003h, hb.f.C0.a(), "EmomoWipeViewFragment").i();
        }
        i6().G.setLayoutManager(new LinearLayoutManager(this, 0, false));
        RecyclerView recyclerView = i6().G;
        rd.t0 t0Var = new rd.t0();
        t0Var.d(new m1());
        recyclerView.setAdapter(t0Var);
        V6(stringExtra);
        y8(null, null);
        this.W0 = getIntent().getBooleanExtra("EXTRA_IS_LAUNCH_FROM_NOTIFICATION", false);
        f21956s1.b();
        getWindow().setSoftInputMode(3);
        i6().f38532y0.setVisibility(8);
        i6().A0.setSurfaceTextureListener(this);
        Y7();
        n1 n1Var = new n1();
        this.I0 = n1Var;
        registerReceiver(n1Var, new IntentFilter("com.dena.mirrorman.action.STOP_PLAYING"));
        setVolumeControlStream(3);
        RecyclerView recyclerView2 = i6().N;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ob.b bVar = new ob.b();
        bVar.i(new o1(stringExtra));
        recyclerView2.setAdapter(bVar);
        jo.p.g(recyclerView2, "");
        recyclerView2.g(new p001if.c(de.n.b(recyclerView2, 4), de.n.b(recyclerView2, 1), 0, de.n.b(recyclerView2, 1), 0, 0));
        recyclerView2.k(new p1());
        this.f22002w0.b(i6().N);
        y6().i0(stringExtra, true);
        if (getIntent().getBooleanExtra("EXTRA_IS_LAUNCH_PICTURE_IN_PICTURE", false)) {
            X5(true);
        }
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        String str;
        super.onDestroy();
        dq.c.c().r(this);
        d2.a.a(this.f22001v0, null, 1, null);
        uo.r0.d(this, null, 1, null);
        te.b bVar = this.J0;
        if (bVar != null) {
            bVar.f();
        }
        try {
            unregisterReceiver(this.I0);
        } catch (IllegalArgumentException e10) {
            g9.a.c(e10);
        }
        B6().a();
        V7(false);
        rb.d dVar = this.f21991o1;
        if (dVar != null) {
            dVar.b();
        }
        rb.c cVar = this.f21977h1;
        if (cVar != null) {
            cVar.q();
        }
        te.c f10 = z6().j1().f();
        if (f10 != null) {
            y6().S(f10.getLiveId());
            MRLogger u62 = u6();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_PLAYER_END);
            if (D6().a().d()) {
                str = this.f21987m1 ? "mirroring_cast_end" : "mirroring_left";
            } else {
                str = MRLog.TARGET_TYPE_LIVE;
            }
            builder.setTargetType(str);
            builder.setTargetId(f10.getLiveId());
            builder.setPageId("");
            wn.k[] kVarArr = new wn.k[6];
            kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, f10.g());
            kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_NAME, f10.e());
            kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, f10.getLiveId());
            String title = f10.getTitle();
            if (title == null) {
                title = "";
            }
            kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_NAME, title);
            String stringExtra = getIntent().getStringExtra("EXTRA_FROM_WHERE");
            kVarArr[4] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, stringExtra != null ? stringExtra : "");
            kVarArr[5] = wn.q.a(MRLog.PAYLOAD_KEY_IS_MUTED, String.valueOf(R6()));
            List<wn.k<String, String>> p10 = xn.s.p(kVarArr);
            String appId = f10.getAppId();
            if (appId != null) {
                p10.add(wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, appId));
            }
            builder.setPayload(p10);
            u62.sendLog(builder.build());
        }
    }

    @dq.l
    public final void onEvent(ce.n nVar) {
        jo.p.h(nVar, "event");
        S5();
        k6().p(jf.k.PLAYER_COLLAB_CANCEL_FROM_DIALOG);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        String liveId;
        String stringExtra;
        super.onNewIntent(intent);
        x6().f(intent);
        this.U0 = intent != null ? intent.getStringExtra("EXTRA_INVITED_LIVE_GAME_ID") : null;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("EXTRA_IS_LAUNCH_SHOOTER_MATCHING", false) : false;
        this.P0 = booleanExtra;
        this.Q0 = booleanExtra;
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null || intent == null || (stringExtra = intent.getStringExtra("EXTRA_LIVE_ID")) == null) {
            return;
        }
        if (!jo.p.c(liveId, stringExtra)) {
            PlayerService c10 = B6().c();
            if (c10 != null) {
                c10.I0(false);
            }
            x8(stringExtra);
            return;
        }
        y6().d0(true);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        if (x6().e()) {
            PlayerService c10 = B6().c();
            if (c10 != null) {
                c10.stopSelf();
            }
            super.onPause();
            return;
        }
        V7(false);
        V5();
        rb.d dVar = this.f21991o1;
        if (dVar != null) {
            dVar.c();
        }
        rb.c cVar = this.f21977h1;
        if (cVar != null) {
            jo.p.e(cVar);
            cVar.n();
        }
        N7();
        K5();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        x6().g(z10, configuration);
        i6().A0.setInPictureInPictureMode(z10);
        i6().f38520m0.setVisibility(z10 ? 8 : 0);
        i6().f38517j0.setVisibility(z10 ? 0 : 8);
        if (z10) {
            y6().e0();
            List<Fragment> p02 = a3().p0();
            jo.p.g(p02, "supportFragmentManager.fragments");
            for (Fragment fragment : p02) {
                if (fragment instanceof androidx.fragment.app.e) {
                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) fragment;
                    if (eVar.p3() != null) {
                        eVar.m3();
                    }
                }
            }
        } else {
            g().c(x6().c());
        }
        q6().p(z10);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        jo.p.h(strArr, "permissions");
        jo.p.h(iArr, "grantResults");
        if (i10 == 202) {
            ArrayList arrayList = new ArrayList();
            int length = iArr.length;
            boolean z10 = true;
            for (int i11 = 0; i11 < length; i11++) {
                if (iArr[i11] != 0) {
                    arrayList.add(strArr[i11]);
                    z10 = false;
                }
            }
            if (z10) {
                of.n.A(getApplicationContext(), hb.b2.text_permission_an6_all_granted, false);
                return;
            }
            Context applicationContext = getApplicationContext();
            jo.p.g(applicationContext, "applicationContext");
            Object[] array = arrayList.toArray(new String[0]);
            jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            N5(applicationContext, (String[]) array);
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        this.T0 = System.currentTimeMillis();
        q6().p(false);
        V7(true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jo.p.h(surfaceTexture, "surface");
        B6().f(new Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jo.p.h(surfaceTexture, "surface");
        B6().f(null);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jo.p.h(surfaceTexture, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        jo.p.h(surfaceTexture, "surface");
    }

    public final nf.k p6() {
        return (nf.k) this.f21999t0.getValue();
    }

    public final void p7(boolean z10) {
        if (z10) {
            i6().L.setVisibility(4);
            i6().D0.setVisibility(4);
            i6().f38518k0.setVisibility(8);
            return;
        }
        i6().L.setVisibility(0);
        i6().D0.setVisibility(0);
        G8();
    }

    public final void p8(boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = hb.b2.text_not_enough_paid_coin;
        } else {
            i10 = hb.b2.f34728r0;
        }
        if (z10) {
            i11 = hb.b2.text_induce_paid_coin_purchase;
        } else {
            i11 = hb.b2.text_induce_coin_purchase;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(i10);
        builder.setMessage(i11);
        builder.setPositiveButton(hb.b2.W0, new DialogInterface.OnClickListener() { // from class: hb.f0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                PlayerActivity.q8(PlayerActivity.this, dialogInterface, i12);
            }
        });
        builder.setNegativeButton(hb.b2.f34724p, (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    @Override // be.d3
    public void q1() {
        of.d dVar = of.d.f45388a;
        if (!dVar.d() && !dVar.c()) {
            T6();
        } else {
            of.n.A(getApplicationContext(), hb.b2.f34716d, false);
        }
    }

    public final od.p q6() {
        return (od.p) this.f21964b0.getValue();
    }

    public final void q7() {
        F6().c();
        I8();
    }

    public final nf.o r6() {
        return (nf.o) this.f21966c0.getValue();
    }

    public final void r7(String str) {
        this.f21967c1 = true;
        if (str != null) {
            of.n.f45411a.B(this, str, false);
        }
        finish();
    }

    public final void r8() {
        if (isFinishing()) {
            return;
        }
        i6().f38530w0.setVisibility(8);
        i6().f38525r0.setVisibility(8);
        this.f22003x0.c(new x2());
    }

    @Override // lb.l
    public void s1() {
        l8();
    }

    public final tb.c s6() {
        return (tb.c) this.f21968d0.getValue();
    }

    public final void s7() {
        boolean z10 = false;
        if (x6().e()) {
            q6().p(false);
            finishAndRemoveTask();
            return;
        }
        te.c f10 = z6().j1().f();
        if (f10 != null && f10.isPrivate()) {
            z10 = true;
        }
        if (z10) {
            r8();
        } else if (g().b() != o.c.RESUMED) {
            finish();
        }
    }

    public final void s8(PlayerGiftPagerCell playerGiftPagerCell, jf.q qVar) {
        te.c f10;
        int i10;
        String string;
        te.c f11 = z6().j1().f();
        if (f11 == null || f11.getLiveId() == null || (f10 = z6().j1().f()) == null || f10.g() == null) {
            return;
        }
        this.f21969d1 = true;
        Z5();
        MessageGiftView messageGiftView = i6().f38514g0;
        ve.d q10 = qVar.q();
        int[] iArr = c.f22038a;
        if (iArr[q10.ordinal()] == 2) {
            i10 = hb.b2.text_anniversary_request_gift_title;
        } else {
            i10 = hb.b2.text_birthday_message_gift_header;
        }
        String string2 = getString(i10);
        jo.p.g(string2, "getString(\n             …          }\n            )");
        String string3 = getString(hb.b2.text_birthday_message_gift_placeholder);
        jo.p.g(string3, "getString(R.string.text_…message_gift_placeholder)");
        int i11 = iArr[qVar.q().ordinal()];
        if (i11 != 1) {
            string = i11 != 2 ? "" : getString(hb.b2.text_anniversary_gift_default);
        } else {
            string = getString(hb.b2.text_birthday_message_gift_default);
        }
        String str = string;
        jo.p.g(str, "when (gift.type) {\n     … else -> \"\"\n            }");
        messageGiftView.F(qVar, string2, string3, str, false, new y2(qVar, playerGiftPagerCell));
    }

    public final kf.m t6() {
        return (kf.m) this.f21970e0.getValue();
    }

    public final void t7(String str) {
        if (str == null) {
            return;
        }
        i6().A0.setVideoOrientation(str);
        if (x6().e()) {
            setPictureInPictureParams(i6().A0.a(f21959v1));
        }
    }

    public final void t8(String str, boolean z10) {
        te.c f10;
        if (TextUtils.isEmpty(str) || (f10 = z6().j1().f()) == null) {
            return;
        }
        tb.a i10 = c.a.i(s6(), str, Referer.LIVE_VIEW, (!z10 || I6().i(str) || jo.p.c(f10.g(), str)) ? false : true, false, 8, null);
        i10.a().z3(a3(), i10.b());
    }

    public final MRLogger u6() {
        return (MRLogger) this.f21972f0.getValue();
    }

    public final void u7() {
        i6().f38530w0.setVisibility(0);
        i6().f38525r0.setVisibility(8);
    }

    public final void u8() {
        String string;
        LiveQuiz quiz;
        Boolean f10 = z6().g1().f();
        if (f10 == null || f10.booleanValue()) {
            return;
        }
        T5("QuizPopupDialog");
        te.c f11 = z6().j1().f();
        boolean z10 = false;
        if (((f11 == null || (quiz = f11.getQuiz()) == null) ? -1 : quiz.getQuestionNth()) == 0) {
            rb.c cVar = this.f21977h1;
            if (cVar != null ? cVar.l() : false) {
                z10 = true;
            }
        }
        String str = z10 ? "followWithAnswerRight" : "follow";
        if (z10) {
            string = getString(hb.b2.text_q_fail_and_follow_desc);
        } else {
            string = getString(hb.b2.text_q_follow_desc_2);
        }
        String str2 = string;
        jo.p.g(str2, "if (hasAnswerRight) {\n  …_follow_desc_2)\n        }");
        Puree.d(new Quiz.Imp(str));
        b.a aVar = rb.b.P0;
        String string2 = getString(hb.b2.text_q_follow);
        jo.p.g(string2, "getString(R.string.text_q_follow)");
        String string3 = getString(hb.b2.Y);
        jo.p.g(string3, "getString(R.string.text_follow)");
        String string4 = getString(hb.b2.N0);
        jo.p.g(string4, "getString(R.string.text_refrain)");
        aVar.a(string2, str2, string3, string4, hb.z1.f35045k, new z2(str)).z3(a3(), "QuizPopupDialog");
    }

    @Override // qb.s
    public void v() {
        Boolean f10 = z6().g1().f();
        if (f10 == null) {
            return;
        }
        if (f10.booleanValue()) {
            F8(Referer.LIVE_VIEW);
        } else {
            e6(Referer.LIVE_VIEW);
        }
    }

    @Override // lb.l
    public void v0(String str) {
        jo.p.h(str, "liveGameId");
        tb.a H = s6().H(Referer.GIFT_PANEL, str);
        H.a().z3(a3(), H.b());
    }

    public final boolean v6() {
        return a3().e0("GiftPanelBottomSheetDialogFragment") != null;
    }

    public final void v7() {
        i6().f38525r0.setVisibility(8);
        i6().f38530w0.setVisibility(8);
        S6();
    }

    public final void v8(String str, String str2) {
        te.c f10;
        String liveId;
        if (isFinishing() || (f10 = z6().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        we.c.N0.a(str2, str, liveId).z3(a3(), "ReportDialog");
    }

    public final jf.d0 w6() {
        return (jf.d0) this.f21978i0.getValue();
    }

    public final void w7() {
        i6().f38525r0.setVisibility(0);
        i6().f38530w0.setVisibility(8);
    }

    public final void w8() {
        String g10;
        Boolean f10;
        te.c f11 = z6().j1().f();
        if (f11 == null || (g10 = f11.g()) == null || (f10 = z6().g1().f()) == null) {
            return;
        }
        boolean booleanValue = f10.booleanValue();
        y6().I(g10, Referer.LIVE_VIEW);
        qb.q.X0.a(Referer.LIVE_VIEW).z3(a3(), "LiveInfoBottomSheetDialog");
        K8(booleanValue);
    }

    @Override // vb.i
    public void x(Serializable serializable) {
        jo.p.h(serializable, "posssessionCoin");
        y6().t0((jf.f) serializable);
    }

    @Override // be.i0
    public void x0() {
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        if (N5(applicationContext, f21960w1)) {
            L7(CollabType.CALL);
            Fragment e02 = a3().e0("CollabStartDialog");
            if (e02 != null) {
                a3().k().q(e02).j();
            }
        }
    }

    public final PipStateManager x6() {
        return (PipStateManager) this.Q.getValue();
    }

    public final void x7() {
        if (isFinishing() || this.f21971e1) {
            return;
        }
        if (x6().e()) {
            q6().p(false);
            finishAndRemoveTask();
            return;
        }
        finish();
    }

    public final void x8(String str) {
        String liveId;
        c6();
        i6().f38511d0.setVisibility(8);
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        M5(liveId, str);
    }

    @Override // gf.r0
    public void y0(String str) {
        String appId;
        te.c f10;
        String liveId;
        jo.p.h(str, "url");
        of.n.r(this, str);
        App.AppParams f11 = z6().r0().f();
        if (f11 == null || (appId = f11.getAppId()) == null || (f10 = z6().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_POSTED_GAME_ID_COMMENT_TAP);
        builder.setTargetType("url");
        builder.setTargetId(appId);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
        u62.sendLog(builder.build());
    }

    public final hb.i y6() {
        return (hb.i) this.f21980j0.getValue();
    }

    public final void y7() {
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        this.E0 = null;
        L5(f10.getCollabEnabled(), f10.getCollabHasVacancy());
        R5();
        S5();
    }

    public final void y8(PlayerService.g gVar, te.c cVar) {
        if (isFinishing()) {
            return;
        }
        PlayerService.a aVar = PlayerService.f22427t0;
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        c3.a.n(this, aVar.b(applicationContext, gVar, cVar));
    }

    public final nf.z z6() {
        return (nf.z) this.f21982k0.getValue();
    }

    public final void z7() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public final void z8() {
        sd.b a10 = sd.b.O0.a(false);
        this.f21989n1 = a10;
        if (a10 != null) {
            a10.z3(a3(), "ProgressDialogFragment");
        }
    }

    @dq.l
    public final void onEvent(nd.l0 l0Var) {
        jo.p.h(l0Var, "event");
        u8();
    }

    @dq.l
    public final void onEvent(nd.j0 j0Var) {
        jo.p.h(j0Var, "event");
        i6().f38526s0.setVisibility(0);
        if (this.f21975g1 != null) {
            i6().f38526s0.removeAllViews();
            this.f21975g1 = null;
        }
        this.f21975g1 = new rb.a(this);
        i6().f38526s0.addView(this.f21975g1);
        rb.a aVar = this.f21975g1;
        jo.p.e(aVar);
        aVar.g(i6().f38526s0.getWidth(), i6().f38526s0.getHeight());
    }

    @dq.l
    public final void onEvent(nd.m0 m0Var) {
        String string;
        String string2;
        String string3;
        String string4;
        jo.p.h(m0Var, "event");
        T5("QuizPopupDialog");
        Boolean f10 = z6().g1().f();
        if (f10 == null) {
            return;
        }
        boolean booleanValue = f10.booleanValue();
        if (booleanValue) {
            string = getString(hb.b2.text_q_possession_life, new Object[]{"<font color='#29CCB1'>1</font>"});
            jo.p.g(string, "getString(\n             …'>1</font>\"\n            )");
            string2 = getString(hb.b2.text_q_life_desc);
            jo.p.g(string2, "getString(R.string.text_q_life_desc)");
            string3 = getString(hb.b2.text_q_life_use);
            jo.p.g(string3, "getString(R.string.text_q_life_use)");
            string4 = getString(hb.b2.text_q_life_use_no);
            jo.p.g(string4, "getString(R.string.text_q_life_use_no)");
        } else {
            string = getString(hb.b2.text_q_fail_and_follow);
            jo.p.g(string, "getString(R.string.text_q_fail_and_follow)");
            string2 = getString(hb.b2.text_q_fail_and_follow_desc);
            jo.p.g(string2, "getString(R.string.text_q_fail_and_follow_desc)");
            string3 = getString(hb.b2.Y);
            jo.p.g(string3, "getString(R.string.text_follow)");
            string4 = getString(hb.b2.N0);
            jo.p.g(string4, "getString(R.string.text_refrain)");
        }
        rb.b.P0.a(string, string2, string3, string4, hb.z1.img_popup_incorrect, new r1(booleanValue, this)).z3(a3(), "QuizPopupDialog");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.a aVar) {
        be.r a10;
        jo.p.h(aVar, "event");
        y6().u(aVar.a());
        r.a aVar2 = be.r.f18061c1;
        String f10 = h6().k().f();
        if (f10 == null) {
            f10 = getResources().getString(hb.b2.H);
        }
        String str = f10;
        jo.p.g(str, "appUserIdSettingBindMode…efault_app_user_id_label)");
        Boolean f11 = h6().B().f();
        if (f11 == null) {
            f11 = Boolean.FALSE;
        }
        a10 = aVar2.a(Referer.LIVE_VIEW, str, f11.booleanValue(), "", false, (r25 & 32) != 0 ? false : false, (r25 & 64) != 0 ? nd.f1.text_view_game_id_add_app_title_v2 : 0, (r25 & 128) != 0 ? nd.f1.text_view_game_id_add_app_title_landscape_v2 : 0, (r25 & 256) != 0, (r25 & 512) != 0 ? false : false);
        a10.z3(a3(), "AppUserIdSettingDialog");
        h6().F().m(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(y.b bVar) {
        jo.p.h(bVar, "event");
        i6().f38524q0.setVisibility(8);
    }

    @dq.l
    public final void on(ce.i iVar) {
        jo.p.h(iVar, "event");
        y6().O(iVar.a(), jf.a.GAME_ID, iVar.b(), iVar.c());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.j jVar) {
        be.r a10;
        jo.p.h(jVar, "event");
        r.a aVar = be.r.f18061c1;
        String f10 = h6().k().f();
        if (f10 == null) {
            f10 = getResources().getString(hb.b2.H);
        }
        String str = f10;
        jo.p.g(str, "appUserIdSettingBindMode…efault_app_user_id_label)");
        Boolean f11 = h6().B().f();
        if (f11 == null) {
            f11 = Boolean.FALSE;
        }
        a10 = aVar.a(Referer.LIVE_VIEW, str, f11.booleanValue(), "", false, (r25 & 32) != 0 ? false : false, (r25 & 64) != 0 ? nd.f1.text_view_game_id_add_app_title_v2 : 0, (r25 & 128) != 0 ? nd.f1.text_view_game_id_add_app_title_landscape_v2 : 0, (r25 & 256) != 0, (r25 & 512) != 0 ? false : false);
        a10.z3(a3(), "AppUserIdSettingDialog");
        h6().C().m(Boolean.TRUE);
        h6().p().m(h6().z().f());
    }

    @dq.l
    public final void onEvent(nd.i0 i0Var) {
        jo.p.h(i0Var, "event");
        y6().N(i0Var.b(), i0Var.a(), i0Var.d(), i0Var.c());
    }

    @dq.l
    public final void onEvent(y.e eVar) {
        jo.p.h(eVar, "event");
        V5();
    }

    @dq.l
    public final void onEvent(ce.p pVar) {
        jo.p.h(pVar, "event");
        y7();
        t1.a aVar = yd.t1.f61795x;
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        String string = getString(hb.b2.error_connection);
        jo.p.g(string, "getString(R.string.error_connection)");
        aVar.a(applicationContext, string);
    }

    @dq.l
    public final void onEvent(y.f fVar) {
        jo.p.h(fVar, "event");
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        y6().n();
        Puree.d(new Live.Share(f10.getLiveId(), f10.g(), f10.e(), f10.getTitle(), f10.isPrivate() ? Live.LIVE_TYPE_PRIVATE : "open", f10.a(), Live.SHARE_TYPE_SETTING_IN_PLAYER, ""));
        startActivity(Intent.createChooser(of.n.f45411a.h(this, f10.getShareUrl()), "", PendingIntent.getBroadcast(this, 0, ChooseReceiver.f25051x.a(this, new s1(fVar.a(), f10.g())), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()));
    }

    @dq.l
    public final void on(ce.d dVar) {
        String liveId;
        jo.p.h(dVar, "event");
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().t(liveId);
    }

    @dq.l
    public final void on(ce.e eVar) {
        String liveId;
        jo.p.h(eVar, "event");
        te.c f10 = z6().j1().f();
        if (f10 == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        y6().s(liveId);
    }

    @dq.l
    public final void on(ce.g gVar) {
        jo.p.h(gVar, "event");
        App.AppParams f10 = z6().r0().f();
        if (f10 == null) {
            return;
        }
        be.i.Q0.a(f10).z3(a3(), "AppUserIdBottomSheetDialogFragment");
    }

    @dq.l
    public final void on(ce.f fVar) {
        AppUserDetailResponse appUserDetail;
        String userId;
        String liveId;
        jo.p.h(fVar, "event");
        App.AppParams f10 = z6().r0().f();
        if (f10 == null || (appUserDetail = f10.getAppUserDetail()) == null || (userId = appUserDetail.getUserId()) == null) {
            return;
        }
        ClipData clipData = new ClipData(new ClipDescription("text_data", new String[]{"text/plain"}), new ClipData.Item(userId));
        Object systemService = getSystemService("clipboard");
        jo.p.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(clipData);
        t1.a aVar = yd.t1.f61795x;
        String string = getResources().getString(hb.b2.text_view_game_id_copy_toast_v2, f10.getAppUserIdLabel());
        jo.p.g(string, "resources.getString(R.st…urrentApp.appUserIdLabel)");
        aVar.a(this, string);
        te.c f11 = z6().j1().f();
        if (f11 == null || (liveId = f11.getLiveId()) == null) {
            return;
        }
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_CAST_GAME_ID_TAP);
        builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
        builder.setTargetId(f10.getAppId());
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
        u62.sendLog(builder.build());
    }

    @dq.l
    public final void onEvent(y.c cVar) {
        jo.p.h(cVar, "event");
        hf.v0 I6 = I6();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (hf.v0.c(I6, a32, cVar.a() + Referer.REPORT_USER, false, 4, null)) {
            V5();
            v8(cVar.b(), cVar.a());
        }
    }

    @dq.l
    public final void onEvent(nd.y yVar) {
        String g10;
        jo.p.h(yVar, "event");
        te.c f10 = z6().j1().f();
        if (f10 == null || (g10 = f10.g()) == null || !jo.p.c(yVar.a(), g10)) {
            return;
        }
        this.K0 = yVar.b();
        K8(yVar.b());
    }

    @dq.l
    public final void onEvent(y.a aVar) {
        jo.p.h(aVar, "event");
        throw null;
    }

    @dq.l
    public final void on(ce.h hVar) {
        AppUserDetailResponse appUserDetail;
        String url;
        String appId;
        te.c f10;
        String liveId;
        jo.p.h(hVar, "event");
        App.AppParams f11 = z6().r0().f();
        if (f11 == null || (appUserDetail = f11.getAppUserDetail()) == null || (url = appUserDetail.getUrl()) == null) {
            return;
        }
        of.n.r(this, url);
        App.AppParams f12 = z6().r0().f();
        if (f12 == null || (appId = f12.getAppId()) == null || (f10 = z6().j1().f()) == null || (liveId = f10.getLiveId()) == null) {
            return;
        }
        MRLogger u62 = u6();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_VIEW_CAST_GAME_ID_URL_TAP);
        builder.setTargetType("url");
        builder.setTargetId(appId);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, liveId)));
        u62.sendLog(builder.build());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(PlayerService.b bVar) {
        jo.p.h(bVar, "event");
        te.e a10 = bVar.a();
        if (a10.e()) {
            w7();
        } else if (a10.d()) {
            v7();
        } else if (a10.b()) {
            u7();
        } else if (a10.c()) {
            s7();
        } else if (a10.f()) {
            x7();
        } else {
            g9.a.f32826a.b("untracked status", new Object[0]);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(y.g gVar) {
        jo.p.h(gVar, "event");
        i6().A0.setVideoOrientation(z6().e1());
        i6().A0.setVideoSize(new Size(gVar.b(), gVar.a()));
    }

    @dq.l
    public final void onEvent(y.h hVar) {
        jo.p.h(hVar, "event");
        if (hVar.a().getStatus().getMirrativError() instanceof MRError.Blocked) {
            r7(hVar.a().getStatus().getMirrativError().getMessage());
            return;
        }
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        if (!f10.isLive() && D6().a().d()) {
            this.f21987m1 = true;
            finish();
        } else if (jo.p.c(f10.getLiveId(), hVar.a().getLiveId())) {
            LinkedLive linkedLive = f10.getLinkedLive();
            String liveId = linkedLive != null ? linkedLive.getLiveId() : null;
            LinkedLive linkedLive2 = hVar.a().getLinkedLive();
            if (!jo.p.c(liveId, linkedLive2 != null ? linkedLive2.getLiveId() : null)) {
                J8(hVar.a().getLinkedLive());
            }
            f10.v(hVar.a());
            y6().L(f10);
        }
    }

    @dq.l
    public final void onEvent(nd.e0 e0Var) {
        String liveId;
        jo.p.h(e0Var, "event");
        te.c f10 = z6().j1().f();
        if (f10 == null) {
            return;
        }
        Puree.d(new Live.click_comment_share_request(f10, Live.COMMENT_SHARE_TYPE_SHARE, e0Var.a()));
        te.c f11 = z6().j1().f();
        if (f11 == null || (liveId = f11.getLiveId()) == null) {
            return;
        }
        dq.c.c().l(new y.f(liveId));
    }

    @dq.l
    public final void onEvent(nd.n0 n0Var) {
        jo.p.h(n0Var, "event");
        if (z6().j1().f() != null) {
            throw null;
        }
    }

    @dq.l
    public final void onEvent(k.a aVar) {
        jo.p.h(aVar, "event");
        n7(nd.c.Companion.a(aVar.a().getType()), aVar.a().getTitle(), aVar.a().getUrl(), EventBannerWhere.VIEW_COMMENT_LIST);
    }

    @dq.l
    public final void onEvent(nd.k0 k0Var) {
        rb.d dVar;
        jo.p.h(k0Var, "event");
        if (!this.f22000u0 || (dVar = this.f21991o1) == null) {
            return;
        }
        dVar.a(k0Var.a(), k0Var.b());
    }
}
