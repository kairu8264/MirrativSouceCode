package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.p.b;
import com.google.protobuf.p0;
import com.google.protobuf.t;
import com.google.protobuf.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class p<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final p f28189d = new p(true);

    /* renamed from: a  reason: collision with root package name */
    public final l0<T, Object> f28190a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28191b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28192c;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28193a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f28194b;

        static {
            int[] iArr = new int[p0.b.values().length];
            f28194b = iArr;
            try {
                iArr[p0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28194b[p0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28194b[p0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28194b[p0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28194b[p0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28194b[p0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28194b[p0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28194b[p0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28194b[p0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28194b[p0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28194b[p0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28194b[p0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28194b[p0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28194b[p0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28194b[p0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28194b[p0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28194b[p0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28194b[p0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[p0.c.values().length];
            f28193a = iArr2;
            try {
                iArr2[p0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f28193a[p0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f28193a[p0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f28193a[p0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f28193a[p0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f28193a[p0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f28193a[p0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f28193a[p0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f28193a[p0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        d0.a d(d0.a aVar, d0 d0Var);

        boolean f();

        p0.b g();

        int getNumber();

        p0.c j();

        boolean k();
    }

    public p() {
        this.f28190a = l0.v(16);
    }

    public static void A(CodedOutputStream codedOutputStream, p0.b bVar, Object obj) throws IOException {
        switch (a.f28194b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.o0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.w0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.E0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.X0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.C0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.u0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.s0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.i0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.z0((d0) obj);
                return;
            case 10:
                codedOutputStream.G0((d0) obj);
                return;
            case 11:
                if (obj instanceof f) {
                    codedOutputStream.m0((f) obj);
                    return;
                } else {
                    codedOutputStream.S0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof f) {
                    codedOutputStream.m0((f) obj);
                    return;
                } else {
                    codedOutputStream.j0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.V0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.K0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.M0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.O0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.Q0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof t.c) {
                    codedOutputStream.q0(((t.c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.q0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int d(p0.b bVar, int i10, Object obj) {
        int U = CodedOutputStream.U(i10);
        if (bVar == p0.b.GROUP) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    public static int e(p0.b bVar, Object obj) {
        switch (a.f28194b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((d0) obj);
            case 10:
                if (obj instanceof u) {
                    return CodedOutputStream.B((u) obj);
                }
                return CodedOutputStream.G((d0) obj);
            case 11:
                if (obj instanceof f) {
                    return CodedOutputStream.h((f) obj);
                }
                return CodedOutputStream.T((String) obj);
            case 12:
                if (obj instanceof f) {
                    return CodedOutputStream.h((f) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                if (obj instanceof t.c) {
                    return CodedOutputStream.l(((t.c) obj).getNumber());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        p0.b g10 = bVar.g();
        int number = bVar.getNumber();
        if (bVar.f()) {
            int i10 = 0;
            if (bVar.k()) {
                for (Object obj2 : (List) obj) {
                    i10 += e(g10, obj2);
                }
                return CodedOutputStream.U(number) + i10 + CodedOutputStream.J(i10);
            }
            for (Object obj3 : (List) obj) {
                i10 += d(g10, number, obj3);
            }
            return i10;
        }
        return d(g10, number, obj);
    }

    public static <T extends b<T>> p<T> h() {
        return f28189d;
    }

    public static int m(p0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.c();
    }

    public static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.j() == p0.c.MESSAGE) {
            if (key.f()) {
                for (d0 d0Var : (List) entry.getValue()) {
                    if (!d0Var.r()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof d0) {
                    if (!((d0) value).r()) {
                        return false;
                    }
                } else if (value instanceof u) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public static boolean r(p0.b bVar, Object obj) {
        t.a(obj);
        switch (a.f28193a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof f) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof t.c);
            case 9:
                return (obj instanceof d0) || (obj instanceof u);
            default:
                return false;
        }
    }

    public static <T extends b<T>> p<T> w() {
        return new p<>();
    }

    public static void z(CodedOutputStream codedOutputStream, p0.b bVar, int i10, Object obj) throws IOException {
        if (bVar == p0.b.GROUP) {
            codedOutputStream.x0(i10, (d0) obj);
            return;
        }
        codedOutputStream.T0(i10, m(bVar, false));
        A(codedOutputStream, bVar, obj);
    }

    public void a(T t10, Object obj) {
        List list;
        if (t10.f()) {
            y(t10.g(), obj);
            Object i10 = i(t10);
            if (i10 == null) {
                list = new ArrayList();
                this.f28190a.put(t10, list);
            } else {
                list = (List) i10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public p<T> clone() {
        p<T> w10 = w();
        for (int i10 = 0; i10 < this.f28190a.p(); i10++) {
            Map.Entry<T, Object> o10 = this.f28190a.o(i10);
            w10.x(o10.getKey(), o10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f28190a.r()) {
            w10.x(entry.getKey(), entry.getValue());
        }
        w10.f28192c = this.f28192c;
        return w10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f28190a.equals(((p) obj).f28190a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        if (this.f28192c) {
            return new u.c(this.f28190a.k().iterator());
        }
        return this.f28190a.k().iterator();
    }

    public int hashCode() {
        return this.f28190a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f28190a.get(t10);
        return obj instanceof u ? ((u) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28190a.p(); i11++) {
            i10 += k(this.f28190a.o(i11));
        }
        for (Map.Entry<T, Object> entry : this.f28190a.r()) {
            i10 += k(entry);
        }
        return i10;
    }

    public final int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.j() == p0.c.MESSAGE && !key.f() && !key.k()) {
            if (value instanceof u) {
                return CodedOutputStream.z(entry.getKey().getNumber(), (u) value);
            }
            return CodedOutputStream.D(entry.getKey().getNumber(), (d0) value);
        }
        return f(key, value);
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28190a.p(); i11++) {
            Map.Entry<T, Object> o10 = this.f28190a.o(i11);
            i10 += f(o10.getKey(), o10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f28190a.r()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean n() {
        return this.f28190a.isEmpty();
    }

    public boolean o() {
        return this.f28191b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f28190a.p(); i10++) {
            if (!q(this.f28190a.o(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f28190a.r()) {
            if (!q(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        if (this.f28192c) {
            return new u.c(this.f28190a.entrySet().iterator());
        }
        return this.f28190a.entrySet().iterator();
    }

    public void t() {
        if (this.f28191b) {
            return;
        }
        this.f28190a.u();
        this.f28191b = true;
    }

    public void u(p<T> pVar) {
        for (int i10 = 0; i10 < pVar.f28190a.p(); i10++) {
            v(pVar.f28190a.o(i10));
        }
        for (Map.Entry<T, Object> entry : pVar.f28190a.r()) {
            v(entry);
        }
    }

    public final void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof u) {
            value = ((u) value).f();
        }
        if (key.f()) {
            Object i10 = i(key);
            if (i10 == null) {
                i10 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) i10).add(c(obj));
            }
            this.f28190a.put(key, i10);
        } else if (key.j() == p0.c.MESSAGE) {
            Object i11 = i(key);
            if (i11 == null) {
                this.f28190a.put(key, c(value));
                return;
            }
            this.f28190a.put(key, key.d(((d0) i11).c(), (d0) value).a());
        } else {
            this.f28190a.put(key, c(value));
        }
    }

    public void x(T t10, Object obj) {
        if (t10.f()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    y(t10.g(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            y(t10.g(), obj);
        }
        if (obj instanceof u) {
            this.f28192c = true;
        }
        this.f28190a.put(t10, obj);
    }

    public final void y(p0.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public p(boolean z10) {
        this(l0.v(0));
        t();
    }

    public p(l0<T, Object> l0Var) {
        this.f28190a = l0Var;
        t();
    }
}
