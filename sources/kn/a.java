package kn;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0550a f38882a;

    /* renamed from: kn.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0550a {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Application.ActivityLifecycleCallbacks> f38883a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Application f38884b;

        /* renamed from: kn.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0551a implements Application.ActivityLifecycleCallbacks {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f38885w;

            public C0551a(b bVar) {
                this.f38885w = bVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.f38885w.a(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                this.f38885w.b(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                this.f38885w.c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                this.f38885w.d(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.f38885w.e(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                this.f38885w.f(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                this.f38885w.g(activity);
            }
        }

        public C0550a(Application application) {
            this.f38884b = application;
        }

        public final boolean b(b bVar) {
            if (this.f38884b != null) {
                C0551a c0551a = new C0551a(bVar);
                this.f38884b.registerActivityLifecycleCallbacks(c0551a);
                this.f38883a.add(c0551a);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {
        public void a(Activity activity, Bundle bundle) {
        }

        public void b(Activity activity) {
        }

        public void c(Activity activity) {
        }

        public void d(Activity activity) {
        }

        public void e(Activity activity, Bundle bundle) {
        }

        public abstract void f(Activity activity);

        public void g(Activity activity) {
        }
    }

    public a(Context context) {
        this.f38882a = new C0550a((Application) context.getApplicationContext());
    }

    public boolean a(b bVar) {
        C0550a c0550a = this.f38882a;
        return c0550a != null && c0550a.b(bVar);
    }
}
