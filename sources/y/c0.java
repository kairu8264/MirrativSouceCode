package y;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class c0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60686a;

        static {
            int[] iArr = new int[e0.values().length];
            iArr[e0.Min.ordinal()] = 1;
            iArr[e0.Max.ordinal()] = 2;
            f60686a = iArr;
        }
    }

    public static final x0.f a(x0.f fVar, e0 e0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(e0Var, "intrinsicSize");
        int i10 = a.f60686a[e0Var.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return fVar.L(j0.f60829w);
            }
            throw new NoWhenBranchMatchedException();
        }
        return fVar.L(l0.f60838w);
    }

    public static final x0.f b(x0.f fVar, e0 e0Var) {
        jo.p.h(fVar, "<this>");
        jo.p.h(e0Var, "intrinsicSize");
        int i10 = a.f60686a[e0Var.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return fVar.L(k0.f60832w);
            }
            throw new NoWhenBranchMatchedException();
        }
        return fVar.L(m0.f60851w);
    }
}
