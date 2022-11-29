package rg;

import ai.pv;
import ai.tw;
import ai.uj0;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f51388a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public pv f51389b;

    /* renamed from: c  reason: collision with root package name */
    public a f51390c;

    /* loaded from: classes3.dex */
    public static abstract class a {
        public void a() {
        }

        public void b(boolean z10) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public void a(@RecentlyNonNull a aVar) {
        rh.p.j(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f51388a) {
            this.f51390c = aVar;
            pv pvVar = this.f51389b;
            if (pvVar != null) {
                try {
                    pvVar.n5(new tw(aVar));
                } catch (RemoteException e10) {
                    uj0.d("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
        }
    }

    public final void b(pv pvVar) {
        synchronized (this.f51388a) {
            this.f51389b = pvVar;
            a aVar = this.f51390c;
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    public final pv c() {
        pv pvVar;
        synchronized (this.f51388a) {
            pvVar = this.f51389b;
        }
        return pvVar;
    }
}
