package yg;

import ai.c44;
import ai.mk0;
import ai.q44;
import ai.s34;
import ai.tj0;
import ai.w34;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r0 extends w34<s34> {
    public final mk0<s34> I;
    public final tj0 J;

    public r0(String str, Map<String, String> map, mk0<s34> mk0Var) {
        super(0, str, new q0(mk0Var));
        this.I = mk0Var;
        tj0 tj0Var = new tj0(null);
        this.J = tj0Var;
        tj0Var.b(str, "GET", null, null);
    }

    @Override // ai.w34
    public final c44<s34> y(s34 s34Var) {
        return c44.a(s34Var, q44.a(s34Var));
    }

    @Override // ai.w34
    public final /* bridge */ /* synthetic */ void z(s34 s34Var) {
        s34 s34Var2 = s34Var;
        this.J.d(s34Var2.f9706c, s34Var2.f9704a);
        tj0 tj0Var = this.J;
        byte[] bArr = s34Var2.f9705b;
        if (tj0.j() && bArr != null) {
            tj0Var.f(bArr);
        }
        this.I.d(s34Var2);
    }
}
