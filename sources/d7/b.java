package d7;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29234a = c.a.a(TopicConstant.EXTEND_LIPMETA_A);

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29235b = c.a.a("fc", "sc", "sw", TopicConstant.PACKET_TYPE_TEXT);

    public static z6.k a(e7.c cVar, s6.d dVar) throws IOException {
        cVar.d();
        z6.k kVar = null;
        while (cVar.i()) {
            if (cVar.E(f29234a) != 0) {
                cVar.F();
                cVar.G();
            } else {
                kVar = b(cVar, dVar);
            }
        }
        cVar.h();
        return kVar == null ? new z6.k(null, null, null, null) : kVar;
    }

    public static z6.k b(e7.c cVar, s6.d dVar) throws IOException {
        cVar.d();
        z6.a aVar = null;
        z6.a aVar2 = null;
        z6.b bVar = null;
        z6.b bVar2 = null;
        while (cVar.i()) {
            int E = cVar.E(f29235b);
            if (E == 0) {
                aVar = d.c(cVar, dVar);
            } else if (E == 1) {
                aVar2 = d.c(cVar, dVar);
            } else if (E == 2) {
                bVar = d.e(cVar, dVar);
            } else if (E != 3) {
                cVar.F();
                cVar.G();
            } else {
                bVar2 = d.e(cVar, dVar);
            }
        }
        cVar.h();
        return new z6.k(aVar, aVar2, bVar, bVar2);
    }
}
