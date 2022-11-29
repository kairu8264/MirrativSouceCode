package de;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jo.i0;
import jo.p;
import xn.z;

/* loaded from: classes2.dex */
public final class g {
    public static final List<Integer> a(int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 > 0) {
            while (i10 > 0) {
                arrayList.add(Integer.valueOf(i10 % 10));
                i10 /= 10;
            }
        } else {
            arrayList.add(Integer.valueOf(i10));
        }
        z.K(arrayList);
        return arrayList;
    }

    public static final String b(int i10, boolean z10) {
        i0 i0Var = i0.f38149a;
        String format = String.format(z10 ? "%,dpt" : "%dpt", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        p.g(format, "format(format, *args)");
        return format;
    }

    public static /* synthetic */ String c(int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        return b(i10, z10);
    }

    public static final String d(int i10) {
        i0 i0Var = i0.f38149a;
        String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i10 / 60), Integer.valueOf(i10 % 60)}, 2));
        p.g(format, "format(format, *args)");
        return format;
    }
}
