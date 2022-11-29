package hi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes3.dex */
public class s7 extends r7 {
    public final byte[] A;

    public s7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.A = bArr;
    }

    @Override // hi.u7
    public byte d(int i10) {
        return this.A[i10];
    }

    @Override // hi.u7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u7) && g() == ((u7) obj).g()) {
            if (g() == 0) {
                return true;
            }
            if (obj instanceof s7) {
                s7 s7Var = (s7) obj;
                int s10 = s();
                int s11 = s7Var.s();
                if (s10 == 0 || s11 == 0 || s10 == s11) {
                    int g10 = g();
                    if (g10 <= s7Var.g()) {
                        if (g10 <= s7Var.g()) {
                            byte[] bArr = this.A;
                            byte[] bArr2 = s7Var.A;
                            s7Var.x();
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < g10) {
                                if (bArr[i10] != bArr2[i11]) {
                                    return false;
                                }
                                i10++;
                                i11++;
                            }
                            return true;
                        }
                        int g11 = s7Var.g();
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Ran off end of other: 0, ");
                        sb2.append(g10);
                        sb2.append(", ");
                        sb2.append(g11);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    int g12 = g();
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Length too large: ");
                    sb3.append(g10);
                    sb3.append(g12);
                    throw new IllegalArgumentException(sb3.toString());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // hi.u7
    public byte f(int i10) {
        return this.A[i10];
    }

    @Override // hi.u7
    public int g() {
        return this.A.length;
    }

    @Override // hi.u7
    public final int j(int i10, int i11, int i12) {
        return b9.d(i10, this.A, 0, i12);
    }

    @Override // hi.u7
    public final u7 k(int i10, int i11) {
        int r10 = u7.r(0, i11, g());
        return r10 == 0 ? u7.f36014x : new p7(this.A, 0, r10);
    }

    @Override // hi.u7
    public final String l(Charset charset) {
        return new String(this.A, 0, g(), charset);
    }

    @Override // hi.u7
    public final void m(k7 k7Var) throws IOException {
        ((a8) k7Var).E(this.A, 0, g());
    }

    @Override // hi.u7
    public final boolean p() {
        return kb.f(this.A, 0, g());
    }

    public int x() {
        return 0;
    }
}
