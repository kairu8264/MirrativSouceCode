package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k73 extends y53<za3, wa3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l73 f6117b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k73(l73 l73Var, Class cls) {
        super(cls);
        this.f6117b = l73Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(za3 za3Var) throws GeneralSecurityException {
        kg3.a(za3Var.B());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ za3 c(oh3 oh3Var) throws zzggm {
        return za3.C(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ wa3 d(za3 za3Var) throws GeneralSecurityException {
        va3 E = wa3.E();
        E.s(oh3.N(ig3.a(za3Var.B())));
        E.r(0);
        return E.n();
    }

    @Override // ai.y53
    public final Map<String, x53<za3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", l73.k(16, 1));
        hashMap.put("AES128_GCM_RAW", l73.k(16, 3));
        hashMap.put("AES256_GCM", l73.k(32, 1));
        hashMap.put("AES256_GCM_RAW", l73.k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
