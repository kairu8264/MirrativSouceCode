package g2;

import android.graphics.Matrix;
import android.graphics.Shader;
import c1.d1;
import c1.f1;
import c1.i1;
import c1.u;
import c1.v;
import c1.w;
import java.util.List;
import jo.p;

/* loaded from: classes.dex */
public final class b {
    public static final void a(y1.d dVar, w wVar, u uVar, f1 f1Var, j2.f fVar) {
        p.h(dVar, "<this>");
        p.h(wVar, "canvas");
        p.h(uVar, "brush");
        wVar.p();
        if (dVar.v().size() <= 1) {
            b(dVar, wVar, uVar, f1Var, fVar);
        } else if (uVar instanceof i1) {
            b(dVar, wVar, uVar, f1Var, fVar);
        } else if (uVar instanceof d1) {
            List<y1.i> v10 = dVar.v();
            int size = v10.size();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                y1.i iVar = v10.get(i10);
                f11 += iVar.e().getHeight();
                f10 = Math.max(f10, iVar.e().getWidth());
            }
            Shader b10 = ((d1) uVar).b(b1.m.a(f10, f11));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            List<y1.i> v11 = dVar.v();
            int size2 = v11.size();
            for (int i11 = 0; i11 < size2; i11++) {
                y1.i iVar2 = v11.get(i11);
                iVar2.e().g(wVar, v.a(b10), f1Var, fVar);
                wVar.b(0.0f, iVar2.e().getHeight());
                matrix.setTranslate(0.0f, -iVar2.e().getHeight());
                b10.setLocalMatrix(matrix);
            }
        }
        wVar.k();
    }

    public static final void b(y1.d dVar, w wVar, u uVar, f1 f1Var, j2.f fVar) {
        List<y1.i> v10 = dVar.v();
        int size = v10.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1.i iVar = v10.get(i10);
            iVar.e().g(wVar, uVar, f1Var, fVar);
            wVar.b(0.0f, iVar.e().getHeight());
        }
    }
}
