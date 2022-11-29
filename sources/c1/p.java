package c1;

import android.graphics.Shader;
import android.os.Build;
import c1.l1;

/* loaded from: classes.dex */
public final class p {
    public static final Shader.TileMode a(int i10) {
        l1.a aVar = l1.f18718a;
        if (l1.f(i10, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (l1.f(i10, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (l1.f(i10, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (l1.f(i10, aVar.b())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return m1.f18723a.b();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
