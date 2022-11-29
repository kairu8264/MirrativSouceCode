package hi;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class w2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x2 f36032w;

    public w2(x2 x2Var) {
        this.f36032w = x2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f36032w.m(new o2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f36032w.m(new v2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f36032w.m(new r2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f36032w.m(new q2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b1 b1Var = new b1();
        this.f36032w.m(new u2(this, activity, b1Var));
        Bundle s02 = b1Var.s0(50L);
        if (s02 != null) {
            bundle.putAll(s02);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f36032w.m(new p2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f36032w.m(new t2(this, activity));
    }
}
