package d7;

import android.graphics.Rect;
import b7.e;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f29292a = c.a.a("w", "h", "ip", TopicConstant.EVENT_TYPE_OPERATION, "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    public static c.a f29293b = c.a.a(TtmlNode.ATTR_ID, "layers", "w", "h", TtmlNode.TAG_P, "u");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f29294c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    public static final c.a f29295d = c.a.a("cm", "tm", "dr");

    public static s6.d a(e7.c cVar) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        e7.c cVar2 = cVar;
        float e10 = f7.h.e();
        s.e<b7.e> eVar = new s.e<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        s.h<y6.d> hVar = new s.h<>();
        s6.d dVar = new s6.d();
        cVar.d();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (cVar.i()) {
            switch (cVar2.E(f29292a)) {
                case 0:
                    i10 = cVar.o();
                    continue;
                    cVar2 = cVar;
                case 1:
                    i11 = cVar.o();
                    continue;
                    cVar2 = cVar;
                case 2:
                    f10 = (float) cVar.n();
                    continue;
                    cVar2 = cVar;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f11 = ((float) cVar.n()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f12 = (float) cVar.n();
                    break;
                case 5:
                    String[] split = cVar.q().split("\\.");
                    if (!f7.h.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    e(cVar2, dVar, arrayList2, eVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    b(cVar2, dVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    d(cVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    c(cVar2, dVar, hVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    f(cVar2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.F();
                    cVar.G();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        dVar.t(new Rect(0, 0, (int) (i10 * e10), (int) (i11 * e10)), f10, f11, f12, arrayList2, eVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return dVar;
    }

    public static void b(e7.c cVar, s6.d dVar, Map<String, List<b7.e>> map, Map<String, s6.g> map2) throws IOException {
        cVar.c();
        while (cVar.i()) {
            ArrayList arrayList = new ArrayList();
            s.e eVar = new s.e();
            cVar.d();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.i()) {
                int E = cVar.E(f29293b);
                if (E == 0) {
                    str = cVar.q();
                } else if (E == 1) {
                    cVar.c();
                    while (cVar.i()) {
                        b7.e a10 = v.a(cVar, dVar);
                        eVar.m(a10.d(), a10);
                        arrayList.add(a10);
                    }
                    cVar.e();
                } else if (E == 2) {
                    i10 = cVar.o();
                } else if (E == 3) {
                    i11 = cVar.o();
                } else if (E == 4) {
                    str2 = cVar.q();
                } else if (E != 5) {
                    cVar.F();
                    cVar.G();
                } else {
                    str3 = cVar.q();
                }
            }
            cVar.h();
            if (str2 != null) {
                s6.g gVar = new s6.g(i10, i11, str, str2, str3);
                map2.put(gVar.e(), gVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.e();
    }

    public static void c(e7.c cVar, s6.d dVar, s.h<y6.d> hVar) throws IOException {
        cVar.c();
        while (cVar.i()) {
            y6.d a10 = m.a(cVar, dVar);
            hVar.n(a10.hashCode(), a10);
        }
        cVar.e();
    }

    public static void d(e7.c cVar, Map<String, y6.c> map) throws IOException {
        cVar.d();
        while (cVar.i()) {
            if (cVar.E(f29294c) != 0) {
                cVar.F();
                cVar.G();
            } else {
                cVar.c();
                while (cVar.i()) {
                    y6.c a10 = n.a(cVar);
                    map.put(a10.b(), a10);
                }
                cVar.e();
            }
        }
        cVar.h();
    }

    public static void e(e7.c cVar, s6.d dVar, List<b7.e> list, s.e<b7.e> eVar) throws IOException {
        cVar.c();
        int i10 = 0;
        while (cVar.i()) {
            b7.e a10 = v.a(cVar, dVar);
            if (a10.f() == e.a.IMAGE) {
                i10++;
            }
            list.add(a10);
            eVar.m(a10.d(), a10);
            if (i10 > 4) {
                f7.d.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.e();
    }

    public static void f(e7.c cVar, List<y6.h> list) throws IOException {
        cVar.c();
        while (cVar.i()) {
            String str = null;
            cVar.d();
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (cVar.i()) {
                int E = cVar.E(f29295d);
                if (E == 0) {
                    str = cVar.q();
                } else if (E == 1) {
                    f10 = (float) cVar.n();
                } else if (E != 2) {
                    cVar.F();
                    cVar.G();
                } else {
                    f11 = (float) cVar.n();
                }
            }
            cVar.h();
            list.add(new y6.h(str, f10, f11));
        }
        cVar.e();
    }
}
