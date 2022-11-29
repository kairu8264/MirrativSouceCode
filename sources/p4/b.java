package p4;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public c f45777a;

    public b(String str, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f45777a = new d(str, i10, i11);
        } else {
            this.f45777a = new e(str, i10, i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f45777a.equals(((b) obj).f45777a);
        }
        return false;
    }

    public int hashCode() {
        return this.f45777a.hashCode();
    }

    public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f45777a = new d(remoteUserInfo);
    }
}
