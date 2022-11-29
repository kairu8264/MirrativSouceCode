package pk;

import android.content.Context;
import android.text.TextUtils;
import rh.n;
import rh.p;
import rh.s;
import vh.r;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f48441a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48442b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48443c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48444d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48445e;

    /* renamed from: f  reason: collision with root package name */
    public final String f48446f;

    /* renamed from: g  reason: collision with root package name */
    public final String f48447g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.m(!r.a(str), "ApplicationId must be set.");
        this.f48442b = str;
        this.f48441a = str2;
        this.f48443c = str3;
        this.f48444d = str4;
        this.f48445e = str5;
        this.f48446f = str6;
        this.f48447g = str7;
    }

    public static h a(Context context) {
        s sVar = new s(context);
        String a10 = sVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new h(a10, sVar.a("google_api_key"), sVar.a("firebase_database_url"), sVar.a("ga_trackingId"), sVar.a("gcm_defaultSenderId"), sVar.a("google_storage_bucket"), sVar.a("project_id"));
    }

    public String b() {
        return this.f48441a;
    }

    public String c() {
        return this.f48442b;
    }

    public String d() {
        return this.f48445e;
    }

    public String e() {
        return this.f48447g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return n.a(this.f48442b, hVar.f48442b) && n.a(this.f48441a, hVar.f48441a) && n.a(this.f48443c, hVar.f48443c) && n.a(this.f48444d, hVar.f48444d) && n.a(this.f48445e, hVar.f48445e) && n.a(this.f48446f, hVar.f48446f) && n.a(this.f48447g, hVar.f48447g);
        }
        return false;
    }

    public int hashCode() {
        return n.b(this.f48442b, this.f48441a, this.f48443c, this.f48444d, this.f48445e, this.f48446f, this.f48447g);
    }

    public String toString() {
        return n.c(this).a("applicationId", this.f48442b).a("apiKey", this.f48441a).a("databaseUrl", this.f48443c).a("gcmSenderId", this.f48445e).a("storageBucket", this.f48446f).a("projectId", this.f48447g).toString();
    }
}
