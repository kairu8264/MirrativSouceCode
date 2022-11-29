package s7;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<i>> f52245c;

    /* renamed from: d  reason: collision with root package name */
    public volatile Map<String, String> f52246d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final String f52247d;

        /* renamed from: e  reason: collision with root package name */
        public static final Map<String, List<i>> f52248e;

        /* renamed from: a  reason: collision with root package name */
        public boolean f52249a = true;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, List<i>> f52250b = f52248e;

        /* renamed from: c  reason: collision with root package name */
        public boolean f52251c = true;

        static {
            String b10 = b();
            f52247d = b10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b10)));
            }
            f52248e = Collections.unmodifiableMap(hashMap);
        }

        public static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public j a() {
            this.f52249a = true;
            return new j(this.f52250b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        public final String f52252a;

        public b(String str) {
            this.f52252a = str;
        }

        @Override // s7.i
        public String a() {
            return this.f52252a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f52252a.equals(((b) obj).f52252a);
            }
            return false;
        }

        public int hashCode() {
            return this.f52252a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f52252a + "'}";
        }
    }

    public j(Map<String, List<i>> map) {
        this.f52245c = Collections.unmodifiableMap(map);
    }

    @Override // s7.h
    public Map<String, String> a() {
        if (this.f52246d == null) {
            synchronized (this) {
                if (this.f52246d == null) {
                    this.f52246d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f52246d;
    }

    public final String b(List<i> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = list.get(i10).a();
            if (!TextUtils.isEmpty(a10)) {
                sb2.append(a10);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f52245c.entrySet()) {
            String b10 = b(entry.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(entry.getKey(), b10);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f52245c.equals(((j) obj).f52245c);
        }
        return false;
    }

    public int hashCode() {
        return this.f52245c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f52245c + '}';
    }
}
