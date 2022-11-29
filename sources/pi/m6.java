package pi;

/* loaded from: classes3.dex */
public final class m6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f48042w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48043x;

    public m6(i7 i7Var, long j10) {
        this.f48043x = i7Var;
        this.f48042w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48043x.f48285a.E().f47831k.b(this.f48042w);
        this.f48043x.f48285a.r().o().b("Session timeout duration set", Long.valueOf(this.f48042w));
    }
}
