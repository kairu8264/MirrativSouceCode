package t8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.home.app.AppsMyAppButton;

/* loaded from: classes.dex */
public class j0 extends i0 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(r8.e1.dashboard_applist, 1);
        sparseIntArray.put(r8.e1.myappButtonWrapper, 2);
        sparseIntArray.put(r8.e1.myappButton, 3);
        sparseIntArray.put(r8.e1.pr_container, 4);
        sparseIntArray.put(r8.e1.pr_text, 5);
        sparseIntArray.put(r8.e1.event_container, 6);
        sparseIntArray.put(r8.e1.event_text, 7);
        sparseIntArray.put(r8.e1.myapp_app_container, 8);
        sparseIntArray.put(r8.e1.myapp_app_text, 9);
        sparseIntArray.put(r8.e1.onlive_app_container, 10);
        sparseIntArray.put(r8.e1.onlive_app_text, 11);
    }

    public j0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 1L;
        }
        H();
    }

    public j0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[0], (RecyclerView) objArr[1], (ConstraintLayout) objArr[6], (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[8], (AppCompatTextView) objArr[9], (AppsMyAppButton) objArr[3], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[10], (AppCompatTextView) objArr[11], (ConstraintLayout) objArr[4], (AppCompatTextView) objArr[5]);
        this.N = -1L;
        this.B.setTag(null);
        N(view);
        y();
    }
}
