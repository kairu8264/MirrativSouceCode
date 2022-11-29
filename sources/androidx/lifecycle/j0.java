package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.k0;
import androidx.lifecycle.o;

/* loaded from: classes.dex */
public class j0 implements u {
    public static final j0 E = new j0();
    public Handler A;

    /* renamed from: w  reason: collision with root package name */
    public int f15552w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f15553x = 0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f15554y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f15555z = true;
    public final w B = new w(this);
    public Runnable C = new a();
    public k0.a D = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.f();
            j0.this.h();
        }
    }

    /* loaded from: classes.dex */
    public class b implements k0.a {
        public b() {
        }

        @Override // androidx.lifecycle.k0.a
        public void a() {
        }

        @Override // androidx.lifecycle.k0.a
        public void onResume() {
            j0.this.b();
        }

        @Override // androidx.lifecycle.k0.a
        public void onStart() {
            j0.this.c();
        }
    }

    /* loaded from: classes.dex */
    public class c extends k {

        /* loaded from: classes.dex */
        public class a extends k {
            public a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                j0.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                j0.this.c();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                k0.f(activity).h(j0.this.D);
            }
        }

        @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            j0.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            j0.this.d();
        }
    }

    public static u i() {
        return E;
    }

    public static void j(Context context) {
        E.e(context);
    }

    public void a() {
        int i10 = this.f15553x - 1;
        this.f15553x = i10;
        if (i10 == 0) {
            this.A.postDelayed(this.C, 700L);
        }
    }

    public void b() {
        int i10 = this.f15553x + 1;
        this.f15553x = i10;
        if (i10 == 1) {
            if (this.f15554y) {
                this.B.h(o.b.ON_RESUME);
                this.f15554y = false;
                return;
            }
            this.A.removeCallbacks(this.C);
        }
    }

    public void c() {
        int i10 = this.f15552w + 1;
        this.f15552w = i10;
        if (i10 == 1 && this.f15555z) {
            this.B.h(o.b.ON_START);
            this.f15555z = false;
        }
    }

    public void d() {
        this.f15552w--;
        h();
    }

    public void e(Context context) {
        this.A = new Handler();
        this.B.h(o.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    public void f() {
        if (this.f15553x == 0) {
            this.f15554y = true;
            this.B.h(o.b.ON_PAUSE);
        }
    }

    @Override // androidx.lifecycle.u
    public o g() {
        return this.B;
    }

    public void h() {
        if (this.f15552w == 0 && this.f15554y) {
            this.B.h(o.b.ON_STOP);
            this.f15555z = true;
        }
    }
}
