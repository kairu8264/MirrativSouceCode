package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class t extends s {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final RelativeLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(nd.z0.header, 1);
        sparseIntArray.put(nd.z0.A1, 2);
        sparseIntArray.put(nd.z0.f42292h0, 3);
        sparseIntArray.put(nd.z0.container1, 4);
        sparseIntArray.put(nd.z0.delete_thumbnail, 5);
        sparseIntArray.put(nd.z0.De, 6);
        sparseIntArray.put(nd.z0.thumbnail_cover, 7);
        sparseIntArray.put(nd.z0.notset_title, 8);
        sparseIntArray.put(nd.z0.notset_description, 9);
        sparseIntArray.put(nd.z0.f42268be, 10);
        sparseIntArray.put(nd.z0.f42310l1, 11);
    }

    public t(androidx.databinding.e eVar, View view) {
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

    public t(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LinearLayout) objArr[3], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[2], (LinearLayout) objArr[4], (AppCompatTextView) objArr[5], (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[8], (StatusView) objArr[10], (LinearLayout) objArr[7], (AppCompatImageView) objArr[6]);
        this.N = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.M = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
