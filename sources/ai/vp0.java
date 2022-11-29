package ai;

import android.view.View;

/* loaded from: classes3.dex */
public final class vp0 implements View.OnAttachStateChangeListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ wg0 f11148w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ yp0 f11149x;

    public vp0(yp0 yp0Var, wg0 wg0Var) {
        this.f11149x = yp0Var;
        this.f11148w = wg0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f11149x.s(view, this.f11148w, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
