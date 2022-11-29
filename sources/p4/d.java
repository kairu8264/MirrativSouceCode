package p4;

import android.media.session.MediaSessionManager;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: d  reason: collision with root package name */
    public final MediaSessionManager.RemoteUserInfo f45778d;

    public d(String str, int i10, int i11) {
        super(str, i10, i11);
        this.f45778d = new MediaSessionManager.RemoteUserInfo(str, i10, i11);
    }

    public d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f45778d = remoteUserInfo;
    }
}
