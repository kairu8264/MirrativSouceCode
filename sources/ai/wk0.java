package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class wk0 extends xk0 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: x  reason: collision with root package name */
    public final WeakReference<ViewTreeObserver.OnScrollChangedListener> f11651x;

    public wk0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f11651x = new WeakReference<>(onScrollChangedListener);
    }

    @Override // ai.xk0
    public final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // ai.xk0
    public final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f11651x.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            d();
        }
    }
}
