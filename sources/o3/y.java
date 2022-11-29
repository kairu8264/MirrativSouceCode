package o3;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: w  reason: collision with root package name */
    public final View f44049w;

    /* renamed from: x  reason: collision with root package name */
    public ViewTreeObserver f44050x;

    /* renamed from: y  reason: collision with root package name */
    public final Runnable f44051y;

    public y(View view, Runnable runnable) {
        this.f44049w = view;
        this.f44050x = view.getViewTreeObserver();
        this.f44051y = runnable;
    }

    public static y a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        y yVar = new y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(yVar);
        view.addOnAttachStateChangeListener(yVar);
        return yVar;
    }

    public void b() {
        if (this.f44050x.isAlive()) {
            this.f44050x.removeOnPreDrawListener(this);
        } else {
            this.f44049w.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f44049w.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f44051y.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f44050x = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
