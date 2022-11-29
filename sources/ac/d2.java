package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class d2 extends ViewDataBinding {
    public final LinearLayout B;
    public final View C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatButton F;
    public final AppCompatTextView G;
    public final RelativeLayout H;
    public final SeekBar I;

    public d2(Object obj, View view, int i10, LinearLayout linearLayout, View view2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView2, RelativeLayout relativeLayout, SeekBar seekBar) {
        super(obj, view, i10);
        this.B = linearLayout;
        this.C = view2;
        this.D = appCompatImageView;
        this.E = appCompatTextView;
        this.F = appCompatButton;
        this.G = appCompatTextView2;
        this.H = relativeLayout;
        this.I = seekBar;
    }

    public static d2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static d2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (d2) ViewDataBinding.x(layoutInflater, xb.p.floating_setting_tts, viewGroup, z10, obj);
    }
}
