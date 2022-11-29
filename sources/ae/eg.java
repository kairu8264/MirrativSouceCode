package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;
import ud.x1;

/* loaded from: classes2.dex */
public abstract class eg extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final YellRankIconView F;
    public x1.e G;

    public eg(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, YellRankIconView yellRankIconView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
        this.F = yellRankIconView;
    }

    public abstract void T(x1.e eVar);
}
