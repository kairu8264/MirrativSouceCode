package d7;

import a7.j;
import android.graphics.PointF;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29239a = c.a.a("nm", "sy", "pt", TtmlNode.TAG_P, TopicConstant.EXTEND_AAC_RAW, "or", LogBase.OS, "ir", "is", "hd");

    public static a7.j a(e7.c cVar, s6.d dVar) throws IOException {
        boolean z10 = false;
        String str = null;
        j.a aVar = null;
        z6.b bVar = null;
        z6.m<PointF, PointF> mVar = null;
        z6.b bVar2 = null;
        z6.b bVar3 = null;
        z6.b bVar4 = null;
        z6.b bVar5 = null;
        z6.b bVar6 = null;
        while (cVar.i()) {
            switch (cVar.E(f29239a)) {
                case 0:
                    str = cVar.q();
                    break;
                case 1:
                    aVar = j.a.a(cVar.o());
                    break;
                case 2:
                    bVar = d.f(cVar, dVar, false);
                    break;
                case 3:
                    mVar = a.b(cVar, dVar);
                    break;
                case 4:
                    bVar2 = d.f(cVar, dVar, false);
                    break;
                case 5:
                    bVar4 = d.e(cVar, dVar);
                    break;
                case 6:
                    bVar6 = d.f(cVar, dVar, false);
                    break;
                case 7:
                    bVar3 = d.e(cVar, dVar);
                    break;
                case 8:
                    bVar5 = d.f(cVar, dVar, false);
                    break;
                case 9:
                    z10 = cVar.j();
                    break;
                default:
                    cVar.F();
                    cVar.G();
                    break;
            }
        }
        return new a7.j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z10);
    }
}
