package z1;

import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f62454a = new h();

    public static final void a(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        jo.p.h(paint, "paint");
        jo.p.h(charSequence, "text");
        jo.p.h(rect, "rect");
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
