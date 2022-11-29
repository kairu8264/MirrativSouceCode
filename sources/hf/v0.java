package hf;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dena.mirrorman.database.MirrorDatabase;
import com.dena.mirrorman.net.api.response.AnnouncementUrls;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncement;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.dena.mirrorman.net.api.response.user.UserLink;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.b;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f35614h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f35615i = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kf.x f35616a;

    /* renamed from: b  reason: collision with root package name */
    public final kf.t f35617b;

    /* renamed from: c  reason: collision with root package name */
    public final kf.p f35618c;

    /* renamed from: d  reason: collision with root package name */
    public final MirrorDatabase f35619d;

    /* renamed from: e  reason: collision with root package name */
    public final f f35620e;

    /* renamed from: f  reason: collision with root package name */
    public final h0 f35621f;

    /* renamed from: g  reason: collision with root package name */
    public final od.s0 f35622g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final boolean a(UserBasicWithGraphParams userBasicWithGraphParams) {
            jo.p.h(userBasicWithGraphParams, "params");
            return (userBasicWithGraphParams.getOnlive() == null || TextUtils.isEmpty(userBasicWithGraphParams.getOnlive().getLiveId())) ? false : true;
        }
    }

    public v0(kf.x xVar, kf.t tVar, kf.p pVar, MirrorDatabase mirrorDatabase, f fVar, h0 h0Var, od.s0 s0Var) {
        jo.p.h(xVar, "userPreference");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(pVar, "noticePreference");
        jo.p.h(mirrorDatabase, "mirrorDatabase");
        jo.p.h(fVar, "clearLocalCacheStorage");
        jo.p.h(h0Var, "newNoticeRepository");
        jo.p.h(s0Var, "userActionCreator");
        this.f35616a = xVar;
        this.f35617b = tVar;
        this.f35618c = pVar;
        this.f35619d = mirrorDatabase;
        this.f35620e = fVar;
        this.f35621f = h0Var;
        this.f35622g = s0Var;
    }

    public static /* synthetic */ boolean c(v0 v0Var, FragmentManager fragmentManager, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return v0Var.b(fragmentManager, str, z10);
    }

    public final void a(String str, boolean z10) {
        HashSet hashSet = new HashSet(this.f35616a.G1());
        String e10 = e(str);
        if (e10 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e10);
            sb2.append(z10 ? "&isTrialItem=true" : "");
            hashSet.add(sb2.toString());
        }
        this.f35616a.s5(hashSet);
    }

    public final boolean b(FragmentManager fragmentManager, String str, boolean z10) {
        jo.p.h(fragmentManager, "fragmentManager");
        if (l()) {
            return true;
        }
        Fragment e02 = fragmentManager.e0("grade1");
        if (e02 == null || e02.m1()) {
            b.a aVar = pe.b.f47398a1;
            jo.p.e(str);
            aVar.a(str, false, z10).z3(fragmentManager, "RegistrationDialog");
            return false;
        }
        return false;
    }

    public final String d() {
        return this.f35616a.Z3();
    }

    public final String e(String str) {
        if (str == null || !so.o.H(str, "?", false, 2, null)) {
            return str;
        }
        Object[] array = new so.e("\\?").d(str, 0).toArray(new String[0]);
        jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return ((String[]) array)[0];
    }

    public final String f() {
        return this.f35616a.k5();
    }

    public final ArrayList<String> g() {
        String u12 = this.f35616a.u1();
        if (TextUtils.isEmpty(u12)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(u12);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                jo.p.f(obj, "null cannot be cast to non-null type org.json.JSONObject");
                arrayList.add(((JSONObject) obj).get("url").toString());
            }
        } catch (JSONException e10) {
            g9.a.c(e10);
        }
        return arrayList;
    }

    public final boolean h() {
        return this.f35616a.L0();
    }

    public final boolean i(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return jo.p.c(str, this.f35616a.T4());
    }

    public final boolean j() {
        return this.f35616a.Z() == 0;
    }

    public final boolean k() {
        return this.f35616a.Z() == 1;
    }

    public final boolean l() {
        return this.f35616a.Z() >= 1;
    }

    public final boolean m() {
        return this.f35616a.Z() > 1;
    }

    public final boolean n() {
        return (System.currentTimeMillis() / ((long) 1000)) - this.f35616a.o5() < 86400;
    }

    public final boolean o(String str, boolean z10) {
        Set<String> G1 = this.f35616a.G1();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e(str));
        sb2.append(z10 ? "&isTrialItem=true" : "");
        if (!G1.contains(sb2.toString())) {
            Set<String> G12 = this.f35616a.G1();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(z10 ? "&isTrialItem=true" : "");
            if (!G12.contains(sb3.toString())) {
                return false;
            }
        }
        return true;
    }

    public final boolean p() {
        return !TextUtils.isEmpty(this.f35616a.W4());
    }

    public final void q() {
        this.f35622g.a();
        this.f35617b.h1();
        this.f35618c.clear();
        this.f35621f.d();
        this.f35619d.D().a();
        this.f35619d.C().a();
        this.f35620e.d();
    }

    public final String r() {
        return this.f35616a.u2();
    }

    public final void s(AnnouncementUrls announcementUrls) {
        if (announcementUrls != null) {
            kf.x xVar = this.f35616a;
            String s10 = new xm.e().s(announcementUrls);
            jo.p.g(s10, "Gson().toJson(announcementUrls)");
            xVar.X4(s10);
        }
    }

    public final void t(String str) {
        jo.p.h(str, "str");
        this.f35616a.a3(str);
    }

    public final void u(List<UserLink> list) {
        JSONArray jSONArray = new JSONArray();
        jo.p.e(list);
        for (UserLink userLink : list) {
            String component1 = userLink.component1();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", component1);
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                g9.a.c(e10);
            }
        }
        kf.x xVar = this.f35616a;
        String jSONArray2 = jSONArray.toString();
        jo.p.g(jSONArray2, "jsonarray.toString()");
        xVar.U4(jSONArray2);
    }

    public final void v(UserMe userMe) {
        jo.p.h(userMe, "response");
        w(userMe);
    }

    public final void w(UserProfile userProfile) {
        jo.p.h(userProfile, "response");
        if (this.f35616a.Z() == 0) {
            this.f35616a.m1(false);
        }
        this.f35616a.C4(userProfile.getUserId());
        this.f35616a.y(userProfile.getName());
        this.f35616a.W(userProfile.getProfileImageUrl());
        this.f35616a.k0(userProfile.getDescription());
        this.f35616a.E0(userProfile.getGradeId());
        this.f35616a.v(userProfile.getRegisteredAt());
        this.f35616a.E1(userProfile.getFollowerNum());
        this.f35616a.k1(userProfile.getFollowingNum());
        this.f35616a.X(userProfile.getTotalViewerNum());
        String twitterScreenName = userProfile.getTwitterScreenName();
        kf.x xVar = this.f35616a;
        boolean z10 = true;
        if (twitterScreenName == null || twitterScreenName.length() == 0) {
            twitterScreenName = "";
        }
        xVar.R1(twitterScreenName);
        this.f35616a.n0(userProfile.getChatOnlyFollowings() == 1);
        this.f35616a.a3(userProfile.getCustomThanksMessage());
        this.f35616a.f2(userProfile.getHasStartedFirstLive());
        if (userProfile.getLinks() != null) {
            u(userProfile.getLinks());
        }
        LiveAnnouncement liveAnnouncement = userProfile.getLiveAnnouncement();
        if (liveAnnouncement != null && !TextUtils.isEmpty(liveAnnouncement.getBody())) {
            this.f35616a.g3(liveAnnouncement.getBody());
            this.f35616a.H(liveAnnouncement.getStartAt());
        } else {
            this.f35616a.g3("");
            this.f35616a.H(0);
        }
        this.f35616a.T2(userProfile.getMyAppNum());
        this.f35616a.j2(userProfile.getCurrentContinuousRecord());
        this.f35616a.d0(userProfile.isContinuousLiveUserAfterNextLive());
        String continuousStreamHolidayPeriod = userProfile.getContinuousStreamHolidayPeriod();
        kf.x xVar2 = this.f35616a;
        if (continuousStreamHolidayPeriod != null && continuousStreamHolidayPeriod.length() != 0) {
            z10 = false;
        }
        if (z10) {
            continuousStreamHolidayPeriod = "";
        }
        xVar2.k3(continuousStreamHolidayPeriod);
        this.f35616a.L(userProfile.isAbleContinuousStreamHoliday());
        s(userProfile.getAnnouncementUrls());
        this.f35616a.J1(userProfile.isAlreadySetHandoverCode());
        this.f35616a.y1(userProfile.getHasAvatar());
        FirebaseCrashlytics.getInstance().setUserId(userProfile.getUserId());
        kf.x xVar3 = this.f35616a;
        String catalogLabelImageUrl = userProfile.getCatalogLabelImageUrl();
        if (catalogLabelImageUrl == null) {
            catalogLabelImageUrl = "";
        }
        xVar3.X3(catalogLabelImageUrl);
        this.f35616a.u5(userProfile.getBadges().isEmpty() ? "" : userProfile.getBadges().get(0).getImageUrl());
        this.f35616a.l5(userProfile.getBirthday());
        this.f35616a.S2(userProfile.isBirthdayEditable() ? "" : userProfile.getBirthdayEditableDate());
        this.f35616a.W1(userProfile.isBirthday());
        this.f35616a.n5(userProfile.isVisibleBirthday());
        this.f35616a.m(userProfile.isBirthdayEditable());
        this.f35616a.p1(userProfile.getMaxContinuousRecord());
        this.f35616a.t(userProfile.getRecordingEnabled());
        if (userProfile.getAnniversary() != null) {
            kf.x xVar4 = this.f35616a;
            String s10 = new xm.e().s(userProfile.getAnniversary());
            jo.p.g(s10, "Gson().toJson(response.anniversary)");
            xVar4.w3(s10);
            return;
        }
        this.f35616a.w3("");
    }

    public final String x() {
        return this.f35616a.T4();
    }
}
