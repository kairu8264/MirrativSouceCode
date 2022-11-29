package bc;

import ac.l3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Singer;
import java.util.List;

/* loaded from: classes2.dex */
public final class j extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17361b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17362c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final l3 f17363a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_artists, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new j((l3) e10, null);
        }
    }

    public j(l3 l3Var) {
        super(l3Var.u());
        this.f17363a = l3Var;
    }

    public /* synthetic */ j(l3 l3Var, jo.h hVar) {
        this(l3Var);
    }

    public final void a(List<Singer> list, io.l<? super Singer, wn.v> lVar) {
        jo.p.h(list, "artists");
        jo.p.h(lVar, "onClickSinger");
        this.f17363a.B.setAdapter(new c(list, lVar));
    }
}
