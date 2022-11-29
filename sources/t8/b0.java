package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public class b0 extends a0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final RelativeLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(r8.e1.livelist_container, 1);
        sparseIntArray.put(r8.e1.livelist_search_container, 2);
        sparseIntArray.put(r8.e1.f49879p0, 3);
        sparseIntArray.put(r8.e1.keywordlist, 4);
        sparseIntArray.put(r8.e1.search_progress_bar, 5);
    }

    public b0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, I, J));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.H = 0L;
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
            this.H = 1L;
        }
        H();
    }

    public b0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (FrameLayout) objArr[3], (ListView) objArr[4], (RelativeLayout) objArr[1], (LinearLayout) objArr[2], (ProgressBar) objArr[5]);
        this.H = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.G = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
