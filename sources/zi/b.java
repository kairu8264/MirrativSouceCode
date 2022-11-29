package zi;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f63201a;

    static {
        f63201a = Build.VERSION.SDK_INT < 18;
    }

    public static void a(a aVar, View view, FrameLayout frameLayout) {
        c(aVar, view, frameLayout);
        if (aVar.h() != null) {
            aVar.h().setForeground(aVar);
        } else if (!f63201a) {
            view.getOverlay().add(aVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void b(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (!f63201a && aVar.h() == null) {
            view.getOverlay().remove(aVar);
        } else {
            aVar.h().setForeground(null);
        }
    }

    public static void c(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.y(view, frameLayout);
    }

    public static void d(Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
