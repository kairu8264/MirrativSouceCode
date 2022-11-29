package d7;

import e7.c;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29253a = c.a.a("nm", "hd", "it");

    public static a7.o a(e7.c cVar, s6.d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (cVar.i()) {
            int E = cVar.E(f29253a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                z10 = cVar.j();
            } else if (E != 2) {
                cVar.G();
            } else {
                cVar.c();
                while (cVar.i()) {
                    a7.c a10 = h.a(cVar, dVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                cVar.e();
            }
        }
        return new a7.o(str, arrayList, z10);
    }
}
