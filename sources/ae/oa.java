package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MultipleStarView;

/* loaded from: classes2.dex */
public abstract class oa extends ViewDataBinding {
    public final AppCompatTextView B;
    public final MultipleStarView C;

    public oa(Object obj, View view, int i10, AppCompatTextView appCompatTextView, MultipleStarView multipleStarView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = multipleStarView;
    }
}
