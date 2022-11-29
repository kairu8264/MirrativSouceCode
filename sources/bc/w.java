package bc;

import ac.p3;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Genre;
import java.util.List;

/* loaded from: classes2.dex */
public final class w extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17501b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17502c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final p3 f17503a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: bc.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0112a extends RecyclerView.o {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p3 f17504a;

            public C0112a(p3 p3Var) {
                this.f17504a = p3Var;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.o
            public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
                jo.p.h(rect, "outRect");
                jo.p.h(view, "view");
                jo.p.h(recyclerView, "parent");
                jo.p.h(b0Var, "state");
                Resources resources = this.f17504a.u().getResources();
                int i10 = xb.m.tab_margin_horizontal;
                rect.left = resources.getDimensionPixelOffset(i10);
                rect.right = resources.getDimensionPixelOffset(i10);
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.item_emokara_genres, viewGroup, false);
            p3 p3Var = (p3) e10;
            p3Var.B.g(new C0112a(p3Var));
            jo.p.g(e10, "inflate<ItemEmokaraGenre…          )\n            }");
            return new w(p3Var, null);
        }
    }

    public w(p3 p3Var) {
        super(p3Var.u());
        this.f17503a = p3Var;
    }

    public /* synthetic */ w(p3 p3Var, jo.h hVar) {
        this(p3Var);
    }

    public final void a(List<Genre> list, io.l<? super Genre, wn.v> lVar) {
        jo.p.h(list, "genreList");
        jo.p.h(lVar, "onSelectGenre");
        this.f17503a.B.setAdapter(new u(list, lVar));
    }
}
