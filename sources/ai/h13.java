package ai;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class h13<K, V> extends by2<K, V> {
    public final transient yx2<? extends List<V>> B;

    public h13(Map<K, Collection<V>> map, yx2<? extends List<V>> yx2Var) {
        super(map);
        this.B = yx2Var;
    }

    @Override // ai.vy2
    public final Set<K> b() {
        return s();
    }

    @Override // ai.vy2
    public final Map<K, Collection<V>> e() {
        return u();
    }

    @Override // ai.sy2
    public final /* bridge */ /* synthetic */ Collection l() {
        return this.B.zza();
    }
}
