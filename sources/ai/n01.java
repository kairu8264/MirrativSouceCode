package ai;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class n01 {

    /* renamed from: a  reason: collision with root package name */
    public final n7 f7133a;

    /* renamed from: b  reason: collision with root package name */
    public zz2<bp3> f7134b = zz2.r();

    /* renamed from: c  reason: collision with root package name */
    public d03<bp3, q7> f7135c = d03.d();

    /* renamed from: d  reason: collision with root package name */
    public bp3 f7136d;

    /* renamed from: e  reason: collision with root package name */
    public bp3 f7137e;

    /* renamed from: f  reason: collision with root package name */
    public bp3 f7138f;

    public n01(n7 n7Var) {
        this.f7133a = n7Var;
    }

    public static bp3 l(o6 o6Var, zz2<bp3> zz2Var, bp3 bp3Var, n7 n7Var) {
        q7 D = o6Var.D();
        int r10 = o6Var.r();
        Object j10 = D.k() ? null : D.j(r10);
        int f10 = (o6Var.y() || D.k()) ? -1 : D.h(r10, n7Var, false).f(y2.b(o6Var.N()));
        for (int i10 = 0; i10 < zz2Var.size(); i10++) {
            bp3 bp3Var2 = zz2Var.get(i10);
            if (m(bp3Var2, j10, o6Var.y(), o6Var.O(), o6Var.x(), f10)) {
                return bp3Var2;
            }
        }
        if (zz2Var.isEmpty() && bp3Var != null) {
            if (m(bp3Var, j10, o6Var.y(), o6Var.O(), o6Var.x(), f10)) {
                return bp3Var;
            }
        }
        return null;
    }

    public static boolean m(bp3 bp3Var, Object obj, boolean z10, int i10, int i11, int i12) {
        if (bp3Var.f9603a.equals(obj)) {
            if (z10) {
                if (bp3Var.f9604b != i10 || bp3Var.f9605c != i11) {
                    return false;
                }
            } else if (bp3Var.f9604b != -1 || bp3Var.f9607e != i12) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final bp3 b() {
        return this.f7136d;
    }

    public final bp3 c() {
        return this.f7137e;
    }

    public final bp3 d() {
        return this.f7138f;
    }

    public final bp3 e() {
        bp3 next;
        bp3 bp3Var;
        if (this.f7134b.isEmpty()) {
            return null;
        }
        zz2<bp3> zz2Var = this.f7134b;
        if (zz2Var instanceof List) {
            if (!zz2Var.isEmpty()) {
                bp3Var = zz2Var.get(zz2Var.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<bp3> it = zz2Var.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            bp3Var = next;
        }
        return bp3Var;
    }

    public final q7 f(bp3 bp3Var) {
        return this.f7135c.get(bp3Var);
    }

    public final void g(o6 o6Var) {
        this.f7136d = l(o6Var, this.f7134b, this.f7137e, this.f7133a);
    }

    public final void h(o6 o6Var) {
        this.f7136d = l(o6Var, this.f7134b, this.f7137e, this.f7133a);
        j(o6Var.D());
    }

    public final void i(List<bp3> list, bp3 bp3Var, o6 o6Var) {
        this.f7134b = zz2.A(list);
        if (!list.isEmpty()) {
            this.f7137e = list.get(0);
            Objects.requireNonNull(bp3Var);
            this.f7138f = bp3Var;
        }
        if (this.f7136d == null) {
            this.f7136d = l(o6Var, this.f7134b, this.f7137e, this.f7133a);
        }
        j(o6Var.D());
    }

    public final void j(q7 q7Var) {
        c03<bp3, q7> c03Var = new c03<>();
        if (this.f7134b.isEmpty()) {
            k(c03Var, this.f7137e, q7Var);
            if (!hx2.a(this.f7138f, this.f7137e)) {
                k(c03Var, this.f7138f, q7Var);
            }
            if (!hx2.a(this.f7136d, this.f7137e) && !hx2.a(this.f7136d, this.f7138f)) {
                k(c03Var, this.f7136d, q7Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f7134b.size(); i10++) {
                k(c03Var, this.f7134b.get(i10), q7Var);
            }
            if (!this.f7134b.contains(this.f7136d)) {
                k(c03Var, this.f7136d, q7Var);
            }
        }
        this.f7135c = c03Var.c();
    }

    public final void k(c03<bp3, q7> c03Var, bp3 bp3Var, q7 q7Var) {
        if (bp3Var == null) {
            return;
        }
        if (q7Var.i(bp3Var.f9603a) != -1) {
            c03Var.a(bp3Var, q7Var);
            return;
        }
        q7 q7Var2 = this.f7135c.get(bp3Var);
        if (q7Var2 != null) {
            c03Var.a(bp3Var, q7Var2);
        }
    }
}
