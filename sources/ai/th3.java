package ai;

import com.google.android.gms.internal.ads.zzggm;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class th3 extends uh3 {

    /* renamed from: f  reason: collision with root package name */
    public final InputStream f10311f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f10312g;

    /* renamed from: h  reason: collision with root package name */
    public int f10313h;

    /* renamed from: i  reason: collision with root package name */
    public int f10314i;

    /* renamed from: j  reason: collision with root package name */
    public int f10315j;

    /* renamed from: k  reason: collision with root package name */
    public int f10316k;

    /* renamed from: l  reason: collision with root package name */
    public int f10317l;

    /* renamed from: m  reason: collision with root package name */
    public int f10318m;

    public /* synthetic */ th3(InputStream inputStream, int i10, sh3 sh3Var) {
        super(null);
        this.f10318m = Integer.MAX_VALUE;
        bj3.b(inputStream, "input");
        this.f10311f = inputStream;
        this.f10312g = new byte[4096];
        this.f10313h = 0;
        this.f10315j = 0;
        this.f10317l = 0;
    }

    @Override // ai.uh3
    public final int A(int i10) throws zzggm {
        if (i10 >= 0) {
            int i11 = i10 + this.f10317l + this.f10315j;
            int i12 = this.f10318m;
            if (i11 <= i12) {
                this.f10318m = i11;
                D();
                return i12;
            }
            throw zzggm.d();
        }
        throw zzggm.e();
    }

    public final byte B() throws IOException {
        if (this.f10315j == this.f10313h) {
            E(1);
        }
        byte[] bArr = this.f10312g;
        int i10 = this.f10315j;
        this.f10315j = i10 + 1;
        return bArr[i10];
    }

    public final void C(int i10) throws IOException {
        int i11 = this.f10313h;
        int i12 = this.f10315j;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f10315j = i12 + i10;
        } else if (i10 >= 0) {
            int i14 = this.f10317l;
            int i15 = i14 + i12;
            int i16 = this.f10318m;
            if (i15 + i10 <= i16) {
                this.f10317l = i15;
                this.f10313h = 0;
                this.f10315j = 0;
                while (i13 < i10) {
                    try {
                        long j10 = i10 - i13;
                        try {
                            long skip = this.f10311f.skip(j10);
                            int i17 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i17 < 0 || skip > j10) {
                                String valueOf = String.valueOf(this.f10311f.getClass());
                                StringBuilder sb2 = new StringBuilder(valueOf.length() + 92);
                                sb2.append(valueOf);
                                sb2.append("#skip returned invalid result: ");
                                sb2.append(skip);
                                sb2.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(sb2.toString());
                            } else if (i17 == 0) {
                                break;
                            } else {
                                i13 += (int) skip;
                            }
                        } catch (zzggm e10) {
                            e10.b();
                            throw e10;
                        }
                    } finally {
                        this.f10317l += i13;
                        D();
                    }
                }
                if (i13 >= i10) {
                    return;
                }
                int i18 = this.f10313h;
                int i19 = i18 - this.f10315j;
                this.f10315j = i18;
                E(1);
                while (true) {
                    int i20 = i10 - i19;
                    int i21 = this.f10313h;
                    if (i20 <= i21) {
                        this.f10315j = i20;
                        return;
                    }
                    i19 += i21;
                    this.f10315j = i21;
                    E(1);
                }
            } else {
                C((i16 - i14) - i12);
                throw zzggm.d();
            }
        } else {
            throw zzggm.e();
        }
    }

    public final void D() {
        int i10 = this.f10313h + this.f10314i;
        this.f10313h = i10;
        int i11 = this.f10317l + i10;
        int i12 = this.f10318m;
        if (i11 <= i12) {
            this.f10314i = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f10314i = i13;
        this.f10313h = i10 - i13;
    }

    public final void E(int i10) throws IOException {
        if (F(i10)) {
            return;
        }
        if (i10 > (Integer.MAX_VALUE - this.f10317l) - this.f10315j) {
            throw zzggm.j();
        }
        throw zzggm.d();
    }

    public final boolean F(int i10) throws IOException {
        int i11 = this.f10315j;
        int i12 = this.f10313h;
        if (i11 + i10 <= i12) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i13 = this.f10317l;
        if (i10 <= (Integer.MAX_VALUE - i13) - i11 && i13 + i11 + i10 <= this.f10318m) {
            if (i11 > 0) {
                if (i12 > i11) {
                    byte[] bArr = this.f10312g;
                    System.arraycopy(bArr, i11, bArr, 0, i12 - i11);
                }
                i13 = this.f10317l + i11;
                this.f10317l = i13;
                i12 = this.f10313h - i11;
                this.f10313h = i12;
                this.f10315j = 0;
            }
            try {
                int read = this.f10311f.read(this.f10312g, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(this.f10311f.getClass());
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 91);
                    sb3.append(valueOf);
                    sb3.append("#read(byte[]) returned invalid result: ");
                    sb3.append(read);
                    sb3.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb3.toString());
                } else if (read > 0) {
                    this.f10313h += read;
                    D();
                    if (this.f10313h >= i10) {
                        return true;
                    }
                    return F(i10);
                } else {
                    return false;
                }
            } catch (zzggm e10) {
                e10.b();
                throw e10;
            }
        }
        return false;
    }

    public final byte[] G(int i10, boolean z10) throws IOException {
        byte[] H = H(i10);
        if (H != null) {
            return H;
        }
        int i11 = this.f10315j;
        int i12 = this.f10313h;
        int i13 = i12 - i11;
        this.f10317l += i12;
        this.f10315j = 0;
        this.f10313h = 0;
        List<byte[]> I = I(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f10312g, i11, bArr, 0, i13);
        for (byte[] bArr2 : I) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    public final byte[] H(int i10) throws IOException {
        if (i10 == 0) {
            return bj3.f2376c;
        }
        if (i10 >= 0) {
            int i11 = this.f10317l;
            int i12 = this.f10315j;
            int i13 = i11 + i12 + i10;
            if ((-2147483647) + i13 <= 0) {
                int i14 = this.f10318m;
                if (i13 <= i14) {
                    int i15 = this.f10313h - i12;
                    int i16 = i10 - i15;
                    if (i16 >= 4096) {
                        try {
                            if (i16 > this.f10311f.available()) {
                                return null;
                            }
                        } catch (zzggm e10) {
                            e10.b();
                            throw e10;
                        }
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f10312g, this.f10315j, bArr, 0, i15);
                    this.f10317l += this.f10313h;
                    this.f10315j = 0;
                    this.f10313h = 0;
                    while (i15 < i10) {
                        try {
                            int read = this.f10311f.read(bArr, i15, i10 - i15);
                            if (read == -1) {
                                throw zzggm.d();
                            }
                            this.f10317l += read;
                            i15 += read;
                        } catch (zzggm e11) {
                            e11.b();
                            throw e11;
                        }
                    }
                    return bArr;
                }
                C((i14 - i11) - i12);
                throw zzggm.d();
            }
            throw zzggm.j();
        }
        throw zzggm.e();
    }

    public final List<byte[]> I(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.f10311f.read(bArr, i11, min - i11);
                if (read == -1) {
                    throw zzggm.d();
                }
                this.f10317l += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int J() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f10315j
            int r1 = r5.f10313h
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f10312g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f10315j = r3
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
            r5.f10315j = r1
            return r0
        L6c:
            long r0 = r5.L()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.th3.J():int");
    }

    public final long K() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.f10315j;
        int i12 = this.f10313h;
        if (i12 != i11) {
            byte[] bArr = this.f10312g;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f10315j = i13;
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
                                                    this.f10315j = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.f10315j = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.f10315j = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.f10315j = i14;
                return j11;
            }
        }
        return L();
    }

    public final long L() throws IOException {
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

    public final int M() throws IOException {
        int i10 = this.f10315j;
        if (this.f10313h - i10 < 4) {
            E(4);
            i10 = this.f10315j;
        }
        byte[] bArr = this.f10312g;
        this.f10315j = i10 + 4;
        return ((bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) << 24) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 16);
    }

    public final long N() throws IOException {
        int i10 = this.f10315j;
        if (this.f10313h - i10 < 8) {
            E(8);
            i10 = this.f10315j;
        }
        byte[] bArr = this.f10312g;
        this.f10315j = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // ai.uh3
    public final void a(int i10) {
        this.f10318m = i10;
        D();
    }

    @Override // ai.uh3
    public final boolean b() throws IOException {
        return this.f10315j == this.f10313h && !F(1);
    }

    @Override // ai.uh3
    public final int c() {
        return this.f10317l + this.f10315j;
    }

    @Override // ai.uh3
    public final int g() throws IOException {
        if (b()) {
            this.f10316k = 0;
            return 0;
        }
        int J = J();
        this.f10316k = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw zzggm.g();
    }

    @Override // ai.uh3
    public final void h(int i10) throws zzggm {
        if (this.f10316k != i10) {
            throw zzggm.h();
        }
    }

    @Override // ai.uh3
    public final boolean i(int i10) throws IOException {
        int g10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f10313h - this.f10315j >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f10312g;
                    int i13 = this.f10315j;
                    this.f10315j = i13 + 1;
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
            C(J());
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
        return Double.longBitsToDouble(N());
    }

    @Override // ai.uh3
    public final float k() throws IOException {
        return Float.intBitsToFloat(M());
    }

    @Override // ai.uh3
    public final long l() throws IOException {
        return K();
    }

    @Override // ai.uh3
    public final long m() throws IOException {
        return K();
    }

    @Override // ai.uh3
    public final int n() throws IOException {
        return J();
    }

    @Override // ai.uh3
    public final long o() throws IOException {
        return N();
    }

    @Override // ai.uh3
    public final int p() throws IOException {
        return M();
    }

    @Override // ai.uh3
    public final boolean q() throws IOException {
        return K() != 0;
    }

    @Override // ai.uh3
    public final String r() throws IOException {
        int J = J();
        if (J > 0) {
            int i10 = this.f10313h;
            int i11 = this.f10315j;
            if (J <= i10 - i11) {
                String str = new String(this.f10312g, i11, J, bj3.f2374a);
                this.f10315j += J;
                return str;
            }
        }
        if (J == 0) {
            return "";
        }
        if (J <= this.f10313h) {
            E(J);
            String str2 = new String(this.f10312g, this.f10315j, J, bj3.f2374a);
            this.f10315j += J;
            return str2;
        }
        return new String(G(J, false), bj3.f2374a);
    }

    @Override // ai.uh3
    public final String s() throws IOException {
        byte[] G;
        int J = J();
        int i10 = this.f10315j;
        int i11 = this.f10313h;
        if (J <= i11 - i10 && J > 0) {
            G = this.f10312g;
            this.f10315j = i10 + J;
        } else if (J == 0) {
            return "";
        } else {
            if (J <= i11) {
                E(J);
                G = this.f10312g;
                this.f10315j = J;
            } else {
                G = G(J, false);
            }
            i10 = 0;
        }
        return sl3.j(G, i10, J);
    }

    @Override // ai.uh3
    public final oh3 t() throws IOException {
        int J = J();
        int i10 = this.f10313h;
        int i11 = this.f10315j;
        if (J <= i10 - i11 && J > 0) {
            oh3 M = oh3.M(this.f10312g, i11, J);
            this.f10315j += J;
            return M;
        } else if (J != 0) {
            byte[] H = H(J);
            if (H != null) {
                return oh3.N(H);
            }
            int i12 = this.f10315j;
            int i13 = this.f10313h;
            int i14 = i13 - i12;
            this.f10317l += i13;
            this.f10315j = 0;
            this.f10313h = 0;
            List<byte[]> I = I(J - i14);
            byte[] bArr = new byte[J];
            System.arraycopy(this.f10312g, i12, bArr, 0, i14);
            for (byte[] bArr2 : I) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            return oh3.P(bArr);
        } else {
            return oh3.f7807x;
        }
    }

    @Override // ai.uh3
    public final int u() throws IOException {
        return J();
    }

    @Override // ai.uh3
    public final int v() throws IOException {
        return J();
    }

    @Override // ai.uh3
    public final int w() throws IOException {
        return M();
    }

    @Override // ai.uh3
    public final long x() throws IOException {
        return N();
    }

    @Override // ai.uh3
    public final int y() throws IOException {
        return uh3.e(J());
    }

    @Override // ai.uh3
    public final long z() throws IOException {
        return uh3.f(K());
    }
}
