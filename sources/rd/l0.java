package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.p1;
import qf.r1;
import qf.w1;
import qf.x1;
import ud.a;
import ud.a2;
import ud.f2;
import ud.n2;
import ud.o2;
import ud.u1;
import yd.g1;

/* loaded from: classes2.dex */
public final class l0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends ud.a> f51177a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super String, wn.v> f51178b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super String, wn.v> f51179c;

    /* renamed from: d  reason: collision with root package name */
    public io.p<? super String, ? super View, wn.v> f51180d;

    /* renamed from: e  reason: collision with root package name */
    public io.a<wn.v> f51181e;

    /* renamed from: f  reason: collision with root package name */
    public io.l<? super u1, wn.v> f51182f;

    /* renamed from: g  reason: collision with root package name */
    public io.a<wn.v> f51183g;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a2 f51185x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a2 a2Var) {
            super(0);
            this.f51185x = a2Var;
        }

        public final void a() {
            io.l<String, wn.v> b10 = l0.this.b();
            if (b10 != null) {
                b10.invoke(this.f51185x.d());
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

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a2 f51187x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a2 a2Var) {
            super(0);
            this.f51187x = a2Var;
        }

        public final void a() {
            io.l<String, wn.v> a10 = l0.this.a();
            if (a10 != null) {
                a10.invoke(this.f51187x.d());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a2 f51189x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a2 a2Var) {
            super(1);
            this.f51189x = a2Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.p<String, View, wn.v> d10 = l0.this.d();
            if (d10 != null) {
                d10.invoke(this.f51189x.d(), view);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<wn.v> {
        public d() {
            super(0);
        }

        public final void a() {
            io.a<wn.v> c10 = l0.this.c();
            if (c10 != null) {
                c10.invoke();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ n2 f51192x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n2 n2Var) {
            super(1);
            this.f51192x = n2Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<u1, wn.v> f10 = l0.this.f();
            if (f10 != null) {
                f10.invoke(this.f51192x.b());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<wn.v> {
        public f() {
            super(0);
        }

        public final void a() {
            io.a<wn.v> g10 = l0.this.g();
            if (g10 != null) {
                g10.invoke();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public final io.l<String, wn.v> a() {
        return this.f51179c;
    }

    public final io.l<String, wn.v> b() {
        return this.f51178b;
    }

    public final io.a<wn.v> c() {
        return this.f51181e;
    }

    public final io.p<String, View, wn.v> d() {
        return this.f51180d;
    }

    public final io.l<u1, wn.v> f() {
        return this.f51182f;
    }

    public final io.a<wn.v> g() {
        return this.f51183g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51177a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51177a.get(i10).getType().ordinal();
    }

    public final void h(io.l<? super String, wn.v> lVar) {
        this.f51179c = lVar;
    }

    public final void i(io.l<? super String, wn.v> lVar) {
        this.f51178b = lVar;
    }

    public final void j(List<? extends ud.a> list) {
        jo.p.h(list, "value");
        this.f51177a = list;
        notifyDataSetChanged();
    }

    public final void k(io.a<wn.v> aVar) {
        this.f51181e = aVar;
    }

    public final void l(io.p<? super String, ? super View, wn.v> pVar) {
        this.f51180d = pVar;
    }

    public final void m(io.l<? super u1, wn.v> lVar) {
        this.f51182f = lVar;
    }

    public final void n(io.a<wn.v> aVar) {
        this.f51183g = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof p1) {
            ud.a aVar = this.f51177a.get(i10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveHistoryBindModel");
            a2 a2Var = (a2) aVar;
            ((p1) e0Var).c(a2Var, new a(a2Var), new b(a2Var), new c(a2Var));
        } else if (e0Var instanceof r1) {
            ud.a aVar2 = this.f51177a.get(i10);
            jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LoadingBindModel");
            ((r1) e0Var).a((f2) aVar2);
        } else if (e0Var instanceof qf.p) {
            ((qf.p) e0Var).a(new d());
        } else if (e0Var instanceof w1) {
            ud.a aVar3 = this.f51177a.get(i10);
            jo.p.f(aVar3, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.NextLiveAnnouncementBindModel");
            n2 n2Var = (n2) aVar3;
            View view = e0Var.itemView;
            jo.p.g(view, "holder.itemView");
            g1.a(view, new e(n2Var));
            ((w1) e0Var).b(n2Var, new f());
        } else if (e0Var instanceof x1) {
            ud.a aVar4 = this.f51177a.get(i10);
            jo.p.f(aVar4, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.NoContentsBindModel");
            ((x1) e0Var).a((o2) aVar4);
        } else {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.LIVE_HISTORY.ordinal()) {
            return p1.f49325b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.LOADING.ordinal()) {
            return r1.f49361b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.EDITABLE_NEXT_LIVE_ANNOUNCEMENT.ordinal()) {
            return qf.p.f49318b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.NEXT_LIVE_ANNOUNCEMENT.ordinal()) {
            return w1.f49417b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.NO_CONTENTS.ordinal()) {
            return x1.f49432b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
