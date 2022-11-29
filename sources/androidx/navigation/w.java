package androidx.navigation;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w {
    public static NavController a(Activity activity, int i10) {
        NavController c10 = c(b3.a.r(activity, i10));
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    public static NavController b(View view) {
        NavController c10 = c(view);
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static NavController c(View view) {
        while (view != null) {
            NavController d10 = d(view);
            if (d10 != null) {
                return d10;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static NavController d(View view) {
        Object tag = view.getTag(z.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static void e(View view, NavController navController) {
        view.setTag(z.nav_controller_view_tag, navController);
    }
}
