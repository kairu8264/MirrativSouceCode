package ai;

import com.google.android.gms.internal.ads.zzggm;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class qh3 extends uh3 {

    /* renamed from: f  reason: collision with root package name */
    public final Iterable<ByteBuffer> f8951f;

    /* renamed from: g  reason: collision with root package name */
    public final Iterator<ByteBuffer> f8952g;

    /* renamed from: h  reason: collision with root package name */
    public ByteBuffer f8953h;

    /* renamed from: i  reason: collision with root package name */
    public int f8954i;

    /* renamed from: j  reason: collision with root package name */
    public int f8955j;

    /* renamed from: k  reason: collision with root package name */
    public int f8956k;

    /* renamed from: l  reason: collision with root package name */
    public int f8957l;

    /* renamed from: m  reason: collision with root package name */
    public int f8958m;

    /* renamed from: n  reason: collision with root package name */
    public long f8959n;

    /* renamed from: o  reason: collision with root package name */
    public long f8960o;

    /* renamed from: p  reason: collision with root package name */
    public long f8961p;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qh3(Iterable iterable, Iterable<ByteBuffer> iterable2, int i10, boolean z10) {
        super(null);
        this.f8956k = Integer.MAX_VALUE;
        this.f8954i = iterable2;
        this.f8951f = iterable;
        this.f8952g = iterable.iterator();
        this.f8958m = 0;
        if (iterable2 == 0) {
            this.f8953h = bj3.f2377d;
            this.f8959n = 0L;
            this.f8960o = 0L;
            this.f8961p = 0L;
            return;
        }
        E();
    }

    @Override // ai.uh3
    public final int A(int i10) throws zzggm {
        if (i10 >= 0) {
            int c10 = i10 + c();
            int i11 = this.f8956k;
            if (c10 <= i11) {
                this.f8956k = c10;
                F();
                return i11;
            }
            throw zzggm.d();
        }
        throw zzggm.e();
    }

    public final byte B() throws IOException {
        if (this.f8961p - this.f8959n == 0) {
            D();
        }
        long j10 = this.f8959n;
        this.f8959n = 1 + j10;
        return nl3.z(j10);
    }

    public final void C(int i10) throws IOException {
        if (i10 < 0 || i10 > ((this.f8954i - this.f8958m) - this.f8959n) + this.f8960o) {
            if (i10 < 0) {
                throw zzggm.e();
            }
            throw zzggm.d();
        }
        while (i10 > 0) {
            if (this.f8961p - this.f8959n == 0) {
                D();
            }
            int min = Math.min(i10, (int) (this.f8961p - this.f8959n));
            i10 -= min;
            this.f8959n += min;
        }
    }

    public final void D() throws zzggm {
        if (this.f8952g.hasNext()) {
            E();
            return;
        }
        throw zzggm.d();
    }

    public final void E() {
        ByteBuffer next = this.f8952g.next();
        this.f8953h = next;
        this.f8958m += (int) (this.f8959n - this.f8960o);
        long position = next.position();
        this.f8959n = position;
        this.f8960o = position;
        this.f8961p = this.f8953h.limit();
        long A = nl3.A(this.f8953h);
        this.f8959n += A;
        this.f8960o += A;
        this.f8961p += A;
    }

    public final void F() {
        int i10 = this.f8954i + this.f8955j;
        this.f8954i = i10;
        int i11 = this.f8956k;
        if (i10 <= i11) {
            this.f8955j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f8955j = i12;
        this.f8954i = i10 - i12;
    }

    public final void G(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 > H()) {
            if (i11 > 0) {
                throw zzggm.d();
            }
            return;
        }
        int i12 = i11;
        while (i12 > 0) {
            if (this.f8961p - this.f8959n == 0) {
                D();
            }
            int min = Math.min(i12, (int) (this.f8961p - this.f8959n));
            long j10 = min;
            nl3.y(this.f8959n, bArr, i11 - i12, j10);
            i12 -= min;
            this.f8959n += j10;
        }
    }

    public final int H() {
        return (int) (((this.f8954i - this.f8958m) - this.f8959n) + this.f8960o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (ai.nl3.z(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.f8959n
            long r2 = r10.f8961p
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = ai.nl3.z(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.f8959n
            long r4 = r4 + r2
            r10.f8959n = r4
            return r0
        L1a:
            long r6 = r10.f8961p
            long r8 = r10.f8959n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = ai.nl3.z(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = ai.nl3.z(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = ai.nl3.z(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = ai.nl3.z(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = ai.nl3.z(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = ai.nl3.z(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = ai.nl3.z(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = ai.nl3.z(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = ai.nl3.z(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.f8959n = r6
            return r0
        L8c:
            long r0 = r10.K()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qh3.I():int");
    }

    public final long J() throws IOException {
        long z10;
        long j10;
        long j11;
        int i10;
        long j12 = this.f8959n;
        if (this.f8961p != j12) {
            long j13 = j12 + 1;
            byte z11 = nl3.z(j12);
            if (z11 >= 0) {
                this.f8959n++;
                return z11;
            } else if (this.f8961p - this.f8959n >= 10) {
                long j14 = j13 + 1;
                int z12 = z11 ^ (nl3.z(j13) << 7);
                if (z12 >= 0) {
                    long j15 = j14 + 1;
                    int z13 = z12 ^ (nl3.z(j14) << 14);
                    if (z13 >= 0) {
                        z10 = z13 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int z14 = z13 ^ (nl3.z(j15) << 21);
                        if (z14 < 0) {
                            i10 = z14 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long z15 = z14 ^ (nl3.z(j14) << 28);
                            if (z15 < 0) {
                                long j16 = j15 + 1;
                                long z16 = z15 ^ (nl3.z(j15) << 35);
                                if (z16 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    z15 = z16 ^ (nl3.z(j16) << 42);
                                    if (z15 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        z16 = z15 ^ (nl3.z(j15) << 49);
                                        if (z16 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j16 + 1;
                                            z10 = (z16 ^ (nl3.z(j16) << 56)) ^ 71499008037633920L;
                                            if (z10 < 0) {
                                                long j17 = 1 + j15;
                                                if (nl3.z(j15) >= 0) {
                                                    j14 = j17;
                                                    this.f8959n = j14;
                                                    return z10;
                                                }
                                            }
                                        }
                                    }
                                }
                                z10 = z16 ^ j10;
                                j14 = j16;
                                this.f8959n = j14;
                                return z10;
                            }
                            j11 = 266354560;
                            z10 = z15 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.f8959n = j14;
                    return z10;
                }
                i10 = z12 ^ (-128);
                z10 = i10;
                this.f8959n = j14;
                return z10;
            }
        }
        return K();
    }

    public final long K() throws IOException {
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

    public final int L() throws IOException {
        int B;
        byte B2;
        long j10 = this.f8961p;
        long j11 = this.f8959n;
        if (j10 - j11 >= 4) {
            this.f8959n = 4 + j11;
            B = (nl3.z(j11) & TagConstant.TAG_CAT_RESERVED) | ((nl3.z(1 + j11) & TagConstant.TAG_CAT_RESERVED) << 8) | ((nl3.z(2 + j11) & TagConstant.TAG_CAT_RESERVED) << 16);
            B2 = nl3.z(j11 + 3);
        } else {
            B = (B() & TagConstant.TAG_CAT_RESERVED) | ((B() & TagConstant.TAG_CAT_RESERVED) << 8) | ((B() & TagConstant.TAG_CAT_RESERVED) << 16);
            B2 = B();
        }
        return B | ((B2 & TagConstant.TAG_CAT_RESERVED) << 24);
    }

    public final long M() throws IOException {
        long j10 = this.f8961p;
        long j11 = this.f8959n;
        if (j10 - j11 >= 8) {
            this.f8959n = 8 + j11;
            return ((nl3.z(j11 + 7) & 255) << 56) | (nl3.z(j11) & 255) | ((nl3.z(1 + j11) & 255) << 8) | ((nl3.z(2 + j11) & 255) << 16) | ((nl3.z(3 + j11) & 255) << 24) | ((nl3.z(4 + j11) & 255) << 32) | ((nl3.z(5 + j11) & 255) << 40) | ((nl3.z(6 + j11) & 255) << 48);
        }
        return ((B() & 255) << 56) | (B() & 255) | ((B() & 255) << 8) | ((B() & 255) << 16) | ((B() & 255) << 24) | ((B() & 255) << 32) | ((B() & 255) << 40) | ((B() & 255) << 48);
    }

    @Override // ai.uh3
    public final void a(int i10) {
        this.f8956k = i10;
        F();
    }

    @Override // ai.uh3
    public final boolean b() throws IOException {
        return (((long) this.f8958m) + this.f8959n) - this.f8960o == ((long) this.f8954i);
    }

    @Override // ai.uh3
    public final int c() {
        return (int) ((this.f8958m + this.f8959n) - this.f8960o);
    }

    @Override // ai.uh3
    public final int g() throws IOException {
        if (b()) {
            this.f8957l = 0;
            return 0;
        }
        int I = I();
        this.f8957l = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw zzggm.g();
    }

    @Override // ai.uh3
    public final void h(int i10) throws zzggm {
        if (this.f8957l != i10) {
            throw zzggm.h();
        }
    }

    @Override // ai.uh3
    public final boolean i(int i10) throws IOException {
        int g10;
        int i11 = i10 & 7;
        if (i11 == 0) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (B() >= 0) {
                    return true;
                }
            }
            throw zzggm.f();
        } else if (i11 == 1) {
            C(8);
            return true;
        } else if (i11 == 2) {
            C(I());
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
        return Double.longBitsToDouble(M());
    }

    @Override // ai.uh3
    public final float k() throws IOException {
        return Float.intBitsToFloat(L());
    }

    @Override // ai.uh3
    public final long l() throws IOException {
        return J();
    }

    @Override // ai.uh3
    public final long m() throws IOException {
        return J();
    }

    @Override // ai.uh3
    public final int n() throws IOException {
        return I();
    }

    @Override // ai.uh3
    public final long o() throws IOException {
        return M();
    }

    @Override // ai.uh3
    public final int p() throws IOException {
        return L();
    }

    @Override // ai.uh3
    public final boolean q() throws IOException {
        return J() != 0;
    }

    @Override // ai.uh3
    public final String r() throws IOException {
        int I = I();
        if (I > 0) {
            long j10 = I;
            long j11 = this.f8961p;
            long j12 = this.f8959n;
            if (j10 <= j11 - j12) {
                byte[] bArr = new byte[I];
                nl3.y(j12, bArr, 0L, j10);
                String str = new String(bArr, bj3.f2374a);
                this.f8959n += j10;
                return str;
            }
        }
        if (I > 0 && I <= H()) {
            byte[] bArr2 = new byte[I];
            G(bArr2, 0, I);
            return new String(bArr2, bj3.f2374a);
        } else if (I == 0) {
            return "";
        } else {
            if (I < 0) {
                throw zzggm.e();
            }
            throw zzggm.d();
        }
    }

    @Override // ai.uh3
    public final String s() throws IOException {
        int I = I();
        if (I > 0) {
            long j10 = I;
            long j11 = this.f8961p;
            long j12 = this.f8959n;
            if (j10 <= j11 - j12) {
                String i10 = sl3.i(this.f8953h, (int) (j12 - this.f8960o), I);
                this.f8959n += j10;
                return i10;
            }
        }
        if (I >= 0 && I <= H()) {
            byte[] bArr = new byte[I];
            G(bArr, 0, I);
            return sl3.j(bArr, 0, I);
        } else if (I == 0) {
            return "";
        } else {
            if (I <= 0) {
                throw zzggm.e();
            }
            throw zzggm.d();
        }
    }

    @Override // ai.uh3
    public final oh3 t() throws IOException {
        int I = I();
        if (I > 0) {
            long j10 = I;
            long j11 = this.f8961p;
            long j12 = this.f8959n;
            if (j10 <= j11 - j12) {
                byte[] bArr = new byte[I];
                nl3.y(j12, bArr, 0L, j10);
                this.f8959n += j10;
                return oh3.P(bArr);
            }
        }
        if (I > 0 && I <= H()) {
            byte[] bArr2 = new byte[I];
            G(bArr2, 0, I);
            return oh3.P(bArr2);
        } else if (I == 0) {
            return oh3.f7807x;
        } else {
            if (I < 0) {
                throw zzggm.e();
            }
            throw zzggm.d();
        }
    }

    @Override // ai.uh3
    public final int u() throws IOException {
        return I();
    }

    @Override // ai.uh3
    public final int v() throws IOException {
        return I();
    }

    @Override // ai.uh3
    public final int w() throws IOException {
        return L();
    }

    @Override // ai.uh3
    public final long x() throws IOException {
        return M();
    }

    @Override // ai.uh3
    public final int y() throws IOException {
        return uh3.e(I());
    }

    @Override // ai.uh3
    public final long z() throws IOException {
        return uh3.f(J());
    }
}
