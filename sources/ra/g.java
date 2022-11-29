package ra;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import com.dena.mirrorman.net.api.response.notice.CampaignNotice;
import jf.g0;

/* loaded from: classes2.dex */
public final class g extends t<CampaignNotice, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final b f50603c;

    /* renamed from: d  reason: collision with root package name */
    public final g0 f50604d;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<CampaignNotice> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(CampaignNotice campaignNotice, CampaignNotice campaignNotice2) {
            jo.p.h(campaignNotice, "oldItem");
            jo.p.h(campaignNotice2, "newItem");
            return jo.p.c(campaignNotice, campaignNotice2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(CampaignNotice campaignNotice, CampaignNotice campaignNotice2) {
            jo.p.h(campaignNotice, "oldItem");
            jo.p.h(campaignNotice2, "newItem");
            return campaignNotice.getId() == campaignNotice2.getId();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(CampaignNotice campaignNotice);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, g0 g0Var) {
        super(new a());
        jo.p.h(bVar, "listener");
        jo.p.h(g0Var, "page");
        this.f50603c = bVar;
        this.f50604d = g0Var;
    }

    public static final void h(g gVar, int i10, View view) {
        jo.p.h(gVar, "this$0");
        b bVar = gVar.f50603c;
        CampaignNotice b10 = gVar.b(i10);
        jo.p.g(b10, "getItem(position)");
        bVar.a(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof h) {
            CampaignNotice b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((h) e0Var).a(b10);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: ra.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.h(g.this, i10, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return h.f50605b.a(viewGroup);
    }
}
