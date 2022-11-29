package ae;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public abstract class p3 extends ViewDataBinding {
    public final MaterialCardView B;
    public final FrameLayout C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final RecyclerView F;
    public final AppCompatImageView G;
    public final ConstraintLayout H;
    public final AppCompatImageView I;
    public final AppCompatTextView J;
    public final ConstraintLayout K;
    public final AppCompatTextView L;
    public final ConstraintLayout M;
    public final EditText N;
    public final AppCompatTextView O;
    public final LinearLayout P;
    public final StatusView Q;
    public final AppCompatTextView R;
    public ud.h S;

    public p3(Object obj, View view, int i10, MaterialCardView materialCardView, FrameLayout frameLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout3, EditText editText, AppCompatTextView appCompatTextView5, LinearLayout linearLayout, StatusView statusView, AppCompatTextView appCompatTextView6) {
        super(obj, view, i10);
        this.B = materialCardView;
        this.C = frameLayout;
        this.D = appCompatTextView;
        this.E = appCompatTextView2;
        this.F = recyclerView;
        this.G = appCompatImageView;
        this.H = constraintLayout;
        this.I = appCompatImageView2;
        this.J = appCompatTextView3;
        this.K = constraintLayout2;
        this.L = appCompatTextView4;
        this.M = constraintLayout3;
        this.N = editText;
        this.O = appCompatTextView5;
        this.P = linearLayout;
        this.Q = statusView;
        this.R = appCompatTextView6;
    }

    public static p3 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static p3 U(View view, Object obj) {
        return (p3) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_live_app_setting);
    }

    public abstract void V(ud.h hVar);
}
