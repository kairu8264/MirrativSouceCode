package hn;

/* loaded from: classes4.dex */
public abstract class w0 extends Thread {

    /* renamed from: w  reason: collision with root package name */
    public final n0 f36276w;

    /* renamed from: x  reason: collision with root package name */
    public final l0 f36277x;

    public w0(String str, n0 n0Var, l0 l0Var) {
        super(str);
        this.f36276w = n0Var;
        this.f36277x = l0Var;
    }

    public void a() {
        s q10 = this.f36276w.q();
        if (q10 != null) {
            q10.A(this.f36277x, this);
        }
    }

    public abstract void b();

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        s q10 = this.f36276w.q();
        if (q10 != null) {
            q10.B(this.f36277x, this);
        }
        b();
        if (q10 != null) {
            q10.C(this.f36277x, this);
        }
    }
}
