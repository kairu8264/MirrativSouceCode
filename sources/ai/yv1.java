package ai;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class yv1 implements e43<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ee0 f12754a;

    public yv1(cw1 cw1Var, ee0 ee0Var) {
        this.f12754a = ee0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        try {
            this.f12754a.j5(yg.d0.p(th2));
        } catch (RemoteException e10) {
            yg.p1.l("Service can't call client", e10);
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f12754a.c5(parcelFileDescriptor);
        } catch (RemoteException e10) {
            yg.p1.l("Service can't call client", e10);
        }
    }
}
