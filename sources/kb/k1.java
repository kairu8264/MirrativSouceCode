package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.player.gifting.panel.GiftPanelView;

/* loaded from: classes2.dex */
public abstract class k1 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatImageView F;
    public final AppCompatImageView G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;
    public final GiftPanelView J;

    public k1(Object obj, View view, int i10, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView2, GiftPanelView giftPanelView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = appCompatImageView;
        this.E = appCompatTextView;
        this.F = appCompatImageView2;
        this.G = appCompatImageView3;
        this.H = appCompatImageView4;
        this.I = appCompatTextView2;
        this.J = giftPanelView;
    }
}
