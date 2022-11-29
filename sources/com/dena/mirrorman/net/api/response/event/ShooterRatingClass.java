package com.dena.mirrorman.net.api.response.event;

import java.util.HashMap;
import jo.p;

/* loaded from: classes2.dex */
public final class ShooterRatingClass {
    public static final int $stable = 0;
    private final int classType;
    private final String endClassColor;
    private final int iconType;
    private final String name;
    private final String startClassColor;

    public ShooterRatingClass(int i10, int i11, String str, String str2, String str3) {
        p.h(str, "startClassColor");
        p.h(str2, "endClassColor");
        p.h(str3, "name");
        this.classType = i10;
        this.iconType = i11;
        this.startClassColor = str;
        this.endClassColor = str2;
        this.name = str3;
    }

    public static /* synthetic */ ShooterRatingClass copy$default(ShooterRatingClass shooterRatingClass, int i10, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = shooterRatingClass.classType;
        }
        if ((i12 & 2) != 0) {
            i11 = shooterRatingClass.iconType;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = shooterRatingClass.startClassColor;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            str2 = shooterRatingClass.endClassColor;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = shooterRatingClass.name;
        }
        return shooterRatingClass.copy(i10, i13, str4, str5, str3);
    }

    public final int component1() {
        return this.classType;
    }

    public final int component2() {
        return this.iconType;
    }

    public final String component3() {
        return this.startClassColor;
    }

    public final String component4() {
        return this.endClassColor;
    }

    public final String component5() {
        return this.name;
    }

    public final ShooterRatingClass copy(int i10, int i11, String str, String str2, String str3) {
        p.h(str, "startClassColor");
        p.h(str2, "endClassColor");
        p.h(str3, "name");
        return new ShooterRatingClass(i10, i11, str, str2, str3);
    }

    public final HashMap<String, Object> createRatingClassData() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("classType", Integer.valueOf(this.classType));
        hashMap.put("iconType", Integer.valueOf(this.iconType));
        hashMap.put("name", this.name);
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterRatingClass) {
            ShooterRatingClass shooterRatingClass = (ShooterRatingClass) obj;
            return this.classType == shooterRatingClass.classType && this.iconType == shooterRatingClass.iconType && p.c(this.startClassColor, shooterRatingClass.startClassColor) && p.c(this.endClassColor, shooterRatingClass.endClassColor) && p.c(this.name, shooterRatingClass.name);
        }
        return false;
    }

    public final int getClassType() {
        return this.classType;
    }

    public final String getEndClassColor() {
        return this.endClassColor;
    }

    public final int getIconType() {
        return this.iconType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStartClassColor() {
        return this.startClassColor;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.classType) * 31) + Integer.hashCode(this.iconType)) * 31) + this.startClassColor.hashCode()) * 31) + this.endClassColor.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "ShooterRatingClass(classType=" + this.classType + ", iconType=" + this.iconType + ", startClassColor=" + this.startClassColor + ", endClassColor=" + this.endClassColor + ", name=" + this.name + ')';
    }
}
