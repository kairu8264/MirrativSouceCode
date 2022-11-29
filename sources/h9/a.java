package h9;

import android.content.res.Resources;
import java.util.Arrays;
import jo.p;
import wn.l;
import wn.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final C0438a f34594i = new C0438a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f34595a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34596b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34597c;

    /* renamed from: d  reason: collision with root package name */
    public final String f34598d;

    /* renamed from: e  reason: collision with root package name */
    public final int f34599e;

    /* renamed from: f  reason: collision with root package name */
    public final int f34600f;

    /* renamed from: g  reason: collision with root package name */
    public final String f34601g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f34602h;

    /* renamed from: h9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0438a {
        public C0438a() {
        }

        public /* synthetic */ C0438a(jo.h hVar) {
            this();
        }

        public final a a(int i10, int i11, int i12, int i13, int i14, int i15, Resources resources) {
            int a10;
            p.h(resources, "resources");
            try {
                l.a aVar = l.f59224w;
                a10 = l.a(Float.valueOf(((i11 - i12) / (i13 - i12)) * 100.0f));
            } catch (Throwable th2) {
                l.a aVar2 = l.f59224w;
                a10 = l.a(m.a(th2));
            }
            if (l.b(a10) != null) {
                a10 = 0;
            }
            int intValue = ((Number) a10).intValue();
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 - i12)}, 1));
            p.g(format, "format(this, *args)");
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i13 - i12)}, 1));
            p.g(format2, "format(this, *args)");
            int i16 = f.f34612d;
            String format3 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            p.g(format3, "format(this, *args)");
            String string = resources.getString(i16, format3);
            p.g(string, "resources.getString(R.st…G_FORMAT.format(current))");
            return new a(i10, intValue, format, format2, i14, i15, string, i11 > 0);
        }
    }

    public a(int i10, int i11, String str, String str2, int i12, int i13, String str3, boolean z10) {
        p.h(str, "expText");
        p.h(str2, "limitExpText");
        p.h(str3, "totalExpText");
        this.f34595a = i10;
        this.f34596b = i11;
        this.f34597c = str;
        this.f34598d = str2;
        this.f34599e = i12;
        this.f34600f = i13;
        this.f34601g = str3;
        this.f34602h = z10;
    }

    public final int a() {
        return this.f34595a;
    }

    public final String b() {
        return this.f34597c;
    }

    public final String c() {
        return this.f34598d;
    }

    public final int d() {
        return this.f34596b;
    }

    public final int e() {
        return this.f34600f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f34595a == aVar.f34595a && this.f34596b == aVar.f34596b && p.c(this.f34597c, aVar.f34597c) && p.c(this.f34598d, aVar.f34598d) && this.f34599e == aVar.f34599e && this.f34600f == aVar.f34600f && p.c(this.f34601g, aVar.f34601g) && this.f34602h == aVar.f34602h;
        }
        return false;
    }

    public final int f() {
        return this.f34599e;
    }

    public final String g() {
        return this.f34601g;
    }

    public final boolean h() {
        return this.f34602h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f34595a) * 31) + Integer.hashCode(this.f34596b)) * 31) + this.f34597c.hashCode()) * 31) + this.f34598d.hashCode()) * 31) + Integer.hashCode(this.f34599e)) * 31) + Integer.hashCode(this.f34600f)) * 31) + this.f34601g.hashCode()) * 31;
        boolean z10 = this.f34602h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "MirraClassSeasonRatingViewBindModel(badgeImageDrawableResInt=" + this.f34595a + ", progress=" + this.f34596b + ", expText=" + this.f34597c + ", limitExpText=" + this.f34598d + ", textColorResInt=" + this.f34599e + ", progressDrawableResInt=" + this.f34600f + ", totalExpText=" + this.f34601g + ", isVisibleCardView=" + this.f34602h + ')';
    }
}
