package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.FastScrollIndicator;

/* loaded from: classes2.dex */
public abstract class r2 extends ViewDataBinding {
    public final FastScrollIndicator B;
    public final AppCompatTextView C;
    public final RecyclerView D;

    public r2(Object obj, View view, int i10, FastScrollIndicator fastScrollIndicator, AppCompatTextView appCompatTextView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = fastScrollIndicator;
        this.C = appCompatTextView;
        this.D = recyclerView;
    }

    public static r2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static r2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (r2) ViewDataBinding.x(layoutInflater, xb.p.fragment_emokara_artists_tab, viewGroup, z10, obj);
    }
}
