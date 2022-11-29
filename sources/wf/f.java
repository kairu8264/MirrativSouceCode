package wf;

import ah.v;
import android.view.View;
import java.util.Map;
import tg.l;
import tg.n;

/* loaded from: classes3.dex */
public final class f extends v {

    /* renamed from: s  reason: collision with root package name */
    public final tg.h f58684s;

    public f(tg.h hVar) {
        this.f58684s = hVar;
        w(hVar.d());
        y(hVar.f());
        u(hVar.b());
        x(hVar.e());
        v(hVar.c());
        t(hVar.a());
        C(hVar.h());
        D(hVar.i());
        B(hVar.g());
        H(hVar.k());
        A(true);
        z(true);
        G(hVar.j());
    }

    @Override // ah.v
    public final void E(View view, Map<String, View> map, Map<String, View> map2) {
        if (!(view instanceof n)) {
            if (l.f53640a.get(view) != null) {
                throw null;
            }
            return;
        }
        n nVar = (n) view;
        throw null;
    }
}
