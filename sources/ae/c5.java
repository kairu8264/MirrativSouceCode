package ae;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes2.dex */
public abstract class c5 extends ViewDataBinding {
    public final RecyclerView B;
    public final EditTextWithOnKeyPreImeListener C;

    public c5(Object obj, View view, int i10, RecyclerView recyclerView, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = editTextWithOnKeyPreImeListener;
    }

    public static c5 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static c5 U(View view, Object obj) {
        return (c5) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_unique_emomo_rich_gift_edit_message);
    }
}
