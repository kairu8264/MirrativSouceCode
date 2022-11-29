package pi;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class n6 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D;
    public final /* synthetic */ i7 E;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f48070w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48071x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f48072y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Bundle f48073z;

    public n6(i7 i7Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.E = i7Var;
        this.f48070w = str;
        this.f48071x = str2;
        this.f48072y = j10;
        this.f48073z = bundle;
        this.A = z10;
        this.B = z11;
        this.C = z12;
        this.D = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.v(this.f48070w, this.f48071x, this.f48072y, this.f48073z, this.A, this.B, this.C, this.D);
    }
}
