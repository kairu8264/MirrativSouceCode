package c1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import c1.l0;

/* loaded from: classes.dex */
public final class f {
    public static final k0 a(int i10, int i11, int i12, boolean z10, d1.c cVar) {
        Bitmap createBitmap;
        jo.p.h(cVar, "colorSpace");
        Bitmap.Config d10 = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = q.c(i10, i11, i12, z10, cVar);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, d10);
            jo.p.g(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z10);
        }
        return new e(createBitmap);
    }

    public static final Bitmap b(k0 k0Var) {
        jo.p.h(k0Var, "<this>");
        if (k0Var instanceof e) {
            return ((e) k0Var).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final k0 c(Bitmap bitmap) {
        jo.p.h(bitmap, "<this>");
        return new e(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        l0.a aVar = l0.f18711b;
        if (l0.i(i10, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (l0.i(i10, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (l0.i(i10, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && l0.i(i10, aVar.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i11 >= 26 && l0.i(i10, aVar.d())) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        jo.p.h(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return l0.f18711b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return l0.f18711b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return l0.f18711b.b();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && config == Bitmap.Config.RGBA_F16) {
            return l0.f18711b.c();
        }
        if (i10 >= 26 && config == Bitmap.Config.HARDWARE) {
            return l0.f18711b.d();
        }
        return l0.f18711b.b();
    }
}
