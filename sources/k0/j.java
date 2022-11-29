package k0;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, l> f38331a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<l, a> f38332b = new LinkedHashMap();

    public final a a(l lVar) {
        jo.p.h(lVar, "rippleHostView");
        return this.f38332b.get(lVar);
    }

    public final l b(a aVar) {
        jo.p.h(aVar, "indicationInstance");
        return this.f38331a.get(aVar);
    }

    public final void c(a aVar) {
        jo.p.h(aVar, "indicationInstance");
        l lVar = this.f38331a.get(aVar);
        if (lVar != null) {
            this.f38332b.remove(lVar);
        }
        this.f38331a.remove(aVar);
    }

    public final void d(a aVar, l lVar) {
        jo.p.h(aVar, "indicationInstance");
        jo.p.h(lVar, "rippleHostView");
        this.f38331a.put(aVar, lVar);
        this.f38332b.put(lVar, aVar);
    }
}
