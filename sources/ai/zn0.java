package ai;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zn0 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ fo0 G;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f13050w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f13051x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f13052y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f13053z;

    public zn0(fo0 fo0Var, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.G = fo0Var;
        this.f13050w = str;
        this.f13051x = str2;
        this.f13052y = j10;
        this.f13053z = j11;
        this.A = j12;
        this.B = j13;
        this.C = j14;
        this.D = z10;
        this.E = i10;
        this.F = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f13050w);
        hashMap.put("cachedSrc", this.f13051x);
        hashMap.put("bufferedDuration", Long.toString(this.f13052y));
        hashMap.put("totalDuration", Long.toString(this.f13053z));
        if (((Boolean) ft.c().c(ox.f8030l1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.A));
            hashMap.put("qoeCachedBytes", Long.toString(this.B));
            hashMap.put("totalBytes", Long.toString(this.C));
            hashMap.put("reportTime", Long.toString(wg.t.k().currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.D ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("playerCount", Integer.toString(this.E));
        hashMap.put("playerPreparedCount", Integer.toString(this.F));
        fo0.t(this.G, "onPrecacheEvent", hashMap);
    }
}
