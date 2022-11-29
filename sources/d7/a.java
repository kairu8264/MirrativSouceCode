package d7;

import android.graphics.PointF;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29232a = c.a.a("k", "x", "y");

    public static z6.e a(e7.c cVar, s6.d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.z() == c.b.BEGIN_ARRAY) {
            cVar.c();
            while (cVar.i()) {
                arrayList.add(z.a(cVar, dVar));
            }
            cVar.e();
            u.b(arrayList);
        } else {
            arrayList.add(new g7.a(s.e(cVar, f7.h.e())));
        }
        return new z6.e(arrayList);
    }

    public static z6.m<PointF, PointF> b(e7.c cVar, s6.d dVar) throws IOException {
        cVar.d();
        z6.e eVar = null;
        z6.b bVar = null;
        boolean z10 = false;
        z6.b bVar2 = null;
        while (cVar.z() != c.b.END_OBJECT) {
            int E = cVar.E(f29232a);
            if (E == 0) {
                eVar = a(cVar, dVar);
            } else if (E != 1) {
                if (E != 2) {
                    cVar.F();
                    cVar.G();
                } else if (cVar.z() == c.b.STRING) {
                    cVar.G();
                    z10 = true;
                } else {
                    bVar = d.e(cVar, dVar);
                }
            } else if (cVar.z() == c.b.STRING) {
                cVar.G();
                z10 = true;
            } else {
                bVar2 = d.e(cVar, dVar);
            }
        }
        cVar.h();
        if (z10) {
            dVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new z6.i(bVar2, bVar);
    }
}
