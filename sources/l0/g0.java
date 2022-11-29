package l0;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final f1 f39008a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39009b;

    /* renamed from: c  reason: collision with root package name */
    public m0.c<Object> f39010c;

    public g0(f1 f1Var, int i10, m0.c<Object> cVar) {
        jo.p.h(f1Var, "scope");
        this.f39008a = f1Var;
        this.f39009b = i10;
        this.f39010c = cVar;
    }

    public final m0.c<Object> a() {
        return this.f39010c;
    }

    public final int b() {
        return this.f39009b;
    }

    public final f1 c() {
        return this.f39008a;
    }

    public final boolean d() {
        return this.f39008a.v(this.f39010c);
    }

    public final void e(m0.c<Object> cVar) {
        this.f39010c = cVar;
    }
}
