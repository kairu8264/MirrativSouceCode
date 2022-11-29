package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class g0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f4266a;

    public g0(i0 i0Var, Activity activity) {
        this.f4266a = activity;
    }

    @Override // ai.h0
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f4266a);
    }
}
