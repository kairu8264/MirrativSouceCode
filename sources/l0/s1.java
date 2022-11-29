package l0;

import v0.h;

/* loaded from: classes.dex */
public class s1<T> implements v0.c0, v0.r<T> {

    /* renamed from: w  reason: collision with root package name */
    public final t1<T> f39273w;

    /* renamed from: x  reason: collision with root package name */
    public a<T> f39274x;

    /* loaded from: classes.dex */
    public static final class a<T> extends v0.d0 {

        /* renamed from: c  reason: collision with root package name */
        public T f39275c;

        public a(T t10) {
            this.f39275c = t10;
        }

        @Override // v0.d0
        public void a(v0.d0 d0Var) {
            jo.p.h(d0Var, "value");
            this.f39275c = ((a) d0Var).f39275c;
        }

        @Override // v0.d0
        public v0.d0 b() {
            return new a(this.f39275c);
        }

        public final T g() {
            return this.f39275c;
        }

        public final void h(T t10) {
            this.f39275c = t10;
        }
    }

    public s1(T t10, t1<T> t1Var) {
        jo.p.h(t1Var, "policy");
        this.f39273w = t1Var;
        this.f39274x = new a<>(t10);
    }

    @Override // v0.c0
    public v0.d0 d() {
        return this.f39274x;
    }

    @Override // l0.s0, l0.c2
    public T getValue() {
        return (T) ((a) v0.m.O(this.f39274x, this)).g();
    }

    @Override // v0.r
    public t1<T> i() {
        return this.f39273w;
    }

    @Override // v0.c0
    public void j(v0.d0 d0Var) {
        jo.p.h(d0Var, "value");
        this.f39274x = (a) d0Var;
    }

    @Override // v0.c0
    public v0.d0 k(v0.d0 d0Var, v0.d0 d0Var2, v0.d0 d0Var3) {
        jo.p.h(d0Var, "previous");
        jo.p.h(d0Var2, "current");
        jo.p.h(d0Var3, "applied");
        a aVar = (a) d0Var;
        a aVar2 = (a) d0Var2;
        a aVar3 = (a) d0Var3;
        if (i().b((T) aVar2.g(), (T) aVar3.g())) {
            return d0Var2;
        }
        T a10 = i().a((T) aVar.g(), (T) aVar2.g(), (T) aVar3.g());
        if (a10 != null) {
            v0.d0 b10 = aVar3.b();
            ((a) b10).h(a10);
            return b10;
        }
        return null;
    }

    @Override // l0.s0
    public void setValue(T t10) {
        v0.h b10;
        a<T> aVar = this.f39274x;
        h.a aVar2 = v0.h.f56484e;
        a aVar3 = (a) v0.m.A(aVar, aVar2.b());
        if (i().b((T) aVar3.g(), t10)) {
            return;
        }
        a<T> aVar4 = this.f39274x;
        v0.m.D();
        synchronized (v0.m.C()) {
            b10 = aVar2.b();
            ((a) v0.m.L(aVar4, this, b10, aVar3)).h(t10);
            wn.v vVar = wn.v.f59242a;
        }
        v0.m.J(b10, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) v0.m.A(this.f39274x, v0.h.f56484e.b())).g() + ")@" + hashCode();
    }
}
