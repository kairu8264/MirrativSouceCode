package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.catalog.CarouselView;

/* loaded from: classes.dex */
public abstract class m0 extends ViewDataBinding {
    public final CarouselView B;

    public m0(Object obj, View view, int i10, CarouselView carouselView) {
        super(obj, view, i10);
        this.B = carouselView;
    }

    public static m0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static m0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (m0) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_carousel, viewGroup, z10, obj);
    }
}
