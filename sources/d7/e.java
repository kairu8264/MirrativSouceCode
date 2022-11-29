package d7;

import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29241a = c.a.a("ef");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29242b = c.a.a("ty", "v");

    public static a7.a a(e7.c cVar, s6.d dVar) throws IOException {
        cVar.d();
        a7.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (cVar.i()) {
                int E = cVar.E(f29242b);
                if (E != 0) {
                    if (E != 1) {
                        cVar.F();
                        cVar.G();
                    } else if (z10) {
                        aVar = new a7.a(d.e(cVar, dVar));
                    } else {
                        cVar.G();
                    }
                } else if (cVar.o() == 0) {
                    z10 = true;
                }
            }
            cVar.h();
            return aVar;
        }
    }

    public static a7.a b(e7.c cVar, s6.d dVar) throws IOException {
        a7.a aVar = null;
        while (cVar.i()) {
            if (cVar.E(f29241a) != 0) {
                cVar.F();
                cVar.G();
            } else {
                cVar.c();
                while (cVar.i()) {
                    a7.a a10 = a(cVar, dVar);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                cVar.e();
            }
        }
        return aVar;
    }
}
