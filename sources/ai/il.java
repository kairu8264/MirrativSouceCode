package ai;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class il implements Application.ActivityLifecycleCallbacks {

    /* renamed from: w  reason: collision with root package name */
    public final Application f5274w;

    /* renamed from: x  reason: collision with root package name */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f5275x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5276y = false;

    public il(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f5275x = new WeakReference<>(activityLifecycleCallbacks);
        this.f5274w = application;
    }

    public final void a(hl hlVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f5275x.get();
            if (activityLifecycleCallbacks != null) {
                hlVar.a(activityLifecycleCallbacks);
            } else if (this.f5276y) {
            } else {
                this.f5274w.unregisterActivityLifecycleCallbacks(this);
                this.f5276y = true;
            }
        } catch (Exception e10) {
            uj0.d("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new al(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new gl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new dl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new cl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new fl(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new bl(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new el(this, activity));
    }
}
