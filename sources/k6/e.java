package k6;

import jo.p;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: w  reason: collision with root package name */
    public final h f38440w;

    public e(h hVar) {
        this.f38440w = hVar;
    }

    @Override // k6.i
    public Object b(ao.d<? super h> dVar) {
        return this.f38440w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && p.c(this.f38440w, ((e) obj).f38440w);
    }

    public int hashCode() {
        return this.f38440w.hashCode();
    }
}
