package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class g93 extends a63<vc3> {
    public g93() {
        super(vc3.class, new e93(e63.class));
    }

    public static final void l(vc3 vc3Var) throws GeneralSecurityException {
        kg3.b(vc3Var.B(), 0);
        if (vc3Var.D().p() >= 16) {
            n(vc3Var.C());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static /* synthetic */ x53<yc3> m(int i10, int i11, int i12, int i13) {
        xc3 E = yc3.E();
        ad3 C = bd3.C();
        C.s(i12);
        C.r(i11);
        E.r(C.n());
        E.s(i10);
        return new x53<>(E.n(), i13);
    }

    public static void n(bd3 bd3Var) throws GeneralSecurityException {
        if (bd3Var.B() >= 10) {
            int G = bd3Var.G() - 2;
            if (G == 1) {
                if (bd3Var.B() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (G == 2) {
                if (bd3Var.B() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (G == 3) {
                if (bd3Var.B() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (G == 4) {
                if (bd3Var.B() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (G == 5) {
                if (bd3Var.B() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ vc3 c(oh3 oh3Var) throws zzggm {
        return vc3.E(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(vc3 vc3Var) throws GeneralSecurityException {
        l(vc3Var);
    }

    @Override // ai.a63
    public final y53<?, vc3> h() {
        return new f93(this, yc3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }

    @Override // ai.a63
    public final int j() {
        return 2;
    }
}
