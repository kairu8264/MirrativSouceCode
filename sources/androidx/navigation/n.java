package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f15774a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15775b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15776c;

    public n(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public String a() {
        return this.f15775b;
    }

    public String b() {
        return this.f15776c;
    }

    public Uri c() {
        return this.f15774a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (this.f15774a != null) {
            sb2.append(" uri=");
            sb2.append(this.f15774a.toString());
        }
        if (this.f15775b != null) {
            sb2.append(" action=");
            sb2.append(this.f15775b);
        }
        if (this.f15776c != null) {
            sb2.append(" mimetype=");
            sb2.append(this.f15776c);
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public n(Uri uri, String str, String str2) {
        this.f15774a = uri;
        this.f15775b = str;
        this.f15776c = str2;
    }
}
