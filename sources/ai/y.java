package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class y extends h74<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public long f12376b;

    /* renamed from: c  reason: collision with root package name */
    public long f12377c;

    public y(String str) {
        this.f12376b = -1L;
        this.f12377c = -1L;
        HashMap b10 = h74.b(str);
        if (b10 != null) {
            this.f12376b = ((Long) b10.get(0)).longValue();
            this.f12377c = ((Long) b10.get(1)).longValue();
        }
    }

    @Override // ai.h74
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f12376b));
        hashMap.put(1, Long.valueOf(this.f12377c));
        return hashMap;
    }
}
