package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class f0 extends e0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.f60038u2, 1);
        sparseIntArray.put(xb.o.earphone_alert_title, 2);
        sparseIntArray.put(xb.o.f60006m1, 3);
        sparseIntArray.put(xb.o.no_earphone_image, 4);
        sparseIntArray.put(xb.o.no_earphone_message, 5);
        sparseIntArray.put(xb.o.f60054y2, 6);
        sparseIntArray.put(xb.o.no_download_image, 7);
        sparseIntArray.put(xb.o.no_download_message, 8);
    }

    public f0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 1L;
        }
        H();
    }

    public f0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (ConstraintLayout) objArr[1], (View) objArr[6], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[5]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
