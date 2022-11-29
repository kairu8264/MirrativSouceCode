package ai;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class z implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f12780a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f12781b;

    public z(i0 i0Var, Activity activity, Bundle bundle) {
        this.f12780a = activity;
        this.f12781b = bundle;
    }

    @Override // ai.h0
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f12780a, this.f12781b);
    }
}
