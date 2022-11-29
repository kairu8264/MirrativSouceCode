package uo;

import wn.l;

/* loaded from: classes4.dex */
public final class w2 extends j2 {
    public final ao.d<wn.v> A;

    /* JADX WARN: Multi-variable type inference failed */
    public w2(ao.d<? super wn.v> dVar) {
        this.A = dVar;
    }

    @Override // uo.f0
    public void Q(Throwable th2) {
        ao.d<wn.v> dVar = this.A;
        l.a aVar = wn.l.f59224w;
        dVar.resumeWith(wn.l.a(wn.v.f59242a));
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(Throwable th2) {
        Q(th2);
        return wn.v.f59242a;
    }
}
