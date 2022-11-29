package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class w0 {
    public static u a(View view) {
        u uVar = (u) view.getTag(k4.a.f38390a);
        if (uVar != null) {
            return uVar;
        }
        ViewParent parent = view.getParent();
        while (uVar == null && (parent instanceof View)) {
            View view2 = (View) parent;
            uVar = (u) view2.getTag(k4.a.f38390a);
            parent = view2.getParent();
        }
        return uVar;
    }

    public static void b(View view, u uVar) {
        view.setTag(k4.a.f38390a, uVar);
    }
}
