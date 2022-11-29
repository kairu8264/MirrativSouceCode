package ae;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.BalloonTextView;
import com.dena.mirrorman.customview.SpotlightView;

/* loaded from: classes2.dex */
public abstract class sm extends ViewDataBinding {
    public final View B;
    public final BalloonTextView C;
    public final ConstraintLayout D;
    public final SpotlightView E;

    public sm(Object obj, View view, int i10, View view2, BalloonTextView balloonTextView, ConstraintLayout constraintLayout, SpotlightView spotlightView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = balloonTextView;
        this.D = constraintLayout;
        this.E = spotlightView;
    }
}
