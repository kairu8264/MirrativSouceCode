package kf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import kf.x;

/* loaded from: classes2.dex */
public final class y implements x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38737a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38738b;

    public y(Context context) {
        jo.p.h(context, "context");
        this.f38737a = context;
        this.f38738b = "UserPref";
    }

    public void A5(String str, int i10) {
        x.a.d(this, str, i10);
    }

    public void B5(String str, long j10) {
        x.a.e(this, str, j10);
    }

    @Override // kf.x
    public void C2(long j10) {
        B5("lastRequestToEnableOsNotificationCheckedTime", j10);
    }

    @Override // kf.x
    public void C4(String str) {
        jo.p.h(str, "value");
        C5("USER_ID", str);
    }

    public void C5(String str, String str2) {
        x.a.f(this, str, str2);
    }

    public void D5(String str, Set<String> set) {
        x.a.g(this, str, set);
    }

    @Override // kf.x
    public int E() {
        return F5("dateTimeWhenRankingWinningBalloonOnMyPageWasClosed", 0);
    }

    @Override // kf.x
    public void E0(int i10) {
        A5("GRADE_ID", i10);
    }

    @Override // kf.x
    public void E1(int i10) {
        A5("FOLLOWER_NUM", i10);
    }

    public void E5(String str, boolean z10) {
        x.a.h(this, str, z10);
    }

    @Override // kf.x
    public void F(boolean z10) {
        E5("isCheckedMenuEditBankAccount", z10);
    }

    public int F5(String str, int i10) {
        return x.a.i(this, str, i10);
    }

    @Override // kf.x
    public Set<String> G1() {
        return I5("SHOWED_AVATARS", new HashSet());
    }

    public long G5(String str, long j10) {
        return x.a.j(this, str, j10);
    }

    @Override // kf.x
    public void H(int i10) {
        A5("NEXT_LIVE_START_AT", i10);
    }

    @Override // kf.x
    public boolean H0() {
        return J5("CHAT_ONLY_FOLLOWINGS", true);
    }

    @Override // kf.x
    public void H2(int i10) {
        A5("dateTimeWhenRankingWinningBalloonOnMyPageWasClosed", i10);
    }

    @Override // kf.x
    public String H3() {
        return H5("LIVE_THUMBNAIL_IMAGE_URL", "");
    }

    public String H5(String str, String str2) {
        return x.a.k(this, str, str2);
    }

    public Set<String> I5(String str, Set<String> set) {
        return x.a.l(this, str, set);
    }

    @Override // kf.x
    public void J1(boolean z10) {
        E5("isAlreadySetHandoverCode", z10);
    }

    public boolean J5(String str, boolean z10) {
        return x.a.m(this, str, z10);
    }

    @Override // kf.x
    public void L(boolean z10) {
        E5("hasContinuousStreamHoliday", z10);
    }

    @Override // kf.x
    public boolean L0() {
        return J5("hasAvatar", false);
    }

    @Override // kf.x
    public void L1(int i10) {
        A5("tosVersionId", i10);
    }

    @Override // kf.x
    public void M4(int i10) {
        A5("lastShowSeasonResultPopUpMonth", i10);
    }

    @Override // kf.x
    public boolean N4() {
        return J5("isCheckedMonthlyRanking", false);
    }

    @Override // kf.x
    public void O0(String str) {
        jo.p.h(str, "value");
        C5("dynamicLinkUrl", str);
    }

    @Override // kf.x
    public String P() {
        return H5("DESCTIPTION", "");
    }

    @Override // kf.x
    public boolean P1() {
        return J5("isVisibleBirthday", true);
    }

    @Override // kf.x
    public int Q0() {
        return F5("dateTimeWhenContractPassBookBalloonOnHomeWasClosed", 0);
    }

    @Override // kf.x
    public String Q1() {
        return H5("anniversaryJson", "");
    }

    @Override // kf.x
    public void Q3(int i10) {
        A5("dateTimeWhenContractPassBookBalloonOnHomeWasClosed", i10);
    }

    @Override // kf.x
    public void R1(String str) {
        jo.p.h(str, "value");
        C5("TWITTER_SCREEN_NAME", str);
    }

    @Override // kf.x
    public void R2(String str) {
        jo.p.h(str, "value");
        C5("LIVE_THUMBNAIL_IMAGE_URL", str);
    }

    @Override // kf.x
    public boolean S() {
        return J5("recordingEnabled", false);
    }

    @Override // kf.x
    public void S2(String str) {
        jo.p.h(str, "value");
        C5("birthdayEditableDate", str);
    }

    @Override // kf.x
    public int S3() {
        return F5("lastShowGetRewardDialogDateTime", 0);
    }

    @Override // kf.x
    public void T0(int i10) {
        A5("userAvatarPartsNum", i10);
    }

    @Override // kf.x
    public void T2(int i10) {
        A5("MY_APP_NUM", i10);
    }

    @Override // kf.x
    public String T4() {
        return H5("USER_ID", "");
    }

    @Override // kf.x
    public boolean U3() {
        return x.a.c(this);
    }

    @Override // kf.x
    public void U4(String str) {
        jo.p.h(str, "value");
        C5("LINKS", str);
    }

    @Override // kf.x
    public long V4() {
        return G5("lastRequestToEnableAppNotificationCheckedTime", 0L);
    }

    @Override // kf.x
    public void W(String str) {
        jo.p.h(str, "value");
        C5("PROFILE_IMAGE_URL", str);
    }

    @Override // kf.x
    public void W1(boolean z10) {
        E5("isBirthday", z10);
    }

    @Override // kf.x
    public String W4() {
        return H5("TWITTER_SCREEN_NAME", "");
    }

    @Override // kf.x
    public void X(int i10) {
        A5("TOTAL_VIEWER_NUM", i10);
    }

    @Override // kf.x
    public void X3(String str) {
        jo.p.h(str, "value");
        C5("catalogLabelImageUrl", str);
    }

    @Override // kf.x
    public void X4(String str) {
        jo.p.h(str, "value");
        C5("announcementUrlsJson", str);
    }

    @Override // kf.x
    public int Z() {
        return F5("GRADE_ID", 0);
    }

    @Override // kf.x
    public String Z3() {
        return H5("dynamicLinkUrl", "");
    }

    @Override // kf.x
    public String a() {
        return H5("birthday", "");
    }

    @Override // kf.x
    public boolean a1() {
        return J5("isAlreadySetHandoverCode", false);
    }

    @Override // kf.x
    public void a3(String str) {
        jo.p.h(str, "value");
        C5("CUSTOM_THANKS_MESSAGE", str);
    }

    @Override // kf.x
    public int a4() {
        return F5("rankingMonthDateTimeWhenShowRewardPrizeDialog", 0);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return x.a.b(this);
    }

    @Override // kf.x
    public int c() {
        return F5("demographicLastShownTime", 0);
    }

    @Override // kf.x
    public boolean c2() {
        return J5("isBirthdayEditable", false);
    }

    @Override // kf.o
    public void clear() {
        x.a.a(this);
    }

    @Override // kf.x
    public void d0(boolean z10) {
        E5("IS_CONTINUOUS_LIVE_USER_AFTER_NEXT_LIVE", z10);
    }

    @Override // kf.x
    public void d2(int i10) {
        A5("rankingMonthDateTimeWhenShowRewardPrizeDialog", i10);
    }

    @Override // kf.x
    public void e(int i10) {
        A5("demographicLastShownTime", i10);
    }

    @Override // kf.x
    public int e1() {
        return F5("lastShowSeasonResultPopUpMonth", 0);
    }

    @Override // kf.x
    public void f2(boolean z10) {
        E5("hasStartedFirstLive", z10);
    }

    @Override // kf.x
    public String g() {
        return H5("badgeImageUrl", "");
    }

    @Override // kf.x
    public void g3(String str) {
        jo.p.h(str, "value");
        C5("NEXT_LIVE_ANNOUNCE", str);
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38737a;
    }

    @Override // kf.x
    public String h0() {
        return H5("catalogLabelImageUrl", "");
    }

    @Override // kf.x
    public boolean h3() {
        return J5("isCheckedMenuEditIdentification", false);
    }

    @Override // kf.x
    public void i4(boolean z10) {
        E5("isCheckedMenuEditIdentification", z10);
    }

    @Override // kf.x
    public int j0() {
        return F5("dateTimeWhenContractPassBookBalloonOnMyPageWasClosed", 0);
    }

    @Override // kf.x
    public void j2(int i10) {
        A5("CONTINUOUS_LIVE_COUNT", i10);
    }

    @Override // kf.x
    public void k0(String str) {
        jo.p.h(str, "value");
        C5("DESCTIPTION", str);
    }

    @Override // kf.x
    public void k1(int i10) {
        A5("FOLLOWING_NUM", i10);
    }

    @Override // kf.x
    public void k3(String str) {
        jo.p.h(str, "value");
        C5("continuousStreamHolidayPeriod", str);
    }

    @Override // kf.x
    public String k5() {
        return H5("CUSTOM_THANKS_MESSAGE", "");
    }

    @Override // kf.x
    public void l5(String str) {
        jo.p.h(str, "value");
        C5("birthday", str);
    }

    @Override // kf.x
    public void m(boolean z10) {
        E5("isBirthdayEditable", z10);
    }

    @Override // kf.x
    public void m1(boolean z10) {
        E5("GCM_SENT_TOKEN_TO_SERVER", z10);
    }

    @Override // kf.x
    public void n0(boolean z10) {
        E5("CHAT_ONLY_FOLLOWINGS", z10);
    }

    @Override // kf.x
    public boolean n3() {
        return J5("isCheckedContractPassbook", false);
    }

    @Override // kf.x
    public void n5(boolean z10) {
        E5("isVisibleBirthday", z10);
    }

    @Override // kf.x
    public long o5() {
        return G5("REGISTERED_AT", 0L);
    }

    @Override // kf.x
    public void p1(int i10) {
        A5("maxContinuousRecord", i10);
    }

    @Override // kf.x
    public String p5() {
        return H5("announcementUrlsJson", "");
    }

    @Override // kf.x
    public void r1(long j10) {
        B5("lastRequestToEnableAppNotificationCheckedTime", j10);
    }

    @Override // kf.x
    public void r5(boolean z10) {
        E5("IS_CONTINUOUS_LIVE_USER_AFTER_NEXT_LIVE_SHOWN", z10);
    }

    @Override // kf.x
    public int s() {
        return F5("userAvatarPartsNum", 0);
    }

    @Override // kf.x
    public int s3() {
        return F5("maxContinuousRecord", 0);
    }

    @Override // kf.x
    public void s5(Set<String> set) {
        jo.p.h(set, "value");
        D5("SHOWED_AVATARS", set);
    }

    @Override // kf.x
    public void t(boolean z10) {
        E5("recordingEnabled", z10);
    }

    @Override // kf.x
    public void t2(int i10) {
        A5("dateTimeWhenRankingWinningBalloonOnHomeWasClosed", i10);
    }

    @Override // kf.x
    public String t4() {
        return H5("NAME", "");
    }

    @Override // kf.x
    public void t5(boolean z10) {
        E5("isCheckedMonthlyRanking", z10);
    }

    @Override // kf.x
    public int u() {
        return F5("CONTINUOUS_LIVE_COUNT", 0);
    }

    @Override // kf.x
    public String u1() {
        return H5("LINKS", "");
    }

    @Override // kf.x
    public String u2() {
        return H5("PROFILE_IMAGE_URL", "");
    }

    @Override // kf.x
    public boolean u4() {
        return J5("isCheckedMenuEditBankAccount", false);
    }

    @Override // kf.x
    public void u5(String str) {
        jo.p.h(str, "value");
        C5("badgeImageUrl", str);
    }

    @Override // kf.x
    public void v(long j10) {
        B5("REGISTERED_AT", j10);
    }

    @Override // kf.x
    public void v3(boolean z10) {
        E5("isCheckedContractPassbook", z10);
    }

    @Override // kf.x
    public boolean w2() {
        return J5("GCM_SENT_TOKEN_TO_SERVER", false);
    }

    @Override // kf.x
    public void w3(String str) {
        jo.p.h(str, "value");
        C5("anniversaryJson", str);
    }

    @Override // kf.x
    public void y(String str) {
        jo.p.h(str, "value");
        C5("NAME", str);
    }

    @Override // kf.x
    public void y0(int i10) {
        A5("dateTimeWhenContractPassBookBalloonOnMyPageWasClosed", i10);
    }

    @Override // kf.x
    public void y1(boolean z10) {
        E5("hasAvatar", z10);
    }

    @Override // kf.x
    public int y2() {
        return F5("contractMonth", 0);
    }

    @Override // kf.o
    public String z() {
        return this.f38738b;
    }

    @Override // kf.x
    public long z2() {
        return G5("lastRequestToEnableOsNotificationCheckedTime", 0L);
    }
}
