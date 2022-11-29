package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class p extends o {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(xb.o.G9, 1);
        sparseIntArray.put(xb.o.f60054y2, 2);
        sparseIntArray.put(xb.o.favorite_setting_text_view, 3);
        sparseIntArray.put(xb.o.friend_only_broadcast_setting_text_view, 4);
        sparseIntArray.put(xb.o.omotenashi_broadcast_container, 5);
        sparseIntArray.put(xb.o.omotenashi_broadcast_setting_textview, 6);
        sparseIntArray.put(xb.o.omotenashi_broadcast_switch, 7);
        sparseIntArray.put(xb.o.omotenashi_broadcast_disabled_overlay_view, 8);
        sparseIntArray.put(xb.o.omotenashi_broadcast_description_textview, 9);
        sparseIntArray.put(xb.o.f60053y0, 10);
    }

    public p(androidx.databinding.e eVar, View view) {
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

    public p(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[10], (ConstraintLayout) objArr[0], (View) objArr[2], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[9], (View) objArr[8], (AppCompatTextView) objArr[6], (SwitchCompat) objArr[7], (AppCompatTextView) objArr[1]);
        this.M = -1L;
        this.C.setTag(null);
        N(view);
        y();
    }
}
