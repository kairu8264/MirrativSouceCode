package ai;

import android.os.Bundle;
import android.os.DeadObjectException;
import rh.c;

/* loaded from: classes3.dex */
public final class vm implements c.a {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ xm f11124w;

    public vm(xm xmVar) {
        this.f11124w = xmVar;
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        Object obj;
        Object obj2;
        an anVar;
        an anVar2;
        obj = this.f11124w.f11990b;
        synchronized (obj) {
            try {
                anVar = this.f11124w.f11991c;
                if (anVar != null) {
                    xm xmVar = this.f11124w;
                    anVar2 = xmVar.f11991c;
                    xmVar.f11993e = anVar2.i0();
                }
            } catch (DeadObjectException e10) {
                uj0.d("Unable to obtain a cache service instance.", e10);
                xm.j(this.f11124w);
            }
            obj2 = this.f11124w.f11990b;
            obj2.notifyAll();
        }
    }

    @Override // rh.c.a
    public final void s0(int i10) {
        Object obj;
        Object obj2;
        obj = this.f11124w.f11990b;
        synchronized (obj) {
            this.f11124w.f11993e = null;
            obj2 = this.f11124w.f11990b;
            obj2.notifyAll();
        }
    }
}
