package d7;

import a7.r;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29270a = c.a.a("s", i7.e.f36387u, "o", "nm", TopicConstant.PACKET_TYPE_META, "hd");

    public static a7.r a(e7.c cVar, s6.d dVar) throws IOException {
        boolean z10 = false;
        String str = null;
        r.a aVar = null;
        z6.b bVar = null;
        z6.b bVar2 = null;
        z6.b bVar3 = null;
        while (cVar.i()) {
            int E = cVar.E(f29270a);
            if (E == 0) {
                bVar = d.f(cVar, dVar, false);
            } else if (E == 1) {
                bVar2 = d.f(cVar, dVar, false);
            } else if (E == 2) {
                bVar3 = d.f(cVar, dVar, false);
            } else if (E == 3) {
                str = cVar.q();
            } else if (E == 4) {
                aVar = r.a.a(cVar.o());
            } else if (E != 5) {
                cVar.G();
            } else {
                z10 = cVar.j();
            }
        }
        return new a7.r(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
