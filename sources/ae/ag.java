package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftItemEventAttributesView;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public abstract class ag extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;
    public final AppCompatImageView D;
    public final GiftItemEventAttributesView E;
    public final Guideline F;
    public final Guideline G;
    public final Guideline H;
    public final Guideline I;
    public final MultipleStarView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final AppCompatImageView M;
    public final AppCompatTextView N;
    public ud.s1 O;

    public ag(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2, AppCompatImageView appCompatImageView2, GiftItemEventAttributesView giftItemEventAttributesView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, MultipleStarView multipleStarView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
        this.D = appCompatImageView2;
        this.E = giftItemEventAttributesView;
        this.F = guideline;
        this.G = guideline2;
        this.H = guideline3;
        this.I = guideline4;
        this.J = multipleStarView;
        this.K = appCompatTextView;
        this.L = appCompatTextView2;
        this.M = appCompatImageView3;
        this.N = appCompatTextView3;
    }

    public abstract void T(ud.s1 s1Var);
}
