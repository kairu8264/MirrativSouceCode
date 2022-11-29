package s9;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GiftGachaOpenResultView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public abstract class e0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final RoundedButtonView C;
    public final GiftGachaOpenResultView D;
    public final RoundedButtonView E;
    public final View F;

    public e0(Object obj, View view, int i10, ConstraintLayout constraintLayout, RoundedButtonView roundedButtonView, GiftGachaOpenResultView giftGachaOpenResultView, RoundedButtonView roundedButtonView2, View view2) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = roundedButtonView;
        this.D = giftGachaOpenResultView;
        this.E = roundedButtonView2;
        this.F = view2;
    }

    public static e0 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static e0 U(View view, Object obj) {
        return (e0) ViewDataBinding.j(obj, view, q9.h.dialog_fragment_emomo_run_gift_gacha_open_dialog);
    }
}
