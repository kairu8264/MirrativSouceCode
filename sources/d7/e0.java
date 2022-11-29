package d7;

import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29243a = c.a.a("nm", "c", "o", "tr", "hd");

    public static a7.l a(e7.c cVar, s6.d dVar) throws IOException {
        boolean z10 = false;
        String str = null;
        z6.b bVar = null;
        z6.b bVar2 = null;
        z6.l lVar = null;
        while (cVar.i()) {
            int E = cVar.E(f29243a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                bVar = d.f(cVar, dVar, false);
            } else if (E == 2) {
                bVar2 = d.f(cVar, dVar, false);
            } else if (E == 3) {
                lVar = c.g(cVar, dVar);
            } else if (E != 4) {
                cVar.G();
            } else {
                z10 = cVar.j();
            }
        }
        return new a7.l(str, bVar, bVar2, lVar, z10);
    }
}
