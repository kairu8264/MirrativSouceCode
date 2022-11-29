package bc;

import ac.n3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Genre;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes2.dex */
public final class v extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17495b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17496c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final n3 f17497a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_genre, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new v((n3) e10, null);
        }
    }

    public v(n3 n3Var) {
        super(n3Var.u());
        this.f17497a = n3Var;
    }

    public /* synthetic */ v(n3 n3Var, jo.h hVar) {
        this(n3Var);
    }

    public final void a(Genre genre) {
        jo.p.h(genre, "genre");
        e8.h hVar = new e8.h();
        hVar.transform(new v7.i(), new v7.y(16));
        if (c()) {
            this.f17497a.B.setVisibility(8);
            GlideApp.with(this.f17497a.u()).load(genre.getTextImageUrl()).into(this.f17497a.D);
            GlideApp.with(this.f17497a.u()).load(genre.getBannerSmallImageUrl()).apply((e8.a<?>) hVar).into(this.f17497a.C);
            return;
        }
        this.f17497a.C.setVisibility(8);
        GlideApp.with(this.f17497a.u()).load(genre.getTextImageUrl()).into(this.f17497a.D);
        GlideApp.with(this.f17497a.u()).load(genre.getBannerBigImageUrl()).apply((e8.a<?>) hVar).into(this.f17497a.B);
    }

    public final n3 b() {
        return this.f17497a;
    }

    public final boolean c() {
        return true;
    }
}
