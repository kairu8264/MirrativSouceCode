package hi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d implements Iterator<q> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Iterator f35717w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Iterator f35718x;

    public d(f fVar, Iterator it, Iterator it2) {
        this.f35717w = it;
        this.f35718x = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f35717w.hasNext()) {
            return true;
        }
        return this.f35718x.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        if (this.f35717w.hasNext()) {
            return new u(((Integer) this.f35717w.next()).toString());
        }
        if (this.f35718x.hasNext()) {
            return new u((String) this.f35718x.next());
        }
        throw new NoSuchElementException();
    }
}
