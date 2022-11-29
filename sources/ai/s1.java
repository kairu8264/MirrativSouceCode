package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class s1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public final StackTraceElement[] f9669i;

    public s1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(r0Var, "FW/4CvJE7gSaOIcNy9aPqAkZHcIOptuimuYgHtkFyrZcR+XexyybvWr2/z62L/0t", "gw9HX1g5D/FveKxEJmgn0Xdlo8h06mYt4u8/nHkUo04=", c64Var, i10, 45);
        this.f9669i = stackTraceElementArr;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f9669i;
        if (stackTraceElementArr != null) {
            j0 j0Var = new j0((String) this.f1689f.invoke(null, stackTraceElementArr));
            synchronized (this.f1688e) {
                this.f1688e.t(j0Var.f5565b.longValue());
                if (j0Var.f5566c.booleanValue()) {
                    this.f1688e.Q(true != j0Var.f5567d.booleanValue() ? 2 : 1);
                } else {
                    this.f1688e.Q(3);
                }
            }
        }
    }
}
