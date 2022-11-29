package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LongClickRepeatView;

/* loaded from: classes2.dex */
public class h0 extends g0 {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xb.o.f60010m8, 1);
        sparseIntArray.put(xb.o.f59977d0, 2);
        sparseIntArray.put(xb.o.G9, 3);
        sparseIntArray.put(xb.o.karaoke_title_text_view, 4);
        sparseIntArray.put(xb.o.top_divider, 5);
        sparseIntArray.put(xb.o.pitch_setting_label_text_view, 6);
        sparseIntArray.put(xb.o.pitch_value_text_view, 7);
        sparseIntArray.put(xb.o.pitch_down_button, 8);
        sparseIntArray.put(xb.o.pitch_up_button, 9);
        sparseIntArray.put(xb.o.middle_divider, 10);
        sparseIntArray.put(xb.o.speed_setting_label_text_view, 11);
        sparseIntArray.put(xb.o.speed_value_text_view, 12);
        sparseIntArray.put(xb.o.speed_down_button, 13);
        sparseIntArray.put(xb.o.speed_up_button, 14);
    }

    public h0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 15, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 1L;
        }
        H();
    }

    public h0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[4], (View) objArr[10], (LongClickRepeatView) objArr[8], (AppCompatTextView) objArr[6], (LongClickRepeatView) objArr[9], (AppCompatTextView) objArr[7], (View) objArr[1], (LongClickRepeatView) objArr[13], (AppCompatTextView) objArr[11], (LongClickRepeatView) objArr[14], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[3], (View) objArr[5]);
        this.Q = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
