package nn;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import xm.j;
import xm.k;
import xm.m;
import xm.o;
import xm.p;

/* loaded from: classes4.dex */
public class d implements p<c>, j<c> {
    @Override // xm.j
    /* renamed from: c */
    public c b(k kVar, Type type, xm.i iVar) throws JsonParseException {
        if (!kVar.m()) {
            return new c();
        }
        Set<Map.Entry<String, k>> t10 = kVar.f().t();
        HashMap hashMap = new HashMap(32);
        for (Map.Entry<String, k> entry : t10) {
            hashMap.put(entry.getKey(), d(entry.getValue().f(), iVar));
        }
        return new c(hashMap);
    }

    public Object d(m mVar, xm.i iVar) {
        k u10 = mVar.u("type");
        if (u10 == null || !u10.p()) {
            return null;
        }
        String j10 = u10.j();
        j10.hashCode();
        char c10 = 65535;
        switch (j10.hashCode()) {
            case -1838656495:
                if (j10.equals("STRING")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2614219:
                if (j10.equals("USER")) {
                    c10 = 1;
                    break;
                }
                break;
            case 69775675:
                if (j10.equals("IMAGE")) {
                    c10 = 2;
                    break;
                }
                break;
            case 782694408:
                if (j10.equals("BOOLEAN")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return iVar.a(mVar.u("string_value"), String.class);
            case 1:
                return iVar.a(mVar.u("user_value"), i.class);
            case 2:
                return iVar.a(mVar.u("image_value"), e.class);
            case 3:
                return iVar.a(mVar.u("boolean_value"), Boolean.class);
            default:
                return null;
        }
    }

    @Override // xm.p
    /* renamed from: e */
    public k a(c cVar, Type type, o oVar) {
        return null;
    }
}
