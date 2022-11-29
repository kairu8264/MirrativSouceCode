package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.mission.MissionItemView;

/* loaded from: classes.dex */
public abstract class m1 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final View G;
    public final ConstraintLayout H;
    public final AppCompatTextView I;
    public final MissionItemView J;
    public final LinearLayout K;
    public final View L;
    public final AppCompatImageView M;
    public final AppCompatImageView N;
    public final RecyclerView O;
    public final ConstraintLayout P;
    public final AppCompatImageView Q;
    public final RecyclerView R;
    public final AppCompatImageView S;

    public m1(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, View view2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView3, MissionItemView missionItemView, LinearLayout linearLayout, View view3, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, RecyclerView recyclerView, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView5, RecyclerView recyclerView2, AppCompatImageView appCompatImageView6) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = appCompatImageView;
        this.F = appCompatImageView2;
        this.G = view2;
        this.H = constraintLayout2;
        this.I = appCompatTextView3;
        this.J = missionItemView;
        this.K = linearLayout;
        this.L = view3;
        this.M = appCompatImageView3;
        this.N = appCompatImageView4;
        this.O = recyclerView;
        this.P = constraintLayout3;
        this.Q = appCompatImageView5;
        this.R = recyclerView2;
        this.S = appCompatImageView6;
    }

    public static m1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static m1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (m1) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_mission_tab_header, viewGroup, z10, obj);
    }
}
