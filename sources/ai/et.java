package ai;

/* loaded from: classes3.dex */
public class et extends rg.c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3767a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public rg.c f3768b;

    @Override // rg.c
    public final void n() {
        synchronized (this.f3767a) {
            rg.c cVar = this.f3768b;
            if (cVar != null) {
                cVar.n();
            }
        }
    }

    @Override // rg.c
    public final void onAdClicked() {
        synchronized (this.f3767a) {
            rg.c cVar = this.f3768b;
            if (cVar != null) {
                cVar.onAdClicked();
            }
        }
    }

    @Override // rg.c
    public void p(rg.m mVar) {
        synchronized (this.f3767a) {
            rg.c cVar = this.f3768b;
            if (cVar != null) {
                cVar.p(mVar);
            }
        }
    }

    @Override // rg.c
    public final void s() {
        synchronized (this.f3767a) {
            rg.c cVar = this.f3768b;
            if (cVar != null) {
                cVar.s();
            }
        }
    }

    @Override // rg.c
    public void t() {
        synchronized (this.f3767a) {
            rg.c cVar = this.f3768b;
            if (cVar != null) {
                cVar.t();
            }
        }
    }

    @Override // rg.c
    public final void u() {
        synchronized (this.f3767a) {
            rg.c cVar = this.f3768b;
            if (cVar != null) {
                cVar.u();
            }
        }
    }

    public final void v(rg.c cVar) {
        synchronized (this.f3767a) {
            this.f3768b = cVar;
        }
    }
}
