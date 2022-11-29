package pi;

import hi.vc;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s4 implements vc {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f48213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t4 f48214b;

    public s4(t4 t4Var, String str) {
        this.f48214b = t4Var;
        this.f48213a = str;
    }

    @Override // hi.vc
    public final String v(String str) {
        Map map;
        map = this.f48214b.f48225d;
        Map map2 = (Map) map.get(this.f48213a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
