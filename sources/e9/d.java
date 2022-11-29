package e9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes.dex */
public class d extends c {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(d9.d.f29321d, 2);
        sparseIntArray.put(d9.d.f29325m, 3);
        sparseIntArray.put(d9.d.matching_collab_enabled_text_view, 4);
        sparseIntArray.put(d9.d.matching_collab_enabled__setting_switch, 5);
        sparseIntArray.put(d9.d.f29320c, 6);
        sparseIntArray.put(d9.d.save_button_view, 7);
        sparseIntArray.put(d9.d.f29322e, 8);
    }

    public d(e eVar, View view) {
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
            td.c.b(this.C, 12, Integer.valueOf(ViewDataBinding.t(this.C, d9.b.f29317b)));
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

    public d(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[2], (RoundedButtonView) objArr[8], (SwitchCompat) objArr[5], (AppCompatTextView) objArr[4], (RoundedButtonView) objArr[7], (AppCompatTextView) objArr[3]);
        this.K = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
