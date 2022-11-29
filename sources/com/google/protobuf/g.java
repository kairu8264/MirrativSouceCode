package com.google.protobuf;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public int f28122a;

    /* renamed from: b  reason: collision with root package name */
    public int f28123b;

    /* renamed from: c  reason: collision with root package name */
    public int f28124c;

    /* renamed from: d  reason: collision with root package name */
    public h f28125d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28126e;

    /* loaded from: classes4.dex */
    public static final class b extends g {

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f28127f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f28128g;

        /* renamed from: h  reason: collision with root package name */
        public int f28129h;

        /* renamed from: i  reason: collision with root package name */
        public int f28130i;

        /* renamed from: j  reason: collision with root package name */
        public int f28131j;

        /* renamed from: k  reason: collision with root package name */
        public int f28132k;

        /* renamed from: l  reason: collision with root package name */
        public int f28133l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f28134m;

        /* renamed from: n  reason: collision with root package name */
        public int f28135n;

        @Override // com.google.protobuf.g
        public int A() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.g
        public long B() throws IOException {
            return I();
        }

        @Override // com.google.protobuf.g
        public boolean C(int i10) throws IOException {
            int b10 = p0.b(i10);
            if (b10 == 0) {
                N();
                return true;
            } else if (b10 == 1) {
                M(8);
                return true;
            } else if (b10 == 2) {
                M(H());
                return true;
            } else if (b10 == 3) {
                L();
                a(p0.c(p0.a(i10), 4));
                return true;
            } else if (b10 != 4) {
                if (b10 == 5) {
                    M(4);
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            } else {
                return false;
            }
        }

        public byte D() throws IOException {
            int i10 = this.f28131j;
            if (i10 != this.f28129h) {
                byte[] bArr = this.f28127f;
                this.f28131j = i10 + 1;
                return bArr[i10];
            }
            throw InvalidProtocolBufferException.j();
        }

        public byte[] E(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f28129h;
                int i12 = this.f28131j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f28131j = i13;
                    return Arrays.copyOfRange(this.f28127f, i12, i13);
                }
            }
            if (i10 <= 0) {
                if (i10 == 0) {
                    return t.f28217c;
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        public int F() throws IOException {
            int i10 = this.f28131j;
            if (this.f28129h - i10 >= 4) {
                byte[] bArr = this.f28127f;
                this.f28131j = i10 + 4;
                return ((bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) << 24) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 16);
            }
            throw InvalidProtocolBufferException.j();
        }

        public long G() throws IOException {
            int i10 = this.f28131j;
            if (this.f28129h - i10 >= 8) {
                byte[] bArr = this.f28127f;
                this.f28131j = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.j();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int H() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f28131j
                int r1 = r5.f28129h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f28127f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f28131j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.J()
                int r0 = (int) r0
                return r0
            L70:
                r5.f28131j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.b.H():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long I() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.b.I():long");
        }

        public long J() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte D = D();
                j10 |= (D & Byte.MAX_VALUE) << i10;
                if ((D & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void K() {
            int i10 = this.f28129h + this.f28130i;
            this.f28129h = i10;
            int i11 = i10 - this.f28132k;
            int i12 = this.f28135n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f28130i = i13;
                this.f28129h = i10 - i13;
                return;
            }
            this.f28130i = 0;
        }

        public void L() throws IOException {
            int z10;
            do {
                z10 = z();
                if (z10 == 0) {
                    return;
                }
            } while (C(z10));
        }

        public void M(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f28129h;
                int i12 = this.f28131j;
                if (i10 <= i11 - i12) {
                    this.f28131j = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        public final void N() throws IOException {
            if (this.f28129h - this.f28131j >= 10) {
                O();
            } else {
                P();
            }
        }

        public final void O() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f28127f;
                int i11 = this.f28131j;
                this.f28131j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void P() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.protobuf.g
        public void a(int i10) throws InvalidProtocolBufferException {
            if (this.f28133l != i10) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.g
        public int d() {
            return this.f28131j - this.f28132k;
        }

        @Override // com.google.protobuf.g
        public boolean e() throws IOException {
            return this.f28131j == this.f28129h;
        }

        @Override // com.google.protobuf.g
        public void i(int i10) {
            this.f28135n = i10;
            K();
        }

        @Override // com.google.protobuf.g
        public int j(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f28135n;
                if (d10 <= i11) {
                    this.f28135n = d10;
                    K();
                    return i11;
                }
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.g
        public boolean k() throws IOException {
            return I() != 0;
        }

        @Override // com.google.protobuf.g
        public f l() throws IOException {
            f k10;
            int H = H();
            if (H > 0) {
                int i10 = this.f28129h;
                int i11 = this.f28131j;
                if (H <= i10 - i11) {
                    if (this.f28128g && this.f28134m) {
                        k10 = f.M(this.f28127f, i11, H);
                    } else {
                        k10 = f.k(this.f28127f, i11, H);
                    }
                    this.f28131j += H;
                    return k10;
                }
            }
            if (H == 0) {
                return f.f28094x;
            }
            return f.L(E(H));
        }

        @Override // com.google.protobuf.g
        public double m() throws IOException {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.protobuf.g
        public int n() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.g
        public int o() throws IOException {
            return F();
        }

        @Override // com.google.protobuf.g
        public long p() throws IOException {
            return G();
        }

        @Override // com.google.protobuf.g
        public float q() throws IOException {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.protobuf.g
        public int r() throws IOException {
            return H();
        }

        @Override // com.google.protobuf.g
        public long s() throws IOException {
            return I();
        }

        @Override // com.google.protobuf.g
        public int t() throws IOException {
            return F();
        }

        @Override // com.google.protobuf.g
        public long u() throws IOException {
            return G();
        }

        @Override // com.google.protobuf.g
        public int v() throws IOException {
            return g.b(H());
        }

        @Override // com.google.protobuf.g
        public long w() throws IOException {
            return g.c(I());
        }

        @Override // com.google.protobuf.g
        public String x() throws IOException {
            int H = H();
            if (H > 0) {
                int i10 = this.f28129h;
                int i11 = this.f28131j;
                if (H <= i10 - i11) {
                    String str = new String(this.f28127f, i11, H, t.f28215a);
                    this.f28131j += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.protobuf.g
        public String y() throws IOException {
            int H = H();
            if (H > 0) {
                int i10 = this.f28129h;
                int i11 = this.f28131j;
                if (H <= i10 - i11) {
                    String e10 = o0.e(this.f28127f, i11, H);
                    this.f28131j += H;
                    return e10;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.protobuf.g
        public int z() throws IOException {
            if (e()) {
                this.f28133l = 0;
                return 0;
            }
            int H = H();
            this.f28133l = H;
            if (p0.a(H) != 0) {
                return this.f28133l;
            }
            throw InvalidProtocolBufferException.b();
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f28135n = Integer.MAX_VALUE;
            this.f28127f = bArr;
            this.f28129h = i11 + i10;
            this.f28131j = i10;
            this.f28132k = i10;
            this.f28128g = z10;
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static g f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static g g(byte[] bArr, int i10, int i11) {
        return h(bArr, i10, i11, false);
    }

    public static g h(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.j(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract boolean C(int i10) throws IOException;

    public abstract void a(int i10) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void i(int i10);

    public abstract int j(int i10) throws InvalidProtocolBufferException;

    public abstract boolean k() throws IOException;

    public abstract f l() throws IOException;

    public abstract double m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract float q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract String x() throws IOException;

    public abstract String y() throws IOException;

    public abstract int z() throws IOException;

    public g() {
        this.f28123b = 100;
        this.f28124c = Integer.MAX_VALUE;
        this.f28126e = false;
    }
}
