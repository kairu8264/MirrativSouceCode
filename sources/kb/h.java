package kb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class h extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final FrameLayout D;
    public final Space E;
    public final AppCompatTextView F;

    public h(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, Space space, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = frameLayout;
        this.E = space;
        this.F = appCompatTextView;
    }
}
