package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class y6 extends ViewDataBinding {
    public final RecyclerView B;

    public y6(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = recyclerView;
    }

    public static y6 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static y6 U(View view, Object obj) {
        return (y6) ViewDataBinding.j(obj, view, nd.b1.fragment_player_comment);
    }
}
