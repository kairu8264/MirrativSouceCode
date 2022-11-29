package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class q4 extends p4 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.Y1, 1);
        sparseIntArray.put(xb.o.T1, 2);
        sparseIntArray.put(xb.o.switch_collab, 3);
        sparseIntArray.put(xb.o.text_collab_max, 4);
        sparseIntArray.put(xb.o.btn_decrease_max_collab_user_num, 5);
        sparseIntArray.put(xb.o.max_collab_user_num_text, 6);
        sparseIntArray.put(xb.o.btn_increase_max_collab_user_num, 7);
        sparseIntArray.put(xb.o.collab_arrow, 8);
    }

    public q4(androidx.databinding.e eVar, View view) {
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

    public q4(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ImageButton) objArr[5], (ImageButton) objArr[7], (AppCompatImageView) objArr[8], (RelativeLayout) objArr[0], (LinearLayout) objArr[2], (View) objArr[1], (AppCompatTextView) objArr[6], (Switch) objArr[3], (AppCompatTextView) objArr[4]);
        this.K = -1L;
        this.E.setTag(null);
        N(view);
        y();
    }
}
