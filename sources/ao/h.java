package ao;

import ao.g;
import io.p;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class h implements g, Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final h f16651w = new h();

    @Override // ao.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        jo.p.h(pVar, "operation");
        return r10;
    }

    @Override // ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        jo.p.h(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // ao.g
    public g minusKey(g.c<?> cVar) {
        jo.p.h(cVar, "key");
        return this;
    }

    @Override // ao.g
    public g plus(g gVar) {
        jo.p.h(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
