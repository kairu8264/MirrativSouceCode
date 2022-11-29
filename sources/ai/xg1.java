package ai;

/* loaded from: classes3.dex */
public final class xg1 {

    /* renamed from: a  reason: collision with root package name */
    public k10 f11927a;

    /* renamed from: b  reason: collision with root package name */
    public h10 f11928b;

    /* renamed from: c  reason: collision with root package name */
    public x10 f11929c;

    /* renamed from: d  reason: collision with root package name */
    public u10 f11930d;

    /* renamed from: e  reason: collision with root package name */
    public x50 f11931e;

    /* renamed from: f  reason: collision with root package name */
    public final s.g<String, q10> f11932f = new s.g<>();

    /* renamed from: g  reason: collision with root package name */
    public final s.g<String, n10> f11933g = new s.g<>();

    public final xg1 a(k10 k10Var) {
        this.f11927a = k10Var;
        return this;
    }

    public final xg1 b(h10 h10Var) {
        this.f11928b = h10Var;
        return this;
    }

    public final xg1 c(x10 x10Var) {
        this.f11929c = x10Var;
        return this;
    }

    public final xg1 d(u10 u10Var) {
        this.f11930d = u10Var;
        return this;
    }

    public final xg1 e(x50 x50Var) {
        this.f11931e = x50Var;
        return this;
    }

    public final xg1 f(String str, q10 q10Var, n10 n10Var) {
        this.f11932f.put(str, q10Var);
        if (n10Var != null) {
            this.f11933g.put(str, n10Var);
        }
        return this;
    }

    public final zg1 g() {
        return new zg1(this);
    }
}
