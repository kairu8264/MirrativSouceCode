package dk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class q implements ServiceConnection {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ r f29701w;

    public /* synthetic */ q(r rVar, p pVar) {
        this.f29701w = rVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        r.f(this.f29701w).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f29701w.c().post(new n(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r.f(this.f29701w).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f29701w.c().post(new o(this));
    }
}
