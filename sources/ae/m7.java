package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public abstract class m7 extends ViewDataBinding {
    public final AutoLinkTextView B;
    public final AppCompatImageView C;

    public m7(Object obj, View view, int i10, AutoLinkTextView autoLinkTextView, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = autoLinkTextView;
        this.C = appCompatImageView;
    }
}
