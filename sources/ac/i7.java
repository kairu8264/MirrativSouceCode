package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.streaming.floating.setting.FloatingCopyPasteView;

/* loaded from: classes2.dex */
public class i7 extends h7 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final RelativeLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.Y1, 1);
        sparseIntArray.put(xb.o.f60030r0, 2);
        sparseIntArray.put(xb.o.T1, 3);
        sparseIntArray.put(xb.o.memo_counter, 4);
        sparseIntArray.put(xb.o.save_memo_broadcast, 5);
        sparseIntArray.put(xb.o.edittext_memo_broadcast, 6);
        sparseIntArray.put(xb.o.memo_arrow, 7);
        sparseIntArray.put(xb.o.copy_and_paste, 8);
    }

    public i7(androidx.databinding.e eVar, View view) {
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

    public i7(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RelativeLayout) objArr[2], (LinearLayout) objArr[3], (View) objArr[1], (FloatingCopyPasteView) objArr[8], (EditText) objArr[6], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
