package ai;

import java.util.List;

/* loaded from: classes3.dex */
public final class ij3 extends kj3 {
    public /* synthetic */ ij3(jj3 jj3Var) {
        super(null);
    }

    @Override // ai.kj3
    public final <L> List<L> a(Object obj, long j10) {
        aj3 aj3Var = (aj3) nl3.v(obj, j10);
        if (aj3Var.zza()) {
            return aj3Var;
        }
        int size = aj3Var.size();
        aj3 i10 = aj3Var.i(size == 0 ? 10 : size + size);
        nl3.w(obj, j10, i10);
        return i10;
    }

    @Override // ai.kj3
    public final void b(Object obj, long j10) {
        ((aj3) nl3.v(obj, j10)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // ai.kj3
    public final <E> void c(Object obj, Object obj2, long j10) {
        aj3<E> aj3Var = (aj3) nl3.v(obj, j10);
        aj3<E> aj3Var2 = (aj3) nl3.v(obj2, j10);
        int size = aj3Var.size();
        int size2 = aj3Var2.size();
        aj3<E> aj3Var3 = aj3Var;
        aj3Var3 = aj3Var;
        if (size > 0 && size2 > 0) {
            boolean zza = aj3Var.zza();
            aj3<E> aj3Var4 = aj3Var;
            if (!zza) {
                aj3Var4 = aj3Var.i(size2 + size);
            }
            aj3Var4.addAll(aj3Var2);
            aj3Var3 = aj3Var4;
        }
        if (size > 0) {
            aj3Var2 = aj3Var3;
        }
        nl3.w(obj, j10, aj3Var2);
    }
}
