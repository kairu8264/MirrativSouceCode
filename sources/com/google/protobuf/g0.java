package com.google.protobuf;

import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.u;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class g0<T> implements fn.v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f28136a;

    /* renamed from: b  reason: collision with root package name */
    public final m0<?, ?> f28137b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28138c;

    /* renamed from: d  reason: collision with root package name */
    public final m<?> f28139d;

    public g0(m0<?, ?> m0Var, m<?> mVar, d0 d0Var) {
        this.f28137b = m0Var;
        this.f28138c = mVar.e(d0Var);
        this.f28139d = mVar;
        this.f28136a = d0Var;
    }

    public static <T> g0<T> l(m0<?, ?> m0Var, m<?> mVar, d0 d0Var) {
        return new g0<>(m0Var, mVar, d0Var);
    }

    @Override // fn.v
    public void a(T t10, T t11) {
        k0.G(this.f28137b, t10, t11);
        if (this.f28138c) {
            k0.E(this.f28139d, t10, t11);
        }
    }

    @Override // fn.v
    public void b(T t10, q0 q0Var) throws IOException {
        Iterator<Map.Entry<?, Object>> s10 = this.f28139d.c(t10).s();
        while (s10.hasNext()) {
            Map.Entry<?, Object> next = s10.next();
            p.b bVar = (p.b) next.getKey();
            if (bVar.j() == p0.c.MESSAGE && !bVar.f() && !bVar.k()) {
                if (next instanceof u.b) {
                    q0Var.b(bVar.getNumber(), ((u.b) next).a().e());
                } else {
                    q0Var.b(bVar.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        n(this.f28137b, t10, q0Var);
    }

    @Override // fn.v
    public void c(T t10) {
        this.f28137b.j(t10);
        this.f28139d.f(t10);
    }

    @Override // fn.v
    public final boolean d(T t10) {
        return this.f28139d.c(t10).p();
    }

    @Override // fn.v
    public int e(T t10) {
        int j10 = j(this.f28137b, t10) + 0;
        return this.f28138c ? j10 + this.f28139d.c(t10).j() : j10;
    }

    @Override // fn.v
    public T f() {
        return (T) this.f28136a.i().r0();
    }

    @Override // fn.v
    public int g(T t10) {
        int hashCode = this.f28137b.g(t10).hashCode();
        return this.f28138c ? (hashCode * 53) + this.f28139d.c(t10).hashCode() : hashCode;
    }

    @Override // fn.v
    public void h(T t10, j0 j0Var, l lVar) throws IOException {
        k(this.f28137b, this.f28139d, t10, j0Var, lVar);
    }

    @Override // fn.v
    public boolean i(T t10, T t11) {
        if (this.f28137b.g(t10).equals(this.f28137b.g(t11))) {
            if (this.f28138c) {
                return this.f28139d.c(t10).equals(this.f28139d.c(t11));
            }
            return true;
        }
        return false;
    }

    public final <UT, UB> int j(m0<UT, UB> m0Var, T t10) {
        return m0Var.i(m0Var.g(t10));
    }

    public final <UT, UB, ET extends p.b<ET>> void k(m0<UT, UB> m0Var, m<ET> mVar, T t10, j0 j0Var, l lVar) throws IOException {
        UB f10 = m0Var.f(t10);
        p<ET> d10 = mVar.d(t10);
        do {
            try {
                if (j0Var.G() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                m0Var.o(t10, f10);
            }
        } while (m(j0Var, lVar, mVar, d10, m0Var, f10));
    }

    public final <UT, UB, ET extends p.b<ET>> boolean m(j0 j0Var, l lVar, m<ET> mVar, p<ET> pVar, m0<UT, UB> m0Var, UB ub2) throws IOException {
        int tag = j0Var.getTag();
        if (tag != p0.f28195a) {
            if (p0.b(tag) == 2) {
                Object b10 = mVar.b(lVar, this.f28136a, p0.a(tag));
                if (b10 != null) {
                    mVar.h(j0Var, b10, lVar, pVar);
                    return true;
                }
                return m0Var.m(ub2, j0Var);
            }
            return j0Var.J();
        }
        int i10 = 0;
        Object obj = null;
        f fVar = null;
        while (j0Var.G() != Integer.MAX_VALUE) {
            int tag2 = j0Var.getTag();
            if (tag2 == p0.f28197c) {
                i10 = j0Var.g();
                obj = mVar.b(lVar, this.f28136a, i10);
            } else if (tag2 == p0.f28198d) {
                if (obj != null) {
                    mVar.h(j0Var, obj, lVar, pVar);
                } else {
                    fVar = j0Var.q();
                }
            } else if (!j0Var.J()) {
                break;
            }
        }
        if (j0Var.getTag() == p0.f28196b) {
            if (fVar != null) {
                if (obj != null) {
                    mVar.i(fVar, obj, lVar, pVar);
                } else {
                    m0Var.d(ub2, i10, fVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.a();
    }

    public final <UT, UB> void n(m0<UT, UB> m0Var, T t10, q0 q0Var) throws IOException {
        m0Var.s(m0Var.g(t10), q0Var);
    }
}
