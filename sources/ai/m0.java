package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class m0 extends h74<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f6739b;

    /* renamed from: c  reason: collision with root package name */
    public Long f6740c;

    public m0(String str) {
        HashMap b10 = h74.b(str);
        if (b10 != null) {
            this.f6739b = (Long) b10.get(0);
            this.f6740c = (Long) b10.get(1);
        }
    }

    @Override // ai.h74
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f6739b);
        hashMap.put(1, this.f6740c);
        return hashMap;
    }
}
