package yg;

import ai.a44;
import ai.uj0;
import com.google.android.gms.internal.ads.zzwl;

/* loaded from: classes3.dex */
public final class l0 implements a44 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f61910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f61911b;

    public l0(s0 s0Var, String str, p0 p0Var) {
        this.f61910a = str;
        this.f61911b = p0Var;
    }

    @Override // ai.a44
    public final void a(zzwl zzwlVar) {
        String str = this.f61910a;
        String exc = zzwlVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb2.append("Failed to load URL: ");
        sb2.append(str);
        sb2.append("\n");
        sb2.append(exc);
        uj0.f(sb2.toString());
        this.f61911b.a(null);
    }
}
