package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public class l extends k {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(r8.e1.O2, 1);
        sparseIntArray.put(r8.e1.F, 2);
        sparseIntArray.put(r8.e1.f49883s, 3);
        sparseIntArray.put(r8.e1.f49870j2, 4);
        sparseIntArray.put(r8.e1.search_image_view, 5);
        sparseIntArray.put(r8.e1.Y, 6);
        sparseIntArray.put(r8.e1.app_list_recycler_view, 7);
        sparseIntArray.put(r8.e1.G2, 8);
        sparseIntArray.put(r8.e1.clear_text_container, 9);
        sparseIntArray.put(r8.e1.A, 10);
    }

    public l(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 1L;
        }
        H();
    }

    public l(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RecyclerView) objArr[7], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[10], (RelativeLayout) objArr[9], (AppCompatImageView) objArr[2], (EditText) objArr[6], (LinearLayout) objArr[4], (RelativeLayout) objArr[5], (StatusView) objArr[8], (AppCompatTextView) objArr[1]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
