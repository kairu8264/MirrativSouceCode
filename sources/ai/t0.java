package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class t0 extends h74<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f10043b;

    /* renamed from: c  reason: collision with root package name */
    public Long f10044c;

    /* renamed from: d  reason: collision with root package name */
    public Long f10045d;

    /* renamed from: e  reason: collision with root package name */
    public Long f10046e;

    /* renamed from: f  reason: collision with root package name */
    public Long f10047f;

    /* renamed from: g  reason: collision with root package name */
    public Long f10048g;

    /* renamed from: h  reason: collision with root package name */
    public Long f10049h;

    /* renamed from: i  reason: collision with root package name */
    public Long f10050i;

    /* renamed from: j  reason: collision with root package name */
    public Long f10051j;

    /* renamed from: k  reason: collision with root package name */
    public Long f10052k;

    /* renamed from: l  reason: collision with root package name */
    public Long f10053l;

    public t0(String str) {
        HashMap b10 = h74.b(str);
        if (b10 != null) {
            this.f10043b = (Long) b10.get(0);
            this.f10044c = (Long) b10.get(1);
            this.f10045d = (Long) b10.get(2);
            this.f10046e = (Long) b10.get(3);
            this.f10047f = (Long) b10.get(4);
            this.f10048g = (Long) b10.get(5);
            this.f10049h = (Long) b10.get(6);
            this.f10050i = (Long) b10.get(7);
            this.f10051j = (Long) b10.get(8);
            this.f10052k = (Long) b10.get(9);
            this.f10053l = (Long) b10.get(10);
        }
    }

    @Override // ai.h74
    public final HashMap<Integer, Long> a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f10043b);
        hashMap.put(1, this.f10044c);
        hashMap.put(2, this.f10045d);
        hashMap.put(3, this.f10046e);
        hashMap.put(4, this.f10047f);
        hashMap.put(5, this.f10048g);
        hashMap.put(6, this.f10049h);
        hashMap.put(7, this.f10050i);
        hashMap.put(8, this.f10051j);
        hashMap.put(9, this.f10052k);
        hashMap.put(10, this.f10053l);
        return hashMap;
    }
}
