package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class j83 extends a63<ib3> {
    public j83() {
        super(ib3.class, new g83(p53.class));
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ ib3 c(oh3 oh3Var) throws zzggm {
        return ib3.D(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(ib3 ib3Var) throws GeneralSecurityException {
        ib3 ib3Var2 = ib3Var;
        kg3.b(ib3Var2.B(), 0);
        if (ib3Var2.C().p() == 64) {
            return;
        }
        int p10 = ib3Var2.C().p();
        StringBuilder sb2 = new StringBuilder(61);
        sb2.append("invalid key size: ");
        sb2.append(p10);
        sb2.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb2.toString());
    }

    @Override // ai.a63
    public final y53<?, ib3> h() {
        return new h83(this, mb3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }
}
