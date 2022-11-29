package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;
import ud.d2;

/* loaded from: classes2.dex */
public abstract class a1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final YellRankIconView G;
    public d2 H;

    public a1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, YellRankIconView yellRankIconView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatImageView2;
        this.E = appCompatImageView3;
        this.F = appCompatTextView2;
        this.G = yellRankIconView;
    }

    public abstract void T(d2 d2Var);
}
