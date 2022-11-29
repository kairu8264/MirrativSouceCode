package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.streaming.floating.control.FloatingControlEditView;
import com.dena.mirrativ.streaming.floating.setting.FloatingSettingRecyclerView;

/* loaded from: classes2.dex */
public class u1 extends s1 {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final RelativeLayout S;
    public final LinearLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(xb.o.f60020p1, 2);
        sparseIntArray.put(xb.o.back_to_normal, 3);
        sparseIntArray.put(xb.o.edit_content, 4);
        sparseIntArray.put(xb.o.edit_view, 5);
        sparseIntArray.put(xb.o.normal_content, 6);
        sparseIntArray.put(xb.o.live_title_layout, 7);
        sparseIntArray.put(xb.o.live_title, 8);
        sparseIntArray.put(xb.o.app_icon, 9);
        sparseIntArray.put(xb.o.float_setting, 10);
        sparseIntArray.put(xb.o.playstop, 11);
        sparseIntArray.put(xb.o.playstop_image, 12);
        sparseIntArray.put(xb.o.live_stats, 13);
        sparseIntArray.put(xb.o.streaming_time, 14);
        sparseIntArray.put(xb.o.total_viewers, 15);
        sparseIntArray.put(xb.o.btn_help, 16);
    }

    public u1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 17, V, W));
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

    public u1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[9], (View) objArr[3], (ImageButton) objArr[16], null, (AppCompatImageView) objArr[2], (ScrollView) objArr[4], (FloatingControlEditView) objArr[5], (FloatingSettingRecyclerView) objArr[10], null, (LinearLayout) objArr[13], (AppCompatTextView) objArr[8], (LinearLayout) objArr[7], (RelativeLayout) objArr[6], (RelativeLayout) objArr[11], (AppCompatImageView) objArr[12], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[15]);
        this.U = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.S = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.T = linearLayout;
        linearLayout.setTag(null);
        N(view);
        y();
    }
}
