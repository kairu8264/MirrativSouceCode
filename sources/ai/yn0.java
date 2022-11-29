package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class yn0 implements Runnable {
    public final /* synthetic */ fo0 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f12680w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f12681x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f12682y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f12683z;

    public yn0(fo0 fo0Var, String str, String str2, int i10, int i11, boolean z10) {
        this.A = fo0Var;
        this.f12680w = str;
        this.f12681x = str2;
        this.f12682y = i10;
        this.f12683z = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f12680w);
        hashMap.put("cachedSrc", this.f12681x);
        hashMap.put("bytesLoaded", Integer.toString(this.f12682y));
        hashMap.put("totalBytes", Integer.toString(this.f12683z));
        hashMap.put("cacheReady", "0");
        fo0.t(this.A, "onPrecacheEvent", hashMap);
    }
}
