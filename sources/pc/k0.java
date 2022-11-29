package pc;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k0 extends ViewDataBinding {
    public final m2 B;
    public final o2 C;
    public final AppCompatButton D;
    public final AppCompatButton E;
    public final AppCompatTextView F;

    public k0(Object obj, View view, int i10, m2 m2Var, o2 o2Var, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = m2Var;
        this.C = o2Var;
        this.D = appCompatButton;
        this.E = appCompatButton2;
        this.F = appCompatTextView;
    }

    public static k0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static k0 U(View view, Object obj) {
        return (k0) ViewDataBinding.j(obj, view, nc.f.dialog_fragment_confirm_contract_edit_identification);
    }
}
