package pc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class m1 extends ViewDataBinding {
    public final RecyclerView B;

    public m1(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = recyclerView;
    }

    public static m1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static m1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (m1) ViewDataBinding.x(layoutInflater, nc.f.fragment_chat_threads, viewGroup, z10, obj);
    }
}
