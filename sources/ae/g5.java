package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StrokeDecorationTextView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public abstract class g5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final Barrier C;
    public final Space D;
    public final StrokeDecorationTextView E;
    public final AppCompatImageView F;
    public final RoundedButtonView G;
    public final AppCompatTextView H;
    public final StrokeDecorationTextView I;
    public final RecyclerView J;
    public final StrokeDecorationTextView K;
    public final RoundedButtonView L;
    public final EditTextWithOnKeyPreImeListener M;
    public final ConstraintLayout N;
    public final Space O;
    public final StrokeDecorationTextView P;
    public final Group Q;
    public final Group R;

    public g5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, Barrier barrier, Space space, StrokeDecorationTextView strokeDecorationTextView, AppCompatImageView appCompatImageView2, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView, StrokeDecorationTextView strokeDecorationTextView2, RecyclerView recyclerView, StrokeDecorationTextView strokeDecorationTextView3, RoundedButtonView roundedButtonView2, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, ConstraintLayout constraintLayout, Space space2, StrokeDecorationTextView strokeDecorationTextView4, Group group, Group group2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = barrier;
        this.D = space;
        this.E = strokeDecorationTextView;
        this.F = appCompatImageView2;
        this.G = roundedButtonView;
        this.H = appCompatTextView;
        this.I = strokeDecorationTextView2;
        this.J = recyclerView;
        this.K = strokeDecorationTextView3;
        this.L = roundedButtonView2;
        this.M = editTextWithOnKeyPreImeListener;
        this.N = constraintLayout;
        this.O = space2;
        this.P = strokeDecorationTextView4;
        this.Q = group;
        this.R = group2;
    }

    public static g5 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static g5 U(View view, Object obj) {
        return (g5) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_unique_emomo_stamp_gift_creation);
    }
}
