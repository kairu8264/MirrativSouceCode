package sa;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class w extends ViewDataBinding {
    public final AppCompatTextView B;
    public final RecyclerView C;
    public final AppCompatImageView D;
    public final FrameLayout E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;

    public w(Object obj, View view, int i10, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatImageView appCompatImageView, FrameLayout frameLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = recyclerView;
        this.D = appCompatImageView;
        this.E = frameLayout;
        this.F = appCompatImageView2;
        this.G = appCompatTextView2;
    }
}
