package u;

import u.d;
import u.p;

/* loaded from: classes.dex */
public final class y0<T, V extends p> implements d<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final f1<V> f54174a;

    /* renamed from: b  reason: collision with root package name */
    public final c1<T, V> f54175b;

    /* renamed from: c  reason: collision with root package name */
    public final T f54176c;

    /* renamed from: d  reason: collision with root package name */
    public final T f54177d;

    /* renamed from: e  reason: collision with root package name */
    public final V f54178e;

    /* renamed from: f  reason: collision with root package name */
    public final V f54179f;

    /* renamed from: g  reason: collision with root package name */
    public final V f54180g;

    /* renamed from: h  reason: collision with root package name */
    public final long f54181h;

    /* renamed from: i  reason: collision with root package name */
    public final V f54182i;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(f1<V> f1Var, c1<T, V> c1Var, T t10, T t11, V v10) {
        jo.p.h(f1Var, "animationSpec");
        jo.p.h(c1Var, "typeConverter");
        this.f54174a = f1Var;
        this.f54175b = c1Var;
        this.f54176c = t10;
        this.f54177d = t11;
        V invoke = e().a().invoke(t10);
        this.f54178e = invoke;
        V invoke2 = e().a().invoke(g());
        this.f54179f = invoke2;
        p b10 = v10 == null ? (V) null : q.b(v10);
        b10 = b10 == null ? (V) q.d(e().a().invoke(t10)) : b10;
        this.f54180g = (V) b10;
        this.f54181h = f1Var.g(invoke, invoke2, b10);
        this.f54182i = (V) f1Var.d(invoke, invoke2, b10);
    }

    @Override // u.d
    public boolean a() {
        return this.f54174a.a();
    }

    @Override // u.d
    public V b(long j10) {
        if (!c(j10)) {
            return this.f54174a.e(j10, this.f54178e, this.f54179f, this.f54180g);
        }
        return this.f54182i;
    }

    @Override // u.d
    public boolean c(long j10) {
        return d.a.a(this, j10);
    }

    @Override // u.d
    public long d() {
        return this.f54181h;
    }

    @Override // u.d
    public c1<T, V> e() {
        return this.f54175b;
    }

    @Override // u.d
    public T f(long j10) {
        if (!c(j10)) {
            return e().b().invoke(this.f54174a.f(j10, this.f54178e, this.f54179f, this.f54180g));
        }
        return g();
    }

    @Override // u.d
    public T g() {
        return this.f54177d;
    }

    public final T h() {
        return this.f54176c;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f54176c + " -> " + g() + ",initial velocity: " + this.f54180g + ", duration: " + f.c(this) + " ms";
    }

    public /* synthetic */ y0(i iVar, c1 c1Var, Object obj, Object obj2, p pVar, int i10, jo.h hVar) {
        this(iVar, c1Var, obj, obj2, (i10 & 16) != 0 ? null : pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(i<T> iVar, c1<T, V> c1Var, T t10, T t11, V v10) {
        this(iVar.a(c1Var), c1Var, t10, t11, v10);
        jo.p.h(iVar, "animationSpec");
        jo.p.h(c1Var, "typeConverter");
    }
}
