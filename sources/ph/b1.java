package ph;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f47464a;

    public b1(int i10) {
        this.f47464a = i10;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(b0<?> b0Var) throws DeadObjectException;

    public abstract void d(r rVar, boolean z10);
}
