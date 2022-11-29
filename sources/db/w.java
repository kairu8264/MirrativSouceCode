package db;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class w extends ViewDataBinding {
    public final RoundedButtonView B;
    public final RoundedButtonView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final Barrier F;
    public final RecyclerView G;
    public final RecyclerView H;
    public final AppCompatTextView I;
    public final RoundedButtonView J;
    public final View K;
    public final ConstraintLayout L;
    public final RecyclerView M;
    public final AppCompatTextView N;
    public final RoundedButtonView O;
    public final RoundedButtonView P;
    public final WebView Q;
    public ya.m R;

    public w(Object obj, View view, int i10, RoundedButtonView roundedButtonView, RoundedButtonView roundedButtonView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Barrier barrier, RecyclerView recyclerView, RecyclerView recyclerView2, AppCompatTextView appCompatTextView2, RoundedButtonView roundedButtonView3, View view2, ConstraintLayout constraintLayout, RecyclerView recyclerView3, AppCompatTextView appCompatTextView3, RoundedButtonView roundedButtonView4, RoundedButtonView roundedButtonView5, WebView webView) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = roundedButtonView2;
        this.D = appCompatImageView;
        this.E = appCompatTextView;
        this.F = barrier;
        this.G = recyclerView;
        this.H = recyclerView2;
        this.I = appCompatTextView2;
        this.J = roundedButtonView3;
        this.K = view2;
        this.L = constraintLayout;
        this.M = recyclerView3;
        this.N = appCompatTextView3;
        this.O = roundedButtonView4;
        this.P = roundedButtonView5;
        this.Q = webView;
    }

    public abstract void T(ya.m mVar);
}
