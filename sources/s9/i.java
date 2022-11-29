package s9;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class i extends ViewDataBinding {
    public final FrameLayout B;
    public final AppCompatImageView C;
    public final FrameLayout D;
    public final View E;

    public i(Object obj, View view, int i10, FrameLayout frameLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, View view2) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = appCompatImageView;
        this.D = frameLayout2;
        this.E = view2;
    }
}
