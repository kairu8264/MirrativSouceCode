package com.dena.mirrativ.user.mypage;

import ae.a8;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrativ.mirrativapi.user.LabelRemainingPeriod;
import com.dena.mirrativ.mirrativapi.user.LatestRewardResponse;
import com.dena.mirrativ.user.mypage.MyPageFragment;
import com.dena.mirrativ.user.mypage.profile.ProfileEditActivity;
import com.dena.mirrorman.ChooseReceiver;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.ContinuousLiveRibbonTapLog;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.AnniversaryFollowBalloonView;
import com.dena.mirrorman.customview.AnniversaryStreamBalloonView;
import com.dena.mirrorman.customview.BeginnerStreamHolidayBalloonView;
import com.dena.mirrorman.customview.BirthdayBalloonView;
import com.dena.mirrorman.customview.CheckMonthlyRankingBalloonView;
import com.dena.mirrorman.customview.ContinuousStreamBalloonView;
import com.dena.mirrorman.customview.MyPageContinuousLivePromotionView;
import com.dena.mirrorman.customview.RibbonRemainingLabelView;
import com.dena.mirrorman.customview.StreamHolidayBalloonView;
import com.dena.mirrorman.feature.app.AppPageActivity;
import com.dena.mirrorman.fragment.EmomoUserViewFragment;
import com.dena.mirrorman.fragment.RegisterOrLoginWithTwitterFragment;
import com.dena.mirrorman.net.MRUrl;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.Chat;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.net.api.response.user.Anniversary;
import com.dena.mirrorman.net.api.response.user.AnniversaryType;
import com.dena.mirrorman.net.api.response.user.UserLink;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import gf.c0;
import hf.o0;
import ia.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import jf.b0;
import kq.a;
import nd.c;
import pc.g2;
import tb.c;
import ud.b4;
import ud.g3;
import ud.l2;
import ud.m2;
import uo.i2;
import uo.o2;
import yd.t1;

/* loaded from: classes2.dex */
public final class MyPageFragment extends Fragment implements fd.f, be.w, vb.i, uo.q0 {

    /* renamed from: b1  reason: collision with root package name */
    public static final a f24273b1 = new a(null);

    /* renamed from: c1  reason: collision with root package name */
    public static final int f24274c1 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final wn.f G0;
    public final wn.f H0;
    public final wn.f I0;
    public final wn.f J0;
    public final FragmentRunner K0;
    public final wn.f L0;
    public final wn.f M0;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public od.z W0;
    public final l2 X0;
    public a8 Y0;
    public final androidx.activity.result.c<Intent> Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f24275a1;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f24276x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final ao.g f24277y0;

