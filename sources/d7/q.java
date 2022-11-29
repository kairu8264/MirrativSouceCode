package d7;

import a7.q;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29277a = c.a.a("nm", "g", "o", TopicConstant.PACKET_TYPE_TEXT, "s", i7.e.f36387u, "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29278b = c.a.a(TtmlNode.TAG_P, "k");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f29279c = c.a.a(TopicConstant.EXTEND_AVC_NDR, "v");

    public static a7.f a(e7.c cVar, s6.d dVar) throws IOException {
        z6.c cVar2;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str = null;
        a7.g gVar = null;
        z6.c cVar3 = null;
        z6.f fVar = null;
        z6.f fVar2 = null;
        z6.b bVar = null;
        q.b bVar2 = null;
        q.c cVar4 = null;
        z6.b bVar3 = null;
        boolean z10 = false;
        z6.d dVar2 = null;
        while (cVar.i()) {
            switch (cVar.E(f29277a)) {
                case 0:
                    str = cVar.q();
                    break;
                case 1:
                    int i10 = -1;
                    cVar.d();
                    while (cVar.i()) {
                        int E = cVar.E(f29278b);
                        if (E != 0) {
                            cVar2 = cVar3;
                            if (E != 1) {
                                cVar.F();
                                cVar.G();
                            } else {
                                cVar3 = d.g(cVar, dVar, i10);
                            }
                        } else {
                            cVar2 = cVar3;
                            i10 = cVar.o();
                        }
                        cVar3 = cVar2;
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
                    bVar = d.e(cVar, dVar);
                    break;
                case 7:
                    bVar2 = q.b.values()[cVar.o() - 1];
                    break;
                case 8:
                    cVar4 = q.c.values()[cVar.o() - 1];
                    break;
                case 9:
                    f10 = (float) cVar.n();
                    break;
                case 10:
                    z10 = cVar.j();
                    break;
                case 11:
                    cVar.c();
                    while (cVar.i()) {
                        cVar.d();
                        String str2 = null;
                        z6.b bVar4 = null;
                        while (cVar.i()) {
                            int E2 = cVar.E(f29279c);
                            if (E2 != 0) {
                                z6.b bVar5 = bVar3;
                                if (E2 != 1) {
                                    cVar.F();
                                    cVar.G();
                                } else {
                                    bVar4 = d.e(cVar, dVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                str2 = cVar.q();
                            }
                        }
                        z6.b bVar6 = bVar3;
                        cVar.h();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                dVar.v(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    z6.b bVar7 = bVar3;
                    cVar.e();
                    if (arrayList.size() == 1) {
                        arrayList.add((z6.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    break;
                default:
                    cVar.F();
                    cVar.G();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar2 = new z6.d(Collections.singletonList(new g7.a(100)));
        }
        return new a7.f(str, gVar, cVar3, dVar2, fVar, fVar2, bVar, bVar2, cVar4, f10, arrayList, bVar3, z10);
    }
}
