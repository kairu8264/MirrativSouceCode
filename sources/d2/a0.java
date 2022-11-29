package d2;

import android.graphics.Typeface;
import d2.o0;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f29056a = g0.a();

    public o0 a(m0 m0Var, b0 b0Var, io.l<? super o0.b, wn.v> lVar, io.l<? super m0, ? extends Object> lVar2) {
        Typeface a10;
        jo.p.h(m0Var, "typefaceRequest");
        jo.p.h(b0Var, "platformFontLoader");
        jo.p.h(lVar, "onAsyncCompletion");
        jo.p.h(lVar2, "createDefaultTypeface");
        l c10 = m0Var.c();
        if (c10 == null ? true : c10 instanceof i) {
            a10 = this.f29056a.a(m0Var.f(), m0Var.d());
        } else if (c10 instanceof y) {
            a10 = this.f29056a.b((y) m0Var.c(), m0Var.f(), m0Var.d());
        } else if (!(c10 instanceof z)) {
            return null;
        } else {
            a10 = ((g2.i) ((z) m0Var.c()).f()).a(m0Var.f(), m0Var.d(), m0Var.e());
        }
        return new o0.b(a10, false, 2, null);
    }
}
