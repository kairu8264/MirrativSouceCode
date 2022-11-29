package ai;

import android.util.Log;

/* loaded from: classes3.dex */
public final class dn3 extends in3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3356a;

    public dn3(String str) {
        this.f3356a = str;
    }

    @Override // ai.in3
    public final void a(String str) {
        String str2 = this.f3356a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
