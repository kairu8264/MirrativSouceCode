package a1;

import a1.c;
import kotlin.NoWhenBranchMatchedException;
import q1.c;

/* loaded from: classes.dex */
public final class c0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f298a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.ActiveParent.ordinal()] = 1;
            iArr[y.DeactivatedParent.ordinal()] = 2;
            iArr[y.Active.ordinal()] = 3;
            iArr[y.Captured.ordinal()] = 4;
            iArr[y.Deactivated.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f298a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c.a, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f299w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j f300x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f301y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<j, Boolean> f302z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j jVar, j jVar2, int i10, io.l<? super j, Boolean> lVar) {
            super(1);
            this.f299w = jVar;
            this.f300x = jVar2;
            this.f301y = i10;
            this.f302z = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(c.a aVar) {
            jo.p.h(aVar, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(c0.p(this.f299w, this.f300x, this.f301y, this.f302z));
            if (valueOf.booleanValue() || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    public static final j b(j jVar) {
        if (jVar.l() == y.ActiveParent || jVar.l() == y.DeactivatedParent) {
            j b10 = a0.b(jVar);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean c(b1.h hVar, b1.h hVar2, b1.h hVar3, int i10) {
        if (d(hVar3, i10, hVar) || !d(hVar2, i10, hVar)) {
            return false;
        }
        if (e(hVar3, i10, hVar)) {
            c.a aVar = c.f288b;
            if (!c.l(i10, aVar.c()) && !c.l(i10, aVar.g()) && f(hVar2, i10, hVar) >= g(hVar3, i10, hVar)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(b1.h hVar, int i10, b1.h hVar2) {
        c.a aVar = c.f288b;
        if (!(c.l(i10, aVar.c()) ? true : c.l(i10, aVar.g()))) {
            if (!(c.l(i10, aVar.h()) ? true : c.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (hVar.j() > hVar2.i() && hVar.i() < hVar2.j()) {
                return true;
            }
        } else if (hVar.e() > hVar2.l() && hVar.l() < hVar2.e()) {
            return true;
        }
        return false;
    }

    public static final boolean e(b1.h hVar, int i10, b1.h hVar2) {
        c.a aVar = c.f288b;
        if (c.l(i10, aVar.c())) {
            if (hVar2.i() >= hVar.j()) {
                return true;
            }
        } else if (c.l(i10, aVar.g())) {
            if (hVar2.j() <= hVar.i()) {
                return true;
            }
        } else if (c.l(i10, aVar.h())) {
            if (hVar2.l() >= hVar.e()) {
                return true;
            }
        } else if (!c.l(i10, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            if (hVar2.e() <= hVar.l()) {
                return true;
            }
        }
        return false;
    }

    public static final float f(b1.h hVar, int i10, b1.h hVar2) {
        float l10;
        float e10;
        float l11;
        float e11;
        float f10;
        c.a aVar = c.f288b;
        if (!c.l(i10, aVar.c())) {
            if (c.l(i10, aVar.g())) {
                l10 = hVar.i();
                e10 = hVar2.j();
            } else if (c.l(i10, aVar.h())) {
                l11 = hVar2.l();
                e11 = hVar.e();
            } else if (!c.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                l10 = hVar.l();
                e10 = hVar2.e();
            }
            f10 = l10 - e10;
            return Math.max(0.0f, f10);
        }
        l11 = hVar2.i();
        e11 = hVar.j();
        f10 = l11 - e11;
        return Math.max(0.0f, f10);
    }

    public static final float g(b1.h hVar, int i10, b1.h hVar2) {
        float e10;
        float e11;
        float l10;
        float l11;
        float f10;
        c.a aVar = c.f288b;
        if (!c.l(i10, aVar.c())) {
            if (c.l(i10, aVar.g())) {
                e10 = hVar.j();
                e11 = hVar2.j();
            } else if (c.l(i10, aVar.h())) {
                l10 = hVar2.l();
                l11 = hVar.l();
            } else if (!c.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                e10 = hVar.e();
                e11 = hVar2.e();
            }
            f10 = e10 - e11;
            return Math.max(1.0f, f10);
        }
        l10 = hVar2.i();
        l11 = hVar.i();
        f10 = l10 - l11;
        return Math.max(1.0f, f10);
    }

    public static final b1.h h(b1.h hVar) {
        return new b1.h(hVar.j(), hVar.e(), hVar.j(), hVar.e());
    }

    public static final j i(m0.e<j> eVar, b1.h hVar, int i10) {
        b1.h q10;
        c.a aVar = c.f288b;
        if (c.l(i10, aVar.c())) {
            q10 = hVar.q(hVar.n() + 1, 0.0f);
        } else if (c.l(i10, aVar.g())) {
            q10 = hVar.q(-(hVar.n() + 1), 0.0f);
        } else if (c.l(i10, aVar.h())) {
            q10 = hVar.q(0.0f, hVar.h() + 1);
        } else if (!c.l(i10, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            q10 = hVar.q(0.0f, -(hVar.h() + 1));
        }
        j jVar = null;
        int p10 = eVar.p();
        if (p10 > 0) {
            int i11 = 0;
            j[] n10 = eVar.n();
            do {
                j jVar2 = n10[i11];
                if (a0.g(jVar2)) {
                    b1.h e10 = a0.e(jVar2);
                    if (k(e10, q10, hVar, i10)) {
                        jVar = jVar2;
                        q10 = e10;
                    }
                }
                i11++;
            } while (i11 < p10);
            return jVar;
        }
        return jVar;
    }

    public static final boolean j(j jVar, j jVar2, int i10, io.l<? super j, Boolean> lVar) {
        if (p(jVar, jVar2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a1.a.a(jVar, i10, new b(jVar, jVar2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean k(b1.h hVar, b1.h hVar2, b1.h hVar3, int i10) {
        if (l(hVar, i10, hVar3)) {
            if (!l(hVar2, i10, hVar3) || c(hVar3, hVar, hVar2, i10)) {
                return true;
            }
            if (!c(hVar3, hVar2, hVar, i10) && o(i10, hVar3, hVar) < o(i10, hVar3, hVar2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(b1.h hVar, int i10, b1.h hVar2) {
        c.a aVar = c.f288b;
        if (c.l(i10, aVar.c())) {
            if ((hVar2.j() > hVar.j() || hVar2.i() >= hVar.j()) && hVar2.i() > hVar.i()) {
                return true;
            }
        } else if (c.l(i10, aVar.g())) {
            if ((hVar2.i() < hVar.i() || hVar2.j() <= hVar.i()) && hVar2.j() < hVar.j()) {
                return true;
            }
        } else if (c.l(i10, aVar.h())) {
            if ((hVar2.e() > hVar.e() || hVar2.l() >= hVar.e()) && hVar2.l() > hVar.l()) {
                return true;
            }
        } else if (!c.l(i10, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            if ((hVar2.l() < hVar.l() || hVar2.e() <= hVar.l()) && hVar2.e() < hVar.e()) {
                return true;
            }
        }
        return false;
    }

    public static final float m(b1.h hVar, int i10, b1.h hVar2) {
        float l10;
        float e10;
        float l11;
        float e11;
        float f10;
        c.a aVar = c.f288b;
        if (!c.l(i10, aVar.c())) {
            if (c.l(i10, aVar.g())) {
                l10 = hVar.i();
                e10 = hVar2.j();
            } else if (c.l(i10, aVar.h())) {
                l11 = hVar2.l();
                e11 = hVar.e();
            } else if (!c.l(i10, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                l10 = hVar.l();
                e10 = hVar2.e();
            }
            f10 = l10 - e10;
            return Math.max(0.0f, f10);
        }
        l11 = hVar2.i();
        e11 = hVar.j();
        f10 = l11 - e11;
        return Math.max(0.0f, f10);
    }

    public static final float n(b1.h hVar, int i10, b1.h hVar2) {
        float f10;
        float i11;
        float i12;
        float n10;
        c.a aVar = c.f288b;
        if (c.l(i10, aVar.c()) ? true : c.l(i10, aVar.g())) {
            f10 = 2;
            i11 = hVar2.l() + (hVar2.h() / f10);
            i12 = hVar.l();
            n10 = hVar.h();
        } else {
            if (!(c.l(i10, aVar.h()) ? true : c.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f10 = 2;
            i11 = hVar2.i() + (hVar2.n() / f10);
            i12 = hVar.i();
            n10 = hVar.n();
        }
        return i11 - (i12 + (n10 / f10));
    }

    public static final long o(int i10, b1.h hVar, b1.h hVar2) {
        long abs = Math.abs(m(hVar2, i10, hVar));
        long abs2 = Math.abs(n(hVar2, i10, hVar));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    public static final boolean p(j jVar, j jVar2, int i10, io.l<? super j, Boolean> lVar) {
        j i11;
        m0.e eVar = new m0.e(new j[jVar.f().p()], 0);
        eVar.e(eVar.p(), jVar.f());
        while (eVar.s() && (i11 = i(eVar, a0.e(jVar2), i10)) != null) {
            if (!i11.l().h()) {
                return lVar.invoke(i11).booleanValue();
            }
            if (j(i11, jVar2, i10, lVar)) {
                return true;
            }
            eVar.u(i11);
        }
        return false;
    }

    public static final b1.h q(b1.h hVar) {
        return new b1.h(hVar.i(), hVar.l(), hVar.i(), hVar.l());
    }

    public static final boolean r(j jVar, int i10, io.l<? super j, Boolean> lVar) {
        b1.h h10;
        jo.p.h(jVar, "$this$twoDimensionalFocusSearch");
        jo.p.h(lVar, "onFound");
        y l10 = jVar.l();
        int[] iArr = a.f298a;
        switch (iArr[l10.ordinal()]) {
            case 1:
            case 2:
                j m10 = jVar.m();
                if (m10 != null) {
                    switch (iArr[m10.l().ordinal()]) {
                        case 1:
                        case 2:
                            return r(m10, i10, lVar) || j(jVar, b(m10), i10, lVar);
                        case 3:
                        case 4:
                            return j(jVar, m10, i10, lVar);
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
                m0.e<j> a10 = a0.a(jVar);
                if (a10.p() <= 1) {
                    j jVar2 = a10.r() ? null : a10.n()[0];
                    if (jVar2 != null) {
                        return lVar.invoke(jVar2).booleanValue();
                    }
                    return false;
                }
                c.a aVar = c.f288b;
                if (c.l(i10, aVar.g()) ? true : c.l(i10, aVar.a())) {
                    h10 = q(a0.e(jVar));
                } else {
                    if (!(c.l(i10, aVar.c()) ? true : c.l(i10, aVar.h()))) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    h10 = h(a0.e(jVar));
                }
                j i11 = i(a10, h10, i10);
                if (i11 != null) {
                    return lVar.invoke(i11).booleanValue();
                }
                return false;
            case 5:
                return false;
            case 6:
                return lVar.invoke(jVar).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
