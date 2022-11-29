package ud;

import android.content.res.Resources;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserProfile;

/* loaded from: classes2.dex */
public final class b4 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f54792d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f54793a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54794b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f54795c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b4 a(Resources resources, UserProfile userProfile, boolean z10) {
            jo.p.h(resources, "resources");
            jo.p.h(userProfile, Referer.PROFILE);
            String continuousStreamHolidayPeriod = userProfile.getContinuousStreamHolidayPeriod();
            return new b4(continuousStreamHolidayPeriod, resources.getString(nd.f1.text_holiday_label) + resources.getString(nd.f1.text_days, String.valueOf(userProfile.getContinuousStreamHolidaysNum())), z10);
        }
    }

    public b4(String str, String str2, boolean z10) {
        jo.p.h(str2, "holidayText");
        this.f54793a = str;
        this.f54794b = str2;
        this.f54795c = z10;
    }

    public final String a() {
        return this.f54794b;
    }

    public final boolean b() {
        return this.f54795c;
    }

    public final String c() {
        return this.f54793a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b4) {
            b4 b4Var = (b4) obj;
            return jo.p.c(this.f54793a, b4Var.f54793a) && jo.p.c(this.f54794b, b4Var.f54794b) && this.f54795c == b4Var.f54795c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f54793a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f54794b.hashCode()) * 31;
        boolean z10 = this.f54795c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "StreamHolidayBalloonBindModel(periodText=" + this.f54793a + ", holidayText=" + this.f54794b + ", holidayViewVisibility=" + this.f54795c + ')';
    }
}
