package ae;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class o extends ViewDataBinding {
    public final ListView B;
    public final AppCompatTextView C;
    public final LinearLayout D;
    public final RecyclerView E;
    public final LinearLayout F;
    public final EditText G;
    public final AppCompatTextView H;
    public final e8 I;

    public o(Object obj, View view, int i10, ListView listView, AppCompatTextView appCompatTextView, LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, EditText editText, AppCompatTextView appCompatTextView2, e8 e8Var) {
        super(obj, view, i10);
        this.B = listView;
        this.C = appCompatTextView;
        this.D = linearLayout;
        this.E = recyclerView;
        this.F = linearLayout2;
        this.G = editText;
        this.H = appCompatTextView2;
        this.I = e8Var;
    }
}
