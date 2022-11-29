package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class w1 extends a2 {
    public w1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "TDjQ/ClZ1A6U11LRle5Q8IpNZYzzk0FLHirJ3MQW6+Xmi/90o6gFxPcIONwzxlWm", "ZlhR2acRJ5DFhes+PG5pnG7AissVCA1YeE0si8KUOuk=", c64Var, i10, 48);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f1688e.N(3);
        boolean booleanValue = ((Boolean) this.f1689f.invoke(null, this.f1685b.c())).booleanValue();
        synchronized (this.f1688e) {
            if (booleanValue) {
                this.f1688e.N(2);
            } else {
                this.f1688e.N(1);
            }
        }
    }
}
