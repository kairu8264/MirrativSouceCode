package uo;

/* loaded from: classes4.dex */
public class f2 extends k2 implements b0 {

    /* renamed from: x  reason: collision with root package name */
    public final boolean f56016x;

    public f2(d2 d2Var) {
        super(true);
        q0(d2Var);
        this.f56016x = V0();
    }

    public final boolean V0() {
        v m02 = m0();
        w wVar = m02 instanceof w ? (w) m02 : null;
        k2 S = wVar == null ? null : wVar.S();
        if (S == null) {
            return false;
        }
        while (!S.j0()) {
            v m03 = S.m0();
            w wVar2 = m03 instanceof w ? (w) m03 : null;
            if (wVar2 == null) {
                S = null;
                continue;
            } else {
                S = wVar2.S();
                continue;
            }
            if (S == null) {
                return false;
            }
        }
        return true;
    }

    @Override // uo.b0
    public boolean a(Throwable th2) {
        return v0(new d0(th2, false, 2, null));
    }

    @Override // uo.k2
    public boolean j0() {
        return this.f56016x;
    }

    @Override // uo.k2
    public boolean k0() {
        return true;
    }
}
