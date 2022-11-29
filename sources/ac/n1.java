package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class n1 extends m1 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(xb.o.M, 1);
        sparseIntArray.put(xb.o.avatar_login, 2);
        sparseIntArray.put(xb.o.avatar_logout, 3);
        sparseIntArray.put(xb.o.history_container, 4);
        sparseIntArray.put(xb.o.history_container1, 5);
        sparseIntArray.put(xb.o.float_comment_post, 6);
        sparseIntArray.put(xb.o.close_list, 7);
        sparseIntArray.put(xb.o.float_comment_listview, 8);
        sparseIntArray.put(xb.o.setting_container, 9);
        sparseIntArray.put(xb.o.player_setting, 10);
        sparseIntArray.put(xb.o.f60029qa, 11);
        sparseIntArray.put(xb.o.stamp_count, 12);
        sparseIntArray.put(xb.o.M1, 13);
        sparseIntArray.put(xb.o.float_comment_listview_small, 14);
        sparseIntArray.put(xb.o.paste_button, 15);
    }

    public n1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 1L;
        }
        H();
    }

    public n1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RelativeLayout) objArr[1], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[7], (RelativeLayout) objArr[13], (RecyclerView) objArr[8], (RecyclerView) objArr[14], (EditText) objArr[6], (RelativeLayout) objArr[4], (LinearLayout) objArr[5], (AppCompatTextView) objArr[15], (AppCompatImageView) objArr[10], (RelativeLayout) objArr[0], (LinearLayout) objArr[9], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[11]);
        this.R = -1L;
        this.N.setTag(null);
        N(view);
        y();
    }
}
