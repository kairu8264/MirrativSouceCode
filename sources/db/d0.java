package db;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public class d0 extends c0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(wa.e.prize_recycler_view, 3);
        sparseIntArray.put(wa.e.delivery_date_container, 4);
        sparseIntArray.put(wa.e.delivery_label_text_view, 5);
        sparseIntArray.put(wa.e.note_recycler_view, 6);
        sparseIntArray.put(wa.e.rounded_button_view, 7);
    }

    public d0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.c0
    public void T(ya.d0 d0Var) {
        this.I = d0Var;
        synchronized (this) {
            this.K |= 1;
        }
        c(wa.a.f58500a);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.K;
            this.K = 0L;
        }
        int i10 = 0;
        ya.d0 d0Var = this.I;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i11 == 0 || d0Var == null) {
            str = null;
        } else {
            i10 = d0Var.c();
            str = d0Var.i();
            str2 = d0Var.g();
        }
        if (i11 != 0) {
            x3.e.c(this.C, str2);
            td.c.a(this.J, Integer.valueOf(i10));
            x3.e.c(this.H, str);
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
            this.K = 2L;
        }
        H();
    }

    public d0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[4], (OutlineTextView) objArr[2], (AppCompatTextView) objArr[5], (RecyclerView) objArr[6], (RecyclerView) objArr[3], (RoundedButtonView) objArr[7], (OutlineTextView) objArr[1]);
        this.K = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.H.setTag(null);
        N(view);
        y();
    }
}
