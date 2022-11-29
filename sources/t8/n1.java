package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.mission.MissionItemView;

/* loaded from: classes.dex */
public class n1 extends m1 {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final ConstraintLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(r8.e1.mission_description_container, 1);
        sparseIntArray.put(r8.e1.mission_description_background_text_view, 2);
        sparseIntArray.put(r8.e1.mission_description_text_view, 3);
        sparseIntArray.put(r8.e1.special_mission_container, 4);
        sparseIntArray.put(r8.e1.special_mission_icon_image_view, 5);
        sparseIntArray.put(r8.e1.special_mission_recycler_view, 6);
        sparseIntArray.put(r8.e1.special_mission_app_recycler_view, 7);
        sparseIntArray.put(r8.e1.first_mission_container, 8);
        sparseIntArray.put(r8.e1.first_mission_icon_image_view, 9);
        sparseIntArray.put(r8.e1.first_mission_text_image_view, 10);
        sparseIntArray.put(r8.e1.mission_item_view, 11);
        sparseIntArray.put(r8.e1.first_mission_description_first, 12);
        sparseIntArray.put(r8.e1.first_mission_description_second, 13);
        sparseIntArray.put(r8.e1.second_mission_container_view, 14);
        sparseIntArray.put(r8.e1.second_mission_container, 15);
        sparseIntArray.put(r8.e1.second_mission_icon_image_view, 16);
        sparseIntArray.put(r8.e1.second_mission_title_image_view, 17);
        sparseIntArray.put(r8.e1.U2, 18);
    }

    public n1(androidx.databinding.e eVar, View view) {
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

    public n1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (ConstraintLayout) objArr[8], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[13], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[10], (View) objArr[2], (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[3], (MissionItemView) objArr[11], (LinearLayout) objArr[15], (View) objArr[14], (AppCompatImageView) objArr[16], (AppCompatImageView) objArr[17], (RecyclerView) objArr[7], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[5], (RecyclerView) objArr[6], (AppCompatImageView) objArr[18]);
        this.U = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
