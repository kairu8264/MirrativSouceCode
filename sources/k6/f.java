package k6;

import android.view.View;
import jo.p;
import k6.k;

/* loaded from: classes.dex */
public final class f<T extends View> implements k<T> {

    /* renamed from: w  reason: collision with root package name */
    public final T f38441w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f38442x;

    public f(T t10, boolean z10) {
        this.f38441w = t10;
        this.f38442x = z10;
    }

    @Override // k6.k
    public T a() {
        return this.f38441w;
    }

    @Override // k6.i
    public Object b(ao.d<? super h> dVar) {
        return k.a.h(this, dVar);
    }

    @Override // k6.k
    public boolean c() {
        return this.f38442x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (p.c(a(), fVar.a()) && c() == fVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + Boolean.hashCode(c());
    }
}
