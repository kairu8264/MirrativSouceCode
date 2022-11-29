package ai;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class or2 {
    public static or2 e(pr2 pr2Var, qr2 qr2Var) {
        if (mr2.b()) {
            return new sr2(pr2Var, qr2Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a();

    public abstract void b(View view);

    public abstract void c();

    public abstract void d(View view, ur2 ur2Var, String str);
}
