package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g73 extends y53<qa3, na3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i73 f4360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g73(i73 i73Var, Class cls) {
        super(cls);
        this.f4360b = i73Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(qa3 qa3Var) throws GeneralSecurityException {
        qa3 qa3Var2 = qa3Var;
        kg3.a(qa3Var2.C());
        if (qa3Var2.B().B() != 12 && qa3Var2.B().B() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ qa3 c(oh3 oh3Var) throws zzggm {
        return qa3.D(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ na3 d(qa3 qa3Var) throws GeneralSecurityException {
        qa3 qa3Var2 = qa3Var;
        ma3 F = na3.F();
        F.t(oh3.N(ig3.a(qa3Var2.C())));
        F.s(qa3Var2.B());
        F.r(0);
        return F.n();
    }

    @Override // ai.y53
    public final Map<String, x53<qa3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", i73.k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", i73.k(16, 16, 3));
        hashMap.put("AES256_EAX", i73.k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", i73.k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
