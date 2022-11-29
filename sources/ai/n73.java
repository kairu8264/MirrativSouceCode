package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n73 extends y53<fb3, cb3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o73 f7231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n73(o73 o73Var, Class cls) {
        super(cls);
        this.f7231b = o73Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(fb3 fb3Var) throws GeneralSecurityException {
        kg3.a(fb3Var.B());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ fb3 c(oh3 oh3Var) throws zzggm {
        return fb3.C(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ cb3 d(fb3 fb3Var) throws GeneralSecurityException {
        bb3 E = cb3.E();
        E.s(oh3.N(ig3.a(fb3Var.B())));
        E.r(0);
        return E.n();
    }

    @Override // ai.y53
    public final Map<String, x53<fb3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", o73.l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", o73.l(16, 3));
        hashMap.put("AES256_GCM_SIV", o73.l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", o73.l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
