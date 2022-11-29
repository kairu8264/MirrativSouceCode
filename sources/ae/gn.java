package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class gn extends ViewDataBinding {
    public final AppCompatTextView B;
    public final LinearLayout C;
    public final AppCompatTextView D;
    public final RecyclerView E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;

    public gn(Object obj, View view, int i10, AppCompatTextView appCompatTextView, LinearLayout linearLayout, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = linearLayout;
        this.D = appCompatTextView2;
        this.E = recyclerView;
        this.F = appCompatImageView;
        this.G = appCompatTextView3;
    }
}
