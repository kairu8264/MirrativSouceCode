package pi;

/* loaded from: classes3.dex */
public final class b0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f47601w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f47602x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ d2 f47603y;

    public b0(d2 d2Var, String str, long j10) {
        this.f47603y = d2Var;
        this.f47601w = str;
        this.f47602x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2.h(this.f47603y, this.f47601w, this.f47602x);
    }
}
