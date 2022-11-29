package com.google.protobuf;

import com.google.protobuf.p;
import com.google.protobuf.p.b;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class m<T extends p.b<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract Object b(l lVar, d0 d0Var, int i10);

    public abstract p<T> c(Object obj);

    public abstract p<T> d(Object obj);

    public abstract boolean e(d0 d0Var);

    public abstract void f(Object obj);

    public abstract <UT, UB> UB g(j0 j0Var, Object obj, l lVar, p<T> pVar, UB ub2, m0<UT, UB> m0Var) throws IOException;

    public abstract void h(j0 j0Var, Object obj, l lVar, p<T> pVar) throws IOException;

    public abstract void i(f fVar, Object obj, l lVar, p<T> pVar) throws IOException;

    public abstract void j(q0 q0Var, Map.Entry<?, ?> entry) throws IOException;
}
