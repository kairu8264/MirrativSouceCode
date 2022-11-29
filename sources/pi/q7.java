package pi;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class q7 implements Runnable {
    public final /* synthetic */ w7 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f48173w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ p7 f48174x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ p7 f48175y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f48176z;

    public q7(w7 w7Var, Bundle bundle, p7 p7Var, p7 p7Var2, long j10) {
        this.A = w7Var;
        this.f48173w = bundle;
        this.f48174x = p7Var;
        this.f48175y = p7Var2;
        this.f48176z = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7.w(this.A, this.f48173w, this.f48174x, this.f48175y, this.f48176z);
    }
}
