package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class n2 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final ConstraintLayout D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;

    public n2(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = constraintLayout;
        this.E = appCompatTextView3;
        this.F = constraintLayout2;
    }

    public static n2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static n2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (n2) ViewDataBinding.x(layoutInflater, xb.p.floating_view_user_profile_menu, viewGroup, z10, obj);
    }
}
