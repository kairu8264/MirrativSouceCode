package ec;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import qf.f3;
import ud.d4;
import ud.e4;
import ud.g4;
import ud.i4;
import ud.j4;
import ud.l4;
import ud.m4;
import ud.o4;
import ud.p4;
import ud.q4;
import ud.t4;
import ud.u4;
import xb.d0;

/* loaded from: classes2.dex */
public final class e extends androidx.recyclerview.widget.t<d4, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public b f30407c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<d4> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(d4 d4Var, d4 d4Var2) {
            jo.p.h(d4Var, "oldItem");
            jo.p.h(d4Var2, "newItem");
            return d4Var == d4Var2;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(d4 d4Var, d4 d4Var2) {
            jo.p.h(d4Var, "oldItem");
            jo.p.h(d4Var2, "newItem");
            return jo.p.c(d4Var, d4Var2);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void f(String str);

        void g(String str);

        void h(String str);
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<String, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f30409x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d4 d4Var) {
            super(1);
            this.f30409x = d4Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = e.this.f30407c;
            if (bVar != null) {
                bVar.f(this.f30409x.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<String, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d4 f30411x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d4 d4Var) {
            super(1);
            this.f30411x = d4Var;
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = e.this.f30407c;
            if (bVar != null) {
                bVar.c(this.f30411x.a());
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* renamed from: ec.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0301e extends jo.q implements io.l<String, wn.v> {
        public C0301e() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = e.this.f30407c;
            if (bVar != null) {
                bVar.d(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<String, wn.v> {
        public f() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "it");
            b bVar = e.this.f30407c;
            if (bVar != null) {
                bVar.b(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    public e() {
        super(new a());
    }

    public static final void l(e eVar, d4 d4Var, View view) {
        jo.p.h(eVar, "this$0");
        b bVar = eVar.f30407c;
        if (bVar != null) {
            bVar.a(((q4) d4Var).i());
        }
    }

    public static final void m(e eVar, d4 d4Var, View view) {
        jo.p.h(eVar, "this$0");
        b bVar = eVar.f30407c;
        if (bVar != null) {
            bVar.h(d4Var.e());
        }
    }

    public static final void n(e eVar, d4 d4Var, View view) {
        jo.p.h(eVar, "this$0");
        b bVar = eVar.f30407c;
        if (bVar != null) {
            bVar.g(d4Var.e());
        }
    }

    public static final void o(e eVar, d4 d4Var, View view) {
        jo.p.h(eVar, "this$0");
        b bVar = eVar.f30407c;
        if (bVar != null) {
            bVar.g(d4Var.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "viewHolder");
        final d4 b10 = b(i10);
        e0Var.itemView.setOnClickListener(null);
        if (e0Var instanceof f3) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentTextBindModel");
            ((f3) e0Var).a((t4) b10);
        } else if (e0Var instanceof ec.f) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabRequestBindModel");
            ((ec.f) e0Var).a((m4) b10);
        } else if (e0Var instanceof qf.n) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentUrlSharedBindModel");
            ((qf.n) e0Var).a((u4) b10);
        } else if (e0Var instanceof qf.m) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentLiveLinkedBindModel");
            ((qf.m) e0Var).a((q4) b10);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: ec.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.l(e.this, b10, view);
                }
            });
        } else if (e0Var instanceof qf.j) {
            jo.p.g(b10, "liveComment");
            ((qf.j) e0Var).a(b10);
            if (xn.s.m(1, 3, 4).contains(Integer.valueOf(b10.d()))) {
                e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: ec.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        e.m(e.this, b10, view);
                    }
                });
            }
        } else if (e0Var instanceof qf.l) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentGiftBindModel");
            qf.l.c((qf.l) e0Var, (p4) b10, null, 2, null);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: ec.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.n(e.this, b10, view);
                }
            });
        } else if (e0Var instanceof qf.k) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentEventNoticeBindModel");
            ((qf.k) e0Var).b((o4) b10);
        } else if (e0Var instanceof qf.h) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentAppUsedIdBindModel");
            qf.h.d((qf.h) e0Var, (e4) b10, xb.l.f59945q, xb.n.rectangle_corner12_blackthree80, new c(b10), new d(b10), null, 32, null);
        } else if (e0Var instanceof qf.i) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentBotCommentBindModel");
            ((qf.i) e0Var).b((g4) b10);
        } else if (e0Var instanceof d0) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabRecommendLiveBindModel");
            ((d0) e0Var).b((l4) b10, new C0301e());
        } else if (e0Var instanceof xb.z) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabLiveGiftBindModel");
            ((xb.z) e0Var).a((j4) b10);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: ec.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.o(e.this, b10, view);
                }
            });
        } else if (e0Var instanceof xb.b0) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabEndBindModel");
            ((xb.b0) e0Var).b((i4) b10, new f());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "viewGroup");
        return i10 == d4.a.VIEW_TYPE_TEXT.ordinal() ? f3.f49153b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_REQUEST.ordinal() ? ec.f.f30414b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_EVENT_NOTICE.ordinal() ? qf.k.f49255b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_GIFT.ordinal() ? qf.l.f49273b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_APP_USED_ID.ordinal() ? qf.h.f49175b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_LIVE_LINKED.ordinal() ? qf.m.f49289b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_SHARE_URL_REQUEST.ordinal() ? qf.n.f49300b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_BOT.ordinal() ? qf.i.f49210x.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_RECOMMEND_LIVE.ordinal() ? d0.f59871b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_LIVE_GIFT.ordinal() ? xb.z.f60120b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_END.ordinal() ? xb.b0.f59864b.a(viewGroup) : qf.j.f49234x.a(viewGroup);
    }

    public final void p(b bVar) {
        jo.p.h(bVar, "listener");
        this.f30407c = bVar;
    }
}
