package rh;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class d1 implements ServiceConnection {

    /* renamed from: w  reason: collision with root package name */
    public final int f51431w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c f51432x;

    public d1(c cVar, int i10) {
        this.f51432x = cVar;
        this.f51431w = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        l t0Var;
        c cVar = this.f51432x;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        obj = cVar.J;
        synchronized (obj) {
            c cVar2 = this.f51432x;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof l)) {
                t0Var = (l) queryLocalInterface;
            } else {
                t0Var = new t0(iBinder);
            }
            cVar2.K = t0Var;
        }
        this.f51432x.c0(0, null, this.f51431w);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f51432x.J;
        synchronized (obj) {
            this.f51432x.K = null;
        }
        Handler handler = this.f51432x.H;
        handler.sendMessage(handler.obtainMessage(6, this.f51431w, 1));
    }
}
