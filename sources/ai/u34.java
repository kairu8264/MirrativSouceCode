package ai;

/* loaded from: classes3.dex */
public final class u34 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f10602w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f10603x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ w34 f10604y;

    public u34(w34 w34Var, String str, long j10) {
        this.f10604y = w34Var;
        this.f10602w = str;
        this.f10603x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e44 e44Var;
        e44 e44Var2;
        e44Var = this.f10604y.f11480w;
        e44Var.a(this.f10602w, this.f10603x);
        e44Var2 = this.f10604y.f11480w;
        e44Var2.b(this.f10604y.toString());
    }
}
