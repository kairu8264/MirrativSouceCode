package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.BorderedTextView;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;

/* loaded from: classes2.dex */
public abstract class se extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final BorderedTextView E;
    public final AppCompatImageView F;
    public final Space G;
    public final AppCompatImageView H;
    public final GiftGachaItemInfoView I;
    public final Space J;

    public se(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, BorderedTextView borderedTextView, AppCompatImageView appCompatImageView2, Space space, AppCompatImageView appCompatImageView3, GiftGachaItemInfoView giftGachaItemInfoView, Space space2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = constraintLayout2;
        this.E = borderedTextView;
        this.F = appCompatImageView2;
        this.G = space;
        this.H = appCompatImageView3;
        this.I = giftGachaItemInfoView;
        this.J = space2;
    }
}
