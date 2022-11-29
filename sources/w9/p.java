package w9;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestReward;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d  reason: collision with root package name */
    public static final a f58420d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f58421a;

    /* renamed from: b  reason: collision with root package name */
    public final int f58422b;

    /* renamed from: c  reason: collision with root package name */
    public final String f58423c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p a(int i10, EmomoQuestReward emomoQuestReward) {
            int i11;
            jo.p.h(emomoQuestReward, "reward");
            int rarity = emomoQuestReward.getRarity();
            if (rarity == 2) {
                i11 = q9.f.bg_emomo_quest_ranking_stage_reward_frame_star2;
            } else if (rarity == 3) {
                i11 = q9.f.bg_emomo_quest_ranking_stage_reward_frame_star3;
            } else if (rarity == 4) {
                i11 = q9.f.bg_emomo_quest_ranking_stage_reward_frame_star4;
            } else if (rarity != 5) {
                i11 = q9.f.bg_emomo_quest_ranking_stage_reward_frame_star0;
            } else {
                i11 = q9.f.bg_emomo_quest_ranking_stage_reward_frame_star5;
            }
            return new p(i10, i11, emomoQuestReward.getIconUrl());
        }
    }

    public p(int i10, int i11, String str) {
        jo.p.h(str, "iconUrl");
        this.f58421a = i10;
        this.f58422b = i11;
        this.f58423c = str;
    }

    public final int a() {
        return this.f58422b;
    }

    public final String b() {
        return this.f58423c;
    }

    public final int c() {
        return this.f58421a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f58421a == pVar.f58421a && this.f58422b == pVar.f58422b && jo.p.c(this.f58423c, pVar.f58423c);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f58421a) * 31) + Integer.hashCode(this.f58422b)) * 31) + this.f58423c.hashCode();
    }

    public String toString() {
        return "EmomoQuestRankingStageRewardBindModel(index=" + this.f58421a + ", backgroundDrawableRes=" + this.f58422b + ", iconUrl=" + this.f58423c + ')';
    }
}
