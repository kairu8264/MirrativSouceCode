package ae;

import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class mc extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final RoundedButtonView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final RoundedButtonView G;
    public final AppCompatTextView H;
    public final SeekBar I;
    public ud.s J;

    public mc(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RoundedButtonView roundedButtonView, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, RoundedButtonView roundedButtonView2, AppCompatTextView appCompatTextView, SeekBar seekBar) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = roundedButtonView;
        this.E = appCompatImageView3;
        this.F = appCompatImageView4;
        this.G = roundedButtonView2;
        this.H = appCompatTextView;
        this.I = seekBar;
    }

    public abstract void T(ud.s sVar);
}
