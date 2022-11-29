package s0;

import java.util.Objects;
import jo.p;
import l0.e1;
import l0.f1;
import l0.i;

/* loaded from: classes.dex */
public final class c {
    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final a b(i iVar, int i10, boolean z10, Object obj) {
        b bVar;
        p.h(iVar, "composer");
        p.h(obj, "block");
        iVar.x(i10);
        Object y10 = iVar.y();
        if (y10 == i.f39065a.a()) {
            bVar = new b(i10, z10);
            iVar.q(bVar);
        } else {
            Objects.requireNonNull(y10, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) y10;
        }
        bVar.g(obj);
        iVar.O();
        return bVar;
    }

    public static final a c(int i10, boolean z10, Object obj) {
        p.h(obj, "block");
        b bVar = new b(i10, z10);
        bVar.g(obj);
        return bVar;
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    public static final boolean e(e1 e1Var, e1 e1Var2) {
        p.h(e1Var2, "other");
        if (e1Var != null) {
            if ((e1Var instanceof f1) && (e1Var2 instanceof f1)) {
                f1 f1Var = (f1) e1Var;
                if (!f1Var.s() || p.c(e1Var, e1Var2) || p.c(f1Var.j(), ((f1) e1Var2).j())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i10) {
        return a(1, i10);
    }
}
