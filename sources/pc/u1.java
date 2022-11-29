package pc;

import ae.e8;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class u1 extends ViewDataBinding {
    public final LinearLayout B;
    public final s2 C;
    public final AppCompatButton D;
    public final u2 E;
    public final NestedScrollView F;
    public final View G;
    public final y2 H;
    public final e8 I;

    public u1(Object obj, View view, int i10, LinearLayout linearLayout, s2 s2Var, AppCompatButton appCompatButton, u2 u2Var, NestedScrollView nestedScrollView, View view2, y2 y2Var, e8 e8Var) {
        super(obj, view, i10);
        this.B = linearLayout;
        this.C = s2Var;
        this.D = appCompatButton;
        this.E = u2Var;
        this.F = nestedScrollView;
        this.G = view2;
        this.H = y2Var;
        this.I = e8Var;
    }

    public static u1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static u1 U(View view, Object obj) {
        return (u1) ViewDataBinding.j(obj, view, nc.f.fragment_contract_edit_identification);
    }
}
