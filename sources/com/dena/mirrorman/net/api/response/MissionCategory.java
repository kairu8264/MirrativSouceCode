package com.dena.mirrorman.net.api.response;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class MissionCategory {
    public static final int $stable = 8;
    private final String categoryDescriptionFirst;
    private final List<MissionCategoryDescription> categoryDescriptionSecond;
    private final int categoryId;
    private final boolean isActivation;
    private List<Mission> missions;

    public MissionCategory(int i10, boolean z10, String str, List<MissionCategoryDescription> list, List<Mission> list2) {
        p.h(str, "categoryDescriptionFirst");
        p.h(list, "categoryDescriptionSecond");
        p.h(list2, "missions");
        this.categoryId = i10;
        this.isActivation = z10;
        this.categoryDescriptionFirst = str;
        this.categoryDescriptionSecond = list;
        this.missions = list2;
    }

    public static /* synthetic */ MissionCategory copy$default(MissionCategory missionCategory, int i10, boolean z10, String str, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = missionCategory.categoryId;
        }
        if ((i11 & 2) != 0) {
            z10 = missionCategory.isActivation;
        }
        boolean z11 = z10;
        if ((i11 & 4) != 0) {
            str = missionCategory.categoryDescriptionFirst;
        }
        String str2 = str;
        List<MissionCategoryDescription> list3 = list;
        if ((i11 & 8) != 0) {
            list3 = missionCategory.categoryDescriptionSecond;
        }
        List list4 = list3;
        List<Mission> list5 = list2;
        if ((i11 & 16) != 0) {
            list5 = missionCategory.missions;
        }
        return missionCategory.copy(i10, z11, str2, list4, list5);
    }

    public final int component1() {
        return this.categoryId;
    }

    public final boolean component2() {
        return this.isActivation;
    }

    public final String component3() {
        return this.categoryDescriptionFirst;
    }

    public final List<MissionCategoryDescription> component4() {
        return this.categoryDescriptionSecond;
    }

    public final List<Mission> component5() {
        return this.missions;
    }

    public final MissionCategory copy(int i10, boolean z10, String str, List<MissionCategoryDescription> list, List<Mission> list2) {
        p.h(str, "categoryDescriptionFirst");
        p.h(list, "categoryDescriptionSecond");
        p.h(list2, "missions");
        return new MissionCategory(i10, z10, str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionCategory) {
            MissionCategory missionCategory = (MissionCategory) obj;
            return this.categoryId == missionCategory.categoryId && this.isActivation == missionCategory.isActivation && p.c(this.categoryDescriptionFirst, missionCategory.categoryDescriptionFirst) && p.c(this.categoryDescriptionSecond, missionCategory.categoryDescriptionSecond) && p.c(this.missions, missionCategory.missions);
        }
        return false;
    }

    public final String getCategoryDescriptionFirst() {
        return this.categoryDescriptionFirst;
    }

    public final List<MissionCategoryDescription> getCategoryDescriptionSecond() {
        return this.categoryDescriptionSecond;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final List<Mission> getMissions() {
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
        return ((((((hashCode + i10) * 31) + this.categoryDescriptionFirst.hashCode()) * 31) + this.categoryDescriptionSecond.hashCode()) * 31) + this.missions.hashCode();
    }

    public final boolean isActivation() {
        return this.isActivation;
    }

    public final void setMissions(List<Mission> list) {
        p.h(list, "<set-?>");
        this.missions = list;
    }

    public String toString() {
        return "MissionCategory(categoryId=" + this.categoryId + ", isActivation=" + this.isActivation + ", categoryDescriptionFirst=" + this.categoryDescriptionFirst + ", categoryDescriptionSecond=" + this.categoryDescriptionSecond + ", missions=" + this.missions + ')';
    }
}
