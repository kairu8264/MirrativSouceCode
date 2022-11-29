package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class z4 extends y4 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(nd.z0.f42290gf, 2);
        sparseIntArray.put(nd.z0.f42327p0, 3);
        sparseIntArray.put(nd.z0.A1, 4);
        sparseIntArray.put(nd.z0.actual_image_view, 5);
        sparseIntArray.put(nd.z0.f42364w9, 6);
        sparseIntArray.put(nd.z0.Ue, 7);
        sparseIntArray.put(nd.z0.slot_recycler_view, 8);
        sparseIntArray.put(nd.z0.f42268be, 9);
    }

    public z4(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.L;
            this.L = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.C, 12, Integer.valueOf(ViewDataBinding.t(this.C, nd.w0.U0)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public z4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageView) objArr[5], (View) objArr[1], (Space) objArr[3], (ImageView) objArr[4], (TextView) objArr[6], (RecyclerView) objArr[8], (StatusView) objArr[9], (TextView) objArr[7], (Space) objArr[2]);
        this.L = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
