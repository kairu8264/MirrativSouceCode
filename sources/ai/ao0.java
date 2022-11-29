package ai;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ao0 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ fo0 F;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f1956w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f1957x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f1958y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f1959z;

    public ao0(fo0 fo0Var, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.F = fo0Var;
        this.f1956w = str;
        this.f1957x = str2;
        this.f1958y = i10;
        this.f1959z = i11;
        this.A = j10;
        this.B = j11;
        this.C = z10;
        this.D = i12;
        this.E = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f1956w);
        hashMap.put("cachedSrc", this.f1957x);
        hashMap.put("bytesLoaded", Integer.toString(this.f1958y));
        hashMap.put("totalBytes", Integer.toString(this.f1959z));
        hashMap.put("bufferedDuration", Long.toString(this.A));
        hashMap.put("totalDuration", Long.toString(this.B));
        hashMap.put("cacheReady", true != this.C ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hashMap.put("playerCount", Integer.toString(this.D));
        hashMap.put("playerPreparedCount", Integer.toString(this.E));
        fo0.t(this.F, "onPrecacheEvent", hashMap);
    }
}
