package a1;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f318a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.Active.ordinal()] = 1;
            iArr[y.Captured.ordinal()] = 2;
            iArr[y.ActiveParent.ordinal()] = 3;
            iArr[y.DeactivatedParent.ordinal()] = 4;
            iArr[y.Deactivated.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f318a = iArr;
        }
    }

    public static final j c(j jVar) {
        j c10;
        switch (a.f318a[jVar.l().ordinal()]) {
            case 1:
            case 2:
                return jVar;
            case 3:
            case 4:
                j m10 = jVar.m();
                if (m10 == null || (c10 = c(m10)) == null) {
                    throw new IllegalStateException("no child".toString());
                }
                return c10;
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void d(j jVar) {
        r.d(jVar);
        m0.e<j> f10 = jVar.f();
        int p10 = f10.p();
        if (p10 > 0) {
            int i10 = 0;
            j[] n10 = f10.n();
            do {
                d(n10[i10]);
                i10++;
            } while (i10 < p10);
        }
    }
}
