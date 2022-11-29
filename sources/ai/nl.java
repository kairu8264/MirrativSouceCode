package ai;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class nl implements Application.ActivityLifecycleCallbacks {
    public Runnable D;
    public long F;

    /* renamed from: w  reason: collision with root package name */
    public Activity f7375w;

    /* renamed from: x  reason: collision with root package name */
    public Context f7376x;

    /* renamed from: y  reason: collision with root package name */
    public final Object f7377y = new Object();

    /* renamed from: z  reason: collision with root package name */
    public boolean f7378z = true;
    public boolean A = false;
    public final List<ol> B = new ArrayList();
    public final List<dm> C = new ArrayList();
    public boolean E = false;

    public final void f(Application application, Context context) {
        if (this.E) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f7376x = application;
        this.F = ((Long) ft.c().c(ox.D0)).longValue();
        this.E = true;
    }

    public final void g(ol olVar) {
        synchronized (this.f7377y) {
            this.B.add(olVar);
        }
    }

    public final void h(ol olVar) {
        synchronized (this.f7377y) {
            this.B.remove(olVar);
        }
    }

    public final Activity i() {
        return this.f7375w;
    }

    public final Context j() {
        return this.f7376x;
    }

    public final void k(Activity activity) {
        synchronized (this.f7377y) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f7375w = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f7377y) {
            Activity activity2 = this.f7375w;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f7375w = null;
                }
                Iterator<dm> it = this.C.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        wg.t.h().k(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        uj0.d("", e10);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f7377y) {
            for (dm dmVar : this.C) {
                try {
                    dmVar.zzb();
                } catch (Exception e10) {
                    wg.t.h().k(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    uj0.d("", e10);
                }
            }
        }
        this.A = true;
        Runnable runnable = this.D;
        if (runnable != null) {
            yg.d2.f61866i.removeCallbacks(runnable);
        }
        ow2 ow2Var = yg.d2.f61866i;
        ml mlVar = new ml(this);
        this.D = mlVar;
        ow2Var.postDelayed(mlVar, this.F);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.A = false;
        boolean z10 = !this.f7378z;
        this.f7378z = true;
        Runnable runnable = this.D;
        if (runnable != null) {
            yg.d2.f61866i.removeCallbacks(runnable);
        }
        synchronized (this.f7377y) {
            for (dm dmVar : this.C) {
                try {
                    dmVar.b();
                } catch (Exception e10) {
                    wg.t.h().k(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    uj0.d("", e10);
                }
            }
            if (z10) {
                for (ol olVar : this.B) {
                    try {
                        olVar.b(true);
                    } catch (Exception e11) {
                        uj0.d("", e11);
                    }
                }
            } else {
                uj0.a("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
