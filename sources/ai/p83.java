package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class p83 extends n63<gc3, jc3> {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f8354d = new byte[0];

    public p83() {
        super(gc3.class, jc3.class, new n83(q53.class));
    }

    public static /* synthetic */ x53<ac3> l(int i10, int i11, int i12, v53 v53Var, byte[] bArr, int i13) {
        zb3 D = ac3.D();
        nc3 C = oc3.C();
        int i14 = 4;
        C.s(4);
        C.t(5);
        C.r(oh3.N(bArr));
        oc3 n10 = C.n();
        gd3 D2 = hd3.D();
        D2.r(v53Var.a());
        D2.s(oh3.N(v53Var.b()));
        int d10 = v53Var.d() - 1;
        if (d10 == 0) {
            i14 = 3;
        } else if (d10 != 1) {
            i14 = d10 != 2 ? 6 : 5;
        }
        D2.t(i14);
        wb3 C2 = xb3.C();
        C2.r(D2.n());
        cc3 D3 = dc3.D();
        D3.r(n10);
        D3.s(C2.n());
        D3.t(i12);
        D.r(D3.n());
        return new x53<>(D.n(), i13);
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ xj3 c(oh3 oh3Var) throws zzggm {
        return gc3.E(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(xj3 xj3Var) throws GeneralSecurityException {
        gc3 gc3Var = (gc3) xj3Var;
        if (!gc3Var.D().L()) {
            kg3.b(gc3Var.B(), 0);
            y83.a(gc3Var.C().C());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // ai.a63
    public final y53<ac3, gc3> h() {
        return new o83(this, ac3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 4;
    }
}
