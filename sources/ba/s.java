package ba;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunUserDetail;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunUserList;
import ha.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jo.f0;
import jo.i0;
import kq.a;
import ud.c0;
import ud.r1;
import uo.q0;
import xn.a0;
import yd.g1;
import yd.t1;

/* loaded from: classes.dex */
public final class s extends androidx.fragment.app.e implements q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final /* synthetic */ da.j N0;
    public final c0 O0;
    public final wn.f P0;
    public final wn.f Q0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(String str, int i10) {
            jo.p.h(str, "referer");
            s sVar = new s();
            sVar.V2(k3.b.a(wn.q.a("EXTRA_REFERER", str), wn.q.a("EXTRA_GIFT_EVENT_ID", Integer.valueOf(i10))));
            return sVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17182w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17183x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17184y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17182w = componentCallbacks;
            this.f17183x = aVar;
            this.f17184y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ba.t, java.lang.Object] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f17182w;
            return gq.a.a(componentCallbacks).c(f0.b(t.class), this.f17183x, this.f17184y);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17185w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f17185w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f17185w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17186w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f17186w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f17186w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17187w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17188x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17189y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17190z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17187w = aVar;
            this.f17188x = aVar2;
            this.f17189y = aVar3;
            this.f17190z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17187w;
            vq.a aVar2 = this.f17188x;
            io.a aVar3 = this.f17189y;
            xq.a aVar4 = this.f17190z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(v.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17191w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f17191w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f17191w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public s() {
        super(q9.h.dialog_emomo_run_ranking);
        this.N0 = new da.j();
        this.O0 = new c0();
        this.P0 = wn.g.b(wn.i.SYNCHRONIZED, new d(this, null, null));
        e eVar = new e(this);
        xq.a a10 = gq.a.a(this);
        f fVar = new f(eVar);
        this.Q0 = e0.a(this, f0.b(v.class), new h(fVar), new g(eVar, null, null, a10));
    }

    public static final void G3(s sVar, s9.m mVar, EmomoRunEventResponse emomoRunEventResponse) {
        jo.p.h(sVar, "this$0");
        c0 c0Var = sVar.O0;
        jo.p.g(emomoRunEventResponse, "event");
        SpannableString D3 = sVar.D3(emomoRunEventResponse.getRankReward().getRank());
        int i10 = q9.i.text_gift_ranking_reward_amount;
        i0 i0Var = i0.f38149a;
        boolean z10 = false;
        String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(emomoRunEventResponse.getRankReward().getHighScore())}, 1));
        jo.p.g(format, "format(format, *args)");
        String V0 = sVar.V0(i10, format);
        jo.p.g(V0, "getString(R.string.text_…nt.rankReward.highScore))");
        c0Var.a(emomoRunEventResponse, D3, V0);
        ArrayList arrayList = new ArrayList();
        for (EmomoRunUserList emomoRunUserList : emomoRunEventResponse.getRankings()) {
            List<EmomoRunUserDetail> users = emomoRunUserList.getUsers();
            ArrayList arrayList2 = new ArrayList(xn.t.u(users, 10));
            for (EmomoRunUserDetail emomoRunUserDetail : users) {
                r1 r1Var = new r1(null, 1, null);
                int rank = emomoRunUserDetail.getRank();
                int userId = emomoRunUserDetail.getUserId();
                String liveId = emomoRunUserDetail.getLiveId();
                String iconUrl = emomoRunUserDetail.getIconUrl();
                String badgeImageUrl = emomoRunUserDetail.getBadgeImageUrl();
                String labelImageUrl = emomoRunUserDetail.getLabelImageUrl();
                String name = emomoRunUserDetail.getName();
                Resources O0 = sVar.O0();
                int i11 = q9.i.text_emomo_run_reward_amount_with_space;
                i0 i0Var2 = i0.f38149a;
                String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(emomoRunUserDetail.getHighScore())}, 1));
                jo.p.g(format2, "format(format, *args)");
                String string = O0.getString(i11, format2);
                jo.p.g(string, "resources.getString(R.st…, rankingUser.highScore))");
                String format3 = String.format("#%s", Arrays.copyOf(new Object[]{emomoRunEventResponse.getRankingHighlightColor()}, 1));
                jo.p.g(format3, "format(format, *args)");
                r1Var.a(rank, userId, liveId, iconUrl, badgeImageUrl, labelImageUrl, name, string, Color.parseColor(format3), false, emomoRunUserDetail.getUserId() != ((EmomoRunUserDetail) a0.i0(((EmomoRunUserList) a0.i0(emomoRunEventResponse.getRankings())).getUsers())).getUserId(), c3.a.f(sVar.N2(), q9.f.divider_left_margin42_white_five));
                arrayList2.add(r1Var);
                z10 = false;
            }
            arrayList.addAll(arrayList2);
        }
        RecyclerView.h adapter = mVar.G.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.LandingPageRankingUserAdapter");
        ((rd.i0) adapter).d(arrayList);
    }

    public static final void H3(s9.m mVar, s sVar, ha.a aVar) {
        jo.p.h(sVar, "this$0");
        if (aVar instanceof a.d) {
            mVar.D.setVisibility(0);
            mVar.C.setVisibility(0);
            mVar.T.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            mVar.D.setVisibility(8);
            mVar.C.setVisibility(8);
            mVar.T.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.C0439a) {
            t1.a aVar2 = t1.f61795x;
            Context N2 = sVar.N2();
            jo.p.g(N2, "requireContext()");
            String message = ((a.C0439a) aVar).b().getMessage();
            if (message == null) {
                message = sVar.U0(q9.i.f48840a);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            aVar2.a(N2, message);
            sVar.n3();
        } else {
            throw new IllegalArgumentException("unknown status " + aVar);
        }
    }

    public final SpannableString D3(int i10) {
        String U0 = i10 == 0 ? U0(q9.i.text_gift_ranking_out_of_ranking) : String.valueOf(i10);
        jo.p.g(U0, "if (rank == 0) getString…ing) else rank.toString()");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(U0);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(de.e.c(this, i10 == 0 ? 16 : 22)), 0, U0.length(), 33);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        jo.p.g(valueOf, "valueOf(spannableStringBuilder)");
        return valueOf;
    }

    public final t E3() {
        return (t) this.P0.getValue();
    }

    public final v F3() {
        return (v) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        final s9.m T = s9.m.T(view);
        T.M(a1());
        T.V(this.O0);
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new b());
        ConstraintLayout constraintLayout = T.S;
        jo.p.g(constraintLayout, "binding.rootContainer");
        g1.a(constraintLayout, new c());
        T.G.setLayoutManager(new LinearLayoutManager(T.u().getContext(), 1, false));
        T.G.setAdapter(new rd.i0());
        F3().f().i(a1(), new androidx.lifecycle.f0() { // from class: ba.q
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                s.G3(s.this, T, (EmomoRunEventResponse) obj);
            }
        });
        F3().g().i(a1(), new androidx.lifecycle.f0() { // from class: ba.r
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                s.H3(s9.m.this, this, (ha.a) obj);
            }
        });
        t E3 = E3();
        String string = M2().getString("EXTRA_REFERER", "");
        jo.p.g(string, "requireArguments().getString(EXTRA_REFERER, \"\")");
        E3.c(string, M2().getInt("EXTRA_GIFT_EVENT_ID"));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), q9.j.f48844a);
        w3(false);
        return dialog;
    }
}
