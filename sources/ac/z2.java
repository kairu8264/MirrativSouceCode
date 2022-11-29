package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class z2 extends ViewDataBinding {
    public final View B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final Toolbar E;
    public final RecyclerView F;
    public final ProgressBar G;
    public final ConstraintLayout H;
    public final View I;

    public z2(Object obj, View view, int i10, View view2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, Toolbar toolbar, RecyclerView recyclerView, ProgressBar progressBar, ConstraintLayout constraintLayout, View view3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
        this.E = toolbar;
        this.F = recyclerView;
        this.G = progressBar;
        this.H = constraintLayout;
        this.I = view3;
    }

    public static z2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static z2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (z2) ViewDataBinding.x(layoutInflater, xb.p.fragment_emokara_songs_by_artist, viewGroup, z10, obj);
    }
}
