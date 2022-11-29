package pc;

import ae.e8;
import android.view.View;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class q1 extends ViewDataBinding {
    public final y2 B;
    public final e8 C;

    public q1(Object obj, View view, int i10, y2 y2Var, e8 e8Var) {
        super(obj, view, i10);
        this.B = y2Var;
        this.C = e8Var;
    }

    public static q1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static q1 U(View view, Object obj) {
        return (q1) ViewDataBinding.j(obj, view, nc.f.fragment_contract_complete);
    }
}
