package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class cl implements hl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f2858a;

    public cl(il ilVar, Activity activity) {
        this.f2858a = activity;
    }

    @Override // ai.hl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f2858a);
    }
}
