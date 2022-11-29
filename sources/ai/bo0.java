package ai;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class bo0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f2422w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f2423x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f2424y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ fo0 f2425z;

    public bo0(fo0 fo0Var, String str, String str2, int i10) {
        this.f2425z = fo0Var;
        this.f2422w = str;
        this.f2423x = str2;
        this.f2424y = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f2422w);
        hashMap.put("cachedSrc", this.f2423x);
        hashMap.put("totalBytes", Integer.toString(this.f2424y));
        fo0.t(this.f2425z, "onPrecacheEvent", hashMap);
    }
}
