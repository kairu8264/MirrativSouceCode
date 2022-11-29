package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class v7 extends u7 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final RelativeLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.f42273d5, 1);
        sparseIntArray.put(nd.z0.I6, 2);
        sparseIntArray.put(nd.z0.N, 3);
        sparseIntArray.put(nd.z0.layout2, 4);
        sparseIntArray.put(nd.z0.f42287fg, 5);
        sparseIntArray.put(nd.z0.reason, 6);
        sparseIntArray.put(nd.z0.f42330pg, 7);
    }

    public v7(androidx.databinding.e eVar, View view) {
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

    public v7(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[2], (LinearLayout) objArr[4], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[7]);
        this.J = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.I = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
