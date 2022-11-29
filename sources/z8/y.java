package z8;

import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.MissionSpecial;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62785c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f62786a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f62787b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y a(MissionSpecial missionSpecial, String str) {
            jo.p.h(missionSpecial, Referer.MISSION);
            jo.p.h(str, "selectedAppImageUrl");
            return new y(missionSpecial.getIconImageUrl(), jo.p.c(missionSpecial.getIconImageUrl(), str));
        }
    }

    public y(String str, boolean z10) {
        jo.p.h(str, "appImageUrl");
        this.f62786a = str;
        this.f62787b = z10;
    }

    public final String a() {
        return this.f62786a;
    }

    public final boolean b() {
        return this.f62787b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return jo.p.c(this.f62786a, yVar.f62786a) && this.f62787b == yVar.f62787b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f62786a.hashCode() * 31;
        boolean z10 = this.f62787b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "SpecialMissionAppBindModel(appImageUrl=" + this.f62786a + ", isSelected=" + this.f62787b + ')';
    }
}
