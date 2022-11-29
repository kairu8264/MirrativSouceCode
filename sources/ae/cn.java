package ae;

import android.view.View;
import android.widget.RadioGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class cn extends ViewDataBinding {
    public final RadioGroup B;
    public final RecyclerView C;

    public cn(Object obj, View view, int i10, RadioGroup radioGroup, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = radioGroup;
        this.C = recyclerView;
    }
}
