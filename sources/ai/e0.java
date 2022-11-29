package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class e0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f3482a;

    public e0(i0 i0Var, Activity activity) {
        this.f3482a = activity;
    }

    @Override // ai.h0
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f3482a);
    }
}
