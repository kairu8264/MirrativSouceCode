package yg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f61900a;

    /* renamed from: b  reason: collision with root package name */
    public final double[] f61901b;

    /* renamed from: c  reason: collision with root package name */
    public final double[] f61902c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f61903d;

    /* renamed from: e  reason: collision with root package name */
    public int f61904e;

    public /* synthetic */ j0(h0 h0Var, i0 i0Var) {
        List list;
        List list2;
        List list3;
        List list4;
        list = h0Var.f61892b;
        int size = list.size();
        list2 = h0Var.f61891a;
        this.f61900a = (String[]) list2.toArray(new String[size]);
        list3 = h0Var.f61892b;
        this.f61901b = c(list3);
        list4 = h0Var.f61893c;
        this.f61902c = c(list4);
        this.f61903d = new int[size];
        this.f61904e = 0;
    }

    public static final double[] c(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = list.get(i10).doubleValue();
        }
        return dArr;
    }

    public final void a(double d10) {
        this.f61904e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f61902c;
            if (i10 >= dArr.length) {
                return;
            }
            double d11 = dArr[i10];
            if (d11 <= d10 && d10 < this.f61901b[i10]) {
                int[] iArr = this.f61903d;
                iArr[i10] = iArr[i10] + 1;
            }
            if (d10 < d11) {
                return;
            }
            i10++;
        }
    }

    public final List<g0> b() {
        ArrayList arrayList = new ArrayList(this.f61900a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f61900a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double d10 = this.f61902c[i10];
            double d11 = this.f61901b[i10];
            int i11 = this.f61903d[i10];
            arrayList.add(new g0(str, d10, d11, i11 / this.f61904e, i11));
            i10++;
        }
    }
}
