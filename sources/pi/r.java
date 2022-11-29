package pi;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class r implements Iterator<String> {

    /* renamed from: w  reason: collision with root package name */
    public final Iterator<String> f48180w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ s f48181x;

    public r(s sVar) {
        Bundle bundle;
        this.f48181x = sVar;
        bundle = sVar.f48209w;
        this.f48180w = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return this.f48180w.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48180w.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
