package ai;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s03 extends z13 {
    public s03(Iterator it) {
        super(it);
    }

    @Override // ai.z13
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
