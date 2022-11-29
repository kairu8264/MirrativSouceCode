package nd;

import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f42210a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42211b;

    /* renamed from: c  reason: collision with root package name */
    public final jf.w f42212c;

    public s(String str, String str2, jf.w wVar) {
        jo.p.h(str, "mTitle");
        jo.p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        jo.p.h(wVar, "mApp");
        this.f42210a = str;
        this.f42211b = str2;
        this.f42212c = wVar;
    }

    public final String a() {
        return this.f42211b;
    }

    public final jf.w b() {
        return this.f42212c;
    }

    public final String c() {
        return this.f42210a;
    }
}
