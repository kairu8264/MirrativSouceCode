package pi;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f47573w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f47574x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ d2 f47575y;

    public a(d2 d2Var, String str, long j10) {
        this.f47575y = d2Var;
        this.f47573w = str;
        this.f47574x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2.g(this.f47575y, this.f47573w, this.f47574x);
    }
}
