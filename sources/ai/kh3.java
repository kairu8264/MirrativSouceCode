package ai;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes3.dex */
public class kh3 extends jh3 {
    public final byte[] A;

    public kh3(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.A = bArr;
    }

    @Override // ai.oh3
    public final String A(Charset charset) {
        return new String(this.A, W(), p(), charset);
    }

    @Override // ai.oh3
    public final boolean B() {
        int W = W();
        return sl3.b(this.A, W, p() + W);
    }

    @Override // ai.oh3
    public final int D(int i10, int i11, int i12) {
        int W = W() + i11;
        return sl3.c(i10, this.A, W, i12 + W);
    }

    @Override // ai.oh3
    public final int H(int i10, int i11, int i12) {
        return bj3.h(i10, this.A, W() + i11, i12);
    }

    @Override // ai.oh3
    public final uh3 J() {
        return uh3.d(this.A, W(), p(), true);
    }

    @Override // ai.jh3
    public final boolean V(oh3 oh3Var, int i10, int i11) {
        if (i11 <= oh3Var.p()) {
            int i12 = i10 + i11;
            if (i12 <= oh3Var.p()) {
                if (oh3Var instanceof kh3) {
                    kh3 kh3Var = (kh3) oh3Var;
                    byte[] bArr = this.A;
                    byte[] bArr2 = kh3Var.A;
                    int W = W() + i11;
                    int W2 = W();
                    int W3 = kh3Var.W() + i10;
                    while (W2 < W) {
                        if (bArr[W2] != bArr2[W3]) {
                            return false;
                        }
                        W2++;
                        W3++;
                    }
                    return true;
                }
                return oh3Var.w(i10, i12).equals(w(0, i11));
            }
            int p10 = oh3Var.p();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(p10);
            throw new IllegalArgumentException(sb2.toString());
        }
        int p11 = p();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i11);
        sb3.append(p11);
        throw new IllegalArgumentException(sb3.toString());
    }

    public int W() {
        return 0;
    }

    @Override // ai.oh3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof oh3) && p() == ((oh3) obj).p()) {
            if (p() == 0) {
                return true;
            }
            if (obj instanceof kh3) {
                kh3 kh3Var = (kh3) obj;
                int g10 = g();
                int g11 = kh3Var.g();
                if (g10 == 0 || g11 == 0 || g10 == g11) {
                    return V(kh3Var, 0, p());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // ai.oh3
    public byte l(int i10) {
        return this.A[i10];
    }

    @Override // ai.oh3
    public byte m(int i10) {
        return this.A[i10];
    }

    @Override // ai.oh3
    public int p() {
        return this.A.length;
    }

    @Override // ai.oh3
    public void s(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.A, i10, bArr, i11, i12);
    }

    @Override // ai.oh3
    public final oh3 w(int i10, int i11) {
        int k10 = oh3.k(i10, i11, p());
        return k10 == 0 ? oh3.f7807x : new hh3(this.A, W() + i10, k10);
    }

    @Override // ai.oh3
    public final ByteBuffer x() {
        return ByteBuffer.wrap(this.A, W(), p()).asReadOnlyBuffer();
    }

    @Override // ai.oh3
    public final void y(dh3 dh3Var) throws IOException {
        ((wh3) dh3Var).E(this.A, W(), p());
    }
}
