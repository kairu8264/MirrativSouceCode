package hf;

import android.content.Context;
import android.util.Size;
import com.dena.mirrorman.net.api.response.live.LiveOwnedResponse;

/* loaded from: classes2.dex */
public final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35558a;

    /* renamed from: b  reason: collision with root package name */
    public final m0 f35559b;

    /* renamed from: c  reason: collision with root package name */
    public final ze.w f35560c;

    /* renamed from: d  reason: collision with root package name */
    public final r f35561d;

    public m(Context context, m0 m0Var, ze.w wVar, r rVar) {
        jo.p.h(context, "context");
        jo.p.h(m0Var, "settingHelper");
        jo.p.h(wVar, "videoResolution");
        jo.p.h(rVar, "featureHelper");
        this.f35558a = context;
        this.f35559b = m0Var;
        this.f35560c = wVar;
        this.f35561d = rVar;
    }

    @Override // hf.l
    public ye.c a(LiveOwnedResponse liveOwnedResponse) {
        String d10 = this.f35559b.d();
        if (!(liveOwnedResponse != null ? jo.p.c(liveOwnedResponse.getHighQualityAvailable(), Boolean.TRUE) : false) && this.f35559b.n()) {
            g9.a.f32826a.b("Broadcast quality is forcibly changed to Normal", new Object[0]);
            d10 = "normal";
        }
        String str = d10;
        Size b10 = b(liveOwnedResponse != null ? liveOwnedResponse.getCustomResolutions() : null, str);
        int height = b10.getHeight();
        int width = b10.getWidth();
        ze.b.f63104j.a().g(width, height, this.f35559b.k(this.f35558a, str), this.f35559b.l(this.f35558a, str));
        ye.c cVar = new ye.c(0, null, 0, 0, null, null, null, null, false, null, 0, 0, null, 0, 0.0d, 32767, null);
        cVar.p(liveOwnedResponse, width, height, str, of.q.f45417a.d(this.f35558a));
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x0002, B:20:0x003a, B:23:0x0045, B:10:0x0016, B:13:0x001f, B:14:0x0024, B:17:0x002d, B:18:0x0032, B:21:0x003f), top: B:29:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Size b(com.dena.mirrorman.net.api.response.live.LiveOwnedCustomResolutions r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L50
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> L4c
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L32
            r1 = 107348(0x1a354, float:1.50427E-40)
            if (r0 == r1) goto L24
            r1 = 3202466(0x30dda2, float:4.48761E-39)
            if (r0 == r1) goto L16
            goto L3a
        L16:
            java.lang.String r0 = "high"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L1f
            goto L3a
        L1f:
            java.lang.String r3 = r3.getH()     // Catch: java.lang.Exception -> L4c
            goto L43
        L24:
            java.lang.String r0 = "low"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L2d
            goto L3a
        L2d:
            java.lang.String r3 = r3.getL()     // Catch: java.lang.Exception -> L4c
            goto L43
        L32:
            java.lang.String r0 = "normal"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L3f
        L3a:
            java.lang.String r3 = r3.getM()     // Catch: java.lang.Exception -> L4c
            goto L43
        L3f:
            java.lang.String r3 = r3.getM()     // Catch: java.lang.Exception -> L4c
        L43:
            if (r3 == 0) goto L50
            ze.w r0 = r2.f35560c     // Catch: java.lang.Exception -> L4c
            android.util.Size r3 = r0.c(r3)     // Catch: java.lang.Exception -> L4c
            return r3
        L4c:
            r3 = move-exception
            g9.a.c(r3)
        L50:
            ze.w r3 = r2.f35560c
            hf.r r0 = r2.f35561d
            boolean r0 = r0.s()
            android.util.Size r3 = r3.b(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.m.b(com.dena.mirrorman.net.api.response.live.LiveOwnedCustomResolutions, java.lang.String):android.util.Size");
    }
}
