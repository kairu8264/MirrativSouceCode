package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class m0<T, B> {
    public abstract void a(B b10, int i10, int i11);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(B b10, int i10, T t10);

    public abstract void d(B b10, int i10, f fVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract T k(T t10, T t11);

    public final void l(B b10, j0 j0Var) throws IOException {
        while (j0Var.G() != Integer.MAX_VALUE && m(b10, j0Var)) {
        }
    }

    public final boolean m(B b10, j0 j0Var) throws IOException {
        int tag = j0Var.getTag();
        int a10 = p0.a(tag);
        int b11 = p0.b(tag);
        if (b11 == 0) {
            e(b10, a10, j0Var.N());
            return true;
        } else if (b11 == 1) {
            b(b10, a10, j0Var.a());
            return true;
        } else if (b11 == 2) {
            d(b10, a10, j0Var.q());
            return true;
        } else if (b11 != 3) {
            if (b11 != 4) {
                if (b11 == 5) {
                    a(b10, a10, j0Var.y());
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            }
            return false;
        } else {
            B n10 = n();
            int c10 = p0.c(a10, 4);
            l(n10, j0Var);
            if (c10 == j0Var.getTag()) {
                c(b10, a10, r(n10));
                return true;
            }
            throw InvalidProtocolBufferException.a();
        }
    }

    public abstract B n();

    public abstract void o(Object obj, B b10);

    public abstract void p(Object obj, T t10);

    public abstract boolean q(j0 j0Var);

    public abstract T r(B b10);

    public abstract void s(T t10, q0 q0Var) throws IOException;

    public abstract void t(T t10, q0 q0Var) throws IOException;
}
