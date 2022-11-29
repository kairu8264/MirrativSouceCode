package we;

import c1.c0;
import java.util.List;
import jo.h;
import kotlin.NoWhenBranchMatchedException;
import nd.f1;
import nd.w0;
import nd.y0;
import xn.s;

/* loaded from: classes2.dex */
public enum g {
    NONE(0),
    CHEER_ROOKIE1(1),
    CHEER_ROOKIE2(2),
    CHEER_LEADER1(3),
    CHEER_LEADER2(4),
    CHEER_LEADER3(5),
    CHEER_LEADER4(6),
    CHEER_LEADER_GOLD(7),
    CHEER_LEADER_PLATINUM(8),
    CHEER_LEADER_DIAMOND(9),
    CHEER_LEGEND(10);
    
    public static final a Companion = new a(null);
    private final int rank;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final g a(int i10) {
            g gVar;
            g[] values = g.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    gVar = null;
                    break;
                }
                gVar = values[i11];
                if (i10 == gVar.h()) {
                    break;
                }
                i11++;
            }
            return gVar == null ? g.NONE : gVar;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f58678a;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.NONE.ordinal()] = 1;
            iArr[g.CHEER_ROOKIE1.ordinal()] = 2;
            iArr[g.CHEER_ROOKIE2.ordinal()] = 3;
            iArr[g.CHEER_LEADER1.ordinal()] = 4;
            iArr[g.CHEER_LEADER2.ordinal()] = 5;
            iArr[g.CHEER_LEADER3.ordinal()] = 6;
            iArr[g.CHEER_LEADER4.ordinal()] = 7;
            iArr[g.CHEER_LEADER_GOLD.ordinal()] = 8;
            iArr[g.CHEER_LEADER_PLATINUM.ordinal()] = 9;
            iArr[g.CHEER_LEADER_DIAMOND.ordinal()] = 10;
            iArr[g.CHEER_LEGEND.ordinal()] = 11;
            f58678a = iArr;
        }
    }

    g(int i10) {
        this.rank = i10;
    }

    public final Integer c() {
        switch (b.f58678a[ordinal()]) {
            case 1:
                return null;
            case 2:
                return Integer.valueOf(y0.comment_background_rookie1);
            case 3:
                return Integer.valueOf(y0.comment_background_rookie2);
            case 4:
                return Integer.valueOf(y0.comment_background_reader1);
            case 5:
                return Integer.valueOf(y0.comment_background_reader2);
            case 6:
                return Integer.valueOf(y0.comment_background_reader3);
            case 7:
                return Integer.valueOf(y0.comment_background_reader4);
            case 8:
                return Integer.valueOf(y0.comment_background_gold);
            case 9:
                return Integer.valueOf(y0.comment_background_platinum);
            case 10:
                return Integer.valueOf(y0.comment_background_diamond);
            case 11:
                return Integer.valueOf(y0.comment_background_legend);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final List<c0> e() {
        switch (b.f58678a[ordinal()]) {
            case 1:
                return s.k();
            case 2:
                o9.b bVar = o9.b.f44283a;
                return s.m(c0.g(bVar.a().m()), c0.g(bVar.a().m()));
            case 3:
                o9.b bVar2 = o9.b.f44283a;
                return s.m(c0.g(bVar2.a().n()), c0.g(bVar2.a().n()));
            case 4:
                o9.b bVar3 = o9.b.f44283a;
                return s.m(c0.g(bVar3.a().g()), c0.g(bVar3.a().g()));
            case 5:
                o9.b bVar4 = o9.b.f44283a;
                return s.m(c0.g(bVar4.a().h()), c0.g(bVar4.a().h()));
            case 6:
                o9.b bVar5 = o9.b.f44283a;
                return s.m(c0.g(bVar5.a().i()), c0.g(bVar5.a().i()));
            case 7:
                o9.b bVar6 = o9.b.f44283a;
                return s.m(c0.g(bVar6.a().j()), c0.g(bVar6.a().j()));
            case 8:
                return o9.b.f44283a.a().f();
            case 9:
                return o9.b.f44283a.a().l();
            case 10:
                return o9.b.f44283a.a().e();
            case 11:
                return o9.b.f44283a.a().k();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int h() {
        return this.rank;
    }

    public final int i() {
        switch (b.f58678a[ordinal()]) {
            case 1:
                return f1.text_cheer_rank_none_description;
            case 2:
                return f1.text_cheer_rookie_1;
            case 3:
                return f1.text_cheer_rookie_2;
            case 4:
                return f1.text_cheer_leader_1;
            case 5:
                return f1.text_cheer_leader_2;
            case 6:
                return f1.text_cheer_leader_3;
            case 7:
                return f1.text_cheer_leader_4;
            case 8:
                return f1.text_cheer_leader_gold;
            case 9:
                return f1.text_cheer_leader_platinum;
            case 10:
                return f1.text_cheer_leader_diamond;
            case 11:
                return f1.text_cheer_legend;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Integer l() {
        switch (b.f58678a[ordinal()]) {
            case 1:
                return null;
            case 2:
                return Integer.valueOf(y0.bg_badge_yell_rank_rookie_1);
            case 3:
                return Integer.valueOf(y0.bg_badge_yell_rank_rookie_2);
            case 4:
                return Integer.valueOf(y0.bg_badge_yell_rank_leader_1);
            case 5:
                return Integer.valueOf(y0.bg_badge_yell_rank_leader_2);
            case 6:
                return Integer.valueOf(y0.bg_badge_yell_rank_leader_3);
            case 7:
                return Integer.valueOf(y0.bg_badge_yell_rank_leader_4);
            case 8:
                return Integer.valueOf(y0.bg_badge_yell_rank_leader_gold);
            case 9:
                return Integer.valueOf(y0.bg_badge_yell_rank_leader_platinum);
            case 10:
                return Integer.valueOf(y0.bg_badge_yell_rank_leader_diamond);
            case 11:
                return Integer.valueOf(y0.bg_badge_yell_rank_legend);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Integer m() {
        switch (b.f58678a[ordinal()]) {
            case 1:
                return null;
            case 2:
                return Integer.valueOf(y0.ic_badge_yell_rank_rookie_1);
            case 3:
                return Integer.valueOf(y0.ic_badge_yell_rank_rookie_2);
            case 4:
                return Integer.valueOf(y0.ic_badge_yell_rank_leader);
            case 5:
                return Integer.valueOf(y0.ic_badge_yell_rank_leader);
            case 6:
                return Integer.valueOf(y0.ic_badge_yell_rank_leader);
            case 7:
                return Integer.valueOf(y0.ic_badge_yell_rank_leader);
            case 8:
                return Integer.valueOf(y0.ic_badge_yell_rank_leader_diamond);
            case 9:
                return Integer.valueOf(y0.ic_badge_yell_rank_leader_diamond);
            case 10:
                return Integer.valueOf(y0.ic_badge_yell_rank_leader_diamond);
            case 11:
                return Integer.valueOf(y0.ic_badge_yell_rank_legend);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean n() {
        return this == NONE || this == CHEER_ROOKIE1 || this == CHEER_ROOKIE2;
    }

    public final int o() {
        switch (b.f58678a[ordinal()]) {
            case 1:
                return y0.icon_yell_status_cheer_none;
            case 2:
                return y0.icon_yell_status_cheer_rookie1;
            case 3:
                return y0.icon_yell_status_cheer_rookie2;
            case 4:
                return y0.icon_yell_status_cheer_leader1;
            case 5:
                return y0.icon_yell_status_cheer_leader2;
            case 6:
                return y0.icon_yell_status_cheer_leader3;
            case 7:
                return y0.icon_yell_status_cheer_leader4;
            case 8:
                return y0.icon_yell_status_cheer_gold;
            case 9:
                return y0.icon_yell_status_cheer_platinum;
            case 10:
                return y0.icon_yell_status_cheer_diamond;
            case 11:
                return y0.icon_yell_status_cheer_legend;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int p() {
        switch (b.f58678a[ordinal()]) {
            case 1:
                return w0.feature_color_cheer_none;
            case 2:
                return w0.feature_color_cheer_rookie_1;
            case 3:
                return w0.feature_color_cheer_rookie_2;
            case 4:
                return w0.feature_color_cheer_leader_2;
            case 5:
                return w0.feature_color_cheer_leader_2;
            case 6:
                return w0.feature_color_cheer_leader_3;
            case 7:
                return w0.feature_color_cheer_leader_4;
            case 8:
                return w0.feature_color_cheer_gold;
            case 9:
                return w0.feature_color_cheer_platinum;
            case 10:
                return w0.feature_color_cheer_diamond;
            case 11:
                return w0.feature_color_cheer_legend;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
