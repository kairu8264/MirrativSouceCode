package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import hf.c;
import r8.f1;
import r8.g1;

/* loaded from: classes.dex */
public final class l extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18957c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18958d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.g0 f18959a;

    /* renamed from: b  reason: collision with root package name */
    public c.a f18960b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_app_myapp, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new l((t8.g0) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, wn.v> f18962x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super String, wn.v> lVar) {
            super(1);
            this.f18962x = lVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            c.a aVar = l.this.f18960b;
            jo.p.e(aVar);
            String d10 = aVar.d();
            if (l.this.f18959a.E.getVisibility() == 0) {
                d10 = "";
            }
            io.l<String, wn.v> lVar = this.f18962x;
            if (lVar != null) {
                lVar.invoke(d10);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public l(t8.g0 g0Var) {
        super(g0Var.u());
        this.f18959a = g0Var;
    }

    public /* synthetic */ l(t8.g0 g0Var, jo.h hVar) {
        this(g0Var);
    }

    public final void c(c.a aVar, String str, io.l<? super String, wn.v> lVar) {
        jo.p.h(aVar, "item");
        this.f18960b = aVar;
        ImageView imageView = this.f18959a.D;
        jo.p.g(imageView, "binding.iconImageView");
        td.a.k(imageView, aVar.e(), 0, 4, null);
        this.f18959a.B.setText(aVar.g());
        if (str != null && so.n.q(str, aVar.d(), true)) {
            this.f18959a.E.setImageResource(g1.f49910b);
            this.f18959a.E.setVisibility(0);
        } else {
            this.f18959a.E.setVisibility(8);
        }
        LinearLayout linearLayout = this.f18959a.C;
        jo.p.g(linearLayout, "binding.base");
        yd.g1.a(linearLayout, new b(lVar));
    }
}
