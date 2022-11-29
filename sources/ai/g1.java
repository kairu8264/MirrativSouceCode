package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class g1 extends a2 {

    /* renamed from: i  reason: collision with root package name */
    public final long f4276i;

    public g1(r0 r0Var, String str, String str2, c64 c64Var, long j10, int i10, int i11) {
        super(r0Var, "bwYfemyqKvs+5mX5RaQoUxmdyIG97sQWktW0fw649v7l/u+oM9fVxJ1I47AdFZo9", "ue4Q/YADEXoviiBHZurTF9IPPlfQKRVJdzRZ56oggWM=", c64Var, i10, 25);
        this.f4276i = j10;
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f1689f.invoke(null, new Object[0])).longValue();
        synchronized (this.f1688e) {
            this.f1688e.M(longValue);
            long j10 = this.f4276i;
            if (j10 != 0) {
                this.f1688e.h0(longValue - j10);
                this.f1688e.l0(this.f4276i);
            }
        }
    }
}
