package pi;

/* loaded from: classes3.dex */
public final class c1 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f47685w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d2 f47686x;

    public c1(d2 d2Var, long j10) {
        this.f47686x = d2Var;
        this.f47685w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47686x.o(this.f47685w);
    }
}
