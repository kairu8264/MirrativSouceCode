package tj;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public class h {
    public static d a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return b();
            }
            return new e();
        }
        return new j();
    }

    public static d b() {
        return new j();
    }

    public static f c() {
        return new f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).X(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.P()) {
            gVar.b0(nj.l.c(view));
        }
    }
}
