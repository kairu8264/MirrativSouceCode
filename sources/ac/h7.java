package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.streaming.floating.setting.FloatingCopyPasteView;

/* loaded from: classes2.dex */
public abstract class h7 extends ViewDataBinding {
    public final RelativeLayout B;
    public final LinearLayout C;
    public final View D;
    public final FloatingCopyPasteView E;
    public final EditText F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;

    public h7(Object obj, View view, int i10, RelativeLayout relativeLayout, LinearLayout linearLayout, View view2, FloatingCopyPasteView floatingCopyPasteView, EditText editText, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = relativeLayout;
        this.C = linearLayout;
        this.D = view2;
        this.E = floatingCopyPasteView;
        this.F = editText;
        this.G = appCompatImageView;
        this.H = appCompatTextView;
        this.I = appCompatTextView2;
    }

    public static h7 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static h7 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (h7) ViewDataBinding.x(layoutInflater, xb.p.view_memo_broadcast, viewGroup, z10, obj);
    }
}
