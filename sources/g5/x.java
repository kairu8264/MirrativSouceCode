package g5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32785a = true;

    public static w a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new v(viewGroup);
        }
        return u.g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    public static void b(ViewGroup viewGroup, boolean z10) {
        if (f32785a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f32785a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (i10 >= 18) {
            b(viewGroup, z10);
        } else {
            y.b(viewGroup, z10);
        }
    }
}
