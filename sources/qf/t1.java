package qf;

import ae.ug;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.glide.GlideRequests;

/* loaded from: classes3.dex */
public final class t1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49387b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49388c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ug f49389a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_multiple_user, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new t1((ug) e10, null);
        }
    }

    public t1(ug ugVar) {
        super(ugVar.u());
        this.f49389a = ugVar;
    }

    public /* synthetic */ t1(ug ugVar, jo.h hVar) {
        this(ugVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.graphics.drawable.Drawable] */
    public final void a(String str, int i10, int i11) {
        jo.p.h(str, "viewerProfileImageUrl");
        GlideRequests with = GlideApp.with(this.f49389a.B);
        if (str.length() == 0) {
            str = c3.a.f(this.f49389a.u().getContext(), nd.y0.U1);
        }
        GlideRequest<Drawable> load = with.load(str);
        AppCompatImageView appCompatImageView = this.f49389a.B;
        jo.p.g(appCompatImageView, "binding.imageView");
        load.apply(e8.h.bitmapTransform(new xd.a(de.n.b(appCompatImageView, 1), c3.a.d(this.f49389a.u().getContext(), i11)))).skipMemoryCache(true).into(this.f49389a.B).a();
        ViewGroup.LayoutParams layoutParams = this.f49389a.B.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f49389a.B.setLayoutParams(layoutParams);
    }
}
