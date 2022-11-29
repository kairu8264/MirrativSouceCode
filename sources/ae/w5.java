package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class w5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RecyclerView C;

    public w5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = recyclerView;
    }

    public static w5 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static w5 U(View view, Object obj) {
        return (w5) ViewDataBinding.j(obj, view, nd.b1.dialog_landing_page_reward_list);
    }
}
