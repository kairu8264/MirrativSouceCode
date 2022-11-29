package ud;

import android.content.res.Resources;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserProfile;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55659e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f55660a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55661b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55662c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f55663d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x a(Resources resources, UserProfile userProfile, boolean z10) {
            jo.p.h(resources, "resources");
            jo.p.h(userProfile, Referer.PROFILE);
            String string = resources.getString(nd.f1.text_every_progress, String.valueOf(userProfile.getCurrentContinuousRecord()));
            jo.p.g(string, "resources.getString(R.st…tinuousRecord.toString())");
            String string2 = resources.getString(nd.f1.text_every_maximum, String.valueOf(userProfile.getMaxContinuousRecord()));
            jo.p.g(string2, "resources.getString(R.st…tinuousRecord.toString())");
            return new x(string, string2, resources.getString(nd.f1.text_holiday_label) + resources.getString(nd.f1.text_days, String.valueOf(userProfile.getContinuousStreamHolidaysNum())), z10);
        }
    }

    public x(String str, String str2, String str3, boolean z10) {
        jo.p.h(str, "continuousText");
        jo.p.h(str2, "recordText");
        jo.p.h(str3, "holidayText");
        this.f55660a = str;
        this.f55661b = str2;
        this.f55662c = str3;
        this.f55663d = z10;
    }

    public final String a() {
        return this.f55660a;
    }

    public final String b() {
        return this.f55662c;
    }

    public final boolean c() {
        return this.f55663d;
    }

    public final String d() {
        return this.f55661b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return jo.p.c(this.f55660a, xVar.f55660a) && jo.p.c(this.f55661b, xVar.f55661b) && jo.p.c(this.f55662c, xVar.f55662c) && this.f55663d == xVar.f55663d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f55660a.hashCode() * 31) + this.f55661b.hashCode()) * 31) + this.f55662c.hashCode()) * 31;
        boolean z10 = this.f55663d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ContinuousStreamBalloonBindModel(continuousText=" + this.f55660a + ", recordText=" + this.f55661b + ", holidayText=" + this.f55662c + ", holidayViewVisibility=" + this.f55663d + ')';
    }
}
