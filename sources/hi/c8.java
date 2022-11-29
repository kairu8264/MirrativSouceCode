package hi;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class c8 {

    /* renamed from: a  reason: collision with root package name */
    public final b8 f35685a;

    public c8(b8 b8Var) {
        b9.f(b8Var, "output");
        this.f35685a = b8Var;
        b8Var.f35662a = this;
    }

    public static c8 l(b8 b8Var) {
        c8 c8Var = b8Var.f35662a;
        return c8Var != null ? c8Var : new c8(b8Var);
    }

    public final void A(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).floatValue();
                i12 += 4;
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.l(Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.k(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public final void B(int i10, Object obj, ha haVar) throws IOException {
        b8 b8Var = this.f35685a;
        b8Var.s(i10, 3);
        haVar.i((w9) obj, b8Var.f35662a);
        b8Var.s(i10, 4);
    }

    public final void C(int i10, int i11) throws IOException {
        this.f35685a.o(i10, i11);
    }

    public final void D(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += b8.z(list.get(i13).intValue());
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.p(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.o(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void E(int i10, long j10) throws IOException {
        this.f35685a.v(i10, j10);
    }

    public final void F(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += b8.b(list.get(i13).longValue());
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.w(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.v(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void G(int i10, Object obj, ha haVar) throws IOException {
        w9 w9Var = (w9) obj;
        a8 a8Var = (a8) this.f35685a;
        a8Var.u((i10 << 3) | 2);
        e7 e7Var = (e7) w9Var;
        int a10 = e7Var.a();
        if (a10 == -1) {
            a10 = haVar.a(e7Var);
            e7Var.d(a10);
        }
        a8Var.u(a10);
        haVar.i(w9Var, a8Var.f35662a);
    }

    public final void H(int i10, int i11) throws IOException {
        this.f35685a.k(i10, i11);
    }

    public final void I(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.l(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.k(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void J(int i10, long j10) throws IOException {
        this.f35685a.m(i10, j10);
    }

    public final void K(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.n(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.m(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void a(int i10, int i11) throws IOException {
        this.f35685a.t(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = list.get(i13).intValue();
                i12 += b8.a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                b8 b8Var = this.f35685a;
                int intValue2 = list.get(i11).intValue();
                b8Var.u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            b8 b8Var2 = this.f35685a;
            int intValue3 = list.get(i11).intValue();
            b8Var2.t(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void c(int i10, long j10) throws IOException {
        this.f35685a.v(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void d(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = list.get(i13).longValue();
                i12 += b8.b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                b8 b8Var = this.f35685a;
                long longValue2 = list.get(i11).longValue();
                b8Var.w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            b8 b8Var2 = this.f35685a;
            long longValue3 = list.get(i11).longValue();
            b8Var2.v(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Deprecated
    public final void e(int i10) throws IOException {
        this.f35685a.s(i10, 3);
    }

    public final void f(int i10, String str) throws IOException {
        this.f35685a.r(i10, str);
    }

    public final void g(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof f9) {
            f9 f9Var = (f9) list;
            while (i11 < list.size()) {
                Object E = f9Var.E(i11);
                if (E instanceof String) {
                    this.f35685a.r(i10, (String) E);
                } else {
                    this.f35685a.j(i10, (u7) E);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.r(i10, list.get(i11));
            i11++;
        }
    }

    public final void h(int i10, int i11) throws IOException {
        this.f35685a.t(i10, i11);
    }

    public final void i(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += b8.a(list.get(i13).intValue());
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.u(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.t(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void j(int i10, long j10) throws IOException {
        this.f35685a.v(i10, j10);
    }

    public final void k(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += b8.b(list.get(i13).longValue());
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.w(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.v(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void m(int i10, boolean z10) throws IOException {
        this.f35685a.i(i10, z10);
    }

    public final void n(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).booleanValue();
                i12++;
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.h(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.i(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void o(int i10, u7 u7Var) throws IOException {
        this.f35685a.j(i10, u7Var);
    }

    public final void p(int i10, List<u7> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f35685a.j(i10, list.get(i11));
        }
    }

    public final void q(int i10, double d10) throws IOException {
        this.f35685a.m(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).doubleValue();
                i12 += 8;
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.n(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.m(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    @Deprecated
    public final void s(int i10) throws IOException {
        this.f35685a.s(i10, 4);
    }

    public final void t(int i10, int i11) throws IOException {
        this.f35685a.o(i10, i11);
    }

    public final void u(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += b8.z(list.get(i13).intValue());
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.p(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.o(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void v(int i10, int i11) throws IOException {
        this.f35685a.k(i10, i11);
    }

    public final void w(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.l(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.k(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void x(int i10, long j10) throws IOException {
        this.f35685a.m(i10, j10);
    }

    public final void y(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f35685a.s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.f35685a.u(i12);
            while (i11 < list.size()) {
                this.f35685a.n(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f35685a.m(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void z(int i10, float f10) throws IOException {
        this.f35685a.k(i10, Float.floatToRawIntBits(f10));
    }
}
