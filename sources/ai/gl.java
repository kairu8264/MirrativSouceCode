package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class gl implements hl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f4504a;

    public gl(il ilVar, Activity activity) {
        this.f4504a = activity;
    }

    @Override // ai.hl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f4504a);
    }
}
