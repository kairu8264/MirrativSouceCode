package ai;

import java.util.List;

/* loaded from: classes3.dex */
public final class ml implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ nl f6967w;

    public ml(nl nlVar) {
        this.f6967w = nlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        boolean z11;
        List<ol> list;
        obj = this.f6967w.f7377y;
        synchronized (obj) {
            z10 = this.f6967w.f7378z;
            if (z10) {
                z11 = this.f6967w.A;
                if (z11) {
                    this.f6967w.f7378z = false;
                    uj0.a("App went background");
                    list = this.f6967w.B;
                    for (ol olVar : list) {
                        try {
                            olVar.b(false);
                        } catch (Exception e10) {
                            uj0.d("", e10);
                        }
                    }
                }
            }
            uj0.a("App is still foreground");
        }
    }
}
