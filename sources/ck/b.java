package ck;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f19669a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f19670b = new AtomicBoolean(false);

    public final synchronized boolean a(String str) {
        if (!this.f19670b.get()) {
            b();
        }
        Object obj = this.f19669a.get("assetOnlyUpdates");
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public final synchronized void b() {
        this.f19669a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
