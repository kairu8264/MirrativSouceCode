package pc;

import ae.e8;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class s1 extends ViewDataBinding {
    public final LinearLayoutCompat B;
    public final s2 C;
    public final AppCompatButton D;
    public final q2 E;
    public final NestedScrollView F;
    public final e8 G;

    public s1(Object obj, View view, int i10, LinearLayoutCompat linearLayoutCompat, s2 s2Var, AppCompatButton appCompatButton, q2 q2Var, NestedScrollView nestedScrollView, e8 e8Var) {
        super(obj, view, i10);
        this.B = linearLayoutCompat;
        this.C = s2Var;
        this.D = appCompatButton;
        this.E = q2Var;
        this.F = nestedScrollView;
        this.G = e8Var;
    }

    public static s1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static s1 U(View view, Object obj) {
        return (s1) ViewDataBinding.j(obj, view, nc.f.fragment_contract_edit_bank_account);
    }
}
