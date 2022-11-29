package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftItemEventAttributesView;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public abstract class mf extends ViewDataBinding {
    public final AppCompatImageView B;
    public final GiftItemEventAttributesView C;
    public final Guideline D;
    public final Guideline E;
    public final Guideline F;
    public final Guideline G;
    public final AppCompatImageView H;
    public final ConstraintLayout I;
    public final MultipleStarView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final ConstraintLayout M;
    public final AppCompatTextView N;
    public ud.u0 O;

    public mf(Object obj, View view, int i10, AppCompatImageView appCompatImageView, GiftItemEventAttributesView giftItemEventAttributesView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, MultipleStarView multipleStarView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = giftItemEventAttributesView;
        this.D = guideline;
        this.E = guideline2;
        this.F = guideline3;
        this.G = guideline4;
        this.H = appCompatImageView2;
        this.I = constraintLayout;
        this.J = multipleStarView;
        this.K = appCompatTextView;
        this.L = appCompatTextView2;
        this.M = constraintLayout2;
        this.N = appCompatTextView3;
    }

    public abstract void T(ud.u0 u0Var);
}
