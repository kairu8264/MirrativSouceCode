package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class x0 {
    public static v0 a(View view) {
        v0 v0Var = (v0) view.getTag(l4.a.f39550a);
        if (v0Var != null) {
            return v0Var;
        }
        ViewParent parent = view.getParent();
        while (v0Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            v0Var = (v0) view2.getTag(l4.a.f39550a);
            parent = view2.getParent();
        }
        return v0Var;
    }

    public static void b(View view, v0 v0Var) {
        view.setTag(l4.a.f39550a, v0Var);
    }
}
