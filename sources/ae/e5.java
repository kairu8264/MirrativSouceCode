package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class e5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RecyclerView C;
    public final AppCompatTextView D;

    public e5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = recyclerView;
        this.D = appCompatTextView;
    }

    public static e5 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static e5 U(View view, Object obj) {
        return (e5) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_unique_emomo_rich_gift_preset_select);
    }
}
