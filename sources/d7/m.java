package d7;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29271a = c.a.a("ch", "size", "w", TtmlNode.TAG_STYLE, "fFamily", "data");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29272b = c.a.a("shapes");

    public static y6.d a(e7.c cVar, s6.d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.d();
        String str = null;
        String str2 = null;
        double d10 = 0.0d;
        double d11 = 0.0d;
        char c10 = 0;
        while (cVar.i()) {
            int E = cVar.E(f29271a);
            if (E == 0) {
                c10 = cVar.q().charAt(0);
            } else if (E == 1) {
                d10 = cVar.n();
            } else if (E == 2) {
                d11 = cVar.n();
            } else if (E == 3) {
                str = cVar.q();
            } else if (E == 4) {
                str2 = cVar.q();
            } else if (E != 5) {
                cVar.F();
                cVar.G();
            } else {
                cVar.d();
                while (cVar.i()) {
                    if (cVar.E(f29272b) != 0) {
                        cVar.F();
                        cVar.G();
                    } else {
                        cVar.c();
                        while (cVar.i()) {
                            arrayList.add((a7.o) h.a(cVar, dVar));
                        }
                        cVar.e();
                    }
                }
                cVar.h();
            }
        }
        cVar.h();
        return new y6.d(arrayList, c10, d10, d11, str, str2);
    }
}
