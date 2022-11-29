package hb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.bcsvr.response.RankingUser;
import com.dena.mirrorman.net.glide.GlideApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class e2 extends RecyclerView.h<a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f34757a;

    /* renamed from: b  reason: collision with root package name */
    public final f2 f34758b;

    /* renamed from: c  reason: collision with root package name */
    public final List<RankingUser> f34759c;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final ImageView f34760a;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f34761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            jo.p.h(view, "view");
            View findViewById = view.findViewById(w1.I2);
            jo.p.g(findViewById, "view.findViewById(R.id.profile_image)");
            this.f34760a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(w1.frame_image);
            jo.p.g(findViewById2, "view.findViewById(R.id.frame_image)");
            this.f34761b = (ImageView) findViewById2;
        }

        public final ImageView a() {
            return this.f34761b;
        }

        public final ImageView b() {
            return this.f34760a;
        }
    }

    public e2(Context context, f2 f2Var) {
        jo.p.h(context, "context");
        jo.p.h(f2Var, "listener");
        this.f34757a = context;
        this.f34758b = f2Var;
        this.f34759c = new ArrayList();
    }

    public static final void c(RankingUser rankingUser, e2 e2Var, View view) {
        jo.p.h(rankingUser, "$user");
        jo.p.h(e2Var, "this$0");
        String userId = rankingUser.getUserId();
        if (userId != null) {
            e2Var.f34758b.a(userId);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(a aVar, int i10) {
        jo.p.h(aVar, "holder");
        if (i10 == 0) {
            aVar.a().setImageResource(v1.f34986p);
            aVar.a().setVisibility(0);
        } else if (i10 == 1) {
            aVar.a().setImageResource(v1.f34987q);
            aVar.a().setVisibility(0);
        } else if (i10 != 2) {
            aVar.a().setVisibility(8);
        } else {
            aVar.a().setImageResource(v1.f34988r);
            aVar.a().setVisibility(0);
        }
        final RankingUser rankingUser = this.f34759c.get(i10);
        if (rankingUser.getIconUrl() != null) {
            GlideApp.with(this.f34757a).load(rankingUser.getIconUrl()).placeholder(v1.R).circleCrop().into(aVar.b());
        }
        aVar.b().setOnClickListener(new View.OnClickListener() { // from class: hb.d2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e2.c(RankingUser.this, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f34757a).inflate(x1.item_ranking_user, viewGroup, false);
        jo.p.g(inflate, "view");
        return new a(inflate);
    }

    public final void f(List<RankingUser> list) {
        this.f34759c.clear();
        if (list != null) {
            this.f34759c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f34759c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return i10;
    }
}
