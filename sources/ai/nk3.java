package ai;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class nk3 extends oh3 {
    public static final int[] F = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int A;
    public final oh3 B;
    public final oh3 C;
    public final int D;
    public final int E;

    public nk3(oh3 oh3Var, oh3 oh3Var2) {
        this.B = oh3Var;
        this.C = oh3Var2;
        int p10 = oh3Var.p();
        this.D = p10;
        this.A = p10 + oh3Var2.p();
        this.E = Math.max(oh3Var.t(), oh3Var2.t()) + 1;
    }

    public static oh3 V(oh3 oh3Var, oh3 oh3Var2) {
        if (oh3Var2.p() == 0) {
            return oh3Var;
        }
        if (oh3Var.p() == 0) {
            return oh3Var2;
        }
        int p10 = oh3Var.p() + oh3Var2.p();
        if (p10 < 128) {
            return Z(oh3Var, oh3Var2);
        }
        if (oh3Var instanceof nk3) {
            nk3 nk3Var = (nk3) oh3Var;
            if (nk3Var.C.p() + oh3Var2.p() < 128) {
                return new nk3(nk3Var.B, Z(nk3Var.C, oh3Var2));
            } else if (nk3Var.B.t() > nk3Var.C.t() && nk3Var.E > oh3Var2.t()) {
                return new nk3(nk3Var.B, new nk3(nk3Var.C, oh3Var2));
            }
        }
        if (p10 >= W(Math.max(oh3Var.t(), oh3Var2.t()) + 1)) {
            return new nk3(oh3Var, oh3Var2);
        }
        return kk3.a(new kk3(null), oh3Var, oh3Var2);
    }

    public static int W(int i10) {
        int[] iArr = F;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    public static oh3 Z(oh3 oh3Var, oh3 oh3Var2) {
        int p10 = oh3Var.p();
        int p11 = oh3Var2.p();
        byte[] bArr = new byte[p10 + p11];
        oh3Var.T(bArr, 0, 0, p10);
        oh3Var2.T(bArr, 0, p10, p11);
        return new kh3(bArr);
    }

    @Override // ai.oh3
    public final String A(Charset charset) {
        return new String(U(), charset);
    }

    @Override // ai.oh3
    public final boolean B() {
        int D = this.B.D(0, 0, this.D);
        oh3 oh3Var = this.C;
        return oh3Var.D(D, 0, oh3Var.p()) == 0;
    }

    @Override // ai.oh3
    public final int D(int i10, int i11, int i12) {
        int i13 = this.D;
        if (i11 + i12 <= i13) {
            return this.B.D(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.C.D(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.C.D(this.B.D(i10, i11, i14), 0, i12 - i14);
    }

    @Override // ai.oh3
    public final int H(int i10, int i11, int i12) {
        int i13 = this.D;
        if (i11 + i12 <= i13) {
            return this.B.H(i10, i11, i12);
        }
        if (i11 >= i13) {
            return this.C.H(i10, i11 - i13, i12);
        }
        int i14 = i13 - i11;
        return this.C.H(this.B.H(i10, i11, i14), 0, i12 - i14);
    }

    @Override // ai.oh3
    public final uh3 J() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        mk3 mk3Var = new mk3(this, null);
        while (mk3Var.hasNext()) {
            arrayList.add(mk3Var.next().x());
        }
        int i10 = uh3.f10713e;
        boolean z10 = false;
        int i11 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z10 |= true;
            } else {
                z10 = byteBuffer.isDirect() ? z10 | true : z10 | true;
            }
        }
        if (z10) {
            return new qh3(arrayList, i11, true, null);
        }
        return new th3(new cj3(arrayList), 4096, null);
    }

    @Override // ai.oh3
    public final ih3 K() {
        return new jk3(this);
    }

    @Override // ai.oh3
    public final boolean equals(Object obj) {
        boolean V;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oh3)) {
            return false;
        }
        oh3 oh3Var = (oh3) obj;
        if (this.A != oh3Var.p()) {
            return false;
        }
        if (this.A == 0) {
            return true;
        }
        int g10 = g();
        int g11 = oh3Var.g();
        if (g10 != 0 && g11 != 0 && g10 != g11) {
            return false;
        }
        mk3 mk3Var = new mk3(this, null);
        jh3 next = mk3Var.next();
        mk3 mk3Var2 = new mk3(oh3Var, null);
        jh3 next2 = mk3Var2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int p10 = next.p() - i10;
            int p11 = next2.p() - i11;
            int min = Math.min(p10, p11);
            if (i10 == 0) {
                V = next.V(next2, i11, min);
            } else {
                V = next2.V(next, i10, min);
            }
            if (!V) {
                return false;
            }
            i12 += min;
            int i13 = this.A;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == p10) {
                next = mk3Var.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == p11) {
                next2 = mk3Var2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // ai.oh3, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new jk3(this);
    }

    @Override // ai.oh3
    public final byte l(int i10) {
        oh3.j(i10, this.A);
        return m(i10);
    }

    @Override // ai.oh3
    public final byte m(int i10) {
        int i11 = this.D;
        return i10 < i11 ? this.B.m(i10) : this.C.m(i10 - i11);
    }

    @Override // ai.oh3
    public final int p() {
        return this.A;
    }

    @Override // ai.oh3
    public final void s(byte[] bArr, int i10, int i11, int i12) {
        int i13 = this.D;
        if (i10 + i12 <= i13) {
            this.B.s(bArr, i10, i11, i12);
        } else if (i10 >= i13) {
            this.C.s(bArr, i10 - i13, i11, i12);
        } else {
            int i14 = i13 - i10;
            this.B.s(bArr, i10, i11, i14);
            this.C.s(bArr, 0, i11 + i14, i12 - i14);
        }
    }

    @Override // ai.oh3
    public final int t() {
        return this.E;
    }

    @Override // ai.oh3
    public final boolean u() {
        return this.A >= W(this.E);
    }

    @Override // ai.oh3
    public final oh3 w(int i10, int i11) {
        int k10 = oh3.k(i10, i11, this.A);
        if (k10 == 0) {
            return oh3.f7807x;
        }
        if (k10 == this.A) {
            return this;
        }
        int i12 = this.D;
        if (i11 <= i12) {
            return this.B.w(i10, i11);
        }
        if (i10 >= i12) {
            return this.C.w(i10 - i12, i11 - i12);
        }
        oh3 oh3Var = this.B;
        return new nk3(oh3Var.w(i10, oh3Var.p()), this.C.w(0, i11 - this.D));
    }

    @Override // ai.oh3
    public final void y(dh3 dh3Var) throws IOException {
        this.B.y(dh3Var);
        this.C.y(dh3Var);
    }
}
