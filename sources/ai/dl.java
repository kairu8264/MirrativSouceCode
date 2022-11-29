package ai;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes3.dex */
public final class dl implements hl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f3328a;

    public dl(il ilVar, Activity activity) {
        this.f3328a = activity;
    }

    @Override // ai.hl
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f3328a);
    }
}
