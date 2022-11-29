package sa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class c extends ViewDataBinding {
    public final RoundedButtonView B;
    public final View C;
    public final FrameLayout D;
    public final RoundedButtonView E;
    public final View F;
    public final RoundedButtonView G;
    public final View H;

    public c(Object obj, View view, int i10, RoundedButtonView roundedButtonView, View view2, FrameLayout frameLayout, RoundedButtonView roundedButtonView2, View view3, RoundedButtonView roundedButtonView3, View view4) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = view2;
        this.D = frameLayout;
        this.E = roundedButtonView2;
        this.F = view3;
        this.G = roundedButtonView3;
        this.H = view4;
    }

    public static c T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static c U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c) ViewDataBinding.x(layoutInflater, qa.p.fragment_notice_campaign, viewGroup, z10, obj);
    }
}
