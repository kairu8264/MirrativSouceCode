package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class p1 extends a2 {
    public p1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "Md0NasjzX5Dv6RV9gbRrdbbQw799E9EBpEgmAwiNqi/RiG7V51y0yTZI5hLTRiUF", "4FqMwpBmkecZ5KuntXganMUU8jtWDsP5C5fiOE4sCtY=", c64Var, i10, 73);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.f1689f.invoke(null, this.f1685b.c())).booleanValue();
            c64 c64Var = this.f1688e;
            if (true == booleanValue) {
                i10 = 2;
            }
            c64Var.R(i10);
        } catch (InvocationTargetException unused) {
            this.f1688e.R(3);
        }
    }
}
