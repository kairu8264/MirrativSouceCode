package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class vk0 extends xk0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: x  reason: collision with root package name */
    public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f11111x;

    public vk0(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f11111x = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // ai.xk0
    public final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // ai.xk0
    public final void b(ViewTreeObserver viewTreeObserver) {
        wg.t.f();
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f11111x.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            d();
        }
    }
}
