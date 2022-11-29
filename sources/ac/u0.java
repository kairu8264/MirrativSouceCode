package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class u0 extends ViewDataBinding {
    public final View B;
    public final AppCompatButton C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final View F;
    public final RecyclerView G;
    public final AppCompatImageView H;
    public final AppCompatImageView I;
    public final StatusView J;
    public final AppCompatImageView K;
    public final AppCompatImageView L;
    public final AppCompatTextView M;
    public final View N;

    public u0(Object obj, View view, int i10, View view2, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view3, RecyclerView recyclerView, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, StatusView statusView, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatTextView appCompatTextView, View view4) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatButton;
        this.D = appCompatImageView;
        this.E = appCompatImageView2;
        this.F = view3;
        this.G = recyclerView;
        this.H = appCompatImageView3;
        this.I = appCompatImageView4;
        this.J = statusView;
        this.K = appCompatImageView5;
        this.L = appCompatImageView6;
        this.M = appCompatTextView;
        this.N = view4;
    }
}
