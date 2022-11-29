package ph;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class k0<T> implements vi.c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e f47508a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47509b;

    /* renamed from: c  reason: collision with root package name */
    public final b<?> f47510c;

    /* renamed from: d  reason: collision with root package name */
    public final long f47511d;

    /* renamed from: e  reason: collision with root package name */
    public final long f47512e;

    public k0(e eVar, int i10, b<?> bVar, long j10, long j11, String str, String str2) {
        this.f47508a = eVar;
        this.f47509b = i10;
        this.f47510c = bVar;
        this.f47511d = j10;
        this.f47512e = j11;
    }

    public static <T> k0<T> b(e eVar, int i10, b<?> bVar) {
        boolean z10;
        if (eVar.f()) {
            rh.r a10 = rh.q.b().a();
            if (a10 == null) {
                z10 = true;
            } else if (!a10.S()) {
                return null;
            } else {
                z10 = a10.U();
                b0 w10 = eVar.w(bVar);
                if (w10 != null) {
                    if (!(w10.s() instanceof rh.c)) {
                        return null;
                    }
                    rh.c cVar = (rh.c) w10.s();
                    if (cVar.H() && !cVar.b()) {
                        rh.e c10 = c(w10, cVar, i10);
                        if (c10 == null) {
                            return null;
                        }
                        w10.D();
                        z10 = c10.k0();
                    }
                }
            }
            return new k0<>(eVar, i10, bVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    public static rh.e c(b0<?> b0Var, rh.c<?> cVar, int i10) {
        int[] P;
        int[] S;
        rh.e F = cVar.F();
        if (F == null || !F.U() || ((P = F.P()) != null ? !vh.b.b(P, i10) : !((S = F.S()) == null || !vh.b.b(S, i10))) || b0Var.p() >= F.p()) {
            return null;
        }
        return F;
    }

    @Override // vi.c
    public final void a(vi.g<T> gVar) {
        b0 w10;
        int i10;
        int i11;
        int i12;
        int p10;
        long j10;
        long j11;
        int i13;
        if (this.f47508a.f()) {
            rh.r a10 = rh.q.b().a();
            if ((a10 == null || a10.S()) && (w10 = this.f47508a.w(this.f47510c)) != null && (w10.s() instanceof rh.c)) {
                rh.c cVar = (rh.c) w10.s();
                boolean z10 = true;
                int i14 = 0;
                boolean z11 = this.f47511d > 0;
                int x10 = cVar.x();
                if (a10 != null) {
                    z11 &= a10.U();
                    int p11 = a10.p();
                    int P = a10.P();
                    i10 = a10.k0();
                    if (cVar.H() && !cVar.b()) {
                        rh.e c10 = c(w10, cVar, this.f47509b);
                        if (c10 == null) {
                            return;
                        }
                        if (!c10.k0() || this.f47511d <= 0) {
                            z10 = false;
                        }
                        P = c10.p();
                        z11 = z10;
                    }
                    i12 = p11;
                    i11 = P;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                e eVar = this.f47508a;
                if (gVar.s()) {
                    p10 = 0;
                } else {
                    if (gVar.q()) {
                        i14 = 100;
                    } else {
                        Exception n10 = gVar.n();
                        if (n10 instanceof ApiException) {
                            Status a11 = ((ApiException) n10).a();
                            int P2 = a11.P();
                            ConnectionResult p12 = a11.p();
                            p10 = p12 == null ? -1 : p12.p();
                            i14 = P2;
                        } else {
                            i14 = 101;
                        }
                    }
                    p10 = -1;
                }
                if (z11) {
                    long j12 = this.f47511d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - this.f47512e);
                    j10 = j12;
                    j11 = currentTimeMillis;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i13 = -1;
                }
                eVar.F(new rh.m(this.f47509b, i14, p10, j10, j11, null, null, x10, i13), i10, i12, i11);
            }
        }
    }
}
