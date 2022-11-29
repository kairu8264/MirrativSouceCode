package t8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class a0 extends ViewDataBinding {
    public final FrameLayout B;
    public final ListView C;
    public final RelativeLayout D;
    public final LinearLayout E;
    public final ProgressBar F;

    public a0(Object obj, View view, int i10, FrameLayout frameLayout, ListView listView, RelativeLayout relativeLayout, LinearLayout linearLayout, ProgressBar progressBar) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = listView;
        this.D = relativeLayout;
        this.E = linearLayout;
        this.F = progressBar;
    }
}
