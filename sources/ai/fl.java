package ai;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class fl implements hl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f4075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f4076b;

    public fl(il ilVar, Activity activity, Bundle bundle) {
        this.f4075a = activity;
        this.f4076b = bundle;
    }

    @Override // ai.hl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f4075a, this.f4076b);
    }
}
