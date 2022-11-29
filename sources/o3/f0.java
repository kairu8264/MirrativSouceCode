package o3;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class f0 {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(a3.d.Y);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && c0.N(viewGroup) == null) ? false : true;
    }
}
