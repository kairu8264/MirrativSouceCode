package pi;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f48185a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48186b;

    /* renamed from: c  reason: collision with root package name */
    public final long f48187c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f48188d;

    public r3(String str, String str2, Bundle bundle, long j10) {
        this.f48185a = str;
        this.f48186b = str2;
        this.f48188d = bundle;
        this.f48187c = j10;
    }

    public static r3 b(u uVar) {
        return new r3(uVar.f48250w, uVar.f48252y, uVar.f48251x.S(), uVar.f48253z);
    }

    public final u a() {
        return new u(this.f48185a, new s(new Bundle(this.f48188d)), this.f48186b, this.f48187c);
    }

    public final String toString() {
        String str = this.f48186b;
        String str2 = this.f48185a;
        String obj = this.f48188d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + obj.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(obj);
        return sb2.toString();
    }
}
