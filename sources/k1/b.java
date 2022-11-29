package k1;

import io.l;
import jo.p;
import k1.a;
import r1.d;
import r1.e;
import r1.f;

/* loaded from: classes.dex */
public class b<T extends a> implements r1.b, d<b<T>> {

    /* renamed from: w  reason: collision with root package name */
    public final l<a, Boolean> f38364w;

    /* renamed from: x  reason: collision with root package name */
    public final l<a, Boolean> f38365x;

    /* renamed from: y  reason: collision with root package name */
    public final f<b<T>> f38366y;

    /* renamed from: z  reason: collision with root package name */
    public b<T> f38367z;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super a, Boolean> lVar, l<? super a, Boolean> lVar2, f<b<T>> fVar) {
        p.h(fVar, "key");
        this.f38364w = lVar;
        this.f38365x = lVar2;
        this.f38366y = fVar;
    }

    @Override // r1.d
    /* renamed from: a */
    public b<T> getValue() {
        return this;
    }

    public final boolean b(T t10) {
        l<a, Boolean> lVar = this.f38364w;
        if (lVar != null && lVar.invoke(t10).booleanValue()) {
            return true;
        }
        b<T> bVar = this.f38367z;
        if (bVar != null) {
            return bVar.b(t10);
        }
        return false;
    }

    public final boolean c(T t10) {
        p.h(t10, "event");
        return f(t10) || b(t10);
    }

    public final boolean f(T t10) {
        b<T> bVar = this.f38367z;
        if (bVar != null && bVar.f(t10)) {
            return true;
        }
        l<a, Boolean> lVar = this.f38365x;
        if (lVar != null) {
            return lVar.invoke(t10).booleanValue();
        }
        return false;
    }

    @Override // r1.d
    public f<b<T>> getKey() {
        return this.f38366y;
    }

    @Override // r1.b
    public void j0(e eVar) {
        p.h(eVar, "scope");
        this.f38367z = (b) eVar.a(getKey());
    }
}
