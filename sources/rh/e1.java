package rh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import rh.c;

/* loaded from: classes3.dex */
public final class e1 extends r0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f51437g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f51438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f51438h = cVar;
        this.f51437g = iBinder;
    }

    @Override // rh.r0
    public final void f(ConnectionResult connectionResult) {
        if (this.f51438h.R != null) {
            this.f51438h.R.z0(connectionResult);
        }
        this.f51438h.J(connectionResult);
    }

    @Override // rh.r0
    public final boolean g() {
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f51437g;
            p.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f51438h.C().equals(interfaceDescriptor)) {
                String C = this.f51438h.C();
                StringBuilder sb2 = new StringBuilder(String.valueOf(C).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(C);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface q10 = this.f51438h.q(this.f51437g);
            if (q10 == null || !(c.e0(this.f51438h, 2, 4, q10) || c.e0(this.f51438h, 3, 4, q10))) {
                return false;
            }
            this.f51438h.V = null;
            Bundle v10 = this.f51438h.v();
            c cVar = this.f51438h;
            aVar = cVar.Q;
            if (aVar != null) {
                aVar2 = cVar.Q;
                aVar2.i0(v10);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
