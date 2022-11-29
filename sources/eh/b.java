package eh;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b extends LinkedHashMap<String, Pair<Long, String>> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ l f30562w;

    public b(l lVar) {
        this.f30562w = lVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        int i10;
        int size = size();
        i10 = this.f30562w.f30602a;
        return size > i10;
    }
}
