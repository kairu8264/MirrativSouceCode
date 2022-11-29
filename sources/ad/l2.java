package ad;

/* loaded from: classes2.dex */
public enum l2 {
    DIAMOND(nc.i.text_grade_diamond_rank, Integer.valueOf(nc.d.diamond_rank_image), nc.d.ic_left_decoration_diamond, nc.d.ic_right_decoration_diamond, nc.d.rank_number_diamond_0, nc.d.rank_number_diamond_1, nc.d.rank_number_diamond_2, nc.d.rank_number_diamond_3, nc.d.rank_number_diamond_4, nc.d.rank_number_diamond_5, nc.d.rank_number_diamond_6, nc.d.rank_number_diamond_7, nc.d.rank_number_diamond_8, nc.d.rank_number_diamond_9, nc.b.color_diamond_rank, 1),
    PLATINUM(nc.i.text_grade_platinum_rank, Integer.valueOf(nc.d.platinum_rank_image), nc.d.ic_left_decoration_platinum, nc.d.ic_right_decoration_platinum, nc.d.rank_number_platinum_0, nc.d.rank_number_platinum_1, nc.d.rank_number_platinum_2, nc.d.rank_number_platinum_3, nc.d.rank_number_platinum_4, nc.d.rank_number_platinum_5, nc.d.rank_number_platinum_6, nc.d.rank_number_platinum_7, nc.d.rank_number_platinum_8, nc.d.rank_number_platinum_9, nc.b.color_platinum_rank, 2),
    EMERALD(nc.i.text_grade_emerald_rank, Integer.valueOf(nc.d.emerald_rank_image), nc.d.ic_left_decoration_emerald, nc.d.ic_right_decoration_emerald, nc.d.rank_number_emerald_0, nc.d.rank_number_emerald_1, nc.d.rank_number_emerald_2, nc.d.rank_number_emerald_3, nc.d.rank_number_emerald_4, nc.d.rank_number_emerald_5, nc.d.rank_number_emerald_6, nc.d.rank_number_emerald_7, nc.d.rank_number_emerald_8, nc.d.rank_number_emerald_9, nc.b.color_emerald_rank, 3),
    GOLD(nc.i.text_grade_gold_rank, Integer.valueOf(nc.d.rank_image_gold), nc.d.ic_left_decoration_gold, nc.d.ic_right_decoration_gold, nc.d.rank_number_gold_0, nc.d.rank_number_gold_1, nc.d.rank_number_gold_2, nc.d.rank_number_gold_3, nc.d.rank_number_gold_4, nc.d.rank_number_gold_5, nc.d.rank_number_gold_6, nc.d.rank_number_gold_7, nc.d.rank_number_gold_8, nc.d.rank_number_gold_9, nc.b.color_gold_rank, 4),
    SILVER(nc.i.text_grade_silver_rank, Integer.valueOf(nc.d.silver_rank_image), nc.d.ic_left_decoration_silver, nc.d.ic_right_decoration_silver, nc.d.rank_number_silver_0, nc.d.rank_number_silver_1, nc.d.rank_number_silver_2, nc.d.rank_number_silver_3, nc.d.rank_number_silver_4, nc.d.rank_number_silver_5, nc.d.rank_number_silver_6, nc.d.rank_number_silver_7, nc.d.rank_number_silver_8, nc.d.rank_number_silver_9, nc.b.color_silver_rank, 5),
    NOT_RANK(nc.i.Y2, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, nc.b.color_not_rank, 0);
    
    public static final a Companion = new a(null);
    private final int color;
    private final int grade;
    private final Integer image;
    private final int leftDecorationDrawableRes;
    private final int rankNumber0DrawableRes;
    private final int rankNumber1DrawableRes;
    private final int rankNumber2DrawableRes;
    private final int rankNumber3DrawableRes;
    private final int rankNumber4DrawableRes;
    private final int rankNumber5DrawableRes;
    private final int rankNumber6DrawableRes;
    private final int rankNumber7DrawableRes;
    private final int rankNumber8DrawableRes;
    private final int rankNumber9DrawableRes;
    private final int rightDecorationDrawableRes;
    private final int text;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l2 a(int i10) {
            l2 l2Var;
            l2[] values = l2.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    l2Var = null;
                    break;
                }
                l2Var = values[i11];
                if (l2Var.e() == i10) {
                    break;
                }
                i11++;
            }
            return l2Var == null ? l2.NOT_RANK : l2Var;
        }
    }

    l2(int i10, Integer num, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.text = i10;
        this.image = num;
        this.leftDecorationDrawableRes = i11;
        this.rightDecorationDrawableRes = i12;
        this.rankNumber0DrawableRes = i13;
        this.rankNumber1DrawableRes = i14;
        this.rankNumber2DrawableRes = i15;
        this.rankNumber3DrawableRes = i16;
        this.rankNumber4DrawableRes = i17;
        this.rankNumber5DrawableRes = i18;
        this.rankNumber6DrawableRes = i19;
        this.rankNumber7DrawableRes = i20;
        this.rankNumber8DrawableRes = i21;
        this.rankNumber9DrawableRes = i22;
        this.color = i23;
        this.grade = i24;
    }

    public final int c() {
        return this.color;
    }

    public final int e() {
        return this.grade;
    }

    public final Integer h() {
        return this.image;
    }

    public final int i() {
        return this.leftDecorationDrawableRes;
    }

    public final int l() {
        return this.rankNumber0DrawableRes;
    }

    public final int m() {
        return this.rankNumber1DrawableRes;
    }

    public final int n() {
        return this.rankNumber2DrawableRes;
    }

    public final int o() {
        return this.rankNumber3DrawableRes;
    }

    public final int p() {
        return this.rankNumber4DrawableRes;
    }

    public final int q() {
        return this.rankNumber5DrawableRes;
    }

    public final int r() {
        return this.rankNumber6DrawableRes;
    }

    public final int s() {
        return this.rankNumber7DrawableRes;
    }

    public final int t() {
        return this.rankNumber8DrawableRes;
    }

    public final int u() {
        return this.rankNumber9DrawableRes;
    }

    public final int v() {
        return this.rightDecorationDrawableRes;
    }

    public final int w() {
        return this.text;
    }
}
