package hi;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class l7 extends o7 {

    /* renamed from: w  reason: collision with root package name */
    public int f35841w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int f35842x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ u7 f35843y;

    public l7(u7 u7Var) {
        this.f35843y = u7Var;
        this.f35842x = u7Var.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35841w < this.f35842x;
    }

    @Override // hi.q7
    public final byte zza() {
        int i10 = this.f35841w;
        if (i10 < this.f35842x) {
            this.f35841w = i10 + 1;
            return this.f35843y.f(i10);
        }
        throw new NoSuchElementException();
    }
}
