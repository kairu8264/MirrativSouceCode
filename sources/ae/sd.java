package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class sd extends ViewDataBinding {
    public final AppCompatTextView B;
    public final RoundedButtonView C;
    public final AppCompatImageView D;

    public sd(Object obj, View view, int i10, AppCompatTextView appCompatTextView, RoundedButtonView roundedButtonView, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = roundedButtonView;
        this.D = appCompatImageView;
    }
}
