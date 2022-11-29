package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftGachaItemInfoView;

/* loaded from: classes2.dex */
public abstract class oe extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final Space G;
    public final AppCompatImageView H;
    public final GiftGachaItemInfoView I;

    public oe(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, Space space, AppCompatImageView appCompatImageView4, GiftGachaItemInfoView giftGachaItemInfoView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = constraintLayout2;
        this.E = appCompatImageView2;
        this.F = appCompatImageView3;
        this.G = space;
        this.H = appCompatImageView4;
        this.I = giftGachaItemInfoView;
    }
}
