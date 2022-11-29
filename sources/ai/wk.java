package ai;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

@TargetApi(14)
/* loaded from: classes3.dex */
public final class wk implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long L = ((Long) ft.c().c(ox.R0)).longValue();
    public final KeyguardManager A;
    public BroadcastReceiver B;
    public WeakReference<ViewTreeObserver> C;
    public final WeakReference<View> D;
    public il E;
    public final yg.e1 F = new yg.e1(L);
    public boolean G = false;
    public int H = -1;
    public final HashSet<vk> I = new HashSet<>();
    public final DisplayMetrics J;
    public final Rect K;

    /* renamed from: w  reason: collision with root package name */
    public final Context f11647w;

    /* renamed from: x  reason: collision with root package name */
    public Application f11648x;

    /* renamed from: y  reason: collision with root package name */
    public final WindowManager f11649y;

    /* renamed from: z  reason: collision with root package name */
    public final PowerManager f11650z;

    public wk(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f11647w = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f11649y = windowManager;
        this.f11650z = (PowerManager) applicationContext.getSystemService("power");
        this.A = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f11648x = application;
            this.E = new il(application, this);
        }
        this.J = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.K = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.D;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.D = new WeakReference<>(view);
        if (view != null) {
            if (wg.t.f().g(view)) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void a(vk vkVar) {
        this.I.add(vkVar);
        j(3);
    }

    public final void b(vk vkVar) {
        this.I.remove(vkVar);
    }

    public final Rect d(Rect rect) {
        return new Rect(k(rect.left), k(rect.top), k(rect.right), k(rect.bottom));
    }

    public final void e(long j10) {
        this.F.b(j10);
    }

    public final void f() {
        this.F.b(L);
    }

    public final /* synthetic */ void g() {
        j(3);
    }

    public final void h() {
        yg.d2.f61866i.post(new Runnable(this) { // from class: ai.sk

            /* renamed from: w  reason: collision with root package name */
            public final wk f9849w;

            {
                this.f9849w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9849w.g();
            }
        });
    }

    public final void i(Activity activity, int i10) {
        Window window;
        if (this.D == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.D.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.H = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0114, code lost:
        if (r11 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
        if (r11 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
        r3 = true;
        r11 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r33) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.wk.j(int):void");
    }

    public final int k(int i10) {
        return (int) (i10 / this.J.density);
    }

    public final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.C = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.B == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.B = new tk(this);
            wg.t.y().b(this.f11647w, this.B, intentFilter);
        }
        Application application = this.f11648x;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.E);
            } catch (Exception e10) {
                uj0.d("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    public final void m(View view) {
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
        } catch (Exception e10) {
            uj0.d("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            uj0.d("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        if (this.B != null) {
            try {
                wg.t.y().c(this.f11647w, this.B);
            } catch (IllegalStateException e12) {
                uj0.d("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                wg.t.h().k(e13, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.B = null;
        }
        Application application = this.f11648x;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.E);
            } catch (Exception e14) {
                uj0.d("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.H = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.H = -1;
        j(3);
        h();
        m(view);
    }
}
