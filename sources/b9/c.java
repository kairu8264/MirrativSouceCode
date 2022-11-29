package b9;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import jo.h;
import jo.p;
import r8.f1;
import s8.n;
import t8.w1;

/* loaded from: classes.dex */
public final class c extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17100b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17101c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final w1 f17102a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            ViewDataBinding e10 = f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_holder_private_live_catalog_viewer, viewGroup, false);
            p.g(e10, "inflate(\n               …      false\n            )");
            return new c((w1) e10, null);
        }
    }

    public c(w1 w1Var) {
        super(w1Var.u());
        this.f17102a = w1Var;
    }

    public /* synthetic */ c(w1 w1Var, h hVar) {
        this(w1Var);
    }

    public final void a(n nVar) {
        p.h(nVar, "bindModel");
        AppCompatImageView appCompatImageView = this.f17102a.B;
        p.g(appCompatImageView, "binding.imageView");
        td.a.i(appCompatImageView, nVar.a());
        float f10 = nVar.b() ? 0.0f : 1.0f;
        AppCompatImageView appCompatImageView2 = this.f17102a.B;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f10);
        appCompatImageView2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f17102a.o();
    }
}
