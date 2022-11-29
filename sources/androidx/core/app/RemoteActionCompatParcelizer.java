package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f14951a = (IconCompat) versionedParcel.v(remoteActionCompat.f14951a, 1);
        remoteActionCompat.f14952b = versionedParcel.l(remoteActionCompat.f14952b, 2);
        remoteActionCompat.f14953c = versionedParcel.l(remoteActionCompat.f14953c, 3);
        remoteActionCompat.f14954d = (PendingIntent) versionedParcel.r(remoteActionCompat.f14954d, 4);
        remoteActionCompat.f14955e = versionedParcel.h(remoteActionCompat.f14955e, 5);
        remoteActionCompat.f14956f = versionedParcel.h(remoteActionCompat.f14956f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f14951a, 1);
        versionedParcel.D(remoteActionCompat.f14952b, 2);
        versionedParcel.D(remoteActionCompat.f14953c, 3);
        versionedParcel.H(remoteActionCompat.f14954d, 4);
        versionedParcel.z(remoteActionCompat.f14955e, 5);
        versionedParcel.z(remoteActionCompat.f14956f, 6);
    }
}
