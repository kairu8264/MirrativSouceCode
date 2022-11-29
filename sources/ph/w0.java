package ph;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class w0<T> extends j0 {

    /* renamed from: b  reason: collision with root package name */
    public final vi.h<T> f47564b;

    public w0(int i10, vi.h<T> hVar) {
        super(i10);
        this.f47564b = hVar;
    }

    @Override // ph.b1
    public final void a(Status status) {
        this.f47564b.d(new ApiException(status));
    }

    @Override // ph.b1
    public final void b(Exception exc) {
        this.f47564b.d(exc);
    }

    @Override // ph.b1
    public final void c(b0<?> b0Var) throws DeadObjectException {
        try {
            h(b0Var);
        } catch (DeadObjectException e10) {
            a(b1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(b1.e(e11));
        } catch (RuntimeException e12) {
            this.f47564b.d(e12);
        }
    }

    public abstract void h(b0<?> b0Var) throws RemoteException;
}
