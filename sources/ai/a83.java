package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a83 extends y53<te3, qe3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b83 f1785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a83(b83 b83Var, Class cls) {
        super(cls);
        this.f1785b = b83Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(te3 te3Var) throws GeneralSecurityException {
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ te3 c(oh3 oh3Var) throws zzggm {
        return te3.B(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ qe3 d(te3 te3Var) throws GeneralSecurityException {
        pe3 E = qe3.E();
        E.r(0);
        E.s(oh3.N(ig3.a(32)));
        return E.n();
    }

    @Override // ai.y53
    public final Map<String, x53<te3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new x53(te3.C(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new x53(te3.C(), 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
