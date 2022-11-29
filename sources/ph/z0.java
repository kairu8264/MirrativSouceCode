package ph;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* loaded from: classes3.dex */
public final class z0<ResultT> extends j0 {

    /* renamed from: b  reason: collision with root package name */
    public final n<a.b, ResultT> f47570b;

    /* renamed from: c  reason: collision with root package name */
    public final vi.h<ResultT> f47571c;

    /* renamed from: d  reason: collision with root package name */
    public final m f47572d;

    public z0(int i10, n<a.b, ResultT> nVar, vi.h<ResultT> hVar, m mVar) {
        super(i10);
        this.f47571c = hVar;
        this.f47570b = nVar;
        this.f47572d = mVar;
        if (i10 == 2 && nVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // ph.b1
    public final void a(Status status) {
        this.f47571c.d(this.f47572d.a(status));
    }

    @Override // ph.b1
    public final void b(Exception exc) {
        this.f47571c.d(exc);
    }

    @Override // ph.b1
    public final void c(b0<?> b0Var) throws DeadObjectException {
        try {
            this.f47570b.b(b0Var.s(), this.f47571c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(b1.e(e11));
        } catch (RuntimeException e12) {
            this.f47571c.d(e12);
        }
    }

    @Override // ph.b1
    public final void d(r rVar, boolean z10) {
        rVar.d(this.f47571c, z10);
    }

    @Override // ph.j0
    public final boolean f(b0<?> b0Var) {
        return this.f47570b.c();
    }

    @Override // ph.j0
    public final nh.c[] g(b0<?> b0Var) {
        return this.f47570b.e();
    }
}
