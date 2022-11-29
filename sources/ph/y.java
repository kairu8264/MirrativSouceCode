package ph;

/* loaded from: classes3.dex */
public final class y implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f47566w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b0 f47567x;

    public y(b0 b0Var, int i10) {
        this.f47567x = b0Var;
        this.f47566w = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47567x.h(this.f47566w);
    }
}
