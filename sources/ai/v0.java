package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class v0 extends h74<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f10897b;

    /* renamed from: c  reason: collision with root package name */
    public Long f10898c;

    /* renamed from: d  reason: collision with root package name */
    public Long f10899d;

    /* renamed from: e  reason: collision with root package name */
    public Long f10900e;

    public v0(String str) {
        HashMap b10 = h74.b(str);
        if (b10 != null) {
            this.f10897b = (Long) b10.get(0);
            this.f10898c = (Long) b10.get(1);
            this.f10899d = (Long) b10.get(2);
            this.f10900e = (Long) b10.get(3);
        }
    }

    @Override // ai.h74
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f10897b);
        hashMap.put(1, this.f10898c);
        hashMap.put(2, this.f10899d);
        hashMap.put(3, this.f10900e);
        return hashMap;
    }
}
