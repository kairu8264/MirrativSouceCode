package ld;

import android.net.Uri;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f40090a = "1FAIpQLSe-P75pBixmbJIWXFMDYbbzcTdEtXQ-ROTFM4JSUdOxtXo9-Q";

    /* renamed from: b  reason: collision with root package name */
    public final String f40091b = "entry.304840708";

    /* renamed from: c  reason: collision with root package name */
    public final String f40092c = "entry.1439744129";

    /* renamed from: d  reason: collision with root package name */
    public final String f40093d = "entry.1376080750_year";

    /* renamed from: e  reason: collision with root package name */
    public final String f40094e = "entry.1376080750_month";

    /* renamed from: f  reason: collision with root package name */
    public final String f40095f = "entry.1376080750_day";

    public final String a(String str, String str2) {
        jo.p.h(str, "userId");
        jo.p.h(str2, "userName");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int i10 = calendar.get(1);
        int i11 = calendar.get(5);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("docs.google.com");
        builder.path("/forms/d/e/" + this.f40090a + "/viewform");
        builder.appendQueryParameter(this.f40091b, str);
        builder.appendQueryParameter(this.f40092c, str2);
        builder.appendQueryParameter(this.f40093d, String.valueOf(i10));
        builder.appendQueryParameter(this.f40094e, String.valueOf(calendar.get(2) + 1));
        builder.appendQueryParameter(this.f40095f, String.valueOf(i11));
        String uri = builder.build().toString();
        jo.p.g(uri, "builder.build().toString()");
        return uri;
    }
}
