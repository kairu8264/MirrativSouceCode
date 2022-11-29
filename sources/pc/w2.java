package pc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class w2 extends ViewDataBinding {
    public final View B;
    public final View C;
    public final ConstraintLayout D;
    public final AppCompatTextView E;
    public String F;

    public w2(Object obj, View view, int i10, View view2, View view3, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = constraintLayout;
        this.E = appCompatTextView;
    }

    public static w2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static w2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w2) ViewDataBinding.x(layoutInflater, nc.f.view_contract_edit_section, viewGroup, z10, obj);
    }

    public abstract void V(String str);
}
