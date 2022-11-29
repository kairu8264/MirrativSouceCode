package ai;

/* loaded from: classes3.dex */
public final class jk implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ oc f5815w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ok f5816x;

    public jk(ok okVar, oc ocVar) {
        this.f5816x = okVar;
        this.f5815w = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk pkVar;
        pkVar = this.f5816x.f7837b;
        pkVar.x(this.f5815w);
    }
}
