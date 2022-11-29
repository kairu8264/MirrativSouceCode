package a1;

import a1.c;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class a0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f277a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f278b;

        static {
            int[] iArr = new int[m2.q.values().length];
            iArr[m2.q.Rtl.ordinal()] = 1;
            iArr[m2.q.Ltr.ordinal()] = 2;
            f277a = iArr;
            int[] iArr2 = new int[y.values().length];
            iArr2[y.Active.ordinal()] = 1;
            iArr2[y.Captured.ordinal()] = 2;
            iArr2[y.ActiveParent.ordinal()] = 3;
            iArr2[y.DeactivatedParent.ordinal()] = 4;
            iArr2[y.Inactive.ordinal()] = 5;
            iArr2[y.Deactivated.ordinal()] = 6;
            f278b = iArr2;
        }
    }

    public static final m0.e<j> a(j jVar) {
        boolean z10;
        jo.p.h(jVar, "<this>");
        m0.e<j> f10 = jVar.f();
        int p10 = f10.p();
        int i10 = 0;
        if (p10 <= 0) {
            z10 = false;
            break;
        }
        j[] n10 = f10.n();
        int i11 = 0;
        while (!n10[i11].l().h()) {
            i11++;
            if (i11 >= p10) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (!z10) {
            return jVar.f();
        }
        m0.e<j> eVar = new m0.e<>(new j[16], 0);
        m0.e<j> f11 = jVar.f();
        int p11 = f11.p();
        if (p11 > 0) {
            j[] n11 = f11.n();
            do {
                j jVar2 = n11[i10];
                if (!jVar2.l().h()) {
                    eVar.c(jVar2);
                } else {
                    eVar.e(eVar.p(), a(jVar2));
                }
                i10++;
            } while (i10 < p11);
            return eVar;
        }
        return eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final j b(j jVar) {
        jo.p.h(jVar, "<this>");
        switch (a.f278b[jVar.l().ordinal()]) {
            case 1:
            case 2:
                return jVar;
            case 3:
            case 4:
                j m10 = jVar.m();
                if (m10 != null) {
                    return b(m10);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final j c(j jVar) {
        jo.p.h(jVar, "<this>");
        j s10 = jVar.s();
        if (s10 != null) {
            switch (a.f278b[jVar.l().ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    return c(s10);
                case 3:
                    return jVar;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final l1.e d(a1.j r7) {
        /*
            java.lang.String r0 = "<this>"
            jo.p.h(r7, r0)
            s1.p r0 = r7.r()
            r1 = 0
            if (r0 == 0) goto L40
            s1.k r0 = r0.z1()
            if (r0 != 0) goto L13
            goto L40
        L13:
            m0.e r2 = r7.n()
            int r3 = r2.p()
            if (r3 <= 0) goto L38
            r4 = 0
            java.lang.Object[] r2 = r2.n()
        L22:
            r5 = r2[r4]
            l1.e r5 = (l1.e) r5
            s1.k r6 = r5.a()
            boolean r6 = jo.p.c(r6, r0)
            if (r6 == 0) goto L34
            l1.e r1 = h(r5, r1)
        L34:
            int r4 = r4 + 1
            if (r4 < r3) goto L22
        L38:
            if (r1 == 0) goto L3b
            return r1
        L3b:
            l1.e r7 = r7.p()
            return r7
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a0.d(a1.j):l1.e");
    }

    public static final b1.h e(j jVar) {
        b1.h k10;
        jo.p.h(jVar, "<this>");
        s1.p r10 = jVar.r();
        return (r10 == null || (k10 = q1.r.d(r10).k(r10, false)) == null) ? b1.h.f16726e.a() : k10;
    }

    public static final boolean f(j jVar, int i10, m2.q qVar, io.l<? super j, Boolean> lVar) {
        int c10;
        jo.p.h(jVar, "$this$focusSearch");
        jo.p.h(qVar, "layoutDirection");
        jo.p.h(lVar, "onFound");
        c.a aVar = c.f288b;
        if (c.l(i10, aVar.d()) ? true : c.l(i10, aVar.f())) {
            return b0.f(jVar, i10, lVar);
        }
        if (c.l(i10, aVar.c()) ? true : c.l(i10, aVar.g()) ? true : c.l(i10, aVar.h()) ? true : c.l(i10, aVar.a())) {
            return c0.r(jVar, i10, lVar);
        }
        if (c.l(i10, aVar.b())) {
            int i11 = a.f277a[qVar.ordinal()];
            if (i11 == 1) {
                c10 = aVar.c();
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                c10 = aVar.g();
            }
            j b10 = b(jVar);
            if (b10 != null) {
                return c0.r(b10, c10, lVar);
            }
            return false;
        } else if (c.l(i10, aVar.e())) {
            j b11 = b(jVar);
            j c11 = b11 != null ? c(b11) : null;
            if (jo.p.c(c11, jVar) || c11 == null) {
                return false;
            }
            return lVar.invoke(c11).booleanValue();
        } else {
            throw new IllegalStateException("Invalid FocusDirection".toString());
        }
    }

    public static final boolean g(j jVar) {
        s1.k z12;
        s1.k z13;
        jo.p.h(jVar, "<this>");
        s1.p r10 = jVar.r();
        if ((r10 == null || (z13 = r10.z1()) == null || !z13.g()) ? false : true) {
            s1.p r11 = jVar.r();
            if ((r11 == null || (z12 = r11.z1()) == null || !z12.L0()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final l1.e h(l1.e r3, l1.e r4) {
        /*
            if (r4 != 0) goto L3
            return r3
        L3:
            s1.k r0 = r3.a()
            r1 = r4
        L8:
            boolean r2 = jo.p.c(r1, r3)
            if (r2 != 0) goto L1f
            l1.e r1 = r1.b()
            if (r1 == 0) goto L1e
            s1.k r2 = r1.a()
            boolean r2 = jo.p.c(r2, r0)
            if (r2 != 0) goto L8
        L1e:
            return r3
        L1f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a0.h(l1.e, l1.e):l1.e");
    }
}
