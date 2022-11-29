package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class j0 extends h74<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Long f5565b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f5566c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f5567d;

    public j0(String str) {
        HashMap b10 = h74.b(str);
        if (b10 != null) {
            this.f5565b = (Long) b10.get(0);
            this.f5566c = (Boolean) b10.get(1);
            this.f5567d = (Boolean) b10.get(2);
        }
    }

    @Override // ai.h74
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f5565b);
        hashMap.put(1, this.f5566c);
        hashMap.put(2, this.f5567d);
        return hashMap;
    }
}
