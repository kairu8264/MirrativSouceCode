package ap;

import ao.d;
import io.p;
import wn.l;
import wn.m;
import wn.v;

/* loaded from: classes4.dex */
public final class a {
    public static final void a(d<?> dVar, Throwable th2) {
        l.a aVar = l.f59224w;
        dVar.resumeWith(l.a(m.a(th2)));
        throw th2;
    }

    public static final void b(d<? super v> dVar, d<?> dVar2) {
        try {
            d b10 = bo.b.b(dVar);
            l.a aVar = l.f59224w;
            zo.l.c(b10, l.a(v.f59242a), null, 2, null);
        } catch (Throwable th2) {
            a(dVar2, th2);
        }
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, io.l<? super Throwable, v> lVar) {
        try {
            d b10 = bo.b.b(bo.b.a(pVar, r10, dVar));
            l.a aVar = l.f59224w;
            zo.l.b(b10, l.a(v.f59242a), lVar);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, io.l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
