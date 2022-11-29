package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class p2 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final RelativeLayout D;
    public final ListView E;
    public final AppCompatTextView F;

    public p2(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout, ListView listView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = relativeLayout;
        this.E = listView;
        this.F = appCompatTextView;
    }

    public static p2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static p2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (p2) ViewDataBinding.x(layoutInflater, xb.p.floating_viewer_list, viewGroup, z10, obj);
    }
}
