package ai;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ps2 implements ns2 {

    /* renamed from: a  reason: collision with root package name */
    public final ns2 f8555a;

    public ps2(ns2 ns2Var) {
        this.f8555a = ns2Var;
    }

    @Override // ai.ns2
    public final JSONObject a(View view) {
        throw null;
    }

    @Override // ai.ns2
    public final void b(View view, JSONObject jSONObject, ls2 ls2Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ds2 a10 = ds2.a();
        if (a10 != null) {
            Collection<sr2> f10 = a10.f();
            int size = f10.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (sr2 sr2Var : f10) {
                View i10 = sr2Var.i();
                if (i10 != null && (Build.VERSION.SDK_INT < 19 || i10.isAttachedToWindow())) {
                    if (i10.isShown()) {
                        View view2 = i10;
                        while (true) {
                            if (view2 != null) {
                                if (view2.getAlpha() != 0.0f) {
                                    ViewParent parent = view2.getParent();
                                    view2 = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                View rootView = i10.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float a11 = ys2.a(rootView);
                                    int size2 = arrayList.size();
                                    while (size2 > 0) {
                                        int i11 = size2 - 1;
                                        if (ys2.a((View) arrayList.get(i11)) <= a11) {
                                            break;
                                        }
                                        size2 = i11;
                                    }
                                    arrayList.add(size2, rootView);
                                }
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            ls2Var.a((View) arrayList.get(i12), this.f8555a, jSONObject);
        }
    }
}
