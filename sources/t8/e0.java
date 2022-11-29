package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class e0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;

    public e0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
    }

    public static e0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static e0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e0) ViewDataBinding.x(layoutInflater, r8.f1.tab_item_group_shot_gallery, viewGroup, z10, obj);
    }
}
