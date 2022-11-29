package ud;

import android.content.res.Resources;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z4 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f55826k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f55827a;

    /* renamed from: b  reason: collision with root package name */
    public final int f55828b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55829c;

    /* renamed from: d  reason: collision with root package name */
    public final int f55830d;

    /* renamed from: e  reason: collision with root package name */
    public final int f55831e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55832f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55833g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f55834h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f55835i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f55836j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z4 a(int i10, int i11, int i12, int i13, boolean z10) {
            boolean z11 = i12 >= i13;
            int i14 = z11 ? nd.y0.bg_progress_bar_max_yell_status_condition : nd.y0.bg_progress_bar_yell_status_condition;
            int i15 = z11 ? 1 : i12;
            int i16 = z11 ? 1 : i13;
            jo.i0 i0Var = jo.i0.f38149a;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
            jo.p.g(format, "format(format, *args)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("/ ");
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
            jo.p.g(format2, "format(format, *args)");
            sb2.append(format2);
            return new z4(i10, i11, i14, i15, i16, format, sb2.toString(), z11, i13 != 0, z10);
        }

        public final z4 b(int i10, int i11, int i12, int i13, Resources resources, boolean z10) {
            jo.p.h(resources, "resources");
            boolean z11 = i12 >= i13;
            int i14 = z11 ? nd.y0.bg_progress_bar_max_yell_status_condition : nd.y0.bg_progress_bar_yell_status_condition;
            int i15 = z11 ? 1 : i12;
            int i16 = z11 ? 1 : i13;
            int i17 = nd.f1.text_cheer_parameters_days_unit;
            jo.i0 i0Var = jo.i0.f38149a;
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
            jo.p.g(format, "format(format, *args)");
            String string = resources.getString(i17, format);
            jo.p.g(string, "resources.getString(R.st….format(\"%,d\", progress))");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("/ ");
            String format2 = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
            jo.p.g(format2, "format(format, *args)");
            sb2.append(resources.getString(i17, format2));
            return new z4(i10, i11, i14, i15, i16, string, sb2.toString(), z11, i13 != 0, z10);
        }

        public final z4 c(int i10, int i11, int i12, int i13, Resources resources, boolean z10) {
            jo.p.h(resources, "resources");
            boolean z11 = i12 >= i13;
            int i14 = z11 ? nd.y0.bg_progress_bar_max_yell_status_condition : nd.y0.bg_progress_bar_yell_status_condition;
            int i15 = z11 ? 1 : i12;
            int i16 = z11 ? 1 : i13;
            String d10 = d(i12, resources);
            return new z4(i10, i11, i14, i15, i16, d10, "/ " + d(i13, resources), z11, i13 != 0, z10);
        }

        public final String d(int i10, Resources resources) {
            String str;
            String str2;
            int i11 = i10 / 60;
            int i12 = i11 / 60;
            int i13 = i11 % 60;
            if (i12 == 0) {
                str = "";
            } else {
                str = i12 + resources.getString(nd.f1.text_time_unit_hour);
            }
            if (i13 == 0) {
                str2 = "";
            } else {
                str2 = i13 + resources.getString(nd.f1.text_time_unit_minute);
            }
            String str3 = str + (i12 != 0 ? " " : "") + str2;
            if (str3.length() == 0) {
                return '0' + resources.getString(nd.f1.text_time_unit_minute);
            }
            return str3;
        }
    }

    public z4(int i10, int i11, int i12, int i13, int i14, String str, String str2, boolean z10, boolean z11, boolean z12) {
        jo.p.h(str, "currentProgressText");
        jo.p.h(str2, "maxProgressText");
        this.f55827a = i10;
        this.f55828b = i11;
        this.f55829c = i12;
        this.f55830d = i13;
        this.f55831e = i14;
        this.f55832f = str;
        this.f55833g = str2;
        this.f55834h = z10;
        this.f55835i = z11;
        this.f55836j = z12;
    }

    public final String a() {
        return this.f55832f;
    }

    public final int b() {
        return this.f55828b;
    }

    public final int c() {
        return this.f55831e;
    }

    public final String d() {
        return this.f55833g;
    }

    public final int e() {
        return this.f55830d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z4) {
            z4 z4Var = (z4) obj;
            return this.f55827a == z4Var.f55827a && this.f55828b == z4Var.f55828b && this.f55829c == z4Var.f55829c && this.f55830d == z4Var.f55830d && this.f55831e == z4Var.f55831e && jo.p.c(this.f55832f, z4Var.f55832f) && jo.p.c(this.f55833g, z4Var.f55833g) && this.f55834h == z4Var.f55834h && this.f55835i == z4Var.f55835i && this.f55836j == z4Var.f55836j;
        }
        return false;
    }

    public final int f() {
        return this.f55829c;
    }

    public final int g() {
        return this.f55827a;
    }

    public final boolean h() {
        return this.f55836j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f55827a) * 31) + Integer.hashCode(this.f55828b)) * 31) + Integer.hashCode(this.f55829c)) * 31) + Integer.hashCode(this.f55830d)) * 31) + Integer.hashCode(this.f55831e)) * 31) + this.f55832f.hashCode()) * 31) + this.f55833g.hashCode()) * 31;
        boolean z10 = this.f55834h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55835i;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f55836j;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean i() {
        return this.f55834h;
    }

    public String toString() {
        return "UserProfileSeasonYellStatusConditionProgressBindModel(titleResource=" + this.f55827a + ", iconDrawableResource=" + this.f55828b + ", progressDrawableRes=" + this.f55829c + ", progress=" + this.f55830d + ", max=" + this.f55831e + ", currentProgressText=" + this.f55832f + ", maxProgressText=" + this.f55833g + ", isMax=" + this.f55834h + ", isVisibleView=" + this.f55835i + ", isEnabled=" + this.f55836j + ')';
    }
}
