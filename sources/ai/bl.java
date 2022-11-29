package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class bl implements hl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f2391a;

    public bl(il ilVar, Activity activity) {
        this.f2391a = activity;
    }

    @Override // ai.hl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f2391a);
    }
}
