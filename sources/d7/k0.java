package d7;

import a7.q;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29267a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29268b = c.a.a(TopicConstant.EXTEND_AVC_NDR, "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a7.q a(e7.c cVar, s6.d dVar) throws IOException {
        char c10;
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        float f10 = 0.0f;
        String str = null;
        z6.b bVar = null;
        z6.a aVar = null;
        z6.b bVar2 = null;
        q.b bVar3 = null;
        q.c cVar2 = null;
        z6.d dVar2 = null;
        while (cVar.i()) {
            switch (cVar.E(f29267a)) {
                case 0:
                    str = cVar.q();
                    break;
                case 1:
                    aVar = d.c(cVar, dVar);
                    break;
                case 2:
                    bVar2 = d.e(cVar, dVar);
                    break;
                case 3:
                    dVar2 = d.h(cVar, dVar);
                    break;
                case 4:
                    bVar3 = q.b.values()[cVar.o() - 1];
                    break;
                case 5:
                    cVar2 = q.c.values()[cVar.o() - 1];
                    break;
                case 6:
                    f10 = (float) cVar.n();
                    break;
                case 7:
                    z10 = cVar.j();
                    break;
                case 8:
                    cVar.c();
                    while (cVar.i()) {
                        cVar.d();
                        String str2 = null;
                        z6.b bVar4 = null;
                        while (cVar.i()) {
                            int E = cVar.E(f29268b);
                            if (E == 0) {
                                str2 = cVar.q();
                            } else if (E != 1) {
                                cVar.F();
                                cVar.G();
                            } else {
                                bVar4 = d.e(cVar, dVar);
                            }
                        }
                        cVar.h();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                dVar.v(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar = bVar4;
                                break;
                        }
                    }
                    cVar.e();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((z6.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.G();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar2 = new z6.d(Collections.singletonList(new g7.a(100)));
        }
        return new a7.q(str, bVar, arrayList, aVar, dVar2, bVar2, bVar3, cVar2, f10, z10);
    }
}
