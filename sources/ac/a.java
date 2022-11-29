package ac;

import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.streaming.result.BroadcastResultBadgeView;
import com.dena.mirrativ.streaming.result.BroadcastResultPictureView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public abstract class a extends ViewDataBinding {
    public final AppBarLayout B;
    public final BroadcastResultBadgeView C;
    public final BroadcastResultPictureView D;
    public final AppCompatTextView E;
    public final CollapsingToolbarLayout F;
    public final ConstraintLayout G;
    public final AppCompatTextView H;
    public final ProgressBar I;
    public final RecyclerView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final AppCompatImageView M;
    public final Toolbar N;
    public final ConstraintLayout O;

    public a(Object obj, View view, int i10, AppBarLayout appBarLayout, BroadcastResultBadgeView broadcastResultBadgeView, BroadcastResultPictureView broadcastResultPictureView, AppCompatTextView appCompatTextView, CollapsingToolbarLayout collapsingToolbarLayout, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, ProgressBar progressBar, RecyclerView recyclerView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView, Toolbar toolbar, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.B = appBarLayout;
        this.C = broadcastResultBadgeView;
        this.D = broadcastResultPictureView;
        this.E = appCompatTextView;
        this.F = collapsingToolbarLayout;
        this.G = constraintLayout;
        this.H = appCompatTextView2;
        this.I = progressBar;
        this.J = recyclerView;
        this.K = appCompatTextView3;
        this.L = appCompatTextView4;
        this.M = appCompatImageView;
        this.N = toolbar;
        this.O = constraintLayout2;
    }
}
