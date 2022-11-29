package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class co0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f2884w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f2885x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f2886y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ fo0 f2887z;

    public co0(fo0 fo0Var, String str, String str2, long j10) {
        this.f2887z = fo0Var;
        this.f2884w = str;
        this.f2885x = str2;
        this.f2886y = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f2884w);
        hashMap.put("cachedSrc", this.f2885x);
        hashMap.put("totalDuration", Long.toString(this.f2886y));
        fo0.t(this.f2887z, "onPrecacheEvent", hashMap);
    }
}
