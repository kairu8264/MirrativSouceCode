package a1;

import a1.c;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f330a;

        static {
            int[] iArr = new int[m2.q.values().length];
            iArr[m2.q.Ltr.ordinal()] = 1;
            iArr[m2.q.Rtl.ordinal()] = 2;
            f330a = iArr;
        }
    }

    public static final t a(j jVar, int i10, m2.q qVar) {
        t h10;
        jo.p.h(jVar, "$this$customFocusSearch");
        jo.p.h(qVar, "layoutDirection");
        c.a aVar = c.f288b;
        if (c.l(i10, aVar.d())) {
            return jVar.i().e();
        }
        if (c.l(i10, aVar.f())) {
            return jVar.i().q();
        }
        if (c.l(i10, aVar.h())) {
            return jVar.i().g();
        }
        if (c.l(i10, aVar.a())) {
            return jVar.i().j();
        }
        if (c.l(i10, aVar.c())) {
            int i11 = a.f330a[qVar.ordinal()];
            if (i11 == 1) {
                h10 = jVar.i().d();
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                h10 = jVar.i().h();
            }
            if (jo.p.c(h10, t.f348b.a())) {
                h10 = null;
            }
            if (h10 == null) {
                return jVar.i().a();
            }
        } else if (c.l(i10, aVar.g())) {
            int i12 = a.f330a[qVar.ordinal()];
            if (i12 == 1) {
                h10 = jVar.i().h();
            } else if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                h10 = jVar.i().d();
            }
            if (jo.p.c(h10, t.f348b.a())) {
                h10 = null;
            }
            if (h10 == null) {
                return jVar.i().f();
            }
        } else if (c.l(i10, aVar.b())) {
            return t.f348b.a();
        } else {
            if (c.l(i10, aVar.e())) {
                return t.f348b.a();
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return h10;
    }
}
