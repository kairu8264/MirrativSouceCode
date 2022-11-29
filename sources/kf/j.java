package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.i;

/* loaded from: classes2.dex */
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38724a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38725b;

    public j(Context context) {
        jo.p.h(context, "context");
        this.f38724a = context;
        this.f38725b = "FeaturePref";
    }

    public void A5(String str, int i10) {
        i.a.b(this, str, i10);
    }

    @Override // kf.i
    public void B(String str) {
        jo.p.h(str, "value");
        B5("abEmomoTabMaleDefaultNames", str);
    }

    @Override // kf.i
    public void B1(int i10) {
        A5("karaokeEnabled", i10);
    }

    @Override // kf.i
    public void B2(boolean z10) {
        C5("offerWallOnly", z10);
    }

    @Override // kf.i
    public String B3() {
        return E5("timeMachine", "");
    }

    public void B5(String str, String str2) {
        i.a.c(this, str, str2);
    }

    @Override // kf.i
    public boolean C1() {
        return F5("isDefaultBroadcastQualityHigh", false);
    }

    public void C5(String str, boolean z10) {
        i.a.d(this, str, z10);
    }

    @Override // kf.i
    public int D() {
        return D5("maxGroupUserNum", 0);
    }

    @Override // kf.i
    public void D2(int i10) {
        A5("avatarCompatible", i10);
    }

    public int D5(String str, int i10) {
        return i.a.e(this, str, i10);
    }

    @Override // kf.i
    public void E2(int i10) {
        A5("maxGroupUserNum", i10);
    }

    public String E5(String str, String str2) {
        return i.a.f(this, str, str2);
    }

    @Override // kf.i
    public int F3() {
        return D5("karaokeEnabled", 0);
    }

    public boolean F5(String str, boolean z10) {
        return i.a.g(this, str, z10);
    }

    @Override // kf.i
    public void G0(boolean z10) {
        C5("handoverCodeSupported", z10);
    }

    @Override // kf.i
    public void G2(boolean z10) {
        C5("liveGameListingIconEnabled", z10);
    }

    @Override // kf.i
    public int G3() {
        return D5("collab_alpha", 0);
    }

    @Override // kf.i
    public int I() {
        return D5("avatarCompatible", 0);
    }

    @Override // kf.i
    public String I0() {
        return E5("avatarAssetBundleUrl", "");
    }

    @Override // kf.i
    public void I2(String str) {
        jo.p.h(str, "value");
        B5("recommend_text_to_speech_app_id", str);
    }

    @Override // kf.i
    public boolean I3() {
        return F5("liveGameListingIconEnabled", false);
    }

    @Override // kf.i
    public void J(boolean z10) {
        C5("isLlstreamV1Subscribe", z10);
    }

    @Override // kf.i
    public String K0() {
        return E5("encourageLivePopupImageUrl", "");
    }

    @Override // kf.i
    public boolean K1() {
        return F5("androidSameAspectRatioAsScreen", false);
    }

    @Override // kf.i
    public String K2() {
        return E5("seasonRatingInfoUrl", "");
    }

    @Override // kf.i
    public String K4() {
        return E5("sharePopupDescription", "");
    }

    @Override // kf.i
    public void M1(int i10) {
        A5("packageUsageStatsInterval", i10);
    }

    @Override // kf.i
    public void M2(boolean z10) {
        C5("androidSameAspectRatioAsScreen", z10);
    }

    @Override // kf.i
    public boolean N() {
        return F5("giftRankingEnabled", false);
    }

    @Override // kf.i
    public void N0(boolean z10) {
        C5("giftRankingEnabled", z10);
    }

    @Override // kf.i
    public String O() {
        return E5("text_q_late", "");
    }

    @Override // kf.i
    public void O1(String str) {
        jo.p.h(str, "value");
        B5("tweetHashTags", str);
    }

    @Override // kf.i
    public void O2(String str) {
        jo.p.h(str, "value");
        B5("encourageLivePopupImageUrl", str);
    }

    @Override // kf.i
    public void O3(String str) {
        jo.p.h(str, "value");
        B5("report_categories", str);
    }

    @Override // kf.i
    public void O4(String str) {
        jo.p.h(str, "value");
        B5("strings_text_chat_tutorial_makeroom_dm", str);
    }

    @Override // kf.i
    public void P0(String str) {
        jo.p.h(str, "value");
        B5("sharePopupDescription", str);
    }

    @Override // kf.i
    public boolean P3() {
        return F5("coinChallengeEnabled", false);
    }

    @Override // kf.i
    public boolean Q2() {
        return F5("disabledAlpha", false);
    }

    @Override // kf.i
    public void Q4(int i10) {
        A5("speedtestVisitedAt", i10);
    }

    @Override // kf.i
    public void R3(boolean z10) {
        C5("androidLargerVirtualdisplay", z10);
    }

    @Override // kf.i
    public void R4(int i10) {
        A5("userMeCacheExpireSeconds", i10);
    }

    @Override // kf.i
    public String T() {
        return E5("sharePopupTitle", "");
    }

    @Override // kf.i
    public boolean T1() {
        return F5("androidLargerVirtualdisplay", false);
    }

    @Override // kf.i
    public void T3(boolean z10) {
        C5("coinChallengeEnabled", z10);
    }

    @Override // kf.i
    public String V0() {
        return E5("signatureVerifyNonce", "");
    }

    @Override // kf.i
    public void V2(boolean z10) {
        C5("homeRewardAdButtonEnabled", z10);
    }

    @Override // kf.i
    public void W3(String str) {
        jo.p.h(str, "value");
        B5("timeMachine", str);
    }

    @Override // kf.i
    public void X1(String str) {
        jo.p.h(str, "value");
        B5("signatureVerifyNonce", str);
    }

    @Override // kf.i
    public String X2() {
        return E5("appAddRequestFormUrl", "");
    }

    @Override // kf.i
    public String Y() {
        return E5("abEmomoTabFemaleDefaultNames", "");
    }

    @Override // kf.i
    public void Y0(boolean z10) {
        C5("disabledAlpha", z10);
    }

    @Override // kf.i
    public boolean Y4() {
        return F5("mediaCodecAsyncModeEnabled", false);
    }

    @Override // kf.i
    public void Z0(boolean z10) {
        C5("gameAppIconEnabled", z10);
    }

    @Override // kf.i
    public void Z4(String str) {
        jo.p.h(str, "value");
        B5("sharePopupTitle", str);
    }

    @Override // kf.i
    public boolean a2() {
        return F5("isLlstreamV1Subscribe", false);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return i.a.a(this);
    }

    @Override // kf.i
    public void b3(String str) {
        jo.p.h(str, "value");
        B5("avatarAssetBundleUrl", str);
    }

    @Override // kf.i
    public int c() {
        return D5("demographicLastShownTime", 0);
    }

    @Override // kf.i
    public boolean d1() {
        return F5("homeRewardAdButtonEnabled", false);
    }

    @Override // kf.i
    public boolean d5() {
        return F5("appUserDetailEnabled", false);
    }

    @Override // kf.i
    public void e(int i10) {
        A5("demographicLastShownTime", i10);
    }

    @Override // kf.i
    public void e3(String str) {
        jo.p.h(str, "value");
        B5("offerWallUrl", str);
    }

    @Override // kf.i
    public void e4(int i10) {
        A5("noticeCountsCacheExpireSeconds", i10);
    }

    @Override // kf.i
    public int g5() {
        return D5("packageUsageStatsInterval", 2);
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38724a;
    }

    @Override // kf.i
    public void h4(boolean z10) {
        C5("isInviteCollabSupported", z10);
    }

    @Override // kf.i
    public boolean i2() {
        return F5("gameAppIconEnabled", false);
    }

    @Override // kf.i
    public int j() {
        return D5("userMeCacheExpireSeconds", 0);
    }

    @Override // kf.i
    public void j1(boolean z10) {
        C5("mailSupportEnabled", z10);
    }

    @Override // kf.i
    public void j4(boolean z10) {
        C5("mediaCodecAsyncModeEnabled", z10);
    }

    @Override // kf.i
    public boolean j5() {
        return F5("handoverCodeSupported", false);
    }

    @Override // kf.i
    public void k(String str) {
        jo.p.h(str, "value");
        B5("text_q_late", str);
    }

    @Override // kf.i
    public String l0() {
        return E5("report_categories", "");
    }

    @Override // kf.i
    public void m0(String str) {
        jo.p.h(str, "value");
        B5("appAddRequestFormUrl", str);
    }

    @Override // kf.i
    public void m5(boolean z10) {
        C5("demographicEnabled", z10);
    }

    @Override // kf.i
    public boolean n4() {
        return F5("collabEmomoEnabled", false);
    }

    @Override // kf.i
    public void o(int i10) {
        A5("isAvatarCandidate", i10);
    }

    @Override // kf.i
    public void o0(int i10) {
        A5("collab_alpha", i10);
    }

    @Override // kf.i
    public boolean o2() {
        return F5("onboardingSurveyEnabled", false);
    }

    @Override // kf.i
    public void o4(boolean z10) {
        C5("isDefaultBroadcastQualityHigh", z10);
    }

    @Override // kf.i
    public String p0() {
        return E5("offerWallUrl", "");
    }

    @Override // kf.i
    public int p2() {
        return D5("speedtestVisitedAt", 0);
    }

    @Override // kf.i
    public boolean r() {
        return F5("demographicEnabled", false);
    }

    @Override // kf.i
    public void s4(boolean z10) {
        C5("speedtestEnabled", z10);
    }

    @Override // kf.i
    public void t3(String str) {
        jo.p.h(str, "value");
        B5("text_private_tutorial_ttl", str);
    }

    @Override // kf.i
    public void v2(boolean z10) {
        C5("appUserDetailEnabled", z10);
    }

    @Override // kf.i
    public String w() {
        return E5("recommend_text_to_speech_app_id", "");
    }

    @Override // kf.i
    public void w5(String str) {
        jo.p.h(str, "value");
        B5("seasonRatingInfoUrl", str);
    }

    @Override // kf.i
    public boolean x1() {
        return F5("speedtestEnabled", false);
    }

    @Override // kf.i
    public void x4(boolean z10) {
        C5("livePrepareTutorialEnabled", z10);
    }

    @Override // kf.i
    public int x5() {
        return D5("isAvatarCandidate", 0);
    }

    @Override // kf.i
    public int y4() {
        return D5("noticeCountsCacheExpireSeconds", 0);
    }

    @Override // kf.o
    public String z() {
        return this.f38725b;
    }

    @Override // kf.i
    public void z1(boolean z10) {
        C5("collabEmomoEnabled", z10);
    }

    @Override // kf.i
    public void z4(String str) {
        jo.p.h(str, "value");
        B5("abEmomoTabFemaleDefaultNames", str);
    }
}
