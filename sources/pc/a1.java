package pc;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a1 extends ViewDataBinding {
    public final AppCompatButton B;
    public final AppCompatButton C;
    public final ConstraintLayout D;
    public final CardView E;
    public final LinearLayout F;
    public final AppCompatImageView G;
    public final AppCompatButton H;

    public a1(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, ConstraintLayout constraintLayout, CardView cardView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatButton appCompatButton3) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = appCompatButton2;
        this.D = constraintLayout;
        this.E = cardView;
        this.F = linearLayout;
        this.G = appCompatImageView;
        this.H = appCompatButton3;
    }

    public static a1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static a1 U(View view, Object obj) {
        return (a1) ViewDataBinding.j(obj, view, nc.f.dialog_fragment_new_terms_of_service);
    }
}
