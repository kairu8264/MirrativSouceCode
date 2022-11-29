package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class x73 extends y53<he3, ee3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y73 f11882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x73(y73 y73Var, Class cls) {
        super(cls);
        this.f11882b = y73Var;
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ void b(he3 he3Var) throws GeneralSecurityException {
        he3 he3Var2 = he3Var;
        if (he3Var2.B().isEmpty() || !he3Var2.C()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ he3 c(oh3 oh3Var) throws zzggm {
        return he3.E(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ ee3 d(he3 he3Var) throws GeneralSecurityException {
        de3 E = ee3.E();
        E.s(he3Var);
        E.r(0);
        return E.n();
    }
}
