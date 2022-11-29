package ai;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class kz2 extends nz2 {
    public kz2() {
        super(null);
    }

    public static final nz2 j(int i10) {
        nz2 nz2Var;
        nz2 nz2Var2;
        nz2 nz2Var3;
        if (i10 < 0) {
            nz2Var3 = nz2.f7588b;
            return nz2Var3;
        } else if (i10 > 0) {
            nz2Var2 = nz2.f7589c;
            return nz2Var2;
        } else {
            nz2Var = nz2.f7587a;
            return nz2Var;
        }
    }

    @Override // ai.nz2
    public final <T> nz2 a(T t10, T t11, Comparator<T> comparator) {
        return j(comparator.compare(t10, t11));
    }

    @Override // ai.nz2
    public final nz2 b(int i10, int i11) {
        return j(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // ai.nz2
    public final nz2 c(boolean z10, boolean z11) {
        return j(g23.a(false, false));
    }

    @Override // ai.nz2
    public final nz2 d(boolean z10, boolean z11) {
        return j(g23.a(z10, z11));
    }

    @Override // ai.nz2
    public final int e() {
        return 0;
    }
}
