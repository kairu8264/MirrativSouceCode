package ai;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class z5 {

    /* renamed from: d  reason: collision with root package name */
    public final y5 f12880d;

    /* renamed from: e  reason: collision with root package name */
    public final kp3 f12881e;

    /* renamed from: f  reason: collision with root package name */
    public final hl2 f12882f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<x5, w5> f12883g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<x5> f12884h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12885i;

    /* renamed from: j  reason: collision with root package name */
    public pm f12886j;

    /* renamed from: k  reason: collision with root package name */
    public tq3 f12887k = new tq3(0);

    /* renamed from: b  reason: collision with root package name */
    public final IdentityHashMap<ap3, x5> f12878b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, x5> f12879c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final List<x5> f12877a = new ArrayList();

    public z5(y5 y5Var, o11 o11Var, Handler handler) {
        this.f12880d = y5Var;
        kp3 kp3Var = new kp3();
        this.f12881e = kp3Var;
        hl2 hl2Var = new hl2();
        this.f12882f = hl2Var;
        this.f12883g = new HashMap<>();
        this.f12884h = new HashSet();
        kp3Var.b(handler, o11Var);
        hl2Var.b(handler, o11Var);
    }

    public final boolean c() {
        return this.f12885i;
    }

    public final int d() {
        return this.f12877a.size();
    }

    public final void e(pm pmVar) {
        u9.d(!this.f12885i);
        this.f12886j = pmVar;
        for (int i10 = 0; i10 < this.f12877a.size(); i10++) {
            x5 x5Var = this.f12877a.get(i10);
            t(x5Var);
            this.f12884h.add(x5Var);
        }
        this.f12885i = true;
    }

    public final void f(ap3 ap3Var) {
        x5 remove = this.f12878b.remove(ap3Var);
        Objects.requireNonNull(remove);
        remove.f11866a.g(ap3Var);
        remove.f11868c.remove(((to3) ap3Var).f10360w);
        if (!this.f12878b.isEmpty()) {
            p();
        }
        u(remove);
    }

    public final void g() {
        for (w5 w5Var : this.f12883g.values()) {
            try {
                w5Var.f11493a.j(w5Var.f11494b);
            } catch (RuntimeException e10) {
                oa.b("MediaSourceList", "Failed to release child source.", e10);
            }
            w5Var.f11493a.d(w5Var.f11495c);
            w5Var.f11493a.k(w5Var.f11495c);
        }
        this.f12883g.clear();
        this.f12884h.clear();
        this.f12885i = false;
    }

    public final q7 h() {
        if (this.f12877a.isEmpty()) {
            return q7.f8842a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12877a.size(); i11++) {
            x5 x5Var = this.f12877a.get(i11);
            x5Var.f11869d = i10;
            i10 += x5Var.f11866a.F().a();
        }
        return new s6(this.f12877a, this.f12887k, null);
    }

    public final /* synthetic */ void i(dp3 dp3Var, q7 q7Var) {
        this.f12880d.j();
    }

    public final q7 j(List<x5> list, tq3 tq3Var) {
        r(0, this.f12877a.size());
        return k(this.f12877a.size(), list, tq3Var);
    }

    public final q7 k(int i10, List<x5> list, tq3 tq3Var) {
        if (!list.isEmpty()) {
            this.f12887k = tq3Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                x5 x5Var = list.get(i11 - i10);
                if (i11 > 0) {
                    x5 x5Var2 = this.f12877a.get(i11 - 1);
                    x5Var.a(x5Var2.f11869d + x5Var2.f11866a.F().a());
                } else {
                    x5Var.a(0);
                }
                s(i11, x5Var.f11866a.F().a());
                this.f12877a.add(i11, x5Var);
                this.f12879c.put(x5Var.f11867b, x5Var);
                if (this.f12885i) {
                    t(x5Var);
                    if (this.f12878b.isEmpty()) {
                        this.f12884h.add(x5Var);
                    } else {
                        q(x5Var);
                    }
                }
            }
        }
        return h();
    }

    public final q7 l(int i10, int i11, tq3 tq3Var) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= d()) {
            z10 = true;
        }
        u9.a(z10);
        this.f12887k = tq3Var;
        r(i10, i11);
        return h();
    }

    public final q7 m(int i10, int i11, int i12, tq3 tq3Var) {
        u9.a(d() >= 0);
        this.f12887k = null;
        return h();
    }

    public final q7 n(tq3 tq3Var) {
        int d10 = d();
        if (tq3Var.a() != d10) {
            tq3Var = tq3Var.h().f(0, d10);
        }
        this.f12887k = tq3Var;
        return h();
    }

    public final ap3 o(bp3 bp3Var, is3 is3Var, long j10) {
        Object obj = bp3Var.f9603a;
        Object obj2 = ((Pair) obj).first;
        bp3 c10 = bp3Var.c(((Pair) obj).second);
        x5 x5Var = this.f12879c.get(obj2);
        Objects.requireNonNull(x5Var);
        this.f12884h.add(x5Var);
        w5 w5Var = this.f12883g.get(x5Var);
        if (w5Var != null) {
            w5Var.f11493a.h(w5Var.f11494b);
        }
        x5Var.f11868c.add(c10);
        to3 f10 = x5Var.f11866a.f(c10, is3Var, j10);
        this.f12878b.put(f10, x5Var);
        p();
        return f10;
    }

    public final void p() {
        Iterator<x5> it = this.f12884h.iterator();
        while (it.hasNext()) {
            x5 next = it.next();
            if (next.f11868c.isEmpty()) {
                q(next);
                it.remove();
            }
        }
    }

    public final void q(x5 x5Var) {
        w5 w5Var = this.f12883g.get(x5Var);
        if (w5Var != null) {
            w5Var.f11493a.i(w5Var.f11494b);
        }
    }

    public final void r(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            x5 remove = this.f12877a.remove(i11);
            this.f12879c.remove(remove.f11867b);
            s(i11, -remove.f11866a.F().a());
            remove.f11870e = true;
            if (this.f12885i) {
                u(remove);
            }
        }
    }

    public final void s(int i10, int i11) {
        while (i10 < this.f12877a.size()) {
            this.f12877a.get(i10).f11869d += i11;
            i10++;
        }
    }

    public final void t(x5 x5Var) {
        xo3 xo3Var = x5Var.f11866a;
        cp3 cp3Var = new cp3(this) { // from class: ai.u5

            /* renamed from: a  reason: collision with root package name */
            public final z5 f10609a;

            {
                this.f10609a = this;
            }

            @Override // ai.cp3
            public final void a(dp3 dp3Var, q7 q7Var) {
                this.f10609a.i(dp3Var, q7Var);
            }
        };
        v5 v5Var = new v5(this, x5Var);
        this.f12883g.put(x5Var, new w5(xo3Var, cp3Var, v5Var));
        xo3Var.b(new Handler(sb.P(), null), v5Var);
        xo3Var.e(new Handler(sb.P(), null), v5Var);
        xo3Var.a(cp3Var, this.f12886j);
    }

    public final void u(x5 x5Var) {
        if (x5Var.f11870e && x5Var.f11868c.isEmpty()) {
            w5 remove = this.f12883g.remove(x5Var);
            Objects.requireNonNull(remove);
            remove.f11493a.j(remove.f11494b);
            remove.f11493a.d(remove.f11495c);
            remove.f11493a.k(remove.f11495c);
            this.f12884h.remove(x5Var);
        }
    }
}
