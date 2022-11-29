package androidx.work;

import androidx.work.b;
import java.util.HashMap;
import java.util.List;
import k5.h;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // k5.h
    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        for (b bVar : list) {
            hashMap.putAll(bVar.h());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
