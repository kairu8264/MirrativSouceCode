package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class mj extends ViewDataBinding {
    public final RoundedButtonView B;
    public final AppCompatTextView C;

    public mj(Object obj, View view, int i10, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = appCompatTextView;
    }
}
