package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class xk0 {

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<View> f11970w;

    public xk0(View view) {
        this.f11970w = new WeakReference<>(view);
    }

    public abstract void a(ViewTreeObserver viewTreeObserver);

    public abstract void b(ViewTreeObserver viewTreeObserver);

    public final void c() {
        ViewTreeObserver e10 = e();
        if (e10 != null) {
            a(e10);
        }
    }

    public final void d() {
        ViewTreeObserver e10 = e();
        if (e10 != null) {
            b(e10);
        }
    }

    public final ViewTreeObserver e() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f11970w.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
