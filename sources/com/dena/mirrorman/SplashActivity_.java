package com.dena.mirrorman;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import co.l;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.SplashActivity_;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.clientlog.logs.Launch;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.NotificationLog;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.unity.UnityManager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hf.a0;
import hf.r;
import hf.v0;
import io.p;
import jo.f0;
import jo.q;
import kf.t;
import nd.f1;
import of.n;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.i;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public class SplashActivity_ extends e.b implements q0 {
    public final /* synthetic */ q0 O = r0.b();
    public AlertDialog P;
    public long Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;

    @co.f(c = "com.dena.mirrorman.SplashActivity_$delayFinish$1", f = "SplashActivity_.kt", l = {148}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25087w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25087w;
            if (i10 == 0) {
                m.b(obj);
                this.f25087w = 1;
                if (b1.a(1000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            SplashActivity_.this.finish();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25089w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25090x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25091y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25089w = componentCallbacks;
            this.f25090x = aVar;
            this.f25091y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25089w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f25090x, this.f25091y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25092w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25093x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25094y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25092w = componentCallbacks;
            this.f25093x = aVar;
            this.f25094y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final r invoke() {
            ComponentCallbacks componentCallbacks = this.f25092w;
            return gq.a.a(componentCallbacks).c(f0.b(r.class), this.f25093x, this.f25094y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25095w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25096x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25097y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25095w = componentCallbacks;
            this.f25096x = aVar;
            this.f25097y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f25095w;
            return gq.a.a(componentCallbacks).c(f0.b(t.class), this.f25096x, this.f25097y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<NotificationLog> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25098w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25099x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25100y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25098w = componentCallbacks;
            this.f25099x = aVar;
            this.f25100y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.NotificationLog, java.lang.Object] */
        @Override // io.a
        public final NotificationLog invoke() {
            ComponentCallbacks componentCallbacks = this.f25098w;
            return gq.a.a(componentCallbacks).c(f0.b(NotificationLog.class), this.f25099x, this.f25100y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<a0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25101w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25102x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25103y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25101w = componentCallbacks;
            this.f25102x = aVar;
            this.f25103y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.a0, java.lang.Object] */
        @Override // io.a
        public final a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25101w;
            return gq.a.a(componentCallbacks).c(f0.b(a0.class), this.f25102x, this.f25103y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25104w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25105x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25106y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25104w = componentCallbacks;
            this.f25105x = aVar;
            this.f25106y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25104w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f25105x, this.f25106y);
        }
    }

    @co.f(c = "com.dena.mirrorman.SplashActivity_$updateProfileMe$1", f = "SplashActivity_.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25107w;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25107w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    a0 J3 = SplashActivity_.this.J3();
                    this.f25107w = 1;
                    obj = a0.a.a(J3, Referer.HOME, false, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                UserMe userMe = (UserMe) obj;
                SplashActivity_.this.N3().v(userMe);
                SplashActivity_.this.I3().t(userMe.getCapabilities());
                String packageName = SplashActivity_.this.getApplicationContext().getPackageName();
                jo.p.g(packageName, "applicationContext.packageName");
                Puree.d(new Launch(false, "app_launch", (SystemClock.uptimeMillis() - SplashActivity_.this.Q) / 1000.0d, packageName));
                if (SplashActivity_.this.M3().f()) {
                    Puree.d(new Launch.FirstLaunch(""));
                    SplashActivity_.this.M3().d(false);
                }
                UnityManager.Companion companion = UnityManager.Companion;
                companion.getInstance().setUserTrackingInfo(userMe.getUserId(), n.c(SplashActivity_.this));
                try {
                    if (SplashActivity_.this.I3().c()) {
                        if (SplashActivity_.this.M3().n2() && companion.getInstance().clearAssetBundleCache()) {
                            SplashActivity_.this.M3().i0(false);
                        }
                        companion.getInstance().initAssetBundleIfNeeded(SplashActivity_.this.I3().b());
                    }
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
                Puree.b();
                SplashActivity_.this.G3(userMe);
            } catch (Throwable th2) {
                MRError error = MRErrorKt.convertMRException(th2).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    n.f45411a.l(SplashActivity_.this, error);
                } else {
                    SplashActivity_ splashActivity_ = SplashActivity_.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = SplashActivity_.this.getString(f1.f41966c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    splashActivity_.O3(message);
                }
            }
            return v.f59242a;
        }
    }

    public SplashActivity_() {
        i iVar = i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new b(this, null, null));
        this.S = wn.g.b(iVar, new c(this, null, null));
        this.T = wn.g.b(iVar, new d(this, null, null));
        this.U = wn.g.b(iVar, new e(this, null, null));
        this.V = wn.g.b(iVar, new f(this, null, null));
        this.W = wn.g.b(iVar, new g(this, null, null));
    }

    public static final void P3(SplashActivity_ splashActivity_, DialogInterface dialogInterface, int i10) {
        jo.p.h(splashActivity_, "this$0");
        splashActivity_.R3();
    }

    public static final void Q3(SplashActivity_ splashActivity_, DialogInterface dialogInterface, int i10) {
        jo.p.h(splashActivity_, "this$0");
        splashActivity_.finish();
    }

    public final void G3(UserMe userMe) {
        Intent a10;
        if (M3().b2()) {
            a10 = MainActivity.f25195m0.a(this, (r17 & 2) != 0 ? null : null, (r17 & 4) != 0 ? 0L : 0L, (r17 & 8) != 0 ? 0 : 0, (r17 & 16) != 0 ? false : false, (r17 & 32) == 0 ? null : null, (r17 & 64) == 0 ? false : false);
            a10.setFlags(268435456);
            startActivity(a10);
            H3();
            return;
        }
        Intent Y = K3().Y(this, userMe.getOnboardingLiveGame());
        Y.setFlags(268435456);
        startActivity(Y);
        H3();
    }

    public final void H3() {
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final r I3() {
        return (r) this.S.getValue();
    }

    public final a0 J3() {
        return (a0) this.V.getValue();
    }

    public final tb.c K3() {
        return (tb.c) this.W.getValue();
    }

    public final NotificationLog L3() {
        return (NotificationLog) this.U.getValue();
    }

    public final t M3() {
        return (t) this.T.getValue();
    }

    public final v0 N3() {
        return (v0) this.R.getValue();
    }

    public final void O3(String str) {
        if (isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str);
        builder.setCancelable(false);
        builder.setPositiveButton("retry", new DialogInterface.OnClickListener() { // from class: nd.k1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SplashActivity_.P3(SplashActivity_.this, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(TtmlNode.END, new DialogInterface.OnClickListener() { // from class: nd.l1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SplashActivity_.Q3(SplashActivity_.this, dialogInterface, i10);
            }
        });
        AlertDialog create = builder.create();
        this.P = create;
        jo.p.e(create);
        create.show();
    }

    public final void R3() {
        uo.l.d(this, null, null, new h(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(nd.b1.activity_splash);
        this.Q = SystemClock.uptimeMillis();
        NotificationLog L3 = L3();
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        L3.sendNotificationChannelLog(applicationContext, MRLog.ACTION_TYPE_GET_DEVICE_SETTING);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.P;
        if (alertDialog != null) {
            jo.p.e(alertDialog);
            if (alertDialog.isShowing()) {
                AlertDialog alertDialog2 = this.P;
                jo.p.e(alertDialog2);
                alertDialog2.dismiss();
            }
        }
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        R3();
    }
}
