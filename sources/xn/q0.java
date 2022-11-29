package xn;

import java.util.List;

/* loaded from: classes4.dex */
public class q0<T> extends c<T> {

    /* renamed from: x  reason: collision with root package name */
    public final List<T> f60454x;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(List<? extends T> list) {
        jo.p.h(list, "delegate");
        this.f60454x = list;
    }

    @Override // xn.a
    public int d() {
        return this.f60454x.size();
    }

    @Override // xn.c, java.util.List
    public T get(int i10) {
        int J;
        List<T> list = this.f60454x;
        J = y.J(this, i10);
        return list.get(J);
    }
}
