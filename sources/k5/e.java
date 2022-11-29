package k5;

import android.app.Notification;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f38411a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38412b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f38413c;

    public e(int i10, Notification notification, int i11) {
        this.f38411a = i10;
        this.f38413c = notification;
        this.f38412b = i11;
    }

    public int a() {
        return this.f38412b;
    }

    public Notification b() {
        return this.f38413c;
    }

    public int c() {
        return this.f38411a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f38411a == eVar.f38411a && this.f38412b == eVar.f38412b) {
            return this.f38413c.equals(eVar.f38413c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f38411a * 31) + this.f38412b) * 31) + this.f38413c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f38411a + ", mForegroundServiceType=" + this.f38412b + ", mNotification=" + this.f38413c + '}';
    }
}
