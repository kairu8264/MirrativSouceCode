package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class u extends ViewDataBinding {
    public final View B;
    public final RecyclerView C;
    public final AppCompatTextView D;

    public u(Object obj, View view, int i10, View view2, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = recyclerView;
        this.D = appCompatTextView;
    }

    public static u T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static u U(View view, Object obj) {
        return (u) ViewDataBinding.j(obj, view, q9.h.dialog_fragment_closet_save_slot_picker);
    }
}
