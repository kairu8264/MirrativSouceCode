package yg;

import ai.uk0;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public final View f61925a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f61926b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f61927c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f61928d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f61929e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f61930f;

    public n1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f61926b = activity;
        this.f61925a = view;
        this.f61930f = onGlobalLayoutListener;
    }

    public static ViewTreeObserver h(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void a(Activity activity) {
        this.f61926b = activity;
    }

    public final void b() {
        this.f61929e = true;
        if (this.f61928d) {
            f();
        }
    }

    public final void c() {
        this.f61929e = false;
        g();
    }

    public final void d() {
        this.f61928d = true;
        if (this.f61929e) {
            f();
        }
    }

    public final void e() {
        this.f61928d = false;
        g();
    }

    public final void f() {
        if (this.f61927c) {
            return;
        }
        Activity activity = this.f61926b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f61930f;
            ViewTreeObserver h10 = h(activity);
            if (h10 != null) {
                h10.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        wg.t.A();
        uk0.a(this.f61925a, this.f61930f);
        this.f61927c = true;
    }

    public final void g() {
        Activity activity = this.f61926b;
        if (activity != null && this.f61927c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f61930f;
            ViewTreeObserver h10 = h(activity);
            if (h10 != null) {
                wg.t.f();
                h10.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f61927c = false;
        }
    }
}
