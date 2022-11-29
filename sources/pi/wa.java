package pi;

import hi.wc;

/* loaded from: classes3.dex */
public final class wa extends va {

    /* renamed from: g  reason: collision with root package name */
    public final hi.l3 f48330g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ xa f48331h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(xa xaVar, String str, int i10, hi.l3 l3Var) {
        super(str, i10);
        this.f48331h = xaVar;
        this.f48330g = l3Var;
    }

    @Override // pi.va
    public final int a() {
        return this.f48330g.r();
    }

    @Override // pi.va
    public final boolean b() {
        return false;
    }

    @Override // pi.va
    public final boolean c() {
        return true;
    }

    public final boolean k(Long l10, Long l11, hi.c5 c5Var, boolean z10) {
        wc.b();
        boolean A = this.f48331h.f48285a.y().A(this.f48292a, c3.Y);
        boolean x10 = this.f48330g.x();
        boolean y10 = this.f48330g.y();
        boolean z11 = this.f48330g.z();
        byte b10 = (x10 || y10 || z11) ? (byte) 1 : (byte) 0;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && b10 == 0) {
            this.f48331h.f48285a.r().u().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f48293b), this.f48330g.A() ? Integer.valueOf(this.f48330g.r()) : null);
            return true;
        }
        hi.e3 s10 = this.f48330g.s();
        boolean x11 = s10.x();
        if (c5Var.H()) {
            if (!s10.z()) {
                this.f48331h.f48285a.r().v().b("No number filter for long property. property", this.f48331h.f48285a.C().f(c5Var.w()));
            } else {
                bool = va.j(va.h(c5Var.s(), s10.t()), x11);
            }
        } else if (c5Var.G()) {
            if (!s10.z()) {
                this.f48331h.f48285a.r().v().b("No number filter for double property. property", this.f48331h.f48285a.C().f(c5Var.w()));
            } else {
                bool = va.j(va.g(c5Var.r(), s10.t()), x11);
            }
        } else if (c5Var.J()) {
            if (!s10.B()) {
                if (!s10.z()) {
                    this.f48331h.f48285a.r().v().b("No string or number filter defined. property", this.f48331h.f48285a.C().f(c5Var.w()));
                } else if (da.P(c5Var.x())) {
                    bool = va.j(va.i(c5Var.x(), s10.t()), x11);
                } else {
                    this.f48331h.f48285a.r().v().c("Invalid user property value for Numeric number filter. property, value", this.f48331h.f48285a.C().f(c5Var.w()), c5Var.x());
                }
            } else {
                bool = va.j(va.f(c5Var.x(), s10.u(), this.f48331h.f48285a.r()), x11);
            }
        } else {
            this.f48331h.f48285a.r().v().b("User property has no value, property", this.f48331h.f48285a.C().f(c5Var.w()));
        }
        this.f48331h.f48285a.r().u().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f48294c = Boolean.TRUE;
        if (!z11 || bool.booleanValue()) {
            if (!z10 || this.f48330g.x()) {
                this.f48295d = bool;
            }
            if (bool.booleanValue() && b10 != 0 && c5Var.I()) {
                long t10 = c5Var.t();
                if (l10 != null) {
                    t10 = l10.longValue();
                }
                if (A && this.f48330g.x() && !this.f48330g.y() && l11 != null) {
                    t10 = l11.longValue();
                }
                if (this.f48330g.y()) {
                    this.f48297f = Long.valueOf(t10);
                } else {
                    this.f48296e = Long.valueOf(t10);
                }
            }
            return true;
        }
        return true;
    }
}
