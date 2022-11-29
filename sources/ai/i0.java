package ai;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class i0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: w  reason: collision with root package name */
    public final Application f5058w;

    /* renamed from: x  reason: collision with root package name */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f5059x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5060y = false;

    public i0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f5059x = new WeakReference<>(activityLifecycleCallbacks);
        this.f5058w = application;
    }

    public final void a(h0 h0Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f5059x.get();
            if (activityLifecycleCallbacks != null) {
                h0Var.a(activityLifecycleCallbacks);
            } else if (this.f5060y) {
            } else {
                this.f5058w.unregisterActivityLifecycleCallbacks(this);
                this.f5060y = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new z(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new g0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new d0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new c0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new f0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new b0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new e0(this, activity));
    }
}
