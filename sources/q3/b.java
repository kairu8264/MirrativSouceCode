package q3;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class b {
    public static Interpolator a(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f10, f11, f12, f13);
        }
        return new a(f10, f11, f12, f13);
    }
}
