package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class r1 extends q1 {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final RelativeLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(xb.o.title_edit, 1);
        sparseIntArray.put(xb.o.focus_event_layout, 2);
        sparseIntArray.put(xb.o.focus_event_container, 3);
        sparseIntArray.put(xb.o.focus_event_header_text, 4);
        sparseIntArray.put(xb.o.focus_event_header_image_view, 5);
        sparseIntArray.put(xb.o.focus_events_recycler_view, 6);
        sparseIntArray.put(xb.o.focus_event_title_text_view, 7);
        sparseIntArray.put(xb.o.focus_event_period_text_view, 8);
        sparseIntArray.put(xb.o.app_edit_layout, 9);
        sparseIntArray.put(xb.o.app_edit_title, 10);
        sparseIntArray.put(xb.o.app_current_icon, 11);
        sparseIntArray.put(xb.o.app_current_label, 12);
        sparseIntArray.put(xb.o.app_divider, 13);
        sparseIntArray.put(xb.o.app_set_none, 14);
        sparseIntArray.put(xb.o.app_search_container, 15);
        sparseIntArray.put(xb.o.search_icon_image, 16);
        sparseIntArray.put(xb.o.U7, 17);
        sparseIntArray.put(xb.o.app_list, 18);
    }

    public r1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 19, V, W));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.U = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.U != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.U = 1L;
        }
        H();
    }

    public r1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[11], (AppCompatTextView) objArr[12], (View) objArr[13], (RelativeLayout) objArr[9], (AppCompatTextView) objArr[10], (RecyclerView) objArr[18], (ConstraintLayout) objArr[15], (AppCompatTextView) objArr[14], (LinearLayout) objArr[3], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[4], (RelativeLayout) objArr[2], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[7], (RecyclerView) objArr[6], (EditText) objArr[17], (ImageButton) objArr[16], (EditText) objArr[1]);
        this.U = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.T = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
