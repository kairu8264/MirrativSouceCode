package s9;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class a extends ViewDataBinding {
    public final FrameLayout B;
    public final ImageView C;
    public final AppCompatImageView D;
    public final Space E;
    public final FrameLayout F;
    public final View G;

    public a(Object obj, View view, int i10, FrameLayout frameLayout, ImageView imageView, AppCompatImageView appCompatImageView, Space space, FrameLayout frameLayout2, View view2) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = imageView;
        this.D = appCompatImageView;
        this.E = space;
        this.F = frameLayout2;
        this.G = view2;
    }
}
