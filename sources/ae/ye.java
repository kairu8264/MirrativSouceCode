package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;

/* loaded from: classes2.dex */
public abstract class ye extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final Space E;
    public final BorderedTextView F;
    public final AppCompatImageView G;
    public final GiftGachaItemInfoView H;
    public final AppCompatImageView I;
    public final AppCompatImageView J;

    public ye(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, Space space, BorderedTextView borderedTextView, AppCompatImageView appCompatImageView2, GiftGachaItemInfoView giftGachaItemInfoView, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = constraintLayout2;
        this.E = space;
        this.F = borderedTextView;
        this.G = appCompatImageView2;
        this.H = giftGachaItemInfoView;
        this.I = appCompatImageView3;
        this.J = appCompatImageView4;
    }
}
