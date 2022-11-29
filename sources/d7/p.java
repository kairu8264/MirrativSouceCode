package d7;

import android.graphics.Path;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29275a = c.a.a("nm", "g", "o", TopicConstant.PACKET_TYPE_TEXT, "s", i7.e.f36387u, TopicConstant.EXTEND_AAC_RAW, "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29276b = c.a.a(TtmlNode.TAG_P, "k");

    public static a7.e a(e7.c cVar, s6.d dVar) throws IOException {
        z6.d dVar2 = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        a7.g gVar = null;
        z6.c cVar2 = null;
        z6.f fVar = null;
        z6.f fVar2 = null;
        boolean z10 = false;
        while (cVar.i()) {
            switch (cVar.E(f29275a)) {
                case 0:
                    str = cVar.q();
                    break;
                case 1:
                    int i10 = -1;
                    cVar.d();
                    while (cVar.i()) {
                        int E = cVar.E(f29276b);
                        if (E == 0) {
                            i10 = cVar.o();
                        } else if (E != 1) {
                            cVar.F();
                            cVar.G();
                        } else {
                            cVar2 = d.g(cVar, dVar, i10);
                        }
                    }
                    cVar.h();
                    break;
                case 2:
                    dVar2 = d.h(cVar, dVar);
                    break;
                case 3:
                    gVar = cVar.o() == 1 ? a7.g.LINEAR : a7.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, dVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, dVar);
                    break;
                case 6:
                    fillType = cVar.o() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z10 = cVar.j();
                    break;
                default:
                    cVar.F();
                    cVar.G();
                    break;
            }
        }
        return new a7.e(str, gVar, fillType, cVar2, dVar2 == null ? new z6.d(Collections.singletonList(new g7.a(100))) : dVar2, fVar, fVar2, null, null, z10);
    }
}
