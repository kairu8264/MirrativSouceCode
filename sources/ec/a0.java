package ec;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ud.d4;
import ud.m4;
import ud.n4;
import ud.o4;
import ud.p4;
import ud.q4;
import ud.t4;
import ud.u4;
import yd.g1;

/* loaded from: classes2.dex */
public final class a0 extends androidx.recyclerview.widget.t<d4, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f30396c;

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
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            View.OnClickListener g10 = a0.this.g();
            if (g10 != null) {
                g10.onClick(view);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public a0() {
        super(new a());
    }

    public final View.OnClickListener g() {
        return this.f30396c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(View.OnClickListener onClickListener) {
        this.f30396c = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        View view = e0Var.itemView;
        jo.p.g(view, "holder.itemView");
        g1.a(view, new b());
        if (e0Var instanceof m) {
            d4 b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentTextBindModel");
            ((m) e0Var).a((t4) b10);
        } else if (e0Var instanceof b0) {
            d4 b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentCollabRequestBindModel");
            ((b0) e0Var).a((m4) b11);
        } else if (e0Var instanceof i) {
            d4 b12 = b(i10);
            jo.p.f(b12, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentGiftBindModel");
            ((i) e0Var).a((p4) b12);
        } else if (e0Var instanceof h) {
            d4 b13 = b(i10);
            jo.p.f(b13, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentEventNoticeBindModel");
            ((h) e0Var).a((o4) b13);
        } else if (e0Var instanceof k) {
            d4 b14 = b(i10);
            jo.p.f(b14, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentLiveLinkedBindModel");
            ((k) e0Var).a((q4) b14);
        } else if (e0Var instanceof l) {
            d4 b15 = b(i10);
            jo.p.f(b15, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentUrlSharedBindModel");
            ((l) e0Var).a((u4) b15);
        } else if (e0Var instanceof g) {
            d4 b16 = b(i10);
            jo.p.f(b16, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StreamingLiveCommentEndBindModel");
            ((g) e0Var).a((n4) b16);
        } else if (e0Var instanceof j) {
            d4 b17 = b(i10);
            jo.p.g(b17, "getItem(position)");
            ((j) e0Var).a(b17);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return i10 == d4.a.VIEW_TYPE_TEXT.ordinal() ? m.f30436b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_COLLAB_REQUEST.ordinal() ? b0.f30400b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_GIFT.ordinal() ? i.f30424b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_EVENT_NOTICE.ordinal() ? h.f30421b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_LIVE_LINKED.ordinal() ? k.f30430b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_URL_SHARED.ordinal() ? l.f30433b.a(viewGroup) : i10 == d4.a.VIEW_TYPE_END.ordinal() ? g.f30420a.a(viewGroup) : j.f30427b.a(viewGroup);
    }
}
