package pi;

/* loaded from: classes3.dex */
public final class e9 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f47790w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m9 f47791x;

    public e9(m9 m9Var, long j10) {
        this.f47791x = m9Var;
        this.f47790w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m9.o(this.f47791x, this.f47790w);
    }
}
