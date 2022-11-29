package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class op3 implements qq3 {

    /* renamed from: a  reason: collision with root package name */
    public final qq3 f7879a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7880b;

    public op3(qq3 qq3Var, long j10) {
        this.f7879a = qq3Var;
        this.f7880b = j10;
    }

    @Override // ai.qq3
    public final int a(long j10) {
        return this.f7879a.a(j10 - this.f7880b);
    }

    @Override // ai.qq3
    public final void b() throws IOException {
        this.f7879a.b();
    }

    @Override // ai.qq3
    public final int c(w4 w4Var, a4 a4Var, int i10) {
        int c10 = this.f7879a.c(w4Var, a4Var, i10);
        if (c10 == -4) {
            a4Var.f1725e = Math.max(0L, a4Var.f1725e + this.f7880b);
            return -4;
        }
        return c10;
    }

    public final qq3 d() {
        return this.f7879a;
    }

    @Override // ai.qq3
    public final boolean zzb() {
        return this.f7879a.zzb();
    }
}
