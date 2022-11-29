package g5;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class f0 extends e0 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f32702h = true;

    @Override // g5.i0
    @SuppressLint({"NewApi"})
    public void e(View view, int i10, int i11, int i12, int i13) {
        if (f32702h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f32702h = false;
            }
        }
    }
}
