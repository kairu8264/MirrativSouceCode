package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.ShooterVictoryCountView;

/* loaded from: classes2.dex */
public abstract class ii extends ViewDataBinding {
    public final Guideline B;
    public final Guideline C;
    public final Guideline D;
    public final Guideline E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final ConstraintLayout I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final ShooterVictoryCountView L;
    public final AppCompatImageView M;

    public ii(Object obj, View view, int i10, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ShooterVictoryCountView shooterVictoryCountView, AppCompatImageView appCompatImageView4) {
        super(obj, view, i10);
        this.B = guideline;
        this.C = guideline2;
        this.D = guideline3;
        this.E = guideline4;
        this.F = appCompatImageView;
        this.G = appCompatImageView2;
        this.H = appCompatImageView3;
        this.I = constraintLayout;
        this.J = appCompatTextView;
        this.K = appCompatTextView2;
        this.L = shooterVictoryCountView;
        this.M = appCompatImageView4;
    }
}
