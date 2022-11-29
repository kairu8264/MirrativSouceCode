package y0;

import io.l;
import java.util.LinkedHashMap;
import java.util.Map;
import jo.p;
import wn.v;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, h> f61044a = new LinkedHashMap();

    public final Map<Integer, h> a() {
        return this.f61044a;
    }

    public final v b(int i10, String str) {
        l<String, v> c10;
        p.h(str, "value");
        h hVar = this.f61044a.get(Integer.valueOf(i10));
        if (hVar == null || (c10 = hVar.c()) == null) {
            return null;
        }
        c10.invoke(str);
        return v.f59242a;
    }
}
