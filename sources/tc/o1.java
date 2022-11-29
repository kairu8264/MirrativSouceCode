package tc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import pc.c3;

/* loaded from: classes2.dex */
public final class o1 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f53556b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f53557c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final c3 f53558a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o1 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nc.f.view_holder_my_chat_thread, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new o1((c3) e10, null);
        }
    }

    public o1(c3 c3Var) {
        super(c3Var.u());
        this.f53558a = c3Var;
    }

    public /* synthetic */ o1(c3 c3Var, jo.h hVar) {
        this(c3Var);
    }

    public static final void c(io.a aVar, View view) {
        jo.p.h(aVar, "$onClickIcon");
        aVar.invoke();
    }

    public final void b(uc.b bVar, final io.a<wn.v> aVar) {
        jo.p.h(bVar, "bindModel");
        jo.p.h(aVar, "onClickIcon");
        this.f53558a.E.d(bVar.b(), nc.c.size40dp);
        this.f53558a.T(bVar);
        this.f53558a.E.setOnClickListener(new View.OnClickListener() { // from class: tc.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o1.c(io.a.this, view);
            }
        });
        this.f53558a.o();
    }
}
