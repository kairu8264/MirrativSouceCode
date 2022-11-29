package qf;

import ae.wh;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.GlideException;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes3.dex */
public final class m2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49296b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49297c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final wh f49298a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_ribbon, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m2((wh) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements e8.g<Drawable> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f49299w;

        public b(io.a<wn.v> aVar) {
            this.f49299w = aVar;
        }

        @Override // e8.g
        public boolean a(GlideException glideException, Object obj, f8.j<Drawable> jVar, boolean z10) {
            return false;
        }

        @Override // e8.g
        /* renamed from: b */
        public boolean h(Drawable drawable, Object obj, f8.j<Drawable> jVar, m7.a aVar, boolean z10) {
            this.f49299w.invoke();
            return false;
        }
    }

    public m2(wh whVar) {
        super(whVar.u());
        this.f49298a = whVar;
    }

    public /* synthetic */ m2(wh whVar, jo.h hVar) {
        this(whVar);
    }

    public final void a(String str, io.a<wn.v> aVar) {
        jo.p.h(aVar, "loadedListener");
        GlideApp.with(this.f49298a.B).load(str).listener((e8.g<Drawable>) new b(aVar)).into(this.f49298a.B);
    }
}
