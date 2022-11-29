package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MultipleUserView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public abstract class om extends ViewDataBinding {
    public final View B;
    public final MaterialCardView C;
    public final AppCompatTextView D;
    public final MultipleUserView E;

    public om(Object obj, View view, int i10, View view2, MaterialCardView materialCardView, AppCompatTextView appCompatTextView, MultipleUserView multipleUserView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = materialCardView;
        this.D = appCompatTextView;
        this.E = multipleUserView;
    }
}
