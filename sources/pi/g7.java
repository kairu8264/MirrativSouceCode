package pi;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class g7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i7 f47871w;

    public /* synthetic */ g7(i7 i7Var, f7 f7Var) {
        this.f47871w = i7Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b5 b5Var;
        try {
            try {
                this.f47871w.f48285a.r().u().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    b5Var = this.f47871w.f48285a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.f47871w.f48285a.N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z10 = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? TtmlNode.TEXT_EMPHASIS_AUTO : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z10 = false;
                        }
                        this.f47871w.f48285a.a().y(new e7(this, z10, data, str, queryParameter));
                        b5Var = this.f47871w.f48285a;
                    }
                    b5Var = this.f47871w.f48285a;
                }
            } catch (RuntimeException e10) {
                this.f47871w.f48285a.r().p().b("Throwable caught in onActivityCreated", e10);
                b5Var = this.f47871w.f48285a;
            }
            b5Var.K().y(activity, bundle);
        } catch (Throwable th2) {
            this.f47871w.f48285a.K().y(activity, bundle);
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f47871w.f48285a.K().z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f47871w.f48285a.K().A(activity);
        m9 M = this.f47871w.f48285a.M();
        M.f48285a.a().y(new e9(M, M.f48285a.c().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m9 M = this.f47871w.f48285a.M();
        M.f48285a.a().y(new d9(M, M.f48285a.c().elapsedRealtime()));
        this.f47871w.f48285a.K().B(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f47871w.f48285a.K().C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
