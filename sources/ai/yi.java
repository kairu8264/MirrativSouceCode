package ai;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yi {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f12606a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f12607b;

    public final synchronized Map<String, String> a() {
        if (this.f12607b == null) {
            this.f12607b = Collections.unmodifiableMap(new HashMap(this.f12606a));
        }
        return this.f12607b;
    }
}
