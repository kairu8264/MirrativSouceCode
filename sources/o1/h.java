package o1;

import java.util.ArrayList;
import java.util.List;
import jo.p;
import n1.w;

/* loaded from: classes.dex */
public final class h {
    public static final void b(g gVar, w wVar) {
        p.h(gVar, "<this>");
        p.h(wVar, "event");
        List<n1.e> d10 = wVar.d();
        int size = d10.size();
        for (int i10 = 0; i10 < size; i10++) {
            n1.e eVar = d10.get(i10);
            gVar.a(eVar.b(), eVar.a());
        }
        gVar.a(wVar.l(), wVar.f());
    }

    public static final float c(float f10) {
        return Math.signum(f10) * ((float) Math.sqrt(2 * Math.abs(f10)));
    }

    public static final d d(List<Float> list, List<Float> list2, int i10) {
        float f10;
        p.h(list, "x");
        p.h(list2, "y");
        if (i10 >= 1) {
            if (list.size() == list2.size()) {
                if (!list.isEmpty()) {
                    int size = i10 >= list.size() ? list.size() - 1 : i10;
                    int i11 = i10 + 1;
                    ArrayList arrayList = new ArrayList(i11);
                    int i12 = 0;
                    while (true) {
                        f10 = 0.0f;
                        if (i12 >= i11) {
                            break;
                        }
                        arrayList.add(Float.valueOf(0.0f));
                        i12++;
                    }
                    int size2 = list.size();
                    int i13 = size + 1;
                    b bVar = new b(i13, size2);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size2) {
                            break;
                        }
                        bVar.c(0, i14, 1.0f);
                        for (int i15 = 1; i15 < i13; i15++) {
                            bVar.c(i15, i14, bVar.a(i15 - 1, i14) * list.get(i14).floatValue());
                        }
                        i14++;
                    }
                    b bVar2 = new b(i13, size2);
                    b bVar3 = new b(i13, i13);
                    int i16 = 0;
                    while (i16 < i13) {
                        for (int i17 = 0; i17 < size2; i17++) {
                            bVar2.c(i16, i17, bVar.a(i16, i17));
                        }
                        for (int i18 = 0; i18 < i16; i18++) {
                            float d10 = bVar2.b(i16).d(bVar2.b(i18));
                            for (int i19 = 0; i19 < size2; i19++) {
                                bVar2.c(i16, i19, bVar2.a(i16, i19) - (bVar2.a(i18, i19) * d10));
                            }
                        }
                        float b10 = bVar2.b(i16).b();
                        if (b10 < 1.0E-6d) {
                            throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                        }
                        float f11 = 1.0f / b10;
                        for (int i20 = 0; i20 < size2; i20++) {
                            bVar2.c(i16, i20, bVar2.a(i16, i20) * f11);
                        }
                        int i21 = 0;
                        while (i21 < i13) {
                            bVar3.c(i16, i21, i21 < i16 ? 0.0f : bVar2.b(i16).d(bVar.b(i21)));
                            i21++;
                        }
                        i16++;
                    }
                    e eVar = new e(size2);
                    for (int i22 = 0; i22 < size2; i22++) {
                        eVar.c(i22, list2.get(i22).floatValue() * 1.0f);
                    }
                    int i23 = i13 - 1;
                    for (int i24 = i23; -1 < i24; i24--) {
                        arrayList.set(i24, Float.valueOf(bVar2.b(i24).d(eVar)));
                        int i25 = i24 + 1;
                        if (i25 <= i23) {
                            int i26 = i23;
                            while (true) {
                                arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() - (bVar3.a(i24, i26) * ((Number) arrayList.get(i26)).floatValue())));
                                if (i26 != i25) {
                                    i26--;
                                }
                            }
                        }
                        arrayList.set(i24, Float.valueOf(((Number) arrayList.get(i24)).floatValue() / bVar3.a(i24, i24)));
                    }
                    float f12 = 0.0f;
                    for (int i27 = 0; i27 < size2; i27++) {
                        f12 += list2.get(i27).floatValue();
                    }
                    float f13 = f12 / size2;
                    float f14 = 0.0f;
                    for (int i28 = 0; i28 < size2; i28++) {
                        float floatValue = list2.get(i28).floatValue() - ((Number) arrayList.get(0)).floatValue();
                        float f15 = 1.0f;
                        for (int i29 = 1; i29 < i13; i29++) {
                            f15 *= list.get(i28).floatValue();
                            floatValue -= ((Number) arrayList.get(i29)).floatValue() * f15;
                        }
                        f14 += floatValue * 1.0f * floatValue;
                        float floatValue2 = list2.get(i28).floatValue() - f13;
                        f10 += floatValue2 * 1.0f * floatValue2;
                    }
                    return new d(arrayList, f10 > 1.0E-6f ? 1.0f - (f14 / f10) : 1.0f);
                }
                throw new IllegalArgumentException("At least one point must be provided");
            }
            throw new IllegalArgumentException("x and y must be the same length");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }
}
