package yq;

import java.util.concurrent.TimeUnit;
import jo.p;
import to.g;
import to.h;
import to.i;
import wn.k;
import wn.v;

/* loaded from: classes4.dex */
public final class a {
    public static final double a(io.a<v> aVar) {
        p.h(aVar, "code");
        g a10 = h.a.f53895a.a();
        aVar.invoke();
        return to.a.toDouble-impl(a10.elapsedNow-UwyO8pc(), TimeUnit.MILLISECONDS);
    }

    public static final <T> k<T, Double> b(io.a<? extends T> aVar) {
        p.h(aVar, "code");
        i iVar = new i(aVar.invoke(), h.a.f53895a.a().elapsedNow-UwyO8pc(), null);
        return new k<>(iVar.b(), Double.valueOf(to.a.toDouble-impl(iVar.a(), TimeUnit.MILLISECONDS)));
    }
}
