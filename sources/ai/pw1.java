package ai;

/* loaded from: classes3.dex */
public final class pw1 implements tb1 {

    /* renamed from: y  reason: collision with root package name */
    public final String f8711y;

    /* renamed from: z  reason: collision with root package name */
    public final nq2 f8712z;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8709w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8710x = false;
    public final yg.r1 A = wg.t.h().p();

    public pw1(String str, nq2 nq2Var) {
        this.f8711y = str;
        this.f8712z = nq2Var;
    }

    public final mq2 a(String str) {
        String str2 = this.A.x() ? "" : this.f8711y;
        mq2 a10 = mq2.a(str);
        a10.c("tms", Long.toString(wg.t.k().elapsedRealtime(), 10));
        a10.c("tid", str2);
        return a10;
    }

    @Override // ai.tb1
    public final synchronized void c() {
        if (this.f8710x) {
            return;
        }
        this.f8712z.a(a("init_finished"));
        this.f8710x = true;
    }

    @Override // ai.tb1
    public final synchronized void d() {
        if (this.f8709w) {
            return;
        }
        this.f8712z.a(a("init_started"));
        this.f8709w = true;
    }

    @Override // ai.tb1
    public final void l0(String str, String str2) {
        nq2 nq2Var = this.f8712z;
        mq2 a10 = a("adapter_init_finished");
        a10.c("ancn", str);
        a10.c("rqe", str2);
        nq2Var.a(a10);
    }

    @Override // ai.tb1
    public final void t(String str) {
        nq2 nq2Var = this.f8712z;
        mq2 a10 = a("adapter_init_finished");
        a10.c("ancn", str);
        nq2Var.a(a10);
    }

    @Override // ai.tb1
    public final void v(String str) {
        nq2 nq2Var = this.f8712z;
        mq2 a10 = a("adapter_init_started");
        a10.c("ancn", str);
        nq2Var.a(a10);
    }
}
