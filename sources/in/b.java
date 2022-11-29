package in;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class b implements xm.p<a>, xm.j<a> {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, Class<? extends a>> f36903b;

    /* renamed from: a  reason: collision with root package name */
    public final xm.e f36904a = new xm.e();

    static {
        HashMap hashMap = new HashMap();
        f36903b = hashMap;
        hashMap.put("oauth1a", r.class);
        hashMap.put("oauth2", com.twitter.sdk.android.core.internal.oauth.f.class);
        hashMap.put("guest", com.twitter.sdk.android.core.internal.oauth.a.class);
    }

    public static String d(Class<? extends a> cls) {
        for (Map.Entry<String, Class<? extends a>> entry : f36903b.entrySet()) {
            if (entry.getValue().equals(cls)) {
                return entry.getKey();
            }
        }
        return "";
    }

    @Override // xm.j
    /* renamed from: c */
    public a b(xm.k kVar, Type type, xm.i iVar) throws JsonParseException {
        xm.m f10 = kVar.f();
        String j10 = f10.w("auth_type").j();
        return (a) this.f36904a.k(f10.u("auth_token"), f36903b.get(j10));
    }

    @Override // xm.p
    /* renamed from: e */
    public xm.k a(a aVar, Type type, xm.o oVar) {
        xm.m mVar = new xm.m();
        mVar.s("auth_type", d(aVar.getClass()));
        mVar.r("auth_token", this.f36904a.z(aVar));
        return mVar;
    }
}
