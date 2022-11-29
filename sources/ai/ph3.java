package ai;

import com.google.android.gms.internal.ads.zzggm;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ph3 extends uh3 {

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f8425f;

    /* renamed from: g  reason: collision with root package name */
    public int f8426g;

    /* renamed from: h  reason: collision with root package name */
    public int f8427h;

    /* renamed from: i  reason: collision with root package name */
    public int f8428i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8429j;

    /* renamed from: k  reason: collision with root package name */
    public int f8430k;

    /* renamed from: l  reason: collision with root package name */
    public int f8431l;

    public /* synthetic */ ph3(byte[] bArr, int i10, int i11, boolean z10, sh3 sh3Var) {
        super(null);
        this.f8431l = Integer.MAX_VALUE;
        this.f8425f = bArr;
        this.f8426g = i11 + i10;
        this.f8428i = i10;
        this.f8429j = i10;
    }

    @Override // ai.uh3
    public final int A(int i10) throws zzggm {
        if (i10 >= 0) {
            int i11 = i10 + (this.f8428i - this.f8429j);
            if (i11 >= 0) {
                int i12 = this.f8431l;
                if (i11 <= i12) {
                    this.f8431l = i11;
                    D();
                    return i12;
                }
                throw zzggm.d();
            }
            throw zzggm.k();
        }
        throw zzggm.e();
    }

    public final byte B() throws IOException {
        int i10 = this.f8428i;
        if (i10 != this.f8426g) {
            byte[] bArr = this.f8425f;
            this.f8428i = i10 + 1;
            return bArr[i10];
        }
        throw zzggm.d();
    }

    public final void C(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.f8426g;
            int i12 = this.f8428i;
            if (i10 <= i11 - i12) {
                this.f8428i = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzggm.e();
        }
        throw zzggm.d();
    }

    public final void D() {
        int i10 = this.f8426g + this.f8427h;
        this.f8426g = i10;
        int i11 = i10 - this.f8429j;
        int i12 = this.f8431l;
        if (i11 <= i12) {
            this.f8427h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f8427h = i13;
        this.f8426g = i10 - i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f8428i
            int r1 = r5.f8426g
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f8425f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f8428i = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f8428i = r1
            return r0
        L6c:
            long r0 = r5.G()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ph3.E():int");
    }

    public final long F() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.f8428i;
        int i12 = this.f8426g;
        if (i12 != i11) {
            byte[] bArr = this.f8425f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f8428i = i13;
                return b10;
            } else if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = (bArr[i14] << 28) ^ i18;
                            if (j14 < 0) {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (bArr[i19] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                    i14 = i19;
                                                    this.f8428i = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.f8428i = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.f8428i = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.f8428i = i14;
                return j11;
            }
        }
        return G();
    }

    public final long G() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte B = B();
            j10 |= (B & Byte.MAX_VALUE) << i10;
            if ((B & 128) == 0) {
                return j10;
            }
        }
        throw zzggm.f();
    }

    public final int H() throws IOException {
        int i10 = this.f8428i;
        if (this.f8426g - i10 >= 4) {
            byte[] bArr = this.f8425f;
            this.f8428i = i10 + 4;
            return ((bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) << 24) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 16);
        }
        throw zzggm.d();
    }

    public final long I() throws IOException {
        int i10 = this.f8428i;
        if (this.f8426g - i10 >= 8) {
            byte[] bArr = this.f8425f;
            this.f8428i = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw zzggm.d();
    }

    @Override // ai.uh3
    public final void a(int i10) {
        this.f8431l = i10;
        D();
    }

    @Override // ai.uh3
    public final boolean b() throws IOException {
        return this.f8428i == this.f8426g;
    }

    @Override // ai.uh3
    public final int c() {
        return this.f8428i - this.f8429j;
    }

    @Override // ai.uh3
    public final int g() throws IOException {
        if (b()) {
            this.f8430k = 0;
            return 0;
        }
        int E = E();
        this.f8430k = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw zzggm.g();
    }

    @Override // ai.uh3
    public final void h(int i10) throws zzggm {
        if (this.f8430k != i10) {
            throw zzggm.h();
        }
    }

    @Override // ai.uh3
    public final boolean i(int i10) throws IOException {
        int g10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f8426g - this.f8428i >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f8425f;
                    int i13 = this.f8428i;
                    this.f8428i = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzggm.f();
            }
            while (i12 < 10) {
                if (B() < 0) {
                    i12++;
                }
            }
            throw zzggm.f();
            return true;
        } else if (i11 == 1) {
            C(8);
            return true;
        } else if (i11 == 2) {
            C(E());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    C(4);
                    return true;
                }
                throw zzggm.i();
            }
            return false;
        } else {
            do {
                g10 = g();
                if (g10 == 0) {
                    break;
                }
            } while (i(g10));
            h(((i10 >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // ai.uh3
    public final double j() throws IOException {
        return Double.longBitsToDouble(I());
    }

    @Override // ai.uh3
    public final float k() throws IOException {
        return Float.intBitsToFloat(H());
    }

    @Override // ai.uh3
    public final long l() throws IOException {
        return F();
    }

    @Override // ai.uh3
    public final long m() throws IOException {
        return F();
    }

    @Override // ai.uh3
    public final int n() throws IOException {
        return E();
    }

    @Override // ai.uh3
    public final long o() throws IOException {
        return I();
    }

    @Override // ai.uh3
    public final int p() throws IOException {
        return H();
    }

    @Override // ai.uh3
    public final boolean q() throws IOException {
        return F() != 0;
    }

    @Override // ai.uh3
    public final String r() throws IOException {
        int E = E();
        if (E > 0) {
            int i10 = this.f8426g;
            int i11 = this.f8428i;
            if (E <= i10 - i11) {
                String str = new String(this.f8425f, i11, E, bj3.f2374a);
                this.f8428i += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E < 0) {
            throw zzggm.e();
        }
        throw zzggm.d();
    }

    @Override // ai.uh3
    public final String s() throws IOException {
        int E = E();
        if (E > 0) {
            int i10 = this.f8426g;
            int i11 = this.f8428i;
            if (E <= i10 - i11) {
                String j10 = sl3.j(this.f8425f, i11, E);
                this.f8428i += E;
                return j10;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E <= 0) {
            throw zzggm.e();
        }
        throw zzggm.d();
    }

    @Override // ai.uh3
    public final oh3 t() throws IOException {
        int E = E();
        if (E > 0) {
            int i10 = this.f8426g;
            int i11 = this.f8428i;
            if (E <= i10 - i11) {
                oh3 M = oh3.M(this.f8425f, i11, E);
                this.f8428i += E;
                return M;
            }
        }
        if (E != 0) {
            if (E > 0) {
                int i12 = this.f8426g;
                int i13 = this.f8428i;
                if (E <= i12 - i13) {
                    int i14 = E + i13;
                    this.f8428i = i14;
                    return oh3.P(Arrays.copyOfRange(this.f8425f, i13, i14));
                }
            }
            if (E <= 0) {
                throw zzggm.e();
            }
            throw zzggm.d();
        }
        return oh3.f7807x;
    }

    @Override // ai.uh3
    public final int u() throws IOException {
        return E();
    }

    @Override // ai.uh3
    public final int v() throws IOException {
        return E();
    }

    @Override // ai.uh3
    public final int w() throws IOException {
        return H();
    }

    @Override // ai.uh3
    public final long x() throws IOException {
        return I();
    }

    @Override // ai.uh3
    public final int y() throws IOException {
        return uh3.e(E());
    }

    @Override // ai.uh3
    public final long z() throws IOException {
        return uh3.f(F());
    }
}
