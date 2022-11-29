package ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.dena.mirrorman.net.api.response.campaign.PrizeGrantType;

/* loaded from: classes2.dex */
public final class e3 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f54886c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f54887d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f54888a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f54889b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: ud.e3$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0863a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f54890a;

            static {
                int[] iArr = new int[PrizeGrantType.values().length];
                iArr[PrizeGrantType.ALL_APPLICANTS_GIVEN_PRESENT.ordinal()] = 1;
                iArr[PrizeGrantType.LOTTERY.ordinal()] = 2;
                iArr[PrizeGrantType.DIVIDE_EQUALLY.ordinal()] = 3;
                iArr[PrizeGrantType.DAILY_LOTTERY.ordinal()] = 4;
                f54890a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e3 a(Context context, PrizeGrantType prizeGrantType) {
            e3 e3Var;
            jo.p.h(context, "context");
            jo.p.h(prizeGrantType, "type");
            int i10 = C0863a.f54890a[prizeGrantType.ordinal()];
            if (i10 == 1) {
                String string = context.getResources().getString(nd.f1.text_all_applicants_given_present);
                jo.p.g(string, "context.resources.getStr…applicants_given_present)");
                e3Var = new e3(string, c3.a.f(context, nd.y0.rectangle_corner8_grapefruit));
            } else if (i10 == 2) {
                String string2 = context.getResources().getString(nd.f1.text_lottery);
                jo.p.g(string2, "context.resources.getString(R.string.text_lottery)");
                e3Var = new e3(string2, c3.a.f(context, nd.y0.rectangle_corner8_darkskybluethree));
            } else if (i10 == 3) {
                String string3 = context.getResources().getString(nd.f1.text_divide_equally);
                jo.p.g(string3, "context.resources.getStr…ring.text_divide_equally)");
                e3Var = new e3(string3, c3.a.f(context, nd.y0.rectangle_corner8_squash));
            } else if (i10 != 4) {
                return new e3("", null);
            } else {
                String string4 = context.getResources().getString(nd.f1.text_daily_lottery);
                jo.p.g(string4, "context.resources.getStr…tring.text_daily_lottery)");
                e3Var = new e3(string4, c3.a.f(context, nd.y0.rectangle_corner8_darkskybluethree));
            }
            return e3Var;
        }
    }

    public e3(String str, Drawable drawable) {
        jo.p.h(str, "text");
        this.f54888a = str;
        this.f54889b = drawable;
    }

    public final Drawable a() {
        return this.f54889b;
    }

    public final String b() {
        return this.f54888a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e3) {
            e3 e3Var = (e3) obj;
            return jo.p.c(this.f54888a, e3Var.f54888a) && jo.p.c(this.f54889b, e3Var.f54889b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f54888a.hashCode() * 31;
        Drawable drawable = this.f54889b;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public String toString() {
        return "PrizeGrantBindModel(text=" + this.f54888a + ", background=" + this.f54889b + ')';
    }
}
