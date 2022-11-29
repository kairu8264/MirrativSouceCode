package pc;

import ae.e8;
import ae.w7;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class v extends u {
    public static final ViewDataBinding.i N;
    public static final SparseIntArray O;
    public final FrameLayout L;
    public long M;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        N = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{2}, new int[]{nd.b1.toolbar});
        iVar.a(1, new String[]{"listview_empty_view"}, new int[]{3}, new int[]{nd.b1.listview_empty_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(nc.e.headerView, 4);
        sparseIntArray.put(nc.e.headerTextView, 5);
        sparseIntArray.put(nc.e.headerTitleView, 6);
        sparseIntArray.put(nc.e.headerDescriptionView, 7);
        sparseIntArray.put(nc.e.headerWarnView, 8);
        sparseIntArray.put(nc.e.headerButton, 9);
        sparseIntArray.put(nc.e.listview, 10);
    }

    public v(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return T((w7) obj, i11);
        }
        return U((e8) obj, i11);
    }

    public final boolean T(w7 w7Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean U(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.M |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.M = 0L;
        }
        ViewDataBinding.n(this.K);
        ViewDataBinding.n(this.I);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.M != 0) {
                return true;
            }
            return this.K.w() || this.I.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 4L;
        }
        this.K.y();
        this.I.y();
        H();
    }

    public v(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[7], (LinearLayout) objArr[5], (AppCompatTextView) objArr[6], (RelativeLayout) objArr[4], (AppCompatTextView) objArr[8], (ListView) objArr[10], (w7) objArr[3], (RelativeLayout) objArr[0], (e8) objArr[2]);
        this.M = -1L;
        L(this.I);
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.L = frameLayout;
        frameLayout.setTag(null);
        this.J.setTag(null);
        L(this.K);
        N(view);
        y();
    }
}
