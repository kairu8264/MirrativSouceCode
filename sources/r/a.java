package r;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import r.g;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0751a implements g.a {
        public C0751a() {
        }

        @Override // r.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    @Override // r.c, r.e
    public void m() {
        g.f49687r = new C0751a();
    }
}
