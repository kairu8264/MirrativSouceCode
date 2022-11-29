package ai;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sk3 extends al3 {
    public sk3(int i10) {
        super(i10, null);
    }

    @Override // ai.al3
    public final void d() {
        if (!g()) {
            for (int i10 = 0; i10 < h(); i10++) {
                Map.Entry i11 = i(i10);
                if (((hi3) i11.getKey()).b()) {
                    i11.setValue(Collections.unmodifiableList((List) i11.getValue()));
                }
            }
            for (Map.Entry entry : j()) {
                if (((hi3) entry.getKey()).b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.d();
    }
}
