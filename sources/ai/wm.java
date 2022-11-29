package ai;

import com.google.android.gms.common.ConnectionResult;
import rh.c;

/* loaded from: classes3.dex */
public final class wm implements c.b {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ xm f11688w;

    public wm(xm xmVar) {
        this.f11688w = xmVar;
    }

    @Override // rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        Object obj;
        an anVar;
        Object obj2;
        obj = this.f11688w.f11990b;
        synchronized (obj) {
            this.f11688w.f11993e = null;
            anVar = this.f11688w.f11991c;
            if (anVar != null) {
                this.f11688w.f11991c = null;
            }
            obj2 = this.f11688w.f11990b;
            obj2.notifyAll();
        }
    }
}
