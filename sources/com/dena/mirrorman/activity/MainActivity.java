package com.dena.mirrorman.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.a;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.SplashActivity_;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.Launch;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.OpenDeeplink;
import com.dena.mirrorman.clientlog.logs.Tutorial;
import com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Feature;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonResponse;
import com.dena.mirrorman.net.api.response.ToolTipStartLiveButtonToolTip;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.google.firebase.analytics.FirebaseAnalytics;
import hf.d0;
import hf.v0;
import ia.a;
import java.util.ArrayList;
import java.util.List;
import jf.b0;
import jf.i0;
import jo.f0;
import kq.a;
import nd.b1;
import nd.f1;
import nd.i1;
import nd.z0;
import pe.b;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class MainActivity extends e.b implements q0 {

    /* renamed from: m0  reason: collision with root package name */
    public static final a f25195m0 = new a(null);

    /* renamed from: n0  reason: collision with root package name */
    public static final int f25196n0 = 8;
    public final ao.g O;
    public ae.u P;
    public final wn.f Q;
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
    public final wn.f f25197a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f25198b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f25199c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f25200d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f25201e0;

    /* renamed from: f0  reason: collision with root package name */
    public final wn.f f25202f0;

    /* renamed from: g0  reason: collision with root package name */
    public final wn.f f25203g0;

    /* renamed from: h0  reason: collision with root package name */
    public final wn.f f25204h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f25205i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f25206j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f25207k0;

    /* renamed from: l0  reason: collision with root package name */
    public FirebaseAnalytics f25208l0;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: com.dena.mirrorman.activity.MainActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0218a {
            Home("Home"),
            Follows("Follows"),
            Notice("Notice"),
            LiveGame("LiveGame"),
            MyPage("MyPage");
            
            public static final C0219a Companion = new C0219a(null);
            private final String stringValue;

            /* renamed from: com.dena.mirrorman.activity.MainActivity$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0219a {
                public C0219a() {
                }

                public /* synthetic */ C0219a(jo.h hVar) {
                    this();
                }

                public final EnumC0218a a(String str) {
                    EnumC0218a[] values;
                    for (EnumC0218a enumC0218a : EnumC0218a.values()) {
                        if (jo.p.c(str, enumC0218a.c())) {
                            return enumC0218a;
                        }
                    }
                    return null;
                }
            }

            EnumC0218a(String str) {
                this.stringValue = str;
            }

            public final String c() {
                return this.stringValue;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, long j10, int i10, boolean z10, EnumC0218a enumC0218a, boolean z11) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, MainActivity.class);
            intent.putExtra("EXTRA_PARAM_LIVEID", str);
            intent.putExtra("EXTRA_PARAM_LIVE_DURATION", j10);
            intent.putExtra("EXTRA_PARAM_LIVE_COMMENT_COUNT", i10);
            intent.putExtra("EXTRA_PARAM_IS_POWER_SAVED", z10);
            intent.putExtra("EXTRA_LAUNCH_TAB_TYPE", enumC0218a != null ? enumC0218a.c() : null);
            intent.putExtra("EXTRA_NEEDS_SHOW_LIVE_GAME_LISTING", z11);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.l<View, wn.v> {
        public a0() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MainActivity mainActivity = MainActivity.this;
            mainActivity.startActivity(mainActivity.h4().g0(MainActivity.this, null, 5, Referer.MY_PAGE_BALLOON));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25210a;

        static {
            int[] iArr = new int[a.EnumC0218a.values().length];
            iArr[a.EnumC0218a.Follows.ordinal()] = 1;
            iArr[a.EnumC0218a.Notice.ordinal()] = 2;
            iArr[a.EnumC0218a.LiveGame.ordinal()] = 3;
            iArr[a.EnumC0218a.MyPage.ordinal()] = 4;
            f25210a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 implements ia.a {
        public b0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ae.u uVar = MainActivity.this.P;
            if (uVar == null) {
                jo.p.v("binding");
                uVar = null;
            }
            uVar.I.setVisibility(8);
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
    public static final class c extends jo.q implements io.a<NavController> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final NavController invoke() {
            return androidx.navigation.b.a(MainActivity.this, z0.f42279e9);
        }
    }

    @co.f(c = "com.dena.mirrorman.activity.MainActivity$observeStoreValues$13", f = "MainActivity.kt", l = {690}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25213w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25214x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25215y;

        /* renamed from: z  reason: collision with root package name */
        public int f25216z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
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
                int r1 = r8.f25216z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f25215y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f25214x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f25213w
                com.dena.mirrorman.activity.MainActivity r4 = (com.dena.mirrorman.activity.MainActivity) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L78
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
                com.dena.mirrorman.activity.MainActivity r9 = com.dena.mirrorman.activity.MainActivity.this
                nf.o r9 = com.dena.mirrorman.activity.MainActivity.V3(r9)
                wo.x r3 = r9.A()
                com.dena.mirrorman.activity.MainActivity r9 = com.dena.mirrorman.activity.MainActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L78
                r4 = r9
                r9 = r8
            L3d:
                r9.f25213w = r4     // Catch: java.lang.Throwable -> L78
                r9.f25214x = r3     // Catch: java.lang.Throwable -> L78
                r9.f25215y = r1     // Catch: java.lang.Throwable -> L78
                r9.f25216z = r2     // Catch: java.lang.Throwable -> L78
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L78
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
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L75
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L75
                if (r9 == 0) goto L6f
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L75
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L75
                od.z r9 = com.dena.mirrorman.activity.MainActivity.Y3(r5)     // Catch: java.lang.Throwable -> L75
                r9.t()     // Catch: java.lang.Throwable -> L75
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6f:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L75:
                r9 = move-exception
                r3 = r4
                goto L79
            L78:
                r9 = move-exception
            L79:
                throw r9     // Catch: java.lang.Throwable -> L7a
            L7a:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.activity.MainActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<String, wn.v> {
        public e() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, MRLog.PAYLOAD_KEY_WHERE);
            g9.a aVar = g9.a.f32826a;
            aVar.i("BottomNavigator click : Broadcast at " + str);
            od.z k42 = MainActivity.this.k4();
            androidx.navigation.o g10 = MainActivity.this.m4().g();
            k42.s(false, g10 != null ? Integer.valueOf(g10.r()) : null);
            MRLogger j42 = MainActivity.this.j4();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_SETTING_BUTTON_TAP);
            builder.setPageId(str);
            j42.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25218w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25219x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25220y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25218w = componentCallbacks;
            this.f25219x = aVar;
            this.f25220y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f25218w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f25219x, this.f25220y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25221w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25222x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25223y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25221w = componentCallbacks;
            this.f25222x = aVar;
            this.f25223y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f25221w;
            return gq.a.a(componentCallbacks).c(f0.b(of.k.class), this.f25222x, this.f25223y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25224w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25225x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25226y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25224w = componentCallbacks;
            this.f25225x = aVar;
            this.f25226y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f25224w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f25225x, this.f25226y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25227w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25228x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25227w = componentCallbacks;
            this.f25228x = aVar;
            this.f25229y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f25227w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f25228x, this.f25229y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25230w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25231x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25230w = componentCallbacks;
            this.f25231x = aVar;
            this.f25232y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25230w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f25231x, this.f25232y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<nf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25233w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25234x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25235y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25233w = componentCallbacks;
            this.f25234x = aVar;
            this.f25235y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.r] */
        @Override // io.a
        public final nf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f25233w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.r.class), this.f25234x, this.f25235y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25236w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25237x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25238y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25236w = componentCallbacks;
            this.f25237x = aVar;
            this.f25238y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f25236w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f25237x, this.f25238y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25239w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25240x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25241y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25239w = componentCallbacks;
            this.f25240x = aVar;
            this.f25241y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25239w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f25240x, this.f25241y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25242w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25243x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25244y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25242w = componentCallbacks;
            this.f25243x = aVar;
            this.f25244y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25242w;
            return gq.a.a(componentCallbacks).c(f0.b(d0.class), this.f25243x, this.f25244y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<xe.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25245w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25246x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25247y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25245w = componentCallbacks;
            this.f25246x = aVar;
            this.f25247y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xe.a, java.lang.Object] */
        @Override // io.a
        public final xe.a invoke() {
            ComponentCallbacks componentCallbacks = this.f25245w;
            return gq.a.a(componentCallbacks).c(f0.b(xe.a.class), this.f25246x, this.f25247y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<ef.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25248w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25249x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25250y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25248w = componentCallbacks;
            this.f25249x = aVar;
            this.f25250y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ef.a] */
        @Override // io.a
        public final ef.a invoke() {
            ComponentCallbacks componentCallbacks = this.f25248w;
            return gq.a.a(componentCallbacks).c(f0.b(ef.a.class), this.f25249x, this.f25250y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kf.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25251w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25252x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25253y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25251w = componentCallbacks;
            this.f25252x = aVar;
            this.f25253y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.i, java.lang.Object] */
        @Override // io.a
        public final kf.i invoke() {
            ComponentCallbacks componentCallbacks = this.f25251w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.i.class), this.f25252x, this.f25253y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25254w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25255x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25256y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25254w = componentCallbacks;
            this.f25255x = aVar;
            this.f25256y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f25254w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.v.class), this.f25255x, this.f25256y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25257w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25258x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25259y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25257w = componentCallbacks;
            this.f25258x = aVar;
            this.f25259y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            ComponentCallbacks componentCallbacks = this.f25257w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.t.class), this.f25258x, this.f25259y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25260w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25261x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25262y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25260w = componentCallbacks;
            this.f25261x = aVar;
            this.f25262y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f25260w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.x.class), this.f25261x, this.f25262y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25263w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f25263w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25263w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25264w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25265x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25266y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25267z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25264w = aVar;
            this.f25265x = aVar2;
            this.f25266y = aVar3;
            this.f25267z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25264w;
            vq.a aVar2 = this.f25265x;
            io.a aVar3 = this.f25266y;
            xq.a aVar4 = this.f25267z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(od.z.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25268w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentActivity componentActivity) {
            super(0);
            this.f25268w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25268w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25269w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentActivity componentActivity) {
            super(0);
            this.f25269w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25269w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25270w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25271x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25272y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25273z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25270w = aVar;
            this.f25271x = aVar2;
            this.f25272y = aVar3;
            this.f25273z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25270w;
            vq.a aVar2 = this.f25271x;
            io.a aVar3 = this.f25272y;
            xq.a aVar4 = this.f25273z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.y.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25274w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.f25274w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25274w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    public MainActivity() {
        uo.b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.O = c10.plus(b10);
        this.Q = wn.g.a(new c());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new l(this, null, null));
        this.S = wn.g.b(iVar, new m(this, null, null));
        this.T = wn.g.b(iVar, new n(this, null, null));
        this.U = wn.g.b(iVar, new o(this, null, null));
        this.V = wn.g.b(iVar, new p(this, null, null));
        this.W = wn.g.b(iVar, new q(this, null, null));
        this.X = wn.g.b(iVar, new r(this, null, null));
        this.Y = wn.g.b(iVar, new s(this, null, null));
        this.Z = wn.g.b(iVar, new t(this, null, null));
        this.f25197a0 = wn.g.b(iVar, new f(this, null, null));
        this.f25198b0 = wn.g.b(iVar, new g(this, null, null));
        this.f25199c0 = new s0(f0.b(od.z.class), new w(this), new v(new u(this), null, null, gq.a.a(this)));
        this.f25200d0 = new s0(f0.b(nf.y.class), new z(this), new y(new x(this), null, null, gq.a.a(this)));
        this.f25201e0 = wn.g.b(iVar, new h(this, null, null));
        this.f25202f0 = wn.g.b(iVar, new i(this, null, null));
        this.f25203g0 = wn.g.b(iVar, new j(this, null, null));
        this.f25204h0 = wn.g.b(iVar, new k(this, null, null));
    }

    public static final void A4(MainActivity mainActivity, wn.v vVar) {
        jo.p.h(mainActivity, "this$0");
        if (vVar == null) {
            return;
        }
        Intent K = mainActivity.h4().K(mainActivity, false, false, false);
        K.addFlags(335544320);
        mainActivity.startActivity(K);
    }

    public static final void B4(MainActivity mainActivity, MRError mRError) {
        jo.p.h(mainActivity, "this$0");
        if (mRError == null) {
            return;
        }
        of.n nVar = of.n.f45411a;
        String message = mRError.getMessage();
        if (message == null) {
            message = mainActivity.getString(f1.f41966c);
            jo.p.g(message, "getString(R.string.error_access)");
        }
        nVar.B(mainActivity, message, false);
    }

    public static final void C4(MainActivity mainActivity, UserMe userMe) {
        String signature_verify_nonce;
        jo.p.h(mainActivity, "this$0");
        if (userMe == null) {
            return;
        }
        if (!mainActivity.f25205i0 || mainActivity.f25207k0) {
            boolean z10 = mainActivity.f25207k0;
            String str = mainActivity.f25205i0 ? "app_launch" : "background";
            String packageName = mainActivity.getApplicationContext().getPackageName();
            jo.p.g(packageName, "applicationContext.packageName");
            Puree.d(new Launch(z10, str, (SystemClock.uptimeMillis() - mainActivity.f25206j0) / 1000.0d, packageName));
            Puree.b();
        }
        Feature.Capabilities capabilities = userMe.getCapabilities();
        if (capabilities == null || (signature_verify_nonce = capabilities.getSignature_verify_nonce()) == null) {
            return;
        }
        od.p f42 = mainActivity.f4();
        String string = mainActivity.getResources().getString(f1.f41997x);
        jo.p.g(string, "resources.getString(R.string.safety_net_api_key)");
        f42.s(signature_verify_nonce, string);
    }

    public static final void D4(MainActivity mainActivity, MRError mRError) {
        jo.p.h(mainActivity, "this$0");
        if (mRError == null) {
            return;
        }
        mainActivity.f25205i0 = false;
        mainActivity.f25206j0 = 0L;
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(mainActivity, mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
            of.n.f45411a.B(mainActivity, mRError.getMessage(), false);
        } else if (mRError instanceof MRError.Network) {
            of.n.f45411a.B(mainActivity, mainActivity.getString(f1.f41966c), false);
        }
    }

    public static final void E4(MainActivity mainActivity, String str) {
        jo.p.h(mainActivity, "this$0");
        if (str == null || so.n.r(str)) {
            return;
        }
        ae.u uVar = mainActivity.P;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        uVar.B.setBroadcastButtonEmomo(mainActivity.p4().a().d());
    }

    public static final void F4(MainActivity mainActivity, String str) {
        jo.p.h(mainActivity, "this$0");
        if (str == null) {
            return;
        }
        of.n.f45411a.B(mainActivity, str, false);
    }

    public static final void G4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        mainActivity.Y4();
    }

    public static final void H4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        ae.u uVar = mainActivity.P;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        uVar.B.G(bool.booleanValue());
    }

    public static final void I4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        ae.u uVar = mainActivity.P;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        uVar.B.I(bool.booleanValue());
    }

    public static final void J4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        ae.u uVar = mainActivity.P;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        uVar.B.H(bool.booleanValue());
    }

    public static final void K4(MainActivity mainActivity, ToolTipStartLiveButtonResponse toolTipStartLiveButtonResponse) {
        jo.p.h(mainActivity, "this$0");
        mainActivity.X4();
    }

    public static final void L4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        mainActivity.X4();
    }

    public static final void M4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (of.d.f45388a.d()) {
            of.n.A(mainActivity.getApplicationContext(), f1.f41975i, false);
        } else {
            mainActivity.startActivity(mainActivity.h4().v(mainActivity, null, null));
        }
    }

    public static final void N4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        if (jo.p.c(bool, Boolean.TRUE)) {
            of.n.A(mainActivity.getApplicationContext(), f1.f41975i, false);
        }
    }

    public static final void O4(DialogInterface dialogInterface, int i10) {
    }

    public static final void P4(MainActivity mainActivity, DialogInterface dialogInterface, int i10) {
        jo.p.h(mainActivity, "this$0");
        super.onBackPressed();
    }

    public static final void Q4(MainActivity mainActivity, nl.b bVar) {
        jo.p.h(mainActivity, "this$0");
        if (bVar != null) {
            Uri a10 = bVar.a();
            Puree.d(new Launch.DynamicLinksData(String.valueOf(a10)));
            mainActivity.u4().O0(String.valueOf(a10));
        }
    }

    public static final void R4(Exception exc) {
        jo.p.h(exc, "it");
        g9.a.h(exc);
    }

    public static final void T4(MainActivity mainActivity, String str) {
        jo.p.h(mainActivity, "this$0");
        mainActivity.W4();
    }

    public static final void U4(MainActivity mainActivity, NavController navController, androidx.navigation.o oVar, Bundle bundle) {
        jo.p.h(mainActivity, "this$0");
        jo.p.h(navController, "<anonymous parameter 0>");
        jo.p.h(oVar, "destination");
        i0 n42 = mainActivity.n4(oVar.r());
        if (n42 == null) {
            return;
        }
        mainActivity.X4();
        mainActivity.f4().C(n42);
    }

    public static final void x4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        b.a aVar = pe.b.f47398a1;
        aVar.a(mainActivity.e4() + Referer.START_LIVEPREPARE, false, bool.booleanValue()).z3(mainActivity.a3(), "RegistrationDialog");
    }

    public static final void y4(MainActivity mainActivity, Boolean bool) {
        jo.p.h(mainActivity, "this$0");
        if (jo.p.c(bool, Boolean.TRUE)) {
            of.n.A(mainActivity, f1.Z4, true);
        }
    }

    public static final void z4(MainActivity mainActivity, wn.v vVar) {
        jo.p.h(mainActivity, "this$0");
        if (vVar == null) {
            return;
        }
        Intent o10 = mainActivity.h4().o(mainActivity, null);
        o10.addFlags(335544320);
        mainActivity.startActivity(o10);
    }

    public final void S4() {
        ae.u uVar = this.P;
        ae.u uVar2 = null;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        uVar.B.setupWithNavController(m4());
        f4().C(i0.HOME_CATALOG);
        p4().a().a().i(this, new androidx.lifecycle.f0() { // from class: qd.r
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.T4(MainActivity.this, (String) obj);
            }
        });
        m4().a(new NavController.b() { // from class: qd.v
            @Override // androidx.navigation.NavController.b
            public final void a(NavController navController, androidx.navigation.o oVar, Bundle bundle) {
                MainActivity.U4(MainActivity.this, navController, oVar, bundle);
            }
        });
        ae.u uVar3 = this.P;
        if (uVar3 == null) {
            jo.p.v("binding");
        } else {
            uVar2 = uVar3;
        }
        uVar2.B.setOnClickBroadCastButtonListener(new e());
    }

    public final void V4() {
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

    public final void W4() {
        ae.u uVar = this.P;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        uVar.B.setBroadcastButtonEmomo(p4().a().d());
    }

    public final void X4() {
        g5.d dVar = new g5.d();
        dVar.b0(600L);
        ae.u uVar = this.P;
        ae.u uVar2 = null;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        dVar.c(uVar.I.getId());
        ae.u uVar3 = this.P;
        if (uVar3 == null) {
            jo.p.v("binding");
            uVar3 = null;
        }
        dVar.c(uVar3.H.getId());
        ae.u uVar4 = this.P;
        if (uVar4 == null) {
            jo.p.v("binding");
            uVar4 = null;
        }
        g5.o.a(uVar4.J, dVar);
        ToolTipStartLiveButtonResponse f10 = g4().C().f();
        if ((f10 != null ? f10.getTooltip() : null) != null) {
            ae.u uVar5 = this.P;
            if (uVar5 == null) {
                jo.p.v("binding");
                uVar5 = null;
            }
            if (uVar5.B.z()) {
                ToolTipStartLiveButtonResponse f11 = g4().C().f();
                if (f11 != null) {
                    ae.u uVar6 = this.P;
                    if (uVar6 == null) {
                        jo.p.v("binding");
                        uVar6 = null;
                    }
                    LivePrepareBalloonLiveRequestNumView livePrepareBalloonLiveRequestNumView = uVar6.I;
                    ToolTipStartLiveButtonToolTip tooltip = f11.getTooltip();
                    jo.p.e(tooltip);
                    livePrepareBalloonLiveRequestNumView.c(tooltip);
                    ae.u uVar7 = this.P;
                    if (uVar7 == null) {
                        jo.p.v("binding");
                        uVar7 = null;
                    }
                    LivePrepareBalloonLiveRequestNumView livePrepareBalloonLiveRequestNumView2 = uVar7.I;
                    jo.p.g(livePrepareBalloonLiveRequestNumView2, "binding.requestNumLivePrepareBalloonView");
                    yd.g1.a(livePrepareBalloonLiveRequestNumView2, new a0());
                }
                if (jo.p.c(g4().m().f(), Boolean.TRUE)) {
                    ae.u uVar8 = this.P;
                    if (uVar8 == null) {
                        jo.p.v("binding");
                    } else {
                        uVar2 = uVar8;
                    }
                    LivePrepareBalloonLiveRequestNumView livePrepareBalloonLiveRequestNumView3 = uVar2.I;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new b0());
                    livePrepareBalloonLiveRequestNumView3.startAnimation(alphaAnimation);
                    return;
                }
                ae.u uVar9 = this.P;
                if (uVar9 == null) {
                    jo.p.v("binding");
                    uVar9 = null;
                }
                uVar9.I.setVisibility(0);
                ae.u uVar10 = this.P;
                if (uVar10 == null) {
                    jo.p.v("binding");
                } else {
                    uVar2 = uVar10;
                }
                uVar2.H.setVisibility(8);
                return;
            }
        }
        if (!t4().j()) {
            if ((d4().K0().length() > 0) && (t4().n() || (r4().N3() == 0 && !t4().n()))) {
                ae.u uVar11 = this.P;
                if (uVar11 == null) {
                    jo.p.v("binding");
                    uVar11 = null;
                }
                uVar11.H.b(d4().K0());
                Puree.d(new Tutorial.Dashboard(1));
                ae.u uVar12 = this.P;
                if (uVar12 == null) {
                    jo.p.v("binding");
                    uVar12 = null;
                }
                uVar12.I.setVisibility(8);
                ae.u uVar13 = this.P;
                if (uVar13 == null) {
                    jo.p.v("binding");
                } else {
                    uVar2 = uVar13;
                }
                uVar2.H.setVisibility(0);
                return;
            }
        }
        ae.u uVar14 = this.P;
        if (uVar14 == null) {
            jo.p.v("binding");
            uVar14 = null;
        }
        uVar14.I.setVisibility(8);
        ae.u uVar15 = this.P;
        if (uVar15 == null) {
            jo.p.v("binding");
        } else {
            uVar2 = uVar15;
        }
        uVar2.H.setVisibility(8);
    }

    public final void Y4() {
        ae.u uVar = null;
        if (jo.p.c(l4().q().f(), Boolean.TRUE) && q4().b(8).b()) {
            ae.u uVar2 = this.P;
            if (uVar2 == null) {
                jo.p.v("binding");
                uVar2 = null;
            }
            Integer currentDestinationId = uVar2.B.getCurrentDestinationId();
            int i10 = z0.homeCatalogFragment;
            if (currentDestinationId != null && currentDestinationId.intValue() == i10) {
                ae.u uVar3 = this.P;
                if (uVar3 == null) {
                    jo.p.v("binding");
                    uVar3 = null;
                }
                uVar3.K.setVisibility(0);
                ae.u uVar4 = this.P;
                if (uVar4 == null) {
                    jo.p.v("binding");
                    uVar4 = null;
                }
                uVar4.I.setVisibility(8);
                ae.u uVar5 = this.P;
                if (uVar5 == null) {
                    jo.p.v("binding");
                    uVar5 = null;
                }
                uVar5.H.setVisibility(8);
                ae.u uVar6 = this.P;
                if (uVar6 == null) {
                    jo.p.v("binding");
                } else {
                    uVar = uVar6;
                }
                uVar.B.setTutorialCover(true);
                Puree.d(new Tutorial.Dashboard(0));
                return;
            }
        }
        ae.u uVar7 = this.P;
        if (uVar7 == null) {
            jo.p.v("binding");
            uVar7 = null;
        }
        uVar7.K.setVisibility(8);
        ae.u uVar8 = this.P;
        if (uVar8 == null) {
            jo.p.v("binding");
        } else {
            uVar = uVar8;
        }
        uVar.B.setTutorialCover(false);
    }

    public final void a4() {
        int i10;
        Fragment d02 = a3().d0(z0.f42279e9);
        jo.p.f(d02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavController m32 = ((NavHostFragment) d02).m3();
        androidx.navigation.q i11 = m4().i();
        a.EnumC0218a a10 = a.EnumC0218a.Companion.a(getIntent().getStringExtra("EXTRA_LAUNCH_TAB_TYPE"));
        int i12 = a10 == null ? -1 : b.f25210a[a10.ordinal()];
        if (i12 == 1) {
            i10 = z0.followCatalogFragment;
        } else if (i12 == 2) {
            i10 = z0.noticeFragment;
        } else if (i12 == 3) {
            i10 = z0.liveGameFragment;
        } else if (i12 != 4) {
            i10 = z0.homeCatalogFragment;
        } else {
            i10 = z0.myPageFragment;
        }
        i11.N(i10);
        m32.A(i11);
    }

    public final void b4() {
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

    public final xe.a c4() {
        return (xe.a) this.U.getValue();
    }

    public final kf.i d4() {
        return (kf.i) this.W.getValue();
    }

    public final String e4() {
        androidx.navigation.o g10 = m4().g();
        Integer valueOf = g10 != null ? Integer.valueOf(g10.r()) : null;
        int i10 = z0.homeCatalogFragment;
        if (valueOf != null && valueOf.intValue() == i10) {
            return Referer.HOME_SELECT;
        }
        int i11 = z0.followCatalogFragment;
        if (valueOf != null && valueOf.intValue() == i11) {
            return Referer.HOME_FOLLOW;
        }
        int i12 = z0.noticeFragment;
        if (valueOf != null && valueOf.intValue() == i12) {
            return Referer.NOTICE;
        }
        int i13 = z0.liveGameFragment;
        if (valueOf != null && valueOf.intValue() == i13) {
            return Referer.LIVE_GAME;
        }
        return (valueOf != null && valueOf.intValue() == z0.myPageFragment) ? Referer.MY_PAGE : "";
    }

    public final od.p f4() {
        return (od.p) this.f25201e0.getValue();
    }

    public final nf.o g4() {
        return (nf.o) this.f25202f0.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O;
    }

    public final tb.c h4() {
        return (tb.c) this.f25203g0.getValue();
    }

    public final d0 i4() {
        return (d0) this.T.getValue();
    }

    public final MRLogger j4() {
        return (MRLogger) this.f25197a0.getValue();
    }

    public final od.z k4() {
        return (od.z) this.f25199c0.getValue();
    }

    public final nf.y l4() {
        return (nf.y) this.f25200d0.getValue();
    }

    public final NavController m4() {
        return (NavController) this.Q.getValue();
    }

    public final i0 n4(int i10) {
        if (i10 == z0.homeCatalogFragment) {
            return i0.HOME_CATALOG;
        }
        if (i10 == z0.followCatalogFragment) {
            return i0.FOLLOW_CATALOG;
        }
        if (i10 == z0.noticeFragment) {
            return i0.NOTICE;
        }
        if (i10 == z0.liveGameFragment) {
            return i0.LIVE_GAME;
        }
        if (i10 == z0.myPageFragment) {
            return i0.MY_PAGE;
        }
        return null;
    }

    public final kf.t o4() {
        return (kf.t) this.Y.getValue();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
        if (i11 == -1 && intent != null && (i10 == 77 || i10 == 208)) {
            startActivity(h4().x(this, e4(), intent));
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ae.u uVar = this.P;
        ae.u uVar2 = null;
        if (uVar == null) {
            jo.p.v("binding");
            uVar = null;
        }
        if (uVar.B.z()) {
            ae.u uVar3 = this.P;
            if (uVar3 == null) {
                jo.p.v("binding");
            } else {
                uVar2 = uVar3;
            }
            Integer currentDestinationId = uVar2.B.getCurrentDestinationId();
            int i10 = z0.homeCatalogFragment;
            if (currentDestinationId != null && currentDestinationId.intValue() == i10) {
                m4().m(z0.to_select);
                return;
            }
            int i11 = z0.followCatalogFragment;
            if (currentDestinationId != null && currentDestinationId.intValue() == i11) {
                m4().m(z0.to_follows);
                return;
            }
            int i12 = z0.noticeFragment;
            if (currentDestinationId != null && currentDestinationId.intValue() == i12) {
                m4().m(z0.to_notice);
                return;
            }
            int i13 = z0.liveGameFragment;
            if (currentDestinationId != null && currentDestinationId.intValue() == i13) {
                m4().m(z0.to_live_game_listing);
                return;
            }
            return;
        }
        ae.u uVar4 = this.P;
        if (uVar4 == null) {
            jo.p.v("binding");
        } else {
            uVar2 = uVar4;
        }
        Integer currentDestinationId2 = uVar2.B.getCurrentDestinationId();
        int i14 = z0.homeCatalogFragment;
        if (currentDestinationId2 == null || currentDestinationId2.intValue() != i14) {
            m4().m(z0.to_select);
        } else {
            new a.C0045a(this, nd.g1.f42009h).f(f1.text_confirm_close_mirrativ).setNegativeButton(f1.f41985p3, qd.u.f48999w).setPositiveButton(f1.S5, new DialogInterface.OnClickListener() { // from class: qd.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    MainActivity.P4(MainActivity.this, dialogInterface, i15);
                }
            }).k();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, b1.activity_main);
        jo.p.g(g10, "setContentView(this, R.layout.activity_main)");
        this.P = (ae.u) g10;
        a4();
        S4();
        w4();
        this.f25205i0 = true;
        this.f25206j0 = SystemClock.uptimeMillis();
        if (!o4().b2()) {
            Intent intent = new Intent(this, SplashActivity_.class);
            intent.addFlags(268468224);
            startActivity(intent);
        }
        v4(getIntent());
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        jo.p.g(firebaseAnalytics, "getInstance(this)");
        this.f25208l0 = firebaseAnalytics;
        nl.a.b().a(getIntent()).g(this, new vi.e() { // from class: qd.x
            @Override // vi.e
            public final void onSuccess(Object obj) {
                MainActivity.Q4(MainActivity.this, (nl.b) obj);
            }
        }).d(this, qd.w.f49001a);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r0.d(this, null, 1, null);
    }

    @dq.l
    public final void onEvent(ye.a aVar) {
        jo.p.h(aVar, "status");
        if (aVar.f() || aVar.d()) {
            ae.u uVar = this.P;
            ae.u uVar2 = null;
            if (uVar == null) {
                jo.p.v("binding");
                uVar = null;
            }
            uVar.I.setVisibility(8);
            ae.u uVar3 = this.P;
            if (uVar3 == null) {
                jo.p.v("binding");
            } else {
                uVar2 = uVar3;
            }
            uVar2.H.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        jo.p.h(intent, "intent");
        super.onNewIntent(intent);
        v4(intent);
        a4();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        dq.c.c().r(this);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        dq.c.c().p(this);
        if (this.f25206j0 == 0) {
            this.f25206j0 = SystemClock.uptimeMillis();
        }
        W4();
        k4().t();
        k4().q();
        X4();
        Y4();
        if (r4().f()) {
            r4().d(false);
            if (u4().Z3().length() > 0) {
                Uri parse = Uri.parse(u4().Z3());
                String queryParameter = parse.getQueryParameter("t_ref");
                if (queryParameter == null) {
                    queryParameter = parse.toString();
                }
                jo.p.g(queryParameter, "deepLink.getQueryParamet…\") ?: deepLink.toString()");
                jf.b0 a10 = s4().a(queryParameter);
                if (a10 instanceof b0.l0) {
                    return;
                }
                startActivityForResult(HandleUrlSchemeActivity.f25127b0.a(this, Referer.URLSCHEME, a10), 208);
                Puree.d(new OpenDeeplink(queryParameter));
            }
        }
    }

    public final i1 p4() {
        return (i1) this.R.getValue();
    }

    public final ef.a q4() {
        return (ef.a) this.V.getValue();
    }

    public final kf.v r4() {
        return (kf.v) this.X.getValue();
    }

    public final of.k s4() {
        return (of.k) this.f25198b0.getValue();
    }

    public final v0 t4() {
        return (v0) this.S.getValue();
    }

    public final kf.x u4() {
        return (kf.x) this.Z.getValue();
    }

    public final void v4(Intent intent) {
        String action;
        if (!o4().b2() || intent == null || (action = intent.getAction()) == null) {
            return;
        }
        if (action.length() > 0) {
            if (so.n.q("EXTRA_ACTION_LAUNCH_FROM_FCM", action, true)) {
                String stringExtra = intent.getStringExtra("EXTRA_FCM_URL");
                if (!(stringExtra == null || stringExtra.length() == 0)) {
                    g9.a.g("gcm url : " + stringExtra);
                    jf.b0 a10 = s4().a(stringExtra);
                    if (!(a10 instanceof b0.l0)) {
                        startActivityForResult(HandleUrlSchemeActivity.f25127b0.a(this, "notice.from_gcm", a10), 208);
                    }
                }
                MRLogger j42 = j4();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_PUSH_NOTIFICATION_CLICK);
                String stringExtra2 = intent.getStringExtra(ActionLogBase.TARGET_TYPE);
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                builder.setTargetType(stringExtra2);
                String stringExtra3 = intent.getStringExtra(ActionLogBase.TARGET_ID);
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                builder.setTargetId(stringExtra3);
                wn.k[] kVarArr = new wn.k[2];
                String stringExtra4 = intent.getStringExtra(MRLog.PAYLOAD_NOTIFICATION_TYPE);
                if (stringExtra4 == null) {
                    stringExtra4 = "";
                }
                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_NOTIFICATION_TYPE, stringExtra4);
                String stringExtra5 = intent.getStringExtra("text");
                kVarArr[1] = wn.q.a("text", stringExtra5 != null ? stringExtra5 : "");
                builder.setPayload(xn.s.m(kVarArr));
                j42.sendLog(builder.build());
                this.f25207k0 = true;
            } else if (so.n.q("EXTRA_ACTION_LIVE_VIEWER", action, true)) {
                String stringExtra6 = intent.getStringExtra("EXTRA_PARAM_LIVEID");
                if (stringExtra6 == null || isFinishing()) {
                    return;
                }
                boolean f10 = c4().f(intent.getLongExtra("EXTRA_PARAM_LIVE_DURATION", 0L), intent.getIntExtra("EXTRA_PARAM_LIVE_COMMENT_COUNT", 0));
                if (intent.getBooleanExtra("EXTRA_PARAM_IS_POWER_SAVED", false)) {
                    f4().i();
                    k4().p(stringExtra6);
                }
                df.a e10 = i4().e();
                if (e10 != null) {
                    startActivity(h4().d(this, stringExtra6, e10, f10, true));
                }
            } else if (!so.n.q("android.intent.action.VIEW", action, true) && !so.n.q("EXTRA_ACTION_LAUNCH_FROM_WEBVIEW", action, true)) {
                if (so.n.q("actiontype_dialog_afterplay", action, true)) {
                    startActivity(h4().x(this, e4(), intent));
                }
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    String uri = data.toString();
                    jo.p.g(uri, "uri.toString()");
                    jf.b0 a11 = s4().a(uri);
                    if (a11 instanceof b0.l0) {
                        return;
                    }
                    startActivityForResult(HandleUrlSchemeActivity.f25127b0.a(this, Referer.URLSCHEME, a11), 208);
                    Puree.d(new OpenDeeplink(uri));
                }
            }
        }
    }

    public final void w4() {
        l4().i().i(this, new androidx.lifecycle.f0() { // from class: qd.n
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.M4(MainActivity.this, (Boolean) obj);
            }
        });
        l4().p().i(this, new androidx.lifecycle.f0() { // from class: qd.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.N4(MainActivity.this, (Boolean) obj);
            }
        });
        l4().j().i(this, new androidx.lifecycle.f0() { // from class: qd.d0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.x4(MainActivity.this, (Boolean) obj);
            }
        });
        l4().o().i(this, new androidx.lifecycle.f0() { // from class: qd.c0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.y4(MainActivity.this, (Boolean) obj);
            }
        });
        l4().g().i(this, new androidx.lifecycle.f0() { // from class: qd.s
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.z4(MainActivity.this, (wn.v) obj);
            }
        });
        l4().h().i(this, new androidx.lifecycle.f0() { // from class: qd.t
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.A4(MainActivity.this, (wn.v) obj);
            }
        });
        l4().f().i(this, new androidx.lifecycle.f0() { // from class: qd.y
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.B4(MainActivity.this, (MRError) obj);
            }
        });
        l4().m().i(this, new androidx.lifecycle.f0() { // from class: qd.b0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.C4(MainActivity.this, (UserMe) obj);
            }
        });
        l4().n().i(this, new androidx.lifecycle.f0() { // from class: qd.z
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.D4(MainActivity.this, (MRError) obj);
            }
        });
        l4().k().i(this, new androidx.lifecycle.f0() { // from class: qd.q
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.E4(MainActivity.this, (String) obj);
            }
        });
        l4().l().i(this, new androidx.lifecycle.f0() { // from class: qd.p
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.F4(MainActivity.this, (String) obj);
            }
        });
        l4().q().i(this, new androidx.lifecycle.f0() { // from class: qd.f0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.G4(MainActivity.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        g4().w().i(this, new androidx.lifecycle.f0() { // from class: qd.m
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.H4(MainActivity.this, (Boolean) obj);
            }
        });
        g4().z().i(this, new androidx.lifecycle.f0() { // from class: qd.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.I4(MainActivity.this, (Boolean) obj);
            }
        });
        g4().x().i(this, new androidx.lifecycle.f0() { // from class: qd.e0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.J4(MainActivity.this, (Boolean) obj);
            }
        });
        g4().C().i(this, new androidx.lifecycle.f0() { // from class: qd.a0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.K4(MainActivity.this, (ToolTipStartLiveButtonResponse) obj);
            }
        });
        g4().m().i(this, new androidx.lifecycle.f0() { // from class: qd.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MainActivity.L4(MainActivity.this, (Boolean) obj);
            }
        });
    }
}
