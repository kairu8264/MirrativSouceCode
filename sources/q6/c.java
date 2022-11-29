package q6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f48740a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48741b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48742c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f48743d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f48744e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f48745f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f48746g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f48747h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f48748i = 0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f48749j = false;

    public c(String str, String str2, String str3, String str4) {
        this.f48740a = str;
        this.f48741b = str2;
        this.f48742c = str3;
        this.f48743d = a(str4);
        this.f48744e = b(str4);
        this.f48745f = e(str4);
    }

    public static List<String> a(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://app.adjust.net.in", "https://app.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://app.adjust.world", "https://app.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://app.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://app.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://app.us.adjust.com");
        }
        return Arrays.asList("https://app.adjust.com", "https://app.adjust.net.in", "https://app.adjust.world");
    }

    public static List<String> b(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://gdpr.adjust.net.in", "https://gdpr.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://gdpr.adjust.world", "https://gdpr.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://gdpr.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://gdpr.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://gdpr.us.adjust.com");
        }
        return Arrays.asList("https://gdpr.adjust.com", "https://gdpr.adjust.net.in", "https://gdpr.adjust.world");
    }

    public static List<String> e(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://subscription.adjust.net.in", "https://subscription.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://subscription.adjust.world", "https://subscription.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://subscription.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://subscription.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://subscription.us.adjust.com");
        }
        return Arrays.asList("https://subscription.adjust.com", "https://subscription.adjust.net.in", "https://subscription.adjust.world");
    }

    public void c() {
        this.f48748i = this.f48747h;
        this.f48746g = true;
    }

    public boolean d(p6.b bVar) {
        int size;
        this.f48746g = false;
        if (this.f48749j) {
            return false;
        }
        if (bVar == p6.b.GDPR) {
            size = this.f48744e.size();
        } else if (bVar == p6.b.SUBSCRIPTION) {
            size = this.f48745f.size();
        } else {
            size = this.f48743d.size();
        }
        int i10 = (this.f48747h + 1) % size;
        this.f48747h = i10;
        return i10 != this.f48748i;
    }

    public String f(p6.b bVar) {
        if (bVar == p6.b.GDPR) {
            String str = this.f48741b;
            if (str != null) {
                this.f48749j = true;
                return str;
            }
            this.f48749j = false;
            return this.f48744e.get(this.f48747h);
        } else if (bVar == p6.b.SUBSCRIPTION) {
            String str2 = this.f48742c;
            if (str2 != null) {
                this.f48749j = true;
                return str2;
            }
            this.f48749j = false;
            return this.f48745f.get(this.f48747h);
        } else {
            String str3 = this.f48740a;
            if (str3 != null) {
                this.f48749j = true;
                return str3;
            }
            this.f48749j = false;
            return this.f48743d.get(this.f48747h);
        }
    }
}
