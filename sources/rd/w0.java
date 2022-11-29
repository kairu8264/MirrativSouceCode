package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.m2;

/* loaded from: classes2.dex */
public final class w0 extends RecyclerView.h<m2> {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f51246a;

    /* renamed from: b  reason: collision with root package name */
    public io.p<? super Integer, ? super View, wn.v> f51247b;

    /* renamed from: c  reason: collision with root package name */
    public io.p<? super Integer, ? super View, wn.v> f51248c;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f51250x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m2 f51251y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, m2 m2Var) {
            super(0);
            this.f51250x = i10;
            this.f51251y = m2Var;
        }

        public final void a() {
            io.p<Integer, View, wn.v> b10 = w0.this.b();
            if (b10 != null) {
                Integer valueOf = Integer.valueOf(this.f51250x);
                View view = this.f51251y.itemView;
                jo.p.g(view, "holder.itemView");
                b10.invoke(valueOf, view);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public w0(List<String> list) {
        jo.p.h(list, "ribbonImageUrls");
        this.f51246a = list;
    }

    public static final void d(w0 w0Var, int i10, m2 m2Var, View view) {
        jo.p.h(w0Var, "this$0");
        jo.p.h(m2Var, "$holder");
        io.p<? super Integer, ? super View, wn.v> pVar = w0Var.f51247b;
        if (pVar != null) {
            Integer valueOf = Integer.valueOf(i10);
            View view2 = m2Var.itemView;
            jo.p.g(view2, "holder.itemView");
            pVar.invoke(valueOf, view2);
        }
    }

    public final io.p<Integer, View, wn.v> b() {
        return this.f51248c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(final m2 m2Var, final int i10) {
        jo.p.h(m2Var, "holder");
        m2Var.a(this.f51246a.get(i10), new a(i10, m2Var));
        m2Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rd.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w0.d(w0.this, i10, m2Var, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public m2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return m2.f49296b.a(viewGroup);
    }

    public final void g(io.p<? super Integer, ? super View, wn.v> pVar) {
        this.f51248c = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51246a.size();
    }

    public final void h(io.p<? super Integer, ? super View, wn.v> pVar) {
        this.f51247b = pVar;
    }
}
