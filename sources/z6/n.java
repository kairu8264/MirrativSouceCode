package z6;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    public final List<g7.a<V>> f62596a;

    public n(List<g7.a<V>> list) {
        this.f62596a = list;
    }

    @Override // z6.m
    public List<g7.a<V>> b() {
        return this.f62596a;
    }

    @Override // z6.m
    public boolean c() {
        return this.f62596a.isEmpty() || (this.f62596a.size() == 1 && this.f62596a.get(0).h());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f62596a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f62596a.toArray()));
        }
        return sb2.toString();
    }
}
