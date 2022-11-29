package ai;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qs2 implements ns2 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f9185a = new int[2];

    @Override // ai.ns2
    public final JSONObject a(View view) {
        if (view == null) {
            return vs2.b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f9185a);
        int[] iArr = this.f9185a;
        return vs2.b(iArr[0], iArr[1], width, height);
    }

    @Override // ai.ns2
    public final void b(View view, JSONObject jSONObject, ls2 ls2Var, boolean z10) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z10 && Build.VERSION.SDK_INT >= 21) {
                HashMap hashMap = new HashMap();
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i12));
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        i10 = i12 + 1;
                        if (i13 < size2) {
                            ls2Var.a((View) arrayList3.get(i13), this, jSONObject);
                            i13++;
                        }
                    }
                    i12 = i10;
                }
                return;
            }
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                ls2Var.a(viewGroup.getChildAt(i14), this, jSONObject);
            }
        }
    }
}
