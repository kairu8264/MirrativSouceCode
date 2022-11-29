package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class v1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ListView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;

    public v1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ListView listView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = listView;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
    }

    public static v1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static v1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (v1) ViewDataBinding.x(layoutInflater, xb.p.floating_live_link_broadcasters, viewGroup, z10, obj);
    }
}
