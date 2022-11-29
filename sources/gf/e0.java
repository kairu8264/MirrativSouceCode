package gf;

import ae.o6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import be.k1;
import be.x1;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUser;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaUserBasic;
import com.dena.mirrorman.customview.GiftGachaOpenResultView;
import com.dena.mirrorman.net.api.response.GiftGachaOpenResponse;
import com.dena.mirrorman.net.api.response.GiftGachaStockType;
import java.util.ArrayList;
import java.util.List;
import nd.b1;
import ud.u0;

/* loaded from: classes2.dex */
public final class e0 extends Fragment implements uo.q0 {
    public static final a A0 = new a(null);
    public static final int B0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f33317x0;

    /* renamed from: y0  reason: collision with root package name */
    public nf.c f33318y0;

    /* renamed from: z0  reason: collision with root package name */
    public f0 f33319z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e0 a() {
            return new e0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements yd.u {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ GiftGachaOpenResponse f33321b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o6 f33322c;

        public b(GiftGachaOpenResponse giftGachaOpenResponse, o6 o6Var) {
            this.f33321b = giftGachaOpenResponse;
            this.f33322c = o6Var;
        }

        @Override // yd.u
        public void a(int i10) {
            x1.a aVar = x1.O0;
            List<GiftGachaItem> items = this.f33321b.getStreamer().getItems();
            e0 e0Var = e0.this;
            ArrayList arrayList = new ArrayList(xn.t.u(items, 10));
            for (GiftGachaItem giftGachaItem : items) {
                u0.a aVar2 = ud.u0.I;
                Context N2 = e0Var.N2();
                jo.p.g(N2, "requireContext()");
                arrayList.add(aVar2.a(N2, giftGachaItem));
            }
            aVar.a(new ArrayList<>(arrayList), i10).z3(e0.this.p0(), "GiftItemDetailDialogFragment");
        }

        @Override // yd.u
        public void b(int i10) {
            x1.a aVar = x1.O0;
            GiftGachaUser collabUser = this.f33321b.getCollabUser();
            jo.p.e(collabUser);
            List<GiftGachaItem> items = collabUser.getItems();
            e0 e0Var = e0.this;
            ArrayList arrayList = new ArrayList(xn.t.u(items, 10));
            for (GiftGachaItem giftGachaItem : items) {
                u0.a aVar2 = ud.u0.I;
                Context N2 = e0Var.N2();
                jo.p.g(N2, "requireContext()");
                arrayList.add(aVar2.a(N2, giftGachaItem));
            }
            aVar.a(new ArrayList<>(arrayList), i10).z3(e0.this.p0(), "GiftItemDetailDialogFragment");
        }

        @Override // yd.u
        public void c(String str) {
            jo.p.h(str, "url");
            k1.R0.a(str).z3(e0.this.p0(), "EmomoRunGiftInfoDialog");
        }

        @Override // yd.u
        public void d(int i10) {
            x1.a aVar = x1.O0;
            GiftGachaUser viewer = this.f33321b.getViewer();
            jo.p.e(viewer);
            List<GiftGachaItem> items = viewer.getItems();
            e0 e0Var = e0.this;
            ArrayList arrayList = new ArrayList(xn.t.u(items, 10));
            for (GiftGachaItem giftGachaItem : items) {
                u0.a aVar2 = ud.u0.I;
                Context N2 = e0Var.N2();
                jo.p.g(N2, "requireContext()");
                arrayList.add(aVar2.a(N2, giftGachaItem));
            }
            aVar.a(new ArrayList<>(arrayList), i10).z3(e0.this.p0(), "GiftItemDetailDialogFragment");
        }

        @Override // yd.u
        public void e() {
            this.f33322c.D.setVisibility(8);
        }
    }

    public e0() {
        super(b1.fragment_gift_gacha_open_result);
        this.f33317x0 = new da.j();
    }

    public static final void l3(e0 e0Var, View view) {
        jo.p.h(e0Var, "this$0");
        f0 f0Var = e0Var.f33319z0;
        if (f0Var != null) {
            f0Var.close();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        this.f33319z0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        o6 T = o6.T(view);
        nf.c cVar = this.f33318y0;
        if (cVar == null) {
            jo.p.v("castServiceStore");
            cVar = null;
        }
        wn.k<GiftGachaOpenResponse, GiftGachaStockType> h02 = cVar.h0();
        if (h02 == null) {
            f0 f0Var = this.f33319z0;
            if (f0Var != null) {
                f0Var.close();
                return;
            }
            return;
        }
        GiftGachaOpenResponse c10 = h02.c();
        GiftGachaStockType d10 = h02.d();
        jo.p.g(T, "binding");
        k3(T, c10);
        if (d10.isRare()) {
            T.D.setVisibility(8);
        }
        GiftGachaOpenResultView giftGachaOpenResultView = T.C;
        androidx.lifecycle.u a12 = a1();
        GiftGachaUser streamer = c10.getStreamer();
        GiftGachaUser viewer = c10.getViewer();
        GiftGachaUser collabUser = c10.getCollabUser();
        List<GiftGachaUserBasic> rouletteUsers = c10.getRouletteUsers();
        String headlineImageUrl = c10.getHeadlineImageUrl();
        String elementImageUrl = c10.getElementImageUrl();
        String duplicatedExplainImageUrl = c10.getDuplicatedExplainImageUrl();
        jo.p.g(a12, "viewLifecycleOwner");
        giftGachaOpenResultView.f(a12, streamer, viewer, collabUser, rouletteUsers, elementImageUrl, headlineImageUrl, d10, duplicatedExplainImageUrl, true);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33317x0.getCoroutineContext();
    }

    public final void k3(o6 o6Var, GiftGachaOpenResponse giftGachaOpenResponse) {
        o6Var.B.setOnClickListener(new View.OnClickListener() { // from class: gf.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0.l3(e0.this, view);
            }
        });
        o6Var.C.setListener(new b(giftGachaOpenResponse, o6Var));
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.f33319z0 = H0 instanceof f0 ? (f0) H0 : null;
        this.f33318y0 = (nf.c) gq.a.a(this).c(jo.f0.b(nf.c.class), null, null);
    }
}
