package ud;

import com.dena.mirrorman.net.api.response.MissionStatusResponse;

/* loaded from: classes2.dex */
public final class h2 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f54992e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f54993a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f54994b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54995c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f54996d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h2 a(MissionStatusResponse missionStatusResponse) {
            jo.p.h(missionStatusResponse, "response");
            String valueOf = String.valueOf(missionStatusResponse.getUnreceivedMissionNum());
            boolean z10 = missionStatusResponse.getUnreceivedMissionNum() > 0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(missionStatusResponse.getCompleteMissionNum());
            sb2.append('/');
            sb2.append(missionStatusResponse.getTotalMissionNum());
            return new h2(valueOf, z10, sb2.toString(), missionStatusResponse.getEnableMission());
        }
    }

    public h2(String str, boolean z10, String str2, boolean z11) {
        jo.p.h(str, "unreceivedMissionNumText");
        jo.p.h(str2, "missionNumAndMaxText");
        this.f54993a = str;
        this.f54994b = z10;
        this.f54995c = str2;
        this.f54996d = z11;
    }

    public final boolean a() {
        return this.f54994b;
    }

    public final boolean b() {
        return this.f54996d;
    }

    public final String c() {
        return this.f54995c;
    }

    public final String d() {
        return this.f54993a;
    }
}
