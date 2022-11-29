package lk;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class h<F, T> extends k0<F> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final kk.g<F, ? extends T> f40307w;

    /* renamed from: x  reason: collision with root package name */
    public final k0<T> f40308x;

    public h(kk.g<F, ? extends T> gVar, k0<T> k0Var) {
        this.f40307w = (kk.g) kk.j.i(gVar);
        this.f40308x = (k0) kk.j.i(k0Var);
    }

    @Override // lk.k0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f40308x.compare(this.f40307w.apply(f10), this.f40307w.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f40307w.equals(hVar.f40307w) && this.f40308x.equals(hVar.f40308x);
        }
        return false;
    }

    public int hashCode() {
        return kk.i.b(this.f40307w, this.f40308x);
    }

    public String toString() {
        return this.f40308x + ".onResultOf(" + this.f40307w + ")";
    }
}
