package ya;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.CampaignButtonTapTargetDetail;
import com.dena.mirrorman.clientlog.logs.detail.CampaignModalButtonTapTargetDetail;
import com.dena.mirrorman.clientlog.logs.detail.ShareAcpnShareButtonClickTargetDetail;
import com.dena.mirrorman.feature.app.AppPageActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import com.dena.mirrorman.net.api.response.ShareTwitter;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.net.api.response.campaign.CampaignDetailResponse;
import com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceivePrizesResponse;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import gf.c0;
import ha.a;
import hf.o0;
import ie.f;
import java.util.List;
import jf.b0;
import kq.a;
import nd.f1;
import nd.i1;
import org.greenrobot.eventbus.ThreadMode;
import p.d;
import uo.q0;
import uo.r0;
import yd.t1;

/* loaded from: classes2.dex */
public final class k extends com.google.android.material.bottomsheet.b implements l0, f.b, q0 {
    public final /* synthetic */ da.j O0 = new da.j();
    public final AutoClearedValue P0 = nd.a.a(this);
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public final wn.f Y0;
    public final wn.f Z0;

    /* renamed from: a1  reason: collision with root package name */
    public FragmentRunner f61453a1;

    /* renamed from: b1  reason: collision with root package name */
    public final wn.f f61454b1;

    /* renamed from: c1  reason: collision with root package name */
    public final wn.f f61455c1;

    /* renamed from: e1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f61451e1 = {jo.f0.d(new jo.s(k.class, "binding", "getBinding()Lcom/dena/mirrativ/otherfeature/databinding/BottomSheetDialogFragmentCampaignDetailBinding;", 0))};

    /* renamed from: d1  reason: collision with root package name */
    public static final a f61450d1 = new a(null);

