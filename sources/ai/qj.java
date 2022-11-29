package ai;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qj {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f8968a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f8969b;

    public final synchronized Map<String, String> a() {
        if (this.f8969b == null) {
            this.f8969b = Collections.unmodifiableMap(new HashMap(this.f8968a));
        }
        return this.f8969b;
    }
}
