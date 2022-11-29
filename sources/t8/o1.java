package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.catalog.mission.MissionItemView;

/* loaded from: classes.dex */
public abstract class o1 extends ViewDataBinding {
    public final MissionItemView B;

    public o1(Object obj, View view, int i10, MissionItemView missionItemView) {
        super(obj, view, i10);
        this.B = missionItemView;
    }

    public static o1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static o1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (o1) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_mission_tab_item, viewGroup, z10, obj);
    }
}
