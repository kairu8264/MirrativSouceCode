package ai;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class k03 extends b23 {

    /* renamed from: w  reason: collision with root package name */
    public boolean f6019w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f6020x;

    public k03(Object obj) {
        this.f6020x = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f6019w;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6019w) {
            throw new NoSuchElementException();
        }
        this.f6019w = true;
        return this.f6020x;
    }
}
