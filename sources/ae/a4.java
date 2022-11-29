package ae;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class a4 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final LinearLayout C;
    public final RoundedButtonView D;
    public final RoundedButtonView E;
    public final RelativeLayout F;
    public final RelativeLayout G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;

    public a4(Object obj, View view, int i10, AppCompatTextView appCompatTextView, LinearLayout linearLayout, RoundedButtonView roundedButtonView, RoundedButtonView roundedButtonView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = linearLayout;
        this.D = roundedButtonView;
        this.E = roundedButtonView2;
        this.F = relativeLayout;
        this.G = relativeLayout2;
        this.H = appCompatTextView2;
        this.I = appCompatImageView;
    }
}
