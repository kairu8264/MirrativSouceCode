package ai;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class f0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f3865a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f3866b;

    public f0(i0 i0Var, Activity activity, Bundle bundle) {
        this.f3865a = activity;
        this.f3866b = bundle;
    }

    @Override // ai.h0
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f3865a, this.f3866b);
    }
}
