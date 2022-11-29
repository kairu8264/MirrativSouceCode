package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.c;
import oh.e;
import rh.p;

/* loaded from: classes3.dex */
public abstract class a<R extends e, A extends a.b> extends BasePendingResult<R> {

    /* renamed from: q  reason: collision with root package name */
    public final a.c<A> f27217q;

    /* renamed from: r  reason: collision with root package name */
    public final com.google.android.gms.common.api.a<?> f27218r;

    public a(com.google.android.gms.common.api.a<?> aVar, c cVar) {
        super((c) p.j(cVar, "GoogleApiClient must not be null"));
        p.j(aVar, "Api must not be null");
        this.f27217q = (a.c<A>) aVar.b();
        this.f27218r = aVar;
    }

    public abstract void l(A a10) throws RemoteException;

    public void m(R r10) {
    }

    public final void n(A a10) throws DeadObjectException {
        try {
            l(a10);
        } catch (DeadObjectException e10) {
            o(e10);
            throw e10;
        } catch (RemoteException e11) {
            o(e11);
        }
    }

    public final void o(RemoteException remoteException) {
        p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public final void p(Status status) {
        p.b(!status.k0(), "Failed result must not be success");
        R c10 = c(status);
        f(c10);
        m(c10);
    }
}
