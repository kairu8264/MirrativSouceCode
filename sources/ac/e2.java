package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class e2 extends d2 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xb.o.Y1, 1);
        sparseIntArray.put(xb.o.T1, 2);
        sparseIntArray.put(xb.o.tts_volume_seekBar, 3);
        sparseIntArray.put(xb.o.tts_detail_text, 4);
        sparseIntArray.put(xb.o.tts_detail_description_text, 5);
        sparseIntArray.put(xb.o.tts_detail_open_button, 6);
        sparseIntArray.put(xb.o.tts_arrow, 7);
    }

    public e2(androidx.databinding.e eVar, View view) {
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

    public e2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LinearLayout) objArr[2], (View) objArr[1], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[5], (AppCompatButton) objArr[6], (AppCompatTextView) objArr[4], (RelativeLayout) objArr[0], (SeekBar) objArr[3]);
        this.J = -1L;
        this.H.setTag(null);
        N(view);
        y();
    }
}
