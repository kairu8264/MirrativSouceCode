package sp;

import java.io.IOException;
import jo.p;
import rp.h0;
import rp.l;

/* loaded from: classes4.dex */
public final class b extends l {

    /* renamed from: x  reason: collision with root package name */
    public final long f52800x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f52801y;

    /* renamed from: z  reason: collision with root package name */
    public long f52802z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h0 h0Var, long j10, boolean z10) {
        super(h0Var);
        p.h(h0Var, "delegate");
        this.f52800x = j10;
        this.f52801y = z10;
    }

    public final void c(rp.c cVar, long j10) {
        rp.c cVar2 = new rp.c();
        cVar2.H0(cVar);
        cVar.O0(cVar2, j10);
        cVar2.clear();
    }

    @Override // rp.l, rp.h0
    public long f1(rp.c cVar, long j10) {
        p.h(cVar, "sink");
        long j11 = this.f52802z;
        long j12 = this.f52800x;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f52801y) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long f12 = super.f1(cVar, j10);
        int i10 = (f12 > (-1L) ? 1 : (f12 == (-1L) ? 0 : -1));
        if (i10 != 0) {
            this.f52802z += f12;
        }
        long j14 = this.f52802z;
        long j15 = this.f52800x;
        if ((j14 >= j15 || i10 != 0) && j14 <= j15) {
            return f12;
        }
        if (f12 > 0 && j14 > j15) {
            c(cVar, cVar.X() - (this.f52802z - this.f52800x));
        }
        throw new IOException("expected " + this.f52800x + " bytes but got " + this.f52802z);
    }
}
