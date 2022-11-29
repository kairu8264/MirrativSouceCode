package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class c0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f2643a;

    public c0(i0 i0Var, Activity activity) {
        this.f2643a = activity;
    }

    @Override // ai.h0
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f2643a);
    }
}
