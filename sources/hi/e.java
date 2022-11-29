package hi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class e implements Iterator<q> {

    /* renamed from: w  reason: collision with root package name */
    public int f35733w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ f f35734x;

    public e(f fVar) {
        this.f35734x = fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35733w < this.f35734x.p();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        if (this.f35733w < this.f35734x.p()) {
            f fVar = this.f35734x;
            int i10 = this.f35733w;
            this.f35733w = i10 + 1;
            return fVar.r(i10);
        }
        int i11 = this.f35733w;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
