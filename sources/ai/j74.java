package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class j74 extends h74<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public String f5652b;

    /* renamed from: c  reason: collision with root package name */
    public long f5653c;

    /* renamed from: d  reason: collision with root package name */
    public String f5654d;

    /* renamed from: e  reason: collision with root package name */
    public String f5655e;

    /* renamed from: f  reason: collision with root package name */
    public String f5656f;

    public j74() {
        this.f5652b = "E";
        this.f5653c = -1L;
        this.f5654d = "E";
        this.f5655e = "E";
        this.f5656f = "E";
    }

    @Override // ai.h74
    public final HashMap<Integer, Object> a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f5652b);
        hashMap.put(4, this.f5656f);
        hashMap.put(3, this.f5655e);
        hashMap.put(2, this.f5654d);
        hashMap.put(1, Long.valueOf(this.f5653c));
        return hashMap;
    }

    public j74(String str) {
        this.f5652b = "E";
        this.f5653c = -1L;
        this.f5654d = "E";
        this.f5655e = "E";
        this.f5656f = "E";
        HashMap b10 = h74.b(str);
        if (b10 != null) {
            this.f5652b = b10.get(0) == null ? "E" : (String) b10.get(0);
            this.f5653c = b10.get(1) != null ? ((Long) b10.get(1)).longValue() : -1L;
            this.f5654d = b10.get(2) == null ? "E" : (String) b10.get(2);
            this.f5655e = b10.get(3) == null ? "E" : (String) b10.get(3);
            this.f5656f = b10.get(4) != null ? (String) b10.get(4) : "E";
        }
    }
}