    /* renamed from: z0  reason: collision with root package name */
    public g2 f24278z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<wn.v> {
        public a0() {
            super(0);
        }

        public final void a() {
            MyPageFragment myPageFragment = MyPageFragment.this;
            tb.c o42 = myPageFragment.o4();
            Context N2 = MyPageFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            myPageFragment.f3(o42.r0(N2, 2, null, null));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a1 extends jo.q implements io.a<od.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24280w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24281x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24282y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24280w = componentCallbacks;
            this.f24281x = aVar;
            this.f24282y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.h] */
        @Override // io.a
        public final od.h invoke() {
            ComponentCallbacks componentCallbacks = this.f24280w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.h.class), this.f24281x, this.f24282y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ia.a {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            g2 g2Var = MyPageFragment.this.f24278z0;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            g2Var.f46436t0.setVisibility(8);
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
    public static final class b0 extends jo.q implements io.l<Integer, wn.v> {
        public b0() {
            super(1);
        }

        public final void a(int i10) {
            App.AppParams appParams;
            List<App.AppParams> f10 = MyPageFragment.this.n4().r().f();
            if (f10 == null || (appParams = f10.get(i10)) == null) {
                return;
            }
            MyPageFragment myPageFragment = MyPageFragment.this;
            AppPageActivity.a aVar = AppPageActivity.f25660c0;
            Context N2 = myPageFragment.N2();
            jo.p.g(N2, "requireContext()");
            myPageFragment.f3(aVar.a(N2, appParams.getAppId(), Referer.MY_PAGE, appParams));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b1 extends jo.q implements io.a<od.s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24285w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24286x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24287y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24285w = componentCallbacks;
            this.f24286x = aVar;
            this.f24287y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.s, java.lang.Object] */
        @Override // io.a
        public final od.s invoke() {
            ComponentCallbacks componentCallbacks = this.f24285w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.s.class), this.f24286x, this.f24287y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$16", f = "MyPageFragment.kt", l = {1563}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24288w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24289x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24290y;

        /* renamed from: z  reason: collision with root package name */
        public int f24291z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #2 {all -> 0x008d, blocks: (B:17:0x0054, B:19:0x005c), top: B:34:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
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
                int r1 = r8.f24291z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f24290y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f24289x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f24288w
                com.dena.mirrativ.user.mypage.MyPageFragment r4 = (com.dena.mirrativ.user.mypage.MyPageFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L90
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
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                nf.o r9 = com.dena.mirrativ.user.mypage.MyPageFragment.P3(r9)
                wo.x r3 = r9.B()
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L90
                r4 = r9
                r9 = r8
            L3d:
                r9.f24288w = r4     // Catch: java.lang.Throwable -> L90
                r9.f24289x = r3     // Catch: java.lang.Throwable -> L90
                r9.f24290y = r1     // Catch: java.lang.Throwable -> L90
                r9.f24291z = r2     // Catch: java.lang.Throwable -> L90
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L90
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L8d
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L8d
                if (r9 == 0) goto L87
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L8d
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L8d
                com.dena.mirrativ.user.mypage.MyPageFragment.a4(r5)     // Catch: java.lang.Throwable -> L8d
                rc.r0 r9 = com.dena.mirrativ.user.mypage.MyPageFragment.S3(r5)     // Catch: java.lang.Throwable -> L8d
                r9.P()     // Catch: java.lang.Throwable -> L8d
                rc.r0 r9 = com.dena.mirrativ.user.mypage.MyPageFragment.S3(r5)     // Catch: java.lang.Throwable -> L8d
                r9.D()     // Catch: java.lang.Throwable -> L8d
                rc.r0 r9 = com.dena.mirrativ.user.mypage.MyPageFragment.S3(r5)     // Catch: java.lang.Throwable -> L8d
                r9.F()     // Catch: java.lang.Throwable -> L8d
                od.p r9 = com.dena.mirrativ.user.mypage.MyPageFragment.O3(r5)     // Catch: java.lang.Throwable -> L8d
                r9.v()     // Catch: java.lang.Throwable -> L8d
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L87:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L8d:
                r9 = move-exception
                r3 = r4
                goto L91
            L90:
                r9 = move-exception
            L91:
                throw r9     // Catch: java.lang.Throwable -> L92
            L92:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.l<View, wn.v> {
        public c0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MyPageFragment myPageFragment = MyPageFragment.this;
            tb.c o42 = myPageFragment.o4();
            Context N2 = MyPageFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            myPageFragment.f3(o42.C0(N2));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c1 extends jo.q implements io.a<nf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24293w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24294x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24295y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24293w = componentCallbacks;
            this.f24294x = aVar;
            this.f24295y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.r] */
        @Override // io.a
        public final nf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f24293w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.r.class), this.f24294x, this.f24295y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$17", f = "MyPageFragment.kt", l = {1563}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24296w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24297x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24298y;

        /* renamed from: z  reason: collision with root package name */
        public int f24299z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f), top: B:37:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:37:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f24299z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f24298y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f24297x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f24296w
                com.dena.mirrativ.user.mypage.MyPageFragment r4 = (com.dena.mirrativ.user.mypage.MyPageFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> La2
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
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                nf.o r9 = com.dena.mirrativ.user.mypage.MyPageFragment.P3(r9)
                wo.x r3 = r9.A()
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La2
                r4 = r9
                r9 = r8
            L3d:
                r9.f24296w = r4     // Catch: java.lang.Throwable -> La2
                r9.f24297x = r3     // Catch: java.lang.Throwable -> La2
                r9.f24298y = r1     // Catch: java.lang.Throwable -> La2
                r9.f24299z = r2     // Catch: java.lang.Throwable -> La2
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> La2
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9f
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9f
                r6 = 0
                if (r9 == 0) goto L99
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L9f
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L9f
                od.z r9 = com.dena.mirrativ.user.mypage.MyPageFragment.R3(r5)     // Catch: java.lang.Throwable -> L9f
                if (r9 != 0) goto L6e
                java.lang.String r9 = "mainActionCreator"
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L9f
                goto L6f
            L6e:
                r6 = r9
            L6f:
                r6.t()     // Catch: java.lang.Throwable -> L9f
                com.dena.mirrativ.user.mypage.MyPageFragment.a4(r5)     // Catch: java.lang.Throwable -> L9f
                rc.r0 r9 = com.dena.mirrativ.user.mypage.MyPageFragment.S3(r5)     // Catch: java.lang.Throwable -> L9f
                r9.D()     // Catch: java.lang.Throwable -> L9f
                rc.r0 r9 = com.dena.mirrativ.user.mypage.MyPageFragment.S3(r5)     // Catch: java.lang.Throwable -> L9f
                r9.F()     // Catch: java.lang.Throwable -> L9f
                od.p r9 = com.dena.mirrativ.user.mypage.MyPageFragment.O3(r5)     // Catch: java.lang.Throwable -> L9f
                r9.v()     // Catch: java.lang.Throwable -> L9f
                od.p r9 = com.dena.mirrativ.user.mypage.MyPageFragment.O3(r5)     // Catch: java.lang.Throwable -> L9f
                jf.i0 r6 = jf.i0.MY_PAGE     // Catch: java.lang.Throwable -> L9f
                r9.C(r6)     // Catch: java.lang.Throwable -> L9f
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L99:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L9f:
                r9 = move-exception
                r3 = r4
                goto La3
            La2:
                r9 = move-exception
            La3:
                throw r9     // Catch: java.lang.Throwable -> La4
            La4:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends RecyclerView.u {
        public d0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            List<App.AppParams> f10;
            String f11;
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (f10 = MyPageFragment.this.n4().r().f()) == null || (f11 = MyPageFragment.this.n4().t().f()) == null || jo.p.c(MyPageFragment.this.n4().G().f(), Boolean.TRUE)) {
                return;
            }
            if ((f11.length() == 0) || f10.size() > linearLayoutManager.l2() + 10) {
                return;
            }
            MyPageFragment.this.m4().j(f11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d1 extends jo.q implements io.a<od.i0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24301w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24302x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24303y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24301w = componentCallbacks;
            this.f24302x = aVar;
            this.f24303y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.i0] */
        @Override // io.a
        public final od.i0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24301w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.i0.class), this.f24302x, this.f24303y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$18", f = "MyPageFragment.kt", l = {1563, 996}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public Object A;
        public int B;

        /* renamed from: w  reason: collision with root package name */
        public Object f24304w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24305x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24306y;

        /* renamed from: z  reason: collision with root package name */
        public Object f24307z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Context f24308w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24309x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ jf.t0 f24310y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, MyPageFragment myPageFragment, jf.t0 t0Var) {
                super(0);
                this.f24308w = context;
                this.f24309x = myPageFragment;
                this.f24310y = t0Var;
            }

            public final void a() {
                Context context = this.f24308w;
                jo.p.g(context, "it");
                FragmentManager p02 = this.f24309x.p0();
                jo.p.g(p02, "childFragmentManager");
                new hf.p0(context, p02, this.f24310y).a();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
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

        /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:7:0x0023, B:28:0x009f, B:30:0x00b1, B:32:0x00b5, B:34:0x00bb, B:35:0x00c1, B:16:0x0059, B:20:0x006f, B:22:0x0077, B:24:0x0083, B:12:0x003e, B:15:0x0054), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:7:0x0023, B:28:0x009f, B:30:0x00b1, B:32:0x00b5, B:34:0x00bb, B:35:0x00c1, B:16:0x0059, B:20:0x006f, B:22:0x0077, B:24:0x0083, B:12:0x003e, B:15:0x0054), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009c -> B:28:0x009f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:30:0x00b1). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.l<View, wn.v> {
        public e0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            if (g2Var.f46439w0.getVisibility() != 0) {
                g2 g2Var3 = MyPageFragment.this.f24278z0;
                if (g2Var3 == null) {
                    jo.p.v("binding");
                    g2Var3 = null;
                }
                if (g2Var3.W.getVisibility() != 0) {
                    g2 g2Var4 = MyPageFragment.this.f24278z0;
                    if (g2Var4 == null) {
                        jo.p.v("binding");
                        g2Var4 = null;
                    }
                    if (g2Var4.M.getVisibility() != 0) {
                        g2 g2Var5 = MyPageFragment.this.f24278z0;
                        if (g2Var5 == null) {
                            jo.p.v("binding");
                            g2Var5 = null;
                        }
                        if (g2Var5.C.getVisibility() != 0) {
                            g2 g2Var6 = MyPageFragment.this.f24278z0;
                            if (g2Var6 == null) {
                                jo.p.v("binding");
                                g2Var6 = null;
                            }
                            if (g2Var6.B.getVisibility() != 0) {
                                g2 g2Var7 = MyPageFragment.this.f24278z0;
                                if (g2Var7 == null) {
                                    jo.p.v("binding");
                                    g2Var7 = null;
                                }
                                if (g2Var7.P.getVisibility() != 0) {
                                    g2 g2Var8 = MyPageFragment.this.f24278z0;
                                    if (g2Var8 == null) {
                                        jo.p.v("binding");
                                    } else {
                                        g2Var2 = g2Var8;
                                    }
                                    if (g2Var2.f46439w0.getVisibility() == 0) {
                                        return;
                                    }
                                    MyPageFragment myPageFragment = MyPageFragment.this;
                                    WebViewActivity.a aVar = WebViewActivity.X;
                                    Context N2 = myPageFragment.N2();
                                    jo.p.g(N2, "requireContext()");
                                    String f10 = MyPageFragment.this.l4().q().f();
                                    if (f10 == null) {
                                        f10 = "";
                                    }
                                    myPageFragment.f3(WebViewActivity.a.b(aVar, N2, f10, false, false, 12, null));
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e1 extends jo.q implements io.a<nf.c0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24312w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24313x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24314y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24312w = componentCallbacks;
            this.f24313x = aVar;
            this.f24314y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c0] */
        @Override // io.a
        public final nf.c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24312w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.c0.class), this.f24313x, this.f24314y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$19", f = "MyPageFragment.kt", l = {1563}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24315w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24316x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24317y;

        /* renamed from: z  reason: collision with root package name */
        public int f24318z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068, B:23:0x006c, B:24:0x0070, B:26:0x0074, B:27:0x007a, B:29:0x007f, B:30:0x008b), top: B:41:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
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
                int r1 = r10.f24318z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f24317y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f24316x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f24315w
                com.dena.mirrativ.user.mypage.MyPageFragment r4 = (com.dena.mirrativ.user.mypage.MyPageFragment) r4
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
                com.dena.mirrativ.user.mypage.MyPageFragment r11 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                nf.o r11 = com.dena.mirrativ.user.mypage.MyPageFragment.P3(r11)
                wo.x r3 = r11.D()
                com.dena.mirrativ.user.mypage.MyPageFragment r11 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La5
                r4 = r11
                r11 = r10
            L3d:
                r11.f24315w = r4     // Catch: java.lang.Throwable -> La5
                r11.f24316x = r3     // Catch: java.lang.Throwable -> La5
                r11.f24317y = r1     // Catch: java.lang.Throwable -> La5
                r11.f24318z = r2     // Catch: java.lang.Throwable -> La5
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
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> La2
                android.content.Context r6 = r5.q0()     // Catch: java.lang.Throwable -> La2
                if (r6 == 0) goto L96
                boolean r7 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La2
                if (r7 == 0) goto L70
                of.n.z(r6)     // Catch: java.lang.Throwable -> La2
                goto L96
            L70:
                boolean r7 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Maintenance     // Catch: java.lang.Throwable -> La2
                if (r7 == 0) goto L7a
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> La2
                r7.l(r6, r11)     // Catch: java.lang.Throwable -> La2
                goto L96
            L7a:
                boolean r7 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La2
                r8 = 0
                if (r7 == 0) goto L8b
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> La2
                com.dena.mirrativ.mirrativapi.core.MRError$Failure r11 = (com.dena.mirrativ.mirrativapi.core.MRError.Failure) r11     // Catch: java.lang.Throwable -> La2
                java.lang.String r11 = r11.getErrorMessage()     // Catch: java.lang.Throwable -> La2
                r7.B(r6, r11, r8)     // Catch: java.lang.Throwable -> La2
                goto L96
            L8b:
                of.n r11 = of.n.f45411a     // Catch: java.lang.Throwable -> La2
                int r7 = nc.i.f41878g     // Catch: java.lang.Throwable -> La2
                java.lang.String r7 = r5.U0(r7)     // Catch: java.lang.Throwable -> La2
                r11.B(r6, r7, r8)     // Catch: java.lang.Throwable -> La2
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends RecyclerView.u {
        public f0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            if (g2Var.f46436t0.getVisibility() == 0) {
                g2 g2Var3 = MyPageFragment.this.f24278z0;
                if (g2Var3 == null) {
                    jo.p.v("binding");
                    g2Var3 = null;
                }
                FrameLayout frameLayout = g2Var3.f46436t0;
                frameLayout.clearAnimation();
                frameLayout.setVisibility(8);
            }
            if (jo.p.c(MyPageFragment.this.X0.z().f(), Boolean.TRUE)) {
                g2 g2Var4 = MyPageFragment.this.f24278z0;
                if (g2Var4 == null) {
                    jo.p.v("binding");
                } else {
                    g2Var2 = g2Var4;
                }
                g2Var2.W.clearAnimation();
                MyPageFragment.this.X0.z().p(Boolean.FALSE);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f1 extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24320w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24321x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24322y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24320w = componentCallbacks;
            this.f24321x = aVar;
            this.f24322y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f24320w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f24321x, this.f24322y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.p<Integer, View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ UserMe f24323w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ MyPageFragment f24324x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(UserMe userMe, MyPageFragment myPageFragment) {
            super(2);
            this.f24323w = userMe;
            this.f24324x = myPageFragment;
        }

        public final void a(int i10, View view) {
            AnniversaryType type;
            jo.p.h(view, "view");
            RibbonResponse ribbonResponse = this.f24323w.getRibbons().get(i10);
            if (this.f24324x.X0.n() && ribbonResponse.isContinuousRibbon()) {
                this.f24324x.X0.M(false);
                UserMe f10 = this.f24324x.t4().B().f();
                if (f10 != null) {
                    MyPageFragment myPageFragment = this.f24324x;
                    Anniversary anniversary = f10.getAnniversary();
                    boolean z10 = true;
                    if (anniversary == null || (type = anniversary.getType()) == null || !type.isStreamContinuous()) {
                        z10 = false;
                    }
                    if (z10) {
                        myPageFragment.n5(view);
                    } else {
                        myPageFragment.r5(view);
                    }
                }
            }
            if (!ribbonResponse.isLabel() || ribbonResponse.getLabelRemainingPeriod() == null) {
                return;
            }
            LabelRemainingPeriod labelRemainingPeriod = ribbonResponse.getLabelRemainingPeriod();
            jo.p.e(labelRemainingPeriod);
            if (labelRemainingPeriod.getRemainSeconds() < 345600) {
                MyPageFragment myPageFragment2 = this.f24324x;
                LabelRemainingPeriod labelRemainingPeriod2 = ribbonResponse.getLabelRemainingPeriod();
                jo.p.e(labelRemainingPeriod2);
                myPageFragment2.x5(view, labelRemainingPeriod2, false);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, View view) {
            a(num.intValue(), view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends ViewPager.n {
        public g0() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            MyPageFragment.this.A5(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g1 extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24326w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24327x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24328y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24326w = componentCallbacks;
            this.f24327x = aVar;
            this.f24328y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f24326w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.p.class), this.f24327x, this.f24328y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.p<Integer, View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ UserMe f24329w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ MyPageFragment f24330x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(UserMe userMe, MyPageFragment myPageFragment) {
            super(2);
            this.f24329w = userMe;
            this.f24330x = myPageFragment;
        }

        public final void a(int i10, View view) {
            jo.p.h(view, "view");
            RibbonResponse ribbonResponse = this.f24329w.getRibbons().get(i10);
            g2 g2Var = null;
            if (ribbonResponse.isContinuousRibbon()) {
                Boolean f10 = this.f24330x.X0.z().f();
                Boolean bool = Boolean.TRUE;
                if (jo.p.c(f10, bool)) {
                    g2 g2Var2 = this.f24330x.f24278z0;
                    if (g2Var2 == null) {
                        jo.p.v("binding");
                    } else {
                        g2Var = g2Var2;
                    }
                    g2Var.W.clearAnimation();
                    this.f24330x.X0.z().p(Boolean.FALSE);
                } else if (jo.p.c(this.f24330x.X0.K().f(), bool)) {
                    g2 g2Var3 = this.f24330x.f24278z0;
                    if (g2Var3 == null) {
                        jo.p.v("binding");
                    } else {
                        g2Var = g2Var3;
                    }
                    g2Var.f46439w0.clearAnimation();
                    this.f24330x.X0.K().p(Boolean.FALSE);
                } else if (jo.p.c(this.f24330x.X0.u().f(), bool)) {
                    g2 g2Var4 = this.f24330x.f24278z0;
                    if (g2Var4 == null) {
                        jo.p.v("binding");
                    } else {
                        g2Var = g2Var4;
                    }
                    g2Var.C.clearAnimation();
                    this.f24330x.X0.u().p(Boolean.FALSE);
                } else {
                    this.f24330x.r5(view);
                }
            } else if (ribbonResponse.getLabelRemainingPeriod() != null) {
                g2 g2Var5 = this.f24330x.f24278z0;
                if (g2Var5 == null) {
                    jo.p.v("binding");
                    g2Var5 = null;
                }
                if (g2Var5.f46436t0.getVisibility() == 0) {
                    MyPageFragment.G4(this.f24330x, 0L, 1, null);
                    return;
                }
                MyPageFragment myPageFragment = this.f24330x;
                LabelRemainingPeriod labelRemainingPeriod = ribbonResponse.getLabelRemainingPeriod();
                jo.p.e(labelRemainingPeriod);
                MyPageFragment.y5(myPageFragment, view, labelRemainingPeriod, false, 4, null);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, View view) {
            a(num.intValue(), view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.l<View, wn.v> {
        public h0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            if (Integer.MAX_VALUE == g2Var.N.getMaxLines()) {
                g2 g2Var3 = MyPageFragment.this.f24278z0;
                if (g2Var3 == null) {
                    jo.p.v("binding");
                    g2Var3 = null;
                }
                g2Var3.N.setMaxLines(3);
                g2 g2Var4 = MyPageFragment.this.f24278z0;
                if (g2Var4 == null) {
                    jo.p.v("binding");
                } else {
                    g2Var2 = g2Var4;
                }
                g2Var2.f46431o0.setText(MyPageFragment.this.O0().getString(nc.i.Q2));
                return;
            }
            g5.b bVar = new g5.b();
            bVar.b0(300L);
            g2 g2Var5 = MyPageFragment.this.f24278z0;
            if (g2Var5 == null) {
                jo.p.v("binding");
                g2Var5 = null;
            }
            bVar.c(g2Var5.N.getId());
            g2 g2Var6 = MyPageFragment.this.f24278z0;
            if (g2Var6 == null) {
                jo.p.v("binding");
                g2Var6 = null;
            }
            bVar.c(g2Var6.E.getId());
            g2 g2Var7 = MyPageFragment.this.f24278z0;
            if (g2Var7 == null) {
                jo.p.v("binding");
                g2Var7 = null;
            }
            g5.o.a(g2Var7.E, bVar);
            g2 g2Var8 = MyPageFragment.this.f24278z0;
            if (g2Var8 == null) {
                jo.p.v("binding");
                g2Var8 = null;
            }
            g2Var8.N.setMaxLines(Integer.MAX_VALUE);
            g2 g2Var9 = MyPageFragment.this.f24278z0;
            if (g2Var9 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var9;
            }
            g2Var2.f46431o0.setText(MyPageFragment.this.O0().getString(nc.i.U0));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h1 extends jo.q implements io.a<hf.o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24332w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24333x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24334y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24332w = componentCallbacks;
            this.f24333x = aVar;
            this.f24334y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.o0, java.lang.Object] */
        @Override // io.a
        public final hf.o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24332w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.o0.class), this.f24333x, this.f24334y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<wn.v> {
        public i() {
            super(0);
        }

        public final void a() {
            MyPageFragment myPageFragment = MyPageFragment.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = myPageFragment.N2();
            jo.p.g(N2, "requireContext()");
            myPageFragment.f3(WebViewActivity.a.b(aVar, N2, MRUrl.ContinuousLive.INSTANCE.getUrl(), false, false, 12, null));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends jo.q implements io.l<View, wn.v> {
        public i0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MyPageFragment.this.z5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i1 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24337w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24338x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24339y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24337w = componentCallbacks;
            this.f24338x = aVar;
            this.f24339y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24337w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f24338x, this.f24339y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24341x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UserMe userMe) {
            super(0);
            this.f24341x = userMe;
        }

        public final void a() {
            g2 g2Var = MyPageFragment.this.f24278z0;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            g2Var.M.clearAnimation();
            MyPageFragment.this.o5(this.f24341x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$setupUserActions$9$1", f = "MyPageFragment.kt", l = {570}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24342w;

        /* renamed from: x  reason: collision with root package name */
        public int f24343x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f24345z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str, ao.d<? super j0> dVar) {
            super(2, dVar);
            this.f24345z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j0(this.f24345z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            androidx.fragment.app.h hVar;
            Object c10 = bo.c.c();
            int i10 = this.f24343x;
            if (i10 == 0) {
                wn.m.b(obj);
                androidx.fragment.app.h j02 = MyPageFragment.this.j0();
                if (j02 == null) {
                    return wn.v.f59242a;
                }
                MainActivity mainActivity = j02 instanceof MainActivity ? (MainActivity) j02 : null;
                if (mainActivity != null) {
                    mainActivity.V4();
                }
                hf.o0 z42 = MyPageFragment.this.z4();
                FragmentManager p02 = MyPageFragment.this.p0();
                jo.p.g(p02, "childFragmentManager");
                String str = this.f24345z;
                this.f24342w = j02;
                this.f24343x = 1;
                Object j10 = z42.j(j02, p02, str, this);
                if (j10 == c10) {
                    return c10;
                }
                hVar = j02;
                obj = j10;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                hVar = (androidx.fragment.app.h) this.f24342w;
                wn.m.b(obj);
            }
            wn.p pVar = (wn.p) obj;
            o0.b bVar = (o0.b) pVar.a();
            Social.SocialAccount socialAccount = (Social.SocialAccount) pVar.b();
            in.x xVar = (in.x) pVar.c();
            MainActivity mainActivity2 = hVar instanceof MainActivity ? hVar : null;
            if (mainActivity2 != null) {
                mainActivity2.b4();
            }
            if (bVar == o0.b.Success) {
                jo.p.e(socialAccount);
                Integer isFollowOfficialTwitter = socialAccount.isFollowOfficialTwitter();
                if (isFollowOfficialTwitter != null && isFollowOfficialTwitter.intValue() == 0) {
                    c0.a aVar = gf.c0.Q0;
                    String str2 = this.f24345z;
                    jo.p.e(xVar);
                    String c11 = xVar.c();
                    jo.p.g(c11, "twitterSession!!.userName");
                    aVar.a(str2, c11).z3(MyPageFragment.this.p0(), "FollowOfficialTwitterAccountDialog");
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j1 extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24346w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24347x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24348y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24346w = componentCallbacks;
            this.f24347x = aVar;
            this.f24348y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24346w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f24347x, this.f24348y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends f8.c<Bitmap> {
        public k() {
        }

        @Override // f8.j
        /* renamed from: a */
        public void e(Bitmap bitmap, g8.b<? super Bitmap> bVar) {
            jo.p.h(bitmap, "resource");
            rc.r0 s42 = MyPageFragment.this.s4();
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            int height = g2Var.f46441y0.getHeight();
            g2 g2Var3 = MyPageFragment.this.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var3;
            }
            s42.v(bitmap, height, g2Var2.f46441y0.getWidth());
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends jo.q implements io.p<MRLogger, String, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final k0 f24350w = new k0();

        public k0() {
            super(2);
        }

        public final void a(MRLogger mRLogger, String str) {
            jo.p.h(mRLogger, "logger");
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_PROFILE_SHARE_DONE);
            builder.setServiceName(str);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, Referer.MY_PAGE)));
            mRLogger.sendLog(builder.build());
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(MRLogger mRLogger, String str) {
            a(mRLogger, str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k1 extends jo.q implements io.a<of.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24351w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24352x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24353y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24351w = componentCallbacks;
            this.f24352x = aVar;
            this.f24353y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.r, java.lang.Object] */
        @Override // io.a
        public final of.r invoke() {
            ComponentCallbacks componentCallbacks = this.f24351w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.r.class), this.f24352x, this.f24353y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24355x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(UserMe userMe) {
            super(0);
            this.f24355x = userMe;
        }

        public final void a() {
            MyPageFragment.this.w5(this.f24355x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 implements ia.a {
        public l0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MyPageFragment.this.X0.t().p(Boolean.FALSE);
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
    public static final class l1 extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24357w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24358x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24359y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24357w = componentCallbacks;
            this.f24358x = aVar;
            this.f24359y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f24357w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f24358x, this.f24359y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24361x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(UserMe userMe) {
            super(0);
            this.f24361x = userMe;
        }

        public final void a() {
            MyPageFragment.this.w5(this.f24361x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Anniversary f24363x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ View f24364y;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24365a;

            public a(MyPageFragment myPageFragment) {
                this.f24365a = myPageFragment;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f24365a.X0.u().p(Boolean.FALSE);
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

        public m0(Anniversary anniversary, View view) {
            this.f24363x = anniversary;
            this.f24364y = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            g2Var.C.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            g2 g2Var3 = MyPageFragment.this.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
                g2Var3 = null;
            }
            g2Var3.C.a(this.f24363x, true);
            int[] iArr = new int[2];
            this.f24364y.getLocationOnScreen(iArr);
            g2 g2Var4 = MyPageFragment.this.f24278z0;
            if (g2Var4 == null) {
                jo.p.v("binding");
                g2Var4 = null;
            }
            AnniversaryStreamBalloonView anniversaryStreamBalloonView = g2Var4.C;
            float f10 = iArr[0];
            g2 g2Var5 = MyPageFragment.this.f24278z0;
            if (g2Var5 == null) {
                jo.p.v("binding");
                g2Var5 = null;
            }
            anniversaryStreamBalloonView.setX((f10 - (g2Var5.C.getWidth() / 2)) + (this.f24364y.getWidth() / 2));
            g2 g2Var6 = MyPageFragment.this.f24278z0;
            if (g2Var6 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var6;
            }
            AnniversaryStreamBalloonView anniversaryStreamBalloonView2 = g2Var2.C;
            AnimationSet animationSet = new AnimationSet(false);
            MyPageFragment myPageFragment = MyPageFragment.this;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            alphaAnimation2.setStartOffset(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            alphaAnimation2.setDuration(300L);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setAnimationListener(new a(myPageFragment));
            anniversaryStreamBalloonView2.startAnimation(animationSet);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m1 extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24366w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24367x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24368y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24366w = componentCallbacks;
            this.f24367x = aVar;
            this.f24368y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f24366w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f24367x, this.f24368y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$20", f = "MyPageFragment.kt", l = {1563}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24369w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24370x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24371y;

        /* renamed from: z  reason: collision with root package name */
        public int f24372z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068, B:23:0x006c, B:24:0x0070, B:26:0x0074, B:27:0x007a, B:29:0x007e, B:30:0x008b), top: B:41:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
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
                int r1 = r10.f24372z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f24371y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f24370x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f24369w
                com.dena.mirrativ.user.mypage.MyPageFragment r4 = (com.dena.mirrativ.user.mypage.MyPageFragment) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L9d
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
                com.dena.mirrativ.user.mypage.MyPageFragment r11 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                rc.u1 r11 = com.dena.mirrativ.user.mypage.MyPageFragment.U3(r11)
                wo.x r3 = r11.v()
                com.dena.mirrativ.user.mypage.MyPageFragment r11 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9d
                r4 = r11
                r11 = r10
            L3d:
                r11.f24369w = r4     // Catch: java.lang.Throwable -> L9d
                r11.f24370x = r3     // Catch: java.lang.Throwable -> L9d
                r11.f24371y = r1     // Catch: java.lang.Throwable -> L9d
                r11.f24372z = r2     // Catch: java.lang.Throwable -> L9d
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> L9d
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
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L9a
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L9a
                if (r11 == 0) goto L94
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L9a
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> L9a
                android.content.Context r6 = r5.q0()     // Catch: java.lang.Throwable -> L9a
                if (r6 == 0) goto L8e
                boolean r7 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> L9a
                if (r7 == 0) goto L70
                of.n.z(r6)     // Catch: java.lang.Throwable -> L9a
                goto L8e
            L70:
                boolean r7 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Maintenance     // Catch: java.lang.Throwable -> L9a
                if (r7 == 0) goto L7a
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> L9a
                r7.l(r6, r11)     // Catch: java.lang.Throwable -> L9a
                goto L8e
            L7a:
                boolean r7 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> L9a
                if (r7 == 0) goto L8b
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> L9a
                com.dena.mirrativ.mirrativapi.core.MRError$Failure r11 = (com.dena.mirrativ.mirrativapi.core.MRError.Failure) r11     // Catch: java.lang.Throwable -> L9a
                java.lang.String r11 = r11.getErrorMessage()     // Catch: java.lang.Throwable -> L9a
                r8 = 0
                r7.B(r6, r11, r8)     // Catch: java.lang.Throwable -> L9a
                goto L8e
            L8b:
                of.n.z(r6)     // Catch: java.lang.Throwable -> L9a
            L8e:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L94:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            L9a:
                r11 = move-exception
                r3 = r4
                goto L9e
            L9d:
                r11 = move-exception
            L9e:
                throw r11     // Catch: java.lang.Throwable -> L9f
            L9f:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class n0 extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24374x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(UserMe userMe) {
            super(0);
            this.f24374x = userMe;
        }

        public final void a() {
            MyPageFragment.this.w5(this.f24374x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n1 extends jo.q implements io.a<od.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24375w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24376x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24377y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24375w = componentCallbacks;
            this.f24376x = aVar;
            this.f24377y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.i, java.lang.Object] */
        @Override // io.a
        public final od.i invoke() {
            ComponentCallbacks componentCallbacks = this.f24375w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.i.class), this.f24376x, this.f24377y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$21", f = "MyPageFragment.kt", l = {1563}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24378w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24379x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24380y;

        /* renamed from: z  reason: collision with root package name */
        public int f24381z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f), top: B:33:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:33:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f24381z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f24380y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f24379x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f24378w
                com.dena.mirrativ.user.mypage.MyPageFragment r4 = (com.dena.mirrativ.user.mypage.MyPageFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L83
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
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                nf.o r9 = com.dena.mirrativ.user.mypage.MyPageFragment.P3(r9)
                wo.x r3 = r9.v()
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L83
                r4 = r9
                r9 = r8
            L3d:
                r9.f24378w = r4     // Catch: java.lang.Throwable -> L83
                r9.f24379x = r3     // Catch: java.lang.Throwable -> L83
                r9.f24380y = r1     // Catch: java.lang.Throwable -> L83
                r9.f24381z = r2     // Catch: java.lang.Throwable -> L83
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L83
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L80
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L80
                r6 = 0
                if (r9 == 0) goto L7a
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L80
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L80
                pc.g2 r9 = com.dena.mirrativ.user.mypage.MyPageFragment.L3(r5)     // Catch: java.lang.Throwable -> L80
                if (r9 != 0) goto L6e
                java.lang.String r9 = "binding"
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L80
                goto L6f
            L6e:
                r6 = r9
            L6f:
                com.google.android.material.appbar.AppBarLayout r9 = r6.D     // Catch: java.lang.Throwable -> L80
                r9.r(r2, r2)     // Catch: java.lang.Throwable -> L80
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7a:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L80:
                r9 = move-exception
                r3 = r4
                goto L84
            L83:
                r9 = move-exception
            L84:
                throw r9     // Catch: java.lang.Throwable -> L85
            L85:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 implements ia.a {
        public o0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MyPageFragment.this.X0.v().p(Boolean.FALSE);
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
    public static final class o1 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f24383w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(Fragment fragment) {
            super(0);
            this.f24383w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f24383w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$22", f = "MyPageFragment.kt", l = {1563}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24384w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24385x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24386y;

        /* renamed from: z  reason: collision with root package name */
        public int f24387z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24388w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MyPageFragment myPageFragment) {
                super(0);
                this.f24388w = myPageFragment;
            }

            public final void a() {
                be.v.R0.a().z3(this.f24388w.p0(), "ChooseMyProfileDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
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
                int r1 = r8.f24387z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f24386y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f24385x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f24384w
                com.dena.mirrativ.user.mypage.MyPageFragment r4 = (com.dena.mirrativ.user.mypage.MyPageFragment) r4
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
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                rc.u1 r9 = com.dena.mirrativ.user.mypage.MyPageFragment.U3(r9)
                wo.x r3 = r9.G()
                com.dena.mirrativ.user.mypage.MyPageFragment r9 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
                r4 = r9
                r9 = r8
            L3d:
                r9.f24384w = r4     // Catch: java.lang.Throwable -> L7d
                r9.f24385x = r3     // Catch: java.lang.Throwable -> L7d
                r9.f24386y = r1     // Catch: java.lang.Throwable -> L7d
                r9.f24387z = r2     // Catch: java.lang.Throwable -> L7d
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
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrorman.util.FragmentRunner r9 = com.dena.mirrativ.user.mypage.MyPageFragment.N3(r5)     // Catch: java.lang.Throwable -> L7a
                com.dena.mirrativ.user.mypage.MyPageFragment$p$a r6 = new com.dena.mirrativ.user.mypage.MyPageFragment$p$a     // Catch: java.lang.Throwable -> L7a
                r6.<init>(r5)     // Catch: java.lang.Throwable -> L7a
                r9.c(r6)     // Catch: java.lang.Throwable -> L7a
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class p0 implements Animation.AnimationListener {
        public p0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MyPageFragment.this.X0.y().p(Boolean.FALSE);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class p1 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24390w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(io.a aVar) {
            super(0);
            this.f24390w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f24390w.invoke()).b();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$observeStoreValues$23", f = "MyPageFragment.kt", l = {1563}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24391w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24392x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24393y;

        /* renamed from: z  reason: collision with root package name */
        public int f24394z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
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
                int r1 = r9.f24394z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f24393y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f24392x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f24391w
                com.dena.mirrativ.user.mypage.MyPageFragment r4 = (com.dena.mirrativ.user.mypage.MyPageFragment) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L8b
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
                com.dena.mirrativ.user.mypage.MyPageFragment r10 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                rc.u1 r10 = com.dena.mirrativ.user.mypage.MyPageFragment.U3(r10)
                wo.x r3 = r10.H()
                com.dena.mirrativ.user.mypage.MyPageFragment r10 = com.dena.mirrativ.user.mypage.MyPageFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L8b
                r4 = r10
                r10 = r9
            L3d:
                r10.f24391w = r4     // Catch: java.lang.Throwable -> L8b
                r10.f24392x = r3     // Catch: java.lang.Throwable -> L8b
                r10.f24393y = r1     // Catch: java.lang.Throwable -> L8b
                r10.f24394z = r2     // Catch: java.lang.Throwable -> L8b
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L8b
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L88
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L88
                if (r10 == 0) goto L82
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L88
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L88
                int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L88
                rc.r0 r6 = com.dena.mirrativ.user.mypage.MyPageFragment.S3(r5)     // Catch: java.lang.Throwable -> L88
                r6.N()     // Catch: java.lang.Throwable -> L88
                fd.h$a r6 = fd.h.P0     // Catch: java.lang.Throwable -> L88
                fd.h r10 = r6.a(r10)     // Catch: java.lang.Throwable -> L88
                androidx.fragment.app.FragmentManager r6 = r5.p0()     // Catch: java.lang.Throwable -> L88
                java.lang.String r7 = "HolidayPurchaseSuccessDialogFragment"
                r10.z3(r6, r7)     // Catch: java.lang.Throwable -> L88
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L82:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L88:
                r10 = move-exception
                r3 = r4
                goto L8c
            L8b:
                r10 = move-exception
            L8c:
                throw r10     // Catch: java.lang.Throwable -> L8d
            L8d:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyPageFragment.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24396x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ View f24397y;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24398w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ UserMe f24399x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MyPageFragment myPageFragment, UserMe userMe) {
                super(0);
                this.f24398w = myPageFragment;
                this.f24399x = userMe;
            }

            public final void a() {
                this.f24398w.w5(this.f24399x);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24400a;

            public b(MyPageFragment myPageFragment) {
                this.f24400a = myPageFragment;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f24400a.X0.z().p(Boolean.FALSE);
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

        public q0(UserMe userMe, View view) {
            this.f24396x = userMe;
            this.f24397y = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            g2Var.W.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            g2 g2Var3 = MyPageFragment.this.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
                g2Var3 = null;
            }
            ContinuousStreamBalloonView continuousStreamBalloonView = g2Var3.W;
            UserMe userMe = this.f24396x;
            continuousStreamBalloonView.b(userMe, true, new a(MyPageFragment.this, userMe));
            int[] iArr = new int[2];
            this.f24397y.getLocationOnScreen(iArr);
            g2 g2Var4 = MyPageFragment.this.f24278z0;
            if (g2Var4 == null) {
                jo.p.v("binding");
                g2Var4 = null;
            }
            ContinuousStreamBalloonView continuousStreamBalloonView2 = g2Var4.W;
            float f10 = iArr[0];
            g2 g2Var5 = MyPageFragment.this.f24278z0;
            if (g2Var5 == null) {
                jo.p.v("binding");
                g2Var5 = null;
            }
            continuousStreamBalloonView2.setX((f10 - (g2Var5.W.getWidth() / 2)) + (this.f24397y.getWidth() / 2));
            g2 g2Var6 = MyPageFragment.this.f24278z0;
            if (g2Var6 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var6;
            }
            ContinuousStreamBalloonView continuousStreamBalloonView3 = g2Var2.W;
            AnimationSet animationSet = new AnimationSet(false);
            MyPageFragment myPageFragment = MyPageFragment.this;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            alphaAnimation2.setStartOffset(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
            alphaAnimation2.setDuration(300L);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setAnimationListener(new b(myPageFragment));
            continuousStreamBalloonView3.startAnimation(animationSet);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q1 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24401w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24402x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24403y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24404z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24401w = aVar;
            this.f24402x = aVar2;
            this.f24403y = aVar3;
            this.f24404z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24401w;
            vq.a aVar2 = this.f24402x;
            io.a aVar3 = this.f24403y;
            xq.a aVar4 = this.f24404z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(rc.r0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class r implements rd.s {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24406a;

            static {
                int[] iArr = new int[nd.c.values().length];
                iArr[nd.c.EVENT.ordinal()] = 1;
                iArr[nd.c.INTERNAL.ordinal()] = 2;
                iArr[nd.c.NONE.ordinal()] = 3;
                f24406a = iArr;
            }
        }

        public r() {
        }

        @Override // rd.s
        public void a(EventBannerResponse eventBannerResponse, int i10) {
            jo.p.h(eventBannerResponse, "eventBanner");
            c.a aVar = nd.c.Companion;
            int i11 = a.f24406a[aVar.a(eventBannerResponse.getType()).ordinal()];
            if (i11 == 1) {
                jf.b0 a10 = MyPageFragment.this.A4().a(eventBannerResponse.getUrl());
                if (!(a10 instanceof b0.l0)) {
                    MyPageFragment myPageFragment = MyPageFragment.this;
                    HandleUrlSchemeActivity.a aVar2 = HandleUrlSchemeActivity.f25127b0;
                    Context N2 = myPageFragment.N2();
                    jo.p.g(N2, "requireContext()");
                    myPageFragment.f3(aVar2.a(N2, Referer.MY_PAGE, a10));
                }
            } else if (i11 == 2) {
                MyPageFragment myPageFragment2 = MyPageFragment.this;
                HandleUrlSchemeActivity.a aVar3 = HandleUrlSchemeActivity.f25127b0;
                Context N22 = myPageFragment2.N2();
                jo.p.g(N22, "requireContext()");
                myPageFragment2.f3(aVar3.a(N22, Referer.MY_PAGE, MyPageFragment.this.A4().a(eventBannerResponse.getUrl())));
            }
            Puree.d(new EventBannerLog(EventBannerActionType.EVENT_BANNER_CLICK, aVar.a(eventBannerResponse.getType()).e(), eventBannerResponse.getTitle(), EventBannerWhere.MY_PAGE, MyPageFragment.this.n4().q().f(), null, 32, null));
        }

        @Override // rd.s
        public void b(EventBannerResponse eventBannerResponse, int i10) {
            jo.p.h(eventBannerResponse, "eventBanner");
            Puree.d(new EventBannerLog(EventBannerActionType.EVENT_BANNER_IMP, nd.c.Companion.a(eventBannerResponse.getType()).e(), eventBannerResponse.getTitle(), EventBannerWhere.MY_PAGE, MyPageFragment.this.n4().q().f(), null, 32, null));
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24408x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ View f24409y;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24410w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ UserMe f24411x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MyPageFragment myPageFragment, UserMe userMe) {
                super(0);
                this.f24410w = myPageFragment;
                this.f24411x = userMe;
            }

            public final void a() {
                this.f24410w.w5(this.f24411x);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24412a;

            public b(MyPageFragment myPageFragment) {
                this.f24412a = myPageFragment;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f24412a.X0.K().p(Boolean.FALSE);
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

        public r0(UserMe userMe, View view) {
            this.f24408x = userMe;
            this.f24409y = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            g2Var.f46439w0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (MyPageFragment.this.q0() == null) {
                return;
            }
            g2 g2Var3 = MyPageFragment.this.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
                g2Var3 = null;
            }
            StreamHolidayBalloonView streamHolidayBalloonView = g2Var3.f46439w0;
            b4.a aVar = b4.f54792d;
            Resources O0 = MyPageFragment.this.O0();
            jo.p.g(O0, "resources");
            streamHolidayBalloonView.b(aVar.a(O0, this.f24408x, true), new a(MyPageFragment.this, this.f24408x));
            int[] iArr = new int[2];
            this.f24409y.getLocationOnScreen(iArr);
            g2 g2Var4 = MyPageFragment.this.f24278z0;
            if (g2Var4 == null) {
                jo.p.v("binding");
                g2Var4 = null;
            }
            StreamHolidayBalloonView streamHolidayBalloonView2 = g2Var4.f46439w0;
            float f10 = iArr[0];
            g2 g2Var5 = MyPageFragment.this.f24278z0;
            if (g2Var5 == null) {
                jo.p.v("binding");
                g2Var5 = null;
            }
            streamHolidayBalloonView2.setX((f10 - (g2Var5.f46439w0.getWidth() / 2)) + (this.f24409y.getWidth() / 2));
            g2 g2Var6 = MyPageFragment.this.f24278z0;
            if (g2Var6 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var6;
            }
            StreamHolidayBalloonView streamHolidayBalloonView3 = g2Var2.f46439w0;
            AnimationSet animationSet = new AnimationSet(false);
            MyPageFragment myPageFragment = MyPageFragment.this;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            alphaAnimation2.setStartOffset(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
            alphaAnimation2.setDuration(300L);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setAnimationListener(new b(myPageFragment));
            streamHolidayBalloonView3.startAnimation(animationSet);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r1 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24413w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r1(io.a aVar) {
            super(0);
            this.f24413w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f24413w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f24414w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Fragment fragment) {
            super(0);
            this.f24414w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f24414w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f24414w.L2());
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyPageFragment$showEmomoTutorial$1", f = "MyPageFragment.kt", l = {1490}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24415w;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ we.a f24417w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24418x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(we.a aVar, MyPageFragment myPageFragment) {
                super(0);
                this.f24417w = aVar;
                this.f24418x = myPageFragment;
            }

            public final void a() {
                this.f24417w.z3(this.f24418x.p0(), "EmomoTutorialDialog");
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
            public final /* synthetic */ MyPageFragment f24419w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MyPageFragment myPageFragment) {
                super(0);
                this.f24419w = myPageFragment;
            }

            public final void a() {
                this.f24419w.y4().P2(false);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MyPageFragment f24420w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MyPageFragment myPageFragment) {
                super(0);
                this.f24420w = myPageFragment;
            }

            public final void a() {
                this.f24420w.z5();
                this.f24420w.y4().P2(false);
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24415w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f24415w = 1;
                if (uo.b1.a(600L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            g2 g2Var = MyPageFragment.this.f24278z0;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            AppCompatTextView appCompatTextView = g2Var.X;
            MyPageFragment myPageFragment = MyPageFragment.this;
            we.a a10 = we.a.Q0.a(new RectF(appCompatTextView.getX(), appCompatTextView.getY(), appCompatTextView.getX() + appCompatTextView.getWidth(), appCompatTextView.getY() + appCompatTextView.getHeight()));
            a10.F3(new b(myPageFragment));
            a10.G3(new c(myPageFragment));
            myPageFragment.K0.c(new a(a10, myPageFragment));
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s1 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f24421w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(Fragment fragment) {
            super(0);
            this.f24421w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f24421w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24422w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar) {
            super(0);
            this.f24422w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f24422w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class t0 implements View.OnLayoutChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ View f24423w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ MyPageFragment f24424x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f24425y;

        public t0(View view, MyPageFragment myPageFragment, boolean z10) {
            this.f24423w = view;
            this.f24424x = myPageFragment;
            this.f24425y = z10;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            int[] iArr = new int[2];
            this.f24423w.getLocationOnScreen(iArr);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            g2 g2Var = this.f24424x.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            cVar.g(g2Var.E);
            g2 g2Var3 = this.f24424x.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
                g2Var3 = null;
            }
            int id2 = g2Var3.f46436t0.getId();
            int i18 = iArr[0];
            g2 g2Var4 = this.f24424x.f24278z0;
            if (g2Var4 == null) {
                jo.p.v("binding");
                g2Var4 = null;
            }
            cVar.A(id2, 6, (i18 - (g2Var4.f46436t0.getWidth() / 2)) + (this.f24423w.getWidth() / 2));
            g2 g2Var5 = this.f24424x.f24278z0;
            if (g2Var5 == null) {
                jo.p.v("binding");
                g2Var5 = null;
            }
            cVar.c(g2Var5.E);
            g2 g2Var6 = this.f24424x.f24278z0;
            if (g2Var6 == null) {
                jo.p.v("binding");
                g2Var6 = null;
            }
            g2Var6.f46436t0.clearAnimation();
            g2 g2Var7 = this.f24424x.f24278z0;
            if (g2Var7 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var7;
            }
            FrameLayout frameLayout = g2Var2.f46436t0;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new u0(this.f24425y, this.f24424x));
            frameLayout.startAnimation(alphaAnimation);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t1 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24426w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t1(io.a aVar) {
            super(0);
            this.f24426w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f24426w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24427w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24428x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24429y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24430z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24427w = aVar;
            this.f24428x = aVar2;
            this.f24429y = aVar3;
            this.f24430z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24427w;
            vq.a aVar2 = this.f24428x;
            io.a aVar3 = this.f24429y;
            xq.a aVar4 = this.f24430z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.z.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class u0 implements ia.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f24431a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MyPageFragment f24432b;

        public u0(boolean z10, MyPageFragment myPageFragment) {
            this.f24431a = z10;
            this.f24432b = myPageFragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f24431a) {
                this.f24432b.F4(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
            } else {
                g2 g2Var = this.f24432b.f24278z0;
                if (g2Var == null) {
                    jo.p.v("binding");
                    g2Var = null;
                }
                g2Var.f46436t0.clearAnimation();
            }
            a.C0469a.a(this, animation);
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
    public static final class u1 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24433w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24434x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24435y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24436z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24433w = aVar;
            this.f24434x = aVar2;
            this.f24435y = aVar3;
            this.f24436z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24433w;
            vq.a aVar2 = this.f24434x;
            io.a aVar3 = this.f24435y;
            xq.a aVar4 = this.f24436z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(rc.u1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24437w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar) {
            super(0);
            this.f24437w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f24437w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v0 extends jo.q implements io.a<nf.p0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24438w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24439x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24440y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24438w = componentCallbacks;
            this.f24439x = aVar;
            this.f24440y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.p0] */
        @Override // io.a
        public final nf.p0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24438w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.p0.class), this.f24439x, this.f24440y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v1 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24441w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v1(io.a aVar) {
            super(0);
            this.f24441w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f24441w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24443x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(UserMe userMe) {
            super(0);
            this.f24443x = userMe;
        }

        public final void a() {
            MyPageFragment.this.w5(this.f24443x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24444w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24445x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24444w = componentCallbacks;
            this.f24445x = aVar;
            this.f24446y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f24444w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f24445x, this.f24446y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserMe f24448x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(UserMe userMe) {
            super(0);
            this.f24448x = userMe;
        }

        public final void a() {
            MyPageFragment.this.w5(this.f24448x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class x0 extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24449w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24450x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24451y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24449w = componentCallbacks;
            this.f24450x = aVar;
            this.f24451y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f24449w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f24450x, this.f24451y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<wn.v> {
        public y() {
            super(0);
        }

        public final void a() {
            tb.a b10 = MyPageFragment.this.o4().b();
            b10.a().z3(MyPageFragment.this.p0(), b10.b());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class y0 extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24453w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24454x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24455y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24453w = componentCallbacks;
            this.f24454x = aVar;
            this.f24455y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f24453w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.v.class), this.f24454x, this.f24455y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z implements View.OnLayoutChangeListener {
        public z() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            g2 g2Var = MyPageFragment.this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            if (g2Var.N.getLineCount() <= 3) {
                g2 g2Var3 = MyPageFragment.this.f24278z0;
                if (g2Var3 == null) {
                    jo.p.v("binding");
                    g2Var3 = null;
                }
                Layout layout = g2Var3.N.getLayout();
                g2 g2Var4 = MyPageFragment.this.f24278z0;
                if (g2Var4 == null) {
                    jo.p.v("binding");
                    g2Var4 = null;
                }
                if (layout.getEllipsisCount(g2Var4.N.getLineCount() - 1) <= 0) {
                    g2 g2Var5 = MyPageFragment.this.f24278z0;
                    if (g2Var5 == null) {
                        jo.p.v("binding");
                        g2Var5 = null;
                    }
                    g2Var5.f46431o0.setVisibility(8);
                    g2 g2Var6 = MyPageFragment.this.f24278z0;
                    if (g2Var6 == null) {
                        jo.p.v("binding");
                    } else {
                        g2Var2 = g2Var6;
                    }
                    g2Var2.O.setVisibility(0);
                    return;
                }
            }
            g2 g2Var7 = MyPageFragment.this.f24278z0;
            if (g2Var7 == null) {
                jo.p.v("binding");
                g2Var7 = null;
            }
            g2Var7.f46431o0.setVisibility(0);
            g2 g2Var8 = MyPageFragment.this.f24278z0;
            if (g2Var8 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var8;
            }
            g2Var2.O.setVisibility(8);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24457w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24458x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24459y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24457w = componentCallbacks;
            this.f24458x = aVar;
            this.f24459y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24457w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f24458x, this.f24459y);
        }
    }

    public MyPageFragment() {
        uo.b0 b10;
        o2 c10 = uo.g1.c();
        b10 = i2.b(null, 1, null);
        this.f24277y0 = c10.plus(b10);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.A0 = wn.g.b(iVar, new f1(this, null, null));
        this.B0 = wn.g.b(iVar, new g1(this, null, null));
        this.C0 = wn.g.b(iVar, new h1(this, null, null));
        this.D0 = wn.g.b(iVar, new i1(this, null, null));
        this.E0 = wn.g.b(iVar, new j1(this, null, null));
        this.F0 = wn.g.b(iVar, new k1(this, null, null));
        this.G0 = wn.g.b(iVar, new l1(this, null, null));
        o1 o1Var = new o1(this);
        xq.a a10 = gq.a.a(this);
        p1 p1Var = new p1(o1Var);
        this.H0 = androidx.fragment.app.e0.a(this, jo.f0.b(rc.r0.class), new r1(p1Var), new q1(o1Var, null, null, a10));
        s1 s1Var = new s1(this);
        xq.a a11 = gq.a.a(this);
        t1 t1Var = new t1(s1Var);
        this.I0 = androidx.fragment.app.e0.a(this, jo.f0.b(rc.u1.class), new v1(t1Var), new u1(s1Var, null, null, a11));
        this.J0 = wn.g.b(iVar, new m1(this, null, null));
        this.K0 = new FragmentRunner(this);
        this.L0 = wn.g.b(iVar, new n1(this, null, null));
        this.M0 = wn.g.b(iVar, new v0(this, null, null));
        this.N0 = wn.g.b(iVar, new w0(this, null, null));
        this.O0 = wn.g.b(iVar, new x0(this, null, null));
        this.P0 = wn.g.b(iVar, new y0(this, null, null));
        this.Q0 = wn.g.b(iVar, new z0(this, null, null));
        this.R0 = wn.g.b(iVar, new a1(this, null, null));
        this.S0 = wn.g.b(iVar, new b1(this, null, null));
        this.T0 = wn.g.b(iVar, new c1(this, null, null));
        this.U0 = wn.g.b(iVar, new d1(this, null, null));
        this.V0 = wn.g.b(iVar, new e1(this, null, null));
        this.X0 = new l2(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, 32767, null);
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: rc.t1
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                MyPageFragment.E4(MyPageFragment.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…        )\n        }\n    }");
        this.Z0 = I2;
        androidx.activity.result.c<Intent> I22 = I2(new c.c(), new androidx.activity.result.b() { // from class: rc.s1
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                MyPageFragment.C5(MyPageFragment.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I22, "registerForActivityResul…y(intent)\n        }\n    }");
        this.f24275a1 = I22;
    }

    public static final void C5(MyPageFragment myPageFragment, androidx.activity.result.a aVar) {
        Intent e10;
        jo.p.h(myPageFragment, "this$0");
        if (aVar.b() != -1 || aVar.a() == null) {
            return;
        }
        myPageFragment.a5();
        Context q02 = myPageFragment.q0();
        if (q02 != null) {
            if (myPageFragment.x4().a().c()) {
                e10 = myPageFragment.o4().o(q02, null);
                e10.addFlags(335544320);
            } else {
                e10 = c.a.e(myPageFragment.o4(), q02, null, false, false, 14, null);
            }
            myPageFragment.f3(e10);
        }
    }

    public static final void E4(MyPageFragment myPageFragment, androidx.activity.result.a aVar) {
        Context q02;
        jo.p.h(myPageFragment, "this$0");
        if (aVar.b() != -1 || aVar.a() == null || (q02 = myPageFragment.q0()) == null) {
            return;
        }
        tb.c o42 = myPageFragment.o4();
        Intent a10 = aVar.a();
        jo.p.e(a10);
        myPageFragment.f3(o42.t(q02, null, a10.getParcelableExtra("KEY_RESULT_THREAD")));
    }

    public static /* synthetic */ void G4(MyPageFragment myPageFragment, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        myPageFragment.F4(j10);
    }

    public static final void I4(MyPageFragment myPageFragment, String str) {
        jo.p.h(myPageFragment, "this$0");
        g2 g2Var = null;
        if (jo.p.c(str, "")) {
            g2 g2Var2 = myPageFragment.f24278z0;
            if (g2Var2 == null) {
                jo.p.v("binding");
                g2Var2 = null;
            }
            g2Var2.f46431o0.setVisibility(8);
        }
        g2 g2Var3 = myPageFragment.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
        } else {
            g2Var = g2Var3;
        }
        g2Var.N.setText(str);
    }

    public static final void J4(final MyPageFragment myPageFragment, UserMe userMe) {
        String str;
        boolean z10;
        AnniversaryType type;
        UserLink userLink;
        jo.p.h(myPageFragment, "this$0");
        if (userMe == null) {
            return;
        }
        l2 l2Var = myPageFragment.X0;
        if (userMe.getBirthday().length() == 4) {
            String substring = userMe.getBirthday().substring(0, 2);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = userMe.getBirthday().substring(2);
            jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
            if (so.q.O0(substring) == '0') {
                substring = substring.substring(1, 2);
                jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (so.q.O0(substring2) == '0') {
                substring2 = substring2.substring(1, 2);
                jo.p.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str = myPageFragment.V0(nc.i.P4, substring, substring2);
        } else {
            str = "";
        }
        jo.p.g(str, "if (me.birthday.length =…                } else \"\"");
        l2Var.a(userMe, str);
        Integer i42 = myPageFragment.i4(userMe.getBirthday());
        List<RibbonResponse> ribbons = userMe.getRibbons();
        if (!(ribbons instanceof Collection) || !ribbons.isEmpty()) {
            for (RibbonResponse ribbonResponse : ribbons) {
                if (ribbonResponse.isContinuousRibbon()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        Anniversary anniversary = userMe.getAnniversary();
        g2 g2Var = null;
        if ((anniversary != null ? anniversary.getType() : null) == AnniversaryType.BIRTHDAY && i42 != null && i42.intValue() >= -1 && i42.intValue() <= 1) {
            myPageFragment.X0.M(false);
            myPageFragment.p5(userMe);
        } else {
            Anniversary anniversary2 = userMe.getAnniversary();
            if ((anniversary2 == null || (type = anniversary2.getType()) == null || !type.isStreamContinuous()) ? false : true) {
                myPageFragment.X0.M(true);
            } else {
                Anniversary anniversary3 = userMe.getAnniversary();
                if ((anniversary3 != null ? anniversary3.getType() : null) == AnniversaryType.FOLLOWER) {
                    Anniversary anniversary4 = userMe.getAnniversary();
                    jo.p.e(anniversary4);
                    myPageFragment.m5(anniversary4);
                } else if (i42 != null && i42.intValue() > 1 && i42.intValue() <= 14) {
                    String continuousStreamHolidayPeriod = userMe.getContinuousStreamHolidayPeriod();
                    if (!(!(continuousStreamHolidayPeriod == null || continuousStreamHolidayPeriod.length() == 0))) {
                        myPageFragment.p5(userMe);
                    }
                } else {
                    myPageFragment.X0.M(z10);
                }
            }
        }
        List<UserLink> links = userMe.getLinks();
        final String str2 = (links == null || (userLink = (UserLink) xn.a0.Z(links)) == null || (str2 = userLink.getUrl()) == null) ? "" : "";
        g2 g2Var2 = myPageFragment.f24278z0;
        if (g2Var2 == null) {
            jo.p.v("binding");
            g2Var2 = null;
        }
        g2Var2.f46427k0.setOnClickListener(new View.OnClickListener() { // from class: rc.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.K4(MyPageFragment.this, str2, view);
            }
        });
        g2 g2Var3 = myPageFragment.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
            g2Var3 = null;
        }
        RecyclerView recyclerView = g2Var3.f46434r0;
        List<RibbonResponse> ribbons2 = userMe.getRibbons();
        ArrayList arrayList = new ArrayList(xn.t.u(ribbons2, 10));
        for (RibbonResponse ribbonResponse2 : ribbons2) {
            arrayList.add(ribbonResponse2.getImageUrl());
        }
        rd.w0 w0Var = new rd.w0(arrayList);
        w0Var.g(new g(userMe, myPageFragment));
        w0Var.h(new h(userMe, myPageFragment));
        if (userMe.getRemainingDaysForContinuousStreamer() != 0 && userMe.getCurrentContinuousRecord() != 0) {
            myPageFragment.X0.H().p(Boolean.TRUE);
            g2 g2Var4 = myPageFragment.f24278z0;
            if (g2Var4 == null) {
                jo.p.v("binding");
                g2Var4 = null;
            }
            MyPageContinuousLivePromotionView myPageContinuousLivePromotionView = g2Var4.f46428l0;
            m2.a aVar = m2.f55199e;
            Context N2 = myPageFragment.N2();
            jo.p.g(N2, "requireContext()");
            myPageContinuousLivePromotionView.d(aVar.a(userMe, N2));
            g2 g2Var5 = myPageFragment.f24278z0;
            if (g2Var5 == null) {
                jo.p.v("binding");
                g2Var5 = null;
            }
            MyPageContinuousLivePromotionView myPageContinuousLivePromotionView2 = g2Var5.f46428l0;
            myPageContinuousLivePromotionView2.setOnClickHelpListener(new i());
            myPageContinuousLivePromotionView2.setOnClickContinuousListener(new j(userMe));
            Anniversary anniversary5 = userMe.getAnniversary();
            if ((anniversary5 != null ? anniversary5.getType() : null) != AnniversaryType.BIRTHDAY) {
                String continuousStreamHolidayPeriod2 = userMe.getContinuousStreamHolidayPeriod();
                if (!(continuousStreamHolidayPeriod2 == null || continuousStreamHolidayPeriod2.length() == 0) || userMe.getContinuousStreamHolidaysNum() > 0) {
                    myPageFragment.o5(userMe);
                }
            }
        } else {
            myPageFragment.X0.H().p(Boolean.FALSE);
        }
        recyclerView.setAdapter(w0Var);
        if (userMe.getAvatarBackgroundImageUrl().length() == 0) {
            rc.r0 s42 = myPageFragment.s4();
            Bitmap decodeResource = BitmapFactory.decodeResource(myPageFragment.O0(), nc.d.f41813s1);
            jo.p.g(decodeResource, "decodeResource(resources…_page_default_background)");
            g2 g2Var6 = myPageFragment.f24278z0;
            if (g2Var6 == null) {
                jo.p.v("binding");
                g2Var6 = null;
            }
            int height = g2Var6.f46441y0.getHeight();
            g2 g2Var7 = myPageFragment.f24278z0;
            if (g2Var7 == null) {
                jo.p.v("binding");
                g2Var7 = null;
            }
            s42.v(decodeResource, height, g2Var7.f46441y0.getWidth());
        } else {
            GlideApp.with(myPageFragment).asBitmap().load(userMe.getAvatarBackgroundImageUrl()).centerCrop().into((GlideRequest<Bitmap>) new k());
        }
        rc.q0 a10 = rc.q0.H0.a();
        MyViewHistoriesFragment a11 = MyViewHistoriesFragment.H0.a();
        rc.d0 a12 = rc.d0.F0.a();
        List m10 = xn.s.m(myPageFragment.U0(nc.i.f41896x), myPageFragment.U0(nc.i.text_viewing_history), "");
        List m11 = xn.s.m(a10, a11, a12);
        FragmentManager p02 = myPageFragment.p0();
        jo.p.g(p02, "childFragmentManager");
        rd.h hVar = new rd.h(m10, m11, p02);
        g2 g2Var8 = myPageFragment.f24278z0;
        if (g2Var8 == null) {
            jo.p.v("binding");
            g2Var8 = null;
        }
        g2Var8.I0.setAdapter(hVar);
        g2 g2Var9 = myPageFragment.f24278z0;
        if (g2Var9 == null) {
            jo.p.v("binding");
            g2Var9 = null;
        }
        g2Var9.I0.setOffscreenPageLimit(hVar.c());
        g2 g2Var10 = myPageFragment.f24278z0;
        if (g2Var10 == null) {
            jo.p.v("binding");
            g2Var10 = null;
        }
        TabLayout tabLayout = g2Var10.f46440x0;
        g2 g2Var11 = myPageFragment.f24278z0;
        if (g2Var11 == null) {
            jo.p.v("binding");
            g2Var11 = null;
        }
        tabLayout.setupWithViewPager(g2Var11.I0);
        g2 g2Var12 = myPageFragment.f24278z0;
        if (g2Var12 == null) {
            jo.p.v("binding");
            g2Var12 = null;
        }
        TabLayout.g x10 = g2Var12.f46440x0.x(2);
        if (x10 != null) {
            a8 a8Var = myPageFragment.Y0;
            if (a8Var == null) {
                jo.p.v("chatHistoriesTabBinding");
                a8Var = null;
            }
            x10.p(a8Var.u());
        }
        g2 g2Var13 = myPageFragment.f24278z0;
        if (g2Var13 == null) {
            jo.p.v("binding");
            g2Var13 = null;
        }
        g2Var13.W.b(userMe, true, new l(userMe));
        g2 g2Var14 = myPageFragment.f24278z0;
        if (g2Var14 == null) {
            jo.p.v("binding");
        } else {
            g2Var = g2Var14;
        }
        StreamHolidayBalloonView streamHolidayBalloonView = g2Var.f46439w0;
        b4.a aVar2 = b4.f54792d;
        Resources O0 = myPageFragment.O0();
        jo.p.g(O0, "resources");
        streamHolidayBalloonView.b(aVar2.a(O0, userMe, true), new m(userMe));
        myPageFragment.k4().i(myPageFragment.C4().T4(), userMe.getMaxContinuousRecord());
    }

    public static final void K4(MyPageFragment myPageFragment, String str, View view) {
        jo.p.h(myPageFragment, "this$0");
        jo.p.h(str, "$link");
        Intent intent = new Intent(myPageFragment.N2(), WebViewActivity.class);
        intent.putExtra("extra_url", str);
        intent.setFlags(268435456);
        myPageFragment.f3(intent);
    }

    public static final void L4(MyPageFragment myPageFragment, List list) {
        jo.p.h(myPageFragment, "this$0");
        ChatStatus f10 = myPageFragment.t4().l().f();
        boolean z10 = true;
        if (f10 == null || !f10.isEnabled()) {
            z10 = false;
        }
        if (z10 || jo.p.c(myPageFragment.t4().M().f(), Boolean.TRUE)) {
            return;
        }
        g2 g2Var = myPageFragment.f24278z0;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        if (g2Var.I0.getCurrentItem() != 2) {
            return;
        }
        myPageFragment.X0.B().p(Boolean.valueOf(list.isEmpty()));
    }

    public static final void M4(MyPageFragment myPageFragment, ChatStatus chatStatus) {
        jo.p.h(myPageFragment, "this$0");
        boolean z10 = true;
        if (chatStatus == null || !chatStatus.isEnabled()) {
            z10 = false;
        }
        g2 g2Var = null;
        if (z10) {
            g2 g2Var2 = myPageFragment.f24278z0;
            if (g2Var2 == null) {
                jo.p.v("binding");
                g2Var2 = null;
            }
            if (g2Var2.I0.getCurrentItem() == 2) {
                g2 g2Var3 = myPageFragment.f24278z0;
                if (g2Var3 == null) {
                    jo.p.v("binding");
                } else {
                    g2Var = g2Var3;
                }
                g2Var.f46418b0.t();
                androidx.lifecycle.e0<Boolean> B = myPageFragment.X0.B();
                List<Chat.Thread> f10 = myPageFragment.t4().m().f();
                B.p(f10 != null ? Boolean.valueOf(f10.isEmpty()) : Boolean.FALSE);
                myPageFragment.m4().r();
                return;
            }
        }
        g2 g2Var4 = myPageFragment.f24278z0;
        if (g2Var4 == null) {
            jo.p.v("binding");
        } else {
            g2Var = g2Var4;
        }
        g2Var.f46418b0.l();
        myPageFragment.X0.B().p(Boolean.FALSE);
    }

    public static final void N4(MyPageFragment myPageFragment, wn.k kVar) {
        jo.p.h(myPageFragment, "this$0");
        boolean booleanValue = ((Boolean) kVar.c()).booleanValue();
        boolean booleanValue2 = ((Boolean) kVar.d()).booleanValue();
        boolean z10 = true;
        myPageFragment.X0.D().p(Boolean.valueOf(booleanValue && booleanValue2));
        androidx.lifecycle.e0<Boolean> A = myPageFragment.X0.A();
        if (!booleanValue || booleanValue2) {
            z10 = false;
        }
        A.p(Boolean.valueOf(z10));
        if (booleanValue && booleanValue2) {
            myPageFragment.t5();
        } else if (booleanValue && !booleanValue2 && myPageFragment.y4().V3()) {
            myPageFragment.s5();
        }
    }

    public static final void O4(MyPageFragment myPageFragment, Integer num) {
        String str;
        jo.p.h(myPageFragment, "this$0");
        g2 g2Var = myPageFragment.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        j5.a adapter = g2Var.I0.getAdapter();
        if ((adapter instanceof rd.h ? (rd.h) adapter : null) != null) {
            if (num != null && num.intValue() == 0) {
                str = myPageFragment.U0(nc.i.f41896x);
            } else {
                str = myPageFragment.U0(nc.i.f41896x) + '(' + num + ')';
            }
            jo.p.g(str, "if (numberOfLives == 0) …Lives)\"\n                }");
            g2 g2Var3 = myPageFragment.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var3;
            }
            TabLayout.g x10 = g2Var2.f46440x0.x(0);
            if (x10 == null) {
                return;
            }
            x10.t(str);
        }
    }

    public static final void P4(MyPageFragment myPageFragment, Bitmap bitmap) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.X0.b().p(bitmap);
    }

    public static final void Q4(MyPageFragment myPageFragment, List list) {
        jo.p.h(myPageFragment, "this$0");
        g2 g2Var = myPageFragment.f24278z0;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        RecyclerView recyclerView = g2Var.f46417a0;
        jo.p.g(list, "it");
        rd.r rVar = new rd.r(list);
        rVar.f(new r());
        recyclerView.setAdapter(rVar);
        myPageFragment.X0.F().p(Boolean.valueOf(!list.isEmpty()));
    }

    public static final void R4(MyPageFragment myPageFragment, List list) {
        jo.p.h(myPageFragment, "this$0");
        jo.p.g(list, "apps");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            App.AppParams appParams = (App.AppParams) it.next();
            arrayList.add(new ud.c(appParams.getAppId(), appParams.getIconUrl(), null, 4, null));
        }
        g2 g2Var = myPageFragment.f24278z0;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        RecyclerView.h adapter = g2Var.F.getAdapter();
        rd.c cVar = adapter instanceof rd.c ? (rd.c) adapter : null;
        if (cVar == null) {
            return;
        }
        cVar.h(xn.a0.o0(xn.r.d(new ud.b(arrayList.isEmpty(), null, 2, null)), arrayList));
    }

    public static final void S4(MyPageFragment myPageFragment, Boolean bool) {
        jo.p.h(myPageFragment, "this$0");
        if (bool != null) {
            bool.booleanValue();
            myPageFragment.B5(!bool.booleanValue());
        }
    }

    public static final void T4(MyPageFragment myPageFragment, Boolean bool) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.X0.C().p(bool);
    }

    public static final void U4(MyPageFragment myPageFragment, Boolean bool) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.X0.E().p(bool);
    }

    public static final void V4(MyPageFragment myPageFragment, jf.f fVar) {
        jo.p.h(myPageFragment, "this$0");
        if (fVar != null) {
            myPageFragment.X0.j().p(Integer.valueOf(fVar.e()));
        }
    }

    public static final void W4(MyPageFragment myPageFragment, Integer num) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.X0.f().p(num);
    }

    public static final void X4(MyPageFragment myPageFragment, Boolean bool) {
        jo.p.h(myPageFragment, "this$0");
        a8 a8Var = myPageFragment.Y0;
        if (a8Var == null) {
            jo.p.v("chatHistoriesTabBinding");
            a8Var = null;
        }
        View view = a8Var.B;
        jo.p.g(bool, "it");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void Y4(MyPageFragment myPageFragment, Integer num) {
        jo.p.h(myPageFragment, "this$0");
        g2 g2Var = null;
        if (num == null) {
            g2 g2Var2 = myPageFragment.f24278z0;
            if (g2Var2 == null) {
                jo.p.v("binding");
            } else {
                g2Var = g2Var2;
            }
            g2Var.R.b();
            return;
        }
        g2 g2Var3 = myPageFragment.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
        } else {
            g2Var = g2Var3;
        }
        CheckMonthlyRankingBalloonView checkMonthlyRankingBalloonView = g2Var.R;
        String U0 = myPageFragment.U0(num.intValue());
        jo.p.g(U0, "getString(it)");
        checkMonthlyRankingBalloonView.c(U0);
    }

    public static final void Z4(MyPageFragment myPageFragment, h9.a aVar) {
        jo.p.h(myPageFragment, "this$0");
        g2 g2Var = myPageFragment.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        MirraClassSeasonRatingCardView mirraClassSeasonRatingCardView = g2Var.f46438v0;
        jo.p.g(aVar, "it");
        mirraClassSeasonRatingCardView.g(aVar);
        g2 g2Var3 = myPageFragment.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var3;
        }
        g2Var2.f46438v0.setVisibility(0);
    }

    public static final void c5(MyPageFragment myPageFragment, View view) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.L2().onBackPressed();
    }

    public static final void e5(MyPageFragment myPageFragment, View view) {
        jo.p.h(myPageFragment, "this$0");
        androidx.activity.result.c<Intent> cVar = myPageFragment.Z0;
        tb.c o42 = myPageFragment.o4();
        Context N2 = myPageFragment.N2();
        jo.p.g(N2, "requireContext()");
        cVar.a(o42.i(N2, null));
    }

    public static final void f5(MyPageFragment myPageFragment, AppBarLayout appBarLayout, int i10) {
        int i11;
        jo.p.h(myPageFragment, "this$0");
        g2 g2Var = myPageFragment.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        int height = g2Var.f46441y0.getHeight();
        g2 g2Var3 = myPageFragment.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
            g2Var3 = null;
        }
        int height2 = g2Var3.L.getHeight();
        if (i10 == 0) {
            i11 = 0;
        } else {
            int i12 = -i10;
            int i13 = height2 - height;
            i11 = i12 < i13 ? (int) ((i12 * 255.0f) / i13) : 255;
        }
        Bitmap f10 = myPageFragment.t4().j().f();
        e.b bVar = (e.b) myPageFragment.j0();
        if (bVar != null) {
            if (f10 == null) {
                e.a m32 = bVar.m3();
                if (m32 != null) {
                    Drawable f11 = e3.h.f(bVar.getResources(), nc.d.f41813s1, null);
                    if (f11 != null) {
                        f11.setAlpha(i11);
                    } else {
                        f11 = null;
                    }
                    m32.l(f11);
                }
            } else {
                e.a m33 = bVar.m3();
                if (m33 != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(bVar.getResources(), f10);
                    bitmapDrawable.setAlpha(i11);
                    m33.l(bitmapDrawable);
                }
            }
        }
        g2 g2Var4 = myPageFragment.f24278z0;
        if (g2Var4 == null) {
            jo.p.v("binding");
            g2Var4 = null;
        }
        float f12 = i11 / 255.0f;
        g2Var4.E0.setAlpha(f12);
        g2 g2Var5 = myPageFragment.f24278z0;
        if (g2Var5 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var5;
        }
        g2Var2.C0.setAlpha(f12);
        if (i10 < -20) {
            Boolean f13 = myPageFragment.n4().m().f();
            jo.p.e(f13);
            if (!f13.booleanValue()) {
                myPageFragment.m4().B(true);
                return;
            }
        }
        if (i10 > -20) {
            Boolean f14 = myPageFragment.n4().m().f();
            jo.p.e(f14);
            if (f14.booleanValue()) {
                myPageFragment.m4().B(false);
            }
        }
    }

    public static final void g5(MyPageFragment myPageFragment, View view) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.z5();
    }

    public static final void h5(MyPageFragment myPageFragment, View view) {
        String profileImageUrl;
        jo.p.h(myPageFragment, "this$0");
        UserMe f10 = myPageFragment.t4().B().f();
        if (f10 == null || (profileImageUrl = f10.getProfileImageUrl()) == null) {
            return;
        }
        tb.c o42 = myPageFragment.o4();
        Context N2 = myPageFragment.N2();
        jo.p.g(N2, "requireContext()");
        myPageFragment.f3(o42.S(N2, profileImageUrl));
    }

    public static final void i5(MyPageFragment myPageFragment, View view) {
        jo.p.h(myPageFragment, "this$0");
        UserMe f10 = myPageFragment.t4().B().f();
        if (f10 == null) {
            return;
        }
        String twitterScreenName = f10.getTwitterScreenName();
        if (twitterScreenName == null) {
            twitterScreenName = "";
        }
        if (twitterScreenName.length() == 0) {
            hf.v0 B4 = myPageFragment.B4();
            FragmentManager p02 = myPageFragment.p0();
            jo.p.g(p02, "childFragmentManager");
            if (B4.b(p02, "my_page.link_twitter", true)) {
                uo.l.d(myPageFragment, null, null, new j0("my_page.link_twitter", null), 3, null);
                return;
            }
            return;
        }
        Context N2 = myPageFragment.N2();
        of.n.r(N2, "https://twitter.com/" + twitterScreenName);
    }

    public static final void j5(MyPageFragment myPageFragment, View view) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.v5();
    }

    public static final void k5(MyPageFragment myPageFragment, View view) {
        jo.p.h(myPageFragment, "this$0");
        myPageFragment.u5();
    }

    public static /* synthetic */ void y5(MyPageFragment myPageFragment, View view, LabelRemainingPeriod labelRemainingPeriod, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        myPageFragment.x5(view, labelRemainingPeriod, z10);
    }

    public final of.k A4() {
        return (of.k) this.J0.getValue();
    }

    public final void A5(int i10) {
        String str;
        a8 a8Var = null;
        if (i10 == 0 || i10 == 1) {
            g2 g2Var = this.f24278z0;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            g2Var.f46418b0.l();
            a8 a8Var2 = this.Y0;
            if (a8Var2 == null) {
                jo.p.v("chatHistoriesTabBinding");
            } else {
                a8Var = a8Var2;
            }
            a8Var.C.setTextColor(c3.a.d(N2(), nc.b.f41793d));
            this.X0.B().p(Boolean.FALSE);
        } else if (i10 == 2) {
            ChatStatus f10 = t4().l().f();
            boolean z10 = false;
            if (f10 != null && f10.isEnabled()) {
                z10 = true;
            }
            if (z10) {
                g2 g2Var2 = this.f24278z0;
                if (g2Var2 == null) {
                    jo.p.v("binding");
                    g2Var2 = null;
                }
                g2Var2.f46418b0.t();
                androidx.lifecycle.e0<Boolean> B = this.X0.B();
                List<Chat.Thread> f11 = t4().m().f();
                B.p(f11 != null ? Boolean.valueOf(f11.isEmpty()) : Boolean.FALSE);
                m4().r();
            }
            a8 a8Var3 = this.Y0;
            if (a8Var3 == null) {
                jo.p.v("chatHistoriesTabBinding");
            } else {
                a8Var = a8Var3;
            }
            a8Var.C.setTextColor(c3.a.d(N2(), nc.b.f41804x));
        }
        MRLogger r42 = r4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MYPAGE_TAB_SELECT);
        if (i10 == 0) {
            str = Referer.LIVE_HISTORY;
        } else if (i10 == 1) {
            str = Referer.VIEW_HISTORY;
        } else if (i10 != 2) {
            throw new IllegalArgumentException("存在しないindex= " + i10 + " です");
        } else {
            str = "chat";
        }
        builder.setTargetType(str);
        r42.sendLog(builder.build());
    }

    @Override // fd.f
    public void B() {
        jf.f f10;
        UserMe f11 = t4().B().f();
        if (f11 == null || (f10 = n4().k().f()) == null) {
            return;
        }
        if (f10.f(false, f11.getPurchaseContinuousLiveHolidayRequiredCoin())) {
            s4().B();
        } else {
            q5();
        }
    }

    public final hf.v0 B4() {
        return (hf.v0) this.E0.getValue();
    }

    public final void B5(boolean z10) {
        Fragment e02 = p0().e0("RegisterOrLoginWithTwitterFragment");
        if (e02 != null) {
            p0().k().q(e02).l();
        }
        if (z10) {
            p0().k().b(nc.e.f41831k2, RegisterOrLoginWithTwitterFragment.C0.a(Referer.MY_PAGE, true), "RegisterOrLoginWithTwitterFragment").i();
        }
    }

    public final kf.x C4() {
        return (kf.x) this.N0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void D1(Menu menu, MenuInflater menuInflater) {
        jo.p.h(menu, "menu");
        jo.p.h(menuInflater, "inflater");
        menuInflater.inflate(nc.g.my_page_menu, menu);
    }

    public final nf.p0 D4() {
        return (nf.p0) this.M0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        g2 T = g2.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        this.f24278z0 = T;
        g2 g2Var = null;
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, nc.f.f41859e0, null, false);
        jo.p.g(e10, "inflate(inflater, R.layo…t_histories, null, false)");
        this.Y0 = (a8) e10;
        g2 g2Var2 = this.f24278z0;
        if (g2Var2 == null) {
            jo.p.v("binding");
        } else {
            g2Var = g2Var2;
        }
        View u10 = g2Var.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final void F4(long j10) {
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        g2Var.f46436t0.clearAnimation();
        g2 g2Var3 = this.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var3;
        }
        FrameLayout frameLayout = g2Var2.f46436t0;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setStartOffset(j10);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new b());
        frameLayout.startAnimation(alphaAnimation);
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        g2 g2Var = this.f24278z0;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        g2Var.I0.setAdapter(null);
    }

    public final void H4() {
        this.X0.c().i(a1(), new androidx.lifecycle.f0() { // from class: rc.g1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.I4(MyPageFragment.this, (String) obj);
            }
        });
        t4().B().i(a1(), new androidx.lifecycle.f0() { // from class: rc.x0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.J4(MyPageFragment.this, (UserMe) obj);
            }
        });
        t4().m().i(a1(), new androidx.lifecycle.f0() { // from class: rc.h1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.L4(MyPageFragment.this, (List) obj);
            }
        });
        t4().l().i(a1(), new androidx.lifecycle.f0() { // from class: rc.v0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.M4(MyPageFragment.this, (ChatStatus) obj);
            }
        });
        t4().o().i(a1(), new androidx.lifecycle.f0() { // from class: rc.k1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.N4(MyPageFragment.this, (wn.k) obj);
            }
        });
        t4().F().i(a1(), new androidx.lifecycle.f0() { // from class: rc.e1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.O4(MyPageFragment.this, (Integer) obj);
            }
        });
        t4().k().i(a1(), new androidx.lifecycle.f0() { // from class: rc.t0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.P4(MyPageFragment.this, (Bitmap) obj);
            }
        });
        t4().u().i(a1(), new androidx.lifecycle.f0() { // from class: rc.i1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.Q4(MyPageFragment.this, (List) obj);
            }
        });
        n4().r().i(a1(), new androidx.lifecycle.f0() { // from class: rc.j1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.R4(MyPageFragment.this, (List) obj);
            }
        });
        t4().x().i(a1(), new androidx.lifecycle.f0() { // from class: rc.b1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.S4(MyPageFragment.this, (Boolean) obj);
            }
        });
        t4().n().i(a1(), new androidx.lifecycle.f0() { // from class: rc.a1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.T4(MyPageFragment.this, (Boolean) obj);
            }
        });
        n4().l().i(a1(), new androidx.lifecycle.f0() { // from class: rc.y0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.U4(MyPageFragment.this, (Boolean) obj);
            }
        });
        n4().k().i(a1(), new androidx.lifecycle.f0() { // from class: rc.w0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.V4(MyPageFragment.this, (jf.f) obj);
            }
        });
        n4().s().i(a1(), new androidx.lifecycle.f0() { // from class: rc.c1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.W4(MyPageFragment.this, (Integer) obj);
            }
        });
        n4().y().i(a1(), new androidx.lifecycle.f0() { // from class: rc.z0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.X4(MyPageFragment.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new o(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
        uo.l.d(this, null, null, new q(null), 3, null);
        q4().e().i(a1(), new androidx.lifecycle.f0() { // from class: rc.f1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.Y4(MyPageFragment.this, (Integer) obj);
            }
        });
        w4().i().i(a1(), new androidx.lifecycle.f0() { // from class: rc.u0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyPageFragment.Z4(MyPageFragment.this, (h9.a) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        uo.r0.d(this, null, 1, null);
    }

    @Override // vb.i
    public void J1() {
        this.K0.c(new y());
    }

    @Override // androidx.fragment.app.Fragment
    public boolean P1(MenuItem menuItem) {
        List<RibbonResponse> k10;
        jo.p.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == nc.e.profile_edit_menu_item) {
            if (jo.p.c(t4().L().f(), Boolean.TRUE)) {
                UserMe f10 = t4().B().f();
                if ((f10 != null ? f10.getRibbons() : null) != null) {
                    return true;
                }
            }
            ProfileEditActivity.a aVar = ProfileEditActivity.W;
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            UserMe f11 = t4().B().f();
            if (f11 == null || (k10 = f11.getRibbons()) == null) {
                k10 = xn.s.k();
            }
            f3(aVar.a(N2, k10));
            return true;
        } else if (itemId == nc.e.share_menu_item) {
            l5();
            return true;
        } else if (itemId == nc.e.Y3) {
            tb.c o42 = o4();
            Context N22 = N2();
            jo.p.g(N22, "requireContext()");
            f3(o42.l(N22));
            return true;
        } else {
            return super.P1(menuItem);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        if (jo.p.c(t4().x().f(), Boolean.TRUE)) {
            s4().P();
        }
        LatestRewardResponse f10 = q4().d().f();
        if (f10 != null) {
            if (f10.isVisibleRanking()) {
                p4().j(f10.getRankingMonth());
            }
            if (f10.isVisibleHistory()) {
                p4().i(f10.getCurrentMonth());
            }
        }
        s4().o();
        s4().p();
        j4().c(Referer.MY_PAGE);
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        AppCompatTextView appCompatTextView = g2Var.N;
        jo.p.g(appCompatTextView, "binding.bioTextView");
        if (o3.c0.V(appCompatTextView) && !appCompatTextView.isLayoutRequested()) {
            g2 g2Var3 = this.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
                g2Var3 = null;
            }
            if (g2Var3.N.getLineCount() <= 3) {
                g2 g2Var4 = this.f24278z0;
                if (g2Var4 == null) {
                    jo.p.v("binding");
                    g2Var4 = null;
                }
                Layout layout = g2Var4.N.getLayout();
                g2 g2Var5 = this.f24278z0;
                if (g2Var5 == null) {
                    jo.p.v("binding");
                    g2Var5 = null;
                }
                if (layout.getEllipsisCount(g2Var5.N.getLineCount() - 1) <= 0) {
                    g2 g2Var6 = this.f24278z0;
                    if (g2Var6 == null) {
                        jo.p.v("binding");
                        g2Var6 = null;
                    }
                    g2Var6.f46431o0.setVisibility(8);
                    g2 g2Var7 = this.f24278z0;
                    if (g2Var7 == null) {
                        jo.p.v("binding");
                    } else {
                        g2Var2 = g2Var7;
                    }
                    g2Var2.O.setVisibility(0);
                    return;
                }
            }
            g2 g2Var8 = this.f24278z0;
            if (g2Var8 == null) {
                jo.p.v("binding");
                g2Var8 = null;
            }
            g2Var8.f46431o0.setVisibility(0);
            g2 g2Var9 = this.f24278z0;
            if (g2Var9 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var9;
            }
            g2Var2.O.setVisibility(8);
            return;
        }
        appCompatTextView.addOnLayoutChangeListener(new z());
    }

    public final void a5() {
        s4().H(l4().h(), D4().e());
    }

    public final void b5() {
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        g2Var.f46418b0.l();
        androidx.fragment.app.h L2 = L2();
        jo.p.f(L2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        e.b bVar = (e.b) L2;
        g2 g2Var3 = this.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
            g2Var3 = null;
        }
        bVar.u3(g2Var3.f46441y0);
        e.a m32 = bVar.m3();
        if (m32 != null) {
            m32.p(false);
        }
        g2 g2Var4 = this.f24278z0;
        if (g2Var4 == null) {
            jo.p.v("binding");
            g2Var4 = null;
        }
        Toolbar toolbar = g2Var4.f46441y0;
        toolbar.setNavigationIcon(nc.d.ic_back_shaded);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: rc.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.c5(MyPageFragment.this, view);
            }
        });
        g2 g2Var5 = this.f24278z0;
        if (g2Var5 == null) {
            jo.p.v("binding");
            g2Var5 = null;
        }
        g2Var5.f46434r0.setLayoutManager(new LinearLayoutManager(q0(), 0, false));
        g2 g2Var6 = this.f24278z0;
        if (g2Var6 == null) {
            jo.p.v("binding");
            g2Var6 = null;
        }
        g2Var6.F.setLayoutManager(new LinearLayoutManager(q0(), 0, false));
        g2 g2Var7 = this.f24278z0;
        if (g2Var7 == null) {
            jo.p.v("binding");
            g2Var7 = null;
        }
        g2Var7.f46417a0.setLayoutManager(new LinearLayoutManager(q0(), 0, false));
        int b10 = de.e.b(this, 4);
        int b11 = de.e.b(this, 16);
        g2 g2Var8 = this.f24278z0;
        if (g2Var8 == null) {
            jo.p.v("binding");
            g2Var8 = null;
        }
        g2Var8.f46434r0.g(new p001if.c(b10, b11, 0, b11, 0, 0));
        int b12 = de.e.b(this, 8);
        int b13 = de.e.b(this, 16);
        g2 g2Var9 = this.f24278z0;
        if (g2Var9 == null) {
            jo.p.v("binding");
            g2Var9 = null;
        }
        g2Var9.F.g(new p001if.c(b12, b13, 0, b13, 0, 0));
        int b14 = de.e.b(this, 16);
        int b15 = de.e.b(this, 16);
        int b16 = de.e.b(this, 12);
        g2 g2Var10 = this.f24278z0;
        if (g2Var10 == null) {
            jo.p.v("binding");
            g2Var10 = null;
        }
        g2Var10.f46417a0.g(new p001if.c(b14, b15, b16, b15, b16, 0));
        g2 g2Var11 = this.f24278z0;
        if (g2Var11 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var11;
        }
        RecyclerView recyclerView = g2Var2.f46417a0;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        recyclerView.g(new p001if.d(N2, 0, nc.d.divider_pinkish_grey, b16));
    }

    public final void d5() {
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        RecyclerView recyclerView = g2Var.F;
        rd.c cVar = new rd.c();
        cVar.f(new a0());
        cVar.g(new b0());
        recyclerView.setAdapter(cVar);
        g2 g2Var3 = this.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
            g2Var3 = null;
        }
        g2Var3.f46434r0.k(new f0());
        g2 g2Var4 = this.f24278z0;
        if (g2Var4 == null) {
            jo.p.v("binding");
            g2Var4 = null;
        }
        g2Var4.I0.c(new g0());
        A5(0);
        g2 g2Var5 = this.f24278z0;
        if (g2Var5 == null) {
            jo.p.v("binding");
            g2Var5 = null;
        }
        g2Var5.f46418b0.setOnClickListener(new View.OnClickListener() { // from class: rc.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.e5(MyPageFragment.this, view);
            }
        });
        g2 g2Var6 = this.f24278z0;
        if (g2Var6 == null) {
            jo.p.v("binding");
            g2Var6 = null;
        }
        g2Var6.D.b(new AppBarLayout.e() { // from class: rc.l1
            @Override // com.google.android.material.appbar.AppBarLayout.c
            public final void a(AppBarLayout appBarLayout, int i10) {
                MyPageFragment.f5(MyPageFragment.this, appBarLayout, i10);
            }
        });
        g2 g2Var7 = this.f24278z0;
        if (g2Var7 == null) {
            jo.p.v("binding");
            g2Var7 = null;
        }
        AppCompatTextView appCompatTextView = g2Var7.f46431o0;
        jo.p.g(appCompatTextView, "binding.readMoreBio");
        yd.g1.a(appCompatTextView, new h0());
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: rc.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.g5(MyPageFragment.this, view);
            }
        };
        g2 g2Var8 = this.f24278z0;
        if (g2Var8 == null) {
            jo.p.v("binding");
            g2Var8 = null;
        }
        g2Var8.H.setOnClickListener(onClickListener);
        g2 g2Var9 = this.f24278z0;
        if (g2Var9 == null) {
            jo.p.v("binding");
            g2Var9 = null;
        }
        g2Var9.J.setOnClickListener(onClickListener);
        g2 g2Var10 = this.f24278z0;
        if (g2Var10 == null) {
            jo.p.v("binding");
            g2Var10 = null;
        }
        AppCompatTextView appCompatTextView2 = g2Var10.X;
        jo.p.g(appCompatTextView2, "binding.createEmomoTextView");
        yd.g1.a(appCompatTextView2, new i0());
        g2 g2Var11 = this.f24278z0;
        if (g2Var11 == null) {
            jo.p.v("binding");
            g2Var11 = null;
        }
        g2Var11.f46430n0.setOnClickListener(new View.OnClickListener() { // from class: rc.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.h5(MyPageFragment.this, view);
            }
        });
        g2 g2Var12 = this.f24278z0;
        if (g2Var12 == null) {
            jo.p.v("binding");
            g2Var12 = null;
        }
        g2Var12.B0.setOnClickListener(new View.OnClickListener() { // from class: rc.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.i5(MyPageFragment.this, view);
            }
        });
        g2 g2Var13 = this.f24278z0;
        if (g2Var13 == null) {
            jo.p.v("binding");
            g2Var13 = null;
        }
        g2Var13.f46420d0.setOnClickListener(new View.OnClickListener() { // from class: rc.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.j5(MyPageFragment.this, view);
            }
        });
        g2 g2Var14 = this.f24278z0;
        if (g2Var14 == null) {
            jo.p.v("binding");
            g2Var14 = null;
        }
        g2Var14.f46419c0.setOnClickListener(new View.OnClickListener() { // from class: rc.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyPageFragment.k5(MyPageFragment.this, view);
            }
        });
        g2 g2Var15 = this.f24278z0;
        if (g2Var15 == null) {
            jo.p.v("binding");
            g2Var15 = null;
        }
        ConstraintLayout constraintLayout = g2Var15.S;
        jo.p.g(constraintLayout, "binding.coinContainer");
        yd.g1.a(constraintLayout, new c0());
        g2 g2Var16 = this.f24278z0;
        if (g2Var16 == null) {
            jo.p.v("binding");
            g2Var16 = null;
        }
        g2Var16.F.k(new d0());
        g2 g2Var17 = this.f24278z0;
        if (g2Var17 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var17;
        }
        MirraClassSeasonRatingCardView mirraClassSeasonRatingCardView = g2Var2.f46438v0;
        jo.p.g(mirraClassSeasonRatingCardView, "binding.seasonRatingView");
        yd.g1.a(mirraClassSeasonRatingCardView, new e0());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        g2Var.M(this);
        g2 g2Var3 = this.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var3;
        }
        g2Var2.V(this.X0);
        b5();
        d5();
        H4();
        a5();
        m4().w(Referer.MY_PAGE);
        s4().D();
        s4().F();
        m4().v();
        v4().d(Referer.MY_PAGE);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f24277y0;
    }

    public final Integer i4(String str) {
        if (str != null && str.length() == 4) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN);
            Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN);
            calendar.clear(10);
            calendar.clear(12);
            calendar.clear(13);
            calendar.clear(14);
            int i10 = calendar.get(1);
            String substring = str.substring(0, 2);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(2, 4);
            jo.p.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            calendar2.set(i10, Integer.parseInt(substring) - 1, Integer.parseInt(substring2));
            calendar2.clear(10);
            calendar2.clear(12);
            calendar2.clear(13);
            calendar2.clear(14);
            if (604800000 <= calendar.getTimeInMillis() - calendar2.getTimeInMillis()) {
                calendar2.set(1, calendar.get(1) + 1);
            }
            return Integer.valueOf((int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000));
        }
        return null;
    }

    public final od.h j4() {
        return (od.h) this.R0.getValue();
    }

    public final od.i k4() {
        return (od.i) this.L0.getValue();
    }

    public final nf.k l4() {
        return (nf.k) this.O0.getValue();
    }

    public final void l5() {
        String shareUrl;
        UserMe f10 = t4().B().f();
        if (f10 == null || (shareUrl = f10.getShareUrl()) == null) {
            return;
        }
        MRLogger r42 = r4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_PROFILE_SHARE_TAP);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_WHERE, Referer.MY_PAGE)));
        r42.sendLog(builder.build());
        if (shareUrl.length() > 0) {
            try {
                ChooseReceiver.a aVar = ChooseReceiver.f25051x;
                Context N2 = N2();
                jo.p.g(N2, "requireContext()");
                f3(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", shareUrl), U0(nc.i.f41880l2), PendingIntent.getBroadcast(N2(), 0, aVar.a(N2, k0.f24350w), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()).addFlags(268435456));
            } catch (ActivityNotFoundException e10) {
                g9.a.c(e10);
            }
            hf.b.f35490a.d().a();
            return;
        }
        g9.a.g("text to share is empty");
    }

    public final od.p m4() {
        return (od.p) this.B0.getValue();
    }

    public final void m5(Anniversary anniversary) {
        this.X0.t().p(Boolean.TRUE);
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        g2Var.B.a(anniversary);
        g2 g2Var3 = this.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var3;
        }
        AnniversaryFollowBalloonView anniversaryFollowBalloonView = g2Var2.B;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(300L);
        animationSet.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        alphaAnimation2.setStartOffset(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        alphaAnimation2.setDuration(300L);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.setAnimationListener(new l0());
        anniversaryFollowBalloonView.startAnimation(animationSet);
    }

    @Override // vb.i
    public void n1() {
        UserMe f10 = t4().B().f();
        if (f10 == null) {
            return;
        }
        this.K0.c(new w(f10));
    }

    public final nf.o n4() {
        return (nf.o) this.A0.getValue();
    }

    public final void n5(View view) {
        Anniversary anniversary;
        UserMe f10 = t4().B().f();
        if (f10 == null || (anniversary = f10.getAnniversary()) == null) {
            return;
        }
        this.X0.u().p(Boolean.TRUE);
        g2 g2Var = this.f24278z0;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        g2Var.C.getViewTreeObserver().addOnGlobalLayoutListener(new m0(anniversary, view));
    }

    public final tb.c o4() {
        return (tb.c) this.Q0.getValue();
    }

    public final void o5(UserMe userMe) {
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        BeginnerStreamHolidayBalloonView beginnerStreamHolidayBalloonView = g2Var.M;
        b4.a aVar = b4.f54792d;
        Resources O0 = O0();
        jo.p.g(O0, "resources");
        String continuousStreamHolidayPeriod = userMe.getContinuousStreamHolidayPeriod();
        beginnerStreamHolidayBalloonView.b(aVar.a(O0, userMe, !(continuousStreamHolidayPeriod == null || continuousStreamHolidayPeriod.length() == 0)), new n0(userMe));
        this.X0.v().p(Boolean.TRUE);
        g2 g2Var3 = this.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
        } else {
            g2Var2 = g2Var3;
        }
        StreamHolidayBalloonView streamHolidayBalloonView = g2Var2.f46439w0;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(300L);
        animationSet.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        alphaAnimation2.setStartOffset(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
        alphaAnimation2.setDuration(300L);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.setAnimationListener(new o0());
        streamHolidayBalloonView.startAnimation(animationSet);
    }

    public final od.s p4() {
        return (od.s) this.S0.getValue();
    }

    public final void p5(UserMe userMe) {
        Integer i42 = i4(userMe.getBirthday());
        if (i42 != null) {
            int intValue = i42.intValue();
            this.X0.y().p(Boolean.TRUE);
            g2 g2Var = this.f24278z0;
            g2 g2Var2 = null;
            if (g2Var == null) {
                jo.p.v("binding");
                g2Var = null;
            }
            g2Var.P.a(intValue, true);
            g2 g2Var3 = this.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var3;
            }
            BirthdayBalloonView birthdayBalloonView = g2Var2.P;
            AnimationSet animationSet = new AnimationSet(false);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            alphaAnimation2.setStartOffset(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
            alphaAnimation2.setDuration(300L);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setAnimationListener(new p0());
            birthdayBalloonView.startAnimation(animationSet);
        }
    }

    public final nf.r q4() {
        return (nf.r) this.T0.getValue();
    }

    public final void q5() {
        if (jo.p.c(n4().H().f(), Boolean.TRUE)) {
            t1.a aVar = yd.t1.f61795x;
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            String U0 = U0(nc.i.C4);
            jo.p.g(U0, "getString(R.string.text_…available_with_live_play)");
            aVar.a(N2, U0);
            return;
        }
        hf.v0 B4 = B4();
        FragmentManager p02 = p0();
        jo.p.g(p02, "childFragmentManager");
        if (hf.v0.c(B4, p02, Referer.MY_PAGE, false, 4, null)) {
            tb.a C = o4().C(Referer.MY_PAGE);
            C.a().z3(p0(), C.b());
        }
    }

    public final MRLogger r4() {
        return (MRLogger) this.D0.getValue();
    }

    public final void r5(View view) {
        UserMe f10 = t4().B().f();
        if (f10 == null) {
            return;
        }
        String continuousStreamHolidayPeriod = f10.getContinuousStreamHolidayPeriod();
        g2 g2Var = null;
        if (continuousStreamHolidayPeriod == null || continuousStreamHolidayPeriod.length() == 0) {
            this.X0.z().p(Boolean.TRUE);
            g2 g2Var2 = this.f24278z0;
            if (g2Var2 == null) {
                jo.p.v("binding");
            } else {
                g2Var = g2Var2;
            }
            g2Var.W.getViewTreeObserver().addOnGlobalLayoutListener(new q0(f10, view));
        } else {
            this.X0.K().p(Boolean.TRUE);
            g2 g2Var3 = this.f24278z0;
            if (g2Var3 == null) {
                jo.p.v("binding");
            } else {
                g2Var = g2Var3;
            }
            g2Var.f46439w0.getViewTreeObserver().addOnGlobalLayoutListener(new r0(f10, view));
        }
        MRLogger r42 = r4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_MYPAGE_CONTINUOUS_LIVE_RIBBON_TAP);
        int continuousStreamHolidaysNum = f10.getContinuousStreamHolidaysNum();
        UserMe f11 = t4().B().f();
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new ContinuousLiveRibbonTapLog(continuousStreamHolidaysNum, f11 != null ? f11.getMaxContinuousRecord() : 0).toJson())));
        r42.sendLog(builder.build());
    }

    public final rc.r0 s4() {
        return (rc.r0) this.H0.getValue();
    }

    public final void s5() {
        uo.l.d(this, null, null, new s0(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        super.t1(bundle);
        s sVar = new s(this);
        xq.a a10 = gq.a.a(this);
        t tVar = new t(sVar);
        this.W0 = (od.z) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(od.z.class), new v(tVar), new u(sVar, null, null, a10)).getValue());
        X2(true);
    }

    public final rc.u1 t4() {
        return (rc.u1) this.I0.getValue();
    }

    public final void t5() {
        p0().k().r(nc.e.f41854z, EmomoUserViewFragment.E0.a(C4().T4())).i();
    }

    public final of.r u4() {
        return (of.r) this.F0.getValue();
    }

    public final void u5() {
        String f10 = t4().J().f();
        if (f10 == null) {
            return;
        }
        tb.c o42 = o4();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(o42.I(N2, f10, 1));
    }

    public final od.i0 v4() {
        return (od.i0) this.U0.getValue();
    }

    public final void v5() {
        String f10 = t4().J().f();
        if (f10 == null) {
            return;
        }
        tb.c o42 = o4();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(o42.I(N2, f10, 0));
    }

    @Override // be.w
    public void w() {
        s4().E();
    }

    public final nf.c0 w4() {
        return (nf.c0) this.V0.getValue();
    }

    public final void w5(UserMe userMe) {
        fd.e.Q0.a(jf.o0.F.a(userMe)).z3(p0(), "HolidayPurchaseDialogFragment");
    }

    @Override // vb.i
    public void x(Serializable serializable) {
        jo.p.h(serializable, "posssessionCoin");
        jf.f fVar = (jf.f) serializable;
        s4().M(fVar);
        UserMe f10 = t4().B().f();
        if (f10 != null && fVar.f(false, f10.getPurchaseContinuousLiveHolidayRequiredCoin())) {
            this.K0.c(new x(f10));
        }
    }

    public final nd.i1 x4() {
        return (nd.i1) this.G0.getValue();
    }

    public final void x5(View view, LabelRemainingPeriod labelRemainingPeriod, boolean z10) {
        g2 g2Var = this.f24278z0;
        g2 g2Var2 = null;
        if (g2Var == null) {
            jo.p.v("binding");
            g2Var = null;
        }
        RibbonRemainingLabelView ribbonRemainingLabelView = g2Var.f46435s0;
        g3.a aVar = g3.f54965c;
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ribbonRemainingLabelView.b(aVar.a(N2, labelRemainingPeriod));
        g2 g2Var3 = this.f24278z0;
        if (g2Var3 == null) {
            jo.p.v("binding");
            g2Var3 = null;
        }
        g2Var3.f46436t0.setVisibility(0);
        g2 g2Var4 = this.f24278z0;
        if (g2Var4 == null) {
            jo.p.v("binding");
            g2Var4 = null;
        }
        FrameLayout frameLayout = g2Var4.f46436t0;
        jo.p.g(frameLayout, "binding.ribbonRemainingLabelViewContainer");
        if (o3.c0.V(frameLayout) && !frameLayout.isLayoutRequested()) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            g2 g2Var5 = this.f24278z0;
            if (g2Var5 == null) {
                jo.p.v("binding");
                g2Var5 = null;
            }
            cVar.g(g2Var5.E);
            g2 g2Var6 = this.f24278z0;
            if (g2Var6 == null) {
                jo.p.v("binding");
                g2Var6 = null;
            }
            int id2 = g2Var6.f46436t0.getId();
            int i10 = iArr[0];
            g2 g2Var7 = this.f24278z0;
            if (g2Var7 == null) {
                jo.p.v("binding");
                g2Var7 = null;
            }
            cVar.A(id2, 6, (i10 - (g2Var7.f46436t0.getWidth() / 2)) + (view.getWidth() / 2));
            g2 g2Var8 = this.f24278z0;
            if (g2Var8 == null) {
                jo.p.v("binding");
                g2Var8 = null;
            }
            cVar.c(g2Var8.E);
            g2 g2Var9 = this.f24278z0;
            if (g2Var9 == null) {
                jo.p.v("binding");
                g2Var9 = null;
            }
            g2Var9.f46436t0.clearAnimation();
            g2 g2Var10 = this.f24278z0;
            if (g2Var10 == null) {
                jo.p.v("binding");
            } else {
                g2Var2 = g2Var10;
            }
            FrameLayout frameLayout2 = g2Var2.f46436t0;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new u0(z10, this));
            frameLayout2.startAnimation(alphaAnimation);
            return;
        }
        frameLayout.addOnLayoutChangeListener(new t0(view, this, z10));
    }

    public final kf.v y4() {
        return (kf.v) this.P0.getValue();
    }

    public final hf.o0 z4() {
        return (hf.o0) this.C0.getValue();
    }

    public final void z5() {
        Intent e10;
        wn.k<Boolean, Boolean> f10 = t4().o().f();
        if (f10 != null) {
            if (f10.d().booleanValue()) {
                if (x4().a().c()) {
                    tb.c o42 = o4();
                    Context N2 = N2();
                    jo.p.g(N2, "requireContext()");
                    e10 = o42.o(N2, null);
                    e10.addFlags(335544320);
                } else {
                    tb.c o43 = o4();
                    Context N22 = N2();
                    jo.p.g(N22, "requireContext()");
                    e10 = c.a.e(o43, N22, null, false, false, 14, null);
                }
                f3(e10);
            } else {
                androidx.activity.result.c<Intent> cVar = this.f24275a1;
                tb.c o44 = o4();
                Context N23 = N2();
                jo.p.g(N23, "requireContext()");
                cVar.a(o44.K(N23, false, false, false));
            }
            MRLogger r42 = r4();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_AVATAR_IMP_CLOSET);
            String f11 = n4().q().f();
            if (f11 != null) {
                builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
                builder.setTargetId(f11);
            }
            builder.setPageId(Referer.MY_PAGE);
            r42.sendLog(builder.build());
        }
    }
}
