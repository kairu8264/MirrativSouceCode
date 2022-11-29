package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public class j8 extends i8 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.monthly_popup_container, 1);
        sparseIntArray.put(nd.z0.monthly_balloon_image_view, 2);
        sparseIntArray.put(nd.z0.N, 3);
        sparseIntArray.put(nd.z0.Ue, 4);
        sparseIntArray.put(nd.z0.continuous_text_view, 5);
        sparseIntArray.put(nd.z0.unit_text_view, 6);
        sparseIntArray.put(nd.z0.archive_text_view, 7);
        sparseIntArray.put(nd.z0.f42361w3, 8);
    }

    public j8(androidx.databinding.e eVar, View view) {
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

    public j8(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (OutlineTextView) objArr[7], (AppCompatImageView) objArr[3], (OutlineTextView) objArr[5], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[1], (OutlineTextView) objArr[4], (OutlineTextView) objArr[6]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
