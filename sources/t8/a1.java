package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.customview.LiveCatalogUserAppStatusView;
import com.dena.mirrorman.customview.LiveTimeView;

/* loaded from: classes.dex */
public abstract class a1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final LiveBadgeView D;
    public final LiveCatalogStreamerView E;
    public final LiveTimeView F;
    public final View G;
    public final AppCompatImageView H;
    public final AppCompatImageView I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public final LiveCatalogUserAppStatusView L;
    public final LiveCatalogUserAppStatusView M;
    public final RecyclerView N;

    public a1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LiveBadgeView liveBadgeView, LiveCatalogStreamerView liveCatalogStreamerView, LiveTimeView liveTimeView, View view2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView, LiveCatalogUserAppStatusView liveCatalogUserAppStatusView, LiveCatalogUserAppStatusView liveCatalogUserAppStatusView2, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = liveBadgeView;
        this.E = liveCatalogStreamerView;
        this.F = liveTimeView;
        this.G = view2;
        this.H = appCompatImageView3;
        this.I = appCompatImageView4;
        this.J = appCompatImageView5;
        this.K = appCompatTextView;
        this.L = liveCatalogUserAppStatusView;
        this.M = liveCatalogUserAppStatusView2;
        this.N = recyclerView;
    }

    public static a1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static a1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a1) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_private_live_small, viewGroup, z10, obj);
    }
}
