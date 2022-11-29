package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q73 extends y53<sb3, pb3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r73 f8846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q73(r73 r73Var, Class cls) {
        super(cls);
        this.f8846b = r73Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(sb3 sb3Var) throws GeneralSecurityException {
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ sb3 c(oh3 oh3Var) throws zzggm {
        return sb3.B(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ pb3 d(sb3 sb3Var) throws GeneralSecurityException {
        ob3 E = pb3.E();
        E.r(0);
        E.s(oh3.N(ig3.a(32)));
        return E.n();
    }

    @Override // ai.y53
    public final Map<String, x53<sb3>> e() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new x53(sb3.C(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new x53(sb3.C(), 3));
        return Collections.unmodifiableMap(hashMap);
    }
}
