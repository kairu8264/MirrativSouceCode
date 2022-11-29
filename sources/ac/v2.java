package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class v2 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final View C;
    public final AppCompatImageView D;
    public final Toolbar E;
    public final AppCompatImageView F;
    public final ProgressBar G;
    public final ConstraintLayout H;
    public final View I;
    public final View J;
    public final EditText K;
    public final RecyclerView L;
    public final RecyclerView M;

    public v2(Object obj, View view, int i10, AppCompatTextView appCompatTextView, View view2, AppCompatImageView appCompatImageView, Toolbar toolbar, AppCompatImageView appCompatImageView2, ProgressBar progressBar, ConstraintLayout constraintLayout, View view3, View view4, EditText editText, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = view2;
        this.D = appCompatImageView;
        this.E = toolbar;
        this.F = appCompatImageView2;
        this.G = progressBar;
        this.H = constraintLayout;
        this.I = view3;
        this.J = view4;
        this.K = editText;
        this.L = recyclerView;
        this.M = recyclerView2;
    }

    public static v2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static v2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (v2) ViewDataBinding.x(layoutInflater, xb.p.fragment_emokara_search, viewGroup, z10, obj);
    }
}
