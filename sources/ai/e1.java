package ai;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class e1 extends a2 {
    public e1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "BEk7ZnZgUEtCcnEVmnqrsudDaU91B7wv3jOIcYFOdixfCZNd4CeUtXw9CNec1bEk", "yo4aeX8SQAYiyb+wCfW6Y7Ut6lHDx7k9wp/IaZ/McDY=", c64Var, i10, 5);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f1688e.a0(-1L);
        this.f1688e.b0(-1L);
        int[] iArr = (int[]) this.f1689f.invoke(null, this.f1685b.c());
        synchronized (this.f1688e) {
            this.f1688e.a0(iArr[0]);
            this.f1688e.b0(iArr[1]);
            int i10 = iArr[2];
            if (i10 != Integer.MIN_VALUE) {
                this.f1688e.D(i10);
            }
        }
    }
}
