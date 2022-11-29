package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class k30 implements r30<Object> {
    @Override // ai.r30
    public final void a(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        uj0.e(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
