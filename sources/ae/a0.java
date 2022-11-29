package ae;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public abstract class a0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final FrameLayout C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final RecyclerView G;
    public final ConstraintLayout H;
    public final AppCompatImageView I;
    public final RecyclerView J;
    public final AppCompatTextView K;
    public final RoundedButtonView L;
    public final ConstraintLayout M;
    public final StatusView N;
    public final ConstraintLayout O;
    public final View P;
    public final EditTextWithOnKeyPreImeListener Q;

    public a0(Object obj, View view, int i10, ConstraintLayout constraintLayout, FrameLayout frameLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2, RecyclerView recyclerView2, AppCompatTextView appCompatTextView3, RoundedButtonView roundedButtonView, ConstraintLayout constraintLayout3, StatusView statusView, ConstraintLayout constraintLayout4, View view2, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = frameLayout;
        this.D = appCompatImageView;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
        this.G = recyclerView;
        this.H = constraintLayout2;
        this.I = appCompatImageView2;
        this.J = recyclerView2;
        this.K = appCompatTextView3;
        this.L = roundedButtonView;
        this.M = constraintLayout3;
        this.N = statusView;
        this.O = constraintLayout4;
        this.P = view2;
        this.Q = editTextWithOnKeyPreImeListener;
    }
}
