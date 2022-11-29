package ai;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class dy2 extends t03 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ fy2 f3453w;

    public dy2(fy2 fy2Var) {
        this.f3453w = fy2Var;
    }

    @Override // ai.t03, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f3453w.f4251y.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // ai.t03
    public final Map d() {
        return this.f3453w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new ey2(this.f3453w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            sy2.t(this.f3453w.f4252z, entry.getKey());
            return true;
        }
        return false;
    }
}
