package ai;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class qn3 implements qq3 {

    /* renamed from: a  reason: collision with root package name */
    public final qq3 f9016a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9017b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ho3 f9018c;

    public qn3(ho3 ho3Var, qq3 qq3Var) {
        this.f9018c = ho3Var;
        this.f9016a = qq3Var;
    }

    @Override // ai.qq3
    public final int a(long j10) {
        if (this.f9018c.n()) {
            return -3;
        }
        return this.f9016a.a(j10);
    }

    @Override // ai.qq3
    public final void b() throws IOException {
        this.f9016a.b();
    }

    @Override // ai.qq3
    public final int c(w4 w4Var, a4 a4Var, int i10) {
        if (this.f9018c.n()) {
            return -3;
        }
        if (this.f9017b) {
            a4Var.f(4);
            return -4;
        }
        int c10 = this.f9016a.c(w4Var, a4Var, i10);
        if (c10 == -5) {
            v4 v4Var = w4Var.f11484a;
            Objects.requireNonNull(v4Var);
            int i11 = v4Var.B;
            if (i11 == 0) {
                if (v4Var.C != 0) {
                    i11 = 0;
                }
                return -5;
            }
            int i12 = this.f9018c.A == Long.MIN_VALUE ? v4Var.C : 0;
            t4 a10 = v4Var.a();
            a10.E(i11);
            a10.F(i12);
            w4Var.f11484a = a10.I();
            return -5;
        }
        ho3 ho3Var = this.f9018c;
        long j10 = ho3Var.A;
        if (j10 == Long.MIN_VALUE || ((c10 != -4 || a4Var.f1725e < j10) && !(c10 == -3 && ho3Var.e() == Long.MIN_VALUE && !a4Var.f1724d))) {
            return c10;
        }
        a4Var.a();
        a4Var.f(4);
        this.f9017b = true;
        return -4;
    }

    public final void d() {
        this.f9017b = false;
    }

    @Override // ai.qq3
    public final boolean zzb() {
        return !this.f9018c.n() && this.f9016a.zzb();
    }
}
