package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class r2 extends ViewDataBinding {
    public final AppCompatButton B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final RecyclerView E;

    public r2(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = recyclerView;
    }

    public static r2 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static r2 U(View view, Object obj) {
        return (r2) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_emomo_pose);
    }
}
