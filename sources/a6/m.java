package a6;

import rp.h0;

/* loaded from: classes.dex */
public final class m extends rp.l {

    /* renamed from: y  reason: collision with root package name */
    public static final a f499y = new a(null);
    @Deprecated

    /* renamed from: z  reason: collision with root package name */
    public static final rp.f f500z = rp.f.f51677z.b("0021F904");

    /* renamed from: x  reason: collision with root package name */
    public final rp.c f501x;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public m(h0 h0Var) {
        super(h0Var);
        this.f501x = new rp.c();
    }

    public final long c(rp.c cVar, long j10) {
        return po.n.e(this.f501x.f1(cVar, j10), 0L);
    }

    @Override // rp.l, rp.h0
    public long f1(rp.c cVar, long j10) {
        n0(j10);
        if (this.f501x.X() == 0) {
            return j10 == 0 ? 0L : -1L;
        }
        long j11 = 0;
        while (true) {
            long z02 = z0(f500z);
            if (z02 == -1) {
                break;
            }
            j11 += c(cVar, z02 + 4);
            if (n0(5L) && this.f501x.n(4L) == 0 && this.f501x.n(1L) < 2) {
                cVar.b1(this.f501x.n(0L));
                cVar.b1(10);
                cVar.b1(0);
                this.f501x.k(3L);
            }
        }
        if (j11 < j10) {
            j11 += c(cVar, j10 - j11);
        }
        if (j11 == 0) {
            return -1L;
        }
        return j11;
    }

    public final boolean n0(long j10) {
        if (this.f501x.X() >= j10) {
            return true;
        }
        long X = j10 - this.f501x.X();
        return super.f1(this.f501x, X) == X;
    }

    public final long z0(rp.f fVar) {
        long j10 = -1;
        while (true) {
            j10 = this.f501x.o(fVar.l(0), j10 + 1);
            if (j10 != -1 && (!n0(fVar.G()) || !this.f501x.c1(j10, fVar))) {
            }
        }
        return j10;
    }
}
