package r8;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import be.t1;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.catalog.groupshot.GroupShotGalleryActivity;
import com.dena.mirrativ.catalog.groupshot.GroupShotGalleryDetailActivity;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.EventBannerActionType;
import com.dena.mirrorman.clientlog.logs.EventBannerLog;
import com.dena.mirrorman.clientlog.logs.EventBannerTargetType;
import com.dena.mirrorman.clientlog.logs.EventBannerWhere;
import com.dena.mirrorman.clientlog.logs.LiveCatalogVisibleLogger;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.Quiz;
import com.dena.mirrorman.clientlog.logs.detail.CatalogBannerTargetDetail;
import com.dena.mirrorman.clientlog.logs.detail.CatalogTargetDetail;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import ha.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jf.b0;
import kq.a;
import uo.d2;
import uo.i2;
import v8.g;

/* loaded from: classes.dex */
public final class w0 extends Fragment implements uo.q0 {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final wn.f G0;
    public final wn.f H0;
    public final wn.f I0;
    public final wn.f J0;
    public vb.r K0;
    public boolean L0;
    public long M0;
    public d2 N0;
    public final androidx.activity.result.c<Intent> O0;

    /* renamed from: y0  reason: collision with root package name */
    public t8.s f50041y0;

    /* renamed from: z0  reason: collision with root package name */
    public RecyclerView.u f50042z0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f50040x0 = new da.j();
    public final wn.f A0 = wn.g.a(new c());
    public final wn.f B0 = wn.g.a(new v());
    public final wn.f C0 = wn.g.a(new d());

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w0 a(String str, String str2, wb.a aVar) {
            jo.p.h(str, "actionId");
            jo.p.h(str2, "referer");
            jo.p.h(aVar, "getLiveCatalogParameters");
            w0 w0Var = new w0();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_ACTION_ID", str);
            bundle.putString("BUNDLE_KEY_REFERER", str2);
            bundle.putParcelable("BUNDLE_KEY_GET_LIVE_CATALOG_PARAMETERS", aVar);
            w0Var.V2(bundle);
            return w0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50043w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50044x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50045y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50043w = componentCallbacks;
            this.f50044x = aVar;
            this.f50045y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f50043w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f50044x, this.f50045y);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<uq.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(w0.this.G3(), w0.this.N3(), w0.this.I3());
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<LiveCatalogVisibleLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50047w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50048x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50049y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50047w = componentCallbacks;
            this.f50048x = aVar;
            this.f50049y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.LiveCatalogVisibleLogger, java.lang.Object] */
        @Override // io.a
        public final LiveCatalogVisibleLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50047w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(LiveCatalogVisibleLogger.class), this.f50048x, this.f50049y);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = w0.this.M2().getString("BUNDLE_KEY_ACTION_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f50051w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Fragment fragment) {
            super(0);
            this.f50051w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f50051w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<wb.a> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final wb.a invoke() {
            Parcelable parcelable = w0.this.M2().getParcelable("BUNDLE_KEY_GET_LIVE_CATALOG_PARAMETERS");
            jo.p.e(parcelable);
            return (wb.a) parcelable;
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50053w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(io.a aVar) {
            super(0);
            this.f50053w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f50053w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f50054a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f50055b;

        public e(int i10, int i11) {
            this.f50054a = i10;
            this.f50055b = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            int i10;
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            super.g(rect, view, recyclerView, b0Var);
            RecyclerView.h adapter = recyclerView.getAdapter();
            s0 s0Var = adapter instanceof s0 ? (s0) adapter : null;
            if (s0Var == null) {
                return;
            }
            int f02 = recyclerView.f0(view);
            if (s0Var.b().get(f02) instanceof s8.d) {
                return;
            }
            if (s0Var.b().get(f02) instanceof s8.c) {
                if (f02 == 0) {
                    rect.top = 0;
                }
                if (f02 == s0Var.getItemCount() - 1) {
                    rect.bottom = (this.f50054a / 2) - (this.f50055b / 2);
                    return;
                }
                return;
            }
            if (f02 != 0 && (f02 != 1 || !(s0Var.b().get(0) instanceof s8.c))) {
                rect.top = this.f50055b / 2;
            } else {
                rect.top = this.f50055b;
            }
            int i11 = this.f50055b;
            rect.left = i11;
            rect.right = i11;
            if (f02 == s0Var.getItemCount() - 1) {
                i10 = this.f50054a / 2;
            } else {
                i10 = this.f50055b / 2;
            }
            rect.bottom = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50056w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50057x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50058y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f50059z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f50056w = aVar;
            this.f50057x = aVar2;
            this.f50058y = aVar3;
            this.f50059z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f50056w;
            vq.a aVar2 = this.f50057x;
            io.a aVar3 = this.f50058y;
            xq.a aVar4 = this.f50059z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(x0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements r8.i {
        public f() {
        }

        @Override // r8.i
        public void a(s8.a aVar) {
            jo.p.h(aVar, "bindModel");
            if (aVar instanceof s8.b) {
                MRLogger M3 = w0.this.M3();
                MRLog.Companion companion = MRLog.Companion;
                w0 w0Var = w0.this;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAROUSEL_BANNER);
                builder.setTargetType(MRLog.TARGET_TYPE_BANNER);
                builder.setTargetId(MRLog.TARGET_ID_IMP);
                wn.k[] kVarArr = new wn.k[2];
                s8.b bVar = (s8.b) aVar;
                String valueOf = String.valueOf(bVar.c() + 1);
                String h10 = bVar.h();
                String b10 = bVar.b();
                String f10 = bVar.f();
                String a10 = w0Var.I3().a();
                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogBannerTargetDetail(valueOf, h10, b10, f10, a10 == null ? "" : a10).toJson());
                kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, w0Var.N3());
                builder.setPayload(xn.s.m(kVarArr));
                M3.sendLog(builder.build());
            } else if (aVar instanceof s8.l) {
                MRLogger M32 = w0.this.M3();
                MRLog.Companion companion2 = MRLog.Companion;
                w0 w0Var2 = w0.this;
                MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_CAROUSEL_BANNER);
                builder2.setTargetType(MRLog.TARGET_TYPE_BANNER);
                builder2.setTargetId(MRLog.TARGET_ID_IMP);
                wn.k[] kVarArr2 = new wn.k[2];
                s8.l lVar = (s8.l) aVar;
                String valueOf2 = String.valueOf(lVar.b() + 1);
                String e10 = lVar.e();
                String a11 = lVar.a();
                String c10 = lVar.c();
                String a12 = w0Var2.I3().a();
                kVarArr2[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogBannerTargetDetail(valueOf2, e10, a11, c10, a12 == null ? "" : a12).toJson());
                kVarArr2[1] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, w0Var2.N3());
                builder2.setPayload(xn.s.m(kVarArr2));
                M32.sendLog(builder2.build());
            } else if (aVar instanceof s8.i) {
                MRLogger M33 = w0.this.M3();
                MRLog.Companion companion3 = MRLog.Companion;
                w0 w0Var3 = w0.this;
                MRLog.Builder builder3 = new MRLog.Builder(MRLog.ACTION_TYPE_CAROUSEL_BANNER);
                builder3.setTargetType(MRLog.TARGET_TYPE_QUIZ);
                builder3.setTargetId(MRLog.TARGET_ID_IMP);
                wn.k[] kVarArr3 = new wn.k[2];
                s8.i iVar = (s8.i) aVar;
                String valueOf3 = String.valueOf(iVar.c() + 1);
                String b11 = iVar.b();
                String d10 = iVar.d();
                String e11 = iVar.e();
                String a13 = w0Var3.I3().a();
                kVarArr3[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogBannerTargetDetail(valueOf3, b11, d10, e11, a13 == null ? "" : a13).toJson());
                kVarArr3[1] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, w0Var3.N3());
                builder3.setPayload(xn.s.m(kVarArr3));
                M33.sendLog(builder3.build());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f50061w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(io.a aVar) {
            super(0);
            this.f50061w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f50061w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements r8.m {
        public g() {
        }

        @Override // r8.m
        public void a(String str) {
            jo.p.h(str, "userId");
            w0 w0Var = w0.this;
            tb.c K3 = w0Var.K3();
            Context N2 = w0.this.N2();
            jo.p.g(N2, "requireContext()");
            w0Var.f3(K3.s(N2, str, w0.this.N3()));
        }

        @Override // r8.m
        public void b(List<String> list) {
            jo.p.h(list, "groupShotIds");
            MRLogger M3 = w0.this.M3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_GALLERY_LIVE_CATALOG);
            builder.setPageId(Referer.HOME_SELECT);
            xm.e eVar = new xm.e();
            HashMap hashMap = new HashMap();
            hashMap.put("groupshot_ids", xn.a0.g0(list, ",", null, null, 0, null, null, 62, null));
            wn.v vVar = wn.v.f59242a;
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, eVar.s(hashMap))));
            M3.sendLog(builder.build());
        }

        @Override // r8.m
        public void c() {
            Context q02 = w0.this.q0();
            if (q02 != null) {
                w0.this.f3(GroupShotGalleryActivity.a.b(GroupShotGalleryActivity.Y, q02, false, null, null, 12, null));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // r8.m
        public void d(String str, n3.d<View, String>... dVarArr) {
            s8.d dVar;
            jo.p.h(str, "groupShotId");
            jo.p.h(dVarArr, "sharedElements");
            List<s8.a> j10 = w0.this.O3().j();
            ArrayList<s8.d> arrayList = new ArrayList();
            Iterator<T> it = j10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s8.a aVar = (s8.a) it.next();
                dVar = aVar instanceof s8.d ? (s8.d) aVar : null;
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
            for (s8.d dVar2 : arrayList) {
                arrayList2.add(dVar2.a());
            }
            Iterator it2 = xn.t.v(arrayList2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jo.p.c(((v8.a) next).getId(), str)) {
                    dVar = next;
                    break;
                }
            }
            v8.a aVar2 = (v8.a) dVar;
            if (aVar2 == null) {
                return;
            }
            g.a aVar3 = v8.g.J;
            Context N2 = w0.this.N2();
            jo.p.g(N2, "requireContext()");
            v8.g b10 = aVar3.b(N2, aVar2);
            GroupShotGalleryDetailActivity.a aVar4 = GroupShotGalleryDetailActivity.U;
            Context N22 = w0.this.N2();
            jo.p.g(N22, "requireContext()");
            Intent a10 = aVar4.a(N22, b10, w0.this.N3());
            b3.b a11 = b3.b.a(w0.this.L2(), (n3.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
            jo.p.g(a11, "makeSceneTransitionAnima…ivity(), *sharedElements)");
            w0.this.g3(a10, a11.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.l<Intent, wn.v> {
        public g0() {
            super(1);
        }

        public final void a(Intent intent) {
            jo.p.h(intent, "intent");
            w0.this.O0.a(intent);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Intent intent) {
            a(intent);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<Integer, wn.v> {
        public h() {
            super(1);
        }

        public final void a(int i10) {
            if (i10 != 0 || w0.this.L0) {
                return;
            }
            w0.this.Z3();
            w0.this.L0 = true;
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogFragment$startPreviewIfNeeded$1", f = "LiveCatalogFragment.kt", l = {575}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h0 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50065w;

        public h0(ao.d<? super h0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h0(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50065w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f50065w = 1;
                if (uo.b1.a(1000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            w0.this.Z3();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l<s8.a, wn.v> {
        public i() {
            super(1);
        }

        public final void a(s8.a aVar) {
            jo.p.h(aVar, "it");
            s8.e eVar = aVar instanceof s8.e ? (s8.e) aVar : null;
            if (eVar != null) {
                w0.this.U3(eVar);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(s8.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends jo.q implements io.a<uq.a> {
        public i0() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(w0.this.G3());
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements r8.a0 {
        public j() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
        @Override // r8.a0
        public void a(String str, int i10) {
            ?? r12;
            boolean z10;
            jo.p.h(str, "liveId");
            Iterator it = w0.this.O3().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r12 = 0;
                    break;
                }
                r12 = it.next();
                s8.a aVar = (s8.a) r12;
                if ((aVar instanceof s8.h) && jo.p.c(((s8.h) aVar).b(), str)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.h hVar = r12 instanceof s8.h ? r12 : null;
            if (hVar != null) {
                w0 w0Var = w0.this;
                w0Var.T3(hVar);
                w0Var.F3().n(hVar.q().getLiveId());
                w0Var.V3(hVar.q(), i10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        @Override // r8.a0
        public void b(String str) {
            ?? r12;
            LiveBasicParams q10;
            boolean z10;
            jo.p.h(str, "liveId");
            Iterator it = w0.this.O3().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r12 = 0;
                    break;
                }
                r12 = it.next();
                s8.a aVar = (s8.a) r12;
                if ((aVar instanceof s8.h) && jo.p.c(((s8.h) aVar).b(), str)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.h hVar = r12 instanceof s8.h ? r12 : null;
            if (hVar == null || (q10 = hVar.q()) == null) {
                return;
            }
            w0.this.X3(q10);
        }
    }

    /* loaded from: classes.dex */
    public static final class k implements l0 {
        public k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
        @Override // r8.l0
        public void a(String str, int i10) {
            ?? r12;
            boolean z10;
            jo.p.h(str, "liveId");
            Iterator it = w0.this.O3().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r12 = 0;
                    break;
                }
                r12 = it.next();
                s8.a aVar = (s8.a) r12;
                if ((aVar instanceof s8.j) && jo.p.c(((s8.j) aVar).b(), str)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.j jVar = r12 instanceof s8.j ? r12 : null;
            if (jVar != null) {
                w0 w0Var = w0.this;
                w0Var.T3(jVar);
                w0Var.F3().n(jVar.m().getLiveId());
                w0Var.V3(jVar.m(), i10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        @Override // r8.l0
        public void b(String str) {
            ?? r12;
            LiveBasicParams m10;
            boolean z10;
            jo.p.h(str, "liveId");
            Iterator it = w0.this.O3().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r12 = 0;
                    break;
                }
                r12 = it.next();
                s8.a aVar = (s8.a) r12;
                if ((aVar instanceof s8.j) && jo.p.c(((s8.j) aVar).b(), str)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.j jVar = r12 instanceof s8.j ? r12 : null;
            if (jVar == null || (m10 = jVar.m()) == null) {
                return;
            }
            w0.this.X3(m10);
        }
    }

    /* loaded from: classes.dex */
    public static final class l implements r8.v {
        public l() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        @Override // r8.v
        public void a(String str, int i10) {
            ?? r12;
            boolean z10;
            jo.p.h(str, "liveId");
            Iterator it = w0.this.O3().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r12 = 0;
                    break;
                }
                r12 = it.next();
                s8.a aVar = (s8.a) r12;
                if ((aVar instanceof s8.g) && jo.p.c(((s8.g) aVar).b(), str)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.g gVar = r12 instanceof s8.g ? r12 : null;
            if (gVar != null) {
                w0 w0Var = w0.this;
                w0Var.T3(gVar);
                w0Var.V3(gVar.s(), i10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        @Override // r8.v
        public void b(String str) {
            ?? r12;
            LiveBasicParams s10;
            boolean z10;
            jo.p.h(str, "liveId");
            Iterator it = w0.this.O3().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r12 = 0;
                    break;
                }
                r12 = it.next();
                s8.a aVar = (s8.a) r12;
                if ((aVar instanceof s8.g) && jo.p.c(((s8.g) aVar).b(), str)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.g gVar = r12 instanceof s8.g ? r12 : null;
            if (gVar == null || (s10 = gVar.s()) == null) {
                return;
            }
            w0.this.X3(s10);
        }
    }

    /* loaded from: classes.dex */
    public static final class m implements r8.h0 {
        public m() {
        }

        @Override // r8.h0
        public void a(s8.i iVar) {
            jo.p.h(iVar, "bindModel");
            Puree.d(new Quiz.Imp("banner_invite"));
            t1.Q0.a(iVar.e()).z3(w0.this.O2(), "FriendInvitePopupDialog");
        }

        @Override // r8.h0
        public void b(s8.i iVar) {
            jo.p.h(iVar, "bindModel");
            if (jo.p.c(iVar.g().f(), Boolean.TRUE)) {
                w0.this.F3().m(iVar.f());
            } else {
                w0.this.F3().h(iVar.f());
            }
        }

        @Override // r8.h0
        public void c(s8.i iVar) {
            jo.p.h(iVar, "bindModel");
            w0 w0Var = w0.this;
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = w0Var.N2();
            jo.p.g(N2, "requireContext()");
            w0Var.f3(WebViewActivity.a.b(aVar, N2, iVar.b(), false, false, 12, null));
            MRLogger M3 = w0.this.M3();
            MRLog.Companion companion = MRLog.Companion;
            w0 w0Var2 = w0.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAROUSEL_BANNER);
            builder.setTargetType(MRLog.TARGET_TYPE_QUIZ);
            builder.setTargetId(MRLog.TARGET_ID_TAP);
            wn.k[] kVarArr = new wn.k[2];
            String valueOf = String.valueOf(iVar.c() + 1);
            String b10 = iVar.b();
            String d10 = iVar.d();
            String e10 = iVar.e();
            String a10 = w0Var2.I3().a();
            if (a10 == null) {
                a10 = "";
            }
            kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogBannerTargetDetail(valueOf, b10, d10, e10, a10).toJson());
            kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, w0Var2.N3());
            builder.setPayload(xn.s.m(kVarArr));
            M3.sendLog(builder.build());
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.l<String, wn.v> {
        public n() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "url");
            jf.b0 a10 = w0.this.P3().a(str);
            if (a10 instanceof b0.l0) {
                return;
            }
            w0 w0Var = w0.this;
            HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
            Context N2 = w0Var.N2();
            jo.p.g(N2, "requireContext()");
            w0Var.f3(aVar.a(N2, w0.this.N3(), a10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o implements r8.c {
        public o() {
        }

        @Override // r8.c
        public void a(s8.b bVar) {
            jo.p.h(bVar, "bindModel");
            jf.b0 a10 = w0.this.P3().a(bVar.h());
            if (!(a10 instanceof b0.l0)) {
                w0 w0Var = w0.this;
                HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                Context N2 = w0Var.N2();
                jo.p.g(N2, "requireContext()");
                w0Var.f3(aVar.a(N2, w0.this.N3(), a10));
            } else {
                w0 w0Var2 = w0.this;
                WebViewActivity.a aVar2 = WebViewActivity.X;
                Context N22 = w0Var2.N2();
                jo.p.g(N22, "requireContext()");
                w0Var2.f3(WebViewActivity.a.b(aVar2, N22, bVar.h(), false, false, 12, null));
            }
            if (bVar.i()) {
                MRLogger M3 = w0.this.M3();
                MRLog.Companion companion = MRLog.Companion;
                w0 w0Var3 = w0.this;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAROUSEL_BANNER);
                builder.setTargetType(MRLog.TARGET_TYPE_BANNER);
                builder.setTargetId(MRLog.TARGET_ID_TAP);
                wn.k[] kVarArr = new wn.k[2];
                String valueOf = String.valueOf(bVar.c() + 1);
                String h10 = bVar.h();
                String b10 = bVar.b();
                String f10 = bVar.f();
                String a11 = w0Var3.I3().a();
                if (a11 == null) {
                    a11 = "";
                }
                kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogBannerTargetDetail(valueOf, h10, b10, f10, a11).toJson());
                kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, w0Var3.N3());
                builder.setPayload(xn.s.m(kVarArr));
                M3.sendLog(builder.build());
                return;
            }
            Puree.d(new EventBannerLog(EventBannerActionType.EVENT_BANNER_CLICK, EventBannerTargetType.NONE, bVar.f(), EventBannerWhere.HOME_APP_SELECTED, null, null, 32, null));
        }
    }

    /* loaded from: classes.dex */
    public static final class p implements m0 {
        public p() {
        }

        @Override // r8.m0
        public void a(s8.l lVar) {
            jo.p.h(lVar, "bindModel");
            jf.b0 a10 = w0.this.P3().a(lVar.e());
            if (!(a10 instanceof b0.l0)) {
                w0 w0Var = w0.this;
                HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                Context N2 = w0Var.N2();
                jo.p.g(N2, "requireContext()");
                w0Var.f3(aVar.a(N2, w0.this.N3(), a10));
            } else {
                w0 w0Var2 = w0.this;
                WebViewActivity.a aVar2 = WebViewActivity.X;
                Context N22 = w0Var2.N2();
                jo.p.g(N22, "requireContext()");
                w0Var2.f3(WebViewActivity.a.b(aVar2, N22, lVar.e(), false, false, 12, null));
            }
            MRLogger M3 = w0.this.M3();
            MRLog.Companion companion = MRLog.Companion;
            w0 w0Var3 = w0.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAROUSEL_BANNER);
            builder.setTargetType(MRLog.TARGET_TYPE_BANNER);
            builder.setTargetId(MRLog.TARGET_ID_TAP);
            wn.k[] kVarArr = new wn.k[2];
            String valueOf = String.valueOf(lVar.b() + 1);
            String e10 = lVar.e();
            String a11 = lVar.a();
            String c10 = lVar.c();
            String a12 = w0Var3.I3().a();
            if (a12 == null) {
                a12 = "";
            }
            kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogBannerTargetDetail(valueOf, e10, a11, c10, a12).toJson());
            kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, w0Var3.N3());
            builder.setPayload(xn.s.m(kVarArr));
            M3.sendLog(builder.build());
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends RecyclerView.u {
        public q() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            jo.p.h(recyclerView, "recyclerView");
            super.a(recyclerView, i10);
            if (i10 == 0) {
                w0.this.Z3();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            String f10;
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int l22 = linearLayoutManager.l2();
            vb.r rVar = w0.this.K0;
            if (rVar != null) {
                rVar.N(linearLayoutManager.e2() == 0);
            }
            if (recyclerView.getScrollState() == 1) {
                w0.this.Z3();
            }
            if (jo.p.c(w0.this.O3().o().f(), a.b.f34695b) || (f10 = w0.this.O3().n().f()) == null) {
                return;
            }
            if ((f10.length() == 0) || jo.p.c(f10, "0") || jo.p.c(f10, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) || l22 + 3 < linearLayoutManager.j0()) {
                return;
            }
            w0.this.F3().i(f10);
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.a<wn.v> {
        public r() {
            super(0);
        }

        public final void a() {
            w0.this.F3().j();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogFragment$onViewCreated$6", f = "LiveCatalogFragment.kt", l = {691}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class s extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50078w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50079x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50080y;

        /* renamed from: z  reason: collision with root package name */
        public int f50081z;

        public s(ao.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:17:0x0054, B:19:0x005c, B:22:0x0065, B:27:0x0073, B:28:0x007d, B:36:0x008d, B:37:0x009c, B:39:0x00a0, B:34:0x0089, B:31:0x0083, B:25:0x006b), top: B:50:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f50081z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f50080y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f50079x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f50078w
                r8.w0 r4 = (r8.w0) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb6
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                r8.w0 r11 = r8.w0.this
                r8.x0 r11 = r8.w0.w3(r11)
                wo.x r3 = r11.m()
                r8.w0 r11 = r8.w0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb6
                r4 = r11
                r11 = r10
            L3d:
                r11.f50078w = r4     // Catch: java.lang.Throwable -> Lb6
                r11.f50079x = r3     // Catch: java.lang.Throwable -> Lb6
                r11.f50080y = r1     // Catch: java.lang.Throwable -> Lb6
                r11.f50081z = r2     // Catch: java.lang.Throwable -> Lb6
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb6
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb3
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb3
                if (r11 == 0) goto Lad
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lb3
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Lb3
                if (r11 != 0) goto L65
                goto La7
            L65:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lb3
                if (r6 == 0) goto L6b
                r6 = r2
                goto L71
            L6b:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lb3
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Lb3
            L71:
                if (r6 == 0) goto L7d
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb3
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb3
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Lb3
                goto La7
            L7d:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Lb3
                if (r6 == 0) goto L83
                r6 = r2
                goto L85
            L83:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Lb3
            L85:
                if (r6 == 0) goto L89
                r6 = r2
                goto L8b
            L89:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Lb3
            L8b:
                if (r6 == 0) goto L9c
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb3
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb3
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lb3
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> Lb3
                goto La7
            L9c:
                boolean r11 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lb3
                if (r11 == 0) goto La7
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lb3
                of.n.z(r11)     // Catch: java.lang.Throwable -> Lb3
            La7:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lad:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb3:
                r11 = move-exception
                r3 = r4
                goto Lb7
            Lb6:
                r11 = move-exception
            Lb7:
                throw r11     // Catch: java.lang.Throwable -> Lb8
            Lb8:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r8.w0.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogFragment$onViewCreated$7", f = "LiveCatalogFragment.kt", l = {691}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class t extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50082w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50083x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50084y;

        /* renamed from: z  reason: collision with root package name */
        public int f50085z;

        public t(ao.d<? super t> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f, B:24:0x0082, B:26:0x008c), top: B:39:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:39:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f50085z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f50084y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f50083x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f50082w
                r8.w0 r4 = (r8.w0) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L9e
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                r8.w0 r10 = r8.w0.this
                r8.x0 r10 = r8.w0.w3(r10)
                wo.x r3 = r10.k()
                r8.w0 r10 = r8.w0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L9e
                r4 = r10
                r10 = r9
            L3d:
                r10.f50082w = r4     // Catch: java.lang.Throwable -> L9e
                r10.f50083x = r3     // Catch: java.lang.Throwable -> L9e
                r10.f50084y = r1     // Catch: java.lang.Throwable -> L9e
                r10.f50085z = r2     // Catch: java.lang.Throwable -> L9e
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L9e
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9b
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9b
                r6 = 0
                if (r10 == 0) goto L95
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L9b
                java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L9b
                t8.s r7 = r8.w0.o3(r5)     // Catch: java.lang.Throwable -> L9b
                if (r7 != 0) goto L6e
                java.lang.String r7 = "binding"
                jo.p.v(r7)     // Catch: java.lang.Throwable -> L9b
                goto L6f
            L6e:
                r6 = r7
            L6f:
                androidx.recyclerview.widget.RecyclerView r6 = r6.B     // Catch: java.lang.Throwable -> L9b
                androidx.recyclerview.widget.RecyclerView$h r6 = r6.getAdapter()     // Catch: java.lang.Throwable -> L9b
                java.lang.String r7 = "null cannot be cast to non-null type com.dena.mirrativ.catalog.LiveCatalogAdapter"
                jo.p.f(r6, r7)     // Catch: java.lang.Throwable -> L9b
                r8.s0 r6 = (r8.s0) r6     // Catch: java.lang.Throwable -> L9b
                boolean r7 = r10.isEmpty()     // Catch: java.lang.Throwable -> L9b
                if (r7 == 0) goto L8c
                java.util.List r7 = r6.b()     // Catch: java.lang.Throwable -> L9b
                boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L9b
                if (r7 != 0) goto L8f
            L8c:
                r6.k(r10)     // Catch: java.lang.Throwable -> L9b
            L8f:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L95:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L9b:
                r10 = move-exception
                r3 = r4
                goto L9f
            L9e:
                r10 = move-exception
            L9f:
                throw r10     // Catch: java.lang.Throwable -> La0
            La0:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r8.w0.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogFragment$onViewCreated$8", f = "LiveCatalogFragment.kt", l = {691}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class u extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f50086w;

        /* renamed from: x  reason: collision with root package name */
        public Object f50087x;

        /* renamed from: y  reason: collision with root package name */
        public Object f50088y;

        /* renamed from: z  reason: collision with root package name */
        public int f50089z;

        public u(ao.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f), top: B:33:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:33:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f50089z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f50088y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f50087x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f50086w
                r8.w0 r4 = (r8.w0) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L84
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                r8.w0 r9 = r8.w0.this
                nf.o r9 = r8.w0.q3(r9)
                wo.x r3 = r9.v()
                r8.w0 r9 = r8.w0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L84
                r4 = r9
                r9 = r8
            L3d:
                r9.f50086w = r4     // Catch: java.lang.Throwable -> L84
                r9.f50087x = r3     // Catch: java.lang.Throwable -> L84
                r9.f50088y = r1     // Catch: java.lang.Throwable -> L84
                r9.f50089z = r2     // Catch: java.lang.Throwable -> L84
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L84
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
                r6 = 0
                if (r9 == 0) goto L7b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L81
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L81
                t8.s r9 = r8.w0.o3(r5)     // Catch: java.lang.Throwable -> L81
                if (r9 != 0) goto L6e
                java.lang.String r9 = "binding"
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L81
                goto L6f
            L6e:
                r6 = r9
            L6f:
                androidx.recyclerview.widget.RecyclerView r9 = r6.B     // Catch: java.lang.Throwable -> L81
                r6 = 0
                r9.x1(r6)     // Catch: java.lang.Throwable -> L81
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L81:
                r9 = move-exception
                r3 = r4
                goto L85
            L84:
                r9 = move-exception
            L85:
                throw r9     // Catch: java.lang.Throwable -> L86
            L86:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r8.w0.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.a<String> {
        public v() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = w0.this.M2().getString("BUNDLE_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.a<r0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50091w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50092x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50093y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50091w = componentCallbacks;
            this.f50092x = aVar;
            this.f50093y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [r8.r0, java.lang.Object] */
        @Override // io.a
        public final r0 invoke() {
            ComponentCallbacks componentCallbacks = this.f50091w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(r0.class), this.f50092x, this.f50093y);
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50094w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50095x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50096y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50094w = componentCallbacks;
            this.f50095x = aVar;
            this.f50096y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f50094w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f50095x, this.f50096y);
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50097w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50098x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50099y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50097w = componentCallbacks;
            this.f50098x = aVar;
            this.f50099y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f50097w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f50098x, this.f50099y);
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50100w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f50101x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f50102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f50100w = componentCallbacks;
            this.f50101x = aVar;
            this.f50102y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f50100w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f50101x, this.f50102y);
        }
    }

    public w0() {
        uo.b0 b10;
        b bVar = new b();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.D0 = wn.g.b(iVar, new w(this, null, bVar));
        i0 i0Var = new i0();
        c0 c0Var = new c0(this);
        xq.a a10 = gq.a.a(this);
        d0 d0Var = new d0(c0Var);
        this.E0 = androidx.fragment.app.e0.a(this, jo.f0.b(x0.class), new f0(d0Var), new e0(c0Var, null, i0Var, a10));
        this.F0 = wn.g.b(iVar, new x(this, null, null));
        this.G0 = wn.g.b(iVar, new y(this, null, null));
        this.H0 = wn.g.b(iVar, new z(this, null, null));
        this.I0 = wn.g.b(iVar, new a0(this, null, null));
        this.J0 = wn.g.b(iVar, new b0(this, null, null));
        b10 = i2.b(null, 1, null);
        this.N0 = b10;
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: r8.t0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                w0.S3(w0.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…erer, result.data))\n    }");
        this.O0 = I2;
    }

    public static final void Q3(w0 w0Var) {
        jo.p.h(w0Var, "this$0");
        w0Var.L0 = false;
        w0Var.Y3();
        t8.s sVar = w0Var.f50041y0;
        if (sVar == null) {
            jo.p.v("binding");
            sVar = null;
        }
        sVar.C.setRefreshing(false);
        w0Var.F3().j();
    }

    public static final void R3(w0 w0Var, ha.a aVar) {
        jo.p.h(w0Var, "this$0");
        t8.s sVar = null;
        if (aVar instanceof a.d) {
            t8.s sVar2 = w0Var.f50041y0;
            if (sVar2 == null) {
                jo.p.v("binding");
            } else {
                sVar = sVar2;
            }
            sVar.D.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            t8.s sVar3 = w0Var.f50041y0;
            if (sVar3 == null) {
                jo.p.v("binding");
            } else {
                sVar = sVar3;
            }
            sVar.D.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                t8.s sVar4 = w0Var.f50041y0;
                if (sVar4 == null) {
                    jo.p.v("binding");
                    sVar4 = null;
                }
                sVar4.D.b(new StatusView.b.d(w0Var.U0(h1.text_no_broadcast), 0.0f, 2, null));
            } else if ((aVar instanceof a.C0439a) && w0Var.O3().j().isEmpty()) {
                t8.s sVar5 = w0Var.f50041y0;
                if (sVar5 == null) {
                    jo.p.v("binding");
                } else {
                    sVar = sVar5;
                }
                StatusView statusView = sVar.D;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = w0Var.U0(h1.f49918a);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new r()));
            }
        }
    }

    public static final void S3(w0 w0Var, androidx.activity.result.a aVar) {
        jo.p.h(w0Var, "this$0");
        tb.c K3 = w0Var.K3();
        Context N2 = w0Var.N2();
        jo.p.g(N2, "requireContext()");
        w0Var.f3(K3.x(N2, w0Var.N3(), aVar.a()));
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        t8.s T = t8.s.T(LayoutInflater.from(N2()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        this.f50041y0 = T;
        if (T == null) {
            jo.p.v("binding");
            T = null;
        }
        View u10 = T.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final r0 F3() {
        return (r0) this.D0.getValue();
    }

    public final String G3() {
        return (String) this.A0.getValue();
    }

    public final String H3() {
        String a10 = I3().a();
        if (a10 == null) {
            return "";
        }
        return a10.length() == 0 ? "other" : a10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        F3().g();
        this.K0 = null;
        super.I1();
    }

    public final wb.a I3() {
        return (wb.a) this.C0.getValue();
    }

    public final nf.o J3() {
        return (nf.o) this.H0.getValue();
    }

    public final tb.c K3() {
        return (tb.c) this.F0.getValue();
    }

    public final LiveCatalogVisibleLogger L3() {
        return (LiveCatalogVisibleLogger) this.J0.getValue();
    }

    public final MRLogger M3() {
        return (MRLogger) this.G0.getValue();
    }

    public final String N3() {
        return (String) this.B0.getValue();
    }

    public final x0 O3() {
        return (x0) this.E0.getValue();
    }

    public final of.k P3() {
        return (of.k) this.I0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        t8.s sVar = null;
        d2.a.a(this.N0, null, 1, null);
        t8.s sVar2 = this.f50041y0;
        if (sVar2 == null) {
            jo.p.v("binding");
        } else {
            sVar = sVar2;
        }
        sVar.B.t();
        Y3();
    }

    public final void T3(s8.e eVar) {
        String c10;
        MRLogger M3 = M3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_CATALOG_TAP);
        builder.setPageId(N3());
        wn.k[] kVarArr = new wn.k[4];
        int f10 = eVar.f();
        String b10 = eVar.b();
        int e10 = eVar.e();
        s8.k a10 = eVar.a();
        String str = (a10 == null || (c10 = a10.c()) == null) ? "" : c10;
        String H3 = H3();
        String i10 = eVar.i();
        Integer c11 = eVar.c();
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CatalogTargetDetail(b10, f10, e10, str, H3, i10, c11 != null ? c11.toString() : null).toJson());
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, eVar.b());
        kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, eVar.d());
        String h10 = eVar.h();
        kVarArr[3] = wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, h10 != null ? h10 : "");
        builder.setPayload(xn.s.m(kVarArr));
        M3.sendLog(builder.build());
    }

    public final void U3(s8.e eVar) {
        LiveCatalogVisibleLogger L3 = L3();
        String N3 = N3();
        String b10 = eVar.b();
        int f10 = eVar.f();
        int e10 = eVar.e();
        s8.k a10 = eVar.a();
        String str = (a10 == null || (str = a10.c()) == null) ? "" : "";
        String H3 = H3();
        String d10 = eVar.d();
        String i10 = eVar.i();
        Integer c10 = eVar.c();
        L3.sendLiveCatalogVisibleLog(N3, b10, f10, e10, str, H3, d10, i10, c10 != null ? c10.toString() : null);
    }

    public final void V3(LiveBasicParams liveBasicParams, int i10) {
        String g02 = xn.a0.g0(xn.s.o(N3(), Integer.valueOf(i10), I3().a()), "/", null, null, 0, null, null, 62, null);
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        new ce.x(N2, new g0()).a(liveBasicParams, g02);
    }

    public final void W3(int i10) {
        d2 d10;
        if (i10 == O3().l()) {
            return;
        }
        Object a02 = xn.a0.a0(O3().j(), i10);
        s8.e eVar = a02 instanceof s8.e ? (s8.e) a02 : null;
        if (eVar != null && eVar.g()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.M0 > 1000) {
                Y3();
                F3().k(eVar.b(), i10, I3().a());
                this.M0 = currentTimeMillis;
                return;
            }
            d2.a.a(this.N0, null, 1, null);
            d10 = uo.l.d(uo.r0.a(uo.g1.c()), null, null, new h0(null), 3, null);
            this.N0 = d10;
        }
    }

    public final void X3(LiveBasicParams liveBasicParams) {
        tb.c K3 = K3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(K3.s(N2, liveBasicParams.getOwner().getUserId(), N3()));
    }

    public final void Y3() {
        List<s8.a> j10 = O3().j();
        int l10 = O3().l();
        if (l10 != -1) {
            s8.a aVar = j10.get(l10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogHasLiveBindModel");
            F3().l(((s8.e) aVar).b(), l10, I3().a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        Z3();
        t8.s sVar = this.f50041y0;
        RecyclerView.u uVar = null;
        if (sVar == null) {
            jo.p.v("binding");
            sVar = null;
        }
        sVar.B.t();
        t8.s sVar2 = this.f50041y0;
        if (sVar2 == null) {
            jo.p.v("binding");
            sVar2 = null;
        }
        RecyclerView recyclerView = sVar2.B;
        RecyclerView.u uVar2 = this.f50042z0;
        if (uVar2 == null) {
            jo.p.v("scrollListener");
        } else {
            uVar = uVar2;
        }
        recyclerView.k(uVar);
    }

    public final void Z3() {
        t8.s sVar = this.f50041y0;
        if (sVar == null) {
            jo.p.v("binding");
            sVar = null;
        }
        RecyclerView.p layoutManager = sVar.B.getLayoutManager();
        jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int e22 = linearLayoutManager.e2();
        int j22 = linearLayoutManager.j2();
        if (e22 == -1 || j22 == -1) {
            return;
        }
        if (e22 == 0) {
            if (linearLayoutManager.j0() == 1) {
                W3(0);
                return;
            }
            List<s8.a> j10 = O3().j();
            for (int i10 = 0; i10 < 2; i10++) {
                Object a02 = xn.a0.a0(j10, i10);
                s8.e eVar = a02 instanceof s8.e ? (s8.e) a02 : null;
                if (eVar != null && eVar.g()) {
                    W3(i10);
                    return;
                }
            }
            return;
        }
        W3(e22 + ((j22 - e22) / 2));
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        t8.s sVar = this.f50041y0;
        if (sVar == null) {
            jo.p.v("binding");
            sVar = null;
        }
        sVar.C.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: r8.v0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                w0.Q3(w0.this);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(N2());
        t8.s sVar2 = this.f50041y0;
        if (sVar2 == null) {
            jo.p.v("binding");
            sVar2 = null;
        }
        sVar2.B.setLayoutManager(linearLayoutManager);
        int b10 = de.e.b(this, 12);
        int dimensionPixelSize = O0().getDimensionPixelSize(c1.f49840e);
        t8.s sVar3 = this.f50041y0;
        if (sVar3 == null) {
            jo.p.v("binding");
            sVar3 = null;
        }
        sVar3.B.g(new e(dimensionPixelSize, b10));
        t8.s sVar4 = this.f50041y0;
        if (sVar4 == null) {
            jo.p.v("binding");
            sVar4 = null;
        }
        RecyclerView recyclerView = sVar4.B;
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        s0 s0Var = new s0(a12);
        s0Var.i(new h());
        s0Var.d(new i());
        s0Var.m(new j());
        s0Var.o(new k());
        s0Var.l(new l());
        s0Var.n(new m());
        s0Var.c(new n());
        s0Var.g(new o());
        s0Var.h(new p());
        s0Var.f(new f());
        s0Var.j(new g());
        recyclerView.setAdapter(s0Var);
        this.f50042z0 = new q();
        t8.s sVar5 = this.f50041y0;
        if (sVar5 == null) {
            jo.p.v("binding");
            sVar5 = null;
        }
        RecyclerView recyclerView2 = sVar5.B;
        RecyclerView.u uVar = this.f50042z0;
        if (uVar == null) {
            jo.p.v("scrollListener");
            uVar = null;
        }
        recyclerView2.k(uVar);
        O3().o().i(a1(), new androidx.lifecycle.f0() { // from class: r8.u0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                w0.R3(w0.this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new s(null), 3, null);
        uo.l.d(this, null, null, new t(null), 3, null);
        uo.l.d(this, null, null, new u(null), 3, null);
        F3().j();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f50040x0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.K0 = H0 instanceof vb.r ? (vb.r) H0 : null;
    }
}
