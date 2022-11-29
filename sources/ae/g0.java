package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class g0 extends ViewDataBinding {
    public final View B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final View E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;

    public g0(Object obj, View view, int i10, View view2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, View view3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = constraintLayout;
        this.D = appCompatTextView;
        this.E = view3;
        this.F = appCompatTextView2;
        this.G = appCompatTextView3;
    }

    public static g0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g0) ViewDataBinding.x(layoutInflater, nd.b1.bottom_sheet_dialog_fragment_chat_message, viewGroup, z10, obj);
    }
}
