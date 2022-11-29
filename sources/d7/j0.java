package d7;

import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f29259a = c.a.a("nm", "ind", "ks", "hd");

    public static a7.p a(e7.c cVar, s6.d dVar) throws IOException {
        int i10 = 0;
        String str = null;
        z6.h hVar = null;
        boolean z10 = false;
        while (cVar.i()) {
            int E = cVar.E(f29259a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                i10 = cVar.o();
            } else if (E == 2) {
                hVar = d.k(cVar, dVar);
            } else if (E != 3) {
                cVar.G();
            } else {
                z10 = cVar.j();
            }
        }
        return new a7.p(str, i10, hVar, z10);
    }
}
