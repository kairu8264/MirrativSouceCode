package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h83 extends y53<mb3, ib3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j83 f4781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h83(j83 j83Var, Class cls) {
        super(cls);
        this.f4781b = j83Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(mb3 mb3Var) throws GeneralSecurityException {
        mb3 mb3Var2 = mb3Var;
        if (mb3Var2.B() == 64) {
            return;
        }
        int B = mb3Var2.B();
        StringBuilder sb2 = new StringBuilder(61);
        sb2.append("invalid key size: ");
        sb2.append(B);
        sb2.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb2.toString());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ mb3 c(oh3 oh3Var) throws zzggm {
        return mb3.C(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ ib3 d(mb3 mb3Var) throws GeneralSecurityException {
        hb3 E = ib3.E();
        E.s(oh3.N(ig3.a(mb3Var.B())));
        E.r(0);
        return E.n();
    }

    @Override // ai.y53
    public final Map<String, x53<mb3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        lb3 D = mb3.D();
        D.r(64);
        hashMap.put("AES256_SIV", new x53(D.n(), 1));
        lb3 D2 = mb3.D();
        D2.r(64);
        hashMap.put("AES256_SIV_RAW", new x53(D2.n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
