package hi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ka extends ra {
    public ka(int i10) {
        super(i10, null);
    }

    @Override // hi.ra
    public final void d() {
        if (!o()) {
            for (int i10 = 0; i10 < e(); i10++) {
                Map.Entry j10 = j(i10);
                if (((k8) j10.getKey()).b()) {
                    j10.setValue(Collections.unmodifiableList((List) j10.getValue()));
                }
            }
            for (Map.Entry entry : f()) {
                if (((k8) entry.getKey()).b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.d();
    }
}
