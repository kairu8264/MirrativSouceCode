package nd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f42202a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42203b;

    /* renamed from: c  reason: collision with root package name */
    public final MRError f42204c;

    public r(int i10, boolean z10, MRError mRError) {
        jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        this.f42202a = i10;
        this.f42203b = z10;
        this.f42204c = mRError;
    }

    public final MRError a() {
        return this.f42204c;
    }

    public final int b() {
        return this.f42202a;
    }

    public final boolean c() {
        return this.f42203b;
    }
}
