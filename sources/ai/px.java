package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class px {
    public static List<String> a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, ry.d("gad:dynamite_module:experiment_id", ""));
        c(arrayList, az.f2160a);
        c(arrayList, az.f2161b);
        c(arrayList, az.f2162c);
        c(arrayList, az.f2163d);
        c(arrayList, az.f2164e);
        c(arrayList, az.f2170k);
        c(arrayList, az.f2165f);
        c(arrayList, az.f2166g);
        c(arrayList, az.f2167h);
        c(arrayList, az.f2168i);
        c(arrayList, az.f2169j);
        return arrayList;
    }

    public static List<String> b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, mz.f7115a);
        return arrayList;
    }

    public static void c(List<String> list, ry<String> ryVar) {
        String e10 = ryVar.e();
        if (TextUtils.isEmpty(e10)) {
            return;
        }
        list.add(e10);
    }
}
