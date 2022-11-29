package ai;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bz2 extends AbstractSet<Map.Entry> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hz2 f2640w;

    public bz2(hz2 hz2Var) {
        this.f2640w = hz2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2640w.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int G;
        Map o10 = this.f2640w.o();
        if (o10 != null) {
            return o10.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            G = this.f2640w.G(entry.getKey());
            if (G != -1 && hx2.a(hz2.B(this.f2640w, G), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        hz2 hz2Var = this.f2640w;
        Map o10 = hz2Var.o();
        if (o10 != null) {
            return o10.entrySet().iterator();
        }
        return new zy2(hz2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int E;
        int[] d10;
        Object[] e10;
        Object[] f10;
        int i10;
        Map o10 = this.f2640w.o();
        if (o10 != null) {
            return o10.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f2640w.m()) {
                return false;
            }
            E = this.f2640w.E();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object w10 = hz2.w(this.f2640w);
            d10 = this.f2640w.d();
            e10 = this.f2640w.e();
            f10 = this.f2640w.f();
            int e11 = iz2.e(key, value, E, w10, d10, e10, f10);
            if (e11 == -1) {
                return false;
            }
            this.f2640w.t(e11, E);
            hz2 hz2Var = this.f2640w;
            i10 = hz2Var.B;
            hz2Var.B = i10 - 1;
            this.f2640w.q();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2640w.size();
    }
}
