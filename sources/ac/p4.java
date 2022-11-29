package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class p4 extends ViewDataBinding {
    public final ImageButton B;
    public final ImageButton C;
    public final AppCompatImageView D;
    public final RelativeLayout E;
    public final LinearLayout F;
    public final View G;
    public final AppCompatTextView H;
    public final Switch I;
    public final AppCompatTextView J;

    public p4(Object obj, View view, int i10, ImageButton imageButton, ImageButton imageButton2, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, LinearLayout linearLayout, View view2, AppCompatTextView appCompatTextView, Switch r11, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = imageButton;
        this.C = imageButton2;
        this.D = appCompatImageView;
        this.E = relativeLayout;
        this.F = linearLayout;
        this.G = view2;
        this.H = appCompatTextView;
        this.I = r11;
        this.J = appCompatTextView2;
    }

    public static p4 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static p4 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (p4) ViewDataBinding.x(layoutInflater, xb.p.view_collab_user_setting, viewGroup, z10, obj);
    }
}
