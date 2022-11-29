package xm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class h extends k implements Iterable<k> {

    /* renamed from: w  reason: collision with root package name */
    public final List<k> f60417w = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h) && ((h) obj).f60417w.equals(this.f60417w));
    }

    public int hashCode() {
        return this.f60417w.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<k> iterator() {
        return this.f60417w.iterator();
    }

    @Override // xm.k
    public String j() {
        if (this.f60417w.size() == 1) {
            return this.f60417w.get(0).j();
        }
        throw new IllegalStateException();
    }

    public void r(k kVar) {
        if (kVar == null) {
            kVar = l.f60418a;
        }
        this.f60417w.add(kVar);
    }
}
