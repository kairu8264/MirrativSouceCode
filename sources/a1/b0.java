package a1;

import a1.c;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import q1.c;

/* loaded from: classes.dex */
public final class b0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f283a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.ActiveParent.ordinal()] = 1;
            iArr[y.DeactivatedParent.ordinal()] = 2;
            iArr[y.Active.ordinal()] = 3;
            iArr[y.Captured.ordinal()] = 4;
            iArr[y.Deactivated.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f283a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c.a, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ j f284w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j f285x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f286y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<j, Boolean> f287z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j jVar, j jVar2, int i10, io.l<? super j, Boolean> lVar) {
            super(1);
            this.f284w = jVar;
            this.f285x = jVar2;
            this.f286y = i10;
            this.f287z = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(c.a aVar) {
            jo.p.h(aVar, "$this$searchBeyondBounds");
            Boolean valueOf = Boolean.valueOf(b0.i(this.f284w, this.f285x, this.f286y, this.f287z));
            if (valueOf.booleanValue() || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            s1.k z12;
            s1.k z13;
            s1.p r10 = ((j) t10).r();
            Integer num = null;
            Integer valueOf = (r10 == null || (z13 = r10.z1()) == null) ? null : Integer.valueOf(z13.v0());
            s1.p r11 = ((j) t11).r();
            if (r11 != null && (z12 = r11.z1()) != null) {
                num = Integer.valueOf(z12.v0());
            }
            return zn.a.c(valueOf, num);
        }
    }

    public static final boolean b(j jVar, io.l<? super j, Boolean> lVar) {
        y l10 = jVar.l();
        int[] iArr = a.f283a;
        switch (iArr[l10.ordinal()]) {
            case 1:
            case 2:
                j m10 = jVar.m();
                if (m10 != null) {
                    switch (iArr[m10.l().ordinal()]) {
                        case 1:
                            if (!b(m10, lVar) && !lVar.invoke(m10).booleanValue()) {
                                return false;
                            }
                            break;
                        case 2:
                            if (!b(m10, lVar) && !d(jVar, m10, a1.c.f288b.f(), lVar)) {
                                return false;
                            }
                            break;
                        case 3:
                        case 4:
                            return d(jVar, m10, a1.c.f288b.f(), lVar);
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
            case 3:
            case 4:
            case 5:
                return g(jVar, lVar);
            case 6:
                if (!g(jVar, lVar) && !lVar.invoke(jVar).booleanValue()) {
                    return false;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    public static final boolean c(j jVar, io.l<? super j, Boolean> lVar) {
        switch (a.f283a[jVar.l().ordinal()]) {
            case 1:
            case 2:
                j m10 = jVar.m();
                if (m10 != null) {
                    return c(m10, lVar) || d(jVar, m10, a1.c.f288b.d(), lVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
            case 5:
                return h(jVar, lVar);
            case 6:
                return lVar.invoke(jVar).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean d(j jVar, j jVar2, int i10, io.l<? super j, Boolean> lVar) {
        if (i(jVar, jVar2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a1.a.a(jVar, i10, new b(jVar, jVar2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean e(j jVar) {
        return jVar.s() == null;
    }

    public static final boolean f(j jVar, int i10, io.l<? super j, Boolean> lVar) {
        jo.p.h(jVar, "$this$oneDimensionalFocusSearch");
        jo.p.h(lVar, "onFound");
        c.a aVar = a1.c.f288b;
        if (a1.c.l(i10, aVar.d())) {
            return c(jVar, lVar);
        }
        if (a1.c.l(i10, aVar.f())) {
            return b(jVar, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    public static final boolean g(j jVar, io.l<? super j, Boolean> lVar) {
        j(jVar.f());
        m0.e<j> f10 = jVar.f();
        int p10 = f10.p();
        if (p10 > 0) {
            int i10 = p10 - 1;
            j[] n10 = f10.n();
            do {
                j jVar2 = n10[i10];
                if (a0.g(jVar2) && b(jVar2, lVar)) {
                    return true;
                }
                i10--;
            } while (i10 >= 0);
            return false;
        }
        return false;
    }

    public static final boolean h(j jVar, io.l<? super j, Boolean> lVar) {
        j(jVar.f());
        m0.e<j> f10 = jVar.f();
        int p10 = f10.p();
        if (p10 > 0) {
            j[] n10 = f10.n();
            int i10 = 0;
            do {
                j jVar2 = n10[i10];
                if (a0.g(jVar2) && c(jVar2, lVar)) {
                    return true;
                }
                i10++;
            } while (i10 < p10);
            return false;
        }
        return false;
    }

    public static final boolean i(j jVar, j jVar2, int i10, io.l<? super j, Boolean> lVar) {
        if (jVar.l() == y.ActiveParent || jVar.l() == y.DeactivatedParent) {
            j(jVar.f());
            c.a aVar = a1.c.f288b;
            if (a1.c.l(i10, aVar.d())) {
                m0.e<j> f10 = jVar.f();
                po.i iVar = new po.i(0, f10.p() - 1);
                int k10 = iVar.k();
                int m10 = iVar.m();
                if (k10 <= m10) {
                    boolean z10 = false;
                    while (true) {
                        if (z10) {
                            j jVar3 = f10.n()[k10];
                            if (a0.g(jVar3) && c(jVar3, lVar)) {
                                return true;
                            }
                        }
                        if (jo.p.c(f10.n()[k10], jVar2)) {
                            z10 = true;
                        }
                        if (k10 == m10) {
                            break;
                        }
                        k10++;
                    }
                }
            } else if (a1.c.l(i10, aVar.f())) {
                m0.e<j> f11 = jVar.f();
                po.i iVar2 = new po.i(0, f11.p() - 1);
                int k11 = iVar2.k();
                int m11 = iVar2.m();
                if (k11 <= m11) {
                    boolean z11 = false;
                    while (true) {
                        if (z11) {
                            j jVar4 = f11.n()[m11];
                            if (a0.g(jVar4) && b(jVar4, lVar)) {
                                return true;
                            }
                        }
                        if (jo.p.c(f11.n()[m11], jVar2)) {
                            z11 = true;
                        }
                        if (m11 == k11) {
                            break;
                        }
                        m11--;
                    }
                }
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            if (a1.c.l(i10, a1.c.f288b.d()) || jVar.l() == y.DeactivatedParent || e(jVar)) {
                return false;
            }
            return lVar.invoke(jVar).booleanValue();
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }

    public static final void j(m0.e<j> eVar) {
        eVar.D(new c());
    }
}
