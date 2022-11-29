package ai;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class h03<K, V> extends wy2<K, V> implements Serializable {
    public final transient int A;

    /* renamed from: z  reason: collision with root package name */
    public final transient d03<K, ? extends uz2<V>> f4675z;

    public h03(d03<K, ? extends uz2<V>> d03Var, int i10) {
        this.f4675z = d03Var;
        this.A = i10;
    }

    @Override // ai.y03
    @Deprecated
    public final boolean a(K k10, V v10) {
        throw null;
    }

    @Override // ai.vy2
    public final Set<K> b() {
        throw new AssertionError("unreachable");
    }

    @Override // ai.vy2
    public final /* bridge */ /* synthetic */ Collection c() {
        return new g03(this);
    }

    @Override // ai.vy2
    public final Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // ai.y03
    public final int f() {
        throw null;
    }

    @Override // ai.vy2
    public final boolean g(Object obj) {
        return obj != null && super.g(obj);
    }

    @Override // ai.y03
    @Deprecated
    public final void h() {
        throw null;
    }

    @Override // ai.vy2, ai.y03
    public final /* bridge */ /* synthetic */ Collection m() {
        throw null;
    }

    @Override // ai.vy2, ai.y03
    public final /* bridge */ /* synthetic */ Map r() {
        return this.f4675z;
    }
}
