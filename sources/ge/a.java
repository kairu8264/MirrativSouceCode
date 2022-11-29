package ge;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f33252a;

    /* renamed from: b  reason: collision with root package name */
    public String f33253b;

    public final synchronized n3.d<String, String> a() {
        return (TextUtils.isEmpty(this.f33252a) && TextUtils.isEmpty(this.f33253b)) ? null : new n3.d<>(this.f33252a, this.f33253b);
    }

    public final synchronized void b(String str, String str2) {
        this.f33252a = str;
        this.f33253b = str2;
    }

    public final synchronized void c() {
        this.f33252a = null;
        this.f33253b = null;
    }
}
