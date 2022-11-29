package ai;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class y0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler I = new Handler(Looper.getMainLooper());
    public BroadcastReceiver A;
    public final k0 B;
    public WeakReference<ViewTreeObserver> C;
    public WeakReference<View> D;
    public i0 E;
    public byte F = -1;
    public int G = -1;
    public long H = -3;

    /* renamed from: w  reason: collision with root package name */
    public final Context f12378w;

    /* renamed from: x  reason: collision with root package name */
    public Application f12379x;

    /* renamed from: y  reason: collision with root package name */
    public final PowerManager f12380y;

    /* renamed from: z  reason: collision with root package name */
    public final KeyguardManager f12381z;

    public y0(Context context, k0 k0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f12378w = applicationContext;
        this.B = k0Var;
        this.f12380y = (PowerManager) applicationContext.getSystemService("power");
        this.f12381z = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f12379x = application;
            this.E = new i0(application, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j10;
        View b10 = b();
        if (b10 != null) {
            b10.removeOnAttachStateChangeListener(this);
            i(b10);
        }
        this.D = new WeakReference<>(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.H = j10;
    }

    public final View b() {
        WeakReference<View> weakReference = this.D;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final long c() {
        if (this.H <= -2 && b() == null) {
            this.H = -3L;
        }
        return this.H;
    }

    public final void e() {
        I.post(new w0(this));
    }

    public final void f(Activity activity, int i10) {
        Window window;
        if (this.D == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View b10 = b();
        if (b10 == null || peekDecorView == null || b10.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.G = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        if ((r5.flags & 524288) != 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r7.D
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r7.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L13
            r7.H = r2
            r7.F = r1
            return
        L13:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L24
            r4 = r4 | 2
        L24:
            android.os.PowerManager r5 = r7.f12380y
            if (r5 == 0) goto L30
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L30
            r4 = r4 | 4
        L30:
            ai.k0 r5 = r7.B
            boolean r5 = r5.a()
            if (r5 != 0) goto L60
            android.app.KeyguardManager r5 = r7.f12381z
            if (r5 == 0) goto L5e
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L5e
            android.app.Activity r5 = ai.u0.i(r0)
            if (r5 != 0) goto L49
            goto L5e
        L49:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L51
            r5 = 0
            goto L55
        L51:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L55:
            if (r5 == 0) goto L5e
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L60
        L5e:
            r4 = r4 | 8
        L60:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L6d
            r4 = r4 | 16
        L6d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L7a
            r4 = r4 | 32
        L7a:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.G
            if (r5 == r1) goto L83
            r0 = r5
        L83:
            if (r0 == 0) goto L87
            r4 = r4 | 64
        L87:
            byte r0 = r7.F
            if (r0 == r4) goto L9a
            byte r0 = (byte) r4
            r7.F = r0
            if (r4 != 0) goto L95
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L98
        L95:
            long r0 = (long) r4
            long r0 = r2 - r0
        L98:
            r7.H = r0
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.y0.g():void");
    }

    public final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.C = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.A == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            x0 x0Var = new x0(this);
            this.A = x0Var;
            this.f12378w.registerReceiver(x0Var, intentFilter);
        }
        Application application = this.f12379x;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.E);
            } catch (Exception unused) {
            }
        }
    }

    public final void i(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.C;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.C = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.A;
        if (broadcastReceiver != null) {
            try {
                this.f12378w.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.A = null;
        }
        Application application = this.f12379x;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.E);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity, 0);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f(activity, 4);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f(activity, 0);
        g();
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f(activity, 0);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        g();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.G = -1;
        h(view);
        g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.G = -1;
        g();
        e();
        i(view);
    }
}
