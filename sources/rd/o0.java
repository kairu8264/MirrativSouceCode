package rd;

import ae.ce;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.ArrayList;
import java.util.List;
import nf.v;

/* loaded from: classes2.dex */
public final class o0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<v.a, wn.v> f51202a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<v.b, wn.v> f51203b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f51204c;

    /* loaded from: classes2.dex */
    public interface a {
        h a();
    }

    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final h f51205a;

        public b(h hVar) {
            jo.p.h(hVar, "viewType");
            this.f51205a = hVar;
        }

        @Override // rd.o0.a
        public h a() {
            return this.f51205a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a() == ((b) obj).a();
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "EmptyBindingModel(viewType=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final v.a f51206a;

        /* renamed from: b  reason: collision with root package name */
        public final h f51207b;

        public c(v.a aVar) {
            jo.p.h(aVar, "group");
            this.f51206a = aVar;
            this.f51207b = h.GROUP;
        }

        @Override // rd.o0.a
        public h a() {
            return this.f51207b;
        }

        public final v.a b() {
            return this.f51206a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f51206a, ((c) obj).f51206a);
        }

        public int hashCode() {
            return this.f51206a.hashCode();
        }

        public String toString() {
            return "GroupBindingModel(group=" + this.f51206a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.e0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(nd.b1.view_holder_friend_only_stream_recent_chat, viewGroup, false));
            jo.p.h(viewGroup, "parent");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.e0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(nd.b1.view_holder_friend_only_stream_follower, viewGroup, false));
            jo.p.h(viewGroup, "parent");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements a {

        /* renamed from: a  reason: collision with root package name */
        public final v.b f51208a;

        /* renamed from: b  reason: collision with root package name */
        public final h f51209b;

        public f(v.b bVar) {
            jo.p.h(bVar, MRLog.TARGET_TYPE_USER);
            this.f51208a = bVar;
            this.f51209b = h.USER;
        }

        @Override // rd.o0.a
        public h a() {
            return this.f51209b;
        }

        public final v.b b() {
            return this.f51208a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f51208a, ((f) obj).f51208a);
        }

        public int hashCode() {
            return this.f51208a.hashCode();
        }

        public String toString() {
            return "UserBindingModel(user=" + this.f51208a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public ce f51210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(nd.b1.view_holder_friend_only_stream_user, viewGroup, false));
            jo.p.h(viewGroup, "parent");
            this.f51210a = ce.T(this.itemView);
        }

        public final void a(c cVar) {
            jo.p.h(cVar, "bindingModel");
            if (cVar.b().b()) {
                this.f51210a.B.setImageResource(nd.y0.ic_checkbox_checked);
            } else {
                this.f51210a.B.setImageResource(nd.y0.ic_checkbox_default);
            }
            this.f51210a.D.d(cVar.b().a().getImageUrls(), nd.x0.size32dp);
            this.f51210a.E.setText(cVar.b().a().getName());
            this.f51210a.C.setVisibility(0);
            AppCompatTextView appCompatTextView = this.f51210a.C;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(cVar.b().a().getUserNum());
            sb2.append(')');
            appCompatTextView.setText(sb2.toString());
        }

        public final void b(f fVar) {
            jo.p.h(fVar, "bindingModel");
            if (fVar.b().b()) {
                this.f51210a.B.setImageResource(nd.y0.ic_checkbox_checked);
            } else {
                this.f51210a.B.setImageResource(nd.y0.ic_checkbox_default);
            }
            this.f51210a.D.d(xn.r.d(fVar.b().a().getProfileImageUrl()), nd.x0.size32dp);
            this.f51210a.E.setText(fVar.b().a().getName());
        }
    }

    /* loaded from: classes2.dex */
    public enum h {
        RECENT_CHAT_TITLE,
        GROUP,
        FOLLOWER_TITLE,
        USER
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(io.l<? super v.a, wn.v> lVar, io.l<? super v.b, wn.v> lVar2) {
        jo.p.h(lVar, "groupItemClickListener");
        jo.p.h(lVar2, "userItemClickListener");
        this.f51202a = lVar;
        this.f51203b = lVar2;
        this.f51204c = new ArrayList();
    }

    public static final void c(o0 o0Var, f fVar, View view) {
        jo.p.h(o0Var, "this$0");
        jo.p.h(fVar, "$model");
        o0Var.f51203b.invoke(fVar.b());
    }

    public static final void d(o0 o0Var, c cVar, View view) {
        jo.p.h(o0Var, "this$0");
        jo.p.h(cVar, "$model");
        o0Var.f51202a.invoke(cVar.b());
    }

    public final void f(List<v.a> list, List<v.b> list2) {
        jo.p.h(list, "groups");
        jo.p.h(list2, "users");
        this.f51204c.clear();
        if (!list.isEmpty()) {
            this.f51204c.add(new b(h.RECENT_CHAT_TITLE));
            for (v.a aVar : list) {
                this.f51204c.add(new c(aVar));
            }
        }
        if (!list2.isEmpty()) {
            this.f51204c.add(new b(h.FOLLOWER_TITLE));
            for (v.b bVar : list2) {
                this.f51204c.add(new f(bVar));
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51204c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51204c.get(i10).a().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "viewholder");
        if (e0Var instanceof g) {
            if (this.f51204c.get(i10) instanceof f) {
                a aVar = this.f51204c.get(i10);
                jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrorman.adapter.LivePrepareForFriendAdapter.UserBindingModel");
                final f fVar = (f) aVar;
                ((g) e0Var).b(fVar);
                e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rd.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        o0.c(o0.this, fVar, view);
                    }
                });
                return;
            }
            a aVar2 = this.f51204c.get(i10);
            jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrorman.adapter.LivePrepareForFriendAdapter.GroupBindingModel");
            final c cVar = (c) aVar2;
            ((g) e0Var).a(cVar);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rd.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o0.d(o0.this, cVar, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == h.RECENT_CHAT_TITLE.ordinal()) {
            return new e(viewGroup);
        }
        if (i10 == h.FOLLOWER_TITLE.ordinal()) {
            return new d(viewGroup);
        }
        if (i10 != h.GROUP.ordinal() && i10 != h.USER.ordinal()) {
            throw new IllegalArgumentException("unknown view holder");
        }
        return new g(viewGroup);
    }
}
