package b8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: w  reason: collision with root package name */
    public final Set<f8.j<?>> f17097w = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f17097w.clear();
    }

    public List<f8.j<?>> c() {
        return i8.k.j(this.f17097w);
    }

    public void h(f8.j<?> jVar) {
        this.f17097w.add(jVar);
    }

    public void i(f8.j<?> jVar) {
        this.f17097w.remove(jVar);
    }

    @Override // b8.m
    public void onDestroy() {
        for (f8.j jVar : i8.k.j(this.f17097w)) {
            jVar.onDestroy();
        }
    }

    @Override // b8.m
    public void onStart() {
        for (f8.j jVar : i8.k.j(this.f17097w)) {
            jVar.onStart();
        }
    }

    @Override // b8.m
    public void onStop() {
        for (f8.j jVar : i8.k.j(this.f17097w)) {
            jVar.onStop();
        }
    }
}
