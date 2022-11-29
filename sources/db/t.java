package db;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class t extends s {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(wa.e.app_user_id_setting_button_view, 4);
    }

    public t(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.s
    public void T(ya.d dVar) {
        this.F = dVar;
        synchronized (this) {
            this.H |= 1;
        }
        c(wa.a.f58500a);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        ya.d dVar = this.F;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || dVar == null) {
            str = null;
            str2 = null;
        } else {
            str3 = dVar.b();
            str = dVar.d();
            str2 = dVar.c();
        }
        if (i10 != 0) {
            td.a.p(this.B, str3);
            x3.e.c(this.D, str2);
            x3.e.c(this.E, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.H = 2L;
        }
        H();
    }

    public t(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[1], (RoundedButtonView) objArr[4], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2]);
        this.H = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        N(view);
        y();
    }
}
