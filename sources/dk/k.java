package dk;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class k extends g {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ r f29697x;

    public k(r rVar) {
        this.f29697x = rVar;
    }

    @Override // dk.g
    public final void a() {
        IInterface iInterface;
        f fVar;
        Context context;
        ServiceConnection serviceConnection;
        iInterface = this.f29697x.f29716n;
        if (iInterface != null) {
            fVar = this.f29697x.f29704b;
            fVar.d("Unbind from service.", new Object[0]);
            context = this.f29697x.f29703a;
            serviceConnection = this.f29697x.f29715m;
            context.unbindService(serviceConnection);
            this.f29697x.f29709g = false;
            this.f29697x.f29716n = null;
            this.f29697x.f29715m = null;
        }
        this.f29697x.u();
    }
}
