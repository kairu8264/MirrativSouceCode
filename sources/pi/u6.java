package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class u6 implements Runnable {
    public final /* synthetic */ i7 A;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48264w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48265x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f48266y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f48267z;

    public u6(i7 i7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.A = i7Var;
        this.f48264w = atomicReference;
        this.f48265x = str2;
        this.f48266y = str3;
        this.f48267z = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.f48285a.L().W(this.f48264w, null, this.f48265x, this.f48266y, this.f48267z);
    }
}
