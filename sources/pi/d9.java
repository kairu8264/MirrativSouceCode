package pi;

/* loaded from: classes3.dex */
public final class d9 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f47770w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m9 f47771x;

    public d9(m9 m9Var, long j10) {
        this.f47771x = m9Var;
        this.f47770w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m9.p(this.f47771x, this.f47770w);
    }
}
