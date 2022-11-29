package d7;

import android.graphics.Path;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29250a = c.a.a("nm", "c", "o", "fillEnabled", TopicConstant.EXTEND_AAC_RAW, "hd");

    public static a7.n a(e7.c cVar, s6.d dVar) throws IOException {
        z6.d dVar2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        String str = null;
        z6.a aVar = null;
        while (cVar.i()) {
            int E = cVar.E(f29250a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                aVar = d.c(cVar, dVar);
            } else if (E == 2) {
                dVar2 = d.h(cVar, dVar);
            } else if (E == 3) {
                z10 = cVar.j();
            } else if (E == 4) {
                i10 = cVar.o();
            } else if (E != 5) {
                cVar.F();
                cVar.G();
            } else {
                z11 = cVar.j();
            }
        }
        return new a7.n(str, z10, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar2 == null ? new z6.d(Collections.singletonList(new g7.a(100))) : dVar2, z11);
    }
}
