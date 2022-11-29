package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class q2 extends p2 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(xb.o.f60020p1, 1);
        sparseIntArray.put(xb.o.back, 2);
        sparseIntArray.put(xb.o.warning_text, 3);
        sparseIntArray.put(xb.o.live_viewer_list, 4);
    }

    public q2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 1L;
        }
        H();
    }

    public q2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (RelativeLayout) objArr[0], (ListView) objArr[4], (AppCompatTextView) objArr[3]);
        this.G = -1L;
        this.D.setTag(null);
        N(view);
        y();
    }
}
