package g5;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class g0 extends f0 {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f32703i = true;

    @Override // g5.i0
    @SuppressLint({"NewApi"})
    public void g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i10);
        } else if (f32703i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f32703i = false;
            }
        }
    }
}
