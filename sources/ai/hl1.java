package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class hl1 implements or, q20, xg.q, s20, xg.x {
    public xg.x A;

    /* renamed from: w  reason: collision with root package name */
    public or f4891w;

    /* renamed from: x  reason: collision with root package name */
    public q20 f4892x;

    /* renamed from: y  reason: collision with root package name */
    public xg.q f4893y;

    /* renamed from: z  reason: collision with root package name */
    public s20 f4894z;

    public /* synthetic */ hl1(kl1 kl1Var) {
    }

    @Override // ai.q20
    public final synchronized void B(String str, Bundle bundle) {
        q20 q20Var = this.f4892x;
        if (q20Var != null) {
            q20Var.B(str, bundle);
        }
    }

    @Override // xg.q
    public final synchronized void B4() {
        xg.q qVar = this.f4893y;
        if (qVar != null) {
            qVar.B4();
        }
    }

    @Override // xg.q
    public final synchronized void D5(int i10) {
        xg.q qVar = this.f4893y;
        if (qVar != null) {
            qVar.D5(i10);
        }
    }

    @Override // xg.q
    public final synchronized void c() {
        xg.q qVar = this.f4893y;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // xg.q
    public final synchronized void d() {
        xg.q qVar = this.f4893y;
        if (qVar != null) {
            qVar.d();
        }
    }

    @Override // xg.x
    public final synchronized void f() {
        xg.x xVar = this.A;
        if (xVar != null) {
            xVar.f();
        }
    }

    @Override // xg.q
    public final synchronized void f4() {
        xg.q qVar = this.f4893y;
        if (qVar != null) {
            qVar.f4();
        }
    }

    public final synchronized void h(or orVar, q20 q20Var, xg.q qVar, s20 s20Var, xg.x xVar) {
        this.f4891w = orVar;
        this.f4892x = q20Var;
        this.f4893y = qVar;
        this.f4894z = s20Var;
        this.A = xVar;
    }

    @Override // ai.or
    public final synchronized void onAdClicked() {
        or orVar = this.f4891w;
        if (orVar != null) {
            orVar.onAdClicked();
        }
    }

    @Override // xg.q
    public final synchronized void s0() {
        xg.q qVar = this.f4893y;
        if (qVar != null) {
            qVar.s0();
        }
    }

    @Override // ai.s20
    public final synchronized void w0(String str, String str2) {
        s20 s20Var = this.f4894z;
        if (s20Var != null) {
            s20Var.w0(str, str2);
        }
    }
}
