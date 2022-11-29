package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.PageControl;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class j0 extends i0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final FrameLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xb.o.G9, 1);
        sparseIntArray.put(xb.o.f60045v7, 2);
        sparseIntArray.put(xb.o.K6, 3);
        sparseIntArray.put(xb.o.use_this_favorite_live_setting_text_view, 4);
        sparseIntArray.put(xb.o.update_favorite_live_setting_text_view, 5);
        sparseIntArray.put(xb.o.Q8, 6);
        sparseIntArray.put(xb.o.f60024q1, 7);
    }

    public j0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 1L;
        }
        H();
    }

    public j0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[7], (PageControl) objArr[3], (RecyclerView) objArr[2], (StatusView) objArr[6], (AppCompatTextView) objArr[1], (RoundedButtonView) objArr[5], (RoundedButtonView) objArr[4]);
        this.J = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.I = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
