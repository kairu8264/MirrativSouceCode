package c1;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f18625a = new a0();

    public final void a(Canvas canvas, boolean z10) {
        jo.p.h(canvas, "canvas");
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
