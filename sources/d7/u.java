package d7;

import e7.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f29287a = c.a.a("k");

    public static <T> List<g7.a<T>> a(e7.c cVar, s6.d dVar, float f10, m0<T> m0Var, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.z() == c.b.STRING) {
            dVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.d();
        while (cVar.i()) {
            if (cVar.E(f29287a) != 0) {
                cVar.G();
            } else if (cVar.z() == c.b.BEGIN_ARRAY) {
                cVar.c();
                if (cVar.z() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, dVar, f10, m0Var, false, z10));
                } else {
                    while (cVar.i()) {
                        arrayList.add(t.c(cVar, dVar, f10, m0Var, true, z10));
                    }
                }
                cVar.e();
            } else {
                arrayList.add(t.c(cVar, dVar, f10, m0Var, false, z10));
            }
        }
        cVar.h();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends g7.a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            g7.a<T> aVar = list.get(i11);
            i11++;
            g7.a<T> aVar2 = list.get(i11);
            aVar.f32803h = Float.valueOf(aVar2.f32802g);
            if (aVar.f32798c == null && (t10 = aVar2.f32797b) != null) {
                aVar.f32798c = t10;
                if (aVar instanceof v6.i) {
                    ((v6.i) aVar).i();
                }
            }
        }
        g7.a<T> aVar3 = list.get(i10);
        if ((aVar3.f32797b == null || aVar3.f32798c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
