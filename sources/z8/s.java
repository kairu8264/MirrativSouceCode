package z8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.mission.MissionItemView;
import com.dena.mirrorman.net.api.response.MissionCategoryDescription;
import com.dena.mirrorman.net.api.response.MissionCategorySpecial;
import com.dena.mirrorman.net.api.response.MissionSpecial;
import java.util.ArrayList;
import java.util.List;
import r8.b1;
import r8.d1;
import t8.m1;

/* loaded from: classes.dex */
public final class s extends RecyclerView.e0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62756d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f62757e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final m1 f62758a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.recyclerview.widget.s f62759b;

    /* renamed from: c  reason: collision with root package name */
    public int f62760c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            m1 T = m1.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new s(T);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62761a;

        static {
            int[] iArr = new int[j.values().length];
            iArr[j.DAILY.ordinal()] = 1;
            iArr[j.WEEKLY.ordinal()] = 2;
            f62761a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends RecyclerView.u {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List<MissionSpecial> f62763b;

        public c(List<MissionSpecial> list) {
            this.f62763b = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            if (s.this.f62760c == s.this.g()) {
                return;
            }
            s sVar = s.this;
            sVar.f62760c = sVar.g();
            s.this.j(this.f62763b);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<Integer, wn.v> {
        public d() {
            super(1);
        }

        public final void a(int i10) {
            s.this.h().R.x1(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m1 m1Var) {
        super(m1Var.u());
        jo.p.h(m1Var, "binding");
        this.f62758a = m1Var;
        this.f62759b = new androidx.recyclerview.widget.s();
    }

    public final void f(j jVar, t tVar, androidx.lifecycle.u uVar, io.l<? super Integer, wn.v> lVar, io.l<? super Integer, wn.v> lVar2, io.l<? super g, wn.v> lVar3) {
        int i10;
        int i11;
        jo.p.h(jVar, "period");
        jo.p.h(tVar, "missionTabItem");
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(lVar, "onClickFirstMissionGetButton");
        jo.p.h(lVar2, "onClickSpecialMissionGetButton");
        jo.p.h(lVar3, "onClickRewardDetail");
        int i12 = b.f62761a[jVar.ordinal()];
        if (i12 == 1) {
            this.f62758a.S.setImageResource(d1.img_daily_bottom_arrow);
            this.f62758a.G.setAlpha(0.4f);
        } else if (i12 == 2) {
            this.f62758a.S.setImageResource(d1.img_weehly_bottom_arrow);
            this.f62758a.G.setAlpha(1.0f);
        }
        this.f62758a.I.setText(tVar.d());
        if (jo.p.c(tVar.e(), g.f62670n.a(t.f62765h.d()))) {
            this.f62758a.J.setVisibility(8);
            i10 = 0;
            i11 = 8;
        } else {
            this.f62758a.J.setVisibility(0);
            MissionItemView missionItemView = this.f62758a.J;
            jo.p.g(missionItemView, "binding.missionItemView");
            i10 = 0;
            i11 = 8;
            missionItemView.c(tVar.e(), false, uVar, lVar, (r16 & 16) != 0 ? null : lVar3, (r16 & 32) != 0 ? null : null);
        }
        if ((tVar.a().length() == 0 ? 1 : i10) != 0) {
            this.f62758a.C.setVisibility(i11);
        } else {
            this.f62758a.C.setVisibility(i10);
            this.f62758a.C.setText(tVar.a());
        }
        if (tVar.b().isEmpty()) {
            this.f62758a.D.setVisibility(i11);
        } else {
            this.f62758a.D.setVisibility(i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (MissionCategoryDescription missionCategoryDescription : tVar.b()) {
                spannableStringBuilder.append((CharSequence) missionCategoryDescription.getText());
                int length = spannableStringBuilder.length() - missionCategoryDescription.getText().length();
                int length2 = spannableStringBuilder.length();
                if (missionCategoryDescription.isBold()) {
                    spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
                }
                if (missionCategoryDescription.isHighlighted()) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(this.itemView.getContext(), b1.f49833b)), length, length2, 33);
                }
            }
            this.f62758a.D.setText(spannableStringBuilder);
        }
        if (tVar.f()) {
            this.f62758a.M.setAlpha(1.0f);
            this.f62758a.N.setAlpha(1.0f);
        } else {
            this.f62758a.M.setAlpha(0.3f);
            this.f62758a.N.setAlpha(0.3f);
        }
        i(tVar, uVar, lVar2, lVar3);
    }

    public final int g() {
        View h10;
        RecyclerView.p layoutManager = this.f62758a.R.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (h10 = this.f62759b.h(linearLayoutManager)) == null) {
            return 0;
        }
        return linearLayoutManager.o0(h10);
    }

    public final m1 h() {
        return this.f62758a;
    }

    public final void i(t tVar, androidx.lifecycle.u uVar, io.l<? super Integer, wn.v> lVar, io.l<? super g, wn.v> lVar2) {
        MissionCategorySpecial c10 = tVar.c();
        List<MissionSpecial> missions = c10 != null ? c10.getMissions() : null;
        if (missions == null || missions.isEmpty()) {
            this.f62758a.P.setVisibility(8);
            return;
        }
        this.f62758a.P.setVisibility(0);
        RecyclerView recyclerView = this.f62758a.R;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        recyclerView.setAdapter(new w(uVar, lVar, lVar2));
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            recyclerView.d1(i10);
        }
        jo.p.g(recyclerView, "");
        recyclerView.g(new p001if.c(de.n.b(recyclerView, 10), de.n.b(recyclerView, 24), 0, de.n.b(recyclerView, 24), 0, 0));
        recyclerView.k(new c(missions));
        this.f62759b.b(this.f62758a.R);
        RecyclerView.h adapter = this.f62758a.R.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.catalog.mission.SpecialMissionAdapter");
        w wVar = (w) adapter;
        ArrayList arrayList = new ArrayList(xn.t.u(missions, 10));
        for (MissionSpecial missionSpecial : missions) {
            arrayList.add(a0.f62646j.a(missionSpecial));
        }
        wVar.d(arrayList);
        this.f62758a.O.setVisibility(missions.size() > 1 ? 0 : 8);
        RecyclerView recyclerView2 = this.f62758a.O;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 0, false));
        recyclerView2.setAdapter(new x(new d()));
        int itemDecorationCount2 = recyclerView2.getItemDecorationCount();
        for (int i11 = 0; i11 < itemDecorationCount2; i11++) {
            recyclerView2.d1(i11);
        }
        jo.p.g(recyclerView2, "");
        recyclerView2.g(new p001if.c(de.n.b(recyclerView2, 12), 0, 0, 0, 0, 0));
        j(missions);
    }

    public final void j(List<MissionSpecial> list) {
        List<a0> a10;
        RecyclerView.h adapter = this.f62758a.R.getAdapter();
        w wVar = adapter instanceof w ? (w) adapter : null;
        if (wVar != null && (a10 = wVar.a()) != null) {
            int i10 = 0;
            for (Object obj : a10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                a0 a0Var = (a0) obj;
                if (a0Var != null) {
                    a0Var.g().p(Boolean.valueOf(this.f62760c == i10));
                }
                i10 = i11;
            }
        }
        MissionSpecial missionSpecial = (MissionSpecial) xn.a0.a0(list, this.f62760c);
        if (missionSpecial != null) {
            RecyclerView.h adapter2 = this.f62758a.O.getAdapter();
            jo.p.f(adapter2, "null cannot be cast to non-null type com.dena.mirrativ.catalog.mission.SpecialMissionAppAdapter");
            x xVar = (x) adapter2;
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            for (MissionSpecial missionSpecial2 : list) {
                arrayList.add(y.f62785c.a(missionSpecial2, missionSpecial.getIconImageUrl()));
            }
            xVar.d(arrayList);
        }
    }
}
