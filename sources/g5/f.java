package g5;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* loaded from: classes.dex */
public class f {
    public static <T> ObjectAnimator a(T t10, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t10, new h(property, path), 0.0f, 1.0f);
    }
}
