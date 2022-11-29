package d7;

import android.graphics.PointF;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import e7.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g0 implements m0<a7.m> {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f29247a = new g0();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f29248b = c.a.a("c", "v", TopicConstant.EXTEND_AVC_IDR, "o");

    @Override // d7.m0
    /* renamed from: b */
    public a7.m a(e7.c cVar, float f10) throws IOException {
        if (cVar.z() == c.b.BEGIN_ARRAY) {
            cVar.c();
        }
        cVar.d();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z10 = false;
        while (cVar.i()) {
            int E = cVar.E(f29248b);
            if (E == 0) {
                z10 = cVar.j();
            } else if (E == 1) {
                list = s.f(cVar, f10);
            } else if (E == 2) {
                list2 = s.f(cVar, f10);
            } else if (E != 3) {
                cVar.F();
                cVar.G();
            } else {
                list3 = s.f(cVar, f10);
            }
        }
        cVar.h();
        if (cVar.z() == c.b.END_ARRAY) {
            cVar.e();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new a7.m(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = list.get(i10);
                int i11 = i10 - 1;
                arrayList.add(new y6.a(f7.g.a(list.get(i11), list3.get(i11)), f7.g.a(pointF2, list2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = list.get(0);
                int i12 = size - 1;
                arrayList.add(new y6.a(f7.g.a(list.get(i12), list3.get(i12)), f7.g.a(pointF3, list2.get(0)), pointF3));
            }
            return new a7.m(pointF, z10, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
