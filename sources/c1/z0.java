package c1;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class z0 {
    public static final Rect a(b1.h hVar) {
        jo.p.h(hVar, "<this>");
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }

    public static final RectF b(b1.h hVar) {
        jo.p.h(hVar, "<this>");
        return new RectF(hVar.i(), hVar.l(), hVar.j(), hVar.e());
    }

    public static final b1.h c(Rect rect) {
        jo.p.h(rect, "<this>");
        return new b1.h(rect.left, rect.top, rect.right, rect.bottom);
    }
}
