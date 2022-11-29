package ai;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class a13 extends e13 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f1677a;

    public a13(Comparator comparator) {
        this.f1677a = comparator;
    }

    @Override // ai.e13
    public final <K, V> Map<K, Collection<V>> a() {
        return new TreeMap(this.f1677a);
    }
}
