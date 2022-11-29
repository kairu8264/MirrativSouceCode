package d7;

import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29244a = c.a.a("nm", TtmlNode.TAG_P, "s", "hd", "d");

    public static a7.b a(e7.c cVar, s6.d dVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean z11 = false;
        String str = null;
        z6.m<PointF, PointF> mVar = null;
        z6.f fVar = null;
        while (cVar.i()) {
            int E = cVar.E(f29244a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                mVar = a.b(cVar, dVar);
            } else if (E == 2) {
                fVar = d.i(cVar, dVar);
            } else if (E == 3) {
                z11 = cVar.j();
            } else if (E != 4) {
                cVar.F();
                cVar.G();
            } else {
                z10 = cVar.o() == 3;
            }
        }
        return new a7.b(str, mVar, fVar, z10, z11);
    }
}