    /* renamed from: f1  reason: collision with root package name */
    public static final int f61452f1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(String str, String str2) {
            jo.p.h(str, "fromReferer");
            jo.p.h(str2, "campaignId");
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_FROM_REFERER", str);
            bundle.putString("EXTRA_CAMPAIGN_ID", str2);
            kVar.V2(bundle);
            return kVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f61456w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(io.a aVar) {
            super(0);
            this.f61456w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f61456w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = k.this.M2().getString("EXTRA_CAMPAIGN_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f61458w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61459x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61460y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f61461z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f61458w = aVar;
            this.f61459x = aVar2;
            this.f61460y = aVar3;
            this.f61461z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f61458w;
            vq.a aVar2 = this.f61459x;
            io.a aVar3 = this.f61460y;
            xq.a aVar4 = this.f61461z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = k.this.M2().getString("EXTRA_FROM_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f61463w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar) {
            super(0);
            this.f61463w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f61463w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<wn.v> {
        public d() {
            super(0);
        }

        public final void a() {
            k.this.n3();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f61465w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(Fragment fragment) {
            super(0);
            this.f61465w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f61465w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CampaignDetailResponse f61467x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CampaignDetailResponse campaignDetailResponse) {
            super(0);
            this.f61467x = campaignDetailResponse;
        }

        public final void a() {
            be.r a10;
            k.this.W3().f().p(this.f61467x.getApp().getAppId());
            k.this.W3().h().p(this.f61467x.getApp().getTitle());
            k.this.W3().g().p(this.f61467x.getApp().getIconUrl());
            k.this.W3().J().p(Boolean.FALSE);
            a10 = be.r.f18061c1.a(Referer.Notice.CAMPAIGN, this.f61467x.getApp().getAppUserIdLabel(), this.f61467x.getApp().isAppUserIdHidden(), this.f61467x.getApp().getAppUserId(), this.f61467x.getApp().isPublishedUserId(), (r25 & 32) != 0 ? false : false, (r25 & 64) != 0 ? f1.text_view_game_id_add_app_title_v2 : wa.j.H, (r25 & 128) != 0 ? f1.text_view_game_id_add_app_title_landscape_v2 : 0, (r25 & 256) != 0, (r25 & 512) != 0 ? false : true);
            a10.z3(k.this.p0(), "AppUserIdSettingDialog");
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            CampaignDetailResponse campaignDetailResponse = this.f61467x;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GAME_ID_EDIT_IMP);
            builder.setTargetId(campaignDetailResponse.getApp().getAppId());
            builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
            builder.setPageId(Referer.Notice.CAMPAIGN);
            d42.sendLog(builder.build());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f61468w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(io.a aVar) {
            super(0);
            this.f61468w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f61468w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CampaignDetailResponse f61470x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CampaignDetailResponse campaignDetailResponse) {
            super(0);
            this.f61470x = campaignDetailResponse;
        }

        public final void a() {
            be.r a10;
            k.this.W3().f().p(this.f61470x.getApp().getAppId());
            k.this.W3().p().p(this.f61470x.getApp().getAppUserId());
            k.this.W3().h().p(this.f61470x.getApp().getTitle());
            k.this.W3().g().p(this.f61470x.getApp().getIconUrl());
            k.this.W3().J().p(Boolean.FALSE);
            a10 = be.r.f18061c1.a(Referer.Notice.CAMPAIGN, this.f61470x.getApp().getAppUserIdLabel(), this.f61470x.getApp().isAppUserIdHidden(), this.f61470x.getApp().getAppUserId(), this.f61470x.getApp().isPublishedUserId(), (r25 & 32) != 0 ? false : false, (r25 & 64) != 0 ? f1.text_view_game_id_add_app_title_v2 : wa.j.H, (r25 & 128) != 0 ? f1.text_view_game_id_add_app_title_landscape_v2 : 0, (r25 & 256) != 0, (r25 & 512) != 0 ? false : true);
            a10.z3(k.this.p0(), "AppUserIdSettingDialog");
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            CampaignDetailResponse campaignDetailResponse = this.f61470x;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GAME_ID_EDIT_IMP);
            builder.setTargetId(campaignDetailResponse.getApp().getAppId());
            builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
            builder.setPageId(Referer.Notice.CAMPAIGN);
            d42.sendLog(builder.build());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f61471w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61472x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61473y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f61474z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f61471w = aVar;
            this.f61472x = aVar2;
            this.f61473y = aVar3;
            this.f61474z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f61471w;
            vq.a aVar2 = this.f61472x;
            io.a aVar3 = this.f61473y;
            xq.a aVar4 = this.f61474z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ya.a0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<Integer, wn.v> {
        public g() {
            super(1);
        }

        public final void a(int i10) {
            if (k.this.Z3().t()) {
                return;
            }
            k.this.Y3().e(k.this.a4(), i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f61476w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(io.a aVar) {
            super(0);
            this.f61476w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f61476w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CampaignDetailResponse f61478x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CampaignDetailResponse campaignDetailResponse) {
            super(0);
            this.f61478x = campaignDetailResponse;
        }

        public final void a() {
            k.this.n3();
            k kVar = k.this;
            tb.c c42 = kVar.c4();
            Context N2 = k.this.N2();
            jo.p.g(N2, "requireContext()");
            Intent v10 = c42.v(N2, this.f61478x.getApp().getAppId(), null);
            v10.addFlags(67108864);
            kVar.f3(v10);
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            k kVar2 = k.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP);
            builder.setTargetId(kVar2.a4());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CampaignButtonTapTargetDetail(CampaignModalButtonTapTargetDetail.BROADCAST.getType()).toJson())));
            d42.sendLog(builder.build());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailBottomSheetDialogFragment$yesCustomYesNoDialog$1", f = "CampaignDetailBottomSheetDialogFragment.kt", l = {471}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h0 extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f61479w;

        public h0(ao.d<? super h0> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h0(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            String U0;
            Status status;
            MRError mirrativError;
            Object c10 = bo.c.c();
            int i10 = this.f61479w;
            if (i10 == 0) {
                wn.m.b(obj);
                o0 g42 = k.this.g4();
                androidx.fragment.app.h L2 = k.this.L2();
                jo.p.g(L2, "requireActivity()");
                FragmentManager I0 = k.this.I0();
                jo.p.g(I0, "parentFragmentManager");
                this.f61479w = 1;
                obj = g42.j(L2, I0, Referer.DEEPLINK, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            wn.p pVar = (wn.p) obj;
            o0.b bVar = (o0.b) pVar.a();
            Social.SocialAccount socialAccount = (Social.SocialAccount) pVar.b();
            in.x xVar = (in.x) pVar.c();
            if (bVar == o0.b.Failed) {
                of.n nVar = of.n.f45411a;
                androidx.fragment.app.h L22 = k.this.L2();
                if (socialAccount == null || (status = socialAccount.getStatus()) == null || (mirrativError = status.getMirrativError()) == null || (U0 = mirrativError.getMessage()) == null) {
                    U0 = k.this.U0(wa.j.f58555q);
                    jo.p.g(U0, "getString(R.string.text_network_error)");
                }
                nVar.B(L22, U0, false);
            } else if (bVar == o0.b.Success) {
                jo.p.e(socialAccount);
                Integer isFollowOfficialTwitter = socialAccount.isFollowOfficialTwitter();
                if (isFollowOfficialTwitter != null && isFollowOfficialTwitter.intValue() == 0) {
                    c0.a aVar = gf.c0.Q0;
                    jo.p.e(xVar);
                    String c11 = xVar.c();
                    jo.p.g(c11, "twitterSession!!.userName");
                    aVar.a(Referer.DEEPLINK, c11).z3(k.this.I0(), "FollowOfficialTwitterAccountDialog");
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ CampaignDetailResponse f61482x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(CampaignDetailResponse campaignDetailResponse) {
            super(0);
            this.f61482x = campaignDetailResponse;
        }

        public final void a() {
            k.this.n3();
            k kVar = k.this;
            AppPageActivity.a aVar = AppPageActivity.f25660c0;
            Context N2 = kVar.N2();
            jo.p.g(N2, "requireContext()");
            kVar.f3(aVar.b(N2, this.f61482x.getApp().getAppId(), false, Referer.Notice.CAMPAIGN, null));
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            k kVar2 = k.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP);
            builder.setTargetId(kVar2.a4());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CampaignButtonTapTargetDetail(CampaignModalButtonTapTargetDetail.VIEW.getType()).toJson())));
            d42.sendLog(builder.build());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<wn.v> {
        public j() {
            super(0);
        }

        public final void a() {
            ShareTwitter shareTwitter;
            if (!k.this.f4().a().d()) {
                if (k.this.i4().p()) {
                    CampaignDetailResponse f10 = k.this.Z3().m().f();
                    if (f10 != null && (shareTwitter = f10.getShareTwitter()) != null) {
                        k0.Q0.a(ya.h0.E.a(shareTwitter)).z3(k.this.p0(), "CampaignTwitterShareDialog");
                    }
                    MRLogger d42 = k.this.d4();
                    MRLog.Companion companion = MRLog.Companion;
                    k kVar = k.this;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SHARE_ACPN_SHARE_BUTTON_CLICK);
                    builder.setTargetId(Live.COMMENT_SHARE_TYPE_SHARE);
                    builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new ShareAcpnShareButtonClickTargetDetail(kVar.a4()).toJson())));
                    d42.sendLog(builder.build());
                    return;
                }
                f.a aVar = ie.f.V0;
                String U0 = k.this.U0(wa.j.f58552l);
                String U02 = k.this.U0(wa.j.I);
                String U03 = k.this.U0(wa.j.f58549f);
                jo.p.g(U0, "getString(R.string.text_…_to_sign_in_with_twitter)");
                aVar.a(U0, U02, U03, null, true).z3(k.this.p0(), "DIALOG_TAG_TWITTER_LINK");
                MRLogger d43 = k.this.d4();
                MRLog.Companion companion2 = MRLog.Companion;
                k kVar2 = k.this;
                MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_SHARE_ACPN_SHARE_BUTTON_CLICK);
                builder2.setTargetId(Referer.Connect);
                builder2.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new ShareAcpnShareButtonClickTargetDetail(kVar2.a4()).toJson())));
                d43.sendLog(builder2.build());
                return;
            }
            t1.a aVar2 = t1.f61795x;
            Context N2 = k.this.N2();
            jo.p.g(N2, "requireContext()");
            String U04 = k.this.U0(wa.j.text_preven_share_while_streaming);
            jo.p.g(U04, "getString(R.string.text_…en_share_while_streaming)");
            aVar2.a(N2, U04);
            MRLogger d44 = k.this.d4();
            MRLog.Companion companion3 = MRLog.Companion;
            k kVar3 = k.this;
            MRLog.Builder builder3 = new MRLog.Builder(MRLog.ACTION_TYPE_SHARE_ACPN_SHARE_BUTTON_CLICK);
            builder3.setTargetId(MRLog.TARGET_TYPE_LIVE);
            builder3.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new ShareAcpnShareButtonClickTargetDetail(kVar3.a4()).toJson())));
            d44.sendLog(builder3.build());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* renamed from: ya.k$k  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1048k extends jo.q implements io.l<String, wn.v> {
        public C1048k() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "url");
            jf.b0 a10 = k.this.h4().a(str);
            if (!(a10 instanceof b0.l0)) {
                k kVar = k.this;
                HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                Context N2 = kVar.N2();
                jo.p.g(N2, "requireContext()");
                kVar.f3(aVar.a(N2, Referer.Notice.CAMPAIGN, a10));
                return;
            }
            k kVar2 = k.this;
            WebViewActivity.a aVar2 = WebViewActivity.X;
            Context N22 = kVar2.N2();
            jo.p.g(N22, "requireContext()");
            kVar2.f3(WebViewActivity.a.b(aVar2, N22, str, false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements ya.t {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CampaignDetailResponse f61486b;

        public l(CampaignDetailResponse campaignDetailResponse) {
            this.f61486b = campaignDetailResponse;
        }

        @Override // ya.t
        public void a() {
            k.this.q4(this.f61486b.getApp().getTwitterUrl());
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            k kVar = k.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP);
            builder.setTargetId(kVar.a4());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CampaignButtonTapTargetDetail(CampaignModalButtonTapTargetDetail.TWITTER.getType()).toJson())));
            d42.sendLog(builder.build());
        }

        @Override // ya.t
        public void b() {
            k.this.q4(this.f61486b.getApp().getOtherSite2());
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            k kVar = k.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP);
            builder.setTargetId(kVar.a4());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CampaignButtonTapTargetDetail(CampaignModalButtonTapTargetDetail.BUTTON2.getType()).toJson())));
            d42.sendLog(builder.build());
        }

        @Override // ya.t
        public void c() {
            k.this.q4(this.f61486b.getApp().getOtherSite1());
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            k kVar = k.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP);
            builder.setTargetId(kVar.a4());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CampaignButtonTapTargetDetail(CampaignModalButtonTapTargetDetail.BUTTON1.getType()).toJson())));
            d42.sendLog(builder.build());
        }

        @Override // ya.t
        public void d() {
            k.this.q4(this.f61486b.getApp().getSiteUrl());
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            k kVar = k.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP);
            builder.setTargetId(kVar.a4());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CampaignButtonTapTargetDetail(CampaignModalButtonTapTargetDetail.OFFICIAL.getType()).toJson())));
            d42.sendLog(builder.build());
        }

        @Override // ya.t
        public void e() {
            k.this.q4(this.f61486b.getApp().getDownloadUrl());
            MRLogger d42 = k.this.d4();
            MRLog.Companion companion = MRLog.Companion;
            k kVar = k.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_BUTTON_TAP);
            builder.setTargetId(kVar.a4());
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new CampaignButtonTapTargetDetail(CampaignModalButtonTapTargetDetail.DOWNLOAD.getType()).toJson())));
            d42.sendLog(builder.build());
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<wn.v> {
        public m() {
            super(0);
        }

        public final void a() {
            k.this.Y3().f(k.this.a4());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailBottomSheetDialogFragment$observeStoreValues$6", f = "CampaignDetailBottomSheetDialogFragment.kt", l = {488}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f61488w;

        /* renamed from: x  reason: collision with root package name */
        public Object f61489x;

        /* renamed from: y  reason: collision with root package name */
        public Object f61490y;

        /* renamed from: z  reason: collision with root package name */
        public int f61491z;

        public n(ao.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
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
                int r1 = r10.f61491z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f61490y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f61489x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f61488w
                ya.k r4 = (ya.k) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L7b
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
                ya.k r11 = ya.k.this
                ya.a0 r11 = ya.k.M3(r11)
                wo.x r3 = r11.p()
                ya.k r11 = ya.k.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
                r4 = r11
                r11 = r10
            L3d:
                r11.f61488w = r4     // Catch: java.lang.Throwable -> L7b
                r11.f61489x = r3     // Catch: java.lang.Throwable -> L7b
                r11.f61490y = r1     // Catch: java.lang.Throwable -> L7b
                r11.f61491z = r2     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> L7b
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
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L78
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L78
                if (r11 == 0) goto L72
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L78
                java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L78
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L78
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> L78
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> L78
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L72:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            L78:
                r11 = move-exception
                r3 = r4
                goto L7c
            L7b:
                r11 = move-exception
            L7c:
                throw r11     // Catch: java.lang.Throwable -> L7d
            L7d:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ya.k.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailBottomSheetDialogFragment$observeStoreValues$7", f = "CampaignDetailBottomSheetDialogFragment.kt", l = {488}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f61492w;

        /* renamed from: x  reason: collision with root package name */
        public Object f61493x;

        /* renamed from: y  reason: collision with root package name */
        public Object f61494y;

        /* renamed from: z  reason: collision with root package name */
        public int f61495z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ CampaignMissionReceivePrizesResponse f61496w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k f61497x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CampaignMissionReceivePrizesResponse campaignMissionReceivePrizesResponse, k kVar) {
                super(0);
                this.f61496w = campaignMissionReceivePrizesResponse;
                this.f61497x = kVar;
            }

            public final void a() {
                za.o.N0.a(this.f61496w.getTitle(), this.f61496w.getDescription(), this.f61496w.getImageUrl()).z3(this.f61497x.p0(), "CampaignMissionReceivePrizesDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0074), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f61495z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f61494y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f61493x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f61492w
                ya.k r4 = (ya.k) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L8b
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
                ya.k r10 = ya.k.this
                ya.a0 r10 = ya.k.M3(r10)
                wo.x r3 = r10.r()
                ya.k r10 = ya.k.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L8b
                r4 = r10
                r10 = r9
            L3d:
                r10.f61492w = r4     // Catch: java.lang.Throwable -> L8b
                r10.f61493x = r3     // Catch: java.lang.Throwable -> L8b
                r10.f61494y = r1     // Catch: java.lang.Throwable -> L8b
                r10.f61495z = r2     // Catch: java.lang.Throwable -> L8b
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L8b
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
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L88
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L88
                if (r10 == 0) goto L82
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L88
                wn.k r10 = (wn.k) r10     // Catch: java.lang.Throwable -> L88
                java.lang.Object r6 = r10.a()     // Catch: java.lang.Throwable -> L88
                com.dena.mirrorman.net.api.response.campaign.CampaignMission r6 = (com.dena.mirrorman.net.api.response.campaign.CampaignMission) r6     // Catch: java.lang.Throwable -> L88
                java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> L88
                com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceivePrizesResponse r10 = (com.dena.mirrorman.net.api.response.campaign.CampaignMissionReceivePrizesResponse) r10     // Catch: java.lang.Throwable -> L88
                com.dena.mirrorman.util.FragmentRunner r6 = ya.k.O3(r5)     // Catch: java.lang.Throwable -> L88
                if (r6 == 0) goto L7c
                ya.k$o$a r7 = new ya.k$o$a     // Catch: java.lang.Throwable -> L88
                r7.<init>(r10, r5)     // Catch: java.lang.Throwable -> L88
                r6.c(r7)     // Catch: java.lang.Throwable -> L88
            L7c:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L82:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L88:
                r10 = move-exception
                r3 = r4
                goto L8c
            L8b:
                r10 = move-exception
            L8c:
                throw r10     // Catch: java.lang.Throwable -> L8d
            L8d:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ya.k.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.otherfeature.campaign.CampaignDetailBottomSheetDialogFragment$observeStoreValues$8", f = "CampaignDetailBottomSheetDialogFragment.kt", l = {488, 445}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f61498w;

        /* renamed from: x  reason: collision with root package name */
        public Object f61499x;

        /* renamed from: y  reason: collision with root package name */
        public Object f61500y;

        /* renamed from: z  reason: collision with root package name */
        public int f61501z;

        public p(ao.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:7:0x001b, B:26:0x0081, B:28:0x008f, B:16:0x004f, B:20:0x0061, B:22:0x0069, B:31:0x0095, B:12:0x0035, B:15:0x004a), top: B:42:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:7:0x001b, B:26:0x0081, B:28:0x008f, B:16:0x004f, B:20:0x0061, B:22:0x0069, B:31:0x0095, B:12:0x0035, B:15:0x004a), top: B:42:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #1 {all -> 0x009f, blocks: (B:7:0x001b, B:26:0x0081, B:28:0x008f, B:16:0x004f, B:20:0x0061, B:22:0x0069, B:31:0x0095, B:12:0x0035, B:15:0x004a), top: B:42:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:26:0x0081). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f61501z
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L29
                if (r1 != r3) goto L21
                java.lang.Object r1 = r11.f61500y
                wo.k r1 = (wo.k) r1
                java.lang.Object r5 = r11.f61499x
                wo.x r5 = (wo.x) r5
                java.lang.Object r6 = r11.f61498w
                ya.k r6 = (ya.k) r6
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L9f
                r12 = r6
                r6 = r11
                goto L81
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                java.lang.Object r1 = r11.f61500y
                wo.k r1 = (wo.k) r1
                java.lang.Object r5 = r11.f61499x
                wo.x r5 = (wo.x) r5
                java.lang.Object r6 = r11.f61498w
                ya.k r6 = (ya.k) r6
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L9f
                r7 = r6
                r6 = r11
                goto L61
            L3b:
                wn.m.b(r12)
                ya.k r12 = ya.k.this
                ya.a0 r12 = ya.k.M3(r12)
                wo.x r5 = r12.q()
                ya.k r12 = ya.k.this
                wo.k r1 = r5.iterator()     // Catch: java.lang.Throwable -> L9f
                r6 = r11
            L4f:
                r6.f61498w = r12     // Catch: java.lang.Throwable -> L9f
                r6.f61499x = r5     // Catch: java.lang.Throwable -> L9f
                r6.f61500y = r1     // Catch: java.lang.Throwable -> L9f
                r6.f61501z = r4     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L9f
                if (r7 != r0) goto L5e
                return r0
            L5e:
                r10 = r7
                r7 = r12
                r12 = r10
            L61:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L9f
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L9f
                if (r12 == 0) goto L99
                java.lang.Object r12 = r1.next()     // Catch: java.lang.Throwable -> L9f
                com.dena.mirrorman.net.api.response.AppUserDetailResponse r12 = (com.dena.mirrorman.net.api.response.AppUserDetailResponse) r12     // Catch: java.lang.Throwable -> L9f
                r8 = 300(0x12c, double:1.48E-321)
                r6.f61498w = r7     // Catch: java.lang.Throwable -> L9f
                r6.f61499x = r5     // Catch: java.lang.Throwable -> L9f
                r6.f61500y = r1     // Catch: java.lang.Throwable -> L9f
                r6.f61501z = r3     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r12 = uo.b1.a(r8, r6)     // Catch: java.lang.Throwable -> L9f
                if (r12 != r0) goto L80
                return r0
            L80:
                r12 = r7
            L81:
                androidx.fragment.app.FragmentManager r7 = r12.p0()     // Catch: java.lang.Throwable -> L9f
                java.lang.String r8 = "AppUserIdSettingDialog"
                androidx.fragment.app.Fragment r7 = r7.e0(r8)     // Catch: java.lang.Throwable -> L9f
                boolean r8 = r7 instanceof be.r     // Catch: java.lang.Throwable -> L9f
                if (r8 == 0) goto L92
                be.r r7 = (be.r) r7     // Catch: java.lang.Throwable -> L9f
                goto L93
            L92:
                r7 = r2
            L93:
                if (r7 == 0) goto L4f
                r7.n3()     // Catch: java.lang.Throwable -> L9f
                goto L4f
            L99:
                wo.n.a(r5, r2)
                wn.v r12 = wn.v.f59242a
                return r12
            L9f:
                r12 = move-exception
                throw r12     // Catch: java.lang.Throwable -> La1
            La1:
                r0 = move-exception
                wo.n.a(r5, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ya.k.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends RecyclerView.o {
        public q() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            ud.l lVar;
            jo.p.h(rect, "outRect");
            jo.p.h(view, "view");
            jo.p.h(recyclerView, "parent");
            jo.p.h(b0Var, "state");
            super.g(rect, view, recyclerView, b0Var);
            int f02 = recyclerView.f0(view);
            k kVar = k.this;
            List<ud.l> f10 = kVar.Z3().n().f();
            rect.top = de.e.b(kVar, (f10 == null || (lVar = (ud.l) xn.a0.a0(f10, f02)) == null) ? 0 : lVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<ya.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61503w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61504x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61505y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61503w = componentCallbacks;
            this.f61504x = aVar;
            this.f61505y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ya.a, java.lang.Object] */
        @Override // io.a
        public final ya.a invoke() {
            ComponentCallbacks componentCallbacks = this.f61503w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ya.a.class), this.f61504x, this.f61505y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61506w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61507x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61508y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61506w = componentCallbacks;
            this.f61507x = aVar;
            this.f61508y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f61506w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f61507x, this.f61508y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61509w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61510x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61511y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61509w = componentCallbacks;
            this.f61510x = aVar;
            this.f61511y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f61509w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ServerConfig.class), this.f61510x, this.f61511y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61512w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61513x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61514y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61512w = componentCallbacks;
            this.f61513x = aVar;
            this.f61514y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f61512w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f61513x, this.f61514y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61515w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61516x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61517y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61515w = componentCallbacks;
            this.f61516x = aVar;
            this.f61517y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.o0, java.lang.Object] */
        @Override // io.a
        public final o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f61515w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(o0.class), this.f61516x, this.f61517y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61518w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61519x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61520y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61518w = componentCallbacks;
            this.f61519x = aVar;
            this.f61520y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f61518w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f61519x, this.f61520y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61521w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61522x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61523y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61521w = componentCallbacks;
            this.f61522x = aVar;
            this.f61523y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f61521w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f61522x, this.f61523y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61524w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61525x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61526y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61524w = componentCallbacks;
            this.f61525x = aVar;
            this.f61526y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f61524w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f61525x, this.f61526y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f61527w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Fragment fragment) {
            super(0);
            this.f61527w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f61527w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f61527w.L2());
        }
    }

    public k() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new r(this, null, null));
        d0 d0Var = new d0(this);
        xq.a a10 = gq.a.a(this);
        e0 e0Var = new e0(d0Var);
        this.R0 = androidx.fragment.app.e0.a(this, jo.f0.b(ya.a0.class), new g0(e0Var), new f0(d0Var, null, null, a10));
        this.S0 = wn.g.b(iVar, new s(this, null, null));
        this.T0 = wn.g.b(iVar, new t(this, null, null));
        z zVar = new z(this);
        xq.a a11 = gq.a.a(this);
        a0 a0Var = new a0(zVar);
        this.U0 = androidx.fragment.app.e0.a(this, jo.f0.b(ud.j.class), new c0(a0Var), new b0(zVar, null, null, a11));
        this.V0 = wn.g.b(iVar, new u(this, null, null));
        this.W0 = wn.g.b(iVar, new v(this, null, null));
        this.X0 = wn.g.b(iVar, new w(this, null, null));
        this.Y0 = wn.g.b(iVar, new x(this, null, null));
        this.Z0 = wn.g.b(iVar, new y(this, null, null));
        this.f61454b1 = wn.g.a(new c());
        this.f61455c1 = wn.g.a(new b());
    }

    public static final void k4(k kVar, List list) {
        jo.p.h(kVar, "this$0");
        RecyclerView.h adapter = kVar.X3().C.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.CampaignDetailAdapter");
        jo.p.g(list, "it");
        ((rd.e) adapter).o(list);
    }

    public static final void l4(k kVar, Boolean bool) {
        jo.p.h(kVar, "this$0");
        ud.j W3 = kVar.W3();
        jo.p.g(bool, "it");
        W3.T(bool.booleanValue());
    }

    public static final void m4(k kVar, CampaignDetailResponse campaignDetailResponse) {
        jo.p.h(kVar, "this$0");
        if (campaignDetailResponse == null) {
            return;
        }
        RecyclerView.h adapter = kVar.X3().C.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.CampaignDetailAdapter");
        rd.e eVar = (rd.e) adapter;
        eVar.m(new d());
        eVar.k(new e(campaignDetailResponse));
        eVar.j(new f(campaignDetailResponse));
        eVar.q(new g());
        eVar.l(new h(campaignDetailResponse));
        eVar.s(new i(campaignDetailResponse));
        eVar.r(new j());
        eVar.p(new C1048k());
        eVar.n(new l(campaignDetailResponse));
    }

    public static final void n4(k kVar, AppUserDetailResponse appUserDetailResponse) {
        CampaignDetailResponse f10;
        jo.p.h(kVar, "this$0");
        if (appUserDetailResponse == null || (f10 = kVar.Z3().m().f()) == null) {
            return;
        }
        be.j.R0.a(f10.getApp().getAppUserIdLabel(), appUserDetailResponse).z3(kVar.I0(), "AppUserIdConfirmDialog");
    }

    public static final void o4(k kVar, ha.a aVar) {
        jo.p.h(kVar, "this$0");
        if (aVar instanceof a.d) {
            kVar.X3().D.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.b) {
                kVar.X3().D.b(StatusView.b.C0181b.f20790w);
            } else if ((aVar instanceof a.e) || !(aVar instanceof a.C0439a)) {
            } else {
                StatusView statusView = kVar.X3().D;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = kVar.U0(wa.j.f58546c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new m()));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        db.g T = db.g.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        p4(T);
        View u10 = X3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        dq.c.c().r(this);
        super.I1();
    }

    public final ud.j W3() {
        return (ud.j) this.U0.getValue();
    }

    public final db.g X3() {
        return (db.g) this.P0.b(this, f61451e1[0]);
    }

    public final ya.a Y3() {
        return (ya.a) this.Q0.getValue();
    }

    public final ya.a0 Z3() {
        return (ya.a0) this.R0.getValue();
    }

    public final String a4() {
        return (String) this.f61455c1.getValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "DIALOG_TAG_TWITTER_LINK")) {
            uo.l.d(this, null, null, new h0(null), 3, null);
        }
    }

    public final String b4() {
        return (String) this.f61454b1.getValue();
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    public final tb.c c4() {
        return (tb.c) this.V0.getValue();
    }

    public final MRLogger d4() {
        return (MRLogger) this.S0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        View findViewById;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        this.f61453a1 = new FragmentRunner(a12);
        Dialog p32 = p3();
        com.google.android.material.bottomsheet.a aVar = p32 instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) p32 : null;
        if (aVar != null && (findViewById = aVar.findViewById(wa.e.f58542v)) != null) {
            findViewById.setBackgroundResource(17170445);
            findViewById.getLayoutParams().height = -1;
            findViewById.setOnClickListener(null);
            BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
            jo.p.g(c02, "from(bottomSheet)");
            c02.z0(3);
            c02.v0(O0().getDisplayMetrics().heightPixels);
        }
        X3().C.setLayoutManager(new LinearLayoutManager(N2()));
        X3().C.g(new q());
        RecyclerView recyclerView = X3().C;
        androidx.lifecycle.u a13 = a1();
        jo.p.g(a13, "viewLifecycleOwner");
        recyclerView.setAdapter(new rd.e(a13));
        j4();
        Y3().f(a4());
        MRLogger d42 = d4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CAMPAIGN_MODAL_IMP);
        builder.setTargetId(a4());
        builder.setPayload(xn.r.d(wn.q.a("page_id", b4())));
        d42.sendLog(builder.build());
    }

    public final ServerConfig e4() {
        return (ServerConfig) this.T0.getValue();
    }

    @Override // ya.l0
    public void f(String str) {
        jo.p.h(str, "text");
        Y3().d(a4(), str);
    }

    public final i1 f4() {
        return (i1) this.Y0.getValue();
    }

    public final o0 g4() {
        return (o0) this.W0.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }

    public final of.k h4() {
        return (of.k) this.Z0.getValue();
    }

    public final hf.v0 i4() {
        return (hf.v0) this.X0.getValue();
    }

    public final void j4() {
        Z3().n().i(a1(), new androidx.lifecycle.f0() { // from class: ya.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.k4(k.this, (List) obj);
            }
        });
        Z3().u().i(a1(), new androidx.lifecycle.f0() { // from class: ya.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.l4(k.this, (Boolean) obj);
            }
        });
        Z3().m().i(a1(), new androidx.lifecycle.f0() { // from class: ya.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.m4(k.this, (CampaignDetailResponse) obj);
            }
        });
        Z3().o().i(a1(), new androidx.lifecycle.f0() { // from class: ya.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.n4(k.this, (AppUserDetailResponse) obj);
            }
        });
        Z3().s().i(a1(), new androidx.lifecycle.f0() { // from class: ya.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                k.o4(k.this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new n(null), 3, null);
        uo.l.d(this, null, null, new o(null), 3, null);
        uo.l.d(this, null, null, new p(null), 3, null);
    }

    @dq.l
    public final void on(ce.i iVar) {
        jo.p.h(iVar, "event");
        Y3().c(iVar.a(), jf.a.GAME_ID, iVar.b(), iVar.c());
    }

    public final void p4(db.g gVar) {
        this.P0.a(this, f61451e1[0], gVar);
    }

    public final void q4(String str) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if ((so.n.C(str, "http:", false, 2, null) || so.n.C(str, "https:", false, 2, null)) && e4().checkDomainWhiteList(host)) {
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            f3(WebViewActivity.a.b(aVar, N2, str, false, false, 12, null));
            return;
        }
        p.d a10 = new d.a().a();
        jo.p.g(a10, "builder.build()");
        a10.a(N2(), parse);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        dq.c.c().p(this);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.j jVar) {
        jo.p.h(jVar, "event");
        CampaignDetailResponse f10 = Z3().m().f();
        if (f10 != null) {
            W3().f().p(f10.getApp().getAppId());
            W3().p().p(jVar.b());
            W3().h().p(f10.getApp().getTitle());
            W3().g().p(f10.getApp().getIconUrl());
            W3().J().p(Boolean.FALSE);
        }
    }
}
