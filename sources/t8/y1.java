package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class y1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;

    public y1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
    }

    public static y1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static y1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (y1) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_special_mission_app, viewGroup, z10, obj);
    }
}
