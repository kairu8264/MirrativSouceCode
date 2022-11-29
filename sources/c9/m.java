package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import hf.c;
import r8.f1;
import r8.g1;

/* loaded from: classes.dex */
public final class m extends RecyclerView.e0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18963c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f18964d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.g0 f18965a;

    /* renamed from: b  reason: collision with root package name */
    public c.a f18966b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), f1.view_app_myapp, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new m((t8.g0) e10, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<c.a, wn.v> f18968x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(io.l<? super c.a, wn.v> lVar) {
            super(1);
            this.f18968x = lVar;
        }

        public final void a(View view) {
            io.l<c.a, wn.v> lVar;
            jo.p.h(view, "it");
            c.a aVar = m.this.f18966b;
            if (aVar == null || (lVar = this.f18968x) == null) {
                return;
            }
            lVar.invoke(aVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<c.a, wn.v> f18970x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(io.l<? super c.a, wn.v> lVar) {
            super(1);
            this.f18970x = lVar;
        }

        public final void a(View view) {
            io.l<c.a, wn.v> lVar;
            jo.p.h(view, "it");
            c.a aVar = m.this.f18966b;
            if (aVar == null || (lVar = this.f18970x) == null) {
                return;
            }
            lVar.invoke(aVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public m(t8.g0 g0Var) {
        super(g0Var.u());
        this.f18965a = g0Var;
    }

    public /* synthetic */ m(t8.g0 g0Var, jo.h hVar) {
        this(g0Var);
    }

    public final void b(c.a aVar, io.l<? super c.a, wn.v> lVar, io.l<? super c.a, wn.v> lVar2) {
        jo.p.h(aVar, "item");
        this.f18966b = aVar;
        ImageView imageView = this.f18965a.D;
        jo.p.g(imageView, "binding.iconImageView");
        td.a.k(imageView, aVar.e(), 0, 4, null);
        this.f18965a.B.setText(aVar.g());
        if (aVar.h()) {
            this.f18965a.E.setImageResource(g1.f49910b);
        } else {
            this.f18965a.E.setImageResource(g1.f49909a);
        }
        ImageButton imageButton = this.f18965a.E;
        jo.p.g(imageButton, "binding.registerButton");
        yd.g1.a(imageButton, new b(lVar));
        LinearLayout linearLayout = this.f18965a.C;
        jo.p.g(linearLayout, "binding.base");
        yd.g1.a(linearLayout, new c(lVar2));
    }
}
