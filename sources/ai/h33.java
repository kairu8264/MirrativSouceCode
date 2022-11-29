package ai;

/* loaded from: classes3.dex */
public final class h33 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ uz2 f4728w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i33 f4729x;

    public h33(i33 i33Var, uz2 uz2Var) {
        this.f4729x = i33Var;
        this.f4728w = uz2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i33.V(this.f4729x, this.f4728w);
    }
}
