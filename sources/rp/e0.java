package rp;

import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class e0 extends f {
    public final transient byte[][] B;
    public final transient int[] C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(byte[][] bArr, int[] iArr) {
        super(f.A.m());
        jo.p.h(bArr, "segments");
        jo.p.h(iArr, "directory");
        this.B = bArr;
        this.C = iArr;
    }

    @Override // rp.f
    public boolean A(int i10, f fVar, int i11, int i12) {
        jo.p.h(fVar, "other");
        if (i10 < 0 || i10 > G() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = sp.j.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : N()[b10 - 1];
            int i15 = N()[O().length + b10];
            int min = Math.min(i13, (N()[b10] - i14) + i14) - i10;
            if (!fVar.B(i11, O()[b10], i15 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // rp.f
    public boolean B(int i10, byte[] bArr, int i11, int i12) {
        jo.p.h(bArr, "other");
        if (i10 < 0 || i10 > G() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = sp.j.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : N()[b10 - 1];
            int i15 = N()[O().length + b10];
            int min = Math.min(i13, (N()[b10] - i14) + i14) - i10;
            if (!n0.a(O()[b10], i15 + (i10 - i14), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // rp.f
    public f I(int i10, int i11) {
        int d10 = n0.d(this, i11);
        if (i10 >= 0) {
            if (!(d10 <= G())) {
                throw new IllegalArgumentException(("endIndex=" + d10 + " > length(" + G() + ')').toString());
            }
            int i12 = d10 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && d10 == G()) {
                    return this;
                }
                if (i10 == d10) {
                    return f.A;
                }
                int b10 = sp.j.b(this, i10);
                int b11 = sp.j.b(this, d10 - 1);
                byte[][] bArr = (byte[][]) xn.n.p(O(), b10, b11 + 1);
                int[] iArr = new int[bArr.length * 2];
                if (b10 <= b11) {
                    int i13 = 0;
                    int i14 = b10;
                    while (true) {
                        int i15 = i14 + 1;
                        iArr[i13] = Math.min(N()[i14] - i10, i12);
                        int i16 = i13 + 1;
                        iArr[i13 + bArr.length] = N()[O().length + i14];
                        if (i14 == b11) {
                            break;
                        }
                        i14 = i15;
                        i13 = i16;
                    }
                }
                int i17 = b10 != 0 ? N()[b10 - 1] : 0;
                int length = bArr.length;
                iArr[length] = iArr[length] + (i10 - i17);
                return new e0(bArr, iArr);
            }
            throw new IllegalArgumentException(("endIndex=" + d10 + " < beginIndex=" + i10).toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
    }

    @Override // rp.f
    public f K() {
        return Q().K();
    }

    @Override // rp.f
    public void M(c cVar, int i10, int i11) {
        jo.p.h(cVar, "buffer");
        int i12 = i10 + i11;
        int b10 = sp.j.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : N()[b10 - 1];
            int i14 = N()[O().length + b10];
            int min = Math.min(i12, (N()[b10] - i13) + i13) - i10;
            int i15 = i14 + (i10 - i13);
            c0 c0Var = new c0(O()[b10], i15, i15 + min, true, false);
            c0 c0Var2 = cVar.f51656w;
            if (c0Var2 == null) {
                c0Var.f51671g = c0Var;
                c0Var.f51670f = c0Var;
                cVar.f51656w = c0Var;
            } else {
                jo.p.e(c0Var2);
                c0 c0Var3 = c0Var2.f51671g;
                jo.p.e(c0Var3);
                c0Var3.c(c0Var);
            }
            i10 += min;
            b10++;
        }
        cVar.O(cVar.X() + i11);
    }

    public final int[] N() {
        return this.C;
    }

    public final byte[][] O() {
        return this.B;
    }

    public byte[] P() {
        byte[] bArr = new byte[G()];
        int length = O().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = N()[length + i10];
            int i14 = N()[i10];
            int i15 = i14 - i11;
            xn.n.d(O()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final f Q() {
        return new f(P());
    }

    @Override // rp.f
    public String a() {
        return Q().a();
    }

    @Override // rp.f
    public f e(String str) {
        jo.p.h(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = O().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = N()[length + i10];
            int i13 = N()[i10];
            messageDigest.update(O()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        jo.p.g(digest, "digestBytes");
        return new f(digest);
    }

    @Override // rp.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.G() == G() && A(0, fVar, 0, G())) {
                return true;
            }
        }
        return false;
    }

    @Override // rp.f
    public int hashCode() {
        int n10 = n();
        if (n10 != 0) {
            return n10;
        }
        int length = O().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = N()[length + i10];
            int i14 = N()[i10];
            byte[] bArr = O()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        C(i11);
        return i11;
    }

    @Override // rp.f
    public int o() {
        return N()[O().length - 1];
    }

    @Override // rp.f
    public String q() {
        return Q().q();
    }

    @Override // rp.f
    public int s(byte[] bArr, int i10) {
        jo.p.h(bArr, "other");
        return Q().s(bArr, i10);
    }

    @Override // rp.f
    public String toString() {
        return Q().toString();
    }

    @Override // rp.f
    public byte[] u() {
        return P();
    }

    @Override // rp.f
    public byte v(int i10) {
        n0.b(N()[O().length - 1], i10, 1L);
        int b10 = sp.j.b(this, i10);
        return O()[b10][(i10 - (b10 == 0 ? 0 : N()[b10 - 1])) + N()[O().length + b10]];
    }

    @Override // rp.f
    public int x(byte[] bArr, int i10) {
        jo.p.h(bArr, "other");
        return Q().x(bArr, i10);
    }
}
