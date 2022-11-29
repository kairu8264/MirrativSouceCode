package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class c0 extends ViewDataBinding {
    public final StatusView B;
    public final ListView C;

    public c0(Object obj, View view, int i10, StatusView statusView, ListView listView) {
        super(obj, view, i10);
        this.B = statusView;
        this.C = listView;
    }

    public static c0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static c0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c0) ViewDataBinding.x(layoutInflater, r8.f1.fragment_search_user, viewGroup, z10, obj);
    }
}
