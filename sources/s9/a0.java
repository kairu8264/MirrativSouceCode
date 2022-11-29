package s9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public abstract class a0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;
    public final LinearLayout D;
    public final RoundedButtonView E;
    public final AppCompatTextView F;

    public a0(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, LinearLayout linearLayout, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
        this.D = linearLayout;
        this.E = roundedButtonView;
        this.F = appCompatTextView2;
    }

    public static a0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static a0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a0) ViewDataBinding.x(layoutInflater, q9.h.dialog_fragment_emomo_dress_up_complete, viewGroup, z10, obj);
    }
}
