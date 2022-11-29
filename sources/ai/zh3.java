package ai;

import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zh3 {

    /* renamed from: a  reason: collision with root package name */
    public final yh3 f12995a;

    public zh3(yh3 yh3Var) {
        bj3.b(yh3Var, "output");
        this.f12995a = yh3Var;
        yh3Var.f12605a = this;
    }

    public static zh3 l(yh3 yh3Var) {
        zh3 zh3Var = yh3Var.f12605a;
        return zh3Var != null ? zh3Var : new zh3(yh3Var);
    }

    public final void A(int i10, int i11) throws IOException {
        this.f12995a.i(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void B(int i10, long j10) throws IOException {
        this.f12995a.k(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void C(int i10, Object obj, ok3 ok3Var) throws IOException {
        xj3 xj3Var = (xj3) obj;
        wh3 wh3Var = (wh3) this.f12995a;
        wh3Var.r((i10 << 3) | 2);
        xg3 xg3Var = (xg3) xj3Var;
        int a10 = xg3Var.a();
        if (a10 == -1) {
            a10 = ok3Var.g(xg3Var);
            xg3Var.d(a10);
        }
        wh3Var.r(a10);
        ok3Var.f(xj3Var, wh3Var.f12605a);
    }

    public final void D(int i10, Object obj, ok3 ok3Var) throws IOException {
        yh3 yh3Var = this.f12995a;
        yh3Var.g(i10, 3);
        ok3Var.f((xj3) obj, yh3Var.f12605a);
        yh3Var.g(i10, 4);
    }

    public final void E(int i10) throws IOException {
        this.f12995a.g(i10, 3);
    }

    public final void F(int i10) throws IOException {
        this.f12995a.g(i10, 4);
    }

    public final void G(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += yh3.A(list.get(i13).intValue());
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.q(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.h(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void H(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.s(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.j(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void I(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += yh3.C(list.get(i13).longValue());
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.t(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.k(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void J(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += yh3.C(list.get(i13).longValue());
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.t(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.k(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void K(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.u(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.l(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void a(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).floatValue();
                i12 += 4;
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.s(Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.j(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    public final void b(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).doubleValue();
                i12 += 8;
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.u(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.l(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    public final void c(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += yh3.A(list.get(i13).intValue());
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.q(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.h(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void d(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).booleanValue();
                i12++;
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.p(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.m(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void e(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof gj3) {
            gj3 gj3Var = (gj3) list;
            while (i11 < list.size()) {
                Object Y = gj3Var.Y(i11);
                if (Y instanceof String) {
                    this.f12995a.n(i10, (String) Y);
                } else {
                    this.f12995a.o(i10, (oh3) Y);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.n(i10, list.get(i11));
            i11++;
        }
    }

    public final void f(int i10, List<oh3> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f12995a.o(i10, list.get(i11));
        }
    }

    public final void g(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += yh3.B(list.get(i13).intValue());
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.r(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.i(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void h(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.s(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.j(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void i(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                this.f12995a.u(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12995a.l(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void j(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = list.get(i13).intValue();
                i12 += yh3.B((intValue >> 31) ^ (intValue + intValue));
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                yh3 yh3Var = this.f12995a;
                int intValue2 = list.get(i11).intValue();
                yh3Var.r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            yh3 yh3Var2 = this.f12995a;
            int intValue3 = list.get(i11).intValue();
            yh3Var2.i(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void k(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12995a.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = list.get(i13).longValue();
                i12 += yh3.C((longValue >> 63) ^ (longValue + longValue));
            }
            this.f12995a.r(i12);
            while (i11 < list.size()) {
                yh3 yh3Var = this.f12995a;
                long longValue2 = list.get(i11).longValue();
                yh3Var.t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            yh3 yh3Var2 = this.f12995a;
            long longValue3 = list.get(i11).longValue();
            yh3Var2.k(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public final void m(int i10, int i11) throws IOException {
        this.f12995a.j(i10, i11);
    }

    public final void n(int i10, long j10) throws IOException {
        this.f12995a.k(i10, j10);
    }

    public final void o(int i10, long j10) throws IOException {
        this.f12995a.l(i10, j10);
    }

    public final void p(int i10, float f10) throws IOException {
        this.f12995a.j(i10, Float.floatToRawIntBits(f10));
    }

    public final void q(int i10, double d10) throws IOException {
        this.f12995a.l(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r(int i10, int i11) throws IOException {
        this.f12995a.h(i10, i11);
    }

    public final void s(int i10, long j10) throws IOException {
        this.f12995a.k(i10, j10);
    }

    public final void t(int i10, int i11) throws IOException {
        this.f12995a.h(i10, i11);
    }

    public final void u(int i10, long j10) throws IOException {
        this.f12995a.l(i10, j10);
    }

    public final void v(int i10, int i11) throws IOException {
        this.f12995a.j(i10, i11);
    }

    public final void w(int i10, boolean z10) throws IOException {
        this.f12995a.m(i10, z10);
    }

    public final void x(int i10, String str) throws IOException {
        this.f12995a.n(i10, str);
    }

    public final void y(int i10, oh3 oh3Var) throws IOException {
        this.f12995a.o(i10, oh3Var);
    }

    public final void z(int i10, int i11) throws IOException {
        this.f12995a.i(i10, i11);
    }
}
