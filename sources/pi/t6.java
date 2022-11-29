package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class t6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48237w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48238x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f48239y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ i7 f48240z;

    public t6(i7 i7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f48240z = i7Var;
        this.f48237w = atomicReference;
        this.f48238x = str2;
        this.f48239y = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48240z.f48285a.L().U(this.f48237w, null, this.f48238x, this.f48239y);
    }
}
