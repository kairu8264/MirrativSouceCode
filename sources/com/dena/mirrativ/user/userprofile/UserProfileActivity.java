package com.dena.mirrativ.user.userprofile;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.MirraClassSeasonRatingCardView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.user.common.ProfileImageActivity;
import com.dena.mirrativ.user.common.ProfileUserListActivity;
import com.dena.mirrativ.user.userprofile.UserProfileActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.AnniversaryStreamBalloonView;
import com.dena.mirrorman.customview.BirthdayBalloonView;
import com.dena.mirrorman.customview.ContinuousStreamBalloonView;
import com.dena.mirrorman.customview.FollowView;
import com.dena.mirrorman.customview.LiveRequestCountView;
import com.dena.mirrorman.customview.UserProfileAnniversaryFollowBalloonView;
import com.dena.mirrorman.feature.app.AppPageActivity;
import com.dena.mirrorman.fragment.EmomoUserViewFragment;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import com.dena.mirrorman.net.api.response.user.Anniversary;
import com.dena.mirrorman.net.api.response.user.AnniversaryType;
import com.dena.mirrorman.net.api.response.user.UserLink;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.dena.mirrorman.unity.UnityActionCreator;
import com.dena.mirrorman.unity.UnityLoadAvatarModel;
import com.dena.mirrorman.unity.UnityStore;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.material.appbar.AppBarLayout;
import hf.v0;
import ia.a;
import ie.f;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.KotlinNothingValueException;
import kq.a;
import od.t0;
import rd.w0;
import uo.b1;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class UserProfileActivity extends e.b implements f.b, gf.z, md.d, uo.q0 {

    /* renamed from: g0  reason: collision with root package name */
    public static final a f24944g0 = new a(null);

    /* renamed from: h0  reason: collision with root package name */
    public static final int f24945h0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = new s0(jo.f0.b(t0.class), new k0(this), new j0(new i0(this), null, new p0(), gq.a.a(this)));
    public final wn.f Q = new s0(jo.f0.b(nf.o0.class), new n0(this), new m0(new l0(this), null, new q0(), gq.a.a(this)));
    public final wn.f R = wn.g.a(new b());
    public final md.i0 S = new md.i0();
    public final wn.f T = wn.g.a(new o0());
    public final wn.f U = wn.g.a(new o());
    public Menu V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f24946a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f24947b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f24948c0;

    /* renamed from: d0  reason: collision with root package name */
    public final FragmentRunner f24949d0;

    /* renamed from: e0  reason: collision with root package name */
    public nf.j f24950e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f24951f0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2) {
            jo.p.h(context, "context");
            jo.p.h(str, "userId");
            jo.p.h(str2, "refererOfLauncher");
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("EXTRA_USER_ID", str);
            intent.putExtra("EXTRA_REFERER_OF_LAUNCHER", str2);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserProfile f24953x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ View f24954y;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public static final a f24955w = new a();

            public a() {
                super(0);
            }

            public final void a() {
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
            public final /* synthetic */ UserProfileActivity f24956a;

            public b(UserProfileActivity userProfileActivity) {
                this.f24956a = userProfileActivity;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f24956a.S.A().p(Boolean.FALSE);
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

        public a0(UserProfile userProfile, View view) {
            this.f24953x = userProfile;
            this.f24954y = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UserProfileActivity.this.m4().Q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            UserProfileActivity.this.m4().Q.b(this.f24953x, false, a.f24955w);
            int[] iArr = new int[2];
            this.f24954y.getLocationOnScreen(iArr);
            UserProfileActivity.this.m4().Q.setX((iArr[0] - (UserProfileActivity.this.m4().Q.getWidth() / 2)) + (this.f24954y.getWidth() / 2));
            ContinuousStreamBalloonView continuousStreamBalloonView = UserProfileActivity.this.m4().Q;
            AnimationSet animationSet = new AnimationSet(false);
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            alphaAnimation2.setStartOffset(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            alphaAnimation2.setDuration(300L);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setAnimationListener(new b(userProfileActivity));
            continuousStreamBalloonView.startAnimation(animationSet);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<pc.w> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final pc.w invoke() {
            return (pc.w) androidx.databinding.f.g(UserProfileActivity.this, nc.f.activity_user_profile);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24958w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24959x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24960y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24958w = componentCallbacks;
            this.f24959x = aVar;
            this.f24960y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f24958w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f24959x, this.f24960y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends FragmentManager.j {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Fragment f24962b;

        public c(Fragment fragment) {
            this.f24962b = fragment;
        }

        @Override // androidx.fragment.app.FragmentManager.j
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            jo.p.h(fragmentManager, "fragmentManager");
            jo.p.h(fragment, "fragment");
            super.e(fragmentManager, fragment);
            if (fragment instanceof EmomoFullScreenUserViewFragment) {
                UserProfileActivity.this.a3().k().s(UserProfileActivity.this.m4().E.getId(), this.f24962b, "EmomoUserViewFragment").j();
                UserProfileActivity.this.a3().n1(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24963w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24964x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24965y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24963w = componentCallbacks;
            this.f24964x = aVar;
            this.f24965y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24963w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(v0.class), this.f24964x, this.f24965y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<wn.v> {
        public d() {
            super(0);
        }

        public final void a() {
            Fragment e02 = UserProfileActivity.this.a3().e0("EmomoFullScreenUserViewFragment");
            if (e02 != null) {
                UserProfileActivity.this.a3().k().q(e02).i();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24967w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24968x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24969y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24967w = componentCallbacks;
            this.f24968x = aVar;
            this.f24969y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f24967w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f24968x, this.f24969y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.userprofile.UserProfileActivity$observeStoreValues$13", f = "UserProfileActivity.kt", l = {985}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24970w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24971x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24972y;

        /* renamed from: z  reason: collision with root package name */
        public int f24973z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
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
                int r1 = r8.f24973z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f24972y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f24971x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f24970w
                com.dena.mirrativ.user.userprofile.UserProfileActivity r4 = (com.dena.mirrativ.user.userprofile.UserProfileActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L7b
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
                com.dena.mirrativ.user.userprofile.UserProfileActivity r9 = com.dena.mirrativ.user.userprofile.UserProfileActivity.this
                nf.o0 r9 = com.dena.mirrativ.user.userprofile.UserProfileActivity.g4(r9)
                wo.x r3 = r9.l()
                com.dena.mirrativ.user.userprofile.UserProfileActivity r9 = com.dena.mirrativ.user.userprofile.UserProfileActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
                r4 = r9
                r9 = r8
            L3d:
                r9.f24970w = r4     // Catch: java.lang.Throwable -> L7b
                r9.f24971x = r3     // Catch: java.lang.Throwable -> L7b
                r9.f24972y = r1     // Catch: java.lang.Throwable -> L7b
                r9.f24973z = r2     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L7b
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L78
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L78
                if (r9 == 0) goto L72
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L78
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L78
                pc.w r9 = com.dena.mirrativ.user.userprofile.UserProfileActivity.V3(r5)     // Catch: java.lang.Throwable -> L78
                com.dena.mirrorman.customview.LiveRequestCountView r9 = r9.f46518d0     // Catch: java.lang.Throwable -> L78
                r6 = 0
                r9.setVisibility(r6)     // Catch: java.lang.Throwable -> L78
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L72:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L78:
                r9 = move-exception
                r3 = r4
                goto L7c
            L7b:
                r9 = move-exception
            L7c:
                throw r9     // Catch: java.lang.Throwable -> L7d
            L7d:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.userprofile.UserProfileActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<UnityStore> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24974w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24975x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24976y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24974w = componentCallbacks;
            this.f24975x = aVar;
            this.f24976y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.unity.UnityStore] */
        @Override // io.a
        public final UnityStore invoke() {
            ComponentCallbacks componentCallbacks = this.f24974w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityStore.class), this.f24975x, this.f24976y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.userprofile.UserProfileActivity$observeStoreValues$14", f = "UserProfileActivity.kt", l = {464}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24977w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<UnityLoadAvatarModel> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f24979w;

            public a(UserProfileActivity userProfileActivity) {
                this.f24979w = userProfileActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(UnityLoadAvatarModel unityLoadAvatarModel, ao.d<? super wn.v> dVar) {
                if (jo.p.c(unityLoadAvatarModel.getKey(), this.f24979w.v4())) {
                    nf.j jVar = this.f24979w.f24950e0;
                    if (jVar == null) {
                        jo.p.v("emomoClosetViewStore");
                        jVar = null;
                    }
                    jf.c value = jVar.g().getValue();
                    if (value != null) {
                        this.f24979w.s4().playRandomMotion(value);
                    }
                    return wn.v.f59242a;
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
            int i10 = this.f24977w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<UnityLoadAvatarModel> loadAvatarModelCompletedFlow = UserProfileActivity.this.t4().getLoadAvatarModelCompletedFlow();
                a aVar = new a(UserProfileActivity.this);
                this.f24977w = 1;
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
    public static final class f0 extends jo.q implements io.a<UnityActionCreator> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24980w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24981x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24982y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24980w = componentCallbacks;
            this.f24981x = aVar;
            this.f24982y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.UnityActionCreator, java.lang.Object] */
        @Override // io.a
        public final UnityActionCreator invoke() {
            ComponentCallbacks componentCallbacks = this.f24980w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(UnityActionCreator.class), this.f24981x, this.f24982y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.userprofile.UserProfileActivity$observeStoreValues$15", f = "UserProfileActivity.kt", l = {472}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24983w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f24985w;

            public a(UserProfileActivity userProfileActivity) {
                this.f24985w = userProfileActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f24985w.y4(mRError);
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
            int i10 = this.f24983w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> o10 = UserProfileActivity.this.x4().o();
                a aVar = new a(UserProfileActivity.this);
                this.f24983w = 1;
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

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.a<od.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24986w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24987x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24988y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24986w = componentCallbacks;
            this.f24987x = aVar;
            this.f24988y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.i, java.lang.Object] */
        @Override // io.a
        public final od.i invoke() {
            ComponentCallbacks componentCallbacks = this.f24986w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.i.class), this.f24987x, this.f24988y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ i9.a f24989w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserProfileActivity f24990x;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f24991w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UserProfileActivity userProfileActivity) {
                super(0);
                this.f24991w = userProfileActivity;
            }

            public final void a() {
                MRLogger q42 = this.f24991w.q4();
                MRLog.Companion companion = MRLog.Companion;
                UserProfileActivity userProfileActivity = this.f24991w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_YELL_VIEW_YELL_RANK_LIST_IMP);
                builder.setPageId(Referer.PROFILE);
                builder.setTargetId(userProfileActivity.v4());
                q42.sendLog(builder.build());
                tb.a i02 = this.f24991w.p4().i0(Referer.PROFILE, this.f24991w.v4());
                i02.a().z3(this.f24991w.a3(), i02.b());
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(i9.a aVar, UserProfileActivity userProfileActivity) {
            super(2);
            this.f24989w = aVar;
            this.f24990x = userProfileActivity;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            i9.a aVar = this.f24989w;
            jo.p.g(aVar, "it");
            i9.b.a(null, aVar, new a(this.f24990x), iVar, i9.a.C << 3, 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24992w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24993x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24994y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24992w = componentCallbacks;
            this.f24993x = aVar;
            this.f24994y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24992w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f24993x, this.f24994y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.p<Integer, View, wn.v> {
        public i() {
            super(2);
        }

        public final void a(int i10, View view) {
            AnniversaryType type;
            jo.p.h(view, "view");
            if (UserProfileActivity.this.S.m()) {
                boolean z10 = false;
                UserProfileActivity.this.S.H(false);
                UserProfile f10 = UserProfileActivity.this.x4().B().f();
                if (f10 != null) {
                    UserProfileActivity userProfileActivity = UserProfileActivity.this;
                    Anniversary anniversary = f10.getAnniversary();
                    if (anniversary != null && (type = anniversary.getType()) != null && type.isStreamContinuous()) {
                        z10 = true;
                    }
                    if (!z10) {
                        userProfileActivity.f5(view, f10);
                        return;
                    }
                    Anniversary anniversary2 = f10.getAnniversary();
                    jo.p.e(anniversary2);
                    userProfileActivity.b5(view, anniversary2);
                }
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, View view) {
            a(num.intValue(), view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24996w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ComponentActivity componentActivity) {
            super(0);
            this.f24996w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24996w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.p<Integer, View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ UserProfile f24997w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UserProfileActivity f24998x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UserProfile userProfile, UserProfileActivity userProfileActivity) {
            super(2);
            this.f24997w = userProfile;
            this.f24998x = userProfileActivity;
        }

        public final void a(int i10, View view) {
            jo.p.h(view, "view");
            if (this.f24997w.getRibbons().get(i10).isContinuousRibbon()) {
                Boolean f10 = this.f24998x.S.A().f();
                Boolean bool = Boolean.TRUE;
                if (jo.p.c(f10, bool)) {
                    this.f24998x.m4().Q.clearAnimation();
                    this.f24998x.S.A().p(Boolean.FALSE);
                } else if (jo.p.c(this.f24998x.S.u().f(), bool)) {
                    this.f24998x.m4().Q.clearAnimation();
                    this.f24998x.S.u().p(Boolean.FALSE);
                } else {
                    UserProfile f11 = this.f24998x.x4().B().f();
                    if (f11 != null) {
                        this.f24998x.f5(view, f11);
                    }
                }
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, View view) {
            a(num.intValue(), view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24999w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25000x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25001y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25002z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24999w = aVar;
            this.f25000x = aVar2;
            this.f25001y = aVar3;
            this.f25002z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24999w;
            vq.a aVar2 = this.f25000x;
            io.a aVar3 = this.f25001y;
            xq.a aVar4 = this.f25002z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.t0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25003w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f25003w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25003w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25004w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(ComponentActivity componentActivity) {
            super(0);
            this.f25004w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25004w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25005w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25006x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25007y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25008z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25005w = aVar;
            this.f25006x = aVar2;
            this.f25007y = aVar3;
            this.f25008z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25005w;
            vq.a aVar2 = this.f25006x;
            io.a aVar3 = this.f25007y;
            xq.a aVar4 = this.f25008z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25009w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ComponentActivity componentActivity) {
            super(0);
            this.f25009w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25009w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25010w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f25010w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25010w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25011w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25012x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25013y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25014z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25011w = aVar;
            this.f25012x = aVar2;
            this.f25013y = aVar3;
            this.f25014z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25011w;
            vq.a aVar2 = this.f25012x;
            io.a aVar3 = this.f25013y;
            xq.a aVar4 = this.f25014z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.o0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<uq.a> {
        public n() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(UserProfileActivity.this.v4());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25016w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ComponentActivity componentActivity) {
            super(0);
            this.f25016w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25016w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<String> {
        public o() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = UserProfileActivity.this.getIntent().getStringExtra("EXTRA_REFERER_OF_LAUNCHER");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 extends jo.q implements io.a<String> {
        public o0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = UserProfileActivity.this.getIntent().getStringExtra("EXTRA_USER_ID");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p implements View.OnLayoutChangeListener {
        public p() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            if (UserProfileActivity.this.m4().F.getLineCount() > 3 || UserProfileActivity.this.m4().F.getLayout().getEllipsisCount(UserProfileActivity.this.m4().F.getLineCount() - 1) > 0) {
                UserProfileActivity.this.m4().f46520f0.setVisibility(0);
                UserProfileActivity.this.m4().G.setVisibility(8);
                return;
            }
            UserProfileActivity.this.m4().f46520f0.setVisibility(8);
            UserProfileActivity.this.m4().G.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p0 extends jo.q implements io.a<uq.a> {
        public p0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(UserProfileActivity.this.v4(), Referer.PROFILE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.l<Integer, wn.v> {
        public q() {
            super(1);
        }

        public final void a(int i10) {
            App.AppParams appParams;
            List<App.AppParams> f10 = UserProfileActivity.this.x4().i().f();
            if (f10 == null || (appParams = f10.get(i10)) == null) {
                return;
            }
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            userProfileActivity.startActivity(AppPageActivity.f25660c0.a(userProfileActivity, appParams.getAppId(), Referer.PROFILE, appParams));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 extends jo.q implements io.a<uq.a> {
        public q0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(UserProfileActivity.this.v4());
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.l<View, wn.v> {
        public r() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g5.b bVar = new g5.b();
            if (Integer.MAX_VALUE == UserProfileActivity.this.m4().F.getMaxLines()) {
                UserProfileActivity.this.m4().F.setMaxLines(3);
                UserProfileActivity.this.m4().f46520f0.setText(UserProfileActivity.this.getResources().getString(nc.i.Q2));
                return;
            }
            bVar.b0(300L);
            bVar.c(UserProfileActivity.this.m4().F.getId());
            bVar.c(UserProfileActivity.this.m4().O.getId());
            g5.o.a(UserProfileActivity.this.m4().O, bVar);
            UserProfileActivity.this.m4().F.setMaxLines(Integer.MAX_VALUE);
            UserProfileActivity.this.m4().f46520f0.setText(UserProfileActivity.this.getResources().getString(nc.i.U0));
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
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            String f10 = userProfileActivity.o4().q().f();
            if (f10 == null) {
                return;
            }
            userProfileActivity.startActivity(WebViewActivity.a.b(aVar, userProfileActivity, f10, false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.userprofile.UserProfileActivity$setupUserActions$2$3", f = "UserProfileActivity.kt", l = {553}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25025w;

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
            int i10 = this.f25025w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f25025w = 1;
                if (b1.a(300L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            UserProfileActivity.this.f24951f0 = false;
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.userprofile.UserProfileActivity$setupUserActions$2$5", f = "UserProfileActivity.kt", l = {560}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25027w;

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
            int i10 = this.f25027w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f25027w = 1;
                if (b1.a(300L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            UserProfileActivity.this.m4().f46516b0.setVisibility(8);
            UserProfileActivity.this.f24951f0 = false;
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.l<View, wn.v> {
        public v() {
            super(1);
        }

        public final void a(View view) {
            Boolean f10;
            jo.p.h(view, "it");
            v0 u42 = UserProfileActivity.this.u4();
            FragmentManager a32 = UserProfileActivity.this.a3();
            jo.p.g(a32, "supportFragmentManager");
            if (!v0.c(u42, a32, Referer.PROFILE, false, 4, null) || (f10 = UserProfileActivity.this.x4().D().f()) == null) {
                return;
            }
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            if (f10.booleanValue()) {
                userProfileActivity.w4().B();
            } else {
                userProfileActivity.w4().r();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends RecyclerView.u {
        public w() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            List<App.AppParams> f10;
            String f11;
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (f10 = UserProfileActivity.this.x4().i().f()) == null || (f11 = UserProfileActivity.this.x4().s().f()) == null || jo.p.c(UserProfileActivity.this.x4().E().f(), Boolean.TRUE)) {
                return;
            }
            if ((f11.length() == 0) || f10.size() > linearLayoutManager.l2() + 10) {
                return;
            }
            UserProfileActivity.this.w4().u(f11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x implements ia.a {
        public x() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            UserProfileActivity.this.S.t().p(Boolean.FALSE);
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
    public static final class y implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Anniversary f25033x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ View f25034y;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ UserProfileActivity f25035a;

            public a(UserProfileActivity userProfileActivity) {
                this.f25035a = userProfileActivity;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f25035a.S.u().p(Boolean.FALSE);
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

        public y(Anniversary anniversary, View view) {
            this.f25033x = anniversary;
            this.f25034y = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UserProfileActivity.this.m4().B.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            UserProfileActivity.this.m4().B.a(this.f25033x, false);
            int[] iArr = new int[2];
            this.f25034y.getLocationOnScreen(iArr);
            UserProfileActivity.this.m4().B.setX((iArr[0] - (UserProfileActivity.this.m4().B.getWidth() / 2)) + (this.f25034y.getWidth() / 2));
            AnniversaryStreamBalloonView anniversaryStreamBalloonView = UserProfileActivity.this.m4().B;
            AnimationSet animationSet = new AnimationSet(false);
            UserProfileActivity userProfileActivity = UserProfileActivity.this;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(300L);
            animationSet.addAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            alphaAnimation2.setStartOffset(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            alphaAnimation2.setDuration(300L);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.setAnimationListener(new a(userProfileActivity));
            anniversaryStreamBalloonView.startAnimation(animationSet);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z implements Animation.AnimationListener {
        public z() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            UserProfileActivity.this.S.y().p(Boolean.FALSE);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public UserProfileActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.W = wn.g.b(iVar, new b0(this, null, null));
        this.X = wn.g.b(iVar, new c0(this, null, null));
        this.Y = wn.g.b(iVar, new d0(this, null, null));
        this.Z = wn.g.b(iVar, new e0(this, null, null));
        this.f24946a0 = wn.g.b(iVar, new f0(this, null, null));
        this.f24947b0 = wn.g.b(iVar, new g0(this, null, null));
        this.f24948c0 = wn.g.b(iVar, new h0(this, null, null));
        this.f24949d0 = new FragmentRunner(this);
    }

    public static final void A4(UserProfileActivity userProfileActivity, String str) {
        jo.p.h(userProfileActivity, "this$0");
        if (jo.p.c(str, "")) {
            userProfileActivity.m4().f46520f0.setVisibility(8);
        }
        userProfileActivity.m4().F.setText(str);
    }

    public static final void B4(UserProfileActivity userProfileActivity, UserProfile userProfile) {
        String str;
        boolean z10;
        AnniversaryType type;
        jo.p.h(userProfileActivity, "this$0");
        if (userProfile == null) {
            return;
        }
        boolean z11 = false;
        if (userProfile.isBlocked()) {
            of.n.A(userProfileActivity, nc.i.f41879h, false);
            userProfileActivity.finish();
            return;
        }
        userProfileActivity.n4().i(userProfileActivity.v4(), userProfile.getMaxContinuousRecord());
        md.i0 i0Var = userProfileActivity.S;
        if (userProfile.getBirthday().length() == 4) {
            String substring = userProfile.getBirthday().substring(0, 2);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = userProfile.getBirthday().substring(2);
            jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
            if (so.q.O0(substring) == '0') {
                substring = substring.substring(1, 2);
                jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (so.q.O0(substring2) == '0') {
                substring2 = substring2.substring(1, 2);
                jo.p.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str = userProfileActivity.getString(nc.i.P4, new Object[]{substring, substring2});
        } else {
            str = "";
        }
        jo.p.g(str, "if (userProfile.birthday…                } else \"\"");
        i0Var.a(userProfile, str);
        Integer l42 = userProfileActivity.l4(userProfile.getBirthday());
        List<RibbonResponse> ribbons = userProfile.getRibbons();
        if (!(ribbons instanceof Collection) || !ribbons.isEmpty()) {
            for (RibbonResponse ribbonResponse : ribbons) {
                if (ribbonResponse.isContinuousRibbon()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        Anniversary anniversary = userProfile.getAnniversary();
        if ((anniversary != null ? anniversary.getType() : null) == AnniversaryType.BIRTHDAY && l42 != null && l42.intValue() >= -1 && l42.intValue() <= 1) {
            userProfileActivity.S.H(false);
            userProfileActivity.c5(userProfile);
        } else {
            Anniversary anniversary2 = userProfile.getAnniversary();
            if ((anniversary2 == null || (type = anniversary2.getType()) == null || !type.isStreamContinuous()) ? false : true) {
                userProfileActivity.S.H(true);
            } else {
                Anniversary anniversary3 = userProfile.getAnniversary();
                if ((anniversary3 != null ? anniversary3.getType() : null) == AnniversaryType.FOLLOWER) {
                    Anniversary anniversary4 = userProfile.getAnniversary();
                    jo.p.e(anniversary4);
                    userProfileActivity.a5(anniversary4);
                } else if (l42 != null && l42.intValue() > 1 && l42.intValue() <= 14) {
                    String continuousStreamHolidayPeriod = userProfile.getContinuousStreamHolidayPeriod();
                    if (!(!((continuousStreamHolidayPeriod == null || continuousStreamHolidayPeriod.length() == 0) ? true : true))) {
                        userProfileActivity.c5(userProfile);
                    }
                } else {
                    userProfileActivity.S.H(z10);
                }
            }
        }
        RecyclerView recyclerView = userProfileActivity.m4().f46523i0;
        List<RibbonResponse> ribbons2 = userProfile.getRibbons();
        ArrayList arrayList = new ArrayList(xn.t.u(ribbons2, 10));
        for (RibbonResponse ribbonResponse2 : ribbons2) {
            arrayList.add(ribbonResponse2.getImageUrl());
        }
        w0 w0Var = new w0(arrayList);
        w0Var.g(new i());
        w0Var.h(new j(userProfile, userProfileActivity));
        recyclerView.setAdapter(w0Var);
        userProfileActivity.w4().t(userProfile.getProfileImageUrl(), userProfile.getAvatarBackgroundImageUrl(), userProfile.getAvatarBodyImageUrl(), userProfileActivity.m4().f46527m0.getHeight(), userProfileActivity.m4().f46527m0.getWidth());
        List d10 = xn.r.d(userProfileActivity.getString(nc.i.f41896x));
        List d11 = xn.r.d(md.j.F0.a(userProfileActivity.v4(), Referer.PROFILE));
        FragmentManager a32 = userProfileActivity.a3();
        jo.p.g(a32, "supportFragmentManager");
        userProfileActivity.m4().f46540z0.setAdapter(new rd.h(d10, d11, a32));
        userProfileActivity.m4().f46526l0.setupWithViewPager(userProfileActivity.m4().f46540z0);
        userProfileActivity.invalidateOptionsMenu();
    }

    public static final void C4(UserProfileActivity userProfileActivity, Integer num) {
        jo.p.h(userProfileActivity, "this$0");
        j5.a adapter = userProfileActivity.m4().f46540z0.getAdapter();
        rd.h hVar = adapter instanceof rd.h ? (rd.h) adapter : null;
        if (hVar != null) {
            hVar.u(xn.r.d(userProfileActivity.getString(nc.i.f41896x) + '(' + num + ')'));
            hVar.i();
        }
    }

    public static final void D4(UserProfileActivity userProfileActivity, Integer num) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.S.g().p(num);
    }

    public static final void E4(UserProfileActivity userProfileActivity, Boolean bool) {
        jo.p.h(userProfileActivity, "this$0");
        if (bool != null) {
            bool.booleanValue();
            userProfileActivity.S.r().p(bool);
        }
    }

    public static final void F4(UserProfileActivity userProfileActivity, Bitmap bitmap) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.S.j().p(bitmap);
    }

    public static final void G4(UserProfileActivity userProfileActivity, Bitmap bitmap) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.S.b().p(bitmap);
    }

    public static final void H4(UserProfileActivity userProfileActivity, List list) {
        jo.p.h(userProfileActivity, "this$0");
        jo.p.g(list, "apps");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            App.AppParams appParams = (App.AppParams) it.next();
            arrayList.add(new ud.c(appParams.getAppId(), appParams.getIconUrl(), null, 4, null));
        }
        userProfileActivity.S.v().p(Boolean.valueOf(!arrayList.isEmpty()));
        RecyclerView.h adapter = userProfileActivity.m4().D.getAdapter();
        rd.c cVar = adapter instanceof rd.c ? (rd.c) adapter : null;
        if (cVar == null) {
            return;
        }
        cVar.h(arrayList);
    }

    public static final void I4(UserProfileActivity userProfileActivity, Boolean bool) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.S.z().p(bool);
    }

    public static final void J4(UserProfileActivity userProfileActivity, MRError mRError) {
        jo.p.h(userProfileActivity, "this$0");
        if (mRError == null) {
            return;
        }
        userProfileActivity.y4(mRError);
    }

    public static final void K4(UserProfileActivity userProfileActivity, MRError mRError) {
        jo.p.h(userProfileActivity, "this$0");
        if (mRError == null) {
            return;
        }
        userProfileActivity.y4(mRError);
    }

    public static final void L4(UserProfileActivity userProfileActivity, Long l10) {
        jo.p.h(userProfileActivity, "this$0");
        LiveRequestCountView liveRequestCountView = userProfileActivity.m4().f46518d0;
        jo.p.g(l10, "it");
        liveRequestCountView.setRequestCount(l10.longValue());
    }

    public static final void M4(UserProfileActivity userProfileActivity, h9.a aVar) {
        jo.p.h(userProfileActivity, "this$0");
        MirraClassSeasonRatingCardView mirraClassSeasonRatingCardView = userProfileActivity.m4().f46524j0;
        jo.p.g(aVar, "it");
        mirraClassSeasonRatingCardView.g(aVar);
        userProfileActivity.m4().f46524j0.setVisibility(0);
    }

    public static final void N4(UserProfileActivity userProfileActivity, i9.a aVar) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.m4().E.getLayoutParams().height = de.a.b(userProfileActivity, aVar.c() ? 338 : 300);
        userProfileActivity.m4().f46525k0.getLayoutParams().height = de.a.b(userProfileActivity, aVar.c() ? TsExtractor.TS_STREAM_TYPE_DTS : 100);
        userProfileActivity.m4().L.setVisibility(aVar.c() ? 0 : 8);
        userProfileActivity.m4().L.setContent(s0.c.c(-2016483698, true, new h(aVar, userProfileActivity)));
    }

    public static final void Q4(UserProfileActivity userProfileActivity, AppBarLayout appBarLayout, int i10) {
        int i11;
        jo.p.h(userProfileActivity, "this$0");
        Bitmap f10 = userProfileActivity.x4().h().f();
        if (f10 == null) {
            return;
        }
        int height = userProfileActivity.m4().f46527m0.getHeight();
        int height2 = userProfileActivity.m4().E.getHeight();
        if (i10 == 0) {
            i11 = 0;
        } else {
            int i12 = -i10;
            int i13 = height2 - height;
            i11 = i12 < i13 ? (int) ((i12 * 255.0f) / i13) : 255;
        }
        e.a m32 = userProfileActivity.m3();
        if (m32 != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(userProfileActivity.getResources(), f10);
            bitmapDrawable.setAlpha(i11);
            m32.l(bitmapDrawable);
        }
        float f11 = i11 / 255.0f;
        userProfileActivity.m4().f46534t0.setAlpha(f11);
        userProfileActivity.m4().f46532r0.setAlpha(f11);
        userProfileActivity.m4().f46530p0.setAlpha(f11);
        userProfileActivity.m4().S.setVisibility(i11 == 255 ? 0 : 8);
        userProfileActivity.m4().K.setVisibility((i11 == 255 && jo.p.c(userProfileActivity.S.z().f(), Boolean.TRUE)) ? 0 : 8);
        Menu menu = userProfileActivity.V;
        MenuItem findItem = menu != null ? menu.findItem(nc.e.chat_menu_item) : null;
        if (findItem != null) {
            findItem.setVisible(i11 != 255);
        }
        Menu menu2 = userProfileActivity.V;
        MenuItem findItem2 = menu2 != null ? menu2.findItem(nc.e.block_menu_item) : null;
        if (findItem2 != null) {
            findItem2.setVisible(i11 != 255);
        }
        Menu menu3 = userProfileActivity.V;
        MenuItem findItem3 = menu3 != null ? menu3.findItem(nc.e.report_menu_item) : null;
        if (findItem3 != null) {
            findItem3.setVisible(i11 != 255);
        }
        if (!userProfileActivity.f24951f0 && i10 == 0 && userProfileActivity.m4().f46516b0.getVisibility() == 8) {
            userProfileActivity.m4().f46516b0.setVisibility(0);
            userProfileActivity.f24951f0 = true;
            ConstraintLayout constraintLayout = userProfileActivity.m4().f46516b0;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            constraintLayout.startAnimation(alphaAnimation);
            uo.l.d(userProfileActivity, null, null, new t(null), 3, null);
        } else if (userProfileActivity.f24951f0 || i10 >= 0 || userProfileActivity.m4().f46516b0.getVisibility() != 0) {
        } else {
            userProfileActivity.f24951f0 = true;
            ConstraintLayout constraintLayout2 = userProfileActivity.m4().f46516b0;
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(300L);
            constraintLayout2.startAnimation(alphaAnimation2);
            uo.l.d(userProfileActivity, null, null, new u(null), 3, null);
        }
    }

    public static final void R4(UserProfileActivity userProfileActivity, View view) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.h5();
    }

    public static final void S4(UserProfileActivity userProfileActivity, View view) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.g5();
    }

    public static final void T4(UserProfileActivity userProfileActivity, View view) {
        jo.p.h(userProfileActivity, "this$0");
        Boolean f10 = userProfileActivity.x4().D().f();
        if (f10 == null) {
            return;
        }
        if (f10.booleanValue()) {
            userProfileActivity.w4().B();
        } else {
            userProfileActivity.w4().r();
        }
    }

    public static final void U4(UserProfileActivity userProfileActivity, View view) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.j5();
    }

    public static final void V4(UserProfileActivity userProfileActivity, View view) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.k5();
    }

    public static final void W4(UserProfileActivity userProfileActivity, View view) {
        jo.p.h(userProfileActivity, "this$0");
        userProfileActivity.k5();
    }

    public static final void X4(UserProfileActivity userProfileActivity, View view) {
        jo.p.h(userProfileActivity, "this$0");
        v0 u42 = userProfileActivity.u4();
        FragmentManager a32 = userProfileActivity.a3();
        jo.p.g(a32, "supportFragmentManager");
        if (v0.c(u42, a32, Referer.PROFILE, false, 4, null)) {
            userProfileActivity.m4().f46515a0.c();
            od.t0 w42 = userProfileActivity.w4();
            String v42 = userProfileActivity.v4();
            long w10 = userProfileActivity.x4().w() + 1;
            Long f10 = userProfileActivity.x4().q().f();
            if (f10 == null) {
                f10 = 0L;
            }
            w42.z(Referer.PROFILE, v42, w10, 1 + f10.longValue());
            userProfileActivity.m4().f46518d0.setVisibility(0);
            LiveRequestCountView liveRequestCountView = userProfileActivity.m4().f46518d0;
            of.p pVar = of.p.f45416a;
            Resources resources = userProfileActivity.getResources();
            jo.p.g(resources, "resources");
            liveRequestCountView.startAnimation(pVar.a(resources));
        }
    }

    public static final void Y4(UserProfileActivity userProfileActivity, View view) {
        String profileImageUrl;
        jo.p.h(userProfileActivity, "this$0");
        UserProfile f10 = userProfileActivity.x4().B().f();
        if (f10 == null || (profileImageUrl = f10.getProfileImageUrl()) == null) {
            return;
        }
        userProfileActivity.startActivity(ProfileImageActivity.O.a(userProfileActivity, profileImageUrl));
    }

    public static final void Z4(UserProfileActivity userProfileActivity, View view) {
        List<UserLink> links;
        UserLink userLink;
        String url;
        jo.p.h(userProfileActivity, "this$0");
        UserProfile f10 = userProfileActivity.x4().B().f();
        if (f10 == null || (links = f10.getLinks()) == null || (userLink = (UserLink) xn.a0.Z(links)) == null || (url = userLink.getUrl()) == null) {
            return;
        }
        Intent intent = new Intent(userProfileActivity, WebViewActivity.class);
        intent.putExtra("extra_url", url);
        intent.setFlags(268435456);
        userProfileActivity.startActivity(intent);
    }

    @Override // gf.z
    public void C1() {
        Fragment e02;
        nf.j jVar = this.f24950e0;
        if (jVar == null) {
            jo.p.v("emomoClosetViewStore");
            jVar = null;
        }
        if (jo.p.c(jVar.j().f(), Boolean.TRUE) && (e02 = a3().e0("EmomoUserViewFragment")) != null) {
            a3().k().s(m4().X.getId(), EmomoFullScreenUserViewFragment.E0.a(v4()), "EmomoFullScreenUserViewFragment").q(e02).i();
            a3().X0(new c(e02), false);
        }
    }

    @Override // md.d
    public void E2() {
        this.f24949d0.c(new d());
    }

    public final void O4() {
        u3(m4().f46527m0);
        e.a m32 = m3();
        if (m32 != null) {
            m32.q(nc.d.ic_back_shaded);
        }
        e.a m33 = m3();
        if (m33 != null) {
            m33.n(true);
        }
        e.a m34 = m3();
        if (m34 != null) {
            m34.p(false);
        }
        m4().f46523i0.setLayoutManager(new LinearLayoutManager(this, 0, false));
        m4().D.setLayoutManager(new LinearLayoutManager(this, 0, false));
        int b10 = de.a.b(this, 4);
        int b11 = de.a.b(this, 16);
        m4().f46523i0.g(new p001if.c(b10, b11, 0, b11, 0, 0));
        int b12 = de.a.b(this, 8);
        int b13 = de.a.b(this, 16);
        m4().D.g(new p001if.c(b12, b13, 0, b13, 0, 0));
    }

    public final void P4() {
        RecyclerView recyclerView = m4().D;
        rd.c cVar = new rd.c();
        cVar.g(new q());
        recyclerView.setAdapter(cVar);
        m4().C.b(new AppBarLayout.e() { // from class: md.z
            @Override // com.google.android.material.appbar.AppBarLayout.c
            public final void a(AppBarLayout appBarLayout, int i10) {
                UserProfileActivity.Q4(UserProfileActivity.this, appBarLayout, i10);
            }
        });
        m4().W.setOnClickListener(new View.OnClickListener() { // from class: md.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.R4(UserProfileActivity.this, view);
            }
        });
        m4().V.setOnClickListener(new View.OnClickListener() { // from class: md.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.S4(UserProfileActivity.this, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: md.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.T4(UserProfileActivity.this, view);
            }
        };
        FollowView followView = m4().T;
        jo.p.g(followView, "binding.followView");
        g1.a(followView, new v());
        m4().S.setOnClickListener(onClickListener);
        m4().f46529o0.setOnClickListener(new View.OnClickListener() { // from class: md.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.U4(UserProfileActivity.this, view);
            }
        });
        m4().J.setOnClickListener(new View.OnClickListener() { // from class: md.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.V4(UserProfileActivity.this, view);
            }
        });
        m4().K.setOnClickListener(new View.OnClickListener() { // from class: md.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.W4(UserProfileActivity.this, view);
            }
        });
        m4().D.k(new w());
        AppCompatTextView appCompatTextView = m4().F;
        jo.p.g(appCompatTextView, "binding.bioTextView");
        if (o3.c0.V(appCompatTextView) && !appCompatTextView.isLayoutRequested()) {
            if (m4().F.getLineCount() > 3 || m4().F.getLayout().getEllipsisCount(m4().F.getLineCount() - 1) > 0) {
                m4().f46520f0.setVisibility(0);
                m4().G.setVisibility(8);
            } else {
                m4().f46520f0.setVisibility(8);
                m4().G.setVisibility(0);
            }
        } else {
            appCompatTextView.addOnLayoutChangeListener(new p());
        }
        AppCompatTextView appCompatTextView2 = m4().f46520f0;
        jo.p.g(appCompatTextView2, "binding.readMoreBio");
        g1.a(appCompatTextView2, new r());
        m4().f46515a0.setOnClickListener(new View.OnClickListener() { // from class: md.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.X4(UserProfileActivity.this, view);
            }
        });
        m4().f46519e0.setOnClickListener(new View.OnClickListener() { // from class: md.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.Y4(UserProfileActivity.this, view);
            }
        });
        m4().Z.setOnClickListener(new View.OnClickListener() { // from class: md.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserProfileActivity.Z4(UserProfileActivity.this, view);
            }
        });
        MirraClassSeasonRatingCardView mirraClassSeasonRatingCardView = m4().f46524j0;
        jo.p.g(mirraClassSeasonRatingCardView, "binding.seasonRatingView");
        g1.a(mirraClassSeasonRatingCardView, new s());
    }

    public final void a5(Anniversary anniversary) {
        this.S.t().p(Boolean.TRUE);
        m4().f46536v0.a(anniversary);
        UserProfileAnniversaryFollowBalloonView userProfileAnniversaryFollowBalloonView = m4().f46536v0;
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
        animationSet.setAnimationListener(new x());
        userProfileAnniversaryFollowBalloonView.startAnimation(animationSet);
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_BLOCK_CONFIRM")) {
            w4().n();
        } else if (jo.p.c(str, "DIALOG_TAG_UNBLOCK_CONFIRM")) {
            w4().A();
        }
    }

    public final void b5(View view, Anniversary anniversary) {
        this.S.u().p(Boolean.TRUE);
        m4().B.getViewTreeObserver().addOnGlobalLayoutListener(new y(anniversary, view));
    }

    @Override // ie.f.b
    public void c(String str) {
        jo.p.h(str, "tag");
    }

    public final void c5(UserProfile userProfile) {
        Integer l42 = l4(userProfile != null ? userProfile.getBirthday() : null);
        if (l42 != null) {
            int intValue = l42.intValue();
            this.S.y().p(Boolean.TRUE);
            BirthdayBalloonView birthdayBalloonView = m4().H;
            jo.p.g(birthdayBalloonView, "binding.birthdayBalloonView");
            BirthdayBalloonView.b(birthdayBalloonView, intValue, false, 2, null);
            BirthdayBalloonView birthdayBalloonView2 = m4().H;
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
            animationSet.setAnimationListener(new z());
            birthdayBalloonView2.startAnimation(animationSet);
        }
    }

    public final void d5() {
        if (g().b() != o.c.RESUMED) {
            return;
        }
        f.a aVar = ie.f.V0;
        String string = getString(nc.i.f41871a);
        jo.p.g(string, "getString(R.string.block_confirmation_viewer)");
        f.a.b(aVar, string, getString(nc.i.f41891u), null, null, false, 24, null).z3(a3(), "DIALOG_TAG_BLOCK_CONFIRM");
    }

    public final void e5() {
        String name;
        UserProfile f10;
        String profileImageUrl;
        UserProfile f11 = x4().B().f();
        if (f11 == null || (name = f11.getName()) == null || (f10 = x4().B().f()) == null || (profileImageUrl = f10.getProfileImageUrl()) == null) {
            return;
        }
        startActivity(p4().t(this, null, ge.j.G.b(v4(), name, profileImageUrl)));
    }

    public final void f5(View view, UserProfile userProfile) {
        this.S.A().p(Boolean.TRUE);
        m4().Q.getViewTreeObserver().addOnGlobalLayoutListener(new a0(userProfile, view));
    }

    @Override // android.app.Activity
    public void finish() {
        Intent intent = new Intent();
        UserProfile f10 = x4().B().f();
        intent.putExtra("RESULT_KEY_USER_ID", f10 != null ? f10.getUserId() : null);
        Boolean f11 = x4().D().f();
        if (f11 == null) {
            f11 = Boolean.FALSE;
        }
        jo.p.g(f11, "userProfileStore.isFollowing.value ?: false");
        intent.putExtra("RESULT_KEY_IS_FOLLOWING", f11.booleanValue());
        UserProfile f12 = x4().B().f();
        boolean z10 = true;
        if (f12 == null || !f12.isBlocking()) {
            z10 = false;
        }
        intent.putExtra("RESULT_KEY_iS_BLOCKING", z10);
        wn.v vVar = wn.v.f59242a;
        setResult(-1, intent);
        super.finish();
    }

    public final void g5() {
        UserProfile f10 = x4().B().f();
        if ((f10 != null ? f10.getFollowerNum() : 0) == 0) {
            return;
        }
        v0 u42 = u4();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (v0.c(u42, a32, "profilefollower", false, 4, null)) {
            startActivity(ProfileUserListActivity.f24079g0.b(this, v4(), 1));
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void h5() {
        UserProfile f10 = x4().B().f();
        if ((f10 != null ? f10.getFollowingNum() : 0) == 0) {
            return;
        }
        v0 u42 = u4();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (v0.c(u42, a32, "profilefollowing", false, 4, null)) {
            startActivity(ProfileUserListActivity.f24079g0.b(this, v4(), 0));
        }
    }

    public final void i5() {
        if (g().b() != o.c.RESUMED) {
            return;
        }
        we.c.N0.a(Referer.PROFILE, v4(), null).z3(a3(), "ReportDialog");
    }

    public final void j5() {
        String twitterScreenName;
        UserProfile f10 = x4().B().f();
        if (f10 == null || (twitterScreenName = f10.getTwitterScreenName()) == null) {
            return;
        }
        if (twitterScreenName.length() == 0) {
            return;
        }
        of.n.r(this, "https://twitter.com/" + twitterScreenName);
    }

    public final void k5() {
        if (g().b() != o.c.RESUMED) {
            return;
        }
        f.a aVar = ie.f.V0;
        String string = getString(nc.i.f41877f1);
        jo.p.g(string, "getString(R.string.text_confirmation_unblock)");
        f.a.b(aVar, string, getString(nc.i.U5), null, null, false, 24, null).z3(a3(), "DIALOG_TAG_UNBLOCK_CONFIRM");
    }

    public final Integer l4(String str) {
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

    public final pc.w m4() {
        Object value = this.R.getValue();
        jo.p.g(value, "<get-binding>(...)");
        return (pc.w) value;
    }

    public final od.i n4() {
        return (od.i) this.f24947b0.getValue();
    }

    public final nf.k o4() {
        return (nf.k) this.W.getValue();
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
        if (this.f24950e0 == null) {
            this.f24950e0 = (nf.j) ((androidx.lifecycle.q0) new s0(jo.f0.b(nf.j.class), new m(this), new l(new k(this), null, new n(), gq.a.a(this))).getValue());
        }
        MRLogger q42 = q4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_OTHER_USER_PROFILE_IMP);
        builder.setTargetId(v4());
        builder.setPageId(r4());
        q42.sendLog(builder.build());
        getWindow().setStatusBarColor(c3.a.d(this, nc.b.f41791b));
        m4().M(this);
        m4().T(this.S);
        a3().k().s(nc.e.f41854z, EmomoUserViewFragment.E0.a(v4()), "EmomoUserViewFragment").i();
        Fragment e02 = a3().e0("EmomoFullScreenUserViewFragment");
        if (e02 != null) {
            a3().k().q(e02).i();
        }
        O4();
        P4();
        z4();
        w4().x();
        w4().w();
        w4().o(Referer.PROFILE, v4());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        jo.p.h(menu, "menu");
        this.V = menu;
        getMenuInflater().inflate(nc.g.user_profile_menu, menu);
        MenuItem findItem = menu.findItem(nc.e.block_menu_item);
        if (findItem != null) {
            jo.p.g(findItem, "findItem(R.id.block_menu_item)");
            String obj = findItem.getTitle().toString();
            SpannableString spannableString = new SpannableString(obj);
            spannableString.setSpan(new ForegroundColorSpan(c3.a.d(this, nc.b.D)), 0, obj.length(), 0);
            findItem.setTitle(spannableString);
            return true;
        }
        return true;
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        jo.p.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == nc.e.chat_menu_item) {
            e5();
            return true;
        } else if (itemId == nc.e.report_menu_item) {
            i5();
            return true;
        } else if (itemId != nc.e.block_menu_item) {
            if (itemId == 16908332) {
                onBackPressed();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        } else {
            UserProfile f10 = x4().B().f();
            boolean z10 = false;
            if (f10 != null && f10.isBlocking()) {
                z10 = true;
            }
            if (z10) {
                k5();
                return true;
            }
            d5();
            return true;
        }
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        od.t0 w42 = w4();
        String v42 = v4();
        long w10 = x4().w();
        Long f10 = x4().q().f();
        if (f10 == null) {
            f10 = 0L;
        }
        w42.z(Referer.PROFILE, v42, w10, f10.longValue());
    }

    public final tb.c p4() {
        return (tb.c) this.f24948c0.getValue();
    }

    public final MRLogger q4() {
        return (MRLogger) this.Y.getValue();
    }

    public final String r4() {
        return (String) this.U.getValue();
    }

    public final UnityActionCreator s4() {
        return (UnityActionCreator) this.f24946a0.getValue();
    }

    public final UnityStore t4() {
        return (UnityStore) this.Z.getValue();
    }

    public final v0 u4() {
        return (v0) this.X.getValue();
    }

    public final String v4() {
        return (String) this.T.getValue();
    }

    public final od.t0 w4() {
        return (od.t0) this.P.getValue();
    }

    public final nf.o0 x4() {
        return (nf.o0) this.Q.getValue();
    }

    public final void y4(MRError mRError) {
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(this, mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(this, mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.z(this);
        }
    }

    public final void z4() {
        this.S.c().i(this, new androidx.lifecycle.f0() { // from class: md.x
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.A4(UserProfileActivity.this, (String) obj);
            }
        });
        x4().B().i(this, new androidx.lifecycle.f0() { // from class: md.q
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.B4(UserProfileActivity.this, (UserProfile) obj);
            }
        });
        x4().u().i(this, new androidx.lifecycle.f0() { // from class: md.t
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.C4(UserProfileActivity.this, (Integer) obj);
            }
        });
        x4().n().i(this, new androidx.lifecycle.f0() { // from class: md.u
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.D4(UserProfileActivity.this, (Integer) obj);
            }
        });
        x4().D().i(this, new androidx.lifecycle.f0() { // from class: md.s
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.E4(UserProfileActivity.this, (Boolean) obj);
            }
        });
        x4().y().i(this, new androidx.lifecycle.f0() { // from class: md.h0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.F4(UserProfileActivity.this, (Bitmap) obj);
            }
        });
        x4().j().i(this, new androidx.lifecycle.f0() { // from class: md.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.G4(UserProfileActivity.this, (Bitmap) obj);
            }
        });
        x4().i().i(this, new androidx.lifecycle.f0() { // from class: md.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.H4(UserProfileActivity.this, (List) obj);
            }
        });
        x4().C().i(this, new androidx.lifecycle.f0() { // from class: md.r
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.I4(UserProfileActivity.this, (Boolean) obj);
            }
        });
        x4().k().i(this, new androidx.lifecycle.f0() { // from class: md.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.J4(UserProfileActivity.this, (MRError) obj);
            }
        });
        x4().m().i(this, new androidx.lifecycle.f0() { // from class: md.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.K4(UserProfileActivity.this, (MRError) obj);
            }
        });
        x4().q().i(this, new androidx.lifecycle.f0() { // from class: md.w
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.L4(UserProfileActivity.this, (Long) obj);
            }
        });
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
        uo.l.d(this, null, null, new g(null), 3, null);
        x4().z().i(this, new androidx.lifecycle.f0() { // from class: md.m
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.M4(UserProfileActivity.this, (h9.a) obj);
            }
        });
        x4().x().i(this, new androidx.lifecycle.f0() { // from class: md.n
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                UserProfileActivity.N4(UserProfileActivity.this, (i9.a) obj);
            }
        });
    }
}
