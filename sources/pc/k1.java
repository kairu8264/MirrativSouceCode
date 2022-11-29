package pc;

import ae.e8;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class k1 extends ViewDataBinding {
    public final RecyclerView B;
    public final e8 C;

    public k1(Object obj, View view, int i10, RecyclerView recyclerView, e8 e8Var) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = e8Var;
    }

    public static k1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static k1 U(View view, Object obj) {
        return (k1) ViewDataBinding.j(obj, view, nc.f.fragment_bank_list);
    }
}
