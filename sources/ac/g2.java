package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class g2 extends f2 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.collab_status_container, 2);
        sparseIntArray.put(xb.o.collab_icon_image_view, 3);
        sparseIntArray.put(xb.o.collab_user_num_text, 4);
        sparseIntArray.put(xb.o.mic_image_view, 5);
        sparseIntArray.put(xb.o.video_status_container, 6);
        sparseIntArray.put(xb.o.Y9, 7);
        sparseIntArray.put(xb.o.tutorial_text_view, 8);
    }

    public g2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.K;
            this.K = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.J, 16, Integer.valueOf(ViewDataBinding.t(this.J, xb.l.f59937f)));
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

    public g2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (ConstraintLayout) objArr[2], (AppCompatTextView) objArr[4], (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[8], (ConstraintLayout) objArr[6], (AppCompatTextView) objArr[1]);
        this.K = -1L;
        this.F.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
