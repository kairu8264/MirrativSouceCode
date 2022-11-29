package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c93 extends y53<s93, p93> {
    public c93(d93 d93Var, Class cls) {
        super(cls);
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(s93 s93Var) throws GeneralSecurityException {
        s93 s93Var2 = s93Var;
        d93.m(s93Var2.C());
        d93.n(s93Var2.B());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ s93 c(oh3 oh3Var) throws zzggm {
        return s93.D(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ p93 d(s93 s93Var) throws GeneralSecurityException {
        s93 s93Var2 = s93Var;
        o93 F = p93.F();
        F.r(0);
        F.s(oh3.N(ig3.a(s93Var2.B())));
        F.t(s93Var2.C());
        return F.n();
    }

    @Override // ai.y53
    public final Map<String, x53<s93>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        r93 E = s93.E();
        E.r(32);
        u93 C = v93.C();
        C.r(16);
        E.s(C.n());
        hashMap.put("AES_CMAC", new x53(E.n(), 1));
        r93 E2 = s93.E();
        E2.r(32);
        u93 C2 = v93.C();
        C2.r(16);
        E2.s(C2.n());
        hashMap.put("AES256_CMAC", new x53(E2.n(), 1));
        r93 E3 = s93.E();
        E3.r(32);
        u93 C3 = v93.C();
        C3.r(16);
        E3.s(C3.n());
        hashMap.put("AES256_CMAC_RAW", new x53(E3.n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
