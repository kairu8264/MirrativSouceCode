package hf;

import android.text.TextUtils;
import com.dena.mirrorman.net.api.response.Feature;
import java.util.List;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final kf.i f35598a;

    /* renamed from: b  reason: collision with root package name */
    public final od.j f35599b;

    /* loaded from: classes2.dex */
    public static final class a extends en.a<List<? extends String>> {
    }

    /* loaded from: classes2.dex */
    public static final class b extends en.a<List<? extends Feature.Category>> {
    }

    public r(kf.i iVar, od.j jVar) {
        jo.p.h(iVar, "featurePreference");
        jo.p.h(jVar, "featureActionCreator");
        this.f35598a = iVar;
        this.f35599b = jVar;
    }

    public final List<String> a() {
        String Y = this.f35598a.Y();
        if (TextUtils.isEmpty(Y)) {
            return null;
        }
        try {
            return (List) new xm.e().j(Y, new a().getType());
        } catch (Exception e10) {
            g9.a.c(e10);
            return null;
        }
    }

    public final String b() {
        return this.f35598a.I0();
    }

    public final boolean c() {
        return this.f35598a.I() == 1;
    }

    public final boolean d() {
        return this.f35598a.G3() == 1;
    }

    public final boolean e() {
        return this.f35598a.N();
    }

    public final int f() {
        return this.f35598a.D();
    }

    public final String g() {
        return this.f35598a.w();
    }

    public final List<Feature.Category> h() {
        String l02 = this.f35598a.l0();
        if (TextUtils.isEmpty(l02)) {
            return null;
        }
        try {
            return (List) new xm.e().j(l02, new b().getType());
        } catch (Exception e10) {
            g9.a.c(e10);
            return null;
        }
    }

    public final boolean i() {
        return this.f35598a.x1();
    }

    public final int j() {
        return this.f35598a.p2();
    }

    public final String k() {
        return this.f35598a.O();
    }

    public final boolean l() {
        return this.f35598a.x5() > 0;
    }

    public final boolean m() {
        return this.f35598a.C1();
    }

    public final boolean n() {
        return this.f35598a.Q2();
    }

    public final boolean o() {
        return this.f35598a.F3() == 1;
    }

    public final boolean p() {
        return this.f35598a.a2();
    }

    public final boolean q() {
        return this.f35598a.T1();
    }

    public final boolean r() {
        return this.f35598a.Y4();
    }

    public final boolean s() {
        return this.f35598a.K1();
    }

    public final void t(Feature.Capabilities capabilities) {
        if (capabilities == null) {
            return;
        }
        this.f35598a.o0(capabilities.getCollab_alpha());
        this.f35598a.E2(capabilities.getMax_group_user_num());
        if (capabilities.getStrings() == null) {
            this.f35598a.O4("");
        } else {
            kf.i iVar = this.f35598a;
            String text_chat_tutorial_makeroom_dm = capabilities.getStrings().getText_chat_tutorial_makeroom_dm();
            if (text_chat_tutorial_makeroom_dm == null) {
                text_chat_tutorial_makeroom_dm = "";
            }
            iVar.O4(text_chat_tutorial_makeroom_dm);
            kf.i iVar2 = this.f35598a;
            String text_private_tutorial_ttl = capabilities.getStrings().getText_private_tutorial_ttl();
            if (text_private_tutorial_ttl == null) {
                text_private_tutorial_ttl = "";
            }
            iVar2.t3(text_private_tutorial_ttl);
            kf.i iVar3 = this.f35598a;
            String text_q_late = capabilities.getStrings().getText_q_late();
            if (text_q_late == null) {
                text_q_late = "";
            }
            iVar3.k(text_q_late);
            kf.i iVar4 = this.f35598a;
            String recommend_text_to_speech_app_id = capabilities.getRecommend_text_to_speech_app_id();
            if (recommend_text_to_speech_app_id == null) {
                recommend_text_to_speech_app_id = "";
            }
            iVar4.I2(recommend_text_to_speech_app_id);
        }
        kf.i iVar5 = this.f35598a;
        String s10 = new xm.e().s(capabilities.getReport_categories());
        jo.p.g(s10, "Gson().toJson(capabilities.report_categories)");
        iVar5.O3(s10);
        kf.i iVar6 = this.f35598a;
        String s11 = new xm.e().s(capabilities.getAb_emomo_tab_female_default_names());
        jo.p.g(s11, "Gson().toJson(capabiliti…tab_female_default_names)");
        iVar6.z4(s11);
        kf.i iVar7 = this.f35598a;
        String s12 = new xm.e().s(capabilities.getAb_emomo_tab_male_default_names());
        jo.p.g(s12, "Gson().toJson(capabiliti…o_tab_male_default_names)");
        iVar7.B(s12);
        this.f35598a.G0(capabilities.getHandoverCodeSupported());
        this.f35598a.v2(capabilities.getAppUserDetailEnabled());
        this.f35598a.Z0(capabilities.getGameAppIconEnabled());
        this.f35598a.o4(capabilities.isDefaultBroadcastQualityHigh());
        this.f35598a.B2(capabilities.getOfferWallOnly());
        this.f35598a.T3(capabilities.getCoinChallengeEnabled());
        kf.i iVar8 = this.f35598a;
        String encourageLivePopupImageUrl = capabilities.getEncourageLivePopupImageUrl();
        if (encourageLivePopupImageUrl == null) {
            encourageLivePopupImageUrl = "";
        }
        iVar8.O2(encourageLivePopupImageUrl);
        this.f35598a.R3(capabilities.getAndroidLargerVirtualdisplay());
        this.f35598a.M2(capabilities.getAndroidSameAspectRatioAsScreen());
        this.f35598a.s4(capabilities.getSpeedtestEnabled());
        this.f35598a.j4(capabilities.getMediaCodecAsyncModeEnabled());
        kf.i iVar9 = this.f35598a;
        String app_add_request_form_url = capabilities.getApp_add_request_form_url();
        if (app_add_request_form_url == null) {
            app_add_request_form_url = "";
        }
        iVar9.m0(app_add_request_form_url);
        this.f35598a.D2(capabilities.getAvatar_compatible());
        this.f35598a.o(capabilities.is_avatar_candidate());
        kf.i iVar10 = this.f35598a;
        String avatar_asset_bundle_url = capabilities.getAvatar_asset_bundle_url();
        iVar10.b3(avatar_asset_bundle_url != null ? avatar_asset_bundle_url : "");
        this.f35598a.B1(capabilities.getKaraokeEnabled());
        this.f35598a.N0(capabilities.getGiftRankingEnabled() > 0);
        this.f35598a.Y0(capabilities.getDisabledAlpha());
        this.f35598a.J(capabilities.isLlstreamV1Subscribe());
        this.f35598a.G2(capabilities.getLiveGameListingIconEnabled());
        this.f35599b.a(capabilities);
    }

    public final void u(int i10) {
        this.f35598a.Q4(i10);
    }
}
