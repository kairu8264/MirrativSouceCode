package y1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import j2.g;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class e0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61087a;

        static {
            int[] iArr = new int[m2.q.values().length];
            iArr[m2.q.Ltr.ordinal()] = 1;
            iArr[m2.q.Rtl.ordinal()] = 2;
            f61087a = iArr;
        }
    }

    public static final /* synthetic */ t a(s sVar, r rVar) {
        return b(sVar, rVar);
    }

    public static final t b(s sVar, r rVar) {
        return null;
    }

    public static final d0 c(d0 d0Var, m2.q qVar) {
        jo.p.h(d0Var, TtmlNode.TAG_STYLE);
        jo.p.h(qVar, "direction");
        return new d0(w.b(d0Var.u()), o.a(d0Var.r(), qVar), d0Var.s());
    }

    public static final int d(m2.q qVar, j2.g gVar) {
        jo.p.h(qVar, "layoutDirection");
        g.a aVar = j2.g.f37088b;
        if (gVar == null ? false : j2.g.i(gVar.l(), aVar.a())) {
            int i10 = a.f61087a[qVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return aVar.c();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.b();
        } else if (gVar == null) {
            int i11 = a.f61087a[qVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return aVar.e();
                }
                throw new NoWhenBranchMatchedException();
            }
            return aVar.d();
        } else {
            return gVar.l();
        }
    }
}
