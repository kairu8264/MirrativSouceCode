package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.p;
import xn.s;
import ym.c;

/* loaded from: classes2.dex */
public final class Group {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class Base {
        public static final int $stable = 8;
        @c("name_edited")
        private int nameEdited;
        @c(TtmlNode.ATTR_ID)

        /* renamed from: id  reason: collision with root package name */
        private String f26153id = "";
        @c("name")
        private String name = "";
        @c("image_urls")
        private List<String> imageUrls = s.k();

        public final String getId() {
            return this.f26153id;
        }

        public final List<String> getImageUrls() {
            return this.imageUrls;
        }

        public final String getName() {
            return this.name;
        }

        public final int getNameEdited() {
            return this.nameEdited;
        }

        public final void setId(String str) {
            p.h(str, "<set-?>");
            this.f26153id = str;
        }

        public final void setImageUrls(List<String> list) {
            p.h(list, "<set-?>");
            this.imageUrls = list;
        }

        public final void setName(String str) {
            p.h(str, "<set-?>");
            this.name = str;
        }

        public final void setNameEdited(int i10) {
            this.nameEdited = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Edit {
        public static final int $stable = 8;
        private Status status = Status.Companion.createEmptyStatus();
        private Base group = new Base();

        public final Base getGroup() {
            return this.group;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setGroup(Base base) {
            p.h(base, "<set-?>");
            this.group = base;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class InviteUsers {
        public static final int $stable = 8;
        private Status status = Status.Companion.createEmptyStatus();
        private Base group = new Base();

        public final Base getGroup() {
            return this.group;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setGroup(Base base) {
            p.h(base, "<set-?>");
            this.group = base;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }
}
