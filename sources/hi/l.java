package hi;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class l implements Iterator<q> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Iterator f35840w;

    public l(Iterator it) {
        this.f35840w = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35840w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        return new u((String) this.f35840w.next());
    }
}
