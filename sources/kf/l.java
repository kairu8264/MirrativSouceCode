package kf;

import android.app.NotificationManager;

/* loaded from: classes2.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final NotificationManager f38726a;

    public l(NotificationManager notificationManager) {
        jo.p.h(notificationManager, "notificationManager");
        this.f38726a = notificationManager;
    }

    @Override // kf.k
    public boolean d() {
        return this.f38726a.isNotificationPolicyAccessGranted();
    }
}
