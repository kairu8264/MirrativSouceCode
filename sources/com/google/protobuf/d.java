package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.p0;
import com.google.protobuf.z;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class d implements j0 {

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28083a;

        static {
            int[] iArr = new int[p0.b.values().length];
            f28083a = iArr;
            try {
                iArr[p0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28083a[p0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28083a[p0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28083a[p0.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28083a[p0.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28083a[p0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28083a[p0.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28083a[p0.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28083a[p0.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28083a[p0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28083a[p0.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28083a[p0.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28083a[p0.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28083a[p0.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28083a[p0.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28083a[p0.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28083a[p0.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f28084a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f28085b;

        /* renamed from: c  reason: collision with root package name */
        public int f28086c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28087d;

        /* renamed from: e  reason: collision with root package name */
        public int f28088e;

        /* renamed from: f  reason: collision with root package name */
        public int f28089f;

        /* renamed from: g  reason: collision with root package name */
        public int f28090g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f28084a = z10;
            this.f28085b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f28086c = arrayOffset;
            this.f28087d = arrayOffset;
            this.f28088e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // com.google.protobuf.j0
        public void A(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof s) {
                s sVar = (s) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 0) {
                    do {
                        sVar.Y0(r());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else if (b10 == 2) {
                    int b02 = this.f28086c + b0();
                    while (this.f28086c < b02) {
                        sVar.Y0(b0());
                    }
                    f0(b02);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(r()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else if (b11 == 2) {
                int b03 = this.f28086c + b0();
                while (this.f28086c < b03) {
                    list.add(Integer.valueOf(b0()));
                }
                f0(b03);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.j0
        public <T> T B(fn.v<T> vVar, l lVar) throws IOException {
            g0(3);
            return (T) T(vVar, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.j0
        public <T> void C(List<T> list, fn.v<T> vVar, l lVar) throws IOException {
            int i10;
            if (p0.b(this.f28089f) == 2) {
                int i11 = this.f28089f;
                do {
                    list.add(Y(vVar, lVar));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == i11);
                this.f28086c = i10;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.j0
        public void D(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof s) {
                s sVar = (s) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f28086c + b02;
                    while (this.f28086c < i12) {
                        sVar.Y0(V());
                    }
                    return;
                } else if (b10 == 5) {
                    do {
                        sVar.Y0(y());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f28086c + b03;
                while (this.f28086c < i13) {
                    list.add(Integer.valueOf(V()));
                }
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(y()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.j0
        public long E() throws IOException {
            g0(0);
            return g.c(c0());
        }

        @Override // com.google.protobuf.j0
        public String F() throws IOException {
            return Z(false);
        }

        @Override // com.google.protobuf.j0
        public int G() throws IOException {
            if (Q()) {
                return Integer.MAX_VALUE;
            }
            int b02 = b0();
            this.f28089f = b02;
            if (b02 == this.f28090g) {
                return Integer.MAX_VALUE;
            }
            return p0.a(b02);
        }

        @Override // com.google.protobuf.j0
        public void H(List<String> list) throws IOException {
            a0(list, false);
        }

        @Override // com.google.protobuf.j0
        public void I(List<Float> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof q) {
                q qVar = (q) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f28086c + b02;
                    while (this.f28086c < i12) {
                        qVar.j(Float.intBitsToFloat(V()));
                    }
                    return;
                } else if (b10 == 5) {
                    do {
                        qVar.j(readFloat());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f28086c + b03;
                while (this.f28086c < i13) {
                    list.add(Float.valueOf(Float.intBitsToFloat(V())));
                }
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.j0
        public boolean J() throws IOException {
            int i10;
            if (Q() || (i10 = this.f28089f) == this.f28090g) {
                return false;
            }
            int b10 = p0.b(i10);
            if (b10 == 0) {
                j0();
                return true;
            } else if (b10 == 1) {
                h0(8);
                return true;
            } else if (b10 == 2) {
                h0(b0());
                return true;
            } else if (b10 == 3) {
                i0();
                return true;
            } else if (b10 == 5) {
                h0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.j0
        public int K() throws IOException {
            g0(5);
            return U();
        }

        @Override // com.google.protobuf.j0
        public void L(List<f> list) throws IOException {
            int i10;
            if (p0.b(this.f28089f) == 2) {
                do {
                    list.add(q());
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.j0
        public void M(List<Double> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof j) {
                j jVar = (j) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 1) {
                    do {
                        jVar.j(readDouble());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else if (b10 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f28086c + b02;
                    while (this.f28086c < i12) {
                        jVar.j(Double.longBitsToDouble(X()));
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else if (b11 == 2) {
                int b03 = b0();
                m0(b03);
                int i13 = this.f28086c + b03;
                while (this.f28086c < i13) {
                    list.add(Double.valueOf(Double.longBitsToDouble(X())));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.j0
        public long N() throws IOException {
            g0(0);
            return c0();
        }

        @Override // com.google.protobuf.j0
        public String O() throws IOException {
            return Z(true);
        }

        public final boolean Q() {
            return this.f28086c == this.f28088e;
        }

        public final byte R() throws IOException {
            int i10 = this.f28086c;
            if (i10 != this.f28088e) {
                byte[] bArr = this.f28085b;
                this.f28086c = i10 + 1;
                return bArr[i10];
            }
            throw InvalidProtocolBufferException.j();
        }

        public final Object S(p0.b bVar, Class<?> cls, l lVar) throws IOException {
            switch (a.f28083a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(d());
                case 2:
                    return q();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(j());
                case 5:
                    return Integer.valueOf(y());
                case 6:
                    return Long.valueOf(a());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(r());
                case 9:
                    return Long.valueOf(N());
                case 10:
                    return x(cls, lVar);
                case 11:
                    return Integer.valueOf(K());
                case 12:
                    return Long.valueOf(e());
                case 13:
                    return Integer.valueOf(k());
                case 14:
                    return Long.valueOf(E());
                case 15:
                    return O();
                case 16:
                    return Integer.valueOf(g());
                case 17:
                    return Long.valueOf(v());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        public final <T> T T(fn.v<T> vVar, l lVar) throws IOException {
            int i10 = this.f28090g;
            this.f28090g = p0.c(p0.a(this.f28089f), 4);
            try {
                T f10 = vVar.f();
                vVar.h(f10, this, lVar);
                vVar.c(f10);
                if (this.f28089f == this.f28090g) {
                    return f10;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f28090g = i10;
            }
        }

        public final int U() throws IOException {
            e0(4);
            return V();
        }

        public final int V() {
            int i10 = this.f28086c;
            byte[] bArr = this.f28085b;
            this.f28086c = i10 + 4;
            return ((bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) << 24) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 16);
        }

        public final long W() throws IOException {
            e0(8);
            return X();
        }

        public final long X() {
            int i10 = this.f28086c;
            byte[] bArr = this.f28085b;
            this.f28086c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public final <T> T Y(fn.v<T> vVar, l lVar) throws IOException {
            int b02 = b0();
            e0(b02);
            int i10 = this.f28088e;
            int i11 = this.f28086c + b02;
            this.f28088e = i11;
            try {
                T f10 = vVar.f();
                vVar.h(f10, this, lVar);
                vVar.c(f10);
                if (this.f28086c == i11) {
                    return f10;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f28088e = i10;
            }
        }

        public String Z(boolean z10) throws IOException {
            g0(2);
            int b02 = b0();
            if (b02 == 0) {
                return "";
            }
            e0(b02);
            if (z10) {
                byte[] bArr = this.f28085b;
                int i10 = this.f28086c;
                if (!o0.n(bArr, i10, i10 + b02)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.f28085b, this.f28086c, b02, t.f28215a);
            this.f28086c += b02;
            return str;
        }

        @Override // com.google.protobuf.j0
        public long a() throws IOException {
            g0(1);
            return W();
        }

        public void a0(List<String> list, boolean z10) throws IOException {
            int i10;
            int i11;
            if (p0.b(this.f28089f) == 2) {
                if ((list instanceof fn.i) && !z10) {
                    fn.i iVar = (fn.i) list;
                    do {
                        iVar.I(q());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                }
                do {
                    list.add(Z(z10));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.j0
        public void b(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof s) {
                s sVar = (s) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f28086c + b02;
                    while (this.f28086c < i12) {
                        sVar.Y0(V());
                    }
                    return;
                } else if (b10 == 5) {
                    do {
                        sVar.Y0(K());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f28086c + b03;
                while (this.f28086c < i13) {
                    list.add(Integer.valueOf(V()));
                }
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(K()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final int b0() throws IOException {
            int i10;
            int i11 = this.f28086c;
            int i12 = this.f28088e;
            if (i12 != i11) {
                byte[] bArr = this.f28085b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f28086c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return (int) d0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f28086c = i14;
                    return i10;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.protobuf.j0
        public void c(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = p0.b(this.f28089f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int b02 = this.f28086c + b0();
                        while (this.f28086c < b02) {
                            yVar.k(g.c(c0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    yVar.k(E());
                    if (Q()) {
                        return;
                    }
                    i11 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i11;
                return;
            }
            int b11 = p0.b(this.f28089f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int b03 = this.f28086c + b0();
                    while (this.f28086c < b03) {
                        list.add(Long.valueOf(g.c(c0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(E()));
                if (Q()) {
                    return;
                }
                i10 = this.f28086c;
            } while (b0() == this.f28089f);
            this.f28086c = i10;
        }

        public long c0() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f28086c;
            int i12 = this.f28088e;
            if (i12 != i11) {
                byte[] bArr = this.f28085b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f28086c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return d0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i14 = i16;
                            j10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = j13 ^ (bArr[i14] << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i14 = i19 + 1;
                                    long j15 = j14 ^ (bArr[i19] << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i19 = i14 + 1;
                                        j14 = j15 ^ (bArr[i14] << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i14 = i19 + 1;
                                            j15 = j14 ^ (bArr[i19] << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i20 = i14 + 1;
                                                long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i14 = i20 + 1;
                                                    if (bArr[i20] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                } else {
                                                    i14 = i20;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i14 = i19;
                            }
                        }
                        this.f28086c = i14;
                        return j10;
                    }
                    i10 = i15 ^ (-128);
                    j10 = i10;
                    this.f28086c = i14;
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.protobuf.j0
        public boolean d() throws IOException {
            g0(0);
            return b0() != 0;
        }

        public final long d0() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte R = R();
                j10 |= (R & Byte.MAX_VALUE) << i10;
                if ((R & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.protobuf.j0
        public long e() throws IOException {
            g0(1);
            return W();
        }

        public final void e0(int i10) throws IOException {
            if (i10 < 0 || i10 > this.f28088e - this.f28086c) {
                throw InvalidProtocolBufferException.j();
            }
        }

        @Override // com.google.protobuf.j0
        public void f(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 0) {
                    do {
                        yVar.k(v());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else if (b10 == 2) {
                    int b02 = this.f28086c + b0();
                    while (this.f28086c < b02) {
                        yVar.k(c0());
                    }
                    f0(b02);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(v()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else if (b11 == 2) {
                int b03 = this.f28086c + b0();
                while (this.f28086c < b03) {
                    list.add(Long.valueOf(c0()));
                }
                f0(b03);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final void f0(int i10) throws IOException {
            if (this.f28086c != i10) {
                throw InvalidProtocolBufferException.j();
            }
        }

        @Override // com.google.protobuf.j0
        public int g() throws IOException {
            g0(0);
            return b0();
        }

        public final void g0(int i10) throws IOException {
            if (p0.b(this.f28089f) != i10) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.j0
        public int getTag() {
            return this.f28089f;
        }

        @Override // com.google.protobuf.j0
        public void h(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 0) {
                    do {
                        yVar.k(N());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else if (b10 == 2) {
                    int b02 = this.f28086c + b0();
                    while (this.f28086c < b02) {
                        yVar.k(c0());
                    }
                    f0(b02);
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(N()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else if (b11 == 2) {
                int b03 = this.f28086c + b0();
                while (this.f28086c < b03) {
                    list.add(Long.valueOf(c0()));
                }
                f0(b03);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public final void h0(int i10) throws IOException {
            e0(i10);
            this.f28086c += i10;
        }

        @Override // com.google.protobuf.j0
        public void i(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof s) {
                s sVar = (s) list;
                int b10 = p0.b(this.f28089f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int b02 = this.f28086c + b0();
                        while (this.f28086c < b02) {
                            sVar.Y0(b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    sVar.Y0(j());
                    if (Q()) {
                        return;
                    }
                    i11 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i11;
                return;
            }
            int b11 = p0.b(this.f28089f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int b03 = this.f28086c + b0();
                    while (this.f28086c < b03) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(j()));
                if (Q()) {
                    return;
                }
                i10 = this.f28086c;
            } while (b0() == this.f28089f);
            this.f28086c = i10;
        }

        public final void i0() throws IOException {
            int i10 = this.f28090g;
            this.f28090g = p0.c(p0.a(this.f28089f), 4);
            while (G() != Integer.MAX_VALUE && J()) {
            }
            if (this.f28089f == this.f28090g) {
                this.f28090g = i10;
                return;
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.protobuf.j0
        public int j() throws IOException {
            g0(0);
            return b0();
        }

        public final void j0() throws IOException {
            int i10 = this.f28088e;
            int i11 = this.f28086c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f28085b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f28086c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            k0();
        }

        @Override // com.google.protobuf.j0
        public int k() throws IOException {
            g0(0);
            return g.b(b0());
        }

        public final void k0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.j0
        public <T> void l(List<T> list, fn.v<T> vVar, l lVar) throws IOException {
            int i10;
            if (p0.b(this.f28089f) == 3) {
                int i11 = this.f28089f;
                do {
                    list.add(T(vVar, lVar));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == i11);
                this.f28086c = i10;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public final void l0(int i10) throws IOException {
            e0(i10);
            if ((i10 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // com.google.protobuf.j0
        public void m(List<Boolean> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof e) {
                e eVar = (e) list;
                int b10 = p0.b(this.f28089f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int b02 = this.f28086c + b0();
                        while (this.f28086c < b02) {
                            eVar.k(b0() != 0);
                        }
                        f0(b02);
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    eVar.k(d());
                    if (Q()) {
                        return;
                    }
                    i11 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i11;
                return;
            }
            int b11 = p0.b(this.f28089f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int b03 = this.f28086c + b0();
                    while (this.f28086c < b03) {
                        list.add(Boolean.valueOf(b0() != 0));
                    }
                    f0(b03);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Boolean.valueOf(d()));
                if (Q()) {
                    return;
                }
                i10 = this.f28086c;
            } while (b0() == this.f28089f);
            this.f28086c = i10;
        }

        public final void m0(int i10) throws IOException {
            e0(i10);
            if ((i10 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // com.google.protobuf.j0
        public <T> T n(Class<T> cls, l lVar) throws IOException {
            g0(3);
            return (T) T(fn.t.a().d(cls), lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.j0
        public <K, V> void o(Map<K, V> map, z.a<K, V> aVar, l lVar) throws IOException {
            g0(2);
            int b02 = b0();
            e0(b02);
            int i10 = this.f28088e;
            this.f28088e = this.f28086c + b02;
            try {
                Object obj = aVar.f28241b;
                Object obj2 = aVar.f28243d;
                while (true) {
                    int G = G();
                    if (G == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (G == 1) {
                        obj = S(aVar.f28240a, null, null);
                    } else if (G != 2) {
                        try {
                            if (!J()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!J()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = S(aVar.f28242c, aVar.f28243d.getClass(), lVar);
                    }
                }
            } finally {
                this.f28088e = i10;
            }
        }

        @Override // com.google.protobuf.j0
        public void p(List<String> list) throws IOException {
            a0(list, true);
        }

        @Override // com.google.protobuf.j0
        public f q() throws IOException {
            f k10;
            g0(2);
            int b02 = b0();
            if (b02 == 0) {
                return f.f28094x;
            }
            e0(b02);
            if (this.f28084a) {
                k10 = f.M(this.f28085b, this.f28086c, b02);
            } else {
                k10 = f.k(this.f28085b, this.f28086c, b02);
            }
            this.f28086c += b02;
            return k10;
        }

        @Override // com.google.protobuf.j0
        public int r() throws IOException {
            g0(0);
            return b0();
        }

        @Override // com.google.protobuf.j0
        public double readDouble() throws IOException {
            g0(1);
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.protobuf.j0
        public float readFloat() throws IOException {
            g0(5);
            return Float.intBitsToFloat(U());
        }

        @Override // com.google.protobuf.j0
        public <T> T s(fn.v<T> vVar, l lVar) throws IOException {
            g0(2);
            return (T) Y(vVar, lVar);
        }

        @Override // com.google.protobuf.j0
        public void t(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 1) {
                    do {
                        yVar.k(a());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else if (b10 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f28086c + b02;
                    while (this.f28086c < i12) {
                        yVar.k(X());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(a()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else if (b11 == 2) {
                int b03 = b0();
                m0(b03);
                int i13 = this.f28086c + b03;
                while (this.f28086c < i13) {
                    list.add(Long.valueOf(X()));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.j0
        public void u(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof s) {
                s sVar = (s) list;
                int b10 = p0.b(this.f28089f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int b02 = this.f28086c + b0();
                        while (this.f28086c < b02) {
                            sVar.Y0(g.b(b0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    sVar.Y0(k());
                    if (Q()) {
                        return;
                    }
                    i11 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i11;
                return;
            }
            int b11 = p0.b(this.f28089f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int b03 = this.f28086c + b0();
                    while (this.f28086c < b03) {
                        list.add(Integer.valueOf(g.b(b0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(k()));
                if (Q()) {
                    return;
                }
                i10 = this.f28086c;
            } while (b0() == this.f28089f);
            this.f28086c = i10;
        }

        @Override // com.google.protobuf.j0
        public long v() throws IOException {
            g0(0);
            return c0();
        }

        @Override // com.google.protobuf.j0
        public void w(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof s) {
                s sVar = (s) list;
                int b10 = p0.b(this.f28089f);
                if (b10 != 0) {
                    if (b10 == 2) {
                        int b02 = this.f28086c + b0();
                        while (this.f28086c < b02) {
                            sVar.Y0(b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    sVar.Y0(g());
                    if (Q()) {
                        return;
                    }
                    i11 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i11;
                return;
            }
            int b11 = p0.b(this.f28089f);
            if (b11 != 0) {
                if (b11 == 2) {
                    int b03 = this.f28086c + b0();
                    while (this.f28086c < b03) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(g()));
                if (Q()) {
                    return;
                }
                i10 = this.f28086c;
            } while (b0() == this.f28089f);
            this.f28086c = i10;
        }

        @Override // com.google.protobuf.j0
        public <T> T x(Class<T> cls, l lVar) throws IOException {
            g0(2);
            return (T) Y(fn.t.a().d(cls), lVar);
        }

        @Override // com.google.protobuf.j0
        public int y() throws IOException {
            g0(5);
            return U();
        }

        @Override // com.google.protobuf.j0
        public void z(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int b10 = p0.b(this.f28089f);
                if (b10 == 1) {
                    do {
                        yVar.k(e());
                        if (Q()) {
                            return;
                        }
                        i11 = this.f28086c;
                    } while (b0() == this.f28089f);
                    this.f28086c = i11;
                    return;
                } else if (b10 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f28086c + b02;
                    while (this.f28086c < i12) {
                        yVar.k(X());
                    }
                    return;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            int b11 = p0.b(this.f28089f);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(e()));
                    if (Q()) {
                        return;
                    }
                    i10 = this.f28086c;
                } while (b0() == this.f28089f);
                this.f28086c = i10;
            } else if (b11 == 2) {
                int b03 = b0();
                m0(b03);
                int i13 = this.f28086c + b03;
                while (this.f28086c < i13) {
                    list.add(Long.valueOf(X()));
                }
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    public static d P(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public d() {
    }
}
