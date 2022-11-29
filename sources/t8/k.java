package t8;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class k extends ViewDataBinding {
    public final RecyclerView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final RelativeLayout E;
    public final AppCompatImageView F;
    public final EditText G;
    public final LinearLayout H;
    public final RelativeLayout I;
    public final StatusView J;
    public final AppCompatTextView K;

    public k(Object obj, View view, int i10, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, EditText editText, LinearLayout linearLayout, RelativeLayout relativeLayout2, StatusView statusView, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = recyclerView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = relativeLayout;
        this.F = appCompatImageView;
        this.G = editText;
        this.H = linearLayout;
        this.I = relativeLayout2;
        this.J = statusView;
        this.K = appCompatTextView3;
    }
}
