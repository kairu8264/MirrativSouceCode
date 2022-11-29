package d7;

import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29273a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static y6.c a(e7.c cVar) throws IOException {
        cVar.d();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (cVar.i()) {
            int E = cVar.E(f29273a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                str3 = cVar.q();
            } else if (E == 2) {
                str2 = cVar.q();
            } else if (E != 3) {
                cVar.F();
                cVar.G();
            } else {
                f10 = (float) cVar.n();
            }
        }
        cVar.h();
        return new y6.c(str, str3, str2, f10);
    }
}
