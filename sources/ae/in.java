package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.BorderedTextView;

/* loaded from: classes2.dex */
public abstract class in extends ViewDataBinding {
    public final AppCompatImageView B;
    public final BorderedTextView C;

    public in(Object obj, View view, int i10, AppCompatImageView appCompatImageView, BorderedTextView borderedTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = borderedTextView;
    }
}
