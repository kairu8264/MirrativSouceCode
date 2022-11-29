package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.streaming.floating.control.FloatingControlEditView;
import com.dena.mirrativ.streaming.floating.setting.FloatingSettingRecyclerView;

/* loaded from: classes2.dex */
public abstract class s1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;
    public final ImageButton D;
    public final LinearLayout E;
    public final AppCompatImageView F;
    public final ScrollView G;
    public final FloatingControlEditView H;
    public final FloatingSettingRecyclerView I;
    public final LinearLayout J;
    public final LinearLayout K;
    public final AppCompatTextView L;
    public final LinearLayout M;
    public final RelativeLayout N;
    public final RelativeLayout O;
    public final AppCompatImageView P;
    public final AppCompatTextView Q;
    public final AppCompatTextView R;

    public s1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2, ImageButton imageButton, LinearLayout linearLayout, AppCompatImageView appCompatImageView2, ScrollView scrollView, FloatingControlEditView floatingControlEditView, FloatingSettingRecyclerView floatingSettingRecyclerView, LinearLayout linearLayout2, LinearLayout linearLayout3, AppCompatTextView appCompatTextView, LinearLayout linearLayout4, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
        this.D = imageButton;
        this.E = linearLayout;
        this.F = appCompatImageView2;
        this.G = scrollView;
        this.H = floatingControlEditView;
        this.I = floatingSettingRecyclerView;
        this.J = linearLayout2;
        this.K = linearLayout3;
        this.L = appCompatTextView;
        this.M = linearLayout4;
        this.N = relativeLayout;
        this.O = relativeLayout2;
        this.P = appCompatImageView3;
        this.Q = appCompatTextView2;
        this.R = appCompatTextView3;
    }

    public static s1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static s1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (s1) ViewDataBinding.x(layoutInflater, xb.p.floating_controller, viewGroup, z10, obj);
    }
}
