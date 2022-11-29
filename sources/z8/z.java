package z8;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import t8.y1;

/* loaded from: classes.dex */
public final class z extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62788b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f62789c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final y1 f62790a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            y1 T = y1.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new z(T, null);
        }
    }

    public z(y1 y1Var) {
        super(y1Var.u());
        this.f62790a = y1Var;
    }

    public /* synthetic */ z(y1 y1Var, jo.h hVar) {
        this(y1Var);
    }

    public final void a(y yVar) {
        jo.p.h(yVar, "bindModel");
        GlideApp.with(this.f62790a.B).load(yVar.a()).apply((e8.a<?>) e8.h.bitmapTransform(new v7.y(de.m.a(this, 10)))).into(this.f62790a.B);
        this.f62790a.C.setVisibility(yVar.b() ? 0 : 8);
    }
}
