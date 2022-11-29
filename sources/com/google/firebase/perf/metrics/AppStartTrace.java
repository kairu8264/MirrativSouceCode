package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rm.k;
import sm.c;
import sm.h;
import tm.d;
import tm.m;

/* loaded from: classes4.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks {
    public static final long J = TimeUnit.MINUTES.toMicros(1);
    public static volatile AppStartTrace K;
    public static ExecutorService L;
    public WeakReference<Activity> A;
    public WeakReference<Activity> B;
    public pm.a H;

    /* renamed from: x  reason: collision with root package name */
    public final k f28011x;

    /* renamed from: y  reason: collision with root package name */
    public final sm.a f28012y;

    /* renamed from: z  reason: collision with root package name */
    public Context f28013z;

    /* renamed from: w  reason: collision with root package name */
    public boolean f28010w = false;
    public boolean C = false;
    public h D = null;
    public h E = null;
    public h F = null;
    public h G = null;
    public boolean I = false;

    /* loaded from: classes4.dex */
    public static class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final AppStartTrace f28014w;

        public a(AppStartTrace appStartTrace) {
            this.f28014w = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28014w.E == null) {
                this.f28014w.I = true;
            }
        }
    }

    public AppStartTrace(k kVar, sm.a aVar, ExecutorService executorService) {
        this.f28011x = kVar;
        this.f28012y = aVar;
        L = executorService;
    }

    public static AppStartTrace d() {
        return K != null ? K : e(k.k(), new sm.a());
    }

    public static AppStartTrace e(k kVar, sm.a aVar) {
        if (K == null) {
            synchronized (AppStartTrace.class) {
                if (K == null) {
                    K = new AppStartTrace(kVar, aVar, new ThreadPoolExecutor(0, 1, J + 10, TimeUnit.SECONDS, new LinkedBlockingQueue(1)));
                }
            }
        }
        return K;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public h f() {
        return this.D;
    }

    public final void g() {
        m.b O = m.w0().Q(c.APP_START_TRACE_NAME.toString()).N(f().d()).O(f().c(this.G));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m.w0().Q(c.ON_CREATE_TRACE_NAME.toString()).N(f().d()).O(f().c(this.E)).a());
        m.b w02 = m.w0();
        w02.Q(c.ON_START_TRACE_NAME.toString()).N(this.E.d()).O(this.E.c(this.F));
        arrayList.add(w02.a());
        m.b w03 = m.w0();
        w03.Q(c.ON_RESUME_TRACE_NAME.toString()).N(this.F.d()).O(this.F.c(this.G));
        arrayList.add(w03.a());
        O.H(arrayList).I(this.H.a());
        this.f28011x.C(O.a(), d.FOREGROUND_BACKGROUND);
    }

    public synchronized void h(Context context) {
        if (this.f28010w) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f28010w = true;
            this.f28013z = applicationContext;
        }
    }

    public synchronized void i() {
        if (this.f28010w) {
            ((Application) this.f28013z).unregisterActivityLifecycleCallbacks(this);
            this.f28010w = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.I && this.E == null) {
            this.A = new WeakReference<>(activity);
            this.E = this.f28012y.a();
            if (FirebasePerfProvider.getAppStartTime().c(this.E) > J) {
                this.C = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.I && this.G == null && !this.C) {
            this.B = new WeakReference<>(activity);
            this.G = this.f28012y.a();
            this.D = FirebasePerfProvider.getAppStartTime();
            this.H = SessionManager.getInstance().perfSession();
            lm.a e10 = lm.a.e();
            e10.a("onResume(): " + activity.getClass().getName() + ": " + this.D.c(this.G) + " microseconds");
            L.execute(new Runnable() { // from class: mm.a
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.g();
                }
            });
            if (this.f28010w) {
                i();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.I && this.F == null && !this.C) {
            this.F = this.f28012y.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
    }
}
