package bc;

import ac.j3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Singer;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0110a f17249b = new C0110a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17250c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final j3 f17251a;

    /* renamed from: bc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0110a {
        public C0110a() {
        }

        public /* synthetic */ C0110a(jo.h hVar) {
            this();
        }

        public final a a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_artist_icon, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new a((j3) e10, null);
        }
    }

    public a(j3 j3Var) {
        super(j3Var.u());
        this.f17251a = j3Var;
    }

    public /* synthetic */ a(j3 j3Var, jo.h hVar) {
        this(j3Var);
    }

    public final void a(Singer singer) {
        jo.p.h(singer, "singer");
        this.f17251a.C.setText(singer.getName());
    }

    public final void b(Singer singer) {
        jo.p.h(singer, "singer");
        a(singer);
        Context context = this.f17251a.u().getContext();
        jo.p.g(context, "binding.root.context");
        this.f17251a.u().setPadding(of.t.b(context, 10), 0, 0, 0);
    }

    public final void c(Singer singer) {
        jo.p.h(singer, "singer");
        a(singer);
        Context context = this.f17251a.u().getContext();
        jo.p.g(context, "binding.root.context");
        this.f17251a.u().setPadding(0, 0, of.t.b(context, 10), 0);
    }

    public final j3 d() {
        return this.f17251a;
    }
}
