package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f93 extends y53<yc3, vc3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g93 f3974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f93(g93 g93Var, Class cls) {
        super(cls);
        this.f3974b = g93Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(yc3 yc3Var) throws GeneralSecurityException {
        yc3 yc3Var2 = yc3Var;
        if (yc3Var2.C() >= 16) {
            g93.n(yc3Var2.B());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ yc3 c(oh3 oh3Var) throws zzggm {
        return yc3.D(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ vc3 d(yc3 yc3Var) throws GeneralSecurityException {
        yc3 yc3Var2 = yc3Var;
        uc3 F = vc3.F();
        F.r(0);
        F.s(yc3Var2.B());
        F.t(oh3.N(ig3.a(yc3Var2.C())));
        return F.n();
    }

    @Override // ai.y53
    public final Map<String, x53<yc3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", g93.m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", g93.m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", g93.m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", g93.m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", g93.m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", g93.m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", g93.m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", g93.m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", g93.m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", g93.m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
