package uo;

/* loaded from: classes4.dex */
public abstract class j2 extends f0 implements i1, x1 {

    /* renamed from: z  reason: collision with root package name */
    public k2 f56036z;

    public final k2 S() {
        k2 k2Var = this.f56036z;
        if (k2Var != null) {
            return k2Var;
        }
        jo.p.v("job");
        return null;
    }

    public final void U(k2 k2Var) {
        this.f56036z = k2Var;
    }

    @Override // uo.i1
    public void dispose() {
        S().I0(this);
    }

    @Override // uo.x1
    public p2 f() {
        return null;
    }

    @Override // uo.x1
    public boolean isActive() {
        return true;
    }

    @Override // zo.u
    public String toString() {
        return v0.a(this) + '@' + v0.b(this) + "[job@" + v0.b(S()) + ']';
    }
}
