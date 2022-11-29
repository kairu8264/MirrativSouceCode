package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z83 implements if3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12911a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12912b;

    /* renamed from: c  reason: collision with root package name */
    public wa3 f12913c;

    /* renamed from: d  reason: collision with root package name */
    public y93 f12914d;

    /* renamed from: e  reason: collision with root package name */
    public int f12915e;

    /* renamed from: f  reason: collision with root package name */
    public ib3 f12916f;

    public z83(hd3 hd3Var) throws GeneralSecurityException {
        String B = hd3Var.B();
        this.f12911a = B;
        if (B.equals(v63.f10988b)) {
            try {
                za3 C = za3.C(hd3Var.C(), di3.a());
                this.f12913c = (wa3) t63.h(hd3Var);
                this.f12912b = C.B();
            } catch (zzggm e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (B.equals(v63.f10987a)) {
            try {
                ba3 D = ba3.D(hd3Var.C(), di3.a());
                this.f12914d = (y93) t63.h(hd3Var);
                this.f12915e = D.B().C();
                this.f12912b = this.f12915e + D.C().C();
            } catch (zzggm e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (B.equals(k83.f6124a)) {
            try {
                mb3 C2 = mb3.C(hd3Var.C(), di3.a());
                this.f12916f = (ib3) t63.h(hd3Var);
                this.f12912b = C2.B();
            } catch (zzggm e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            String valueOf = String.valueOf(B);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // ai.if3
    public final a93 a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == this.f12912b) {
            if (this.f12911a.equals(v63.f10988b)) {
                va3 E = wa3.E();
                E.o(this.f12913c);
                E.s(oh3.M(bArr, 0, this.f12912b));
                return new a93((m53) t63.i(this.f12911a, E.n(), m53.class));
            } else if (this.f12911a.equals(v63.f10987a)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f12915e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f12915e, this.f12912b);
                da3 F = ea3.F();
                F.o(this.f12914d.C());
                F.t(oh3.N(copyOfRange));
                uc3 F2 = vc3.F();
                F2.o(this.f12914d.D());
                F2.t(oh3.N(copyOfRange2));
                x93 F3 = y93.F();
                F3.r(this.f12914d.B());
                F3.s(F.n());
                F3.t(F2.n());
                return new a93((m53) t63.i(this.f12911a, F3.n(), m53.class));
            } else if (this.f12911a.equals(k83.f6124a)) {
                hb3 E2 = ib3.E();
                E2.o(this.f12916f);
                E2.s(oh3.M(bArr, 0, this.f12912b));
                return new a93((p53) t63.i(this.f12911a, E2.n(), p53.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // ai.if3
    public final int zza() {
        return this.f12912b;
    }
}
