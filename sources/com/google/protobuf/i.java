package com.google.protobuf;

import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.z;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class i implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f28145a;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28146a;

        static {
            int[] iArr = new int[p0.b.values().length];
            f28146a = iArr;
            try {
                iArr[p0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28146a[p0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28146a[p0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28146a[p0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28146a[p0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28146a[p0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28146a[p0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28146a[p0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28146a[p0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28146a[p0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28146a[p0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28146a[p0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) t.b(codedOutputStream, "output");
        this.f28145a = codedOutputStream2;
        codedOutputStream2.f28071a = this;
    }

    public static i P(CodedOutputStream codedOutputStream) {
        i iVar = codedOutputStream.f28071a;
        return iVar != null ? iVar : new i(codedOutputStream);
    }

    @Override // com.google.protobuf.q0
    public void A(int i10, int i11) throws IOException {
        this.f28145a.J0(i10, i11);
    }

    @Override // com.google.protobuf.q0
    public void B(int i10) throws IOException {
        this.f28145a.T0(i10, 3);
    }

    @Override // com.google.protobuf.q0
    public void C(int i10, Object obj, fn.v vVar) throws IOException {
        this.f28145a.F0(i10, (d0) obj, vVar);
    }

    @Override // com.google.protobuf.q0
    public void D(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.p(list.get(i13).longValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.u0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.t0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void E(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.L(list.get(i13).intValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.K0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.J0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void F(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.e(list.get(i13).booleanValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.i0(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.h0(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public <K, V> void G(int i10, z.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f28145a.c0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f28145a.T0(i10, 2);
            this.f28145a.V0(z.b(aVar, entry.getKey(), entry.getValue()));
            z.e(this.f28145a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.q0
    public void H(int i10, float f10) throws IOException {
        this.f28145a.v0(i10, f10);
    }

    @Override // com.google.protobuf.q0
    public void I(int i10) throws IOException {
        this.f28145a.T0(i10, 4);
    }

    @Override // com.google.protobuf.q0
    public void J(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.P(list.get(i13).intValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.O0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.N0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void K(int i10, int i11) throws IOException {
        this.f28145a.p0(i10, i11);
    }

    @Override // com.google.protobuf.q0
    public void L(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.y(list.get(i13).longValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.E0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.D0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void M(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.j(list.get(i13).doubleValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.o0(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.n0(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void N(int i10, int i11) throws IOException {
        this.f28145a.N0(i10, i11);
    }

    @Override // com.google.protobuf.q0
    public void O(int i10, List<f> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f28145a.l0(i10, list.get(i11));
        }
    }

    public final <V> void Q(int i10, boolean z10, V v10, z.a<Boolean, V> aVar) throws IOException {
        this.f28145a.T0(i10, 2);
        this.f28145a.V0(z.b(aVar, Boolean.valueOf(z10), v10));
        z.e(this.f28145a, aVar, Boolean.valueOf(z10), v10);
    }

    public final <V> void R(int i10, z.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer num : map.keySet()) {
            iArr[i11] = num.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f28145a.T0(i10, 2);
            this.f28145a.V0(z.b(aVar, Integer.valueOf(i13), v10));
            z.e(this.f28145a, aVar, Integer.valueOf(i13), v10);
        }
    }

    public final <V> void S(int i10, z.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long l10 : map.keySet()) {
            jArr[i11] = l10.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f28145a.T0(i10, 2);
            this.f28145a.V0(z.b(aVar, Long.valueOf(j10), v10));
            z.e(this.f28145a, aVar, Long.valueOf(j10), v10);
        }
    }

    public final <K, V> void T(int i10, z.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f28146a[aVar.f28240a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f28240a);
        }
    }

    public final <V> void U(int i10, z.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            V v10 = map.get(str2);
            this.f28145a.T0(i10, 2);
            this.f28145a.V0(z.b(aVar, str2, v10));
            z.e(this.f28145a, aVar, str2, v10);
        }
    }

    public final void V(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f28145a.R0(i10, (String) obj);
        } else {
            this.f28145a.l0(i10, (f) obj);
        }
    }

    @Override // com.google.protobuf.q0
    public void a(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.r(list.get(i13).floatValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.w0(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.v0(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public final void b(int i10, Object obj) throws IOException {
        if (obj instanceof f) {
            this.f28145a.I0(i10, (f) obj);
        } else {
            this.f28145a.H0(i10, (d0) obj);
        }
    }

    @Override // com.google.protobuf.q0
    public void c(int i10, int i11) throws IOException {
        this.f28145a.r0(i10, i11);
    }

    @Override // com.google.protobuf.q0
    public void d(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof fn.i) {
            fn.i iVar = (fn.i) list;
            while (i11 < list.size()) {
                V(i10, iVar.L1(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.R0(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void e(int i10, List<?> list, fn.v vVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            z(i10, list.get(i11), vVar);
        }
    }

    @Override // com.google.protobuf.q0
    public void f(int i10, String str) throws IOException {
        this.f28145a.R0(i10, str);
    }

    @Override // com.google.protobuf.q0
    public void g(int i10, long j10) throws IOException {
        this.f28145a.W0(i10, j10);
    }

    @Override // com.google.protobuf.q0
    public void h(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.w(list.get(i13).intValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.C0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.B0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void i(int i10, f fVar) throws IOException {
        this.f28145a.l0(i10, fVar);
    }

    @Override // com.google.protobuf.q0
    public void j(int i10, int i11) throws IOException {
        this.f28145a.B0(i10, i11);
    }

    @Override // com.google.protobuf.q0
    public void k(int i10, long j10) throws IOException {
        this.f28145a.L0(i10, j10);
    }

    @Override // com.google.protobuf.q0
    public void l(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.n(list.get(i13).intValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.s0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.r0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void m(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.W(list.get(i13).intValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.V0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.U0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void n(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.R(list.get(i13).longValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.Q0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.P0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void o(int i10, long j10) throws IOException {
        this.f28145a.P0(i10, j10);
    }

    @Override // com.google.protobuf.q0
    public void p(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.l(list.get(i13).intValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.q0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.p0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void q(int i10, int i11) throws IOException {
        this.f28145a.U0(i10, i11);
    }

    @Override // com.google.protobuf.q0
    public void r(int i10, List<?> list, fn.v vVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            C(i10, list.get(i11), vVar);
        }
    }

    @Override // com.google.protobuf.q0
    public void s(int i10, double d10) throws IOException {
        this.f28145a.n0(i10, d10);
    }

    @Override // com.google.protobuf.q0
    public void t(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.N(list.get(i13).longValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.M0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.L0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void u(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f28145a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.Y(list.get(i13).longValue());
            }
            this.f28145a.V0(i12);
            while (i11 < list.size()) {
                this.f28145a.X0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f28145a.W0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.q0
    public void v(int i10, long j10) throws IOException {
        this.f28145a.t0(i10, j10);
    }

    @Override // com.google.protobuf.q0
    public q0.a w() {
        return q0.a.ASCENDING;
    }

    @Override // com.google.protobuf.q0
    public void x(int i10, long j10) throws IOException {
        this.f28145a.D0(i10, j10);
    }

    @Override // com.google.protobuf.q0
    public void y(int i10, boolean z10) throws IOException {
        this.f28145a.h0(i10, z10);
    }

    @Override // com.google.protobuf.q0
    public void z(int i10, Object obj, fn.v vVar) throws IOException {
        this.f28145a.y0(i10, (d0) obj, vVar);
    }
}
