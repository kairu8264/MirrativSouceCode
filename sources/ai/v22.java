package ai;

import com.google.android.gms.internal.ads.zzfaw;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v22 implements ty1<pm2, o02> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, uy1<pm2, o02>> f10937a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final mn1 f10938b;

    public v22(mn1 mn1Var) {
        this.f10938b = mn1Var;
    }

    @Override // ai.ty1
    public final uy1<pm2, o02> a(String str, JSONObject jSONObject) throws zzfaw {
        uy1<pm2, o02> uy1Var;
        synchronized (this) {
            uy1Var = this.f10937a.get(str);
            if (uy1Var == null) {
                uy1Var = new uy1<>(this.f10938b.b(str, jSONObject), new o02(), str);
                this.f10937a.put(str, uy1Var);
            }
        }
        return uy1Var;
    }
}
