package ai;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class eh3 extends gh3 {

    /* renamed from: w  reason: collision with root package name */
    public int f3672w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int f3673x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ oh3 f3674y;

    public eh3(oh3 oh3Var) {
        this.f3674y = oh3Var;
        this.f3673x = oh3Var.p();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3672w < this.f3673x;
    }

    @Override // ai.ih3
    public final byte zza() {
        int i10 = this.f3672w;
        if (i10 < this.f3673x) {
            this.f3672w = i10 + 1;
            return this.f3674y.m(i10);
        }
        throw new NoSuchElementException();
    }
}
