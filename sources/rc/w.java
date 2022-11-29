package rc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.a;
import ud.f2;
import ud.g2;

/* loaded from: classes2.dex */
public final class w extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends ud.a> f51059a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f51060b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f51061c;

    /* renamed from: d  reason: collision with root package name */
    public io.a<wn.v> f51062d;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f51064x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(0);
            this.f51064x = i10;
        }

        public final void a() {
            io.l<Integer, wn.v> c10 = w.this.c();
            if (c10 != null) {
                c10.invoke(Integer.valueOf(this.f51064x));
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {
        public b() {
            super(0);
        }

        public final void a() {
            io.a<wn.v> b10 = w.this.b();
            if (b10 != null) {
                b10.invoke();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public static final void d(w wVar, int i10, View view) {
        jo.p.h(wVar, "this$0");
        io.l<? super Integer, wn.v> lVar = wVar.f51060b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
    }

    public final io.a<wn.v> b() {
        return this.f51062d;
    }

    public final io.l<Integer, wn.v> c() {
        return this.f51061c;
    }

    public final void f(io.a<wn.v> aVar) {
        this.f51062d = aVar;
    }

    public final void g(io.l<? super Integer, wn.v> lVar) {
        this.f51061c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51059a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51059a.get(i10).getType().ordinal();
    }

    public final void h(io.l<? super Integer, wn.v> lVar) {
        this.f51060b = lVar;
    }

    public final void i(List<? extends ud.a> list) {
        jo.p.h(list, "value");
        this.f51059a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof tc.o1) {
            ud.a aVar = this.f51059a.get(i10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.chat.bindmodel.MyChatThreadBindModel");
            ((tc.o1) e0Var).b((uc.b) aVar, new a(i10));
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rc.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w.d(w.this, i10, view);
                }
            });
        } else if (e0Var instanceof tc.p1) {
        } else {
            if (e0Var instanceof tc.l1) {
                ((tc.l1) e0Var).a(new b());
            } else if (e0Var instanceof tc.q1) {
                ((tc.q1) e0Var).a();
            } else if (e0Var instanceof qf.r1) {
                ud.a aVar2 = this.f51059a.get(i10);
                jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LoadingBindModel");
                ((qf.r1) e0Var).a((f2) aVar2);
            } else if (e0Var instanceof qf.s1) {
                ud.a aVar3 = this.f51059a.get(i10);
                jo.p.f(aVar3, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.MessageBindModel");
                ((qf.s1) e0Var).a((g2) aVar3);
            } else {
                throw new IllegalArgumentException("unknown view holder " + e0Var);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.MY_CHAT_THREAD.ordinal()) {
            return tc.o1.f53556b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.MY_CHAT_TUTORIAL.ordinal()) {
            return tc.p1.f53561a.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.MY_CHAT_REQUEST_CONFIRMATION.ordinal()) {
            return tc.l1.f53540b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.MY_CHAT_UNDERAGE_UNAVAILABLE.ordinal()) {
            return tc.q1.f53564b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.LOADING.ordinal()) {
            return qf.r1.f49361b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.MESSAGE.ordinal()) {
            return qf.s1.f49375b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        super.onViewRecycled(e0Var);
        if (e0Var instanceof tc.l1) {
            ((tc.l1) e0Var).b().e();
        } else if (e0Var instanceof tc.q1) {
            ((tc.q1) e0Var).b().e();
        }
    }
}
