package uj;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import uj.e;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public e.b f55947a;

    public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.K(0.1f);
        swipeDismissBehavior.J(0.6f);
        swipeDismissBehavior.L(0);
    }

    public boolean a(View view) {
        return view instanceof d;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                e.b().e(this.f55947a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            e.b().f(this.f55947a);
        }
    }
}
