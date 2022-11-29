package ai;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class jk3 extends gh3 {

    /* renamed from: w  reason: collision with root package name */
    public final mk3 f5828w;

    /* renamed from: x  reason: collision with root package name */
    public ih3 f5829x = a();

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ nk3 f5830y;

    public jk3(nk3 nk3Var) {
        this.f5830y = nk3Var;
        this.f5828w = new mk3(nk3Var, null);
    }

    public final ih3 a() {
        if (this.f5828w.hasNext()) {
            return this.f5828w.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5829x != null;
    }

    @Override // ai.ih3
    public final byte zza() {
        ih3 ih3Var = this.f5829x;
        if (ih3Var != null) {
            byte zza = ih3Var.zza();
            if (!this.f5829x.hasNext()) {
                this.f5829x = a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
