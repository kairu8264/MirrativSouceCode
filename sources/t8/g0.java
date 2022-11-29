package t8;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class g0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final LinearLayout C;
    public final ImageView D;
    public final ImageButton E;
    public final Switch F;

    public g0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, LinearLayout linearLayout, ImageView imageView, ImageButton imageButton, Switch r82) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = linearLayout;
        this.D = imageView;
        this.E = imageButton;
        this.F = r82;
    }
}
