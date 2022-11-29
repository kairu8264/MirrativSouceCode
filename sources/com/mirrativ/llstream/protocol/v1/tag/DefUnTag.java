package com.mirrativ.llstream.protocol.v1.tag;

import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class DefUnTag implements Tag {
    public static final Companion Companion = new Companion(null);
    private static final DefUnTag shared = new DefUnTag(null, null, null, 7, null);
    private final TagCategory cat;
    private final TagRandomValue rnd;
    private final TagSystemValue sys;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final DefUnTag getShared() {
            return DefUnTag.shared;
        }
    }

    public DefUnTag() {
        this(null, null, null, 7, null);
    }

    public DefUnTag(TagCategory tagCategory, TagSystemValue tagSystemValue, TagRandomValue tagRandomValue) {
        p.h(tagCategory, "cat");
        p.h(tagSystemValue, "sys");
        p.h(tagRandomValue, "rnd");
        this.cat = tagCategory;
        this.sys = tagSystemValue;
        this.rnd = tagRandomValue;
    }

    @Override // com.mirrativ.llstream.protocol.v1.tag.Tag
    public TagCategory getCategory() {
        return this.cat;
    }

    @Override // com.mirrativ.llstream.protocol.v1.tag.Tag
    public TagRandomValue getRand() {
        return this.rnd;
    }

    @Override // com.mirrativ.llstream.protocol.v1.tag.Tag
    public TagSystemValue getSystem() {
        return this.sys;
    }

    public /* synthetic */ DefUnTag(TagCategory tagCategory, TagSystemValue tagSystemValue, TagRandomValue tagRandomValue, int i10, h hVar) {
        this((i10 & 1) != 0 ? TagCategory.TAG_CAT_UNTAG : tagCategory, (i10 & 2) != 0 ? TagSystemValue.TAG_SYS_UNTAG : tagSystemValue, (i10 & 4) != 0 ? TagRandomValue.TAG_RND_ZERO : tagRandomValue);
    }
}
