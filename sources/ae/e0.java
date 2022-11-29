package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class e0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final Switch G;
    public final AppCompatTextView H;
    public final Switch I;
    public final AppCompatTextView J;
    public final Guideline K;
    public ud.i L;

    public e0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Switch r92, AppCompatTextView appCompatTextView5, Switch r11, AppCompatTextView appCompatTextView6, Guideline guideline) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = constraintLayout;
        this.D = appCompatTextView2;
        this.E = appCompatTextView3;
        this.F = appCompatTextView4;
        this.G = r92;
        this.H = appCompatTextView5;
        this.I = r11;
        this.J = appCompatTextView6;
        this.K = guideline;
    }

    public static e0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static e0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e0) ViewDataBinding.x(layoutInflater, nd.b1.bottom_sheet_dialog_fragment_app_user_detail, viewGroup, z10, obj);
    }

    public abstract void V(ud.i iVar);
}
