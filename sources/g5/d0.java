package g5;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class d0 extends i0 {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f32681e = true;

    @Override // g5.i0
    public void a(View view) {
    }

    @Override // g5.i0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f32681e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f32681e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // g5.i0
    public void d(View view) {
    }

    @Override // g5.i0
    @SuppressLint({"NewApi"})
    public void f(View view, float f10) {
        if (f32681e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f32681e = false;
            }
        }
        view.setAlpha(f10);
    }
}
