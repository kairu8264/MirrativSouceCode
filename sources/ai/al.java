package ai;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class al implements hl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f1909a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f1910b;

    public al(il ilVar, Activity activity, Bundle bundle) {
        this.f1909a = activity;
        this.f1910b = bundle;
    }

    @Override // ai.hl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f1909a, this.f1910b);
    }
}
