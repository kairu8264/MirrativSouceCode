package db;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ConstraintLayout C;
    public final AppCompatButton D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final Space G;
    public final AppCompatTextView H;

    public k(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, Space space, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = constraintLayout;
        this.D = appCompatButton;
        this.E = appCompatImageView;
        this.F = appCompatImageView2;
        this.G = space;
        this.H = appCompatTextView2;
    }

    public static k T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static k U(View view, Object obj) {
        return (k) ViewDataBinding.j(obj, view, wa.f.dialog_fragment_campaign_mission_receive_prizes_result);
    }
}
