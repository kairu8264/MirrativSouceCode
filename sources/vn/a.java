package vn;

import android.view.View;
import android.view.ViewPropertyAnimator;
import jo.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f57529a = new a();

    public static final void a(View view) {
        p.h(view, "v");
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2.0f);
        view.setPivotX(view.getMeasuredWidth() / 2.0f);
        ViewPropertyAnimator interpolator = view.animate().setInterpolator(null);
        p.g(interpolator, "animate().setInterpolator(null)");
        interpolator.setStartDelay(0L);
    }
}
