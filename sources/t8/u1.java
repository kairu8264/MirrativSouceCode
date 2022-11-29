package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class u1 extends ViewDataBinding {
    public u1(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static u1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static u1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (u1) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_private_live_catalog_more_users, viewGroup, z10, obj);
    }
}
