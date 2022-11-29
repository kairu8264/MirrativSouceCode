package gc;

import ac.v4;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.LiveViewingUser;
import fa.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.a;
import org.json.JSONObject;
import ud.s;
import uo.q0;
import uo.r0;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class m extends FrameLayout implements fa.b, oq.a, q0 {
    public static final e J = new e(null);
    public static final int K = 8;
    public final wn.f A;
    public final wn.f B;
    public final wn.f C;
    public final wn.f D;
    public final wn.f E;
    public final wn.f F;
    public final wn.f G;
    public final v4 H;
    public final f I;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f33000w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ da.j f33001x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f33002y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f33003z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            m.this.H.D.setText(xb.r.C0);
            m.this.H.D.setBackgroundResource(xb.n.rectangle_corner20_slategray);
            if (m.this.n()) {
                m.this.getCollabActionCreator().p(jf.k.CLOSE_BUTTON_TAPPED);
                return;
            }
            od.f collabActionCreator = m.this.getCollabActionCreator();
            String b10 = m.this.getLivePreference().b();
            List<LiveViewingUser> Q = m.this.getCastServiceStore().Q();
            ArrayList arrayList = new ArrayList(xn.t.u(Q, 10));
            for (LiveViewingUser liveViewingUser : Q) {
                arrayList.add(new jf.g(liveViewingUser.getUserId(), jo.p.c(liveViewingUser.isStartedCollab(), Boolean.TRUE)));
            }
            collabActionCreator.h(Referer.BROADCAST, b10, arrayList, jf.k.CLOSE_BUTTON_TAPPED);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            m.this.getFloatViewManager().c(m.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements qf.g {
        public c() {
        }

        @Override // qf.g
        public void a(String str) {
            Object obj;
            jo.p.h(str, "userId");
            Iterator<T> it = m.this.getCastServiceStore().Q().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((LiveViewingUser) obj).getUserId(), str)) {
                    break;
                }
            }
            LiveViewingUser liveViewingUser = (LiveViewingUser) obj;
            if (liveViewingUser == null) {
                return;
            }
            m.this.getCollabActionCreator().h(Referer.BROADCAST, m.this.getLivePreference().b(), xn.r.d(new jf.g(liveViewingUser.getUserId(), jo.p.c(liveViewingUser.isStartedCollab(), Boolean.TRUE))), jf.k.CLOSE_BUTTON_TAPPED);
        }

        @Override // qf.g
        public void b(String str) {
            Object obj;
            String liveId;
            jo.p.h(str, "userId");
            Iterator<T> it = m.this.getCastServiceStore().Q().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((LiveViewingUser) obj).getUserId(), str)) {
                    break;
                }
            }
            LiveViewingUser liveViewingUser = (LiveViewingUser) obj;
            if (liveViewingUser == null || (liveId = liveViewingUser.getLiveId()) == null || jo.p.c(liveId, m.this.getPlayerStore().s0().f())) {
                return;
            }
            m.this.getCastServiceActionCreator().N(liveId);
            m.this.getFloatViewManager().c(m.this);
        }

        @Override // qf.g
        public void c(String str, int i10) {
            jo.p.h(str, "userId");
            m.this.getCastServiceActionCreator().h(str, i10);
            double d10 = 2;
            double pow = Math.pow((i10 + 80.0d) / 80.0d, d10) * d10;
            MRLogger logger = m.this.getLogger();
            MRLog.Companion companion = MRLog.Companion;
            m mVar = m.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_VOLUME_CONTROL);
            builder.setTargetId(str);
            builder.setTargetType(mVar.getCollabStore().E() ? MRLog.TARGET_TYPE_LIVE : MRLog.TARGET_TYPE_USER);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("volume", pow);
            wn.v vVar = wn.v.f59242a;
            builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, mVar.getLivePreference().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, mVar.getUserPreference().T4()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
            logger.sendLog(builder.build());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            m.this.getFloatViewManager().c(m.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public e() {
        }

        public /* synthetic */ e(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements androidx.lifecycle.u {

        /* renamed from: w  reason: collision with root package name */
        public final androidx.lifecycle.w f33008w = new androidx.lifecycle.w(this);

        public final void a() {
            this.f33008w.o(o.c.STARTED);
        }

        public final void b() {
            this.f33008w.o(o.c.CREATED);
        }

        @Override // androidx.lifecycle.u
        public androidx.lifecycle.w g() {
            return this.f33008w;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33009w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33010x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33011y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33009w = aVar;
            this.f33010x = aVar2;
            this.f33011y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33009w;
            vq.a aVar2 = this.f33010x;
            io.a<? extends uq.a> aVar3 = this.f33011y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33012w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33013x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33014y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33012w = aVar;
            this.f33013x = aVar2;
            this.f33014y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f33012w;
            vq.a aVar2 = this.f33013x;
            io.a<? extends uq.a> aVar3 = this.f33014y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33015w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33016x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33017y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33015w = aVar;
            this.f33016x = aVar2;
            this.f33017y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33015w;
            vq.a aVar2 = this.f33016x;
            io.a<? extends uq.a> aVar3 = this.f33017y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<od.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33018w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33019x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33020y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33018w = aVar;
            this.f33019x = aVar2;
            this.f33020y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.f] */
        @Override // io.a
        public final od.f invoke() {
            xq.a b10;
            oq.a aVar = this.f33018w;
            vq.a aVar2 = this.f33019x;
            io.a<? extends uq.a> aVar3 = this.f33020y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.f.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33021w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33022x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33023y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33021w = aVar;
            this.f33022x = aVar2;
            this.f33023y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            xq.a b10;
            oq.a aVar = this.f33021w;
            vq.a aVar2 = this.f33022x;
            io.a<? extends uq.a> aVar3 = this.f33023y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.h.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33024w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33025x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33026y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33024w = aVar;
            this.f33025x = aVar2;
            this.f33026y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            xq.a b10;
            oq.a aVar = this.f33024w;
            vq.a aVar2 = this.f33025x;
            io.a<? extends uq.a> aVar3 = this.f33026y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.m.class), aVar2, aVar3);
        }
    }

    /* renamed from: gc.m$m  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0386m extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33027w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33028x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33029y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0386m(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33027w = aVar;
            this.f33028x = aVar2;
            this.f33029y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f33027w;
            vq.a aVar2 = this.f33028x;
            io.a<? extends uq.a> aVar3 = this.f33029y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33030w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33031x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33032y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33030w = aVar;
            this.f33031x = aVar2;
            this.f33032y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            xq.a b10;
            oq.a aVar = this.f33030w;
            vq.a aVar2 = this.f33031x;
            io.a<? extends uq.a> aVar3 = this.f33032y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.z.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33033w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33034x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33035y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33033w = aVar;
            this.f33034x = aVar2;
            this.f33035y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            xq.a b10;
            oq.a aVar = this.f33033w;
            vq.a aVar2 = this.f33034x;
            io.a<? extends uq.a> aVar3 = this.f33035y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.x.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, boolean z10) {
        super(context);
        jo.p.h(context, "context");
        this.f33000w = z10;
        this.f33001x = new da.j();
        cr.a aVar = cr.a.f28611a;
        this.f33002y = wn.g.b(aVar.b(), new g(this, null, null));
        this.f33003z = wn.g.b(aVar.b(), new h(this, null, null));
        this.A = wn.g.b(aVar.b(), new i(this, null, null));
        this.B = wn.g.b(aVar.b(), new j(this, null, null));
        this.C = wn.g.b(aVar.b(), new k(this, null, null));
        this.D = wn.g.b(aVar.b(), new l(this, null, null));
        this.E = wn.g.b(aVar.b(), new C0386m(this, null, null));
        this.F = wn.g.b(aVar.b(), new n(this, null, null));
        this.G = wn.g.b(aVar.b(), new o(this, null, null));
        v4 v4Var = (v4) androidx.databinding.f.e(LayoutInflater.from(getContext()), xb.p.view_floating_collab_member, this, true);
        this.H = v4Var;
        this.I = new f();
        AppCompatButton appCompatButton = v4Var.D;
        jo.p.g(appCompatButton, "binding.finishCollabButton");
        g1.a(appCompatButton, new a());
        AppCompatImageView appCompatImageView = v4Var.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new b());
        RecyclerView recyclerView = v4Var.E;
        rd.g gVar = new rd.g();
        gVar.c(new c());
        recyclerView.setAdapter(gVar);
        v4Var.E.setLayoutManager(new LinearLayoutManager(context));
        v4Var.E.g(new p001if.c(de.n.b(this, 32), 0, de.n.b(this, 24), 0, de.n.b(this, 24), 0, 32, null));
        v4Var.E.g(new n9.a(context, 1, 0, 4, null));
        g1.a(this, new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final od.b getCastServiceActionCreator() {
        return (od.b) this.f33003z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.c getCastServiceStore() {
        return (nf.c) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final od.f getCollabActionCreator() {
        return (od.f) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.h getCollabStore() {
        return (nf.h) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f33002y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf.m getLivePreference() {
        return (kf.m) this.D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRLogger getLogger() {
        return (MRLogger) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.z getPlayerStore() {
        return (nf.z) this.F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf.x getUserPreference() {
        return (kf.x) this.G.getValue();
    }

    public static final void o(m mVar, List list) {
        jo.p.h(mVar, "this$0");
        if (list.isEmpty()) {
            mVar.getFloatViewManager().c(mVar);
            return;
        }
        RecyclerView.h adapter = mVar.H.E.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.CollabMemberAdapter");
        rd.g gVar = (rd.g) adapter;
        jo.p.g(list, "collabUsers");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s.a aVar = ud.s.f55454m;
            Resources resources = mVar.getResources();
            jo.p.g(resources, "resources");
            arrayList.add(aVar.a(resources, (LiveViewingUser) it.next(), mVar.f33000w, mVar.getCastServiceStore().P(), mVar.getPlayerStore().s0().f()));
        }
        gVar.d(arrayList);
    }

    public static final void p(m mVar, Boolean bool) {
        jo.p.h(mVar, "this$0");
        StatusView statusView = mVar.H.G;
        jo.p.g(bool, "it");
        statusView.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33001x.getCoroutineContext();
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return b.a.b(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return b.a.c(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatCollabMemberView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final boolean n() {
        return this.f33000w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.a();
        getCastServiceStore().R().i(this.I, new androidx.lifecycle.f0() { // from class: gc.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.o(m.this, (List) obj);
            }
        });
        getCastServiceStore().N0().i(this.I, new androidx.lifecycle.f0() { // from class: gc.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m.p(m.this, (Boolean) obj);
            }
        });
        MRLogger logger = getLogger();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_CONNECTED_USERS_IMP);
        builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, getLivePreference().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, getUserPreference().T4())));
        logger.sendLog(builder.build());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getCastServiceStore().R().o(this.I);
        this.I.b();
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }
}
