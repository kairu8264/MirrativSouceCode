package ai;

/* loaded from: classes3.dex */
public final class g33 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ s43 f4323w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f4324x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ i33 f4325y;

    public g33(i33 i33Var, s43 s43Var, int i10) {
        this.f4325y = i33Var;
        this.f4323w = s43Var;
        this.f4324x = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f4323w.isCancelled()) {
                this.f4325y.H = null;
                this.f4325y.cancel(false);
            } else {
                this.f4325y.Q(this.f4324x, this.f4323w);
            }
        } finally {
            i33.V(this.f4325y, null);
        }
    }
}
