package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class e7 extends ViewDataBinding {
    public final RecyclerView B;

    public e7(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = recyclerView;
    }

    public static e7 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static e7 U(View view, Object obj) {
        return (e7) ViewDataBinding.j(obj, view, nd.b1.fragment_stream_comment);
    }
}
