package a6;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f484a = new f();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f485a;

        static {
            int[] iArr = new int[k6.g.values().length];
            iArr[k6.g.FILL.ordinal()] = 1;
            iArr[k6.g.FIT.ordinal()] = 2;
            f485a = iArr;
        }
    }

    public static final int a(int i10, int i11, int i12, int i13, k6.g gVar) {
        int min;
        int highestOneBit = Integer.highestOneBit(i10 / i12);
        int highestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f485a[gVar.ordinal()];
        if (i14 == 1) {
            min = Math.min(highestOneBit, highestOneBit2);
        } else if (i14 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            min = Math.max(highestOneBit, highestOneBit2);
        }
        return po.n.d(min, 1);
    }

    public static final double b(double d10, double d11, double d12, double d13, k6.g gVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f485a[gVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Math.min(d14, d15);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d14, d15);
    }

    public static final double c(int i10, int i11, int i12, int i13, k6.g gVar) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int i14 = a.f485a[gVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return Math.min(d10, d11);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d10, d11);
    }
}
