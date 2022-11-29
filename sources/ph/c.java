package ph;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final c A = new c();

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f47465w = new AtomicBoolean();

    /* renamed from: x  reason: collision with root package name */
    public final AtomicBoolean f47466x = new AtomicBoolean();

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<a> f47467y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public boolean f47468z = false;

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z10);
    }

    public static c b() {
        return A;
    }

    public static void c(Application application) {
        c cVar = A;
        synchronized (cVar) {
            if (!cVar.f47468z) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f47468z = true;
            }
        }
    }

    public void a(a aVar) {
        synchronized (A) {
            this.f47467y.add(aVar);
        }
    }

    public boolean d() {
        return this.f47465w.get();
    }

    @TargetApi(16)
    public boolean e(boolean z10) {
        if (!this.f47466x.get()) {
            if (!vh.n.c()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f47466x.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f47465w.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z10) {
        synchronized (A) {
            Iterator<a> it = this.f47467y.iterator();
            while (it.hasNext()) {
                it.next().a(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f47465w.compareAndSet(true, false);
        this.f47466x.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f47465w.compareAndSet(true, false);
        this.f47466x.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f47465w.compareAndSet(false, true)) {
            this.f47466x.set(true);
            f(true);
        }
    }
}
