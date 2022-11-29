package a1;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class z {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f360a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.Active.ordinal()] = 1;
            iArr[y.Captured.ordinal()] = 2;
            iArr[y.Deactivated.ordinal()] = 3;
            iArr[y.DeactivatedParent.ordinal()] = 4;
            iArr[y.ActiveParent.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f360a = iArr;
        }
    }

    public static final void a(j jVar) {
        jo.p.h(jVar, "<this>");
        int i10 = a.f360a[jVar.l().ordinal()];
        if (i10 == 3) {
            jVar.y(y.Inactive);
        } else if (i10 != 4) {
        } else {
            jVar.y(y.ActiveParent);
        }
    }

    public static final boolean b(j jVar) {
        j m10 = jVar.m();
        if (m10 != null) {
            if (d(m10, false, 1, null)) {
                jVar.A(null);
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static final boolean c(j jVar, boolean z10) {
        jo.p.h(jVar, "<this>");
        switch (a.f360a[jVar.l().ordinal()]) {
            case 1:
                jVar.y(y.Inactive);
                return true;
            case 2:
                if (z10) {
                    jVar.y(y.Inactive);
                    return z10;
                }
                return z10;
            case 3:
            case 6:
                return true;
            case 4:
                if (b(jVar)) {
                    jVar.y(y.Deactivated);
                    return true;
                }
                return false;
            case 5:
                if (b(jVar)) {
                    jVar.y(y.Inactive);
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ boolean d(j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(jVar, z10);
    }

    public static final void e(j jVar) {
        s1.k z12;
        s1.y t02;
        g focusManager;
        jo.p.h(jVar, "<this>");
        int i10 = a.f360a[jVar.l().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 5) {
                jVar.y(y.DeactivatedParent);
                return;
            } else if (i10 != 6) {
                return;
            } else {
                jVar.y(y.Deactivated);
                return;
            }
        }
        s1.p r10 = jVar.r();
        if (r10 != null && (z12 = r10.z1()) != null && (t02 = z12.t0()) != null && (focusManager = t02.getFocusManager()) != null) {
            focusManager.c(true);
        }
        jVar.y(y.Deactivated);
    }

    public static final void f(j jVar) {
        y yVar;
        switch (a.f360a[jVar.l().ordinal()]) {
            case 1:
            case 5:
            case 6:
                yVar = y.Active;
                break;
            case 2:
                yVar = y.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        jVar.y(yVar);
    }

    public static final boolean g(j jVar, j jVar2) {
        jVar.A(jVar2);
        f(jVar2);
        return true;
    }

    public static final void h(j jVar) {
        s1.k z12;
        jo.p.h(jVar, "<this>");
        s1.p r10 = jVar.r();
        if (((r10 == null || (z12 = r10.z1()) == null) ? null : z12.t0()) == null) {
            jVar.x(true);
            return;
        }
        switch (a.f360a[jVar.l().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                k(jVar);
                return;
            case 5:
                if (b(jVar)) {
                    f(jVar);
                    return;
                }
                return;
            case 6:
                j s10 = jVar.s();
                if (s10 != null) {
                    i(s10, jVar);
                    return;
                } else if (j(jVar)) {
                    f(jVar);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public static final boolean i(j jVar, j jVar2) {
        if (jVar.f().j(jVar2)) {
            switch (a.f360a[jVar.l().ordinal()]) {
                case 1:
                    jVar.y(y.ActiveParent);
                    return g(jVar, jVar2);
                case 2:
                    return false;
                case 3:
                    a(jVar);
                    boolean i10 = i(jVar, jVar2);
                    e(jVar);
                    return i10;
                case 4:
                    if (jVar.m() == null || b(jVar)) {
                        return g(jVar, jVar2);
                    }
                    return false;
                case 5:
                    if (b(jVar)) {
                        return g(jVar, jVar2);
                    }
                    return false;
                case 6:
                    j s10 = jVar.s();
                    if (s10 == null && j(jVar)) {
                        jVar.y(y.Active);
                        return i(jVar, jVar2);
                    } else if (s10 == null || !i(s10, jVar)) {
                        return false;
                    } else {
                        return i(jVar, jVar2);
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    public static final boolean j(j jVar) {
        s1.k z12;
        s1.y t02;
        s1.p r10 = jVar.r();
        if (r10 == null || (z12 = r10.z1()) == null || (t02 = z12.t0()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return t02.requestFocus();
    }

    public static final void k(j jVar) {
        jo.p.h(jVar, "<this>");
        f g10 = jVar.g();
        if (g10 != null) {
            g10.g();
        }
    }
}
