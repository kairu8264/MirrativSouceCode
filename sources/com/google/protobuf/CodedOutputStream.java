package com.google.protobuf;

import com.google.protobuf.o0;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class CodedOutputStream extends fn.b {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f28069c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f28070d = fn.b0.C();

    /* renamed from: a  reason: collision with root package name */
    public i f28071a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28072b;

    /* loaded from: classes4.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        public OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f28073e;

        /* renamed from: f  reason: collision with root package name */
        public final int f28074f;

        /* renamed from: g  reason: collision with root package name */
        public final int f28075g;

        /* renamed from: h  reason: collision with root package name */
        public int f28076h;

        public b(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                this.f28073e = bArr;
                this.f28074f = i10;
                this.f28076h = i10;
                this.f28075g = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B0(int i10, int i11) throws IOException {
            T0(i10, 0);
            C0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void C0(int i10) throws IOException {
            if (i10 >= 0) {
                V0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void F0(int i10, d0 d0Var, fn.v vVar) throws IOException {
            T0(i10, 2);
            V0(((com.google.protobuf.a) d0Var).p(vVar));
            vVar.b(d0Var, this.f28071a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G0(d0 d0Var) throws IOException {
            V0(d0Var.h());
            d0Var.l(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H0(int i10, d0 d0Var) throws IOException {
            T0(1, 3);
            U0(2, i10);
            Z0(3, d0Var);
            T0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void I0(int i10, f fVar) throws IOException {
            T0(1, 3);
            U0(2, i10);
            l0(3, fVar);
            T0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R0(int i10, String str) throws IOException {
            T0(i10, 2);
            S0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S0(String str) throws IOException {
            int i10 = this.f28076h;
            try {
                int W = CodedOutputStream.W(str.length() * 3);
                int W2 = CodedOutputStream.W(str.length());
                if (W2 == W) {
                    int i11 = i10 + W2;
                    this.f28076h = i11;
                    int f10 = o0.f(str, this.f28073e, i11, f0());
                    this.f28076h = i10;
                    V0((f10 - i10) - W2);
                    this.f28076h = f10;
                } else {
                    V0(o0.g(str));
                    this.f28076h = o0.f(str, this.f28073e, this.f28076h, f0());
                }
            } catch (o0.d e10) {
                this.f28076h = i10;
                b0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T0(int i10, int i11) throws IOException {
            V0(p0.c(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U0(int i10, int i11) throws IOException {
            T0(i10, 0);
            V0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V0(int i10) throws IOException {
            if (!CodedOutputStream.f28070d || fn.a.c() || f0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f28073e;
                        int i11 = this.f28076h;
                        this.f28076h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28076h), Integer.valueOf(this.f28075g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f28073e;
                int i12 = this.f28076h;
                this.f28076h = i12 + 1;
                bArr2[i12] = (byte) i10;
            } else if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f28073e;
                int i13 = this.f28076h;
                this.f28076h = i13 + 1;
                fn.b0.H(bArr3, i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f28073e;
                int i14 = this.f28076h;
                this.f28076h = i14 + 1;
                fn.b0.H(bArr4, i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & (-128)) == 0) {
                    byte[] bArr5 = this.f28073e;
                    int i16 = this.f28076h;
                    this.f28076h = i16 + 1;
                    fn.b0.H(bArr5, i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f28073e;
                int i17 = this.f28076h;
                this.f28076h = i17 + 1;
                fn.b0.H(bArr6, i17, (byte) (i15 | 128));
                int i18 = i15 >>> 7;
                if ((i18 & (-128)) == 0) {
                    byte[] bArr7 = this.f28073e;
                    int i19 = this.f28076h;
                    this.f28076h = i19 + 1;
                    fn.b0.H(bArr7, i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f28073e;
                int i20 = this.f28076h;
                this.f28076h = i20 + 1;
                fn.b0.H(bArr8, i20, (byte) (i18 | 128));
                int i21 = i18 >>> 7;
                if ((i21 & (-128)) == 0) {
                    byte[] bArr9 = this.f28073e;
                    int i22 = this.f28076h;
                    this.f28076h = i22 + 1;
                    fn.b0.H(bArr9, i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f28073e;
                int i23 = this.f28076h;
                this.f28076h = i23 + 1;
                fn.b0.H(bArr10, i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f28073e;
                int i24 = this.f28076h;
                this.f28076h = i24 + 1;
                fn.b0.H(bArr11, i24, (byte) (i21 >>> 7));
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W0(int i10, long j10) throws IOException {
            T0(i10, 0);
            X0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void X0(long j10) throws IOException {
            if (CodedOutputStream.f28070d && f0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f28073e;
                    int i10 = this.f28076h;
                    this.f28076h = i10 + 1;
                    fn.b0.H(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f28073e;
                int i11 = this.f28076h;
                this.f28076h = i11 + 1;
                fn.b0.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f28073e;
                    int i12 = this.f28076h;
                    this.f28076h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28076h), Integer.valueOf(this.f28075g), 1), e10);
                }
            }
            byte[] bArr4 = this.f28073e;
            int i13 = this.f28076h;
            this.f28076h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void Y0(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f28073e, this.f28076h, i11);
                this.f28076h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28076h), Integer.valueOf(this.f28075g), Integer.valueOf(i11)), e10);
            }
        }

        public final void Z0(int i10, d0 d0Var) throws IOException {
            T0(i10, 2);
            G0(d0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream, fn.b
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            Y0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int f0() {
            return this.f28075g - this.f28076h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(byte b10) throws IOException {
            try {
                byte[] bArr = this.f28073e;
                int i10 = this.f28076h;
                this.f28076h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28076h), Integer.valueOf(this.f28075g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void h0(int i10, boolean z10) throws IOException {
            T0(i10, 0);
            g0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(byte[] bArr, int i10, int i11) throws IOException {
            V0(i11);
            Y0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(int i10, f fVar) throws IOException {
            T0(i10, 2);
            m0(fVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void m0(f fVar) throws IOException {
            V0(fVar.size());
            fVar.N(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(int i10, int i11) throws IOException {
            T0(i10, 5);
            s0(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s0(int i10) throws IOException {
            try {
                byte[] bArr = this.f28073e;
                int i11 = this.f28076h;
                int i12 = i11 + 1;
                this.f28076h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f28076h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f28076h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f28076h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28076h), Integer.valueOf(this.f28075g), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void t0(int i10, long j10) throws IOException {
            T0(i10, 1);
            u0(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void u0(long j10) throws IOException {
            try {
                byte[] bArr = this.f28073e;
                int i10 = this.f28076h;
                int i11 = i10 + 1;
                this.f28076h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f28076h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f28076h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f28076h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f28076h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f28076h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f28076h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f28076h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f28076h), Integer.valueOf(this.f28075g), 1), e10);
            }
        }
    }

    public static int A(int i10, v vVar) {
        return U(i10) + B(vVar);
    }

    public static int B(v vVar) {
        return C(vVar.b());
    }

    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, d0 d0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, d0Var);
    }

    public static int E(int i10, d0 d0Var) {
        return U(i10) + G(d0Var);
    }

    public static int F(int i10, d0 d0Var, fn.v vVar) {
        return U(i10) + H(d0Var, vVar);
    }

    public static int G(d0 d0Var) {
        return C(d0Var.h());
    }

    public static int H(d0 d0Var, fn.v vVar) {
        return C(((com.google.protobuf.a) d0Var).p(vVar));
    }

    public static int I(int i10, f fVar) {
        return (U(1) * 2) + V(2, i10) + g(3, fVar);
    }

    @Deprecated
    public static int J(int i10) {
        return W(i10);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = o0.g(str);
        } catch (o0.d unused) {
            length = str.getBytes(t.f28215a).length;
        }
        return C(length);
    }

    public static int U(int i10) {
        return W(p0.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static CodedOutputStream d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static CodedOutputStream e0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i10, f fVar) {
        return U(i10) + h(fVar);
    }

    public static int h(f fVar) {
        return C(fVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    public static int s(int i10, d0 d0Var, fn.v vVar) {
        return (U(i10) * 2) + u(d0Var, vVar);
    }

    @Deprecated
    public static int t(d0 d0Var) {
        return d0Var.h();
    }

    @Deprecated
    public static int u(d0 d0Var, fn.v vVar) {
        return ((com.google.protobuf.a) d0Var).p(vVar);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return W(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, v vVar) {
        return (U(1) * 2) + V(2, i10) + A(3, vVar);
    }

    @Deprecated
    public final void A0(d0 d0Var, fn.v vVar) throws IOException {
        vVar.b(d0Var, this.f28071a);
    }

    public abstract void B0(int i10, int i11) throws IOException;

    public abstract void C0(int i10) throws IOException;

    public final void D0(int i10, long j10) throws IOException {
        W0(i10, j10);
    }

    public final void E0(long j10) throws IOException {
        X0(j10);
    }

    public abstract void F0(int i10, d0 d0Var, fn.v vVar) throws IOException;

    public abstract void G0(d0 d0Var) throws IOException;

    public abstract void H0(int i10, d0 d0Var) throws IOException;

    public abstract void I0(int i10, f fVar) throws IOException;

    public final void J0(int i10, int i11) throws IOException {
        r0(i10, i11);
    }

    public final void K0(int i10) throws IOException {
        s0(i10);
    }

    public final void L0(int i10, long j10) throws IOException {
        t0(i10, j10);
    }

    public final void M0(long j10) throws IOException {
        u0(j10);
    }

    public final void N0(int i10, int i11) throws IOException {
        U0(i10, Z(i11));
    }

    public final void O0(int i10) throws IOException {
        V0(Z(i10));
    }

    public final void P0(int i10, long j10) throws IOException {
        W0(i10, a0(j10));
    }

    public final void Q0(long j10) throws IOException {
        X0(a0(j10));
    }

    public abstract void R0(int i10, String str) throws IOException;

    public abstract void S0(String str) throws IOException;

    public abstract void T0(int i10, int i11) throws IOException;

    public abstract void U0(int i10, int i11) throws IOException;

    public abstract void V0(int i10) throws IOException;

    public abstract void W0(int i10, long j10) throws IOException;

    public abstract void X0(long j10) throws IOException;

    @Override // fn.b
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    public final void b0(String str, o0.d dVar) throws IOException {
        f28069c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(t.f28215a);
        try {
            V0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    public final void c() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public boolean c0() {
        return this.f28072b;
    }

    public abstract int f0();

    public abstract void g0(byte b10) throws IOException;

    public abstract void h0(int i10, boolean z10) throws IOException;

    public final void i0(boolean z10) throws IOException {
        g0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void j0(byte[] bArr) throws IOException {
        k0(bArr, 0, bArr.length);
    }

    public abstract void k0(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void l0(int i10, f fVar) throws IOException;

    public abstract void m0(f fVar) throws IOException;

    public final void n0(int i10, double d10) throws IOException {
        t0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void o0(double d10) throws IOException {
        u0(Double.doubleToRawLongBits(d10));
    }

    public final void p0(int i10, int i11) throws IOException {
        B0(i10, i11);
    }

    public final void q0(int i10) throws IOException {
        C0(i10);
    }

    public abstract void r0(int i10, int i11) throws IOException;

    public abstract void s0(int i10) throws IOException;

    public abstract void t0(int i10, long j10) throws IOException;

    public abstract void u0(long j10) throws IOException;

    public final void v0(int i10, float f10) throws IOException {
        r0(i10, Float.floatToRawIntBits(f10));
    }

    public final void w0(float f10) throws IOException {
        s0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void x0(int i10, d0 d0Var) throws IOException {
        T0(i10, 3);
        z0(d0Var);
        T0(i10, 4);
    }

    @Deprecated
    public final void y0(int i10, d0 d0Var, fn.v vVar) throws IOException {
        T0(i10, 3);
        A0(d0Var, vVar);
        T0(i10, 4);
    }

    @Deprecated
    public final void z0(d0 d0Var) throws IOException {
        d0Var.l(this);
    }

    public CodedOutputStream() {
    }
}
