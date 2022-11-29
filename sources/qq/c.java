package qq;

import io.l;
import jo.h;
import jo.p;
import wn.v;

/* loaded from: classes4.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final l<T, v> f49671a;

    public c() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super T, v> lVar) {
        this.f49671a = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p.c(this.f49671a, ((c) obj).f49671a);
    }

    public int hashCode() {
        l<T, v> lVar = this.f49671a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.f49671a + ')';
    }

    public /* synthetic */ c(l lVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : lVar);
    }
}
