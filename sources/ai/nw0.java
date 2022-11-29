package ai;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class nw0 implements e43<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ pw0 f7542a;

    public nw0(pw0 pw0Var) {
        this.f7542a = pw0Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(String str) {
        im2 im2Var;
        cr2 cr2Var;
        sl2 sl2Var;
        fl2 fl2Var;
        fl2 fl2Var2;
        Context context;
        String str2 = str;
        im2Var = this.f7542a.D;
        cr2Var = this.f7542a.C;
        sl2Var = this.f7542a.A;
        fl2Var = this.f7542a.B;
        fl2Var2 = this.f7542a.B;
        List<String> b10 = cr2Var.b(sl2Var, fl2Var, false, "", str2, fl2Var2.f4084c);
        wg.t.d();
        context = this.f7542a.f8705w;
        im2Var.b(b10, true == yg.d2.i(context) ? 2 : 1);
    }
}
