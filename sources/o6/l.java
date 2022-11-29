package o6;

import ep.d0;
import java.io.IOException;
import wn.l;

/* loaded from: classes.dex */
public final class l implements ep.f, io.l<Throwable, wn.v> {

    /* renamed from: w  reason: collision with root package name */
    public final ep.e f44100w;

    /* renamed from: x  reason: collision with root package name */
    public final uo.p<d0> f44101x;

    /* JADX WARN: Multi-variable type inference failed */
    public l(ep.e eVar, uo.p<? super d0> pVar) {
        this.f44100w = eVar;
        this.f44101x = pVar;
    }

    public void a(Throwable th2) {
        try {
            this.f44100w.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // ep.f
    public void c(ep.e eVar, IOException iOException) {
        if (eVar.p()) {
            return;
        }
        uo.p<d0> pVar = this.f44101x;
        l.a aVar = wn.l.f59224w;
        pVar.resumeWith(wn.l.a(wn.m.a(iOException)));
    }

    @Override // ep.f
    public void e(ep.e eVar, d0 d0Var) {
        uo.p<d0> pVar = this.f44101x;
        l.a aVar = wn.l.f59224w;
        pVar.resumeWith(wn.l.a(d0Var));
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        a(th2);
        return wn.v.f59242a;
    }
}
