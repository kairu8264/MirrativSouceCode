package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class b0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f2177a;

    public b0(i0 i0Var, Activity activity) {
        this.f2177a = activity;
    }

    @Override // ai.h0
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f2177a);
    }
}
