package ai;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v5 implements lp3, gm2 {

    /* renamed from: w  reason: collision with root package name */
    public final x5 f10977w;

    /* renamed from: x  reason: collision with root package name */
    public kp3 f10978x;

    /* renamed from: y  reason: collision with root package name */
    public hl2 f10979y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ z5 f10980z;

    public v5(z5 z5Var, x5 x5Var) {
        kp3 kp3Var;
        hl2 hl2Var;
        this.f10980z = z5Var;
        kp3Var = z5Var.f12881e;
        this.f10978x = kp3Var;
        hl2Var = z5Var.f12882f;
        this.f10979y = hl2Var;
        this.f10977w = x5Var;
    }

    @Override // ai.lp3
    public final void a(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f10978x.e(so3Var, yo3Var);
        }
    }

    @Override // ai.lp3
    public final void b(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f10978x.i(so3Var, yo3Var);
        }
    }

    public final boolean c(int i10, bp3 bp3Var) {
        kp3 kp3Var;
        hl2 hl2Var;
        bp3 bp3Var2 = null;
        if (bp3Var != null) {
            x5 x5Var = this.f10977w;
            int i11 = 0;
            while (true) {
                if (i11 >= x5Var.f11868c.size()) {
                    break;
                } else if (x5Var.f11868c.get(i11).f9606d == bp3Var.f9606d) {
                    bp3Var2 = bp3Var.c(Pair.create(x5Var.f11867b, bp3Var.f9603a));
                    break;
                } else {
                    i11++;
                }
            }
            if (bp3Var2 == null) {
                return false;
            }
        }
        int i12 = i10 + this.f10977w.f11869d;
        kp3 kp3Var2 = this.f10978x;
        if (kp3Var2.f6306a != i12 || !sb.H(kp3Var2.f6307b, bp3Var2)) {
            kp3Var = this.f10980z.f12881e;
            this.f10978x = kp3Var.a(i12, bp3Var2, 0L);
        }
        hl2 hl2Var2 = this.f10979y;
        if (hl2Var2.f4895a == i12 && sb.H(hl2Var2.f4896b, bp3Var2)) {
            return true;
        }
        hl2Var = this.f10980z.f12882f;
        this.f10979y = hl2Var.a(i12, bp3Var2);
        return true;
    }

    @Override // ai.lp3
    public final void f(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f10978x.g(so3Var, yo3Var);
        }
    }

    @Override // ai.lp3
    public final void l(int i10, bp3 bp3Var, so3 so3Var, yo3 yo3Var, IOException iOException, boolean z10) {
        if (c(i10, bp3Var)) {
            this.f10978x.k(so3Var, yo3Var, iOException, z10);
        }
    }

    @Override // ai.lp3
    public final void v(int i10, bp3 bp3Var, yo3 yo3Var) {
        if (c(i10, bp3Var)) {
            this.f10978x.m(yo3Var);
        }
    }
}
