package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends ud.a> f51099a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.a<wn.v> f51100b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f51101c;

    public static final void c(c cVar, int i10, View view) {
        jo.p.h(cVar, "this$0");
        io.l<? super Integer, wn.v> lVar = cVar.f51101c;
        if (lVar != null) {
            List<? extends ud.a> list = cVar.f51099a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ud.a) obj).getType() == a.EnumC0862a.APP) {
                    arrayList.add(obj);
                }
            }
            lVar.invoke(Integer.valueOf(arrayList.indexOf(cVar.f51099a.get(i10))));
        }
    }

    public static final void d(c cVar, View view) {
        jo.p.h(cVar, "this$0");
        io.a<wn.v> aVar = cVar.f51100b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void f(io.a<wn.v> aVar) {
        this.f51100b = aVar;
    }

    public final void g(io.l<? super Integer, wn.v> lVar) {
        this.f51101c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51099a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51099a.get(i10).getType().ordinal();
    }

    public final void h(List<? extends ud.a> list) {
        jo.p.h(list, "value");
        this.f51099a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.d) {
            ud.a aVar = this.f51099a.get(i10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.AppBindModel");
            ((qf.d) e0Var).a((ud.c) aVar);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rd.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.c(c.this, i10, view);
                }
            });
        } else if (e0Var instanceof qf.a) {
            ud.a aVar2 = this.f51099a.get(i10);
            jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.AddToMyAppBindModel");
            ((qf.a) e0Var).a((ud.b) aVar2);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rd.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.d(c.this, view);
                }
            });
        } else {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.APP.ordinal()) {
            return qf.d.f49094b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.ADD_TO_MY_APP.ordinal()) {
            return qf.a.f49019b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
