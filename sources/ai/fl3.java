package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class fl3 extends dl3<el3, el3> {
    @Override // ai.dl3
    public final boolean a(ik3 ik3Var) {
        return false;
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void b(el3 el3Var, int i10, long j10) {
        el3Var.h(i10 << 3, Long.valueOf(j10));
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void c(el3 el3Var, int i10, int i11) {
        el3Var.h((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void d(el3 el3Var, int i10, long j10) {
        el3Var.h((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void e(el3 el3Var, int i10, oh3 oh3Var) {
        el3Var.h((i10 << 3) | 2, oh3Var);
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void f(el3 el3Var, int i10, el3 el3Var2) {
        el3Var.h((i10 << 3) | 3, el3Var2);
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ el3 g() {
        return el3.b();
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ el3 h(el3 el3Var) {
        el3 el3Var2 = el3Var;
        el3Var2.d();
        return el3Var2;
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void i(Object obj, el3 el3Var) {
        ((ri3) obj).zzc = el3Var;
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ el3 j(Object obj) {
        return ((ri3) obj).zzc;
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ el3 k(Object obj) {
        ri3 ri3Var = (ri3) obj;
        el3 el3Var = ri3Var.zzc;
        if (el3Var == el3.a()) {
            el3 b10 = el3.b();
            ri3Var.zzc = b10;
            return b10;
        }
        return el3Var;
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void l(Object obj, el3 el3Var) {
        ((ri3) obj).zzc = el3Var;
    }

    @Override // ai.dl3
    public final void m(Object obj) {
        ((ri3) obj).zzc.d();
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ el3 o(el3 el3Var, el3 el3Var2) {
        el3 el3Var3 = el3Var2;
        return el3Var3.equals(el3.a()) ? el3Var : el3.c(el3Var, el3Var3);
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ int p(el3 el3Var) {
        return el3Var.e();
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ int q(el3 el3Var) {
        return el3Var.f();
    }

    @Override // ai.dl3
    public final /* bridge */ /* synthetic */ void r(el3 el3Var, zh3 zh3Var) throws IOException {
        el3Var.i(zh3Var);
    }
}
