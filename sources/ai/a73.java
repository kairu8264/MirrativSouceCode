package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a73 extends y53<ba3, y93> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b73 f1776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a73(b73 b73Var, Class cls) {
        super(cls);
        this.f1776b = b73Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(ba3 ba3Var) throws GeneralSecurityException {
        ba3 ba3Var2 = ba3Var;
        ((d73) new e73().h()).b(ba3Var2.B());
        new g93().h().b(ba3Var2.C());
        kg3.a(ba3Var2.B().C());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ ba3 c(oh3 oh3Var) throws zzggm {
        return ba3.D(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ y93 d(ba3 ba3Var) throws GeneralSecurityException {
        ba3 ba3Var2 = ba3Var;
        new e73();
        ea3 g10 = d73.g(ba3Var2.B());
        vc3 d10 = new g93().h().d(ba3Var2.C());
        x93 F = y93.F();
        F.s(g10);
        F.t(d10);
        F.r(0);
        return F.n();
    }

    @Override // ai.y53
    public final Map<String, x53<ba3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", b73.k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", b73.k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", b73.k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", b73.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
