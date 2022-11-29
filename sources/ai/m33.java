package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class m33 extends j33 {
    public /* synthetic */ m33(k33 k33Var) {
        super(null);
    }

    @Override // ai.j33
    public final void a(n33<?> n33Var, Set<Throwable> set, Set<Throwable> set2) {
        Set set3;
        synchronized (n33Var) {
            set3 = n33Var.D;
            if (set3 == null) {
                n33Var.D = set2;
            }
        }
    }

    @Override // ai.j33
    public final int b(n33<?> n33Var) {
        int i10;
        int i11;
        synchronized (n33Var) {
            i10 = n33Var.E;
            i11 = i10 - 1;
            n33Var.E = i11;
        }
        return i11;
    }
}
