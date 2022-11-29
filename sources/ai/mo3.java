package ai;

/* loaded from: classes3.dex */
public final class mo3 implements sq3 {

    /* renamed from: w  reason: collision with root package name */
    public final sq3[] f6994w;

    public mo3(sq3[] sq3VarArr) {
        this.f6994w = sq3VarArr;
    }

    @Override // ai.sq3
    public final void a(long j10) {
        for (sq3 sq3Var : this.f6994w) {
            sq3Var.a(j10);
        }
    }

    @Override // ai.sq3
    public final boolean c(long j10) {
        sq3[] sq3VarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long i10 = i();
            if (i10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (sq3 sq3Var : this.f6994w) {
                long i11 = sq3Var.i();
                boolean z12 = i11 != Long.MIN_VALUE && i11 <= j10;
                if (i11 == i10 || z12) {
                    z10 |= sq3Var.c(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // ai.sq3
    public final long e() {
        long j10 = Long.MAX_VALUE;
        for (sq3 sq3Var : this.f6994w) {
            long e10 = sq3Var.e();
            if (e10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // ai.sq3
    public final long i() {
        long j10 = Long.MAX_VALUE;
        for (sq3 sq3Var : this.f6994w) {
            long i10 = sq3Var.i();
            if (i10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, i10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // ai.sq3
    public final boolean k() {
        for (sq3 sq3Var : this.f6994w) {
            if (sq3Var.k()) {
                return true;
            }
        }
        return false;
    }
}
