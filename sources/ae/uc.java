package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;

/* loaded from: classes2.dex */
public abstract class uc extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final YellRankIconView H;

    public uc(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, YellRankIconView yellRankIconView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = appCompatTextView;
        this.E = appCompatImageView2;
        this.F = appCompatImageView3;
        this.G = appCompatTextView2;
        this.H = yellRankIconView;
    }
}
