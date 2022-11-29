package kf;

import android.content.Context;
import android.content.SharedPreferences;
import kf.v;

/* loaded from: classes2.dex */
public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38735a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38736b;

    public w(Context context) {
        jo.p.h(context, "context");
        this.f38735a = context;
        this.f38736b = "TutorialPref";
    }

    @Override // kf.v
    public int A1() {
        return D5("viewLiveCount", 0);
    }

    @Override // kf.v
    public void A2(int i10) {
        A5("viewVODCount", i10);
    }

    public void A5(String str, int i10) {
        v.a.b(this, str, i10);
    }

    @Override // kf.v
    public boolean B0() {
        return F5("viewedGroupShotTutorial", false);
    }

    @Override // kf.v
    public boolean B4() {
        return F5("viewedAppUserIdShareTutorial", false);
    }

    public void B5(String str, String str2) {
        v.a.c(this, str, str2);
    }

    @Override // kf.v
    public boolean C3() {
        return F5("viewedAppUserIdSettingTutorial", false);
    }

    public void C5(String str, boolean z10) {
        v.a.d(this, str, z10);
    }

    public int D5(String str, int i10) {
        return v.a.e(this, str, i10);
    }

    @Override // kf.v
    public void E4(boolean z10) {
        C5("viewedAppUserIdSettingTutorial", z10);
    }

    public String E5(String str, String str2) {
        return v.a.f(this, str, str2);
    }

    @Override // kf.v
    public void F1(boolean z10) {
        C5("broadcastLiveLinkClicked", z10);
    }

    @Override // kf.v
    public void F4(boolean z10) {
        C5("needsShowEmomoRunGiftInfo", z10);
    }

    public boolean F5(String str, boolean z10) {
        return v.a.g(this, str, z10);
    }

    @Override // kf.v
    public boolean G4() {
        return F5("needsEmokaraAlert", true);
    }

    @Override // kf.v
    public int J3() {
        return D5("commentingCount", 0);
    }

    @Override // kf.v
    public boolean K() {
        return F5("needsShowShooterMatchingTutorialPopUp", true);
    }

    @Override // kf.v
    public void L3(boolean z10) {
        C5("needsShowUniqueEmomoGiftBalloon", z10);
    }

    @Override // kf.v
    public boolean L4() {
        return F5("needsStreamViewEmokaraOnboarding", false);
    }

    @Override // kf.v
    public void N1(boolean z10) {
        C5("isAlreadyTwitterLinkedUser", z10);
    }

    @Override // kf.v
    public void N2(int i10) {
        A5("liveStartedCount", i10);
    }

    @Override // kf.v
    public int N3() {
        return D5("liveStartedCount", 0);
    }

    @Override // kf.v
    public void P2(boolean z10) {
        C5("needsShowEmomoInfo", z10);
    }

    @Override // kf.v
    public void P4(int i10) {
        A5("commentingCount", i10);
    }

    @Override // kf.v
    public boolean Q() {
        return F5("needsShowEmomoRunGiftInfo", true);
    }

    @Override // kf.v
    public void S1(boolean z10) {
        C5("needsShowGiftRankingGradeRuleChangedPopup", z10);
    }

    @Override // kf.v
    public void V1(boolean z10) {
        C5("needsShowGiftRankingEventRuleTutorial", z10);
    }

    @Override // kf.v
    public boolean V3() {
        return F5("needsShowEmomoInfo", true);
    }

    @Override // kf.o
    public SharedPreferences a5() {
        return v.a.a(this);
    }

    @Override // kf.v
    public void c0(int i10) {
        A5("launchedCount", i10);
    }

    @Override // kf.v
    public void c1(boolean z10) {
        C5("viewedGroupShotTutorial", z10);
    }

    @Override // kf.v
    public boolean c4() {
        return F5("needsShowEditPartTextTutorial", true);
    }

    @Override // kf.v
    public void d(boolean z10) {
        C5("isFirstLaunch", z10);
    }

    @Override // kf.v
    public boolean f() {
        return F5("isFirstLaunch", false);
    }

    @Override // kf.v
    public boolean f5() {
        return F5("needsShowUniqueEmomoGiftBalloon", true);
    }

    @Override // kf.v
    public int g1() {
        return D5("viewVODCount", 0);
    }

    @Override // kf.v
    public void g2(boolean z10) {
        C5("needsStreamViewEmokaraOnboarding", z10);
    }

    @Override // kf.o
    public Context getContext() {
        return this.f38735a;
    }

    @Override // kf.v
    public void i1(boolean z10) {
        C5("needsShowShooterMatchingTutorialPopUp", z10);
    }

    @Override // kf.v
    public boolean j3() {
        return F5("needsShowGiftRankingEventRuleTutorial", true);
    }

    @Override // kf.v
    public String l() {
        return E5("tutorialShownFlags", "0000000000000000000000");
    }

    @Override // kf.v
    public boolean l2() {
        return F5("needsShowEditCompanionNameTutorial", true);
    }

    @Override // kf.v
    public void m2(boolean z10) {
        C5("needsEmokaraAlert", z10);
    }

    @Override // kf.v
    public void m4(boolean z10) {
        C5("needsShowEditPartTextTutorial", z10);
    }

    @Override // kf.v
    public void n(int i10) {
        A5("viewLiveCount", i10);
    }

    @Override // kf.v
    public boolean n1() {
        return F5("isAlreadyTwitterLinkedUser", false);
    }

    @Override // kf.v
    public boolean p4() {
        return F5("broadcastLiveLinkClicked", false);
    }

    @Override // kf.v
    public int r0() {
        return D5("launchedCount", 0);
    }

    @Override // kf.v
    public int s0() {
        return D5("standbyLiveStartedCount", 0);
    }

    @Override // kf.v
    public boolean v5() {
        return F5("needsShowGiftRankingGradeRuleChangedPopup", true);
    }

    @Override // kf.v
    public void w4(boolean z10) {
        C5("needsShowEditCompanionNameTutorial", z10);
    }

    @Override // kf.v
    public void x0(boolean z10) {
        C5("viewedAppUserIdShareTutorial", z10);
    }

    @Override // kf.o
    public String z() {
        return this.f38736b;
    }

    @Override // kf.v
    public void z5(String str) {
        jo.p.h(str, "value");
        B5("tutorialShownFlags", str);
    }
}
