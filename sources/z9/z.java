package z9;

import android.graphics.Color;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingButtonStyle;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingDate;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingDateType;
import java.util.Arrays;
import jo.i0;
import ud.a;

/* loaded from: classes.dex */
public final class z implements ud.a {
    public static final a E = new a(null);
    public final int A;
    public final int B;
    public final boolean C;
    public final a.EnumC0862a D;

    /* renamed from: w  reason: collision with root package name */
    public final String f62914w;

    /* renamed from: x  reason: collision with root package name */
    public final String f62915x;

    /* renamed from: y  reason: collision with root package name */
    public final String f62916y;

    /* renamed from: z  reason: collision with root package name */
    public final int f62917z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(GiftRankingDate giftRankingDate, GiftRankingButtonStyle giftRankingButtonStyle) {
            jo.p.h(giftRankingDate, "date");
            jo.p.h(giftRankingButtonStyle, "dateButton");
            String str = giftRankingDate.getMonth() + '.';
            String day = giftRankingDate.getDay();
            String description = giftRankingDate.getDescription();
            i0 i0Var = i0.f38149a;
            String format = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingButtonStyle.getFrameColor()}, 1));
            jo.p.g(format, "format(format, *args)");
            int parseColor = Color.parseColor(format);
            String format2 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingButtonStyle.getBackgroundColor()}, 1));
            jo.p.g(format2, "format(format, *args)");
            int parseColor2 = Color.parseColor(format2);
            String format3 = String.format("#%s", Arrays.copyOf(new Object[]{giftRankingButtonStyle.getTextColor()}, 1));
            jo.p.g(format3, "format(format, *args)");
            return new z(str, day, description, parseColor, parseColor2, Color.parseColor(format3), giftRankingDate.getType() == GiftRankingDateType.TODAY.getRawValue(), null, 128, null);
        }
    }

    public z(String str, String str2, String str3, int i10, int i11, int i12, boolean z10, a.EnumC0862a enumC0862a) {
        jo.p.h(str, "termMonthText");
        jo.p.h(str2, "termDayText");
        jo.p.h(str3, "termDayOfWeekText");
        jo.p.h(enumC0862a, "type");
        this.f62914w = str;
        this.f62915x = str2;
        this.f62916y = str3;
        this.f62917z = i10;
        this.A = i11;
        this.B = i12;
        this.C = z10;
        this.D = enumC0862a;
    }

    public final int a() {
        return this.f62917z;
    }

    public final int b() {
        return this.B;
    }

    public final String c() {
        return this.f62916y;
    }

    public final String d() {
        return this.f62915x;
    }

    public final int e() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return jo.p.c(this.f62914w, zVar.f62914w) && jo.p.c(this.f62915x, zVar.f62915x) && jo.p.c(this.f62916y, zVar.f62916y) && this.f62917z == zVar.f62917z && this.A == zVar.A && this.B == zVar.B && this.C == zVar.C && getType() == zVar.getType();
        }
        return false;
    }

    public final String f() {
        return this.f62914w;
    }

    public final boolean g() {
        return this.C;
    }

    @Override // ud.a
    public a.EnumC0862a getType() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f62914w.hashCode() * 31) + this.f62915x.hashCode()) * 31) + this.f62916y.hashCode()) * 31) + Integer.hashCode(this.f62917z)) * 31) + Integer.hashCode(this.A)) * 31) + Integer.hashCode(this.B)) * 31;
        boolean z10 = this.C;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + getType().hashCode();
    }

    public String toString() {
        return "GiftRankingTermBindModel(termMonthText=" + this.f62914w + ", termDayText=" + this.f62915x + ", termDayOfWeekText=" + this.f62916y + ", termBorderColor=" + this.f62917z + ", termInnerColor=" + this.A + ", termDateTextColor=" + this.B + ", visibleToday=" + this.C + ", type=" + getType() + ')';
    }

    public /* synthetic */ z(String str, String str2, String str3, int i10, int i11, int i12, boolean z10, a.EnumC0862a enumC0862a, int i13, jo.h hVar) {
        this(str, str2, str3, i10, i11, i12, z10, (i13 & 128) != 0 ? a.EnumC0862a.GIFT_RANKING_TERM : enumC0862a);
    }
}
