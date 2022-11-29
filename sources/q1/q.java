package q1;

/* loaded from: classes.dex */
public interface q {
    static /* synthetic */ b1.h o(q qVar, q qVar2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return qVar.k(qVar2, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    q P();

    long R(long j10);

    long a();

    boolean h();

    b1.h k(q qVar, boolean z10);

    long q(long j10);

    long w(long j10);

    long z(q qVar, long j10);
}
