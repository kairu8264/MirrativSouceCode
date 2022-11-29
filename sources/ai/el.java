package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class el implements hl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f3707a;

    public el(il ilVar, Activity activity) {
        this.f3707a = activity;
    }

    @Override // ai.hl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f3707a);
    }
}
