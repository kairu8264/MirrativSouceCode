package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class c6 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final View F;
    public final EditText G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public ud.v4 L;

    public c6(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, View view2, EditText editText, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = constraintLayout;
        this.D = appCompatImageView;
        this.E = appCompatTextView2;
        this.F = view2;
        this.G = editText;
        this.H = appCompatTextView3;
        this.I = appCompatTextView4;
        this.J = appCompatTextView5;
        this.K = appCompatTextView6;
    }

    public static c6 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static c6 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c6) ViewDataBinding.x(layoutInflater, nd.b1.dialog_twitter_share, viewGroup, z10, obj);
    }

    public abstract void V(ud.v4 v4Var);
}
