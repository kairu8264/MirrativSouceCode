package ae;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class y4 extends ViewDataBinding {
    public final ImageView B;
    public final View C;
    public final Space D;
    public final ImageView E;
    public final TextView F;
    public final RecyclerView G;
    public final StatusView H;
    public final TextView I;
    public final Space J;

    public y4(Object obj, View view, int i10, ImageView imageView, View view2, Space space, ImageView imageView2, TextView textView, RecyclerView recyclerView, StatusView statusView, TextView textView2, Space space2) {
        super(obj, view, i10);
        this.B = imageView;
        this.C = view2;
        this.D = space;
        this.E = imageView2;
        this.F = textView;
        this.G = recyclerView;
        this.H = statusView;
        this.I = textView2;
        this.J = space2;
    }

    public static y4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static y4 U(View view, Object obj) {
        return (y4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_unique_emomo_gift_slots);
    }
}
