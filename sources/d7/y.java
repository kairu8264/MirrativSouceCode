package d7;

import a7.i;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29296a = c.a.a("nm", "mm", "hd");

    public static a7.i a(e7.c cVar) throws IOException {
        String str = null;
        boolean z10 = false;
        i.a aVar = null;
        while (cVar.i()) {
            int E = cVar.E(f29296a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                aVar = i.a.a(cVar.o());
            } else if (E != 2) {
                cVar.F();
                cVar.G();
            } else {
                z10 = cVar.j();
            }
        }
        return new a7.i(str, aVar, z10);
    }
}
