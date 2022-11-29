package b7;

import a7.o;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import d7.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g extends b {
    public final u6.d B;
    public final c C;

    public g(s6.f fVar, e eVar, c cVar) {
        super(fVar, eVar);
        this.C = cVar;
        u6.d dVar = new u6.d(fVar, this, new o("__container", eVar.n(), false));
        this.B = dVar;
        dVar.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // b7.b
    public void G(y6.e eVar, int i10, List<y6.e> list, y6.e eVar2) {
        this.B.d(eVar, i10, list, eVar2);
    }

    @Override // b7.b, u6.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.B.e(rectF, this.f17029m, z10);
    }

    @Override // b7.b
    public void s(Canvas canvas, Matrix matrix, int i10) {
        this.B.g(canvas, matrix, i10);
    }

    @Override // b7.b
    public a7.a u() {
        a7.a u10 = super.u();
        return u10 != null ? u10 : this.C.u();
    }

    @Override // b7.b
    public j w() {
        j w10 = super.w();
        return w10 != null ? w10 : this.C.w();
    }
}
