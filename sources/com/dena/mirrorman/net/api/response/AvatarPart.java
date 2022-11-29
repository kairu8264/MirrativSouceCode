package com.dena.mirrorman.net.api.response;

/* loaded from: classes2.dex */
public final class AvatarPart {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final int f26145id;
    private final int partType;
    private final int updatedAt;

    public AvatarPart(int i10, int i11, int i12) {
        this.partType = i10;
        this.f26145id = i11;
        this.updatedAt = i12;
    }

    public static /* synthetic */ AvatarPart copy$default(AvatarPart avatarPart, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = avatarPart.partType;
        }
        if ((i13 & 2) != 0) {
            i11 = avatarPart.f26145id;
        }
        if ((i13 & 4) != 0) {
            i12 = avatarPart.updatedAt;
        }
        return avatarPart.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.partType;
    }

    public final int component2() {
        return this.f26145id;
    }

    public final int component3() {
        return this.updatedAt;
    }

    public final AvatarPart copy(int i10, int i11, int i12) {
        return new AvatarPart(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvatarPart) {
            AvatarPart avatarPart = (AvatarPart) obj;
            return this.partType == avatarPart.partType && this.f26145id == avatarPart.f26145id && this.updatedAt == avatarPart.updatedAt;
        }
        return false;
    }

    public final int getId() {
        return this.f26145id;
    }

    public final int getPartType() {
        return this.partType;
    }

    public final int getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.partType) * 31) + Integer.hashCode(this.f26145id)) * 31) + Integer.hashCode(this.updatedAt);
    }

    public String toString() {
        return "AvatarPart(partType=" + this.partType + ", id=" + this.f26145id + ", updatedAt=" + this.updatedAt + ')';
    }
}
