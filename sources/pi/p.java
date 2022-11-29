package pi;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f48110a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48111b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48112c;

    /* renamed from: d  reason: collision with root package name */
    public final long f48113d;

    /* renamed from: e  reason: collision with root package name */
    public final long f48114e;

    /* renamed from: f  reason: collision with root package name */
    public final s f48115f;

    public p(b5 b5Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        s sVar;
        rh.p.e(str2);
        rh.p.e(str3);
        this.f48110a = str2;
        this.f48111b = str3;
        this.f48112c = true == TextUtils.isEmpty(str) ? null : str;
        this.f48113d = j10;
        this.f48114e = j11;
        if (j11 != 0 && j11 > j10) {
            b5Var.r().v().b("Event created with reverse previous/current timestamps. appId", q3.y(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    b5Var.r().p().a("Param name can't be null");
                    it.remove();
                } else {
                    Object m10 = b5Var.N().m(next, bundle2.get(next));
                    if (m10 == null) {
                        b5Var.r().v().b("Param value can't be null", b5Var.C().e(next));
                        it.remove();
                    } else {
                        b5Var.N().A(bundle2, next, m10);
                    }
                }
            }
            sVar = new s(bundle2);
        } else {
            sVar = new s(new Bundle());
        }
        this.f48115f = sVar;
    }

    public final p a(b5 b5Var, long j10) {
        return new p(b5Var, this.f48112c, this.f48110a, this.f48111b, this.f48113d, j10, this.f48115f);
    }

    public final String toString() {
        String str = this.f48110a;
        String str2 = this.f48111b;
        String obj = this.f48115f.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + obj.length());
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }

    public p(b5 b5Var, String str, String str2, String str3, long j10, long j11, s sVar) {
        rh.p.e(str2);
        rh.p.e(str3);
        rh.p.i(sVar);
        this.f48110a = str2;
        this.f48111b = str3;
        this.f48112c = true == TextUtils.isEmpty(str) ? null : str;
        this.f48113d = j10;
        this.f48114e = j11;
        if (j11 != 0 && j11 > j10) {
            b5Var.r().v().c("Event created with reverse previous/current timestamps. appId, name", q3.y(str2), q3.y(str3));
        }
        this.f48115f = sVar;
    }
}
