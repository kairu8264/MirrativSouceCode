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
public class t1 extends s1 {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final RelativeLayout S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(xb.o.f60020p1, 2);
        sparseIntArray.put(xb.o.back_to_normal, 3);
        sparseIntArray.put(xb.o.edit_content, 4);
        sparseIntArray.put(xb.o.edit_view, 5);
        sparseIntArray.put(xb.o.normal_content, 6);
        sparseIntArray.put(xb.o.live_title_layout, 7);
        sparseIntArray.put(xb.o.live_title, 8);
        sparseIntArray.put(xb.o.app_icon, 9);
        sparseIntArray.put(xb.o.float_setting_container, 10);
        sparseIntArray.put(xb.o.float_setting, 11);
        sparseIntArray.put(xb.o.btn_help, 12);
        sparseIntArray.put(xb.o.playstop, 13);
        sparseIntArray.put(xb.o.playstop_image, 14);
        sparseIntArray.put(xb.o.live_stats, 15);
        sparseIntArray.put(xb.o.streaming_time, 16);
        sparseIntArray.put(xb.o.total_viewers, 17);
    }

    public t1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 18, U, V));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.T != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.T = 1L;
        }
        H();
    }

    public t1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[9], (View) objArr[3], (ImageButton) objArr[12], (LinearLayout) objArr[1], (AppCompatImageView) objArr[2], (ScrollView) objArr[4], (FloatingControlEditView) objArr[5], (FloatingSettingRecyclerView) objArr[11], (LinearLayout) objArr[10], (LinearLayout) objArr[15], (AppCompatTextView) objArr[8], (LinearLayout) objArr[7], (RelativeLayout) objArr[6], (RelativeLayout) objArr[13], (AppCompatImageView) objArr[14], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[17]);
        this.T = -1L;
        this.E.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.S = relativeLayout;
        relativeLayout.setTag(null);
        N(view);
        y();
    }
}
