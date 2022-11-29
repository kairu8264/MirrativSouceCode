package na;

import jo.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f41645a;

    /* renamed from: b  reason: collision with root package name */
    public final i f41646b;

    public c(String str, i iVar) {
        p.h(str, "missionBannerUrl");
        p.h(iVar, "liveGameMissionCoinBindModel");
        this.f41645a = str;
        this.f41646b = iVar;
    }

    public final i a() {
        return this.f41646b;
    }

    public final String b() {
        return this.f41645a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return p.c(this.f41645a, cVar.f41645a) && p.c(this.f41646b, cVar.f41646b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f41645a.hashCode() * 31) + this.f41646b.hashCode();
    }

    public String toString() {
        return "LiveGameListingBindModel(missionBannerUrl=" + this.f41645a + ", liveGameMissionCoinBindModel=" + this.f41646b + ')';
    }
}
