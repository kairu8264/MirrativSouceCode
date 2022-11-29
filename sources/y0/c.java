package y0;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import c1.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jo.p;

/* loaded from: classes.dex */
public final class c {
    public static final void a(a aVar, SparseArray<AutofillValue> sparseArray) {
        p.h(aVar, "<this>");
        p.h(sparseArray, "values");
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            f fVar = f.f61037a;
            p.g(autofillValue, "value");
            if (fVar.d(autofillValue)) {
                aVar.b().b(keyAt, fVar.i(autofillValue).toString());
            } else if (!fVar.b(autofillValue)) {
                if (!fVar.c(autofillValue)) {
                    if (fVar.e(autofillValue)) {
                        throw new wn.j("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                } else {
                    throw new wn.j("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
            } else {
                throw new wn.j("An operation is not implemented: b/138604541: Add onFill() callback for date");
            }
        }
    }

    public static final void b(a aVar, ViewStructure viewStructure) {
        Rect a10;
        p.h(aVar, "<this>");
        p.h(viewStructure, "root");
        int a11 = e.f61036a.a(viewStructure, aVar.b().a().size());
        for (Map.Entry<Integer, h> entry : aVar.b().a().entrySet()) {
            int intValue = entry.getKey().intValue();
            h value = entry.getValue();
            e eVar = e.f61036a;
            ViewStructure b10 = eVar.b(viewStructure, a11);
            if (b10 != null) {
                f fVar = f.f61037a;
                AutofillId a12 = fVar.a(viewStructure);
                p.e(a12);
                fVar.g(b10, a12, intValue);
                eVar.d(b10, intValue, aVar.c().getContext().getPackageName(), null, null);
                fVar.h(b10, 1);
                List<j> a13 = value.a();
                ArrayList arrayList = new ArrayList(a13.size());
                int size = a13.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(b.a(a13.get(i10)));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                fVar.f(b10, (String[]) array);
                if (value.b() == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                b1.h b11 = value.b();
                if (b11 != null && (a10 = z0.a(b11)) != null) {
                    e.f61036a.c(b10, a10.left, a10.top, 0, 0, a10.width(), a10.height());
                }
            }
            a11++;
        }
    }
}
