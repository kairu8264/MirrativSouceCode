package ai;

import com.google.android.gms.internal.ads.zzfaw;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f12 implements ty1<pm2, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final mn1 f3878a;

    public f12(mn1 mn1Var) {
        this.f3878a = mn1Var;
    }

    @Override // ai.ty1
    public final uy1<pm2, n02> a(String str, JSONObject jSONObject) throws zzfaw {
        return new uy1<>(this.f3878a.b(str, jSONObject), new n02(), str);
    }
}
