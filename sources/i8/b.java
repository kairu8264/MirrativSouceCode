package i8;

/* loaded from: classes.dex */
public final class b<K, V> extends s.a<K, V> {
    public int G;

    @Override // s.g, java.util.Map
    public void clear() {
        this.G = 0;
        super.clear();
    }

    @Override // s.g, java.util.Map
    public int hashCode() {
        if (this.G == 0) {
            this.G = super.hashCode();
        }
        return this.G;
    }

    @Override // s.g
    public void o(s.g<? extends K, ? extends V> gVar) {
        this.G = 0;
        super.o(gVar);
    }

    @Override // s.g
    public V p(int i10) {
        this.G = 0;
        return (V) super.p(i10);
    }

    @Override // s.g, java.util.Map
    public V put(K k10, V v10) {
        this.G = 0;
        return (V) super.put(k10, v10);
    }

    @Override // s.g
    public V q(int i10, V v10) {
        this.G = 0;
        return (V) super.q(i10, v10);
    }
}
