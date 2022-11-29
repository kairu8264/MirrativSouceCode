package pc;

import ae.e8;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class y1 extends ViewDataBinding {
    public final AppCompatButton B;
    public final y2 C;
    public final AppCompatButton D;
    public final e8 E;

    public y1(Object obj, View view, int i10, AppCompatButton appCompatButton, y2 y2Var, AppCompatButton appCompatButton2, e8 e8Var) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = y2Var;
        this.D = appCompatButton2;
        this.E = e8Var;
    }

    public static y1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static y1 U(View view, Object obj) {
        return (y1) ViewDataBinding.j(obj, view, nc.f.fragment_contract_submit_identification_document);
    }
}
