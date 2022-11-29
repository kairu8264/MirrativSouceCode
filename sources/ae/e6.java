package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class e6 extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final View E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final Space K;
    public final ConstraintLayout L;
    public final EditText M;
    public final AppCompatImageView N;
    public final AppCompatTextView O;
    public final StatusView P;
    public final AppCompatButton Q;
    public final ConstraintLayout R;
    public ud.n S;

    public e6(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Space space, ConstraintLayout constraintLayout2, EditText editText, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView5, StatusView statusView, AppCompatButton appCompatButton, ConstraintLayout constraintLayout3) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
        this.E = view2;
        this.F = constraintLayout;
        this.G = appCompatImageView2;
        this.H = appCompatTextView2;
        this.I = appCompatTextView3;
        this.J = appCompatTextView4;
        this.K = space;
        this.L = constraintLayout2;
        this.M = editText;
        this.N = appCompatImageView3;
        this.O = appCompatTextView5;
        this.P = statusView;
        this.Q = appCompatButton;
        this.R = constraintLayout3;
    }

    public static e6 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static e6 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e6) ViewDataBinding.x(layoutInflater, nd.b1.fragment_choose_my_apps, viewGroup, z10, obj);
    }

    public abstract void V(ud.n nVar);
}
