package mo;

import jo.p;
import qo.h;

/* loaded from: classes4.dex */
public abstract class b<V> implements c<Object, V> {

    /* renamed from: a  reason: collision with root package name */
    public V f41225a;

    public b(V v10) {
        this.f41225a = v10;
    }

    @Override // mo.c
    public void a(Object obj, h<?> hVar, V v10) {
        p.h(hVar, "property");
        V v11 = this.f41225a;
        if (d(hVar, v11, v10)) {
            this.f41225a = v10;
            c(hVar, v11, v10);
        }
    }

    @Override // mo.c
    public V b(Object obj, h<?> hVar) {
        p.h(hVar, "property");
        return this.f41225a;
    }

    public abstract void c(h<?> hVar, V v10, V v11);

    public boolean d(h<?> hVar, V v10, V v11) {
        p.h(hVar, "property");
        return true;
    }
}
