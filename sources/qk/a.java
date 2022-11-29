package qk;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import tk.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f49558g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final DateFormat f49559h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f49560a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49561b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49562c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f49563d;

    /* renamed from: e  reason: collision with root package name */
    public final long f49564e;

    /* renamed from: f  reason: collision with root package name */
    public final long f49565f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f49560a = str;
        this.f49561b = str2;
        this.f49562c = str3;
        this.f49563d = date;
        this.f49564e = j10;
        this.f49565f = j11;
    }

    public static a a(Map<String, String> map) throws AbtException {
        e(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f49559h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    public static void e(Map<String, String> map) throws AbtException {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f49558g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public String b() {
        return this.f49560a;
    }

    public long c() {
        return this.f49563d.getTime();
    }

    public a.c d(String str) {
        a.c cVar = new a.c();
        cVar.f53769a = str;
        cVar.f53781m = c();
        cVar.f53770b = this.f49560a;
        cVar.f53771c = this.f49561b;
        cVar.f53772d = TextUtils.isEmpty(this.f49562c) ? null : this.f49562c;
        cVar.f53773e = this.f49564e;
        cVar.f53778j = this.f49565f;
        return cVar;
    }
}
