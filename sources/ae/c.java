package ae;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class c extends ViewDataBinding {
    public final FrameLayout B;
    public final RelativeLayout C;
    public final AppCompatImageView D;
    public final ImageButton E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final RelativeLayout H;
    public final e8 I;

    public c(Object obj, View view, int i10, FrameLayout frameLayout, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, ImageButton imageButton, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RelativeLayout relativeLayout2, e8 e8Var) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = relativeLayout;
        this.D = appCompatImageView;
        this.E = imageButton;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
        this.H = relativeLayout2;
        this.I = e8Var;
    }
}
