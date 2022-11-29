package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class i73 extends a63<na3> {
    public i73() {
        super(na3.class, new f73(m53.class));
    }

    public static /* synthetic */ x53<qa3> k(int i10, int i11, int i12) {
        pa3 E = qa3.E();
        E.s(i10);
        sa3 C = ta3.C();
        C.r(16);
        E.r(C.n());
        return new x53<>(E.n(), i12);
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ na3 c(oh3 oh3Var) throws zzggm {
        return na3.E(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(na3 na3Var) throws GeneralSecurityException {
        na3 na3Var2 = na3Var;
        kg3.b(na3Var2.B(), 0);
        kg3.a(na3Var2.D().p());
        if (na3Var2.C().B() != 12 && na3Var2.C().B() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // ai.a63
    public final y53<?, na3> h() {
        return new g73(this, qa3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }
}
