package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class MissionCategorySpecial {
    public static final int $stable = 8;
    private final int categoryId;
    @b(BooleanTypeAdapter.class)
    private final boolean isActivation;
    private final List<MissionSpecial> missions;

    public MissionCategorySpecial(int i10, boolean z10, List<MissionSpecial> list) {
        p.h(list, "missions");
        this.categoryId = i10;
        this.isActivation = z10;
        this.missions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionCategorySpecial copy$default(MissionCategorySpecial missionCategorySpecial, int i10, boolean z10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = missionCategorySpecial.categoryId;
        }
        if ((i11 & 2) != 0) {
            z10 = missionCategorySpecial.isActivation;
        }
        if ((i11 & 4) != 0) {
            list = missionCategorySpecial.missions;
        }
        return missionCategorySpecial.copy(i10, z10, list);
    }

    public final int component1() {
        return this.categoryId;
    }

    public final boolean component2() {
        return this.isActivation;
    }

    public final List<MissionSpecial> component3() {
        return this.missions;
    }

    public final MissionCategorySpecial copy(int i10, boolean z10, List<MissionSpecial> list) {
        p.h(list, "missions");
        return new MissionCategorySpecial(i10, z10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionCategorySpecial) {
            MissionCategorySpecial missionCategorySpecial = (MissionCategorySpecial) obj;
            return this.categoryId == missionCategorySpecial.categoryId && this.isActivation == missionCategorySpecial.isActivation && p.c(this.missions, missionCategorySpecial.missions);
        }
        return false;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final List<MissionSpecial> getMissions() {
        return this.missions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.categoryId) * 31;
        boolean z10 = this.isActivation;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.missions.hashCode();
    }

    public final boolean isActivation() {
        return this.isActivation;
    }

    public String toString() {
        return "MissionCategorySpecial(categoryId=" + this.categoryId + ", isActivation=" + this.isActivation + ", missions=" + this.missions + ')';
    }
}
