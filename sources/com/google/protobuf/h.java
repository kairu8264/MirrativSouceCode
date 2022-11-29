package com.google.protobuf;

import com.google.protobuf.p0;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class h implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f28140a;

    /* renamed from: b  reason: collision with root package name */
    public int f28141b;

    /* renamed from: c  reason: collision with root package name */
    public int f28142c;

    /* renamed from: d  reason: collision with root package name */
    public int f28143d = 0;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28144a;

        static {
            int[] iArr = new int[p0.b.values().length];
            f28144a = iArr;
            try {
                iArr[p0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28144a[p0.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28144a[p0.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28144a[p0.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28144a[p0.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28144a[p0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28144a[p0.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28144a[p0.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28144a[p0.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28144a[p0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28144a[p0.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28144a[p0.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28144a[p0.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28144a[p0.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28144a[p0.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28144a[p0.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28144a[p0.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public h(g gVar) {
        g gVar2 = (g) t.b(gVar, "input");
        this.f28140a = gVar2;
        gVar2.f28125d = this;
    }

    public static h P(g gVar) {
        h hVar = gVar.f28125d;
        return hVar != null ? hVar : new h(gVar);
    }

    @Override // com.google.protobuf.j0
    public void A(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof s) {
            s sVar = (s) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    sVar.Y0(this.f28140a.r());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    sVar.Y0(this.f28140a.r());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f28140a.r()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Integer.valueOf(this.f28140a.r()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public <T> T B(fn.v<T> vVar, l lVar) throws IOException {
        V(3);
        return (T) R(vVar, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.j0
    public <T> void C(List<T> list, fn.v<T> vVar, l lVar) throws IOException {
        int z10;
        if (p0.b(this.f28141b) == 2) {
            int i10 = this.f28141b;
            do {
                list.add(S(vVar, lVar));
                if (this.f28140a.e() || this.f28143d != 0) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == i10);
            this.f28143d = z10;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // com.google.protobuf.j0
    public void D(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof s) {
            s sVar = (s) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 2) {
                int A = this.f28140a.A();
                W(A);
                int d10 = this.f28140a.d() + A;
                do {
                    sVar.Y0(this.f28140a.o());
                } while (this.f28140a.d() < d10);
                return;
            } else if (b10 == 5) {
                do {
                    sVar.Y0(this.f28140a.o());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 2) {
            int A2 = this.f28140a.A();
            W(A2);
            int d11 = this.f28140a.d() + A2;
            do {
                list.add(Integer.valueOf(this.f28140a.o()));
            } while (this.f28140a.d() < d11);
        } else if (b11 == 5) {
            do {
                list.add(Integer.valueOf(this.f28140a.o()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public long E() throws IOException {
        V(0);
        return this.f28140a.w();
    }

    @Override // com.google.protobuf.j0
    public String F() throws IOException {
        V(2);
        return this.f28140a.x();
    }

    @Override // com.google.protobuf.j0
    public int G() throws IOException {
        int i10 = this.f28143d;
        if (i10 != 0) {
            this.f28141b = i10;
            this.f28143d = 0;
        } else {
            this.f28141b = this.f28140a.z();
        }
        int i11 = this.f28141b;
        if (i11 == 0 || i11 == this.f28142c) {
            return Integer.MAX_VALUE;
        }
        return p0.a(i11);
    }

    @Override // com.google.protobuf.j0
    public void H(List<String> list) throws IOException {
        T(list, false);
    }

    @Override // com.google.protobuf.j0
    public void I(List<Float> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof q) {
            q qVar = (q) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 2) {
                int A = this.f28140a.A();
                W(A);
                int d10 = this.f28140a.d() + A;
                do {
                    qVar.j(this.f28140a.q());
                } while (this.f28140a.d() < d10);
                return;
            } else if (b10 == 5) {
                do {
                    qVar.j(this.f28140a.q());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 2) {
            int A2 = this.f28140a.A();
            W(A2);
            int d11 = this.f28140a.d() + A2;
            do {
                list.add(Float.valueOf(this.f28140a.q()));
            } while (this.f28140a.d() < d11);
        } else if (b11 == 5) {
            do {
                list.add(Float.valueOf(this.f28140a.q()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public boolean J() throws IOException {
        int i10;
        if (this.f28140a.e() || (i10 = this.f28141b) == this.f28142c) {
            return false;
        }
        return this.f28140a.C(i10);
    }

    @Override // com.google.protobuf.j0
    public int K() throws IOException {
        V(5);
        return this.f28140a.t();
    }

    @Override // com.google.protobuf.j0
    public void L(List<f> list) throws IOException {
        int z10;
        if (p0.b(this.f28141b) == 2) {
            do {
                list.add(q());
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // com.google.protobuf.j0
    public void M(List<Double> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof j) {
            j jVar = (j) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 1) {
                do {
                    jVar.j(this.f28140a.m());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int A = this.f28140a.A();
                X(A);
                int d10 = this.f28140a.d() + A;
                do {
                    jVar.j(this.f28140a.m());
                } while (this.f28140a.d() < d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 1) {
            do {
                list.add(Double.valueOf(this.f28140a.m()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int A2 = this.f28140a.A();
            X(A2);
            int d11 = this.f28140a.d() + A2;
            do {
                list.add(Double.valueOf(this.f28140a.m()));
            } while (this.f28140a.d() < d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public long N() throws IOException {
        V(0);
        return this.f28140a.s();
    }

    @Override // com.google.protobuf.j0
    public String O() throws IOException {
        V(2);
        return this.f28140a.y();
    }

    public final Object Q(p0.b bVar, Class<?> cls, l lVar) throws IOException {
        switch (a.f28144a[bVar.ordinal()]) {
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

    public final <T> T R(fn.v<T> vVar, l lVar) throws IOException {
        int i10 = this.f28142c;
        this.f28142c = p0.c(p0.a(this.f28141b), 4);
        try {
            T f10 = vVar.f();
            vVar.h(f10, this, lVar);
            vVar.c(f10);
            if (this.f28141b == this.f28142c) {
                return f10;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f28142c = i10;
        }
    }

    public final <T> T S(fn.v<T> vVar, l lVar) throws IOException {
        g gVar;
        int A = this.f28140a.A();
        g gVar2 = this.f28140a;
        if (gVar2.f28122a < gVar2.f28123b) {
            int j10 = gVar2.j(A);
            T f10 = vVar.f();
            this.f28140a.f28122a++;
            vVar.h(f10, this, lVar);
            vVar.c(f10);
            this.f28140a.a(0);
            gVar.f28122a--;
            this.f28140a.i(j10);
            return f10;
        }
        throw InvalidProtocolBufferException.h();
    }

    public void T(List<String> list, boolean z10) throws IOException {
        int z11;
        int z12;
        if (p0.b(this.f28141b) == 2) {
            if ((list instanceof fn.i) && !z10) {
                fn.i iVar = (fn.i) list;
                do {
                    iVar.I(q());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z12 = this.f28140a.z();
                } while (z12 == this.f28141b);
                this.f28143d = z12;
                return;
            }
            do {
                list.add(z10 ? O() : F());
                if (this.f28140a.e()) {
                    return;
                }
                z11 = this.f28140a.z();
            } while (z11 == this.f28141b);
            this.f28143d = z11;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void U(int i10) throws IOException {
        if (this.f28140a.d() != i10) {
            throw InvalidProtocolBufferException.j();
        }
    }

    public final void V(int i10) throws IOException {
        if (p0.b(this.f28141b) != i10) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final void W(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void X(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // com.google.protobuf.j0
    public long a() throws IOException {
        V(1);
        return this.f28140a.p();
    }

    @Override // com.google.protobuf.j0
    public void b(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof s) {
            s sVar = (s) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 2) {
                int A = this.f28140a.A();
                W(A);
                int d10 = this.f28140a.d() + A;
                do {
                    sVar.Y0(this.f28140a.t());
                } while (this.f28140a.d() < d10);
                return;
            } else if (b10 == 5) {
                do {
                    sVar.Y0(this.f28140a.t());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 2) {
            int A2 = this.f28140a.A();
            W(A2);
            int d11 = this.f28140a.d() + A2;
            do {
                list.add(Integer.valueOf(this.f28140a.t()));
            } while (this.f28140a.d() < d11);
        } else if (b11 == 5) {
            do {
                list.add(Integer.valueOf(this.f28140a.t()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public void c(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    yVar.k(this.f28140a.w());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    yVar.k(this.f28140a.w());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f28140a.w()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Long.valueOf(this.f28140a.w()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public boolean d() throws IOException {
        V(0);
        return this.f28140a.k();
    }

    @Override // com.google.protobuf.j0
    public long e() throws IOException {
        V(1);
        return this.f28140a.u();
    }

    @Override // com.google.protobuf.j0
    public void f(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    yVar.k(this.f28140a.B());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    yVar.k(this.f28140a.B());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f28140a.B()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Long.valueOf(this.f28140a.B()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public int g() throws IOException {
        V(0);
        return this.f28140a.A();
    }

    @Override // com.google.protobuf.j0
    public int getTag() {
        return this.f28141b;
    }

    @Override // com.google.protobuf.j0
    public void h(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    yVar.k(this.f28140a.s());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    yVar.k(this.f28140a.s());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f28140a.s()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Long.valueOf(this.f28140a.s()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public void i(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof s) {
            s sVar = (s) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    sVar.Y0(this.f28140a.n());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    sVar.Y0(this.f28140a.n());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f28140a.n()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Integer.valueOf(this.f28140a.n()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public int j() throws IOException {
        V(0);
        return this.f28140a.n();
    }

    @Override // com.google.protobuf.j0
    public int k() throws IOException {
        V(0);
        return this.f28140a.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.j0
    public <T> void l(List<T> list, fn.v<T> vVar, l lVar) throws IOException {
        int z10;
        if (p0.b(this.f28141b) == 3) {
            int i10 = this.f28141b;
            do {
                list.add(R(vVar, lVar));
                if (this.f28140a.e() || this.f28143d != 0) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == i10);
            this.f28143d = z10;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // com.google.protobuf.j0
    public void m(List<Boolean> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof e) {
            e eVar = (e) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    eVar.k(this.f28140a.k());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    eVar.k(this.f28140a.k());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Boolean.valueOf(this.f28140a.k()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Boolean.valueOf(this.f28140a.k()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public <T> T n(Class<T> cls, l lVar) throws IOException {
        V(3);
        return (T) R(fn.t.a().d(cls), lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void o(java.util.Map<K, V> r8, com.google.protobuf.z.a<K, V> r9, com.google.protobuf.l r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            com.google.protobuf.g r1 = r7.f28140a
            int r1 = r1.A()
            com.google.protobuf.g r2 = r7.f28140a
            int r1 = r2.j(r1)
            K r2 = r9.f28241b
            V r3 = r9.f28243d
        L14:
            int r4 = r7.G()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.g r5 = r7.f28140a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.J()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.p0$b r4 = r9.f28242c     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f28243d     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.Q(r4, r5, r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.p0$b r4 = r9.f28240a     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.Q(r4, r5, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.J()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.g r8 = r7.f28140a
            r8.i(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.g r9 = r7.f28140a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.o(java.util.Map, com.google.protobuf.z$a, com.google.protobuf.l):void");
    }

    @Override // com.google.protobuf.j0
    public void p(List<String> list) throws IOException {
        T(list, true);
    }

    @Override // com.google.protobuf.j0
    public f q() throws IOException {
        V(2);
        return this.f28140a.l();
    }

    @Override // com.google.protobuf.j0
    public int r() throws IOException {
        V(0);
        return this.f28140a.r();
    }

    @Override // com.google.protobuf.j0
    public double readDouble() throws IOException {
        V(1);
        return this.f28140a.m();
    }

    @Override // com.google.protobuf.j0
    public float readFloat() throws IOException {
        V(5);
        return this.f28140a.q();
    }

    @Override // com.google.protobuf.j0
    public <T> T s(fn.v<T> vVar, l lVar) throws IOException {
        V(2);
        return (T) S(vVar, lVar);
    }

    @Override // com.google.protobuf.j0
    public void t(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 1) {
                do {
                    yVar.k(this.f28140a.p());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int A = this.f28140a.A();
                X(A);
                int d10 = this.f28140a.d() + A;
                do {
                    yVar.k(this.f28140a.p());
                } while (this.f28140a.d() < d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 1) {
            do {
                list.add(Long.valueOf(this.f28140a.p()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int A2 = this.f28140a.A();
            X(A2);
            int d11 = this.f28140a.d() + A2;
            do {
                list.add(Long.valueOf(this.f28140a.p()));
            } while (this.f28140a.d() < d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public void u(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof s) {
            s sVar = (s) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    sVar.Y0(this.f28140a.v());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    sVar.Y0(this.f28140a.v());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f28140a.v()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Integer.valueOf(this.f28140a.v()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public long v() throws IOException {
        V(0);
        return this.f28140a.B();
    }

    @Override // com.google.protobuf.j0
    public void w(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof s) {
            s sVar = (s) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 0) {
                do {
                    sVar.Y0(this.f28140a.A());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int d10 = this.f28140a.d() + this.f28140a.A();
                do {
                    sVar.Y0(this.f28140a.A());
                } while (this.f28140a.d() < d10);
                U(d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f28140a.A()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int d11 = this.f28140a.d() + this.f28140a.A();
            do {
                list.add(Integer.valueOf(this.f28140a.A()));
            } while (this.f28140a.d() < d11);
            U(d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.j0
    public <T> T x(Class<T> cls, l lVar) throws IOException {
        V(2);
        return (T) S(fn.t.a().d(cls), lVar);
    }

    @Override // com.google.protobuf.j0
    public int y() throws IOException {
        V(5);
        return this.f28140a.o();
    }

    @Override // com.google.protobuf.j0
    public void z(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = p0.b(this.f28141b);
            if (b10 == 1) {
                do {
                    yVar.k(this.f28140a.u());
                    if (this.f28140a.e()) {
                        return;
                    }
                    z11 = this.f28140a.z();
                } while (z11 == this.f28141b);
                this.f28143d = z11;
                return;
            } else if (b10 == 2) {
                int A = this.f28140a.A();
                X(A);
                int d10 = this.f28140a.d() + A;
                do {
                    yVar.k(this.f28140a.u());
                } while (this.f28140a.d() < d10);
                return;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
        int b11 = p0.b(this.f28141b);
        if (b11 == 1) {
            do {
                list.add(Long.valueOf(this.f28140a.u()));
                if (this.f28140a.e()) {
                    return;
                }
                z10 = this.f28140a.z();
            } while (z10 == this.f28141b);
            this.f28143d = z10;
        } else if (b11 == 2) {
            int A2 = this.f28140a.A();
            X(A2);
            int d11 = this.f28140a.d() + A2;
            do {
                list.add(Long.valueOf(this.f28140a.u()));
            } while (this.f28140a.d() < d11);
        } else {
            throw InvalidProtocolBufferException.d();
        }
    }
}
