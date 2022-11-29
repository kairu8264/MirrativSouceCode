package ae;

import android.view.View;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class q extends ViewDataBinding {
    public final AppCompatTextView B;
    public final e8 C;
    public final ListView D;

    public q(Object obj, View view, int i10, AppCompatTextView appCompatTextView, e8 e8Var, ListView listView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = e8Var;
        this.D = listView;
    }
}
