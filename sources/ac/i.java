package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class i extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;
    public final ConstraintLayout G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final StatusView K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final RecyclerView N;
    public final View O;

    public i(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, StatusView statusView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, RecyclerView recyclerView, View view2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatImageView2;
        this.E = appCompatTextView2;
        this.F = constraintLayout;
        this.G = constraintLayout2;
        this.H = appCompatImageView3;
        this.I = appCompatTextView3;
        this.J = appCompatTextView4;
        this.K = statusView;
        this.L = appCompatTextView5;
        this.M = appCompatTextView6;
        this.N = recyclerView;
        this.O = view2;
    }

    public static i T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static i U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i) ViewDataBinding.x(layoutInflater, xb.p.bottom_sheet_dialog_fragment_collab_candidate_viewers, viewGroup, z10, obj);
    }
}
