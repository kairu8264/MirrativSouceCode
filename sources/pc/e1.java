package pc;

import android.view.View;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class e1 extends ViewDataBinding {
    public final m3 B;
    public final o3 C;

    public e1(Object obj, View view, int i10, m3 m3Var, o3 o3Var) {
        super(obj, view, i10);
        this.B = m3Var;
        this.C = o3Var;
    }

    public static e1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static e1 U(View view, Object obj) {
        return (e1) ViewDataBinding.j(obj, view, nc.f.dialog_fragment_sesason_rating_result);
    }
}
