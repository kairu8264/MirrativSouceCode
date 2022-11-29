package ai;

import com.google.android.gms.internal.ads.zzfaw;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l32 implements ty1<ya0, n02> {

    /* renamed from: a  reason: collision with root package name */
    public final q42 f6474a;

    public l32(q42 q42Var) {
        this.f6474a = q42Var;
    }

    @Override // ai.ty1
    public final uy1<ya0, n02> a(String str, JSONObject jSONObject) throws zzfaw {
        ya0 b10 = this.f6474a.b(str);
        if (b10 == null) {
            return null;
        }
        return new uy1<>(b10, new n02(), str);
    }
}
