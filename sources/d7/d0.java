package d7;

import android.graphics.PointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29240a = c.a.a("nm", TtmlNode.TAG_P, "s", TopicConstant.EXTEND_AAC_RAW, "hd");

    public static a7.k a(e7.c cVar, s6.d dVar) throws IOException {
        String str = null;
        z6.m<PointF, PointF> mVar = null;
        z6.f fVar = null;
        z6.b bVar = null;
        boolean z10 = false;
        while (cVar.i()) {
            int E = cVar.E(f29240a);
            if (E == 0) {
                str = cVar.q();
            } else if (E == 1) {
                mVar = a.b(cVar, dVar);
            } else if (E == 2) {
                fVar = d.i(cVar, dVar);
            } else if (E == 3) {
                bVar = d.e(cVar, dVar);
            } else if (E != 4) {
                cVar.G();
            } else {
                z10 = cVar.j();
            }
        }
        return new a7.k(str, mVar, fVar, bVar, z10);
    }
}
