package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.t;

/* loaded from: classes2.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38733a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38734b;

    public u(Context context) {
        jo.p.h(context, "context");
        this.f38733a = context;
        this.f38734b = "SettingPref";
    }

    @Override // kf.t
    public void A0(int i10) {
        B5("selectedThumbnailId", i10);
    }

    public void A5(String str, float f10) {
        t.a.b(this, str, f10);
    }

    public void B5(String str, int i10) {
        t.a.c(this, str, i10);
    }

    @Override // kf.t
    public boolean C() {
        return J5("earphoneStreamingEnabled", true);
    }

    public void C5(String str, long j10) {
        t.a.d(this, str, j10);
    }

    @Override // kf.t
    public float D0() {
        return F5("ttsVolume", 0.6f);
    }

    public void D5(String str, String str2) {
        t.a.e(this, str, str2);
    }

    @Override // kf.t
    public void E3(long j10) {
        C5("notificationGuardRecommendDate", j10);
    }

    public void E5(String str, boolean z10) {
        t.a.f(this, str, z10);
    }

    @Override // kf.t
    public void F2(boolean z10) {
        E5("receivePushYours", z10);
    }

    public float F5(String str, float f10) {
        return t.a.g(this, str, f10);
    }

    public int G5(String str, int i10) {
        return t.a.h(this, str, i10);
    }

    @Override // kf.t
    public boolean H1() {
        return J5("receivePushPresentBox", true);
    }

    public long H5(String str, long j10) {
        return t.a.i(this, str, j10);
    }

    @Override // kf.t
    public void I1(boolean z10) {
        E5("isCatalogEmomoEnabled", z10);
    }

    @Override // kf.t
    public void I4(int i10) {
        B5("notificationGuardMode", i10);
    }

    public String I5(String str, String str2) {
        return t.a.j(this, str, str2);
    }

    @Override // kf.t
    public boolean J0() {
        return J5("receivePushOpe", true);
    }

    public boolean J5(String str, boolean z10) {
        return t.a.k(this, str, z10);
    }

    @Override // kf.t
    public void K3(boolean z10) {
        E5("receivePushChat", z10);
    }

    public void K5(String str) {
        t.a.l(this, str);
    }

    @Override // kf.t
    public void M(int i10) {
        B5("checkCountBroadcastPermissions", i10);
    }

    @Override // kf.t
    public void M3(boolean z10) {
        E5("receivePushPresentBox", z10);
    }

    @Override // kf.t
    public boolean R0() {
        return J5("receivePushCampaign", true);
    }

    @Override // kf.t
    public void S0(int i10) {
        B5("maxCollabUserNum", i10);
    }

    @Override // kf.t
    public int S4() {
        return G5("checkCountHomeEmomoPermissions", 0);
    }

    @Override // kf.t
    public void U0(String str) {
        jo.p.h(str, "value");
        D5("broadcastQuality", str);
    }

    @Override // kf.t
    public void U2(boolean z10) {
        E5("ttsEnable", z10);
    }

    @Override // kf.t
    public void W2(boolean z10) {
        E5("broadcastAutoTweet", z10);
    }

    @Override // kf.t
    public boolean Y1() {
        return J5("broadcastAutoTweet", false);
    }

    @Override // kf.t
    public boolean Y3() {
        return J5("receivePushLive", true);
    }

    @Override // kf.t
    public int Z1() {
        return G5("checkCountBroadcastPermissions", 0);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return t.a.a(this);
    }

    @Override // kf.t
    public int b0() {
        return G5("notificationGuardMode", -1);
    }

    @Override // kf.t
    public boolean b2() {
        return J5("isVisualGuideCompleted", false);
    }

    @Override // kf.t
    public void c3(float f10) {
        A5("ttsVolume", f10);
    }

    @Override // kf.t
    public boolean c5() {
        return J5("isGiftOverlayEnable", true);
    }

    @Override // kf.t
    public void d(boolean z10) {
        E5("isFirstLaunch", z10);
    }

    @Override // kf.t
    public void d4(boolean z10) {
        E5("setEmomoAsIcon", z10);
    }

    @Override // kf.t
    public void e2(boolean z10) {
        E5("isVideoMute", z10);
    }

    @Override // kf.t
    public boolean f() {
        return J5("isFirstLaunch", true);
    }

    @Override // kf.t
    public boolean f1() {
        return J5("ttsEnable", true);
    }

    @Override // kf.t
    public boolean f4() {
        return J5("receivePushYours", true);
    }

    @Override // kf.t
    public boolean g0() {
        return J5("isCommentVisible", true);
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38733a;
    }

    @Override // kf.t
    public void h1() {
        K5("broadcastQuality");
        K5("isAudioMute");
        K5("isVideoMute");
        K5("isInCamVisible");
        K5("isCommentVisible");
        K5("isCollabEnable");
        K5("maxCollabUserNum");
        K5("collabVolume");
        K5("isPrivacyMode");
        K5("notificationGuardMode");
        K5("notificationGuardRecommendDate");
        K5("receivePushLive");
        K5("receivePushPresentBox");
        K5("receivePushYours");
        K5("receivePushCampaign");
        K5("receivePushOpe");
        K5("receivePushChat");
        K5("broadcastAutoTweet");
        K5("nextAnnounceAutoTweet");
        K5("checkCountBroadcastPermissions");
        K5("checkCountHomeEmomoPermissions");
        K5("ttsEnable");
        K5("ttsVolume");
        K5("setEmomoAsIcon");
    }

    @Override // kf.t
    public void h2(int i10) {
        B5("checkCountHomeEmomoPermissions", i10);
    }

    @Override // kf.t
    public int h5() {
        return G5("selectedThumbnailId", 0);
    }

    @Override // kf.t
    public boolean i() {
        return J5("isCatalogEmomoEnabled", true);
    }

    @Override // kf.t
    public void i0(boolean z10) {
        E5("needsAvatarCacheClear", z10);
    }

    @Override // kf.t
    public boolean i5() {
        return J5("isCollabEnable", true);
    }

    @Override // kf.t
    public void k2(boolean z10) {
        E5("earphoneStreamingEnabled", z10);
    }

    @Override // kf.t
    public boolean l3() {
        return J5("setEmomoAsIcon", true);
    }

    @Override // kf.t
    public boolean m3() {
        return J5("receivePushChat", true);
    }

    @Override // kf.t
    public boolean n2() {
        return J5("needsAvatarCacheClear", false);
    }

    @Override // kf.t
    public void o1(boolean z10) {
        E5("isVisualGuideCompleted", z10);
    }

    @Override // kf.t
    public void o3(boolean z10) {
        E5("isAudioMute", z10);
    }

    @Override // kf.t
    public void p3(boolean z10) {
        E5("isGiftOverlayEnable", z10);
    }

    @Override // kf.t
    public void q(boolean z10) {
        E5("isCommentVisible", z10);
    }

    @Override // kf.t
    public void q1(boolean z10) {
        E5("receivePushOpe", z10);
    }

    @Override // kf.t
    public void q4(boolean z10) {
        E5("receivePushCampaign", z10);
    }

    @Override // kf.t
    public boolean r4() {
        return J5("isAudioMute", false);
    }

    @Override // kf.t
    public void s1(boolean z10) {
        E5("receivePushLive", z10);
    }

    @Override // kf.t
    public int t1() {
        return G5("VisualGuideDisplayePage", -1);
    }

    @Override // kf.t
    public void u3() {
        K5("broadcastAutoTweet");
        K5("nextAnnounceAutoTweet");
    }

    @Override // kf.t
    public long v4() {
        return H5("notificationGuardRecommendDate", 0L);
    }

    @Override // kf.t
    public boolean w1() {
        return J5("isVideoMute", false);
    }

    @Override // kf.t
    public int x() {
        return G5("maxCollabUserNum", 3);
    }

    @Override // kf.t
    public String y3() {
        return I5("broadcastQuality", "");
    }

    @Override // kf.t
    public void y5(boolean z10) {
        E5("isCollabEnable", z10);
    }

    @Override // kf.o
    public String z() {
        return this.f38734b;
    }

    @Override // kf.t
    public void z0(boolean z10) {
        E5("nextAnnounceAutoTweet", z10);
    }
}
