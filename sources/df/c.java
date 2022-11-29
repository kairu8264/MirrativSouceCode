package df;

import jo.h;
import kotlin.NoWhenBranchMatchedException;
import nd.f1;
import nd.w0;
import nd.y0;

/* loaded from: classes2.dex */
public enum c {
    S(1, y0.icon_class_s),
    A2(2, y0.icon_class_a2),
    A1(3, y0.icon_class_a1),
    B4(4, y0.icon_class_b4),
    B3(5, y0.icon_class_b3),
    B2(6, y0.icon_class_b2),
    B1(7, y0.icon_class_b1),
    C2(8, y0.icon_class_c2),
    C1(9, y0.icon_class_c1),
    D2(10, y0.icon_class_d2),
    D1(11, y0.icon_class_d1),
    E(12, y0.icon_class_e);
    
    public static final a Companion = new a(null);
    private final int badgeImage;
    private final int classId;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(int i10) {
            c cVar;
            c[] values = c.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    cVar = null;
                    break;
                }
                cVar = values[i11];
                if (cVar.i() == i10) {
                    break;
                }
                i11++;
            }
            return cVar == null ? c.E : cVar;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29608a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.E.ordinal()] = 1;
            iArr[c.D1.ordinal()] = 2;
            iArr[c.D2.ordinal()] = 3;
            iArr[c.S.ordinal()] = 4;
            iArr[c.A2.ordinal()] = 5;
            iArr[c.A1.ordinal()] = 6;
            iArr[c.B4.ordinal()] = 7;
            iArr[c.B3.ordinal()] = 8;
            iArr[c.B2.ordinal()] = 9;
            iArr[c.B1.ordinal()] = 10;
            iArr[c.C2.ordinal()] = 11;
            iArr[c.C1.ordinal()] = 12;
            f29608a = iArr;
        }
    }

    c(int i10, int i11) {
        this.classId = i10;
        this.badgeImage = i11;
    }

    public final df.b c() {
        int i10 = b.f29608a[ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            return df.b.HEXAGON;
        }
        return df.b.ROUND;
    }

    public final boolean e() {
        return this == C2;
    }

    public final int h() {
        return this.badgeImage;
    }

    public final int i() {
        return this.classId;
    }

    public final boolean l() {
        switch (b.f29608a[ordinal()]) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }

    public final c m() {
        c[] values;
        for (c cVar : values()) {
            if (cVar.classId == this.classId - 1) {
                return cVar;
            }
        }
        return null;
    }

    public final int n() {
        switch (b.f29608a[ordinal()]) {
            case 1:
                return y0.result_exp_progress_e;
            case 2:
            case 3:
                return y0.result_exp_progress_d;
            case 4:
                return y0.result_exp_progress_s;
            case 5:
            case 6:
                return y0.result_exp_progress_a;
            case 7:
            case 8:
            case 9:
            case 10:
                return y0.result_exp_progress_b;
            case 11:
            case 12:
                return y0.result_exp_progress_c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final d o() {
        int i10 = b.f29608a[ordinal()];
        if (i10 != 1 && i10 != 2) {
            return d.HEXAGON;
        }
        return d.ROUND;
    }

    public final int p() {
        switch (b.f29608a[ordinal()]) {
            case 1:
                return w0.text_color_season_rating_e_result;
            case 2:
            case 3:
                return w0.text_color_season_rating_d_result;
            case 4:
                return w0.text_color_season_rating_s_result;
            case 5:
            case 6:
                return w0.text_color_season_rating_a_result;
            case 7:
            case 8:
            case 9:
            case 10:
                return w0.text_color_season_rating_b_result;
            case 11:
            case 12:
                return w0.text_color_season_rating_c_result;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Integer q() {
        switch (b.f29608a[ordinal()]) {
            case 2:
            case 5:
            case 7:
            case 9:
            case 11:
                return Integer.valueOf(f1.text_classup_prize_description_gift);
            case 3:
                return Integer.valueOf(f1.text_classup_prize_description_grooupshot);
            case 4:
            default:
                return null;
            case 6:
                return Integer.valueOf(f1.text_classup_prize_description_holiday);
            case 8:
                return Integer.valueOf(f1.text_classup_prize_description_favorite);
            case 10:
                return Integer.valueOf(f1.text_classup_prize_description_closet);
            case 12:
                return Integer.valueOf(f1.text_classup_prize_description_pause);
        }
    }

    public final int r() {
        switch (b.f29608a[ordinal()]) {
            case 1:
                return w0.text_color_season_rating_e;
            case 2:
            case 3:
                return w0.text_color_season_rating_d;
            case 4:
                return w0.text_color_season_rating_s;
            case 5:
            case 6:
                return w0.text_color_season_rating_a;
            case 7:
            case 8:
            case 9:
            case 10:
                return w0.text_color_season_rating_b;
            case 11:
            case 12:
                return w0.text_color_season_rating_c;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
